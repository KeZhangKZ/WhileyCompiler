package wyil.truffleWhiley;

import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.PolyglotException;
import org.graalvm.polyglot.Source;
import org.graalvm.polyglot.Value;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class TruffleWhiley {

    private static final String WYIL = "whiley";

    private static int executeSource(Source source, InputStream in, PrintStream out, Map<String, String> options) {
        Context context;
        PrintStream err = System.err;
        try {
            Context.Builder b = Context.newBuilder(WYIL);
            context = b.in(in).out(out).options(options).build();
            System.out.println(context.getEngine().getLanguages());
        } catch (IllegalArgumentException e) {
            err.println(e.getMessage());
            return 1;
        }

        try {
            Value result = context.eval(source);
            return 0;
        } catch (PolyglotException ex) {
            if (ex.isInternalError()) {
                // for internal errors we print the full stack trace
                ex.printStackTrace();
            } else {
                err.println(ex.getMessage());
            }
            return 1;
        } finally {
            context.close();
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.println("start from main");
        Source.Builder b = Source.newBuilder(WYIL, new File(args[0]));
        Source source = b.build();
        System.exit(executeSource(source, System.in, System.out, new HashMap<>()));
    }
}
