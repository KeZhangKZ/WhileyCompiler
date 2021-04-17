package wyil.truffleWhiley;


import com.oracle.truffle.api.CallTarget;
import com.oracle.truffle.api.Truffle;
import com.oracle.truffle.api.TruffleLanguage;
import wyc.util.TestUtils;
import wyfs.util.Pair;
import wyfs.util.Trie;
import wyil.lang.TruffleWhileyRootNode;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

@TruffleLanguage.Registration(id = "whiley", name = "TruffleWhiley",
        defaultMimeType = TruffleWhileyLanguage.MIME_TYPE, characterMimeTypes = TruffleWhileyLanguage.MIME_TYPE,
        contextPolicy = TruffleLanguage.ContextPolicy.SHARED, fileTypeDetectors = WhileyFileDetector.class)
public final class TruffleWhileyLanguage extends TruffleLanguage<TruffleWhileyContext> {
    public static final String MIME_TYPE = "application/x-whiley";

    public TruffleWhileyLanguage() {
        System.out.println("Hello whiley!!");
    }

    @Override
    protected CallTarget parse(ParsingRequest request) throws Exception {
        final String suffix = ".whiley";
        // parsing
        String arg = request.getSource().getPath();
        String filename = request.getSource().getName();
        File file = new File(arg);

        String pureFileName = filename.substring(0, filename.length() - suffix.length());
        File whileySrcDir = new File(file.getParent());

        // create wyil file
        parseTesk(whileySrcDir, pureFileName);
        System.out.println("parse!");

        // 
        TruffleWhileyRootNode rootNode = new TruffleWhileyRootNode(this, whileySrcDir, Trie.fromString(pureFileName));
//        TruffleWhileyRootNode rootNode = new TruffleWhileyRootNode(this);
        return Truffle.getRuntime().createCallTarget(rootNode);
    }

    private void parseTesk(File whileySrcDir, String pureFileName) throws IOException {
//        File file = new File("tests/truffleTest/AAA.whiley");
////        String filename = file.getName();
//        final String suffix = ".whiley";
//        pureFileName = filename.substring(0, filename.length() - suffix.length());
//
//        String srcDir = file.getParent();
//
//        whileySrcDir = new File(srcDir);
        Pair<Boolean,String> p = TestUtils.compile(
                whileySrcDir,      // location of source directory
                false,             // no verification
                false,             // no counterexample generation
                pureFileName);     // name of test to compile

        boolean r = p.first();

        System.out.print(p.second());
        if (!r) {
            System.err.println("Test failed to compile!");
        }
    }

    @Override
    protected TruffleWhileyContext createContext(Env env) {
        return new TruffleWhileyContext(this, env);
    }

    public static TruffleWhileyContext getCurrentContext() {
        return getCurrentContext(TruffleWhileyLanguage.class);
    }

}
