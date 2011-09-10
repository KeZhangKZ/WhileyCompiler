// This file was automatically generated.
package wyil.testing;
import org.junit.*;
import static org.junit.Assert.*;
import wyil.lang.Type;

public class SubtypeTests {
	@Test public void test_1() {
		checkIsSubtype("any","any");
	}
	@Test public void test_2() {
		checkIsSubtype("any","null");
	}
	@Test public void test_3() {
		checkIsSubtype("any","int");
	}
	@Test public void test_4() {
		checkIsSubtype("any","X<[X]>");
	}
	@Test public void test_5() {
		checkIsSubtype("any","[void]");
	}
	@Test public void test_6() {
		checkIsSubtype("any","[any]");
	}
	@Test public void test_7() {
		checkIsSubtype("any","[null]");
	}
	@Test public void test_8() {
		checkIsSubtype("any","[int]");
	}
	@Test public void test_9() {
		checkIsSubtype("any","[X<[X]>]");
	}
	@Test public void test_10() {
		checkIsSubtype("any","X<X|void>");
	}
	@Test public void test_11() {
		checkIsSubtype("any","X<X|any>");
	}
	@Test public void test_12() {
		checkIsSubtype("any","X<X|null>");
	}
	@Test public void test_13() {
		checkIsSubtype("any","X<X|int>");
	}
	@Test public void test_14() {
		checkIsSubtype("any","X<X|Y<[Y]>>");
	}
	@Test public void test_15() {
		checkIsSubtype("any","[[void]]");
	}
	@Test public void test_16() {
		checkIsSubtype("any","[[any]]");
	}
	@Test public void test_17() {
		checkIsSubtype("any","[[null]]");
	}
	@Test public void test_18() {
		checkIsSubtype("any","[[int]]");
	}
	@Test public void test_19() {
		checkIsSubtype("any","[[X<[X]>]]");
	}
	@Test public void test_20() {
		checkIsSubtype("any","X<[[[X]]]>");
	}
	@Test public void test_21() {
		checkIsSubtype("any","X<[[Y<X|Y>]]>");
	}
	@Test public void test_22() {
		checkIsSubtype("any","[X<X|void>]");
	}
	@Test public void test_23() {
		checkIsSubtype("any","[X<X|any>]");
	}
	@Test public void test_24() {
		checkIsSubtype("any","[X<X|null>]");
	}
	@Test public void test_25() {
		checkIsSubtype("any","[X<X|int>]");
	}
	@Test public void test_26() {
		checkIsSubtype("any","[X<X|Y<[Y]>>]");
	}
	@Test public void test_27() {
		checkIsSubtype("any","X<[Y<Y|[X]>]>");
	}
	@Test public void test_28() {
		checkIsSubtype("any","X<[Y<Y|(Z<X|Z>)>]>");
	}
	@Test public void test_29() {
		checkIsSubtype("any","void|void");
	}
	@Test public void test_30() {
		checkIsSubtype("any","void|any");
	}
	@Test public void test_31() {
		checkIsSubtype("any","void|null");
	}
	@Test public void test_32() {
		checkIsSubtype("any","void|int");
	}
	@Test public void test_33() {
		checkIsSubtype("any","void|X<[X]>");
	}
	@Test public void test_34() {
		checkIsSubtype("any","void|[void]");
	}
	@Test public void test_35() {
		checkIsSubtype("any","void|(X<void|X>)");
	}
	@Test public void test_36() {
		checkIsSubtype("any","any|void");
	}
	@Test public void test_37() {
		checkIsSubtype("any","any|any");
	}
	@Test public void test_38() {
		checkIsSubtype("any","any|null");
	}
	@Test public void test_39() {
		checkIsSubtype("any","any|int");
	}
	@Test public void test_40() {
		checkIsSubtype("any","any|X<[X]>");
	}
	@Test public void test_41() {
		checkIsSubtype("any","any|[any]");
	}
	@Test public void test_42() {
		checkIsSubtype("any","any|(X<any|X>)");
	}
	@Test public void test_43() {
		checkIsSubtype("any","null|void");
	}
	@Test public void test_44() {
		checkIsSubtype("any","null|any");
	}
	@Test public void test_45() {
		checkIsSubtype("any","null|null");
	}
	@Test public void test_46() {
		checkIsSubtype("any","null|int");
	}
	@Test public void test_47() {
		checkIsSubtype("any","null|X<[X]>");
	}
	@Test public void test_48() {
		checkIsSubtype("any","null|[null]");
	}
	@Test public void test_49() {
		checkIsSubtype("any","null|(X<null|X>)");
	}
	@Test public void test_50() {
		checkIsSubtype("any","int|void");
	}
	@Test public void test_51() {
		checkIsSubtype("any","int|any");
	}
	@Test public void test_52() {
		checkIsSubtype("any","int|null");
	}
	@Test public void test_53() {
		checkIsSubtype("any","int|int");
	}
	@Test public void test_54() {
		checkIsSubtype("any","int|X<[X]>");
	}
	@Test public void test_55() {
		checkIsSubtype("any","int|[int]");
	}
	@Test public void test_56() {
		checkIsSubtype("any","int|(X<int|X>)");
	}
	@Test public void test_57() {
		checkIsSubtype("any","[void]|void");
	}
	@Test public void test_58() {
		checkIsSubtype("any","X<[X]>|void");
	}
	@Test public void test_59() {
		checkIsSubtype("any","X<X|[void]>");
	}
	@Test public void test_60() {
		checkIsSubtype("any","[any]|any");
	}
	@Test public void test_61() {
		checkIsSubtype("any","X<[X]>|any");
	}
	@Test public void test_62() {
		checkIsSubtype("any","X<X|[any]>");
	}
	@Test public void test_63() {
		checkIsSubtype("any","[null]|null");
	}
	@Test public void test_64() {
		checkIsSubtype("any","X<[X]>|null");
	}
	@Test public void test_65() {
		checkIsSubtype("any","X<X|[null]>");
	}
	@Test public void test_66() {
		checkIsSubtype("any","[int]|int");
	}
	@Test public void test_67() {
		checkIsSubtype("any","X<[X]>|int");
	}
	@Test public void test_68() {
		checkIsSubtype("any","X<X|[int]>");
	}
	@Test public void test_69() {
		checkIsSubtype("any","[X<[X]>]|X<[X]>");
	}
	@Test public void test_70() {
		checkIsSubtype("any","X<[X]>|Y<[Y]>");
	}
	@Test public void test_71() {
		checkIsSubtype("any","X<[X]>|[X<[X]>]");
	}
	@Test public void test_72() {
		checkIsSubtype("any","X<X|[Y<[Y]>]>");
	}
	@Test public void test_73() {
		checkIsSubtype("any","X<X|[[X]]>");
	}
	@Test public void test_74() {
		checkIsSubtype("any","X<[X]>|(Y<X<[X]>|Y>)");
	}
	@Test public void test_75() {
		checkIsSubtype("any","X<X|[Y<X|Y>]>");
	}
	@Test public void test_76() {
		checkIsSubtype("any","(X<X|void>)|void");
	}
	@Test public void test_77() {
		checkIsSubtype("any","X<X|(Y<Y|void>)>");
	}
	@Test public void test_78() {
		checkIsSubtype("any","(X<X|any>)|any");
	}
	@Test public void test_79() {
		checkIsSubtype("any","X<X|(Y<Y|any>)>");
	}
	@Test public void test_80() {
		checkIsSubtype("any","(X<X|null>)|null");
	}
	@Test public void test_81() {
		checkIsSubtype("any","X<X|(Y<Y|null>)>");
	}
	@Test public void test_82() {
		checkIsSubtype("any","(X<X|int>)|int");
	}
	@Test public void test_83() {
		checkIsSubtype("any","X<X|(Y<Y|int>)>");
	}
	@Test public void test_84() {
		checkIsSubtype("any","(X<X|Y<[Y]>>)|Y<[Y]>");
	}
	@Test public void test_85() {
		checkIsSubtype("any","X<X|(Y<Y|Z<[Z]>>)>");
	}
	@Test public void test_86() {
		checkIsSubtype("any","X<X|(Y<Y|[X]>)>");
	}
	@Test public void test_87() {
		checkIsSubtype("any","X<X|(Y<Y|(Z<X|Z>)>)>");
	}
	@Test public void test_88() {
		checkNotSubtype("null","any");
	}
	@Test public void test_89() {
		checkIsSubtype("null","null");
	}
	@Test public void test_90() {
		checkNotSubtype("null","int");
	}
	@Test public void test_91() {
		checkNotSubtype("null","X<[X]>");
	}
	@Test public void test_92() {
		checkNotSubtype("null","[void]");
	}
	@Test public void test_93() {
		checkNotSubtype("null","[any]");
	}
	@Test public void test_94() {
		checkNotSubtype("null","[null]");
	}
	@Test public void test_95() {
		checkNotSubtype("null","[int]");
	}
	@Test public void test_96() {
		checkNotSubtype("null","[X<[X]>]");
	}
	@Test public void test_97() {
		checkIsSubtype("null","X<X|void>");
	}
	@Test public void test_98() {
		checkNotSubtype("null","X<X|any>");
	}
	@Test public void test_99() {
		checkIsSubtype("null","X<X|null>");
	}
	@Test public void test_100() {
		checkNotSubtype("null","X<X|int>");
	}
	@Test public void test_101() {
		checkNotSubtype("null","X<X|Y<[Y]>>");
	}
	@Test public void test_102() {
		checkNotSubtype("null","[[void]]");
	}
	@Test public void test_103() {
		checkNotSubtype("null","[[any]]");
	}
	@Test public void test_104() {
		checkNotSubtype("null","[[null]]");
	}
	@Test public void test_105() {
		checkNotSubtype("null","[[int]]");
	}
	@Test public void test_106() {
		checkNotSubtype("null","[[X<[X]>]]");
	}
	@Test public void test_107() {
		checkNotSubtype("null","X<[[[X]]]>");
	}
	@Test public void test_108() {
		checkNotSubtype("null","X<[[Y<X|Y>]]>");
	}
	@Test public void test_109() {
		checkNotSubtype("null","[X<X|void>]");
	}
	@Test public void test_110() {
		checkNotSubtype("null","[X<X|any>]");
	}
	@Test public void test_111() {
		checkNotSubtype("null","[X<X|null>]");
	}
	@Test public void test_112() {
		checkNotSubtype("null","[X<X|int>]");
	}
	@Test public void test_113() {
		checkNotSubtype("null","[X<X|Y<[Y]>>]");
	}
	@Test public void test_114() {
		checkNotSubtype("null","X<[Y<Y|[X]>]>");
	}
	@Test public void test_115() {
		checkNotSubtype("null","X<[Y<Y|(Z<X|Z>)>]>");
	}
	@Test public void test_116() {
		checkIsSubtype("null","void|void");
	}
	@Test public void test_117() {
		checkNotSubtype("null","void|any");
	}
	@Test public void test_118() {
		checkIsSubtype("null","void|null");
	}
	@Test public void test_119() {
		checkNotSubtype("null","void|int");
	}
	@Test public void test_120() {
		checkNotSubtype("null","void|X<[X]>");
	}
	@Test public void test_121() {
		checkNotSubtype("null","void|[void]");
	}
	@Test public void test_122() {
		checkIsSubtype("null","void|(X<void|X>)");
	}
	@Test public void test_123() {
		checkNotSubtype("null","any|void");
	}
	@Test public void test_124() {
		checkNotSubtype("null","any|any");
	}
	@Test public void test_125() {
		checkNotSubtype("null","any|null");
	}
	@Test public void test_126() {
		checkNotSubtype("null","any|int");
	}
	@Test public void test_127() {
		checkNotSubtype("null","any|X<[X]>");
	}
	@Test public void test_128() {
		checkNotSubtype("null","any|[any]");
	}
	@Test public void test_129() {
		checkNotSubtype("null","any|(X<any|X>)");
	}
	@Test public void test_130() {
		checkIsSubtype("null","null|void");
	}
	@Test public void test_131() {
		checkNotSubtype("null","null|any");
	}
	@Test public void test_132() {
		checkIsSubtype("null","null|null");
	}
	@Test public void test_133() {
		checkNotSubtype("null","null|int");
	}
	@Test public void test_134() {
		checkNotSubtype("null","null|X<[X]>");
	}
	@Test public void test_135() {
		checkNotSubtype("null","null|[null]");
	}
	@Test public void test_136() {
		checkIsSubtype("null","null|(X<null|X>)");
	}
	@Test public void test_137() {
		checkNotSubtype("null","int|void");
	}
	@Test public void test_138() {
		checkNotSubtype("null","int|any");
	}
	@Test public void test_139() {
		checkNotSubtype("null","int|null");
	}
	@Test public void test_140() {
		checkNotSubtype("null","int|int");
	}
	@Test public void test_141() {
		checkNotSubtype("null","int|X<[X]>");
	}
	@Test public void test_142() {
		checkNotSubtype("null","int|[int]");
	}
	@Test public void test_143() {
		checkNotSubtype("null","int|(X<int|X>)");
	}
	@Test public void test_144() {
		checkNotSubtype("null","[void]|void");
	}
	@Test public void test_145() {
		checkNotSubtype("null","X<[X]>|void");
	}
	@Test public void test_146() {
		checkNotSubtype("null","X<X|[void]>");
	}
	@Test public void test_147() {
		checkNotSubtype("null","[any]|any");
	}
	@Test public void test_148() {
		checkNotSubtype("null","X<[X]>|any");
	}
	@Test public void test_149() {
		checkNotSubtype("null","X<X|[any]>");
	}
	@Test public void test_150() {
		checkNotSubtype("null","[null]|null");
	}
	@Test public void test_151() {
		checkNotSubtype("null","X<[X]>|null");
	}
	@Test public void test_152() {
		checkNotSubtype("null","X<X|[null]>");
	}
	@Test public void test_153() {
		checkNotSubtype("null","[int]|int");
	}
	@Test public void test_154() {
		checkNotSubtype("null","X<[X]>|int");
	}
	@Test public void test_155() {
		checkNotSubtype("null","X<X|[int]>");
	}
	@Test public void test_156() {
		checkNotSubtype("null","[X<[X]>]|X<[X]>");
	}
	@Test public void test_157() {
		checkNotSubtype("null","X<[X]>|Y<[Y]>");
	}
	@Test public void test_158() {
		checkNotSubtype("null","X<[X]>|[X<[X]>]");
	}
	@Test public void test_159() {
		checkNotSubtype("null","X<X|[Y<[Y]>]>");
	}
	@Test public void test_160() {
		checkNotSubtype("null","X<X|[[X]]>");
	}
	@Test public void test_161() {
		checkNotSubtype("null","X<[X]>|(Y<X<[X]>|Y>)");
	}
	@Test public void test_162() {
		checkNotSubtype("null","X<X|[Y<X|Y>]>");
	}
	@Test public void test_163() {
		checkIsSubtype("null","(X<X|void>)|void");
	}
	@Test public void test_164() {
		checkIsSubtype("null","X<X|(Y<Y|void>)>");
	}
	@Test public void test_165() {
		checkNotSubtype("null","(X<X|any>)|any");
	}
	@Test public void test_166() {
		checkNotSubtype("null","X<X|(Y<Y|any>)>");
	}
	@Test public void test_167() {
		checkIsSubtype("null","(X<X|null>)|null");
	}
	@Test public void test_168() {
		checkIsSubtype("null","X<X|(Y<Y|null>)>");
	}
	@Test public void test_169() {
		checkNotSubtype("null","(X<X|int>)|int");
	}
	@Test public void test_170() {
		checkNotSubtype("null","X<X|(Y<Y|int>)>");
	}
	@Test public void test_171() {
		checkNotSubtype("null","(X<X|Y<[Y]>>)|Y<[Y]>");
	}
	@Test public void test_172() {
		checkNotSubtype("null","X<X|(Y<Y|Z<[Z]>>)>");
	}
	@Test public void test_173() {
		checkNotSubtype("null","X<X|(Y<Y|[X]>)>");
	}
	@Test public void test_174() {
		checkIsSubtype("null","X<X|(Y<Y|(Z<X|Z>)>)>");
	}
	@Test public void test_175() {
		checkNotSubtype("int","any");
	}
	@Test public void test_176() {
		checkNotSubtype("int","null");
	}
	@Test public void test_177() {
		checkIsSubtype("int","int");
	}
	@Test public void test_178() {
		checkNotSubtype("int","X<[X]>");
	}
	@Test public void test_179() {
		checkNotSubtype("int","[void]");
	}
	@Test public void test_180() {
		checkNotSubtype("int","[any]");
	}
	@Test public void test_181() {
		checkNotSubtype("int","[null]");
	}
	@Test public void test_182() {
		checkNotSubtype("int","[int]");
	}
	@Test public void test_183() {
		checkNotSubtype("int","[X<[X]>]");
	}
	@Test public void test_184() {
		checkIsSubtype("int","X<X|void>");
	}
	@Test public void test_185() {
		checkNotSubtype("int","X<X|any>");
	}
	@Test public void test_186() {
		checkNotSubtype("int","X<X|null>");
	}
	@Test public void test_187() {
		checkIsSubtype("int","X<X|int>");
	}
	@Test public void test_188() {
		checkNotSubtype("int","X<X|Y<[Y]>>");
	}
	@Test public void test_189() {
		checkNotSubtype("int","[[void]]");
	}
	@Test public void test_190() {
		checkNotSubtype("int","[[any]]");
	}
	@Test public void test_191() {
		checkNotSubtype("int","[[null]]");
	}
	@Test public void test_192() {
		checkNotSubtype("int","[[int]]");
	}
	@Test public void test_193() {
		checkNotSubtype("int","[[X<[X]>]]");
	}
	@Test public void test_194() {
		checkNotSubtype("int","X<[[[X]]]>");
	}
	@Test public void test_195() {
		checkNotSubtype("int","X<[[Y<X|Y>]]>");
	}
	@Test public void test_196() {
		checkNotSubtype("int","[X<X|void>]");
	}
	@Test public void test_197() {
		checkNotSubtype("int","[X<X|any>]");
	}
	@Test public void test_198() {
		checkNotSubtype("int","[X<X|null>]");
	}
	@Test public void test_199() {
		checkNotSubtype("int","[X<X|int>]");
	}
	@Test public void test_200() {
		checkNotSubtype("int","[X<X|Y<[Y]>>]");
	}
	@Test public void test_201() {
		checkNotSubtype("int","X<[Y<Y|[X]>]>");
	}
	@Test public void test_202() {
		checkNotSubtype("int","X<[Y<Y|(Z<X|Z>)>]>");
	}
	@Test public void test_203() {
		checkIsSubtype("int","void|void");
	}
	@Test public void test_204() {
		checkNotSubtype("int","void|any");
	}
	@Test public void test_205() {
		checkNotSubtype("int","void|null");
	}
	@Test public void test_206() {
		checkIsSubtype("int","void|int");
	}
	@Test public void test_207() {
		checkNotSubtype("int","void|X<[X]>");
	}
	@Test public void test_208() {
		checkNotSubtype("int","void|[void]");
	}
	@Test public void test_209() {
		checkIsSubtype("int","void|(X<void|X>)");
	}
	@Test public void test_210() {
		checkNotSubtype("int","any|void");
	}
	@Test public void test_211() {
		checkNotSubtype("int","any|any");
	}
	@Test public void test_212() {
		checkNotSubtype("int","any|null");
	}
	@Test public void test_213() {
		checkNotSubtype("int","any|int");
	}
	@Test public void test_214() {
		checkNotSubtype("int","any|X<[X]>");
	}
	@Test public void test_215() {
		checkNotSubtype("int","any|[any]");
	}
	@Test public void test_216() {
		checkNotSubtype("int","any|(X<any|X>)");
	}
	@Test public void test_217() {
		checkNotSubtype("int","null|void");
	}
	@Test public void test_218() {
		checkNotSubtype("int","null|any");
	}
	@Test public void test_219() {
		checkNotSubtype("int","null|null");
	}
	@Test public void test_220() {
		checkNotSubtype("int","null|int");
	}
	@Test public void test_221() {
		checkNotSubtype("int","null|X<[X]>");
	}
	@Test public void test_222() {
		checkNotSubtype("int","null|[null]");
	}
	@Test public void test_223() {
		checkNotSubtype("int","null|(X<null|X>)");
	}
	@Test public void test_224() {
		checkIsSubtype("int","int|void");
	}
	@Test public void test_225() {
		checkNotSubtype("int","int|any");
	}
	@Test public void test_226() {
		checkNotSubtype("int","int|null");
	}
	@Test public void test_227() {
		checkIsSubtype("int","int|int");
	}
	@Test public void test_228() {
		checkNotSubtype("int","int|X<[X]>");
	}
	@Test public void test_229() {
		checkNotSubtype("int","int|[int]");
	}
	@Test public void test_230() {
		checkIsSubtype("int","int|(X<int|X>)");
	}
	@Test public void test_231() {
		checkNotSubtype("int","[void]|void");
	}
	@Test public void test_232() {
		checkNotSubtype("int","X<[X]>|void");
	}
	@Test public void test_233() {
		checkNotSubtype("int","X<X|[void]>");
	}
	@Test public void test_234() {
		checkNotSubtype("int","[any]|any");
	}
	@Test public void test_235() {
		checkNotSubtype("int","X<[X]>|any");
	}
	@Test public void test_236() {
		checkNotSubtype("int","X<X|[any]>");
	}
	@Test public void test_237() {
		checkNotSubtype("int","[null]|null");
	}
	@Test public void test_238() {
		checkNotSubtype("int","X<[X]>|null");
	}
	@Test public void test_239() {
		checkNotSubtype("int","X<X|[null]>");
	}
	@Test public void test_240() {
		checkNotSubtype("int","[int]|int");
	}
	@Test public void test_241() {
		checkNotSubtype("int","X<[X]>|int");
	}
	@Test public void test_242() {
		checkNotSubtype("int","X<X|[int]>");
	}
	@Test public void test_243() {
		checkNotSubtype("int","[X<[X]>]|X<[X]>");
	}
	@Test public void test_244() {
		checkNotSubtype("int","X<[X]>|Y<[Y]>");
	}
	@Test public void test_245() {
		checkNotSubtype("int","X<[X]>|[X<[X]>]");
	}
	@Test public void test_246() {
		checkNotSubtype("int","X<X|[Y<[Y]>]>");
	}
	@Test public void test_247() {
		checkNotSubtype("int","X<X|[[X]]>");
	}
	@Test public void test_248() {
		checkNotSubtype("int","X<[X]>|(Y<X<[X]>|Y>)");
	}
	@Test public void test_249() {
		checkNotSubtype("int","X<X|[Y<X|Y>]>");
	}
	@Test public void test_250() {
		checkIsSubtype("int","(X<X|void>)|void");
	}
	@Test public void test_251() {
		checkIsSubtype("int","X<X|(Y<Y|void>)>");
	}
	@Test public void test_252() {
		checkNotSubtype("int","(X<X|any>)|any");
	}
	@Test public void test_253() {
		checkNotSubtype("int","X<X|(Y<Y|any>)>");
	}
	@Test public void test_254() {
		checkNotSubtype("int","(X<X|null>)|null");
	}
	@Test public void test_255() {
		checkNotSubtype("int","X<X|(Y<Y|null>)>");
	}
	@Test public void test_256() {
		checkIsSubtype("int","(X<X|int>)|int");
	}
	@Test public void test_257() {
		checkIsSubtype("int","X<X|(Y<Y|int>)>");
	}
	@Test public void test_258() {
		checkNotSubtype("int","(X<X|Y<[Y]>>)|Y<[Y]>");
	}
	@Test public void test_259() {
		checkNotSubtype("int","X<X|(Y<Y|Z<[Z]>>)>");
	}
	@Test public void test_260() {
		checkNotSubtype("int","X<X|(Y<Y|[X]>)>");
	}
	@Test public void test_261() {
		checkIsSubtype("int","X<X|(Y<Y|(Z<X|Z>)>)>");
	}
	@Test public void test_262() {
		checkNotSubtype("X<[X]>","any");
	}
	@Test public void test_263() {
		checkNotSubtype("X<[X]>","null");
	}
	@Test public void test_264() {
		checkNotSubtype("X<[X]>","int");
	}
	@Test public void test_265() {
		checkIsSubtype("X<[X]>","X<[X]>");
	}
	@Test public void test_266() {
		checkIsSubtype("X<[X]>","[void]");
	}
	@Test public void test_267() {
		checkNotSubtype("X<[X]>","[any]");
	}
	@Test public void test_268() {
		checkNotSubtype("X<[X]>","[null]");
	}
	@Test public void test_269() {
		checkNotSubtype("X<[X]>","[int]");
	}
	@Test public void test_270() {
		checkIsSubtype("X<[X]>","[X<[X]>]");
	}
	@Test public void test_271() {
		checkIsSubtype("X<[X]>","X<X|void>");
	}
	@Test public void test_272() {
		checkNotSubtype("X<[X]>","X<X|any>");
	}
	@Test public void test_273() {
		checkNotSubtype("X<[X]>","X<X|null>");
	}
	@Test public void test_274() {
		checkNotSubtype("X<[X]>","X<X|int>");
	}
	@Test public void test_275() {
		checkIsSubtype("X<[X]>","X<X|Y<[Y]>>");
	}
	@Test public void test_276() {
		checkIsSubtype("X<[X]>","[[void]]");
	}
	@Test public void test_277() {
		checkNotSubtype("X<[X]>","[[any]]");
	}
	@Test public void test_278() {
		checkNotSubtype("X<[X]>","[[null]]");
	}
	@Test public void test_279() {
		checkNotSubtype("X<[X]>","[[int]]");
	}
	@Test public void test_280() {
		checkIsSubtype("X<[X]>","[[X<[X]>]]");
	}
	@Test public void test_281() {
		checkIsSubtype("X<[X]>","X<[[[X]]]>");
	}
	@Test public void test_282() {
		checkIsSubtype("X<[X]>","X<[[Y<X|Y>]]>");
	}
	@Test public void test_283() {
		checkIsSubtype("X<[X]>","[X<X|void>]");
	}
	@Test public void test_284() {
		checkNotSubtype("X<[X]>","[X<X|any>]");
	}
	@Test public void test_285() {
		checkNotSubtype("X<[X]>","[X<X|null>]");
	}
	@Test public void test_286() {
		checkNotSubtype("X<[X]>","[X<X|int>]");
	}
	@Test public void test_287() {
		checkIsSubtype("X<[X]>","[X<X|Y<[Y]>>]");
	}
	@Test public void test_288() {
		checkIsSubtype("X<[X]>","X<[Y<Y|[X]>]>");
	}
	@Test public void test_289() {
		checkIsSubtype("X<[X]>","X<[Y<Y|(Z<X|Z>)>]>");
	}
	@Test public void test_290() {
		checkIsSubtype("X<[X]>","void|void");
	}
	@Test public void test_291() {
		checkNotSubtype("X<[X]>","void|any");
	}
	@Test public void test_292() {
		checkNotSubtype("X<[X]>","void|null");
	}
	@Test public void test_293() {
		checkNotSubtype("X<[X]>","void|int");
	}
	@Test public void test_294() {
		checkIsSubtype("X<[X]>","void|X<[X]>");
	}
	@Test public void test_295() {
		checkIsSubtype("X<[X]>","void|[void]");
	}
	@Test public void test_296() {
		checkIsSubtype("X<[X]>","void|(X<void|X>)");
	}
	@Test public void test_297() {
		checkNotSubtype("X<[X]>","any|void");
	}
	@Test public void test_298() {
		checkNotSubtype("X<[X]>","any|any");
	}
	@Test public void test_299() {
		checkNotSubtype("X<[X]>","any|null");
	}
	@Test public void test_300() {
		checkNotSubtype("X<[X]>","any|int");
	}
	@Test public void test_301() {
		checkNotSubtype("X<[X]>","any|X<[X]>");
	}
	@Test public void test_302() {
		checkNotSubtype("X<[X]>","any|[any]");
	}
	@Test public void test_303() {
		checkNotSubtype("X<[X]>","any|(X<any|X>)");
	}
	@Test public void test_304() {
		checkNotSubtype("X<[X]>","null|void");
	}
	@Test public void test_305() {
		checkNotSubtype("X<[X]>","null|any");
	}
	@Test public void test_306() {
		checkNotSubtype("X<[X]>","null|null");
	}
	@Test public void test_307() {
		checkNotSubtype("X<[X]>","null|int");
	}
	@Test public void test_308() {
		checkNotSubtype("X<[X]>","null|X<[X]>");
	}
	@Test public void test_309() {
		checkNotSubtype("X<[X]>","null|[null]");
	}
	@Test public void test_310() {
		checkNotSubtype("X<[X]>","null|(X<null|X>)");
	}
	@Test public void test_311() {
		checkNotSubtype("X<[X]>","int|void");
	}
	@Test public void test_312() {
		checkNotSubtype("X<[X]>","int|any");
	}
	@Test public void test_313() {
		checkNotSubtype("X<[X]>","int|null");
	}
	@Test public void test_314() {
		checkNotSubtype("X<[X]>","int|int");
	}
	@Test public void test_315() {
		checkNotSubtype("X<[X]>","int|X<[X]>");
	}
	@Test public void test_316() {
		checkNotSubtype("X<[X]>","int|[int]");
	}
	@Test public void test_317() {
		checkNotSubtype("X<[X]>","int|(X<int|X>)");
	}
	@Test public void test_318() {
		checkIsSubtype("X<[X]>","[void]|void");
	}
	@Test public void test_319() {
		checkIsSubtype("X<[X]>","X<[X]>|void");
	}
	@Test public void test_320() {
		checkIsSubtype("X<[X]>","X<X|[void]>");
	}
	@Test public void test_321() {
		checkNotSubtype("X<[X]>","[any]|any");
	}
	@Test public void test_322() {
		checkNotSubtype("X<[X]>","X<[X]>|any");
	}
	@Test public void test_323() {
		checkNotSubtype("X<[X]>","X<X|[any]>");
	}
	@Test public void test_324() {
		checkNotSubtype("X<[X]>","[null]|null");
	}
	@Test public void test_325() {
		checkNotSubtype("X<[X]>","X<[X]>|null");
	}
	@Test public void test_326() {
		checkNotSubtype("X<[X]>","X<X|[null]>");
	}
	@Test public void test_327() {
		checkNotSubtype("X<[X]>","[int]|int");
	}
	@Test public void test_328() {
		checkNotSubtype("X<[X]>","X<[X]>|int");
	}
	@Test public void test_329() {
		checkNotSubtype("X<[X]>","X<X|[int]>");
	}
	@Test public void test_330() {
		checkIsSubtype("X<[X]>","[X<[X]>]|X<[X]>");
	}
	@Test public void test_331() {
		checkIsSubtype("X<[X]>","X<[X]>|Y<[Y]>");
	}
	@Test public void test_332() {
		checkIsSubtype("X<[X]>","X<[X]>|[X<[X]>]");
	}
	@Test public void test_333() {
		checkIsSubtype("X<[X]>","X<X|[Y<[Y]>]>");
	}
	@Test public void test_334() {
		checkIsSubtype("X<[X]>","X<X|[[X]]>");
	}
	@Test public void test_335() {
		checkIsSubtype("X<[X]>","X<[X]>|(Y<X<[X]>|Y>)");
	}
	@Test public void test_336() {
		checkIsSubtype("X<[X]>","X<X|[Y<X|Y>]>");
	}
	@Test public void test_337() {
		checkIsSubtype("X<[X]>","(X<X|void>)|void");
	}
	@Test public void test_338() {
		checkIsSubtype("X<[X]>","X<X|(Y<Y|void>)>");
	}
	@Test public void test_339() {
		checkNotSubtype("X<[X]>","(X<X|any>)|any");
	}
	@Test public void test_340() {
		checkNotSubtype("X<[X]>","X<X|(Y<Y|any>)>");
	}
	@Test public void test_341() {
		checkNotSubtype("X<[X]>","(X<X|null>)|null");
	}
	@Test public void test_342() {
		checkNotSubtype("X<[X]>","X<X|(Y<Y|null>)>");
	}
	@Test public void test_343() {
		checkNotSubtype("X<[X]>","(X<X|int>)|int");
	}
	@Test public void test_344() {
		checkNotSubtype("X<[X]>","X<X|(Y<Y|int>)>");
	}
	@Test public void test_345() {
		checkIsSubtype("X<[X]>","(X<X|Y<[Y]>>)|Y<[Y]>");
	}
	@Test public void test_346() {
		checkIsSubtype("X<[X]>","X<X|(Y<Y|Z<[Z]>>)>");
	}
	@Test public void test_347() {
		checkIsSubtype("X<[X]>","X<X|(Y<Y|[X]>)>");
	}
	@Test public void test_348() {
		checkIsSubtype("X<[X]>","X<X|(Y<Y|(Z<X|Z>)>)>");
	}
	@Test public void test_349() {
		checkNotSubtype("[void]","any");
	}
	@Test public void test_350() {
		checkNotSubtype("[void]","null");
	}
	@Test public void test_351() {
		checkNotSubtype("[void]","int");
	}
	@Test public void test_352() {
		checkNotSubtype("[void]","X<[X]>");
	}
	@Test public void test_353() {
		checkIsSubtype("[void]","[void]");
	}
	@Test public void test_354() {
		checkNotSubtype("[void]","[any]");
	}
	@Test public void test_355() {
		checkNotSubtype("[void]","[null]");
	}
	@Test public void test_356() {
		checkNotSubtype("[void]","[int]");
	}
	@Test public void test_357() {
		checkNotSubtype("[void]","[X<[X]>]");
	}
	@Test public void test_358() {
		checkIsSubtype("[void]","X<X|void>");
	}
	@Test public void test_359() {
		checkNotSubtype("[void]","X<X|any>");
	}
	@Test public void test_360() {
		checkNotSubtype("[void]","X<X|null>");
	}
	@Test public void test_361() {
		checkNotSubtype("[void]","X<X|int>");
	}
	@Test public void test_362() {
		checkNotSubtype("[void]","X<X|Y<[Y]>>");
	}
	@Test public void test_363() {
		checkNotSubtype("[void]","[[void]]");
	}
	@Test public void test_364() {
		checkNotSubtype("[void]","[[any]]");
	}
	@Test public void test_365() {
		checkNotSubtype("[void]","[[null]]");
	}
	@Test public void test_366() {
		checkNotSubtype("[void]","[[int]]");
	}
	@Test public void test_367() {
		checkNotSubtype("[void]","[[X<[X]>]]");
	}
	@Test public void test_368() {
		checkNotSubtype("[void]","X<[[[X]]]>");
	}
	@Test public void test_369() {
		checkNotSubtype("[void]","X<[[Y<X|Y>]]>");
	}
	@Test public void test_370() {
		checkIsSubtype("[void]","[X<X|void>]");
	}
	@Test public void test_371() {
		checkNotSubtype("[void]","[X<X|any>]");
	}
	@Test public void test_372() {
		checkNotSubtype("[void]","[X<X|null>]");
	}
	@Test public void test_373() {
		checkNotSubtype("[void]","[X<X|int>]");
	}
	@Test public void test_374() {
		checkNotSubtype("[void]","[X<X|Y<[Y]>>]");
	}
	@Test public void test_375() {
		checkNotSubtype("[void]","X<[Y<Y|[X]>]>");
	}
	@Test public void test_376() {
		checkNotSubtype("[void]","X<[Y<Y|(Z<X|Z>)>]>");
	}
	@Test public void test_377() {
		checkIsSubtype("[void]","void|void");
	}
	@Test public void test_378() {
		checkNotSubtype("[void]","void|any");
	}
	@Test public void test_379() {
		checkNotSubtype("[void]","void|null");
	}
	@Test public void test_380() {
		checkNotSubtype("[void]","void|int");
	}
	@Test public void test_381() {
		checkNotSubtype("[void]","void|X<[X]>");
	}
	@Test public void test_382() {
		checkIsSubtype("[void]","void|[void]");
	}
	@Test public void test_383() {
		checkIsSubtype("[void]","void|(X<void|X>)");
	}
	@Test public void test_384() {
		checkNotSubtype("[void]","any|void");
	}
	@Test public void test_385() {
		checkNotSubtype("[void]","any|any");
	}
	@Test public void test_386() {
		checkNotSubtype("[void]","any|null");
	}
	@Test public void test_387() {
		checkNotSubtype("[void]","any|int");
	}
	@Test public void test_388() {
		checkNotSubtype("[void]","any|X<[X]>");
	}
	@Test public void test_389() {
		checkNotSubtype("[void]","any|[any]");
	}
	@Test public void test_390() {
		checkNotSubtype("[void]","any|(X<any|X>)");
	}
	@Test public void test_391() {
		checkNotSubtype("[void]","null|void");
	}
	@Test public void test_392() {
		checkNotSubtype("[void]","null|any");
	}
	@Test public void test_393() {
		checkNotSubtype("[void]","null|null");
	}
	@Test public void test_394() {
		checkNotSubtype("[void]","null|int");
	}
	@Test public void test_395() {
		checkNotSubtype("[void]","null|X<[X]>");
	}
	@Test public void test_396() {
		checkNotSubtype("[void]","null|[null]");
	}
	@Test public void test_397() {
		checkNotSubtype("[void]","null|(X<null|X>)");
	}
	@Test public void test_398() {
		checkNotSubtype("[void]","int|void");
	}
	@Test public void test_399() {
		checkNotSubtype("[void]","int|any");
	}
	@Test public void test_400() {
		checkNotSubtype("[void]","int|null");
	}
	@Test public void test_401() {
		checkNotSubtype("[void]","int|int");
	}
	@Test public void test_402() {
		checkNotSubtype("[void]","int|X<[X]>");
	}
	@Test public void test_403() {
		checkNotSubtype("[void]","int|[int]");
	}
	@Test public void test_404() {
		checkNotSubtype("[void]","int|(X<int|X>)");
	}
	@Test public void test_405() {
		checkIsSubtype("[void]","[void]|void");
	}
	@Test public void test_406() {
		checkNotSubtype("[void]","X<[X]>|void");
	}
	@Test public void test_407() {
		checkIsSubtype("[void]","X<X|[void]>");
	}
	@Test public void test_408() {
		checkNotSubtype("[void]","[any]|any");
	}
	@Test public void test_409() {
		checkNotSubtype("[void]","X<[X]>|any");
	}
	@Test public void test_410() {
		checkNotSubtype("[void]","X<X|[any]>");
	}
	@Test public void test_411() {
		checkNotSubtype("[void]","[null]|null");
	}
	@Test public void test_412() {
		checkNotSubtype("[void]","X<[X]>|null");
	}
	@Test public void test_413() {
		checkNotSubtype("[void]","X<X|[null]>");
	}
	@Test public void test_414() {
		checkNotSubtype("[void]","[int]|int");
	}
	@Test public void test_415() {
		checkNotSubtype("[void]","X<[X]>|int");
	}
	@Test public void test_416() {
		checkNotSubtype("[void]","X<X|[int]>");
	}
	@Test public void test_417() {
		checkNotSubtype("[void]","[X<[X]>]|X<[X]>");
	}
	@Test public void test_418() {
		checkNotSubtype("[void]","X<[X]>|Y<[Y]>");
	}
	@Test public void test_419() {
		checkNotSubtype("[void]","X<[X]>|[X<[X]>]");
	}
	@Test public void test_420() {
		checkNotSubtype("[void]","X<X|[Y<[Y]>]>");
	}
	@Test public void test_421() {
		checkNotSubtype("[void]","X<X|[[X]]>");
	}
	@Test public void test_422() {
		checkNotSubtype("[void]","X<[X]>|(Y<X<[X]>|Y>)");
	}
	@Test public void test_423() {
		checkNotSubtype("[void]","X<X|[Y<X|Y>]>");
	}
	@Test public void test_424() {
		checkIsSubtype("[void]","(X<X|void>)|void");
	}
	@Test public void test_425() {
		checkIsSubtype("[void]","X<X|(Y<Y|void>)>");
	}
	@Test public void test_426() {
		checkNotSubtype("[void]","(X<X|any>)|any");
	}
	@Test public void test_427() {
		checkNotSubtype("[void]","X<X|(Y<Y|any>)>");
	}
	@Test public void test_428() {
		checkNotSubtype("[void]","(X<X|null>)|null");
	}
	@Test public void test_429() {
		checkNotSubtype("[void]","X<X|(Y<Y|null>)>");
	}
	@Test public void test_430() {
		checkNotSubtype("[void]","(X<X|int>)|int");
	}
	@Test public void test_431() {
		checkNotSubtype("[void]","X<X|(Y<Y|int>)>");
	}
	@Test public void test_432() {
		checkNotSubtype("[void]","(X<X|Y<[Y]>>)|Y<[Y]>");
	}
	@Test public void test_433() {
		checkNotSubtype("[void]","X<X|(Y<Y|Z<[Z]>>)>");
	}
	@Test public void test_434() {
		checkNotSubtype("[void]","X<X|(Y<Y|[X]>)>");
	}
	@Test public void test_435() {
		checkIsSubtype("[void]","X<X|(Y<Y|(Z<X|Z>)>)>");
	}
	@Test public void test_436() {
		checkNotSubtype("[any]","any");
	}
	@Test public void test_437() {
		checkNotSubtype("[any]","null");
	}
	@Test public void test_438() {
		checkNotSubtype("[any]","int");
	}
	@Test public void test_439() {
		checkIsSubtype("[any]","X<[X]>");
	}
	@Test public void test_440() {
		checkIsSubtype("[any]","[void]");
	}
	@Test public void test_441() {
		checkIsSubtype("[any]","[any]");
	}
	@Test public void test_442() {
		checkIsSubtype("[any]","[null]");
	}
	@Test public void test_443() {
		checkIsSubtype("[any]","[int]");
	}
	@Test public void test_444() {
		checkIsSubtype("[any]","[X<[X]>]");
	}
	@Test public void test_445() {
		checkIsSubtype("[any]","X<X|void>");
	}
	@Test public void test_446() {
		checkNotSubtype("[any]","X<X|any>");
	}
	@Test public void test_447() {
		checkNotSubtype("[any]","X<X|null>");
	}
	@Test public void test_448() {
		checkNotSubtype("[any]","X<X|int>");
	}
	@Test public void test_449() {
		checkIsSubtype("[any]","X<X|Y<[Y]>>");
	}
	@Test public void test_450() {
		checkIsSubtype("[any]","[[void]]");
	}
	@Test public void test_451() {
		checkIsSubtype("[any]","[[any]]");
	}
	@Test public void test_452() {
		checkIsSubtype("[any]","[[null]]");
	}
	@Test public void test_453() {
		checkIsSubtype("[any]","[[int]]");
	}
	@Test public void test_454() {
		checkIsSubtype("[any]","[[X<[X]>]]");
	}
	@Test public void test_455() {
		checkIsSubtype("[any]","X<[[[X]]]>");
	}
	@Test public void test_456() {
		checkIsSubtype("[any]","X<[[Y<X|Y>]]>");
	}
	@Test public void test_457() {
		checkIsSubtype("[any]","[X<X|void>]");
	}
	@Test public void test_458() {
		checkIsSubtype("[any]","[X<X|any>]");
	}
	@Test public void test_459() {
		checkIsSubtype("[any]","[X<X|null>]");
	}
	@Test public void test_460() {
		checkIsSubtype("[any]","[X<X|int>]");
	}
	@Test public void test_461() {
		checkIsSubtype("[any]","[X<X|Y<[Y]>>]");
	}
	@Test public void test_462() {
		checkIsSubtype("[any]","X<[Y<Y|[X]>]>");
	}
	@Test public void test_463() {
		checkIsSubtype("[any]","X<[Y<Y|(Z<X|Z>)>]>");
	}
	@Test public void test_464() {
		checkIsSubtype("[any]","void|void");
	}
	@Test public void test_465() {
		checkNotSubtype("[any]","void|any");
	}
	@Test public void test_466() {
		checkNotSubtype("[any]","void|null");
	}
	@Test public void test_467() {
		checkNotSubtype("[any]","void|int");
	}
	@Test public void test_468() {
		checkIsSubtype("[any]","void|X<[X]>");
	}
	@Test public void test_469() {
		checkIsSubtype("[any]","void|[void]");
	}
	@Test public void test_470() {
		checkIsSubtype("[any]","void|(X<void|X>)");
	}
	@Test public void test_471() {
		checkNotSubtype("[any]","any|void");
	}
	@Test public void test_472() {
		checkNotSubtype("[any]","any|any");
	}
	@Test public void test_473() {
		checkNotSubtype("[any]","any|null");
	}
	@Test public void test_474() {
		checkNotSubtype("[any]","any|int");
	}
	@Test public void test_475() {
		checkNotSubtype("[any]","any|X<[X]>");
	}
	@Test public void test_476() {
		checkNotSubtype("[any]","any|[any]");
	}
	@Test public void test_477() {
		checkNotSubtype("[any]","any|(X<any|X>)");
	}
	@Test public void test_478() {
		checkNotSubtype("[any]","null|void");
	}
	@Test public void test_479() {
		checkNotSubtype("[any]","null|any");
	}
	@Test public void test_480() {
		checkNotSubtype("[any]","null|null");
	}
	@Test public void test_481() {
		checkNotSubtype("[any]","null|int");
	}
	@Test public void test_482() {
		checkNotSubtype("[any]","null|X<[X]>");
	}
	@Test public void test_483() {
		checkNotSubtype("[any]","null|[null]");
	}
	@Test public void test_484() {
		checkNotSubtype("[any]","null|(X<null|X>)");
	}
	@Test public void test_485() {
		checkNotSubtype("[any]","int|void");
	}
	@Test public void test_486() {
		checkNotSubtype("[any]","int|any");
	}
	@Test public void test_487() {
		checkNotSubtype("[any]","int|null");
	}
	@Test public void test_488() {
		checkNotSubtype("[any]","int|int");
	}
	@Test public void test_489() {
		checkNotSubtype("[any]","int|X<[X]>");
	}
	@Test public void test_490() {
		checkNotSubtype("[any]","int|[int]");
	}
	@Test public void test_491() {
		checkNotSubtype("[any]","int|(X<int|X>)");
	}
	@Test public void test_492() {
		checkIsSubtype("[any]","[void]|void");
	}
	@Test public void test_493() {
		checkIsSubtype("[any]","X<[X]>|void");
	}
	@Test public void test_494() {
		checkIsSubtype("[any]","X<X|[void]>");
	}
	@Test public void test_495() {
		checkNotSubtype("[any]","[any]|any");
	}
	@Test public void test_496() {
		checkNotSubtype("[any]","X<[X]>|any");
	}
	@Test public void test_497() {
		checkIsSubtype("[any]","X<X|[any]>");
	}
	@Test public void test_498() {
		checkNotSubtype("[any]","[null]|null");
	}
	@Test public void test_499() {
		checkNotSubtype("[any]","X<[X]>|null");
	}
	@Test public void test_500() {
		checkIsSubtype("[any]","X<X|[null]>");
	}
	@Test public void test_501() {
		checkNotSubtype("[any]","[int]|int");
	}
	@Test public void test_502() {
		checkNotSubtype("[any]","X<[X]>|int");
	}
	@Test public void test_503() {
		checkIsSubtype("[any]","X<X|[int]>");
	}
	@Test public void test_504() {
		checkIsSubtype("[any]","[X<[X]>]|X<[X]>");
	}
	@Test public void test_505() {
		checkIsSubtype("[any]","X<[X]>|Y<[Y]>");
	}
	@Test public void test_506() {
		checkIsSubtype("[any]","X<[X]>|[X<[X]>]");
	}
	@Test public void test_507() {
		checkIsSubtype("[any]","X<X|[Y<[Y]>]>");
	}
	@Test public void test_508() {
		checkIsSubtype("[any]","X<X|[[X]]>");
	}
	@Test public void test_509() {
		checkIsSubtype("[any]","X<[X]>|(Y<X<[X]>|Y>)");
	}
	@Test public void test_510() {
		checkIsSubtype("[any]","X<X|[Y<X|Y>]>");
	}
	@Test public void test_511() {
		checkIsSubtype("[any]","(X<X|void>)|void");
	}
	@Test public void test_512() {
		checkIsSubtype("[any]","X<X|(Y<Y|void>)>");
	}
	@Test public void test_513() {
		checkNotSubtype("[any]","(X<X|any>)|any");
	}
	@Test public void test_514() {
		checkNotSubtype("[any]","X<X|(Y<Y|any>)>");
	}
	@Test public void test_515() {
		checkNotSubtype("[any]","(X<X|null>)|null");
	}
	@Test public void test_516() {
		checkNotSubtype("[any]","X<X|(Y<Y|null>)>");
	}
	@Test public void test_517() {
		checkNotSubtype("[any]","(X<X|int>)|int");
	}
	@Test public void test_518() {
		checkNotSubtype("[any]","X<X|(Y<Y|int>)>");
	}
	@Test public void test_519() {
		checkIsSubtype("[any]","(X<X|Y<[Y]>>)|Y<[Y]>");
	}
	@Test public void test_520() {
		checkIsSubtype("[any]","X<X|(Y<Y|Z<[Z]>>)>");
	}
	@Test public void test_521() {
		checkIsSubtype("[any]","X<X|(Y<Y|[X]>)>");
	}
	@Test public void test_522() {
		checkIsSubtype("[any]","X<X|(Y<Y|(Z<X|Z>)>)>");
	}
	@Test public void test_523() {
		checkNotSubtype("[null]","any");
	}
	@Test public void test_524() {
		checkNotSubtype("[null]","null");
	}
	@Test public void test_525() {
		checkNotSubtype("[null]","int");
	}
	@Test public void test_526() {
		checkNotSubtype("[null]","X<[X]>");
	}
	@Test public void test_527() {
		checkIsSubtype("[null]","[void]");
	}
	@Test public void test_528() {
		checkNotSubtype("[null]","[any]");
	}
	@Test public void test_529() {
		checkIsSubtype("[null]","[null]");
	}
	@Test public void test_530() {
		checkNotSubtype("[null]","[int]");
	}
	@Test public void test_531() {
		checkNotSubtype("[null]","[X<[X]>]");
	}
	@Test public void test_532() {
		checkIsSubtype("[null]","X<X|void>");
	}
	@Test public void test_533() {
		checkNotSubtype("[null]","X<X|any>");
	}
	@Test public void test_534() {
		checkNotSubtype("[null]","X<X|null>");
	}
	@Test public void test_535() {
		checkNotSubtype("[null]","X<X|int>");
	}
	@Test public void test_536() {
		checkNotSubtype("[null]","X<X|Y<[Y]>>");
	}
	@Test public void test_537() {
		checkNotSubtype("[null]","[[void]]");
	}
	@Test public void test_538() {
		checkNotSubtype("[null]","[[any]]");
	}
	@Test public void test_539() {
		checkNotSubtype("[null]","[[null]]");
	}
	@Test public void test_540() {
		checkNotSubtype("[null]","[[int]]");
	}
	@Test public void test_541() {
		checkNotSubtype("[null]","[[X<[X]>]]");
	}
	@Test public void test_542() {
		checkNotSubtype("[null]","X<[[[X]]]>");
	}
	@Test public void test_543() {
		checkNotSubtype("[null]","X<[[Y<X|Y>]]>");
	}
	@Test public void test_544() {
		checkIsSubtype("[null]","[X<X|void>]");
	}
	@Test public void test_545() {
		checkNotSubtype("[null]","[X<X|any>]");
	}
	@Test public void test_546() {
		checkIsSubtype("[null]","[X<X|null>]");
	}
	@Test public void test_547() {
		checkNotSubtype("[null]","[X<X|int>]");
	}
	@Test public void test_548() {
		checkNotSubtype("[null]","[X<X|Y<[Y]>>]");
	}
	@Test public void test_549() {
		checkNotSubtype("[null]","X<[Y<Y|[X]>]>");
	}
	@Test public void test_550() {
		checkNotSubtype("[null]","X<[Y<Y|(Z<X|Z>)>]>");
	}
	@Test public void test_551() {
		checkIsSubtype("[null]","void|void");
	}
	@Test public void test_552() {
		checkNotSubtype("[null]","void|any");
	}
	@Test public void test_553() {
		checkNotSubtype("[null]","void|null");
	}
	@Test public void test_554() {
		checkNotSubtype("[null]","void|int");
	}
	@Test public void test_555() {
		checkNotSubtype("[null]","void|X<[X]>");
	}
	@Test public void test_556() {
		checkIsSubtype("[null]","void|[void]");
	}
	@Test public void test_557() {
		checkIsSubtype("[null]","void|(X<void|X>)");
	}
	@Test public void test_558() {
		checkNotSubtype("[null]","any|void");
	}
	@Test public void test_559() {
		checkNotSubtype("[null]","any|any");
	}
	@Test public void test_560() {
		checkNotSubtype("[null]","any|null");
	}
	@Test public void test_561() {
		checkNotSubtype("[null]","any|int");
	}
	@Test public void test_562() {
		checkNotSubtype("[null]","any|X<[X]>");
	}
	@Test public void test_563() {
		checkNotSubtype("[null]","any|[any]");
	}
	@Test public void test_564() {
		checkNotSubtype("[null]","any|(X<any|X>)");
	}
	@Test public void test_565() {
		checkNotSubtype("[null]","null|void");
	}
	@Test public void test_566() {
		checkNotSubtype("[null]","null|any");
	}
	@Test public void test_567() {
		checkNotSubtype("[null]","null|null");
	}
	@Test public void test_568() {
		checkNotSubtype("[null]","null|int");
	}
	@Test public void test_569() {
		checkNotSubtype("[null]","null|X<[X]>");
	}
	@Test public void test_570() {
		checkNotSubtype("[null]","null|[null]");
	}
	@Test public void test_571() {
		checkNotSubtype("[null]","null|(X<null|X>)");
	}
	@Test public void test_572() {
		checkNotSubtype("[null]","int|void");
	}
	@Test public void test_573() {
		checkNotSubtype("[null]","int|any");
	}
	@Test public void test_574() {
		checkNotSubtype("[null]","int|null");
	}
	@Test public void test_575() {
		checkNotSubtype("[null]","int|int");
	}
	@Test public void test_576() {
		checkNotSubtype("[null]","int|X<[X]>");
	}
	@Test public void test_577() {
		checkNotSubtype("[null]","int|[int]");
	}
	@Test public void test_578() {
		checkNotSubtype("[null]","int|(X<int|X>)");
	}
	@Test public void test_579() {
		checkIsSubtype("[null]","[void]|void");
	}
	@Test public void test_580() {
		checkNotSubtype("[null]","X<[X]>|void");
	}
	@Test public void test_581() {
		checkIsSubtype("[null]","X<X|[void]>");
	}
	@Test public void test_582() {
		checkNotSubtype("[null]","[any]|any");
	}
	@Test public void test_583() {
		checkNotSubtype("[null]","X<[X]>|any");
	}
	@Test public void test_584() {
		checkNotSubtype("[null]","X<X|[any]>");
	}
	@Test public void test_585() {
		checkNotSubtype("[null]","[null]|null");
	}
	@Test public void test_586() {
		checkNotSubtype("[null]","X<[X]>|null");
	}
	@Test public void test_587() {
		checkIsSubtype("[null]","X<X|[null]>");
	}
	@Test public void test_588() {
		checkNotSubtype("[null]","[int]|int");
	}
	@Test public void test_589() {
		checkNotSubtype("[null]","X<[X]>|int");
	}
	@Test public void test_590() {
		checkNotSubtype("[null]","X<X|[int]>");
	}
	@Test public void test_591() {
		checkNotSubtype("[null]","[X<[X]>]|X<[X]>");
	}
	@Test public void test_592() {
		checkNotSubtype("[null]","X<[X]>|Y<[Y]>");
	}
	@Test public void test_593() {
		checkNotSubtype("[null]","X<[X]>|[X<[X]>]");
	}
	@Test public void test_594() {
		checkNotSubtype("[null]","X<X|[Y<[Y]>]>");
	}
	@Test public void test_595() {
		checkNotSubtype("[null]","X<X|[[X]]>");
	}
	@Test public void test_596() {
		checkNotSubtype("[null]","X<[X]>|(Y<X<[X]>|Y>)");
	}
	@Test public void test_597() {
		checkNotSubtype("[null]","X<X|[Y<X|Y>]>");
	}
	@Test public void test_598() {
		checkIsSubtype("[null]","(X<X|void>)|void");
	}
	@Test public void test_599() {
		checkIsSubtype("[null]","X<X|(Y<Y|void>)>");
	}
	@Test public void test_600() {
		checkNotSubtype("[null]","(X<X|any>)|any");
	}
	@Test public void test_601() {
		checkNotSubtype("[null]","X<X|(Y<Y|any>)>");
	}
	@Test public void test_602() {
		checkNotSubtype("[null]","(X<X|null>)|null");
	}
	@Test public void test_603() {
		checkNotSubtype("[null]","X<X|(Y<Y|null>)>");
	}
	@Test public void test_604() {
		checkNotSubtype("[null]","(X<X|int>)|int");
	}
	@Test public void test_605() {
		checkNotSubtype("[null]","X<X|(Y<Y|int>)>");
	}
	@Test public void test_606() {
		checkNotSubtype("[null]","(X<X|Y<[Y]>>)|Y<[Y]>");
	}
	@Test public void test_607() {
		checkNotSubtype("[null]","X<X|(Y<Y|Z<[Z]>>)>");
	}
	@Test public void test_608() {
		checkNotSubtype("[null]","X<X|(Y<Y|[X]>)>");
	}
	@Test public void test_609() {
		checkIsSubtype("[null]","X<X|(Y<Y|(Z<X|Z>)>)>");
	}
	@Test public void test_610() {
		checkNotSubtype("[int]","any");
	}
	@Test public void test_611() {
		checkNotSubtype("[int]","null");
	}
	@Test public void test_612() {
		checkNotSubtype("[int]","int");
	}
	@Test public void test_613() {
		checkNotSubtype("[int]","X<[X]>");
	}
	@Test public void test_614() {
		checkIsSubtype("[int]","[void]");
	}
	@Test public void test_615() {
		checkNotSubtype("[int]","[any]");
	}
	@Test public void test_616() {
		checkNotSubtype("[int]","[null]");
	}
	@Test public void test_617() {
		checkIsSubtype("[int]","[int]");
	}
	@Test public void test_618() {
		checkNotSubtype("[int]","[X<[X]>]");
	}
	@Test public void test_619() {
		checkIsSubtype("[int]","X<X|void>");
	}
	@Test public void test_620() {
		checkNotSubtype("[int]","X<X|any>");
	}
	@Test public void test_621() {
		checkNotSubtype("[int]","X<X|null>");
	}
	@Test public void test_622() {
		checkNotSubtype("[int]","X<X|int>");
	}
	@Test public void test_623() {
		checkNotSubtype("[int]","X<X|Y<[Y]>>");
	}
	@Test public void test_624() {
		checkNotSubtype("[int]","[[void]]");
	}
	@Test public void test_625() {
		checkNotSubtype("[int]","[[any]]");
	}
	@Test public void test_626() {
		checkNotSubtype("[int]","[[null]]");
	}
	@Test public void test_627() {
		checkNotSubtype("[int]","[[int]]");
	}
	@Test public void test_628() {
		checkNotSubtype("[int]","[[X<[X]>]]");
	}
	@Test public void test_629() {
		checkNotSubtype("[int]","X<[[[X]]]>");
	}
	@Test public void test_630() {
		checkNotSubtype("[int]","X<[[Y<X|Y>]]>");
	}
	@Test public void test_631() {
		checkIsSubtype("[int]","[X<X|void>]");
	}
	@Test public void test_632() {
		checkNotSubtype("[int]","[X<X|any>]");
	}
	@Test public void test_633() {
		checkNotSubtype("[int]","[X<X|null>]");
	}
	@Test public void test_634() {
		checkIsSubtype("[int]","[X<X|int>]");
	}
	@Test public void test_635() {
		checkNotSubtype("[int]","[X<X|Y<[Y]>>]");
	}
	@Test public void test_636() {
		checkNotSubtype("[int]","X<[Y<Y|[X]>]>");
	}
	@Test public void test_637() {
		checkNotSubtype("[int]","X<[Y<Y|(Z<X|Z>)>]>");
	}
	@Test public void test_638() {
		checkIsSubtype("[int]","void|void");
	}
	@Test public void test_639() {
		checkNotSubtype("[int]","void|any");
	}
	@Test public void test_640() {
		checkNotSubtype("[int]","void|null");
	}
	@Test public void test_641() {
		checkNotSubtype("[int]","void|int");
	}
	@Test public void test_642() {
		checkNotSubtype("[int]","void|X<[X]>");
	}
	@Test public void test_643() {
		checkIsSubtype("[int]","void|[void]");
	}
	@Test public void test_644() {
		checkIsSubtype("[int]","void|(X<void|X>)");
	}
	@Test public void test_645() {
		checkNotSubtype("[int]","any|void");
	}
	@Test public void test_646() {
		checkNotSubtype("[int]","any|any");
	}
	@Test public void test_647() {
		checkNotSubtype("[int]","any|null");
	}
	@Test public void test_648() {
		checkNotSubtype("[int]","any|int");
	}
	@Test public void test_649() {
		checkNotSubtype("[int]","any|X<[X]>");
	}
	@Test public void test_650() {
		checkNotSubtype("[int]","any|[any]");
	}
	@Test public void test_651() {
		checkNotSubtype("[int]","any|(X<any|X>)");
	}
	@Test public void test_652() {
		checkNotSubtype("[int]","null|void");
	}
	@Test public void test_653() {
		checkNotSubtype("[int]","null|any");
	}
	@Test public void test_654() {
		checkNotSubtype("[int]","null|null");
	}
	@Test public void test_655() {
		checkNotSubtype("[int]","null|int");
	}
	@Test public void test_656() {
		checkNotSubtype("[int]","null|X<[X]>");
	}
	@Test public void test_657() {
		checkNotSubtype("[int]","null|[null]");
	}
	@Test public void test_658() {
		checkNotSubtype("[int]","null|(X<null|X>)");
	}
	@Test public void test_659() {
		checkNotSubtype("[int]","int|void");
	}
	@Test public void test_660() {
		checkNotSubtype("[int]","int|any");
	}
	@Test public void test_661() {
		checkNotSubtype("[int]","int|null");
	}
	@Test public void test_662() {
		checkNotSubtype("[int]","int|int");
	}
	@Test public void test_663() {
		checkNotSubtype("[int]","int|X<[X]>");
	}
	@Test public void test_664() {
		checkNotSubtype("[int]","int|[int]");
	}
	@Test public void test_665() {
		checkNotSubtype("[int]","int|(X<int|X>)");
	}
	@Test public void test_666() {
		checkIsSubtype("[int]","[void]|void");
	}
	@Test public void test_667() {
		checkNotSubtype("[int]","X<[X]>|void");
	}
	@Test public void test_668() {
		checkIsSubtype("[int]","X<X|[void]>");
	}
	@Test public void test_669() {
		checkNotSubtype("[int]","[any]|any");
	}
	@Test public void test_670() {
		checkNotSubtype("[int]","X<[X]>|any");
	}
	@Test public void test_671() {
		checkNotSubtype("[int]","X<X|[any]>");
	}
	@Test public void test_672() {
		checkNotSubtype("[int]","[null]|null");
	}
	@Test public void test_673() {
		checkNotSubtype("[int]","X<[X]>|null");
	}
	@Test public void test_674() {
		checkNotSubtype("[int]","X<X|[null]>");
	}
	@Test public void test_675() {
		checkNotSubtype("[int]","[int]|int");
	}
	@Test public void test_676() {
		checkNotSubtype("[int]","X<[X]>|int");
	}
	@Test public void test_677() {
		checkIsSubtype("[int]","X<X|[int]>");
	}
	@Test public void test_678() {
		checkNotSubtype("[int]","[X<[X]>]|X<[X]>");
	}
	@Test public void test_679() {
		checkNotSubtype("[int]","X<[X]>|Y<[Y]>");
	}
	@Test public void test_680() {
		checkNotSubtype("[int]","X<[X]>|[X<[X]>]");
	}
	@Test public void test_681() {
		checkNotSubtype("[int]","X<X|[Y<[Y]>]>");
	}
	@Test public void test_682() {
		checkNotSubtype("[int]","X<X|[[X]]>");
	}
	@Test public void test_683() {
		checkNotSubtype("[int]","X<[X]>|(Y<X<[X]>|Y>)");
	}
	@Test public void test_684() {
		checkNotSubtype("[int]","X<X|[Y<X|Y>]>");
	}
	@Test public void test_685() {
		checkIsSubtype("[int]","(X<X|void>)|void");
	}
	@Test public void test_686() {
		checkIsSubtype("[int]","X<X|(Y<Y|void>)>");
	}
	@Test public void test_687() {
		checkNotSubtype("[int]","(X<X|any>)|any");
	}
	@Test public void test_688() {
		checkNotSubtype("[int]","X<X|(Y<Y|any>)>");
	}
	@Test public void test_689() {
		checkNotSubtype("[int]","(X<X|null>)|null");
	}
	@Test public void test_690() {
		checkNotSubtype("[int]","X<X|(Y<Y|null>)>");
	}
	@Test public void test_691() {
		checkNotSubtype("[int]","(X<X|int>)|int");
	}
	@Test public void test_692() {
		checkNotSubtype("[int]","X<X|(Y<Y|int>)>");
	}
	@Test public void test_693() {
		checkNotSubtype("[int]","(X<X|Y<[Y]>>)|Y<[Y]>");
	}
	@Test public void test_694() {
		checkNotSubtype("[int]","X<X|(Y<Y|Z<[Z]>>)>");
	}
	@Test public void test_695() {
		checkNotSubtype("[int]","X<X|(Y<Y|[X]>)>");
	}
	@Test public void test_696() {
		checkIsSubtype("[int]","X<X|(Y<Y|(Z<X|Z>)>)>");
	}
	@Test public void test_697() {
		checkNotSubtype("[X<[X]>]","any");
	}
	@Test public void test_698() {
		checkNotSubtype("[X<[X]>]","null");
	}
	@Test public void test_699() {
		checkNotSubtype("[X<[X]>]","int");
	}
	@Test public void test_700() {
		checkIsSubtype("[X<[X]>]","X<[X]>");
	}
	@Test public void test_701() {
		checkIsSubtype("[X<[X]>]","[void]");
	}
	@Test public void test_702() {
		checkNotSubtype("[X<[X]>]","[any]");
	}
	@Test public void test_703() {
		checkNotSubtype("[X<[X]>]","[null]");
	}
	@Test public void test_704() {
		checkNotSubtype("[X<[X]>]","[int]");
	}
	@Test public void test_705() {
		checkIsSubtype("[X<[X]>]","[X<[X]>]");
	}
	@Test public void test_706() {
		checkIsSubtype("[X<[X]>]","X<X|void>");
	}
	@Test public void test_707() {
		checkNotSubtype("[X<[X]>]","X<X|any>");
	}
	@Test public void test_708() {
		checkNotSubtype("[X<[X]>]","X<X|null>");
	}
	@Test public void test_709() {
		checkNotSubtype("[X<[X]>]","X<X|int>");
	}
	@Test public void test_710() {
		checkIsSubtype("[X<[X]>]","X<X|Y<[Y]>>");
	}
	@Test public void test_711() {
		checkIsSubtype("[X<[X]>]","[[void]]");
	}
	@Test public void test_712() {
		checkNotSubtype("[X<[X]>]","[[any]]");
	}
	@Test public void test_713() {
		checkNotSubtype("[X<[X]>]","[[null]]");
	}
	@Test public void test_714() {
		checkNotSubtype("[X<[X]>]","[[int]]");
	}
	@Test public void test_715() {
		checkIsSubtype("[X<[X]>]","[[X<[X]>]]");
	}
	@Test public void test_716() {
		checkIsSubtype("[X<[X]>]","X<[[[X]]]>");
	}
	@Test public void test_717() {
		checkIsSubtype("[X<[X]>]","X<[[Y<X|Y>]]>");
	}
	@Test public void test_718() {
		checkIsSubtype("[X<[X]>]","[X<X|void>]");
	}
	@Test public void test_719() {
		checkNotSubtype("[X<[X]>]","[X<X|any>]");
	}
	@Test public void test_720() {
		checkNotSubtype("[X<[X]>]","[X<X|null>]");
	}
	@Test public void test_721() {
		checkNotSubtype("[X<[X]>]","[X<X|int>]");
	}
	@Test public void test_722() {
		checkIsSubtype("[X<[X]>]","[X<X|Y<[Y]>>]");
	}
	@Test public void test_723() {
		checkIsSubtype("[X<[X]>]","X<[Y<Y|[X]>]>");
	}
	@Test public void test_724() {
		checkIsSubtype("[X<[X]>]","X<[Y<Y|(Z<X|Z>)>]>");
	}
	@Test public void test_725() {
		checkIsSubtype("[X<[X]>]","void|void");
	}
	@Test public void test_726() {
		checkNotSubtype("[X<[X]>]","void|any");
	}
	@Test public void test_727() {
		checkNotSubtype("[X<[X]>]","void|null");
	}
	@Test public void test_728() {
		checkNotSubtype("[X<[X]>]","void|int");
	}
	@Test public void test_729() {
		checkIsSubtype("[X<[X]>]","void|X<[X]>");
	}
	@Test public void test_730() {
		checkIsSubtype("[X<[X]>]","void|[void]");
	}
	@Test public void test_731() {
		checkIsSubtype("[X<[X]>]","void|(X<void|X>)");
	}
	@Test public void test_732() {
		checkNotSubtype("[X<[X]>]","any|void");
	}
	@Test public void test_733() {
		checkNotSubtype("[X<[X]>]","any|any");
	}
	@Test public void test_734() {
		checkNotSubtype("[X<[X]>]","any|null");
	}
	@Test public void test_735() {
		checkNotSubtype("[X<[X]>]","any|int");
	}
	@Test public void test_736() {
		checkNotSubtype("[X<[X]>]","any|X<[X]>");
	}
	@Test public void test_737() {
		checkNotSubtype("[X<[X]>]","any|[any]");
	}
	@Test public void test_738() {
		checkNotSubtype("[X<[X]>]","any|(X<any|X>)");
	}
	@Test public void test_739() {
		checkNotSubtype("[X<[X]>]","null|void");
	}
	@Test public void test_740() {
		checkNotSubtype("[X<[X]>]","null|any");
	}
	@Test public void test_741() {
		checkNotSubtype("[X<[X]>]","null|null");
	}
	@Test public void test_742() {
		checkNotSubtype("[X<[X]>]","null|int");
	}
	@Test public void test_743() {
		checkNotSubtype("[X<[X]>]","null|X<[X]>");
	}
	@Test public void test_744() {
		checkNotSubtype("[X<[X]>]","null|[null]");
	}
	@Test public void test_745() {
		checkNotSubtype("[X<[X]>]","null|(X<null|X>)");
	}
	@Test public void test_746() {
		checkNotSubtype("[X<[X]>]","int|void");
	}
	@Test public void test_747() {
		checkNotSubtype("[X<[X]>]","int|any");
	}
	@Test public void test_748() {
		checkNotSubtype("[X<[X]>]","int|null");
	}
	@Test public void test_749() {
		checkNotSubtype("[X<[X]>]","int|int");
	}
	@Test public void test_750() {
		checkNotSubtype("[X<[X]>]","int|X<[X]>");
	}
	@Test public void test_751() {
		checkNotSubtype("[X<[X]>]","int|[int]");
	}
	@Test public void test_752() {
		checkNotSubtype("[X<[X]>]","int|(X<int|X>)");
	}
	@Test public void test_753() {
		checkIsSubtype("[X<[X]>]","[void]|void");
	}
	@Test public void test_754() {
		checkIsSubtype("[X<[X]>]","X<[X]>|void");
	}
	@Test public void test_755() {
		checkIsSubtype("[X<[X]>]","X<X|[void]>");
	}
	@Test public void test_756() {
		checkNotSubtype("[X<[X]>]","[any]|any");
	}
	@Test public void test_757() {
		checkNotSubtype("[X<[X]>]","X<[X]>|any");
	}
	@Test public void test_758() {
		checkNotSubtype("[X<[X]>]","X<X|[any]>");
	}
	@Test public void test_759() {
		checkNotSubtype("[X<[X]>]","[null]|null");
	}
	@Test public void test_760() {
		checkNotSubtype("[X<[X]>]","X<[X]>|null");
	}
	@Test public void test_761() {
		checkNotSubtype("[X<[X]>]","X<X|[null]>");
	}
	@Test public void test_762() {
		checkNotSubtype("[X<[X]>]","[int]|int");
	}
	@Test public void test_763() {
		checkNotSubtype("[X<[X]>]","X<[X]>|int");
	}
	@Test public void test_764() {
		checkNotSubtype("[X<[X]>]","X<X|[int]>");
	}
	@Test public void test_765() {
		checkIsSubtype("[X<[X]>]","[X<[X]>]|X<[X]>");
	}
	@Test public void test_766() {
		checkIsSubtype("[X<[X]>]","X<[X]>|Y<[Y]>");
	}
	@Test public void test_767() {
		checkIsSubtype("[X<[X]>]","X<[X]>|[X<[X]>]");
	}
	@Test public void test_768() {
		checkIsSubtype("[X<[X]>]","X<X|[Y<[Y]>]>");
	}
	@Test public void test_769() {
		checkIsSubtype("[X<[X]>]","X<X|[[X]]>");
	}
	@Test public void test_770() {
		checkIsSubtype("[X<[X]>]","X<[X]>|(Y<X<[X]>|Y>)");
	}
	@Test public void test_771() {
		checkIsSubtype("[X<[X]>]","X<X|[Y<X|Y>]>");
	}
	@Test public void test_772() {
		checkIsSubtype("[X<[X]>]","(X<X|void>)|void");
	}
	@Test public void test_773() {
		checkIsSubtype("[X<[X]>]","X<X|(Y<Y|void>)>");
	}
	@Test public void test_774() {
		checkNotSubtype("[X<[X]>]","(X<X|any>)|any");
	}
	@Test public void test_775() {
		checkNotSubtype("[X<[X]>]","X<X|(Y<Y|any>)>");
	}
	@Test public void test_776() {
		checkNotSubtype("[X<[X]>]","(X<X|null>)|null");
	}
	@Test public void test_777() {
		checkNotSubtype("[X<[X]>]","X<X|(Y<Y|null>)>");
	}
	@Test public void test_778() {
		checkNotSubtype("[X<[X]>]","(X<X|int>)|int");
	}
	@Test public void test_779() {
		checkNotSubtype("[X<[X]>]","X<X|(Y<Y|int>)>");
	}
	@Test public void test_780() {
		checkIsSubtype("[X<[X]>]","(X<X|Y<[Y]>>)|Y<[Y]>");
	}
	@Test public void test_781() {
		checkIsSubtype("[X<[X]>]","X<X|(Y<Y|Z<[Z]>>)>");
	}
	@Test public void test_782() {
		checkIsSubtype("[X<[X]>]","X<X|(Y<Y|[X]>)>");
	}
	@Test public void test_783() {
		checkIsSubtype("[X<[X]>]","X<X|(Y<Y|(Z<X|Z>)>)>");
	}
	@Test public void test_784() {
		checkNotSubtype("X<X|void>","any");
	}
	@Test public void test_785() {
		checkNotSubtype("X<X|void>","null");
	}
	@Test public void test_786() {
		checkNotSubtype("X<X|void>","int");
	}
	@Test public void test_787() {
		checkNotSubtype("X<X|void>","X<[X]>");
	}
	@Test public void test_788() {
		checkNotSubtype("X<X|void>","[void]");
	}
	@Test public void test_789() {
		checkNotSubtype("X<X|void>","[any]");
	}
	@Test public void test_790() {
		checkNotSubtype("X<X|void>","[null]");
	}
	@Test public void test_791() {
		checkNotSubtype("X<X|void>","[int]");
	}
	@Test public void test_792() {
		checkNotSubtype("X<X|void>","[X<[X]>]");
	}
	@Test public void test_793() {
		checkIsSubtype("X<X|void>","X<X|void>");
	}
	@Test public void test_794() {
		checkNotSubtype("X<X|void>","X<X|any>");
	}
	@Test public void test_795() {
		checkNotSubtype("X<X|void>","X<X|null>");
	}
	@Test public void test_796() {
		checkNotSubtype("X<X|void>","X<X|int>");
	}
	@Test public void test_797() {
		checkNotSubtype("X<X|void>","X<X|Y<[Y]>>");
	}
	@Test public void test_798() {
		checkNotSubtype("X<X|void>","[[void]]");
	}
	@Test public void test_799() {
		checkNotSubtype("X<X|void>","[[any]]");
	}
	@Test public void test_800() {
		checkNotSubtype("X<X|void>","[[null]]");
	}
	@Test public void test_801() {
		checkNotSubtype("X<X|void>","[[int]]");
	}
	@Test public void test_802() {
		checkNotSubtype("X<X|void>","[[X<[X]>]]");
	}
	@Test public void test_803() {
		checkNotSubtype("X<X|void>","X<[[[X]]]>");
	}
	@Test public void test_804() {
		checkNotSubtype("X<X|void>","X<[[Y<X|Y>]]>");
	}
	@Test public void test_805() {
		checkNotSubtype("X<X|void>","[X<X|void>]");
	}
	@Test public void test_806() {
		checkNotSubtype("X<X|void>","[X<X|any>]");
	}
	@Test public void test_807() {
		checkNotSubtype("X<X|void>","[X<X|null>]");
	}
	@Test public void test_808() {
		checkNotSubtype("X<X|void>","[X<X|int>]");
	}
	@Test public void test_809() {
		checkNotSubtype("X<X|void>","[X<X|Y<[Y]>>]");
	}
	@Test public void test_810() {
		checkNotSubtype("X<X|void>","X<[Y<Y|[X]>]>");
	}
	@Test public void test_811() {
		checkNotSubtype("X<X|void>","X<[Y<Y|(Z<X|Z>)>]>");
	}
	@Test public void test_812() {
		checkIsSubtype("X<X|void>","void|void");
	}
	@Test public void test_813() {
		checkNotSubtype("X<X|void>","void|any");
	}
	@Test public void test_814() {
		checkNotSubtype("X<X|void>","void|null");
	}
	@Test public void test_815() {
		checkNotSubtype("X<X|void>","void|int");
	}
	@Test public void test_816() {
		checkNotSubtype("X<X|void>","void|X<[X]>");
	}
	@Test public void test_817() {
		checkNotSubtype("X<X|void>","void|[void]");
	}
	@Test public void test_818() {
		checkIsSubtype("X<X|void>","void|(X<void|X>)");
	}
	@Test public void test_819() {
		checkNotSubtype("X<X|void>","any|void");
	}
	@Test public void test_820() {
		checkNotSubtype("X<X|void>","any|any");
	}
	@Test public void test_821() {
		checkNotSubtype("X<X|void>","any|null");
	}
	@Test public void test_822() {
		checkNotSubtype("X<X|void>","any|int");
	}
	@Test public void test_823() {
		checkNotSubtype("X<X|void>","any|X<[X]>");
	}
	@Test public void test_824() {
		checkNotSubtype("X<X|void>","any|[any]");
	}
	@Test public void test_825() {
		checkNotSubtype("X<X|void>","any|(X<any|X>)");
	}
	@Test public void test_826() {
		checkNotSubtype("X<X|void>","null|void");
	}
	@Test public void test_827() {
		checkNotSubtype("X<X|void>","null|any");
	}
	@Test public void test_828() {
		checkNotSubtype("X<X|void>","null|null");
	}
	@Test public void test_829() {
		checkNotSubtype("X<X|void>","null|int");
	}
	@Test public void test_830() {
		checkNotSubtype("X<X|void>","null|X<[X]>");
	}
	@Test public void test_831() {
		checkNotSubtype("X<X|void>","null|[null]");
	}
	@Test public void test_832() {
		checkNotSubtype("X<X|void>","null|(X<null|X>)");
	}
	@Test public void test_833() {
		checkNotSubtype("X<X|void>","int|void");
	}
	@Test public void test_834() {
		checkNotSubtype("X<X|void>","int|any");
	}
	@Test public void test_835() {
		checkNotSubtype("X<X|void>","int|null");
	}
	@Test public void test_836() {
		checkNotSubtype("X<X|void>","int|int");
	}
	@Test public void test_837() {
		checkNotSubtype("X<X|void>","int|X<[X]>");
	}
	@Test public void test_838() {
		checkNotSubtype("X<X|void>","int|[int]");
	}
	@Test public void test_839() {
		checkNotSubtype("X<X|void>","int|(X<int|X>)");
	}
	@Test public void test_840() {
		checkNotSubtype("X<X|void>","[void]|void");
	}
	@Test public void test_841() {
		checkNotSubtype("X<X|void>","X<[X]>|void");
	}
	@Test public void test_842() {
		checkNotSubtype("X<X|void>","X<X|[void]>");
	}
	@Test public void test_843() {
		checkNotSubtype("X<X|void>","[any]|any");
	}
	@Test public void test_844() {
		checkNotSubtype("X<X|void>","X<[X]>|any");
	}
	@Test public void test_845() {
		checkNotSubtype("X<X|void>","X<X|[any]>");
	}
	@Test public void test_846() {
		checkNotSubtype("X<X|void>","[null]|null");
	}
	@Test public void test_847() {
		checkNotSubtype("X<X|void>","X<[X]>|null");
	}
	@Test public void test_848() {
		checkNotSubtype("X<X|void>","X<X|[null]>");
	}
	@Test public void test_849() {
		checkNotSubtype("X<X|void>","[int]|int");
	}
	@Test public void test_850() {
		checkNotSubtype("X<X|void>","X<[X]>|int");
	}
	@Test public void test_851() {
		checkNotSubtype("X<X|void>","X<X|[int]>");
	}
	@Test public void test_852() {
		checkNotSubtype("X<X|void>","[X<[X]>]|X<[X]>");
	}
	@Test public void test_853() {
		checkNotSubtype("X<X|void>","X<[X]>|Y<[Y]>");
	}
	@Test public void test_854() {
		checkNotSubtype("X<X|void>","X<[X]>|[X<[X]>]");
	}
	@Test public void test_855() {
		checkNotSubtype("X<X|void>","X<X|[Y<[Y]>]>");
	}
	@Test public void test_856() {
		checkNotSubtype("X<X|void>","X<X|[[X]]>");
	}
	@Test public void test_857() {
		checkNotSubtype("X<X|void>","X<[X]>|(Y<X<[X]>|Y>)");
	}
	@Test public void test_858() {
		checkNotSubtype("X<X|void>","X<X|[Y<X|Y>]>");
	}
	@Test public void test_859() {
		checkIsSubtype("X<X|void>","(X<X|void>)|void");
	}
	@Test public void test_860() {
		checkIsSubtype("X<X|void>","X<X|(Y<Y|void>)>");
	}
	@Test public void test_861() {
		checkNotSubtype("X<X|void>","(X<X|any>)|any");
	}
	@Test public void test_862() {
		checkNotSubtype("X<X|void>","X<X|(Y<Y|any>)>");
	}
	@Test public void test_863() {
		checkNotSubtype("X<X|void>","(X<X|null>)|null");
	}
	@Test public void test_864() {
		checkNotSubtype("X<X|void>","X<X|(Y<Y|null>)>");
	}
	@Test public void test_865() {
		checkNotSubtype("X<X|void>","(X<X|int>)|int");
	}
	@Test public void test_866() {
		checkNotSubtype("X<X|void>","X<X|(Y<Y|int>)>");
	}
	@Test public void test_867() {
		checkNotSubtype("X<X|void>","(X<X|Y<[Y]>>)|Y<[Y]>");
	}
	@Test public void test_868() {
		checkNotSubtype("X<X|void>","X<X|(Y<Y|Z<[Z]>>)>");
	}
	@Test public void test_869() {
		checkNotSubtype("X<X|void>","X<X|(Y<Y|[X]>)>");
	}
	@Test public void test_870() {
		checkIsSubtype("X<X|void>","X<X|(Y<Y|(Z<X|Z>)>)>");
	}
	@Test public void test_871() {
		checkIsSubtype("X<X|any>","any");
	}
	@Test public void test_872() {
		checkIsSubtype("X<X|any>","null");
	}
	@Test public void test_873() {
		checkIsSubtype("X<X|any>","int");
	}
	@Test public void test_874() {
		checkIsSubtype("X<X|any>","X<[X]>");
	}
	@Test public void test_875() {
		checkIsSubtype("X<X|any>","[void]");
	}
	@Test public void test_876() {
		checkIsSubtype("X<X|any>","[any]");
	}
	@Test public void test_877() {
		checkIsSubtype("X<X|any>","[null]");
	}
	@Test public void test_878() {
		checkIsSubtype("X<X|any>","[int]");
	}
	@Test public void test_879() {
		checkIsSubtype("X<X|any>","[X<[X]>]");
	}
	@Test public void test_880() {
		checkIsSubtype("X<X|any>","X<X|void>");
	}
	@Test public void test_881() {
		checkIsSubtype("X<X|any>","X<X|any>");
	}
	@Test public void test_882() {
		checkIsSubtype("X<X|any>","X<X|null>");
	}
	@Test public void test_883() {
		checkIsSubtype("X<X|any>","X<X|int>");
	}
	@Test public void test_884() {
		checkIsSubtype("X<X|any>","X<X|Y<[Y]>>");
	}
	@Test public void test_885() {
		checkIsSubtype("X<X|any>","[[void]]");
	}
	@Test public void test_886() {
		checkIsSubtype("X<X|any>","[[any]]");
	}
	@Test public void test_887() {
		checkIsSubtype("X<X|any>","[[null]]");
	}
	@Test public void test_888() {
		checkIsSubtype("X<X|any>","[[int]]");
	}
	@Test public void test_889() {
		checkIsSubtype("X<X|any>","[[X<[X]>]]");
	}
	@Test public void test_890() {
		checkIsSubtype("X<X|any>","X<[[[X]]]>");
	}
	@Test public void test_891() {
		checkIsSubtype("X<X|any>","X<[[Y<X|Y>]]>");
	}
	@Test public void test_892() {
		checkIsSubtype("X<X|any>","[X<X|void>]");
	}
	@Test public void test_893() {
		checkIsSubtype("X<X|any>","[X<X|any>]");
	}
	@Test public void test_894() {
		checkIsSubtype("X<X|any>","[X<X|null>]");
	}
	@Test public void test_895() {
		checkIsSubtype("X<X|any>","[X<X|int>]");
	}
	@Test public void test_896() {
		checkIsSubtype("X<X|any>","[X<X|Y<[Y]>>]");
	}
	@Test public void test_897() {
		checkIsSubtype("X<X|any>","X<[Y<Y|[X]>]>");
	}
	@Test public void test_898() {
		checkIsSubtype("X<X|any>","X<[Y<Y|(Z<X|Z>)>]>");
	}
	@Test public void test_899() {
		checkIsSubtype("X<X|any>","void|void");
	}
	@Test public void test_900() {
		checkIsSubtype("X<X|any>","void|any");
	}
	@Test public void test_901() {
		checkIsSubtype("X<X|any>","void|null");
	}
	@Test public void test_902() {
		checkIsSubtype("X<X|any>","void|int");
	}
	@Test public void test_903() {
		checkIsSubtype("X<X|any>","void|X<[X]>");
	}
	@Test public void test_904() {
		checkIsSubtype("X<X|any>","void|[void]");
	}
	@Test public void test_905() {
		checkIsSubtype("X<X|any>","void|(X<void|X>)");
	}
	@Test public void test_906() {
		checkIsSubtype("X<X|any>","any|void");
	}
	@Test public void test_907() {
		checkIsSubtype("X<X|any>","any|any");
	}
	@Test public void test_908() {
		checkIsSubtype("X<X|any>","any|null");
	}
	@Test public void test_909() {
		checkIsSubtype("X<X|any>","any|int");
	}
	@Test public void test_910() {
		checkIsSubtype("X<X|any>","any|X<[X]>");
	}
	@Test public void test_911() {
		checkIsSubtype("X<X|any>","any|[any]");
	}
	@Test public void test_912() {
		checkIsSubtype("X<X|any>","any|(X<any|X>)");
	}
	@Test public void test_913() {
		checkIsSubtype("X<X|any>","null|void");
	}
	@Test public void test_914() {
		checkIsSubtype("X<X|any>","null|any");
	}
	@Test public void test_915() {
		checkIsSubtype("X<X|any>","null|null");
	}
	@Test public void test_916() {
		checkIsSubtype("X<X|any>","null|int");
	}
	@Test public void test_917() {
		checkIsSubtype("X<X|any>","null|X<[X]>");
	}
	@Test public void test_918() {
		checkIsSubtype("X<X|any>","null|[null]");
	}
	@Test public void test_919() {
		checkIsSubtype("X<X|any>","null|(X<null|X>)");
	}
	@Test public void test_920() {
		checkIsSubtype("X<X|any>","int|void");
	}
	@Test public void test_921() {
		checkIsSubtype("X<X|any>","int|any");
	}
	@Test public void test_922() {
		checkIsSubtype("X<X|any>","int|null");
	}
	@Test public void test_923() {
		checkIsSubtype("X<X|any>","int|int");
	}
	@Test public void test_924() {
		checkIsSubtype("X<X|any>","int|X<[X]>");
	}
	@Test public void test_925() {
		checkIsSubtype("X<X|any>","int|[int]");
	}
	@Test public void test_926() {
		checkIsSubtype("X<X|any>","int|(X<int|X>)");
	}
	@Test public void test_927() {
		checkIsSubtype("X<X|any>","[void]|void");
	}
	@Test public void test_928() {
		checkIsSubtype("X<X|any>","X<[X]>|void");
	}
	@Test public void test_929() {
		checkIsSubtype("X<X|any>","X<X|[void]>");
	}
	@Test public void test_930() {
		checkIsSubtype("X<X|any>","[any]|any");
	}
	@Test public void test_931() {
		checkIsSubtype("X<X|any>","X<[X]>|any");
	}
	@Test public void test_932() {
		checkIsSubtype("X<X|any>","X<X|[any]>");
	}
	@Test public void test_933() {
		checkIsSubtype("X<X|any>","[null]|null");
	}
	@Test public void test_934() {
		checkIsSubtype("X<X|any>","X<[X]>|null");
	}
	@Test public void test_935() {
		checkIsSubtype("X<X|any>","X<X|[null]>");
	}
	@Test public void test_936() {
		checkIsSubtype("X<X|any>","[int]|int");
	}
	@Test public void test_937() {
		checkIsSubtype("X<X|any>","X<[X]>|int");
	}
	@Test public void test_938() {
		checkIsSubtype("X<X|any>","X<X|[int]>");
	}
	@Test public void test_939() {
		checkIsSubtype("X<X|any>","[X<[X]>]|X<[X]>");
	}
	@Test public void test_940() {
		checkIsSubtype("X<X|any>","X<[X]>|Y<[Y]>");
	}
	@Test public void test_941() {
		checkIsSubtype("X<X|any>","X<[X]>|[X<[X]>]");
	}
	@Test public void test_942() {
		checkIsSubtype("X<X|any>","X<X|[Y<[Y]>]>");
	}
	@Test public void test_943() {
		checkIsSubtype("X<X|any>","X<X|[[X]]>");
	}
	@Test public void test_944() {
		checkIsSubtype("X<X|any>","X<[X]>|(Y<X<[X]>|Y>)");
	}
	@Test public void test_945() {
		checkIsSubtype("X<X|any>","X<X|[Y<X|Y>]>");
	}
	@Test public void test_946() {
		checkIsSubtype("X<X|any>","(X<X|void>)|void");
	}
	@Test public void test_947() {
		checkIsSubtype("X<X|any>","X<X|(Y<Y|void>)>");
	}
	@Test public void test_948() {
		checkIsSubtype("X<X|any>","(X<X|any>)|any");
	}
	@Test public void test_949() {
		checkIsSubtype("X<X|any>","X<X|(Y<Y|any>)>");
	}
	@Test public void test_950() {
		checkIsSubtype("X<X|any>","(X<X|null>)|null");
	}
	@Test public void test_951() {
		checkIsSubtype("X<X|any>","X<X|(Y<Y|null>)>");
	}
	@Test public void test_952() {
		checkIsSubtype("X<X|any>","(X<X|int>)|int");
	}
	@Test public void test_953() {
		checkIsSubtype("X<X|any>","X<X|(Y<Y|int>)>");
	}
	@Test public void test_954() {
		checkIsSubtype("X<X|any>","(X<X|Y<[Y]>>)|Y<[Y]>");
	}
	@Test public void test_955() {
		checkIsSubtype("X<X|any>","X<X|(Y<Y|Z<[Z]>>)>");
	}
	@Test public void test_956() {
		checkIsSubtype("X<X|any>","X<X|(Y<Y|[X]>)>");
	}
	@Test public void test_957() {
		checkIsSubtype("X<X|any>","X<X|(Y<Y|(Z<X|Z>)>)>");
	}
	@Test public void test_958() {
		checkNotSubtype("X<X|null>","any");
	}
	@Test public void test_959() {
		checkIsSubtype("X<X|null>","null");
	}
	@Test public void test_960() {
		checkNotSubtype("X<X|null>","int");
	}
	@Test public void test_961() {
		checkNotSubtype("X<X|null>","X<[X]>");
	}
	@Test public void test_962() {
		checkNotSubtype("X<X|null>","[void]");
	}
	@Test public void test_963() {
		checkNotSubtype("X<X|null>","[any]");
	}
	@Test public void test_964() {
		checkNotSubtype("X<X|null>","[null]");
	}
	@Test public void test_965() {
		checkNotSubtype("X<X|null>","[int]");
	}
	@Test public void test_966() {
		checkNotSubtype("X<X|null>","[X<[X]>]");
	}
	@Test public void test_967() {
		checkIsSubtype("X<X|null>","X<X|void>");
	}
	@Test public void test_968() {
		checkNotSubtype("X<X|null>","X<X|any>");
	}
	@Test public void test_969() {
		checkIsSubtype("X<X|null>","X<X|null>");
	}
	@Test public void test_970() {
		checkNotSubtype("X<X|null>","X<X|int>");
	}
	@Test public void test_971() {
		checkNotSubtype("X<X|null>","X<X|Y<[Y]>>");
	}
	@Test public void test_972() {
		checkNotSubtype("X<X|null>","[[void]]");
	}
	@Test public void test_973() {
		checkNotSubtype("X<X|null>","[[any]]");
	}
	@Test public void test_974() {
		checkNotSubtype("X<X|null>","[[null]]");
	}
	@Test public void test_975() {
		checkNotSubtype("X<X|null>","[[int]]");
	}
	@Test public void test_976() {
		checkNotSubtype("X<X|null>","[[X<[X]>]]");
	}
	@Test public void test_977() {
		checkNotSubtype("X<X|null>","X<[[[X]]]>");
	}
	@Test public void test_978() {
		checkNotSubtype("X<X|null>","X<[[Y<X|Y>]]>");
	}
	@Test public void test_979() {
		checkNotSubtype("X<X|null>","[X<X|void>]");
	}
	@Test public void test_980() {
		checkNotSubtype("X<X|null>","[X<X|any>]");
	}
	@Test public void test_981() {
		checkNotSubtype("X<X|null>","[X<X|null>]");
	}
	@Test public void test_982() {
		checkNotSubtype("X<X|null>","[X<X|int>]");
	}
	@Test public void test_983() {
		checkNotSubtype("X<X|null>","[X<X|Y<[Y]>>]");
	}
	@Test public void test_984() {
		checkNotSubtype("X<X|null>","X<[Y<Y|[X]>]>");
	}
	@Test public void test_985() {
		checkNotSubtype("X<X|null>","X<[Y<Y|(Z<X|Z>)>]>");
	}
	@Test public void test_986() {
		checkIsSubtype("X<X|null>","void|void");
	}
	@Test public void test_987() {
		checkNotSubtype("X<X|null>","void|any");
	}
	@Test public void test_988() {
		checkIsSubtype("X<X|null>","void|null");
	}
	@Test public void test_989() {
		checkNotSubtype("X<X|null>","void|int");
	}
	@Test public void test_990() {
		checkNotSubtype("X<X|null>","void|X<[X]>");
	}
	@Test public void test_991() {
		checkNotSubtype("X<X|null>","void|[void]");
	}
	@Test public void test_992() {
		checkIsSubtype("X<X|null>","void|(X<void|X>)");
	}
	@Test public void test_993() {
		checkNotSubtype("X<X|null>","any|void");
	}
	@Test public void test_994() {
		checkNotSubtype("X<X|null>","any|any");
	}
	@Test public void test_995() {
		checkNotSubtype("X<X|null>","any|null");
	}
	@Test public void test_996() {
		checkNotSubtype("X<X|null>","any|int");
	}
	@Test public void test_997() {
		checkNotSubtype("X<X|null>","any|X<[X]>");
	}
	@Test public void test_998() {
		checkNotSubtype("X<X|null>","any|[any]");
	}
	@Test public void test_999() {
		checkNotSubtype("X<X|null>","any|(X<any|X>)");
	}
	@Test public void test_1000() {
		checkIsSubtype("X<X|null>","null|void");
	}
	@Test public void test_1001() {
		checkNotSubtype("X<X|null>","null|any");
	}
	@Test public void test_1002() {
		checkIsSubtype("X<X|null>","null|null");
	}
	@Test public void test_1003() {
		checkNotSubtype("X<X|null>","null|int");
	}
	@Test public void test_1004() {
		checkNotSubtype("X<X|null>","null|X<[X]>");
	}
	@Test public void test_1005() {
		checkNotSubtype("X<X|null>","null|[null]");
	}
	@Test public void test_1006() {
		checkIsSubtype("X<X|null>","null|(X<null|X>)");
	}
	@Test public void test_1007() {
		checkNotSubtype("X<X|null>","int|void");
	}
	@Test public void test_1008() {
		checkNotSubtype("X<X|null>","int|any");
	}
	@Test public void test_1009() {
		checkNotSubtype("X<X|null>","int|null");
	}
	@Test public void test_1010() {
		checkNotSubtype("X<X|null>","int|int");
	}
	@Test public void test_1011() {
		checkNotSubtype("X<X|null>","int|X<[X]>");
	}
	@Test public void test_1012() {
		checkNotSubtype("X<X|null>","int|[int]");
	}
	@Test public void test_1013() {
		checkNotSubtype("X<X|null>","int|(X<int|X>)");
	}
	@Test public void test_1014() {
		checkNotSubtype("X<X|null>","[void]|void");
	}
	@Test public void test_1015() {
		checkNotSubtype("X<X|null>","X<[X]>|void");
	}
	@Test public void test_1016() {
		checkNotSubtype("X<X|null>","X<X|[void]>");
	}
	@Test public void test_1017() {
		checkNotSubtype("X<X|null>","[any]|any");
	}
	@Test public void test_1018() {
		checkNotSubtype("X<X|null>","X<[X]>|any");
	}
	@Test public void test_1019() {
		checkNotSubtype("X<X|null>","X<X|[any]>");
	}
	@Test public void test_1020() {
		checkNotSubtype("X<X|null>","[null]|null");
	}
	@Test public void test_1021() {
		checkNotSubtype("X<X|null>","X<[X]>|null");
	}
	@Test public void test_1022() {
		checkNotSubtype("X<X|null>","X<X|[null]>");
	}
	@Test public void test_1023() {
		checkNotSubtype("X<X|null>","[int]|int");
	}
	@Test public void test_1024() {
		checkNotSubtype("X<X|null>","X<[X]>|int");
	}
	@Test public void test_1025() {
		checkNotSubtype("X<X|null>","X<X|[int]>");
	}
	@Test public void test_1026() {
		checkNotSubtype("X<X|null>","[X<[X]>]|X<[X]>");
	}
	@Test public void test_1027() {
		checkNotSubtype("X<X|null>","X<[X]>|Y<[Y]>");
	}
	@Test public void test_1028() {
		checkNotSubtype("X<X|null>","X<[X]>|[X<[X]>]");
	}
	@Test public void test_1029() {
		checkNotSubtype("X<X|null>","X<X|[Y<[Y]>]>");
	}
	@Test public void test_1030() {
		checkNotSubtype("X<X|null>","X<X|[[X]]>");
	}
	@Test public void test_1031() {
		checkNotSubtype("X<X|null>","X<[X]>|(Y<X<[X]>|Y>)");
	}
	@Test public void test_1032() {
		checkNotSubtype("X<X|null>","X<X|[Y<X|Y>]>");
	}
	@Test public void test_1033() {
		checkIsSubtype("X<X|null>","(X<X|void>)|void");
	}
	@Test public void test_1034() {
		checkIsSubtype("X<X|null>","X<X|(Y<Y|void>)>");
	}
	@Test public void test_1035() {
		checkNotSubtype("X<X|null>","(X<X|any>)|any");
	}
	@Test public void test_1036() {
		checkNotSubtype("X<X|null>","X<X|(Y<Y|any>)>");
	}
	@Test public void test_1037() {
		checkIsSubtype("X<X|null>","(X<X|null>)|null");
	}
	@Test public void test_1038() {
		checkIsSubtype("X<X|null>","X<X|(Y<Y|null>)>");
	}
	@Test public void test_1039() {
		checkNotSubtype("X<X|null>","(X<X|int>)|int");
	}
	@Test public void test_1040() {
		checkNotSubtype("X<X|null>","X<X|(Y<Y|int>)>");
	}
	@Test public void test_1041() {
		checkNotSubtype("X<X|null>","(X<X|Y<[Y]>>)|Y<[Y]>");
	}
	@Test public void test_1042() {
		checkNotSubtype("X<X|null>","X<X|(Y<Y|Z<[Z]>>)>");
	}
	@Test public void test_1043() {
		checkNotSubtype("X<X|null>","X<X|(Y<Y|[X]>)>");
	}
	@Test public void test_1044() {
		checkIsSubtype("X<X|null>","X<X|(Y<Y|(Z<X|Z>)>)>");
	}
	@Test public void test_1045() {
		checkNotSubtype("X<X|int>","any");
	}
	@Test public void test_1046() {
		checkNotSubtype("X<X|int>","null");
	}
	@Test public void test_1047() {
		checkIsSubtype("X<X|int>","int");
	}
	@Test public void test_1048() {
		checkNotSubtype("X<X|int>","X<[X]>");
	}
	@Test public void test_1049() {
		checkNotSubtype("X<X|int>","[void]");
	}
	@Test public void test_1050() {
		checkNotSubtype("X<X|int>","[any]");
	}
	@Test public void test_1051() {
		checkNotSubtype("X<X|int>","[null]");
	}
	@Test public void test_1052() {
		checkNotSubtype("X<X|int>","[int]");
	}
	@Test public void test_1053() {
		checkNotSubtype("X<X|int>","[X<[X]>]");
	}
	@Test public void test_1054() {
		checkIsSubtype("X<X|int>","X<X|void>");
	}
	@Test public void test_1055() {
		checkNotSubtype("X<X|int>","X<X|any>");
	}
	@Test public void test_1056() {
		checkNotSubtype("X<X|int>","X<X|null>");
	}
	@Test public void test_1057() {
		checkIsSubtype("X<X|int>","X<X|int>");
	}
	@Test public void test_1058() {
		checkNotSubtype("X<X|int>","X<X|Y<[Y]>>");
	}
	@Test public void test_1059() {
		checkNotSubtype("X<X|int>","[[void]]");
	}
	@Test public void test_1060() {
		checkNotSubtype("X<X|int>","[[any]]");
	}
	@Test public void test_1061() {
		checkNotSubtype("X<X|int>","[[null]]");
	}
	@Test public void test_1062() {
		checkNotSubtype("X<X|int>","[[int]]");
	}
	@Test public void test_1063() {
		checkNotSubtype("X<X|int>","[[X<[X]>]]");
	}
	@Test public void test_1064() {
		checkNotSubtype("X<X|int>","X<[[[X]]]>");
	}
	@Test public void test_1065() {
		checkNotSubtype("X<X|int>","X<[[Y<X|Y>]]>");
	}
	@Test public void test_1066() {
		checkNotSubtype("X<X|int>","[X<X|void>]");
	}
	@Test public void test_1067() {
		checkNotSubtype("X<X|int>","[X<X|any>]");
	}
	@Test public void test_1068() {
		checkNotSubtype("X<X|int>","[X<X|null>]");
	}
	@Test public void test_1069() {
		checkNotSubtype("X<X|int>","[X<X|int>]");
	}
	@Test public void test_1070() {
		checkNotSubtype("X<X|int>","[X<X|Y<[Y]>>]");
	}
	@Test public void test_1071() {
		checkNotSubtype("X<X|int>","X<[Y<Y|[X]>]>");
	}
	@Test public void test_1072() {
		checkNotSubtype("X<X|int>","X<[Y<Y|(Z<X|Z>)>]>");
	}
	@Test public void test_1073() {
		checkIsSubtype("X<X|int>","void|void");
	}
	@Test public void test_1074() {
		checkNotSubtype("X<X|int>","void|any");
	}
	@Test public void test_1075() {
		checkNotSubtype("X<X|int>","void|null");
	}
	@Test public void test_1076() {
		checkIsSubtype("X<X|int>","void|int");
	}
	@Test public void test_1077() {
		checkNotSubtype("X<X|int>","void|X<[X]>");
	}
	@Test public void test_1078() {
		checkNotSubtype("X<X|int>","void|[void]");
	}
	@Test public void test_1079() {
		checkIsSubtype("X<X|int>","void|(X<void|X>)");
	}
	@Test public void test_1080() {
		checkNotSubtype("X<X|int>","any|void");
	}
	@Test public void test_1081() {
		checkNotSubtype("X<X|int>","any|any");
	}
	@Test public void test_1082() {
		checkNotSubtype("X<X|int>","any|null");
	}
	@Test public void test_1083() {
		checkNotSubtype("X<X|int>","any|int");
	}
	@Test public void test_1084() {
		checkNotSubtype("X<X|int>","any|X<[X]>");
	}
	@Test public void test_1085() {
		checkNotSubtype("X<X|int>","any|[any]");
	}
	@Test public void test_1086() {
		checkNotSubtype("X<X|int>","any|(X<any|X>)");
	}
	@Test public void test_1087() {
		checkNotSubtype("X<X|int>","null|void");
	}
	@Test public void test_1088() {
		checkNotSubtype("X<X|int>","null|any");
	}
	@Test public void test_1089() {
		checkNotSubtype("X<X|int>","null|null");
	}
	@Test public void test_1090() {
		checkNotSubtype("X<X|int>","null|int");
	}
	@Test public void test_1091() {
		checkNotSubtype("X<X|int>","null|X<[X]>");
	}
	@Test public void test_1092() {
		checkNotSubtype("X<X|int>","null|[null]");
	}
	@Test public void test_1093() {
		checkNotSubtype("X<X|int>","null|(X<null|X>)");
	}
	@Test public void test_1094() {
		checkIsSubtype("X<X|int>","int|void");
	}
	@Test public void test_1095() {
		checkNotSubtype("X<X|int>","int|any");
	}
	@Test public void test_1096() {
		checkNotSubtype("X<X|int>","int|null");
	}
	@Test public void test_1097() {
		checkIsSubtype("X<X|int>","int|int");
	}
	@Test public void test_1098() {
		checkNotSubtype("X<X|int>","int|X<[X]>");
	}
	@Test public void test_1099() {
		checkNotSubtype("X<X|int>","int|[int]");
	}
	@Test public void test_1100() {
		checkIsSubtype("X<X|int>","int|(X<int|X>)");
	}
	@Test public void test_1101() {
		checkNotSubtype("X<X|int>","[void]|void");
	}
	@Test public void test_1102() {
		checkNotSubtype("X<X|int>","X<[X]>|void");
	}
	@Test public void test_1103() {
		checkNotSubtype("X<X|int>","X<X|[void]>");
	}
	@Test public void test_1104() {
		checkNotSubtype("X<X|int>","[any]|any");
	}
	@Test public void test_1105() {
		checkNotSubtype("X<X|int>","X<[X]>|any");
	}
	@Test public void test_1106() {
		checkNotSubtype("X<X|int>","X<X|[any]>");
	}
	@Test public void test_1107() {
		checkNotSubtype("X<X|int>","[null]|null");
	}
	@Test public void test_1108() {
		checkNotSubtype("X<X|int>","X<[X]>|null");
	}
	@Test public void test_1109() {
		checkNotSubtype("X<X|int>","X<X|[null]>");
	}
	@Test public void test_1110() {
		checkNotSubtype("X<X|int>","[int]|int");
	}
	@Test public void test_1111() {
		checkNotSubtype("X<X|int>","X<[X]>|int");
	}
	@Test public void test_1112() {
		checkNotSubtype("X<X|int>","X<X|[int]>");
	}
	@Test public void test_1113() {
		checkNotSubtype("X<X|int>","[X<[X]>]|X<[X]>");
	}
	@Test public void test_1114() {
		checkNotSubtype("X<X|int>","X<[X]>|Y<[Y]>");
	}
	@Test public void test_1115() {
		checkNotSubtype("X<X|int>","X<[X]>|[X<[X]>]");
	}
	@Test public void test_1116() {
		checkNotSubtype("X<X|int>","X<X|[Y<[Y]>]>");
	}
	@Test public void test_1117() {
		checkNotSubtype("X<X|int>","X<X|[[X]]>");
	}
	@Test public void test_1118() {
		checkNotSubtype("X<X|int>","X<[X]>|(Y<X<[X]>|Y>)");
	}
	@Test public void test_1119() {
		checkNotSubtype("X<X|int>","X<X|[Y<X|Y>]>");
	}
	@Test public void test_1120() {
		checkIsSubtype("X<X|int>","(X<X|void>)|void");
	}
	@Test public void test_1121() {
		checkIsSubtype("X<X|int>","X<X|(Y<Y|void>)>");
	}
	@Test public void test_1122() {
		checkNotSubtype("X<X|int>","(X<X|any>)|any");
	}
	@Test public void test_1123() {
		checkNotSubtype("X<X|int>","X<X|(Y<Y|any>)>");
	}
	@Test public void test_1124() {
		checkNotSubtype("X<X|int>","(X<X|null>)|null");
	}
	@Test public void test_1125() {
		checkNotSubtype("X<X|int>","X<X|(Y<Y|null>)>");
	}
	@Test public void test_1126() {
		checkIsSubtype("X<X|int>","(X<X|int>)|int");
	}
	@Test public void test_1127() {
		checkIsSubtype("X<X|int>","X<X|(Y<Y|int>)>");
	}
	@Test public void test_1128() {
		checkNotSubtype("X<X|int>","(X<X|Y<[Y]>>)|Y<[Y]>");
	}
	@Test public void test_1129() {
		checkNotSubtype("X<X|int>","X<X|(Y<Y|Z<[Z]>>)>");
	}
	@Test public void test_1130() {
		checkNotSubtype("X<X|int>","X<X|(Y<Y|[X]>)>");
	}
	@Test public void test_1131() {
		checkIsSubtype("X<X|int>","X<X|(Y<Y|(Z<X|Z>)>)>");
	}
	@Test public void test_1132() {
		checkNotSubtype("X<X|Y<[Y]>>","any");
	}
	@Test public void test_1133() {
		checkNotSubtype("X<X|Y<[Y]>>","null");
	}
	@Test public void test_1134() {
		checkNotSubtype("X<X|Y<[Y]>>","int");
	}
	@Test public void test_1135() {
		checkIsSubtype("X<X|Y<[Y]>>","X<[X]>");
	}
	@Test public void test_1136() {
		checkIsSubtype("X<X|Y<[Y]>>","[void]");
	}
	@Test public void test_1137() {
		checkNotSubtype("X<X|Y<[Y]>>","[any]");
	}
	@Test public void test_1138() {
		checkNotSubtype("X<X|Y<[Y]>>","[null]");
	}
	@Test public void test_1139() {
		checkNotSubtype("X<X|Y<[Y]>>","[int]");
	}
	@Test public void test_1140() {
		checkIsSubtype("X<X|Y<[Y]>>","[X<[X]>]");
	}
	@Test public void test_1141() {
		checkIsSubtype("X<X|Y<[Y]>>","X<X|void>");
	}
	@Test public void test_1142() {
		checkNotSubtype("X<X|Y<[Y]>>","X<X|any>");
	}
	@Test public void test_1143() {
		checkNotSubtype("X<X|Y<[Y]>>","X<X|null>");
	}
	@Test public void test_1144() {
		checkNotSubtype("X<X|Y<[Y]>>","X<X|int>");
	}
	@Test public void test_1145() {
		checkIsSubtype("X<X|Y<[Y]>>","X<X|Y<[Y]>>");
	}
	@Test public void test_1146() {
		checkIsSubtype("X<X|Y<[Y]>>","[[void]]");
	}
	@Test public void test_1147() {
		checkNotSubtype("X<X|Y<[Y]>>","[[any]]");
	}
	@Test public void test_1148() {
		checkNotSubtype("X<X|Y<[Y]>>","[[null]]");
	}
	@Test public void test_1149() {
		checkNotSubtype("X<X|Y<[Y]>>","[[int]]");
	}
	@Test public void test_1150() {
		checkIsSubtype("X<X|Y<[Y]>>","[[X<[X]>]]");
	}
	@Test public void test_1151() {
		checkIsSubtype("X<X|Y<[Y]>>","X<[[[X]]]>");
	}
	@Test public void test_1152() {
		checkIsSubtype("X<X|Y<[Y]>>","X<[[Y<X|Y>]]>");
	}
	@Test public void test_1153() {
		checkIsSubtype("X<X|Y<[Y]>>","[X<X|void>]");
	}
	@Test public void test_1154() {
		checkNotSubtype("X<X|Y<[Y]>>","[X<X|any>]");
	}
	@Test public void test_1155() {
		checkNotSubtype("X<X|Y<[Y]>>","[X<X|null>]");
	}
	@Test public void test_1156() {
		checkNotSubtype("X<X|Y<[Y]>>","[X<X|int>]");
	}
	@Test public void test_1157() {
		checkIsSubtype("X<X|Y<[Y]>>","[X<X|Y<[Y]>>]");
	}
	@Test public void test_1158() {
		checkIsSubtype("X<X|Y<[Y]>>","X<[Y<Y|[X]>]>");
	}
	@Test public void test_1159() {
		checkIsSubtype("X<X|Y<[Y]>>","X<[Y<Y|(Z<X|Z>)>]>");
	}
	@Test public void test_1160() {
		checkIsSubtype("X<X|Y<[Y]>>","void|void");
	}
	@Test public void test_1161() {
		checkNotSubtype("X<X|Y<[Y]>>","void|any");
	}
	@Test public void test_1162() {
		checkNotSubtype("X<X|Y<[Y]>>","void|null");
	}
	@Test public void test_1163() {
		checkNotSubtype("X<X|Y<[Y]>>","void|int");
	}
	@Test public void test_1164() {
		checkIsSubtype("X<X|Y<[Y]>>","void|X<[X]>");
	}
	@Test public void test_1165() {
		checkIsSubtype("X<X|Y<[Y]>>","void|[void]");
	}
	@Test public void test_1166() {
		checkIsSubtype("X<X|Y<[Y]>>","void|(X<void|X>)");
	}
	@Test public void test_1167() {
		checkNotSubtype("X<X|Y<[Y]>>","any|void");
	}
	@Test public void test_1168() {
		checkNotSubtype("X<X|Y<[Y]>>","any|any");
	}
	@Test public void test_1169() {
		checkNotSubtype("X<X|Y<[Y]>>","any|null");
	}
	@Test public void test_1170() {
		checkNotSubtype("X<X|Y<[Y]>>","any|int");
	}
	@Test public void test_1171() {
		checkNotSubtype("X<X|Y<[Y]>>","any|X<[X]>");
	}
	@Test public void test_1172() {
		checkNotSubtype("X<X|Y<[Y]>>","any|[any]");
	}
	@Test public void test_1173() {
		checkNotSubtype("X<X|Y<[Y]>>","any|(X<any|X>)");
	}
	@Test public void test_1174() {
		checkNotSubtype("X<X|Y<[Y]>>","null|void");
	}
	@Test public void test_1175() {
		checkNotSubtype("X<X|Y<[Y]>>","null|any");
	}
	@Test public void test_1176() {
		checkNotSubtype("X<X|Y<[Y]>>","null|null");
	}
	@Test public void test_1177() {
		checkNotSubtype("X<X|Y<[Y]>>","null|int");
	}
	@Test public void test_1178() {
		checkNotSubtype("X<X|Y<[Y]>>","null|X<[X]>");
	}
	@Test public void test_1179() {
		checkNotSubtype("X<X|Y<[Y]>>","null|[null]");
	}
	@Test public void test_1180() {
		checkNotSubtype("X<X|Y<[Y]>>","null|(X<null|X>)");
	}
	@Test public void test_1181() {
		checkNotSubtype("X<X|Y<[Y]>>","int|void");
	}
	@Test public void test_1182() {
		checkNotSubtype("X<X|Y<[Y]>>","int|any");
	}
	@Test public void test_1183() {
		checkNotSubtype("X<X|Y<[Y]>>","int|null");
	}
	@Test public void test_1184() {
		checkNotSubtype("X<X|Y<[Y]>>","int|int");
	}
	@Test public void test_1185() {
		checkNotSubtype("X<X|Y<[Y]>>","int|X<[X]>");
	}
	@Test public void test_1186() {
		checkNotSubtype("X<X|Y<[Y]>>","int|[int]");
	}
	@Test public void test_1187() {
		checkNotSubtype("X<X|Y<[Y]>>","int|(X<int|X>)");
	}
	@Test public void test_1188() {
		checkIsSubtype("X<X|Y<[Y]>>","[void]|void");
	}
	@Test public void test_1189() {
		checkIsSubtype("X<X|Y<[Y]>>","X<[X]>|void");
	}
	@Test public void test_1190() {
		checkIsSubtype("X<X|Y<[Y]>>","X<X|[void]>");
	}
	@Test public void test_1191() {
		checkNotSubtype("X<X|Y<[Y]>>","[any]|any");
	}
	@Test public void test_1192() {
		checkNotSubtype("X<X|Y<[Y]>>","X<[X]>|any");
	}
	@Test public void test_1193() {
		checkNotSubtype("X<X|Y<[Y]>>","X<X|[any]>");
	}
	@Test public void test_1194() {
		checkNotSubtype("X<X|Y<[Y]>>","[null]|null");
	}
	@Test public void test_1195() {
		checkNotSubtype("X<X|Y<[Y]>>","X<[X]>|null");
	}
	@Test public void test_1196() {
		checkNotSubtype("X<X|Y<[Y]>>","X<X|[null]>");
	}
	@Test public void test_1197() {
		checkNotSubtype("X<X|Y<[Y]>>","[int]|int");
	}
	@Test public void test_1198() {
		checkNotSubtype("X<X|Y<[Y]>>","X<[X]>|int");
	}
	@Test public void test_1199() {
		checkNotSubtype("X<X|Y<[Y]>>","X<X|[int]>");
	}
	@Test public void test_1200() {
		checkIsSubtype("X<X|Y<[Y]>>","[X<[X]>]|X<[X]>");
	}
	@Test public void test_1201() {
		checkIsSubtype("X<X|Y<[Y]>>","X<[X]>|Y<[Y]>");
	}
	@Test public void test_1202() {
		checkIsSubtype("X<X|Y<[Y]>>","X<[X]>|[X<[X]>]");
	}
	@Test public void test_1203() {
		checkIsSubtype("X<X|Y<[Y]>>","X<X|[Y<[Y]>]>");
	}
	@Test public void test_1204() {
		checkIsSubtype("X<X|Y<[Y]>>","X<X|[[X]]>");
	}
	@Test public void test_1205() {
		checkIsSubtype("X<X|Y<[Y]>>","X<[X]>|(Y<X<[X]>|Y>)");
	}
	@Test public void test_1206() {
		checkIsSubtype("X<X|Y<[Y]>>","X<X|[Y<X|Y>]>");
	}
	@Test public void test_1207() {
		checkIsSubtype("X<X|Y<[Y]>>","(X<X|void>)|void");
	}
	@Test public void test_1208() {
		checkIsSubtype("X<X|Y<[Y]>>","X<X|(Y<Y|void>)>");
	}
	@Test public void test_1209() {
		checkNotSubtype("X<X|Y<[Y]>>","(X<X|any>)|any");
	}
	@Test public void test_1210() {
		checkNotSubtype("X<X|Y<[Y]>>","X<X|(Y<Y|any>)>");
	}
	@Test public void test_1211() {
		checkNotSubtype("X<X|Y<[Y]>>","(X<X|null>)|null");
	}
	@Test public void test_1212() {
		checkNotSubtype("X<X|Y<[Y]>>","X<X|(Y<Y|null>)>");
	}
	@Test public void test_1213() {
		checkNotSubtype("X<X|Y<[Y]>>","(X<X|int>)|int");
	}
	@Test public void test_1214() {
		checkNotSubtype("X<X|Y<[Y]>>","X<X|(Y<Y|int>)>");
	}
	@Test public void test_1215() {
		checkIsSubtype("X<X|Y<[Y]>>","(X<X|Y<[Y]>>)|Y<[Y]>");
	}
	@Test public void test_1216() {
		checkIsSubtype("X<X|Y<[Y]>>","X<X|(Y<Y|Z<[Z]>>)>");
	}
	@Test public void test_1217() {
		checkIsSubtype("X<X|Y<[Y]>>","X<X|(Y<Y|[X]>)>");
	}
	@Test public void test_1218() {
		checkIsSubtype("X<X|Y<[Y]>>","X<X|(Y<Y|(Z<X|Z>)>)>");
	}
	@Test public void test_1219() {
		checkNotSubtype("[[void]]","any");
	}
	@Test public void test_1220() {
		checkNotSubtype("[[void]]","null");
	}
	@Test public void test_1221() {
		checkNotSubtype("[[void]]","int");
	}
	@Test public void test_1222() {
		checkNotSubtype("[[void]]","X<[X]>");
	}
	@Test public void test_1223() {
		checkIsSubtype("[[void]]","[void]");
	}
	@Test public void test_1224() {
		checkNotSubtype("[[void]]","[any]");
	}
	@Test public void test_1225() {
		checkNotSubtype("[[void]]","[null]");
	}
	@Test public void test_1226() {
		checkNotSubtype("[[void]]","[int]");
	}
	@Test public void test_1227() {
		checkNotSubtype("[[void]]","[X<[X]>]");
	}
	@Test public void test_1228() {
		checkIsSubtype("[[void]]","X<X|void>");
	}
	@Test public void test_1229() {
		checkNotSubtype("[[void]]","X<X|any>");
	}
	@Test public void test_1230() {
		checkNotSubtype("[[void]]","X<X|null>");
	}
	@Test public void test_1231() {
		checkNotSubtype("[[void]]","X<X|int>");
	}
	@Test public void test_1232() {
		checkNotSubtype("[[void]]","X<X|Y<[Y]>>");
	}
	@Test public void test_1233() {
		checkIsSubtype("[[void]]","[[void]]");
	}
	@Test public void test_1234() {
		checkNotSubtype("[[void]]","[[any]]");
	}
	@Test public void test_1235() {
		checkNotSubtype("[[void]]","[[null]]");
	}
	@Test public void test_1236() {
		checkNotSubtype("[[void]]","[[int]]");
	}
	@Test public void test_1237() {
		checkNotSubtype("[[void]]","[[X<[X]>]]");
	}
	@Test public void test_1238() {
		checkNotSubtype("[[void]]","X<[[[X]]]>");
	}
	@Test public void test_1239() {
		checkNotSubtype("[[void]]","X<[[Y<X|Y>]]>");
	}
	@Test public void test_1240() {
		checkIsSubtype("[[void]]","[X<X|void>]");
	}
	@Test public void test_1241() {
		checkNotSubtype("[[void]]","[X<X|any>]");
	}
	@Test public void test_1242() {
		checkNotSubtype("[[void]]","[X<X|null>]");
	}
	@Test public void test_1243() {
		checkNotSubtype("[[void]]","[X<X|int>]");
	}
	@Test public void test_1244() {
		checkNotSubtype("[[void]]","[X<X|Y<[Y]>>]");
	}
	@Test public void test_1245() {
		checkNotSubtype("[[void]]","X<[Y<Y|[X]>]>");
	}
	@Test public void test_1246() {
		checkNotSubtype("[[void]]","X<[Y<Y|(Z<X|Z>)>]>");
	}
	@Test public void test_1247() {
		checkIsSubtype("[[void]]","void|void");
	}
	@Test public void test_1248() {
		checkNotSubtype("[[void]]","void|any");
	}
	@Test public void test_1249() {
		checkNotSubtype("[[void]]","void|null");
	}
	@Test public void test_1250() {
		checkNotSubtype("[[void]]","void|int");
	}
	@Test public void test_1251() {
		checkNotSubtype("[[void]]","void|X<[X]>");
	}
	@Test public void test_1252() {
		checkIsSubtype("[[void]]","void|[void]");
	}
	@Test public void test_1253() {
		checkIsSubtype("[[void]]","void|(X<void|X>)");
	}
	@Test public void test_1254() {
		checkNotSubtype("[[void]]","any|void");
	}
	@Test public void test_1255() {
		checkNotSubtype("[[void]]","any|any");
	}
	@Test public void test_1256() {
		checkNotSubtype("[[void]]","any|null");
	}
	@Test public void test_1257() {
		checkNotSubtype("[[void]]","any|int");
	}
	@Test public void test_1258() {
		checkNotSubtype("[[void]]","any|X<[X]>");
	}
	@Test public void test_1259() {
		checkNotSubtype("[[void]]","any|[any]");
	}
	@Test public void test_1260() {
		checkNotSubtype("[[void]]","any|(X<any|X>)");
	}
	@Test public void test_1261() {
		checkNotSubtype("[[void]]","null|void");
	}
	@Test public void test_1262() {
		checkNotSubtype("[[void]]","null|any");
	}
	@Test public void test_1263() {
		checkNotSubtype("[[void]]","null|null");
	}
	@Test public void test_1264() {
		checkNotSubtype("[[void]]","null|int");
	}
	@Test public void test_1265() {
		checkNotSubtype("[[void]]","null|X<[X]>");
	}
	@Test public void test_1266() {
		checkNotSubtype("[[void]]","null|[null]");
	}
	@Test public void test_1267() {
		checkNotSubtype("[[void]]","null|(X<null|X>)");
	}
	@Test public void test_1268() {
		checkNotSubtype("[[void]]","int|void");
	}
	@Test public void test_1269() {
		checkNotSubtype("[[void]]","int|any");
	}
	@Test public void test_1270() {
		checkNotSubtype("[[void]]","int|null");
	}
	@Test public void test_1271() {
		checkNotSubtype("[[void]]","int|int");
	}
	@Test public void test_1272() {
		checkNotSubtype("[[void]]","int|X<[X]>");
	}
	@Test public void test_1273() {
		checkNotSubtype("[[void]]","int|[int]");
	}
	@Test public void test_1274() {
		checkNotSubtype("[[void]]","int|(X<int|X>)");
	}
	@Test public void test_1275() {
		checkIsSubtype("[[void]]","[void]|void");
	}
	@Test public void test_1276() {
		checkNotSubtype("[[void]]","X<[X]>|void");
	}
	@Test public void test_1277() {
		checkIsSubtype("[[void]]","X<X|[void]>");
	}
	@Test public void test_1278() {
		checkNotSubtype("[[void]]","[any]|any");
	}
	@Test public void test_1279() {
		checkNotSubtype("[[void]]","X<[X]>|any");
	}
	@Test public void test_1280() {
		checkNotSubtype("[[void]]","X<X|[any]>");
	}
	@Test public void test_1281() {
		checkNotSubtype("[[void]]","[null]|null");
	}
	@Test public void test_1282() {
		checkNotSubtype("[[void]]","X<[X]>|null");
	}
	@Test public void test_1283() {
		checkNotSubtype("[[void]]","X<X|[null]>");
	}
	@Test public void test_1284() {
		checkNotSubtype("[[void]]","[int]|int");
	}
	@Test public void test_1285() {
		checkNotSubtype("[[void]]","X<[X]>|int");
	}
	@Test public void test_1286() {
		checkNotSubtype("[[void]]","X<X|[int]>");
	}
	@Test public void test_1287() {
		checkNotSubtype("[[void]]","[X<[X]>]|X<[X]>");
	}
	@Test public void test_1288() {
		checkNotSubtype("[[void]]","X<[X]>|Y<[Y]>");
	}
	@Test public void test_1289() {
		checkNotSubtype("[[void]]","X<[X]>|[X<[X]>]");
	}
	@Test public void test_1290() {
		checkNotSubtype("[[void]]","X<X|[Y<[Y]>]>");
	}
	@Test public void test_1291() {
		checkNotSubtype("[[void]]","X<X|[[X]]>");
	}
	@Test public void test_1292() {
		checkNotSubtype("[[void]]","X<[X]>|(Y<X<[X]>|Y>)");
	}
	@Test public void test_1293() {
		checkNotSubtype("[[void]]","X<X|[Y<X|Y>]>");
	}
	@Test public void test_1294() {
		checkIsSubtype("[[void]]","(X<X|void>)|void");
	}
	@Test public void test_1295() {
		checkIsSubtype("[[void]]","X<X|(Y<Y|void>)>");
	}
	@Test public void test_1296() {
		checkNotSubtype("[[void]]","(X<X|any>)|any");
	}
	@Test public void test_1297() {
		checkNotSubtype("[[void]]","X<X|(Y<Y|any>)>");
	}
	@Test public void test_1298() {
		checkNotSubtype("[[void]]","(X<X|null>)|null");
	}
	@Test public void test_1299() {
		checkNotSubtype("[[void]]","X<X|(Y<Y|null>)>");
	}
	@Test public void test_1300() {
		checkNotSubtype("[[void]]","(X<X|int>)|int");
	}
	@Test public void test_1301() {
		checkNotSubtype("[[void]]","X<X|(Y<Y|int>)>");
	}
	@Test public void test_1302() {
		checkNotSubtype("[[void]]","(X<X|Y<[Y]>>)|Y<[Y]>");
	}
	@Test public void test_1303() {
		checkNotSubtype("[[void]]","X<X|(Y<Y|Z<[Z]>>)>");
	}
	@Test public void test_1304() {
		checkNotSubtype("[[void]]","X<X|(Y<Y|[X]>)>");
	}
	@Test public void test_1305() {
		checkIsSubtype("[[void]]","X<X|(Y<Y|(Z<X|Z>)>)>");
	}
	@Test public void test_1306() {
		checkNotSubtype("[[any]]","any");
	}
	@Test public void test_1307() {
		checkNotSubtype("[[any]]","null");
	}
	@Test public void test_1308() {
		checkNotSubtype("[[any]]","int");
	}
	@Test public void test_1309() {
		checkIsSubtype("[[any]]","X<[X]>");
	}
	@Test public void test_1310() {
		checkIsSubtype("[[any]]","[void]");
	}
	@Test public void test_1311() {
		checkNotSubtype("[[any]]","[any]");
	}
	@Test public void test_1312() {
		checkNotSubtype("[[any]]","[null]");
	}
	@Test public void test_1313() {
		checkNotSubtype("[[any]]","[int]");
	}
	@Test public void test_1314() {
		checkIsSubtype("[[any]]","[X<[X]>]");
	}
	@Test public void test_1315() {
		checkIsSubtype("[[any]]","X<X|void>");
	}
	@Test public void test_1316() {
		checkNotSubtype("[[any]]","X<X|any>");
	}
	@Test public void test_1317() {
		checkNotSubtype("[[any]]","X<X|null>");
	}
	@Test public void test_1318() {
		checkNotSubtype("[[any]]","X<X|int>");
	}
	@Test public void test_1319() {
		checkIsSubtype("[[any]]","X<X|Y<[Y]>>");
	}
	@Test public void test_1320() {
		checkIsSubtype("[[any]]","[[void]]");
	}
	@Test public void test_1321() {
		checkIsSubtype("[[any]]","[[any]]");
	}
	@Test public void test_1322() {
		checkIsSubtype("[[any]]","[[null]]");
	}
	@Test public void test_1323() {
		checkIsSubtype("[[any]]","[[int]]");
	}
	@Test public void test_1324() {
		checkIsSubtype("[[any]]","[[X<[X]>]]");
	}
	@Test public void test_1325() {
		checkIsSubtype("[[any]]","X<[[[X]]]>");
	}
	@Test public void test_1326() {
		checkIsSubtype("[[any]]","X<[[Y<X|Y>]]>");
	}
	@Test public void test_1327() {
		checkIsSubtype("[[any]]","[X<X|void>]");
	}
	@Test public void test_1328() {
		checkNotSubtype("[[any]]","[X<X|any>]");
	}
	@Test public void test_1329() {
		checkNotSubtype("[[any]]","[X<X|null>]");
	}
	@Test public void test_1330() {
		checkNotSubtype("[[any]]","[X<X|int>]");
	}
	@Test public void test_1331() {
		checkIsSubtype("[[any]]","[X<X|Y<[Y]>>]");
	}
	@Test public void test_1332() {
		checkIsSubtype("[[any]]","X<[Y<Y|[X]>]>");
	}
	@Test public void test_1333() {
		checkIsSubtype("[[any]]","X<[Y<Y|(Z<X|Z>)>]>");
	}
	@Test public void test_1334() {
		checkIsSubtype("[[any]]","void|void");
	}
	@Test public void test_1335() {
		checkNotSubtype("[[any]]","void|any");
	}
	@Test public void test_1336() {
		checkNotSubtype("[[any]]","void|null");
	}
	@Test public void test_1337() {
		checkNotSubtype("[[any]]","void|int");
	}
	@Test public void test_1338() {
		checkIsSubtype("[[any]]","void|X<[X]>");
	}
	@Test public void test_1339() {
		checkIsSubtype("[[any]]","void|[void]");
	}
	@Test public void test_1340() {
		checkIsSubtype("[[any]]","void|(X<void|X>)");
	}
	@Test public void test_1341() {
		checkNotSubtype("[[any]]","any|void");
	}
	@Test public void test_1342() {
		checkNotSubtype("[[any]]","any|any");
	}
	@Test public void test_1343() {
		checkNotSubtype("[[any]]","any|null");
	}
	@Test public void test_1344() {
		checkNotSubtype("[[any]]","any|int");
	}
	@Test public void test_1345() {
		checkNotSubtype("[[any]]","any|X<[X]>");
	}
	@Test public void test_1346() {
		checkNotSubtype("[[any]]","any|[any]");
	}
	@Test public void test_1347() {
		checkNotSubtype("[[any]]","any|(X<any|X>)");
	}
	@Test public void test_1348() {
		checkNotSubtype("[[any]]","null|void");
	}
	@Test public void test_1349() {
		checkNotSubtype("[[any]]","null|any");
	}
	@Test public void test_1350() {
		checkNotSubtype("[[any]]","null|null");
	}
	@Test public void test_1351() {
		checkNotSubtype("[[any]]","null|int");
	}
	@Test public void test_1352() {
		checkNotSubtype("[[any]]","null|X<[X]>");
	}
	@Test public void test_1353() {
		checkNotSubtype("[[any]]","null|[null]");
	}
	@Test public void test_1354() {
		checkNotSubtype("[[any]]","null|(X<null|X>)");
	}
	@Test public void test_1355() {
		checkNotSubtype("[[any]]","int|void");
	}
	@Test public void test_1356() {
		checkNotSubtype("[[any]]","int|any");
	}
	@Test public void test_1357() {
		checkNotSubtype("[[any]]","int|null");
	}
	@Test public void test_1358() {
		checkNotSubtype("[[any]]","int|int");
	}
	@Test public void test_1359() {
		checkNotSubtype("[[any]]","int|X<[X]>");
	}
	@Test public void test_1360() {
		checkNotSubtype("[[any]]","int|[int]");
	}
	@Test public void test_1361() {
		checkNotSubtype("[[any]]","int|(X<int|X>)");
	}
	@Test public void test_1362() {
		checkIsSubtype("[[any]]","[void]|void");
	}
	@Test public void test_1363() {
		checkIsSubtype("[[any]]","X<[X]>|void");
	}
	@Test public void test_1364() {
		checkIsSubtype("[[any]]","X<X|[void]>");
	}
	@Test public void test_1365() {
		checkNotSubtype("[[any]]","[any]|any");
	}
	@Test public void test_1366() {
		checkNotSubtype("[[any]]","X<[X]>|any");
	}
	@Test public void test_1367() {
		checkNotSubtype("[[any]]","X<X|[any]>");
	}
	@Test public void test_1368() {
		checkNotSubtype("[[any]]","[null]|null");
	}
	@Test public void test_1369() {
		checkNotSubtype("[[any]]","X<[X]>|null");
	}
	@Test public void test_1370() {
		checkNotSubtype("[[any]]","X<X|[null]>");
	}
	@Test public void test_1371() {
		checkNotSubtype("[[any]]","[int]|int");
	}
	@Test public void test_1372() {
		checkNotSubtype("[[any]]","X<[X]>|int");
	}
	@Test public void test_1373() {
		checkNotSubtype("[[any]]","X<X|[int]>");
	}
	@Test public void test_1374() {
		checkIsSubtype("[[any]]","[X<[X]>]|X<[X]>");
	}
	@Test public void test_1375() {
		checkIsSubtype("[[any]]","X<[X]>|Y<[Y]>");
	}
	@Test public void test_1376() {
		checkIsSubtype("[[any]]","X<[X]>|[X<[X]>]");
	}
	@Test public void test_1377() {
		checkIsSubtype("[[any]]","X<X|[Y<[Y]>]>");
	}
	@Test public void test_1378() {
		checkIsSubtype("[[any]]","X<X|[[X]]>");
	}
	@Test public void test_1379() {
		checkIsSubtype("[[any]]","X<[X]>|(Y<X<[X]>|Y>)");
	}
	@Test public void test_1380() {
		checkIsSubtype("[[any]]","X<X|[Y<X|Y>]>");
	}
	@Test public void test_1381() {
		checkIsSubtype("[[any]]","(X<X|void>)|void");
	}
	@Test public void test_1382() {
		checkIsSubtype("[[any]]","X<X|(Y<Y|void>)>");
	}
	@Test public void test_1383() {
		checkNotSubtype("[[any]]","(X<X|any>)|any");
	}
	@Test public void test_1384() {
		checkNotSubtype("[[any]]","X<X|(Y<Y|any>)>");
	}
	@Test public void test_1385() {
		checkNotSubtype("[[any]]","(X<X|null>)|null");
	}
	@Test public void test_1386() {
		checkNotSubtype("[[any]]","X<X|(Y<Y|null>)>");
	}
	@Test public void test_1387() {
		checkNotSubtype("[[any]]","(X<X|int>)|int");
	}
	@Test public void test_1388() {
		checkNotSubtype("[[any]]","X<X|(Y<Y|int>)>");
	}
	@Test public void test_1389() {
		checkIsSubtype("[[any]]","(X<X|Y<[Y]>>)|Y<[Y]>");
	}
	@Test public void test_1390() {
		checkIsSubtype("[[any]]","X<X|(Y<Y|Z<[Z]>>)>");
	}
	@Test public void test_1391() {
		checkIsSubtype("[[any]]","X<X|(Y<Y|[X]>)>");
	}
	@Test public void test_1392() {
		checkIsSubtype("[[any]]","X<X|(Y<Y|(Z<X|Z>)>)>");
	}
	@Test public void test_1393() {
		checkNotSubtype("[[null]]","any");
	}
	@Test public void test_1394() {
		checkNotSubtype("[[null]]","null");
	}
	@Test public void test_1395() {
		checkNotSubtype("[[null]]","int");
	}
	@Test public void test_1396() {
		checkNotSubtype("[[null]]","X<[X]>");
	}
	@Test public void test_1397() {
		checkIsSubtype("[[null]]","[void]");
	}
	@Test public void test_1398() {
		checkNotSubtype("[[null]]","[any]");
	}
	@Test public void test_1399() {
		checkNotSubtype("[[null]]","[null]");
	}
	@Test public void test_1400() {
		checkNotSubtype("[[null]]","[int]");
	}
	@Test public void test_1401() {
		checkNotSubtype("[[null]]","[X<[X]>]");
	}
	@Test public void test_1402() {
		checkIsSubtype("[[null]]","X<X|void>");
	}
	@Test public void test_1403() {
		checkNotSubtype("[[null]]","X<X|any>");
	}
	@Test public void test_1404() {
		checkNotSubtype("[[null]]","X<X|null>");
	}
	@Test public void test_1405() {
		checkNotSubtype("[[null]]","X<X|int>");
	}
	@Test public void test_1406() {
		checkNotSubtype("[[null]]","X<X|Y<[Y]>>");
	}
	@Test public void test_1407() {
		checkIsSubtype("[[null]]","[[void]]");
	}
	@Test public void test_1408() {
		checkNotSubtype("[[null]]","[[any]]");
	}
	@Test public void test_1409() {
		checkIsSubtype("[[null]]","[[null]]");
	}
	@Test public void test_1410() {
		checkNotSubtype("[[null]]","[[int]]");
	}
	@Test public void test_1411() {
		checkNotSubtype("[[null]]","[[X<[X]>]]");
	}
	@Test public void test_1412() {
		checkNotSubtype("[[null]]","X<[[[X]]]>");
	}
	@Test public void test_1413() {
		checkNotSubtype("[[null]]","X<[[Y<X|Y>]]>");
	}
	@Test public void test_1414() {
		checkIsSubtype("[[null]]","[X<X|void>]");
	}
	@Test public void test_1415() {
		checkNotSubtype("[[null]]","[X<X|any>]");
	}
	@Test public void test_1416() {
		checkNotSubtype("[[null]]","[X<X|null>]");
	}
	@Test public void test_1417() {
		checkNotSubtype("[[null]]","[X<X|int>]");
	}
	@Test public void test_1418() {
		checkNotSubtype("[[null]]","[X<X|Y<[Y]>>]");
	}
	@Test public void test_1419() {
		checkNotSubtype("[[null]]","X<[Y<Y|[X]>]>");
	}
	@Test public void test_1420() {
		checkNotSubtype("[[null]]","X<[Y<Y|(Z<X|Z>)>]>");
	}
	@Test public void test_1421() {
		checkIsSubtype("[[null]]","void|void");
	}
	@Test public void test_1422() {
		checkNotSubtype("[[null]]","void|any");
	}
	@Test public void test_1423() {
		checkNotSubtype("[[null]]","void|null");
	}
	@Test public void test_1424() {
		checkNotSubtype("[[null]]","void|int");
	}
	@Test public void test_1425() {
		checkNotSubtype("[[null]]","void|X<[X]>");
	}
	@Test public void test_1426() {
		checkIsSubtype("[[null]]","void|[void]");
	}
	@Test public void test_1427() {
		checkIsSubtype("[[null]]","void|(X<void|X>)");
	}
	@Test public void test_1428() {
		checkNotSubtype("[[null]]","any|void");
	}
	@Test public void test_1429() {
		checkNotSubtype("[[null]]","any|any");
	}
	@Test public void test_1430() {
		checkNotSubtype("[[null]]","any|null");
	}
	@Test public void test_1431() {
		checkNotSubtype("[[null]]","any|int");
	}
	@Test public void test_1432() {
		checkNotSubtype("[[null]]","any|X<[X]>");
	}
	@Test public void test_1433() {
		checkNotSubtype("[[null]]","any|[any]");
	}
	@Test public void test_1434() {
		checkNotSubtype("[[null]]","any|(X<any|X>)");
	}
	@Test public void test_1435() {
		checkNotSubtype("[[null]]","null|void");
	}
	@Test public void test_1436() {
		checkNotSubtype("[[null]]","null|any");
	}
	@Test public void test_1437() {
		checkNotSubtype("[[null]]","null|null");
	}
	@Test public void test_1438() {
		checkNotSubtype("[[null]]","null|int");
	}
	@Test public void test_1439() {
		checkNotSubtype("[[null]]","null|X<[X]>");
	}
	@Test public void test_1440() {
		checkNotSubtype("[[null]]","null|[null]");
	}
	@Test public void test_1441() {
		checkNotSubtype("[[null]]","null|(X<null|X>)");
	}
	@Test public void test_1442() {
		checkNotSubtype("[[null]]","int|void");
	}
	@Test public void test_1443() {
		checkNotSubtype("[[null]]","int|any");
	}
	@Test public void test_1444() {
		checkNotSubtype("[[null]]","int|null");
	}
	@Test public void test_1445() {
		checkNotSubtype("[[null]]","int|int");
	}
	@Test public void test_1446() {
		checkNotSubtype("[[null]]","int|X<[X]>");
	}
	@Test public void test_1447() {
		checkNotSubtype("[[null]]","int|[int]");
	}
	@Test public void test_1448() {
		checkNotSubtype("[[null]]","int|(X<int|X>)");
	}
	@Test public void test_1449() {
		checkIsSubtype("[[null]]","[void]|void");
	}
	@Test public void test_1450() {
		checkNotSubtype("[[null]]","X<[X]>|void");
	}
	@Test public void test_1451() {
		checkIsSubtype("[[null]]","X<X|[void]>");
	}
	@Test public void test_1452() {
		checkNotSubtype("[[null]]","[any]|any");
	}
	@Test public void test_1453() {
		checkNotSubtype("[[null]]","X<[X]>|any");
	}
	@Test public void test_1454() {
		checkNotSubtype("[[null]]","X<X|[any]>");
	}
	@Test public void test_1455() {
		checkNotSubtype("[[null]]","[null]|null");
	}
	@Test public void test_1456() {
		checkNotSubtype("[[null]]","X<[X]>|null");
	}
	@Test public void test_1457() {
		checkNotSubtype("[[null]]","X<X|[null]>");
	}
	@Test public void test_1458() {
		checkNotSubtype("[[null]]","[int]|int");
	}
	@Test public void test_1459() {
		checkNotSubtype("[[null]]","X<[X]>|int");
	}
	@Test public void test_1460() {
		checkNotSubtype("[[null]]","X<X|[int]>");
	}
	@Test public void test_1461() {
		checkNotSubtype("[[null]]","[X<[X]>]|X<[X]>");
	}
	@Test public void test_1462() {
		checkNotSubtype("[[null]]","X<[X]>|Y<[Y]>");
	}
	@Test public void test_1463() {
		checkNotSubtype("[[null]]","X<[X]>|[X<[X]>]");
	}
	@Test public void test_1464() {
		checkNotSubtype("[[null]]","X<X|[Y<[Y]>]>");
	}
	@Test public void test_1465() {
		checkNotSubtype("[[null]]","X<X|[[X]]>");
	}
	@Test public void test_1466() {
		checkNotSubtype("[[null]]","X<[X]>|(Y<X<[X]>|Y>)");
	}
	@Test public void test_1467() {
		checkNotSubtype("[[null]]","X<X|[Y<X|Y>]>");
	}
	@Test public void test_1468() {
		checkIsSubtype("[[null]]","(X<X|void>)|void");
	}
	@Test public void test_1469() {
		checkIsSubtype("[[null]]","X<X|(Y<Y|void>)>");
	}
	@Test public void test_1470() {
		checkNotSubtype("[[null]]","(X<X|any>)|any");
	}
	@Test public void test_1471() {
		checkNotSubtype("[[null]]","X<X|(Y<Y|any>)>");
	}
	@Test public void test_1472() {
		checkNotSubtype("[[null]]","(X<X|null>)|null");
	}
	@Test public void test_1473() {
		checkNotSubtype("[[null]]","X<X|(Y<Y|null>)>");
	}
	@Test public void test_1474() {
		checkNotSubtype("[[null]]","(X<X|int>)|int");
	}
	@Test public void test_1475() {
		checkNotSubtype("[[null]]","X<X|(Y<Y|int>)>");
	}
	@Test public void test_1476() {
		checkNotSubtype("[[null]]","(X<X|Y<[Y]>>)|Y<[Y]>");
	}
	@Test public void test_1477() {
		checkNotSubtype("[[null]]","X<X|(Y<Y|Z<[Z]>>)>");
	}
	@Test public void test_1478() {
		checkNotSubtype("[[null]]","X<X|(Y<Y|[X]>)>");
	}
	@Test public void test_1479() {
		checkIsSubtype("[[null]]","X<X|(Y<Y|(Z<X|Z>)>)>");
	}
	@Test public void test_1480() {
		checkNotSubtype("[[int]]","any");
	}
	@Test public void test_1481() {
		checkNotSubtype("[[int]]","null");
	}
	@Test public void test_1482() {
		checkNotSubtype("[[int]]","int");
	}
	@Test public void test_1483() {
		checkNotSubtype("[[int]]","X<[X]>");
	}
	@Test public void test_1484() {
		checkIsSubtype("[[int]]","[void]");
	}
	@Test public void test_1485() {
		checkNotSubtype("[[int]]","[any]");
	}
	@Test public void test_1486() {
		checkNotSubtype("[[int]]","[null]");
	}
	@Test public void test_1487() {
		checkNotSubtype("[[int]]","[int]");
	}
	@Test public void test_1488() {
		checkNotSubtype("[[int]]","[X<[X]>]");
	}
	@Test public void test_1489() {
		checkIsSubtype("[[int]]","X<X|void>");
	}
	@Test public void test_1490() {
		checkNotSubtype("[[int]]","X<X|any>");
	}
	@Test public void test_1491() {
		checkNotSubtype("[[int]]","X<X|null>");
	}
	@Test public void test_1492() {
		checkNotSubtype("[[int]]","X<X|int>");
	}
	@Test public void test_1493() {
		checkNotSubtype("[[int]]","X<X|Y<[Y]>>");
	}
	@Test public void test_1494() {
		checkIsSubtype("[[int]]","[[void]]");
	}
	@Test public void test_1495() {
		checkNotSubtype("[[int]]","[[any]]");
	}
	@Test public void test_1496() {
		checkNotSubtype("[[int]]","[[null]]");
	}
	@Test public void test_1497() {
		checkIsSubtype("[[int]]","[[int]]");
	}
	@Test public void test_1498() {
		checkNotSubtype("[[int]]","[[X<[X]>]]");
	}
	@Test public void test_1499() {
		checkNotSubtype("[[int]]","X<[[[X]]]>");
	}
	@Test public void test_1500() {
		checkNotSubtype("[[int]]","X<[[Y<X|Y>]]>");
	}
	@Test public void test_1501() {
		checkIsSubtype("[[int]]","[X<X|void>]");
	}
	@Test public void test_1502() {
		checkNotSubtype("[[int]]","[X<X|any>]");
	}
	@Test public void test_1503() {
		checkNotSubtype("[[int]]","[X<X|null>]");
	}
	@Test public void test_1504() {
		checkNotSubtype("[[int]]","[X<X|int>]");
	}
	@Test public void test_1505() {
		checkNotSubtype("[[int]]","[X<X|Y<[Y]>>]");
	}
	@Test public void test_1506() {
		checkNotSubtype("[[int]]","X<[Y<Y|[X]>]>");
	}
	@Test public void test_1507() {
		checkNotSubtype("[[int]]","X<[Y<Y|(Z<X|Z>)>]>");
	}
	@Test public void test_1508() {
		checkIsSubtype("[[int]]","void|void");
	}
	@Test public void test_1509() {
		checkNotSubtype("[[int]]","void|any");
	}
	@Test public void test_1510() {
		checkNotSubtype("[[int]]","void|null");
	}
	@Test public void test_1511() {
		checkNotSubtype("[[int]]","void|int");
	}
	@Test public void test_1512() {
		checkNotSubtype("[[int]]","void|X<[X]>");
	}
	@Test public void test_1513() {
		checkIsSubtype("[[int]]","void|[void]");
	}
	@Test public void test_1514() {
		checkIsSubtype("[[int]]","void|(X<void|X>)");
	}
	@Test public void test_1515() {
		checkNotSubtype("[[int]]","any|void");
	}
	@Test public void test_1516() {
		checkNotSubtype("[[int]]","any|any");
	}
	@Test public void test_1517() {
		checkNotSubtype("[[int]]","any|null");
	}
	@Test public void test_1518() {
		checkNotSubtype("[[int]]","any|int");
	}
	@Test public void test_1519() {
		checkNotSubtype("[[int]]","any|X<[X]>");
	}
	@Test public void test_1520() {
		checkNotSubtype("[[int]]","any|[any]");
	}
	@Test public void test_1521() {
		checkNotSubtype("[[int]]","any|(X<any|X>)");
	}
	@Test public void test_1522() {
		checkNotSubtype("[[int]]","null|void");
	}
	@Test public void test_1523() {
		checkNotSubtype("[[int]]","null|any");
	}
	@Test public void test_1524() {
		checkNotSubtype("[[int]]","null|null");
	}
	@Test public void test_1525() {
		checkNotSubtype("[[int]]","null|int");
	}
	@Test public void test_1526() {
		checkNotSubtype("[[int]]","null|X<[X]>");
	}
	@Test public void test_1527() {
		checkNotSubtype("[[int]]","null|[null]");
	}
	@Test public void test_1528() {
		checkNotSubtype("[[int]]","null|(X<null|X>)");
	}
	@Test public void test_1529() {
		checkNotSubtype("[[int]]","int|void");
	}
	@Test public void test_1530() {
		checkNotSubtype("[[int]]","int|any");
	}
	@Test public void test_1531() {
		checkNotSubtype("[[int]]","int|null");
	}
	@Test public void test_1532() {
		checkNotSubtype("[[int]]","int|int");
	}
	@Test public void test_1533() {
		checkNotSubtype("[[int]]","int|X<[X]>");
	}
	@Test public void test_1534() {
		checkNotSubtype("[[int]]","int|[int]");
	}
	@Test public void test_1535() {
		checkNotSubtype("[[int]]","int|(X<int|X>)");
	}
	@Test public void test_1536() {
		checkIsSubtype("[[int]]","[void]|void");
	}
	@Test public void test_1537() {
		checkNotSubtype("[[int]]","X<[X]>|void");
	}
	@Test public void test_1538() {
		checkIsSubtype("[[int]]","X<X|[void]>");
	}
	@Test public void test_1539() {
		checkNotSubtype("[[int]]","[any]|any");
	}
	@Test public void test_1540() {
		checkNotSubtype("[[int]]","X<[X]>|any");
	}
	@Test public void test_1541() {
		checkNotSubtype("[[int]]","X<X|[any]>");
	}
	@Test public void test_1542() {
		checkNotSubtype("[[int]]","[null]|null");
	}
	@Test public void test_1543() {
		checkNotSubtype("[[int]]","X<[X]>|null");
	}
	@Test public void test_1544() {
		checkNotSubtype("[[int]]","X<X|[null]>");
	}
	@Test public void test_1545() {
		checkNotSubtype("[[int]]","[int]|int");
	}
	@Test public void test_1546() {
		checkNotSubtype("[[int]]","X<[X]>|int");
	}
	@Test public void test_1547() {
		checkNotSubtype("[[int]]","X<X|[int]>");
	}
	@Test public void test_1548() {
		checkNotSubtype("[[int]]","[X<[X]>]|X<[X]>");
	}
	@Test public void test_1549() {
		checkNotSubtype("[[int]]","X<[X]>|Y<[Y]>");
	}
	@Test public void test_1550() {
		checkNotSubtype("[[int]]","X<[X]>|[X<[X]>]");
	}
	@Test public void test_1551() {
		checkNotSubtype("[[int]]","X<X|[Y<[Y]>]>");
	}
	@Test public void test_1552() {
		checkNotSubtype("[[int]]","X<X|[[X]]>");
	}
	@Test public void test_1553() {
		checkNotSubtype("[[int]]","X<[X]>|(Y<X<[X]>|Y>)");
	}
	@Test public void test_1554() {
		checkNotSubtype("[[int]]","X<X|[Y<X|Y>]>");
	}
	@Test public void test_1555() {
		checkIsSubtype("[[int]]","(X<X|void>)|void");
	}
	@Test public void test_1556() {
		checkIsSubtype("[[int]]","X<X|(Y<Y|void>)>");
	}
	@Test public void test_1557() {
		checkNotSubtype("[[int]]","(X<X|any>)|any");
	}
	@Test public void test_1558() {
		checkNotSubtype("[[int]]","X<X|(Y<Y|any>)>");
	}
	@Test public void test_1559() {
		checkNotSubtype("[[int]]","(X<X|null>)|null");
	}
	@Test public void test_1560() {
		checkNotSubtype("[[int]]","X<X|(Y<Y|null>)>");
	}
	@Test public void test_1561() {
		checkNotSubtype("[[int]]","(X<X|int>)|int");
	}
	@Test public void test_1562() {
		checkNotSubtype("[[int]]","X<X|(Y<Y|int>)>");
	}
	@Test public void test_1563() {
		checkNotSubtype("[[int]]","(X<X|Y<[Y]>>)|Y<[Y]>");
	}
	@Test public void test_1564() {
		checkNotSubtype("[[int]]","X<X|(Y<Y|Z<[Z]>>)>");
	}
	@Test public void test_1565() {
		checkNotSubtype("[[int]]","X<X|(Y<Y|[X]>)>");
	}
	@Test public void test_1566() {
		checkIsSubtype("[[int]]","X<X|(Y<Y|(Z<X|Z>)>)>");
	}
	@Test public void test_1567() {
		checkNotSubtype("[[X<[X]>]]","any");
	}
	@Test public void test_1568() {
		checkNotSubtype("[[X<[X]>]]","null");
	}
	@Test public void test_1569() {
		checkNotSubtype("[[X<[X]>]]","int");
	}
	@Test public void test_1570() {
		checkIsSubtype("[[X<[X]>]]","X<[X]>");
	}
	@Test public void test_1571() {
		checkIsSubtype("[[X<[X]>]]","[void]");
	}
	@Test public void test_1572() {
		checkNotSubtype("[[X<[X]>]]","[any]");
	}
	@Test public void test_1573() {
		checkNotSubtype("[[X<[X]>]]","[null]");
	}
	@Test public void test_1574() {
		checkNotSubtype("[[X<[X]>]]","[int]");
	}
	@Test public void test_1575() {
		checkIsSubtype("[[X<[X]>]]","[X<[X]>]");
	}
	@Test public void test_1576() {
		checkIsSubtype("[[X<[X]>]]","X<X|void>");
	}
	@Test public void test_1577() {
		checkNotSubtype("[[X<[X]>]]","X<X|any>");
	}
	@Test public void test_1578() {
		checkNotSubtype("[[X<[X]>]]","X<X|null>");
	}
	@Test public void test_1579() {
		checkNotSubtype("[[X<[X]>]]","X<X|int>");
	}
	@Test public void test_1580() {
		checkIsSubtype("[[X<[X]>]]","X<X|Y<[Y]>>");
	}
	@Test public void test_1581() {
		checkIsSubtype("[[X<[X]>]]","[[void]]");
	}
	@Test public void test_1582() {
		checkNotSubtype("[[X<[X]>]]","[[any]]");
	}
	@Test public void test_1583() {
		checkNotSubtype("[[X<[X]>]]","[[null]]");
	}
	@Test public void test_1584() {
		checkNotSubtype("[[X<[X]>]]","[[int]]");
	}
	@Test public void test_1585() {
		checkIsSubtype("[[X<[X]>]]","[[X<[X]>]]");
	}
	@Test public void test_1586() {
		checkIsSubtype("[[X<[X]>]]","X<[[[X]]]>");
	}
	@Test public void test_1587() {
		checkIsSubtype("[[X<[X]>]]","X<[[Y<X|Y>]]>");
	}
	@Test public void test_1588() {
		checkIsSubtype("[[X<[X]>]]","[X<X|void>]");
	}
	@Test public void test_1589() {
		checkNotSubtype("[[X<[X]>]]","[X<X|any>]");
	}
	@Test public void test_1590() {
		checkNotSubtype("[[X<[X]>]]","[X<X|null>]");
	}
	@Test public void test_1591() {
		checkNotSubtype("[[X<[X]>]]","[X<X|int>]");
	}
	@Test public void test_1592() {
		checkIsSubtype("[[X<[X]>]]","[X<X|Y<[Y]>>]");
	}
	@Test public void test_1593() {
		checkIsSubtype("[[X<[X]>]]","X<[Y<Y|[X]>]>");
	}
	@Test public void test_1594() {
		checkIsSubtype("[[X<[X]>]]","X<[Y<Y|(Z<X|Z>)>]>");
	}
	@Test public void test_1595() {
		checkIsSubtype("[[X<[X]>]]","void|void");
	}
	@Test public void test_1596() {
		checkNotSubtype("[[X<[X]>]]","void|any");
	}
	@Test public void test_1597() {
		checkNotSubtype("[[X<[X]>]]","void|null");
	}
	@Test public void test_1598() {
		checkNotSubtype("[[X<[X]>]]","void|int");
	}
	@Test public void test_1599() {
		checkIsSubtype("[[X<[X]>]]","void|X<[X]>");
	}
	@Test public void test_1600() {
		checkIsSubtype("[[X<[X]>]]","void|[void]");
	}
	@Test public void test_1601() {
		checkIsSubtype("[[X<[X]>]]","void|(X<void|X>)");
	}
	@Test public void test_1602() {
		checkNotSubtype("[[X<[X]>]]","any|void");
	}
	@Test public void test_1603() {
		checkNotSubtype("[[X<[X]>]]","any|any");
	}
	@Test public void test_1604() {
		checkNotSubtype("[[X<[X]>]]","any|null");
	}
	@Test public void test_1605() {
		checkNotSubtype("[[X<[X]>]]","any|int");
	}
	@Test public void test_1606() {
		checkNotSubtype("[[X<[X]>]]","any|X<[X]>");
	}
	@Test public void test_1607() {
		checkNotSubtype("[[X<[X]>]]","any|[any]");
	}
	@Test public void test_1608() {
		checkNotSubtype("[[X<[X]>]]","any|(X<any|X>)");
	}
	@Test public void test_1609() {
		checkNotSubtype("[[X<[X]>]]","null|void");
	}
	@Test public void test_1610() {
		checkNotSubtype("[[X<[X]>]]","null|any");
	}
	@Test public void test_1611() {
		checkNotSubtype("[[X<[X]>]]","null|null");
	}
	@Test public void test_1612() {
		checkNotSubtype("[[X<[X]>]]","null|int");
	}
	@Test public void test_1613() {
		checkNotSubtype("[[X<[X]>]]","null|X<[X]>");
	}
	@Test public void test_1614() {
		checkNotSubtype("[[X<[X]>]]","null|[null]");
	}
	@Test public void test_1615() {
		checkNotSubtype("[[X<[X]>]]","null|(X<null|X>)");
	}
	@Test public void test_1616() {
		checkNotSubtype("[[X<[X]>]]","int|void");
	}
	@Test public void test_1617() {
		checkNotSubtype("[[X<[X]>]]","int|any");
	}
	@Test public void test_1618() {
		checkNotSubtype("[[X<[X]>]]","int|null");
	}
	@Test public void test_1619() {
		checkNotSubtype("[[X<[X]>]]","int|int");
	}
	@Test public void test_1620() {
		checkNotSubtype("[[X<[X]>]]","int|X<[X]>");
	}
	@Test public void test_1621() {
		checkNotSubtype("[[X<[X]>]]","int|[int]");
	}
	@Test public void test_1622() {
		checkNotSubtype("[[X<[X]>]]","int|(X<int|X>)");
	}
	@Test public void test_1623() {
		checkIsSubtype("[[X<[X]>]]","[void]|void");
	}
	@Test public void test_1624() {
		checkIsSubtype("[[X<[X]>]]","X<[X]>|void");
	}
	@Test public void test_1625() {
		checkIsSubtype("[[X<[X]>]]","X<X|[void]>");
	}
	@Test public void test_1626() {
		checkNotSubtype("[[X<[X]>]]","[any]|any");
	}
	@Test public void test_1627() {
		checkNotSubtype("[[X<[X]>]]","X<[X]>|any");
	}
	@Test public void test_1628() {
		checkNotSubtype("[[X<[X]>]]","X<X|[any]>");
	}
	@Test public void test_1629() {
		checkNotSubtype("[[X<[X]>]]","[null]|null");
	}
	@Test public void test_1630() {
		checkNotSubtype("[[X<[X]>]]","X<[X]>|null");
	}
	@Test public void test_1631() {
		checkNotSubtype("[[X<[X]>]]","X<X|[null]>");
	}
	@Test public void test_1632() {
		checkNotSubtype("[[X<[X]>]]","[int]|int");
	}
	@Test public void test_1633() {
		checkNotSubtype("[[X<[X]>]]","X<[X]>|int");
	}
	@Test public void test_1634() {
		checkNotSubtype("[[X<[X]>]]","X<X|[int]>");
	}
	@Test public void test_1635() {
		checkIsSubtype("[[X<[X]>]]","[X<[X]>]|X<[X]>");
	}
	@Test public void test_1636() {
		checkIsSubtype("[[X<[X]>]]","X<[X]>|Y<[Y]>");
	}
	@Test public void test_1637() {
		checkIsSubtype("[[X<[X]>]]","X<[X]>|[X<[X]>]");
	}
	@Test public void test_1638() {
		checkIsSubtype("[[X<[X]>]]","X<X|[Y<[Y]>]>");
	}
	@Test public void test_1639() {
		checkIsSubtype("[[X<[X]>]]","X<X|[[X]]>");
	}
	@Test public void test_1640() {
		checkIsSubtype("[[X<[X]>]]","X<[X]>|(Y<X<[X]>|Y>)");
	}
	@Test public void test_1641() {
		checkIsSubtype("[[X<[X]>]]","X<X|[Y<X|Y>]>");
	}
	@Test public void test_1642() {
		checkIsSubtype("[[X<[X]>]]","(X<X|void>)|void");
	}
	@Test public void test_1643() {
		checkIsSubtype("[[X<[X]>]]","X<X|(Y<Y|void>)>");
	}
	@Test public void test_1644() {
		checkNotSubtype("[[X<[X]>]]","(X<X|any>)|any");
	}
	@Test public void test_1645() {
		checkNotSubtype("[[X<[X]>]]","X<X|(Y<Y|any>)>");
	}
	@Test public void test_1646() {
		checkNotSubtype("[[X<[X]>]]","(X<X|null>)|null");
	}
	@Test public void test_1647() {
		checkNotSubtype("[[X<[X]>]]","X<X|(Y<Y|null>)>");
	}
	@Test public void test_1648() {
		checkNotSubtype("[[X<[X]>]]","(X<X|int>)|int");
	}
	@Test public void test_1649() {
		checkNotSubtype("[[X<[X]>]]","X<X|(Y<Y|int>)>");
	}
	@Test public void test_1650() {
		checkIsSubtype("[[X<[X]>]]","(X<X|Y<[Y]>>)|Y<[Y]>");
	}
	@Test public void test_1651() {
		checkIsSubtype("[[X<[X]>]]","X<X|(Y<Y|Z<[Z]>>)>");
	}
	@Test public void test_1652() {
		checkIsSubtype("[[X<[X]>]]","X<X|(Y<Y|[X]>)>");
	}
	@Test public void test_1653() {
		checkIsSubtype("[[X<[X]>]]","X<X|(Y<Y|(Z<X|Z>)>)>");
	}
	@Test public void test_1654() {
		checkNotSubtype("X<[[[X]]]>","any");
	}
	@Test public void test_1655() {
		checkNotSubtype("X<[[[X]]]>","null");
	}
	@Test public void test_1656() {
		checkNotSubtype("X<[[[X]]]>","int");
	}
	@Test public void test_1657() {
		checkIsSubtype("X<[[[X]]]>","X<[X]>");
	}
	@Test public void test_1658() {
		checkIsSubtype("X<[[[X]]]>","[void]");
	}
	@Test public void test_1659() {
		checkNotSubtype("X<[[[X]]]>","[any]");
	}
	@Test public void test_1660() {
		checkNotSubtype("X<[[[X]]]>","[null]");
	}
	@Test public void test_1661() {
		checkNotSubtype("X<[[[X]]]>","[int]");
	}
	@Test public void test_1662() {
		checkIsSubtype("X<[[[X]]]>","[X<[X]>]");
	}
	@Test public void test_1663() {
		checkIsSubtype("X<[[[X]]]>","X<X|void>");
	}
	@Test public void test_1664() {
		checkNotSubtype("X<[[[X]]]>","X<X|any>");
	}
	@Test public void test_1665() {
		checkNotSubtype("X<[[[X]]]>","X<X|null>");
	}
	@Test public void test_1666() {
		checkNotSubtype("X<[[[X]]]>","X<X|int>");
	}
	@Test public void test_1667() {
		checkIsSubtype("X<[[[X]]]>","X<X|Y<[Y]>>");
	}
	@Test public void test_1668() {
		checkIsSubtype("X<[[[X]]]>","[[void]]");
	}
	@Test public void test_1669() {
		checkNotSubtype("X<[[[X]]]>","[[any]]");
	}
	@Test public void test_1670() {
		checkNotSubtype("X<[[[X]]]>","[[null]]");
	}
	@Test public void test_1671() {
		checkNotSubtype("X<[[[X]]]>","[[int]]");
	}
	@Test public void test_1672() {
		checkIsSubtype("X<[[[X]]]>","[[X<[X]>]]");
	}
	@Test public void test_1673() {
		checkIsSubtype("X<[[[X]]]>","X<[[[X]]]>");
	}
	@Test public void test_1674() {
		checkIsSubtype("X<[[[X]]]>","X<[[Y<X|Y>]]>");
	}
	@Test public void test_1675() {
		checkIsSubtype("X<[[[X]]]>","[X<X|void>]");
	}
	@Test public void test_1676() {
		checkNotSubtype("X<[[[X]]]>","[X<X|any>]");
	}
	@Test public void test_1677() {
		checkNotSubtype("X<[[[X]]]>","[X<X|null>]");
	}
	@Test public void test_1678() {
		checkNotSubtype("X<[[[X]]]>","[X<X|int>]");
	}
	@Test public void test_1679() {
		checkIsSubtype("X<[[[X]]]>","[X<X|Y<[Y]>>]");
	}
	@Test public void test_1680() {
		checkIsSubtype("X<[[[X]]]>","X<[Y<Y|[X]>]>");
	}
	@Test public void test_1681() {
		checkIsSubtype("X<[[[X]]]>","X<[Y<Y|(Z<X|Z>)>]>");
	}
	@Test public void test_1682() {
		checkIsSubtype("X<[[[X]]]>","void|void");
	}
	@Test public void test_1683() {
		checkNotSubtype("X<[[[X]]]>","void|any");
	}
	@Test public void test_1684() {
		checkNotSubtype("X<[[[X]]]>","void|null");
	}
	@Test public void test_1685() {
		checkNotSubtype("X<[[[X]]]>","void|int");
	}
	@Test public void test_1686() {
		checkIsSubtype("X<[[[X]]]>","void|X<[X]>");
	}
	@Test public void test_1687() {
		checkIsSubtype("X<[[[X]]]>","void|[void]");
	}
	@Test public void test_1688() {
		checkIsSubtype("X<[[[X]]]>","void|(X<void|X>)");
	}
	@Test public void test_1689() {
		checkNotSubtype("X<[[[X]]]>","any|void");
	}
	@Test public void test_1690() {
		checkNotSubtype("X<[[[X]]]>","any|any");
	}
	@Test public void test_1691() {
		checkNotSubtype("X<[[[X]]]>","any|null");
	}
	@Test public void test_1692() {
		checkNotSubtype("X<[[[X]]]>","any|int");
	}
	@Test public void test_1693() {
		checkNotSubtype("X<[[[X]]]>","any|X<[X]>");
	}
	@Test public void test_1694() {
		checkNotSubtype("X<[[[X]]]>","any|[any]");
	}
	@Test public void test_1695() {
		checkNotSubtype("X<[[[X]]]>","any|(X<any|X>)");
	}
	@Test public void test_1696() {
		checkNotSubtype("X<[[[X]]]>","null|void");
	}
	@Test public void test_1697() {
		checkNotSubtype("X<[[[X]]]>","null|any");
	}
	@Test public void test_1698() {
		checkNotSubtype("X<[[[X]]]>","null|null");
	}
	@Test public void test_1699() {
		checkNotSubtype("X<[[[X]]]>","null|int");
	}
	@Test public void test_1700() {
		checkNotSubtype("X<[[[X]]]>","null|X<[X]>");
	}
	@Test public void test_1701() {
		checkNotSubtype("X<[[[X]]]>","null|[null]");
	}
	@Test public void test_1702() {
		checkNotSubtype("X<[[[X]]]>","null|(X<null|X>)");
	}
	@Test public void test_1703() {
		checkNotSubtype("X<[[[X]]]>","int|void");
	}
	@Test public void test_1704() {
		checkNotSubtype("X<[[[X]]]>","int|any");
	}
	@Test public void test_1705() {
		checkNotSubtype("X<[[[X]]]>","int|null");
	}
	@Test public void test_1706() {
		checkNotSubtype("X<[[[X]]]>","int|int");
	}
	@Test public void test_1707() {
		checkNotSubtype("X<[[[X]]]>","int|X<[X]>");
	}
	@Test public void test_1708() {
		checkNotSubtype("X<[[[X]]]>","int|[int]");
	}
	@Test public void test_1709() {
		checkNotSubtype("X<[[[X]]]>","int|(X<int|X>)");
	}
	@Test public void test_1710() {
		checkIsSubtype("X<[[[X]]]>","[void]|void");
	}
	@Test public void test_1711() {
		checkIsSubtype("X<[[[X]]]>","X<[X]>|void");
	}
	@Test public void test_1712() {
		checkIsSubtype("X<[[[X]]]>","X<X|[void]>");
	}
	@Test public void test_1713() {
		checkNotSubtype("X<[[[X]]]>","[any]|any");
	}
	@Test public void test_1714() {
		checkNotSubtype("X<[[[X]]]>","X<[X]>|any");
	}
	@Test public void test_1715() {
		checkNotSubtype("X<[[[X]]]>","X<X|[any]>");
	}
	@Test public void test_1716() {
		checkNotSubtype("X<[[[X]]]>","[null]|null");
	}
	@Test public void test_1717() {
		checkNotSubtype("X<[[[X]]]>","X<[X]>|null");
	}
	@Test public void test_1718() {
		checkNotSubtype("X<[[[X]]]>","X<X|[null]>");
	}
	@Test public void test_1719() {
		checkNotSubtype("X<[[[X]]]>","[int]|int");
	}
	@Test public void test_1720() {
		checkNotSubtype("X<[[[X]]]>","X<[X]>|int");
	}
	@Test public void test_1721() {
		checkNotSubtype("X<[[[X]]]>","X<X|[int]>");
	}
	@Test public void test_1722() {
		checkIsSubtype("X<[[[X]]]>","[X<[X]>]|X<[X]>");
	}
	@Test public void test_1723() {
		checkIsSubtype("X<[[[X]]]>","X<[X]>|Y<[Y]>");
	}
	@Test public void test_1724() {
		checkIsSubtype("X<[[[X]]]>","X<[X]>|[X<[X]>]");
	}
	@Test public void test_1725() {
		checkIsSubtype("X<[[[X]]]>","X<X|[Y<[Y]>]>");
	}
	@Test public void test_1726() {
		checkIsSubtype("X<[[[X]]]>","X<X|[[X]]>");
	}
	@Test public void test_1727() {
		checkIsSubtype("X<[[[X]]]>","X<[X]>|(Y<X<[X]>|Y>)");
	}
	@Test public void test_1728() {
		checkIsSubtype("X<[[[X]]]>","X<X|[Y<X|Y>]>");
	}
	@Test public void test_1729() {
		checkIsSubtype("X<[[[X]]]>","(X<X|void>)|void");
	}
	@Test public void test_1730() {
		checkIsSubtype("X<[[[X]]]>","X<X|(Y<Y|void>)>");
	}
	@Test public void test_1731() {
		checkNotSubtype("X<[[[X]]]>","(X<X|any>)|any");
	}
	@Test public void test_1732() {
		checkNotSubtype("X<[[[X]]]>","X<X|(Y<Y|any>)>");
	}
	@Test public void test_1733() {
		checkNotSubtype("X<[[[X]]]>","(X<X|null>)|null");
	}
	@Test public void test_1734() {
		checkNotSubtype("X<[[[X]]]>","X<X|(Y<Y|null>)>");
	}
	@Test public void test_1735() {
		checkNotSubtype("X<[[[X]]]>","(X<X|int>)|int");
	}
	@Test public void test_1736() {
		checkNotSubtype("X<[[[X]]]>","X<X|(Y<Y|int>)>");
	}
	@Test public void test_1737() {
		checkIsSubtype("X<[[[X]]]>","(X<X|Y<[Y]>>)|Y<[Y]>");
	}
	@Test public void test_1738() {
		checkIsSubtype("X<[[[X]]]>","X<X|(Y<Y|Z<[Z]>>)>");
	}
	@Test public void test_1739() {
		checkIsSubtype("X<[[[X]]]>","X<X|(Y<Y|[X]>)>");
	}
	@Test public void test_1740() {
		checkIsSubtype("X<[[[X]]]>","X<X|(Y<Y|(Z<X|Z>)>)>");
	}
	@Test public void test_1741() {
		checkNotSubtype("X<[[Y<X|Y>]]>","any");
	}
	@Test public void test_1742() {
		checkNotSubtype("X<[[Y<X|Y>]]>","null");
	}
	@Test public void test_1743() {
		checkNotSubtype("X<[[Y<X|Y>]]>","int");
	}
	@Test public void test_1744() {
		checkIsSubtype("X<[[Y<X|Y>]]>","X<[X]>");
	}
	@Test public void test_1745() {
		checkIsSubtype("X<[[Y<X|Y>]]>","[void]");
	}
	@Test public void test_1746() {
		checkNotSubtype("X<[[Y<X|Y>]]>","[any]");
	}
	@Test public void test_1747() {
		checkNotSubtype("X<[[Y<X|Y>]]>","[null]");
	}
	@Test public void test_1748() {
		checkNotSubtype("X<[[Y<X|Y>]]>","[int]");
	}
	@Test public void test_1749() {
		checkIsSubtype("X<[[Y<X|Y>]]>","[X<[X]>]");
	}
	@Test public void test_1750() {
		checkIsSubtype("X<[[Y<X|Y>]]>","X<X|void>");
	}
	@Test public void test_1751() {
		checkNotSubtype("X<[[Y<X|Y>]]>","X<X|any>");
	}
	@Test public void test_1752() {
		checkNotSubtype("X<[[Y<X|Y>]]>","X<X|null>");
	}
	@Test public void test_1753() {
		checkNotSubtype("X<[[Y<X|Y>]]>","X<X|int>");
	}
	@Test public void test_1754() {
		checkIsSubtype("X<[[Y<X|Y>]]>","X<X|Y<[Y]>>");
	}
	@Test public void test_1755() {
		checkIsSubtype("X<[[Y<X|Y>]]>","[[void]]");
	}
	@Test public void test_1756() {
		checkNotSubtype("X<[[Y<X|Y>]]>","[[any]]");
	}
	@Test public void test_1757() {
		checkNotSubtype("X<[[Y<X|Y>]]>","[[null]]");
	}
	@Test public void test_1758() {
		checkNotSubtype("X<[[Y<X|Y>]]>","[[int]]");
	}
	@Test public void test_1759() {
		checkIsSubtype("X<[[Y<X|Y>]]>","[[X<[X]>]]");
	}
	@Test public void test_1760() {
		checkIsSubtype("X<[[Y<X|Y>]]>","X<[[[X]]]>");
	}
	@Test public void test_1761() {
		checkIsSubtype("X<[[Y<X|Y>]]>","X<[[Y<X|Y>]]>");
	}
	@Test public void test_1762() {
		checkIsSubtype("X<[[Y<X|Y>]]>","[X<X|void>]");
	}
	@Test public void test_1763() {
		checkNotSubtype("X<[[Y<X|Y>]]>","[X<X|any>]");
	}
	@Test public void test_1764() {
		checkNotSubtype("X<[[Y<X|Y>]]>","[X<X|null>]");
	}
	@Test public void test_1765() {
		checkNotSubtype("X<[[Y<X|Y>]]>","[X<X|int>]");
	}
	@Test public void test_1766() {
		checkIsSubtype("X<[[Y<X|Y>]]>","[X<X|Y<[Y]>>]");
	}
	@Test public void test_1767() {
		checkIsSubtype("X<[[Y<X|Y>]]>","X<[Y<Y|[X]>]>");
	}
	@Test public void test_1768() {
		checkIsSubtype("X<[[Y<X|Y>]]>","X<[Y<Y|(Z<X|Z>)>]>");
	}
	@Test public void test_1769() {
		checkIsSubtype("X<[[Y<X|Y>]]>","void|void");
	}
	@Test public void test_1770() {
		checkNotSubtype("X<[[Y<X|Y>]]>","void|any");
	}
	@Test public void test_1771() {
		checkNotSubtype("X<[[Y<X|Y>]]>","void|null");
	}
	@Test public void test_1772() {
		checkNotSubtype("X<[[Y<X|Y>]]>","void|int");
	}
	@Test public void test_1773() {
		checkIsSubtype("X<[[Y<X|Y>]]>","void|X<[X]>");
	}
	@Test public void test_1774() {
		checkIsSubtype("X<[[Y<X|Y>]]>","void|[void]");
	}
	@Test public void test_1775() {
		checkIsSubtype("X<[[Y<X|Y>]]>","void|(X<void|X>)");
	}
	@Test public void test_1776() {
		checkNotSubtype("X<[[Y<X|Y>]]>","any|void");
	}
	@Test public void test_1777() {
		checkNotSubtype("X<[[Y<X|Y>]]>","any|any");
	}
	@Test public void test_1778() {
		checkNotSubtype("X<[[Y<X|Y>]]>","any|null");
	}
	@Test public void test_1779() {
		checkNotSubtype("X<[[Y<X|Y>]]>","any|int");
	}
	@Test public void test_1780() {
		checkNotSubtype("X<[[Y<X|Y>]]>","any|X<[X]>");
	}
	@Test public void test_1781() {
		checkNotSubtype("X<[[Y<X|Y>]]>","any|[any]");
	}
	@Test public void test_1782() {
		checkNotSubtype("X<[[Y<X|Y>]]>","any|(X<any|X>)");
	}
	@Test public void test_1783() {
		checkNotSubtype("X<[[Y<X|Y>]]>","null|void");
	}
	@Test public void test_1784() {
		checkNotSubtype("X<[[Y<X|Y>]]>","null|any");
	}
	@Test public void test_1785() {
		checkNotSubtype("X<[[Y<X|Y>]]>","null|null");
	}
	@Test public void test_1786() {
		checkNotSubtype("X<[[Y<X|Y>]]>","null|int");
	}
	@Test public void test_1787() {
		checkNotSubtype("X<[[Y<X|Y>]]>","null|X<[X]>");
	}
	@Test public void test_1788() {
		checkNotSubtype("X<[[Y<X|Y>]]>","null|[null]");
	}
	@Test public void test_1789() {
		checkNotSubtype("X<[[Y<X|Y>]]>","null|(X<null|X>)");
	}
	@Test public void test_1790() {
		checkNotSubtype("X<[[Y<X|Y>]]>","int|void");
	}
	@Test public void test_1791() {
		checkNotSubtype("X<[[Y<X|Y>]]>","int|any");
	}
	@Test public void test_1792() {
		checkNotSubtype("X<[[Y<X|Y>]]>","int|null");
	}
	@Test public void test_1793() {
		checkNotSubtype("X<[[Y<X|Y>]]>","int|int");
	}
	@Test public void test_1794() {
		checkNotSubtype("X<[[Y<X|Y>]]>","int|X<[X]>");
	}
	@Test public void test_1795() {
		checkNotSubtype("X<[[Y<X|Y>]]>","int|[int]");
	}
	@Test public void test_1796() {
		checkNotSubtype("X<[[Y<X|Y>]]>","int|(X<int|X>)");
	}
	@Test public void test_1797() {
		checkIsSubtype("X<[[Y<X|Y>]]>","[void]|void");
	}
	@Test public void test_1798() {
		checkIsSubtype("X<[[Y<X|Y>]]>","X<[X]>|void");
	}
	@Test public void test_1799() {
		checkIsSubtype("X<[[Y<X|Y>]]>","X<X|[void]>");
	}
	@Test public void test_1800() {
		checkNotSubtype("X<[[Y<X|Y>]]>","[any]|any");
	}
	@Test public void test_1801() {
		checkNotSubtype("X<[[Y<X|Y>]]>","X<[X]>|any");
	}
	@Test public void test_1802() {
		checkNotSubtype("X<[[Y<X|Y>]]>","X<X|[any]>");
	}
	@Test public void test_1803() {
		checkNotSubtype("X<[[Y<X|Y>]]>","[null]|null");
	}
	@Test public void test_1804() {
		checkNotSubtype("X<[[Y<X|Y>]]>","X<[X]>|null");
	}
	@Test public void test_1805() {
		checkNotSubtype("X<[[Y<X|Y>]]>","X<X|[null]>");
	}
	@Test public void test_1806() {
		checkNotSubtype("X<[[Y<X|Y>]]>","[int]|int");
	}
	@Test public void test_1807() {
		checkNotSubtype("X<[[Y<X|Y>]]>","X<[X]>|int");
	}
	@Test public void test_1808() {
		checkNotSubtype("X<[[Y<X|Y>]]>","X<X|[int]>");
	}
	@Test public void test_1809() {
		checkIsSubtype("X<[[Y<X|Y>]]>","[X<[X]>]|X<[X]>");
	}
	@Test public void test_1810() {
		checkIsSubtype("X<[[Y<X|Y>]]>","X<[X]>|Y<[Y]>");
	}
	@Test public void test_1811() {
		checkIsSubtype("X<[[Y<X|Y>]]>","X<[X]>|[X<[X]>]");
	}
	@Test public void test_1812() {
		checkIsSubtype("X<[[Y<X|Y>]]>","X<X|[Y<[Y]>]>");
	}
	@Test public void test_1813() {
		checkIsSubtype("X<[[Y<X|Y>]]>","X<X|[[X]]>");
	}
	@Test public void test_1814() {
		checkIsSubtype("X<[[Y<X|Y>]]>","X<[X]>|(Y<X<[X]>|Y>)");
	}
	@Test public void test_1815() {
		checkIsSubtype("X<[[Y<X|Y>]]>","X<X|[Y<X|Y>]>");
	}
	@Test public void test_1816() {
		checkIsSubtype("X<[[Y<X|Y>]]>","(X<X|void>)|void");
	}
	@Test public void test_1817() {
		checkIsSubtype("X<[[Y<X|Y>]]>","X<X|(Y<Y|void>)>");
	}
	@Test public void test_1818() {
		checkNotSubtype("X<[[Y<X|Y>]]>","(X<X|any>)|any");
	}
	@Test public void test_1819() {
		checkNotSubtype("X<[[Y<X|Y>]]>","X<X|(Y<Y|any>)>");
	}
	@Test public void test_1820() {
		checkNotSubtype("X<[[Y<X|Y>]]>","(X<X|null>)|null");
	}
	@Test public void test_1821() {
		checkNotSubtype("X<[[Y<X|Y>]]>","X<X|(Y<Y|null>)>");
	}
	@Test public void test_1822() {
		checkNotSubtype("X<[[Y<X|Y>]]>","(X<X|int>)|int");
	}
	@Test public void test_1823() {
		checkNotSubtype("X<[[Y<X|Y>]]>","X<X|(Y<Y|int>)>");
	}
	@Test public void test_1824() {
		checkIsSubtype("X<[[Y<X|Y>]]>","(X<X|Y<[Y]>>)|Y<[Y]>");
	}
	@Test public void test_1825() {
		checkIsSubtype("X<[[Y<X|Y>]]>","X<X|(Y<Y|Z<[Z]>>)>");
	}
	@Test public void test_1826() {
		checkIsSubtype("X<[[Y<X|Y>]]>","X<X|(Y<Y|[X]>)>");
	}
	@Test public void test_1827() {
		checkIsSubtype("X<[[Y<X|Y>]]>","X<X|(Y<Y|(Z<X|Z>)>)>");
	}
	@Test public void test_1828() {
		checkNotSubtype("[X<X|void>]","any");
	}
	@Test public void test_1829() {
		checkNotSubtype("[X<X|void>]","null");
	}
	@Test public void test_1830() {
		checkNotSubtype("[X<X|void>]","int");
	}
	@Test public void test_1831() {
		checkNotSubtype("[X<X|void>]","X<[X]>");
	}
	@Test public void test_1832() {
		checkIsSubtype("[X<X|void>]","[void]");
	}
	@Test public void test_1833() {
		checkNotSubtype("[X<X|void>]","[any]");
	}
	@Test public void test_1834() {
		checkNotSubtype("[X<X|void>]","[null]");
	}
	@Test public void test_1835() {
		checkNotSubtype("[X<X|void>]","[int]");
	}
	@Test public void test_1836() {
		checkNotSubtype("[X<X|void>]","[X<[X]>]");
	}
	@Test public void test_1837() {
		checkIsSubtype("[X<X|void>]","X<X|void>");
	}
	@Test public void test_1838() {
		checkNotSubtype("[X<X|void>]","X<X|any>");
	}
	@Test public void test_1839() {
		checkNotSubtype("[X<X|void>]","X<X|null>");
	}
	@Test public void test_1840() {
		checkNotSubtype("[X<X|void>]","X<X|int>");
	}
	@Test public void test_1841() {
		checkNotSubtype("[X<X|void>]","X<X|Y<[Y]>>");
	}
	@Test public void test_1842() {
		checkNotSubtype("[X<X|void>]","[[void]]");
	}
	@Test public void test_1843() {
		checkNotSubtype("[X<X|void>]","[[any]]");
	}
	@Test public void test_1844() {
		checkNotSubtype("[X<X|void>]","[[null]]");
	}
	@Test public void test_1845() {
		checkNotSubtype("[X<X|void>]","[[int]]");
	}
	@Test public void test_1846() {
		checkNotSubtype("[X<X|void>]","[[X<[X]>]]");
	}
	@Test public void test_1847() {
		checkNotSubtype("[X<X|void>]","X<[[[X]]]>");
	}
	@Test public void test_1848() {
		checkNotSubtype("[X<X|void>]","X<[[Y<X|Y>]]>");
	}
	@Test public void test_1849() {
		checkIsSubtype("[X<X|void>]","[X<X|void>]");
	}
	@Test public void test_1850() {
		checkNotSubtype("[X<X|void>]","[X<X|any>]");
	}
	@Test public void test_1851() {
		checkNotSubtype("[X<X|void>]","[X<X|null>]");
	}
	@Test public void test_1852() {
		checkNotSubtype("[X<X|void>]","[X<X|int>]");
	}
	@Test public void test_1853() {
		checkNotSubtype("[X<X|void>]","[X<X|Y<[Y]>>]");
	}
	@Test public void test_1854() {
		checkNotSubtype("[X<X|void>]","X<[Y<Y|[X]>]>");
	}
	@Test public void test_1855() {
		checkNotSubtype("[X<X|void>]","X<[Y<Y|(Z<X|Z>)>]>");
	}
	@Test public void test_1856() {
		checkIsSubtype("[X<X|void>]","void|void");
	}
	@Test public void test_1857() {
		checkNotSubtype("[X<X|void>]","void|any");
	}
	@Test public void test_1858() {
		checkNotSubtype("[X<X|void>]","void|null");
	}
	@Test public void test_1859() {
		checkNotSubtype("[X<X|void>]","void|int");
	}
	@Test public void test_1860() {
		checkNotSubtype("[X<X|void>]","void|X<[X]>");
	}
	@Test public void test_1861() {
		checkIsSubtype("[X<X|void>]","void|[void]");
	}
	@Test public void test_1862() {
		checkIsSubtype("[X<X|void>]","void|(X<void|X>)");
	}
	@Test public void test_1863() {
		checkNotSubtype("[X<X|void>]","any|void");
	}
	@Test public void test_1864() {
		checkNotSubtype("[X<X|void>]","any|any");
	}
	@Test public void test_1865() {
		checkNotSubtype("[X<X|void>]","any|null");
	}
	@Test public void test_1866() {
		checkNotSubtype("[X<X|void>]","any|int");
	}
	@Test public void test_1867() {
		checkNotSubtype("[X<X|void>]","any|X<[X]>");
	}
	@Test public void test_1868() {
		checkNotSubtype("[X<X|void>]","any|[any]");
	}
	@Test public void test_1869() {
		checkNotSubtype("[X<X|void>]","any|(X<any|X>)");
	}
	@Test public void test_1870() {
		checkNotSubtype("[X<X|void>]","null|void");
	}
	@Test public void test_1871() {
		checkNotSubtype("[X<X|void>]","null|any");
	}
	@Test public void test_1872() {
		checkNotSubtype("[X<X|void>]","null|null");
	}
	@Test public void test_1873() {
		checkNotSubtype("[X<X|void>]","null|int");
	}
	@Test public void test_1874() {
		checkNotSubtype("[X<X|void>]","null|X<[X]>");
	}
	@Test public void test_1875() {
		checkNotSubtype("[X<X|void>]","null|[null]");
	}
	@Test public void test_1876() {
		checkNotSubtype("[X<X|void>]","null|(X<null|X>)");
	}
	@Test public void test_1877() {
		checkNotSubtype("[X<X|void>]","int|void");
	}
	@Test public void test_1878() {
		checkNotSubtype("[X<X|void>]","int|any");
	}
	@Test public void test_1879() {
		checkNotSubtype("[X<X|void>]","int|null");
	}
	@Test public void test_1880() {
		checkNotSubtype("[X<X|void>]","int|int");
	}
	@Test public void test_1881() {
		checkNotSubtype("[X<X|void>]","int|X<[X]>");
	}
	@Test public void test_1882() {
		checkNotSubtype("[X<X|void>]","int|[int]");
	}
	@Test public void test_1883() {
		checkNotSubtype("[X<X|void>]","int|(X<int|X>)");
	}
	@Test public void test_1884() {
		checkIsSubtype("[X<X|void>]","[void]|void");
	}
	@Test public void test_1885() {
		checkNotSubtype("[X<X|void>]","X<[X]>|void");
	}
	@Test public void test_1886() {
		checkIsSubtype("[X<X|void>]","X<X|[void]>");
	}
	@Test public void test_1887() {
		checkNotSubtype("[X<X|void>]","[any]|any");
	}
	@Test public void test_1888() {
		checkNotSubtype("[X<X|void>]","X<[X]>|any");
	}
	@Test public void test_1889() {
		checkNotSubtype("[X<X|void>]","X<X|[any]>");
	}
	@Test public void test_1890() {
		checkNotSubtype("[X<X|void>]","[null]|null");
	}
	@Test public void test_1891() {
		checkNotSubtype("[X<X|void>]","X<[X]>|null");
	}
	@Test public void test_1892() {
		checkNotSubtype("[X<X|void>]","X<X|[null]>");
	}
	@Test public void test_1893() {
		checkNotSubtype("[X<X|void>]","[int]|int");
	}
	@Test public void test_1894() {
		checkNotSubtype("[X<X|void>]","X<[X]>|int");
	}
	@Test public void test_1895() {
		checkNotSubtype("[X<X|void>]","X<X|[int]>");
	}
	@Test public void test_1896() {
		checkNotSubtype("[X<X|void>]","[X<[X]>]|X<[X]>");
	}
	@Test public void test_1897() {
		checkNotSubtype("[X<X|void>]","X<[X]>|Y<[Y]>");
	}
	@Test public void test_1898() {
		checkNotSubtype("[X<X|void>]","X<[X]>|[X<[X]>]");
	}
	@Test public void test_1899() {
		checkNotSubtype("[X<X|void>]","X<X|[Y<[Y]>]>");
	}
	@Test public void test_1900() {
		checkNotSubtype("[X<X|void>]","X<X|[[X]]>");
	}
	@Test public void test_1901() {
		checkNotSubtype("[X<X|void>]","X<[X]>|(Y<X<[X]>|Y>)");
	}
	@Test public void test_1902() {
		checkNotSubtype("[X<X|void>]","X<X|[Y<X|Y>]>");
	}
	@Test public void test_1903() {
		checkIsSubtype("[X<X|void>]","(X<X|void>)|void");
	}
	@Test public void test_1904() {
		checkIsSubtype("[X<X|void>]","X<X|(Y<Y|void>)>");
	}
	@Test public void test_1905() {
		checkNotSubtype("[X<X|void>]","(X<X|any>)|any");
	}
	@Test public void test_1906() {
		checkNotSubtype("[X<X|void>]","X<X|(Y<Y|any>)>");
	}
	@Test public void test_1907() {
		checkNotSubtype("[X<X|void>]","(X<X|null>)|null");
	}
	@Test public void test_1908() {
		checkNotSubtype("[X<X|void>]","X<X|(Y<Y|null>)>");
	}
	@Test public void test_1909() {
		checkNotSubtype("[X<X|void>]","(X<X|int>)|int");
	}
	@Test public void test_1910() {
		checkNotSubtype("[X<X|void>]","X<X|(Y<Y|int>)>");
	}
	@Test public void test_1911() {
		checkNotSubtype("[X<X|void>]","(X<X|Y<[Y]>>)|Y<[Y]>");
	}
	@Test public void test_1912() {
		checkNotSubtype("[X<X|void>]","X<X|(Y<Y|Z<[Z]>>)>");
	}
	@Test public void test_1913() {
		checkNotSubtype("[X<X|void>]","X<X|(Y<Y|[X]>)>");
	}
	@Test public void test_1914() {
		checkIsSubtype("[X<X|void>]","X<X|(Y<Y|(Z<X|Z>)>)>");
	}
	@Test public void test_1915() {
		checkNotSubtype("[X<X|any>]","any");
	}
	@Test public void test_1916() {
		checkNotSubtype("[X<X|any>]","null");
	}
	@Test public void test_1917() {
		checkNotSubtype("[X<X|any>]","int");
	}
	@Test public void test_1918() {
		checkIsSubtype("[X<X|any>]","X<[X]>");
	}
	@Test public void test_1919() {
		checkIsSubtype("[X<X|any>]","[void]");
	}
	@Test public void test_1920() {
		checkIsSubtype("[X<X|any>]","[any]");
	}
	@Test public void test_1921() {
		checkIsSubtype("[X<X|any>]","[null]");
	}
	@Test public void test_1922() {
		checkIsSubtype("[X<X|any>]","[int]");
	}
	@Test public void test_1923() {
		checkIsSubtype("[X<X|any>]","[X<[X]>]");
	}
	@Test public void test_1924() {
		checkIsSubtype("[X<X|any>]","X<X|void>");
	}
	@Test public void test_1925() {
		checkNotSubtype("[X<X|any>]","X<X|any>");
	}
	@Test public void test_1926() {
		checkNotSubtype("[X<X|any>]","X<X|null>");
	}
	@Test public void test_1927() {
		checkNotSubtype("[X<X|any>]","X<X|int>");
	}
	@Test public void test_1928() {
		checkIsSubtype("[X<X|any>]","X<X|Y<[Y]>>");
	}
	@Test public void test_1929() {
		checkIsSubtype("[X<X|any>]","[[void]]");
	}
	@Test public void test_1930() {
		checkIsSubtype("[X<X|any>]","[[any]]");
	}
	@Test public void test_1931() {
		checkIsSubtype("[X<X|any>]","[[null]]");
	}
	@Test public void test_1932() {
		checkIsSubtype("[X<X|any>]","[[int]]");
	}
	@Test public void test_1933() {
		checkIsSubtype("[X<X|any>]","[[X<[X]>]]");
	}
	@Test public void test_1934() {
		checkIsSubtype("[X<X|any>]","X<[[[X]]]>");
	}
	@Test public void test_1935() {
		checkIsSubtype("[X<X|any>]","X<[[Y<X|Y>]]>");
	}
	@Test public void test_1936() {
		checkIsSubtype("[X<X|any>]","[X<X|void>]");
	}
	@Test public void test_1937() {
		checkIsSubtype("[X<X|any>]","[X<X|any>]");
	}
	@Test public void test_1938() {
		checkIsSubtype("[X<X|any>]","[X<X|null>]");
	}
	@Test public void test_1939() {
		checkIsSubtype("[X<X|any>]","[X<X|int>]");
	}
	@Test public void test_1940() {
		checkIsSubtype("[X<X|any>]","[X<X|Y<[Y]>>]");
	}
	@Test public void test_1941() {
		checkIsSubtype("[X<X|any>]","X<[Y<Y|[X]>]>");
	}
	@Test public void test_1942() {
		checkIsSubtype("[X<X|any>]","X<[Y<Y|(Z<X|Z>)>]>");
	}
	@Test public void test_1943() {
		checkIsSubtype("[X<X|any>]","void|void");
	}
	@Test public void test_1944() {
		checkNotSubtype("[X<X|any>]","void|any");
	}
	@Test public void test_1945() {
		checkNotSubtype("[X<X|any>]","void|null");
	}
	@Test public void test_1946() {
		checkNotSubtype("[X<X|any>]","void|int");
	}
	@Test public void test_1947() {
		checkIsSubtype("[X<X|any>]","void|X<[X]>");
	}
	@Test public void test_1948() {
		checkIsSubtype("[X<X|any>]","void|[void]");
	}
	@Test public void test_1949() {
		checkIsSubtype("[X<X|any>]","void|(X<void|X>)");
	}
	@Test public void test_1950() {
		checkNotSubtype("[X<X|any>]","any|void");
	}
	@Test public void test_1951() {
		checkNotSubtype("[X<X|any>]","any|any");
	}
	@Test public void test_1952() {
		checkNotSubtype("[X<X|any>]","any|null");
	}
	@Test public void test_1953() {
		checkNotSubtype("[X<X|any>]","any|int");
	}
	@Test public void test_1954() {
		checkNotSubtype("[X<X|any>]","any|X<[X]>");
	}
	@Test public void test_1955() {
		checkNotSubtype("[X<X|any>]","any|[any]");
	}
	@Test public void test_1956() {
		checkNotSubtype("[X<X|any>]","any|(X<any|X>)");
	}
	@Test public void test_1957() {
		checkNotSubtype("[X<X|any>]","null|void");
	}
	@Test public void test_1958() {
		checkNotSubtype("[X<X|any>]","null|any");
	}
	@Test public void test_1959() {
		checkNotSubtype("[X<X|any>]","null|null");
	}
	@Test public void test_1960() {
		checkNotSubtype("[X<X|any>]","null|int");
	}
	@Test public void test_1961() {
		checkNotSubtype("[X<X|any>]","null|X<[X]>");
	}
	@Test public void test_1962() {
		checkNotSubtype("[X<X|any>]","null|[null]");
	}
	@Test public void test_1963() {
		checkNotSubtype("[X<X|any>]","null|(X<null|X>)");
	}
	@Test public void test_1964() {
		checkNotSubtype("[X<X|any>]","int|void");
	}
	@Test public void test_1965() {
		checkNotSubtype("[X<X|any>]","int|any");
	}
	@Test public void test_1966() {
		checkNotSubtype("[X<X|any>]","int|null");
	}
	@Test public void test_1967() {
		checkNotSubtype("[X<X|any>]","int|int");
	}
	@Test public void test_1968() {
		checkNotSubtype("[X<X|any>]","int|X<[X]>");
	}
	@Test public void test_1969() {
		checkNotSubtype("[X<X|any>]","int|[int]");
	}
	@Test public void test_1970() {
		checkNotSubtype("[X<X|any>]","int|(X<int|X>)");
	}
	@Test public void test_1971() {
		checkIsSubtype("[X<X|any>]","[void]|void");
	}
	@Test public void test_1972() {
		checkIsSubtype("[X<X|any>]","X<[X]>|void");
	}
	@Test public void test_1973() {
		checkIsSubtype("[X<X|any>]","X<X|[void]>");
	}
	@Test public void test_1974() {
		checkNotSubtype("[X<X|any>]","[any]|any");
	}
	@Test public void test_1975() {
		checkNotSubtype("[X<X|any>]","X<[X]>|any");
	}
	@Test public void test_1976() {
		checkIsSubtype("[X<X|any>]","X<X|[any]>");
	}
	@Test public void test_1977() {
		checkNotSubtype("[X<X|any>]","[null]|null");
	}
	@Test public void test_1978() {
		checkNotSubtype("[X<X|any>]","X<[X]>|null");
	}
	@Test public void test_1979() {
		checkIsSubtype("[X<X|any>]","X<X|[null]>");
	}
	@Test public void test_1980() {
		checkNotSubtype("[X<X|any>]","[int]|int");
	}
	@Test public void test_1981() {
		checkNotSubtype("[X<X|any>]","X<[X]>|int");
	}
	@Test public void test_1982() {
		checkIsSubtype("[X<X|any>]","X<X|[int]>");
	}
	@Test public void test_1983() {
		checkIsSubtype("[X<X|any>]","[X<[X]>]|X<[X]>");
	}
	@Test public void test_1984() {
		checkIsSubtype("[X<X|any>]","X<[X]>|Y<[Y]>");
	}
	@Test public void test_1985() {
		checkIsSubtype("[X<X|any>]","X<[X]>|[X<[X]>]");
	}
	@Test public void test_1986() {
		checkIsSubtype("[X<X|any>]","X<X|[Y<[Y]>]>");
	}
	@Test public void test_1987() {
		checkIsSubtype("[X<X|any>]","X<X|[[X]]>");
	}
	@Test public void test_1988() {
		checkIsSubtype("[X<X|any>]","X<[X]>|(Y<X<[X]>|Y>)");
	}
	@Test public void test_1989() {
		checkIsSubtype("[X<X|any>]","X<X|[Y<X|Y>]>");
	}
	@Test public void test_1990() {
		checkIsSubtype("[X<X|any>]","(X<X|void>)|void");
	}
	@Test public void test_1991() {
		checkIsSubtype("[X<X|any>]","X<X|(Y<Y|void>)>");
	}
	@Test public void test_1992() {
		checkNotSubtype("[X<X|any>]","(X<X|any>)|any");
	}
	@Test public void test_1993() {
		checkNotSubtype("[X<X|any>]","X<X|(Y<Y|any>)>");
	}
	@Test public void test_1994() {
		checkNotSubtype("[X<X|any>]","(X<X|null>)|null");
	}
	@Test public void test_1995() {
		checkNotSubtype("[X<X|any>]","X<X|(Y<Y|null>)>");
	}
	@Test public void test_1996() {
		checkNotSubtype("[X<X|any>]","(X<X|int>)|int");
	}
	@Test public void test_1997() {
		checkNotSubtype("[X<X|any>]","X<X|(Y<Y|int>)>");
	}
	@Test public void test_1998() {
		checkIsSubtype("[X<X|any>]","(X<X|Y<[Y]>>)|Y<[Y]>");
	}
	@Test public void test_1999() {
		checkIsSubtype("[X<X|any>]","X<X|(Y<Y|Z<[Z]>>)>");
	}
	@Test public void test_2000() {
		checkIsSubtype("[X<X|any>]","X<X|(Y<Y|[X]>)>");
	}
	@Test public void test_2001() {
		checkIsSubtype("[X<X|any>]","X<X|(Y<Y|(Z<X|Z>)>)>");
	}
	@Test public void test_2002() {
		checkNotSubtype("[X<X|null>]","any");
	}
	@Test public void test_2003() {
		checkNotSubtype("[X<X|null>]","null");
	}
	@Test public void test_2004() {
		checkNotSubtype("[X<X|null>]","int");
	}
	@Test public void test_2005() {
		checkNotSubtype("[X<X|null>]","X<[X]>");
	}
	@Test public void test_2006() {
		checkIsSubtype("[X<X|null>]","[void]");
	}
	@Test public void test_2007() {
		checkNotSubtype("[X<X|null>]","[any]");
	}
	@Test public void test_2008() {
		checkIsSubtype("[X<X|null>]","[null]");
	}
	@Test public void test_2009() {
		checkNotSubtype("[X<X|null>]","[int]");
	}
	@Test public void test_2010() {
		checkNotSubtype("[X<X|null>]","[X<[X]>]");
	}
	@Test public void test_2011() {
		checkIsSubtype("[X<X|null>]","X<X|void>");
	}
	@Test public void test_2012() {
		checkNotSubtype("[X<X|null>]","X<X|any>");
	}
	@Test public void test_2013() {
		checkNotSubtype("[X<X|null>]","X<X|null>");
	}
	@Test public void test_2014() {
		checkNotSubtype("[X<X|null>]","X<X|int>");
	}
	@Test public void test_2015() {
		checkNotSubtype("[X<X|null>]","X<X|Y<[Y]>>");
	}
	@Test public void test_2016() {
		checkNotSubtype("[X<X|null>]","[[void]]");
	}
	@Test public void test_2017() {
		checkNotSubtype("[X<X|null>]","[[any]]");
	}
	@Test public void test_2018() {
		checkNotSubtype("[X<X|null>]","[[null]]");
	}
	@Test public void test_2019() {
		checkNotSubtype("[X<X|null>]","[[int]]");
	}
	@Test public void test_2020() {
		checkNotSubtype("[X<X|null>]","[[X<[X]>]]");
	}
	@Test public void test_2021() {
		checkNotSubtype("[X<X|null>]","X<[[[X]]]>");
	}
	@Test public void test_2022() {
		checkNotSubtype("[X<X|null>]","X<[[Y<X|Y>]]>");
	}
	@Test public void test_2023() {
		checkIsSubtype("[X<X|null>]","[X<X|void>]");
	}
	@Test public void test_2024() {
		checkNotSubtype("[X<X|null>]","[X<X|any>]");
	}
	@Test public void test_2025() {
		checkIsSubtype("[X<X|null>]","[X<X|null>]");
	}
	@Test public void test_2026() {
		checkNotSubtype("[X<X|null>]","[X<X|int>]");
	}
	@Test public void test_2027() {
		checkNotSubtype("[X<X|null>]","[X<X|Y<[Y]>>]");
	}
	@Test public void test_2028() {
		checkNotSubtype("[X<X|null>]","X<[Y<Y|[X]>]>");
	}
	@Test public void test_2029() {
		checkNotSubtype("[X<X|null>]","X<[Y<Y|(Z<X|Z>)>]>");
	}
	@Test public void test_2030() {
		checkIsSubtype("[X<X|null>]","void|void");
	}
	@Test public void test_2031() {
		checkNotSubtype("[X<X|null>]","void|any");
	}
	@Test public void test_2032() {
		checkNotSubtype("[X<X|null>]","void|null");
	}
	@Test public void test_2033() {
		checkNotSubtype("[X<X|null>]","void|int");
	}
	@Test public void test_2034() {
		checkNotSubtype("[X<X|null>]","void|X<[X]>");
	}
	@Test public void test_2035() {
		checkIsSubtype("[X<X|null>]","void|[void]");
	}
	@Test public void test_2036() {
		checkIsSubtype("[X<X|null>]","void|(X<void|X>)");
	}
	@Test public void test_2037() {
		checkNotSubtype("[X<X|null>]","any|void");
	}
	@Test public void test_2038() {
		checkNotSubtype("[X<X|null>]","any|any");
	}
	@Test public void test_2039() {
		checkNotSubtype("[X<X|null>]","any|null");
	}
	@Test public void test_2040() {
		checkNotSubtype("[X<X|null>]","any|int");
	}
	@Test public void test_2041() {
		checkNotSubtype("[X<X|null>]","any|X<[X]>");
	}
	@Test public void test_2042() {
		checkNotSubtype("[X<X|null>]","any|[any]");
	}
	@Test public void test_2043() {
		checkNotSubtype("[X<X|null>]","any|(X<any|X>)");
	}
	@Test public void test_2044() {
		checkNotSubtype("[X<X|null>]","null|void");
	}
	@Test public void test_2045() {
		checkNotSubtype("[X<X|null>]","null|any");
	}
	@Test public void test_2046() {
		checkNotSubtype("[X<X|null>]","null|null");
	}
	@Test public void test_2047() {
		checkNotSubtype("[X<X|null>]","null|int");
	}
	@Test public void test_2048() {
		checkNotSubtype("[X<X|null>]","null|X<[X]>");
	}
	@Test public void test_2049() {
		checkNotSubtype("[X<X|null>]","null|[null]");
	}
	@Test public void test_2050() {
		checkNotSubtype("[X<X|null>]","null|(X<null|X>)");
	}
	@Test public void test_2051() {
		checkNotSubtype("[X<X|null>]","int|void");
	}
	@Test public void test_2052() {
		checkNotSubtype("[X<X|null>]","int|any");
	}
	@Test public void test_2053() {
		checkNotSubtype("[X<X|null>]","int|null");
	}
	@Test public void test_2054() {
		checkNotSubtype("[X<X|null>]","int|int");
	}
	@Test public void test_2055() {
		checkNotSubtype("[X<X|null>]","int|X<[X]>");
	}
	@Test public void test_2056() {
		checkNotSubtype("[X<X|null>]","int|[int]");
	}
	@Test public void test_2057() {
		checkNotSubtype("[X<X|null>]","int|(X<int|X>)");
	}
	@Test public void test_2058() {
		checkIsSubtype("[X<X|null>]","[void]|void");
	}
	@Test public void test_2059() {
		checkNotSubtype("[X<X|null>]","X<[X]>|void");
	}
	@Test public void test_2060() {
		checkIsSubtype("[X<X|null>]","X<X|[void]>");
	}
	@Test public void test_2061() {
		checkNotSubtype("[X<X|null>]","[any]|any");
	}
	@Test public void test_2062() {
		checkNotSubtype("[X<X|null>]","X<[X]>|any");
	}
	@Test public void test_2063() {
		checkNotSubtype("[X<X|null>]","X<X|[any]>");
	}
	@Test public void test_2064() {
		checkNotSubtype("[X<X|null>]","[null]|null");
	}
	@Test public void test_2065() {
		checkNotSubtype("[X<X|null>]","X<[X]>|null");
	}
	@Test public void test_2066() {
		checkIsSubtype("[X<X|null>]","X<X|[null]>");
	}
	@Test public void test_2067() {
		checkNotSubtype("[X<X|null>]","[int]|int");
	}
	@Test public void test_2068() {
		checkNotSubtype("[X<X|null>]","X<[X]>|int");
	}
	@Test public void test_2069() {
		checkNotSubtype("[X<X|null>]","X<X|[int]>");
	}
	@Test public void test_2070() {
		checkNotSubtype("[X<X|null>]","[X<[X]>]|X<[X]>");
	}
	@Test public void test_2071() {
		checkNotSubtype("[X<X|null>]","X<[X]>|Y<[Y]>");
	}
	@Test public void test_2072() {
		checkNotSubtype("[X<X|null>]","X<[X]>|[X<[X]>]");
	}
	@Test public void test_2073() {
		checkNotSubtype("[X<X|null>]","X<X|[Y<[Y]>]>");
	}
	@Test public void test_2074() {
		checkNotSubtype("[X<X|null>]","X<X|[[X]]>");
	}
	@Test public void test_2075() {
		checkNotSubtype("[X<X|null>]","X<[X]>|(Y<X<[X]>|Y>)");
	}
	@Test public void test_2076() {
		checkNotSubtype("[X<X|null>]","X<X|[Y<X|Y>]>");
	}
	@Test public void test_2077() {
		checkIsSubtype("[X<X|null>]","(X<X|void>)|void");
	}
	@Test public void test_2078() {
		checkIsSubtype("[X<X|null>]","X<X|(Y<Y|void>)>");
	}
	@Test public void test_2079() {
		checkNotSubtype("[X<X|null>]","(X<X|any>)|any");
	}
	@Test public void test_2080() {
		checkNotSubtype("[X<X|null>]","X<X|(Y<Y|any>)>");
	}
	@Test public void test_2081() {
		checkNotSubtype("[X<X|null>]","(X<X|null>)|null");
	}
	@Test public void test_2082() {
		checkNotSubtype("[X<X|null>]","X<X|(Y<Y|null>)>");
	}
	@Test public void test_2083() {
		checkNotSubtype("[X<X|null>]","(X<X|int>)|int");
	}
	@Test public void test_2084() {
		checkNotSubtype("[X<X|null>]","X<X|(Y<Y|int>)>");
	}
	@Test public void test_2085() {
		checkNotSubtype("[X<X|null>]","(X<X|Y<[Y]>>)|Y<[Y]>");
	}
	@Test public void test_2086() {
		checkNotSubtype("[X<X|null>]","X<X|(Y<Y|Z<[Z]>>)>");
	}
	@Test public void test_2087() {
		checkNotSubtype("[X<X|null>]","X<X|(Y<Y|[X]>)>");
	}
	@Test public void test_2088() {
		checkIsSubtype("[X<X|null>]","X<X|(Y<Y|(Z<X|Z>)>)>");
	}
	@Test public void test_2089() {
		checkNotSubtype("[X<X|int>]","any");
	}
	@Test public void test_2090() {
		checkNotSubtype("[X<X|int>]","null");
	}
	@Test public void test_2091() {
		checkNotSubtype("[X<X|int>]","int");
	}
	@Test public void test_2092() {
		checkNotSubtype("[X<X|int>]","X<[X]>");
	}
	@Test public void test_2093() {
		checkIsSubtype("[X<X|int>]","[void]");
	}
	@Test public void test_2094() {
		checkNotSubtype("[X<X|int>]","[any]");
	}
	@Test public void test_2095() {
		checkNotSubtype("[X<X|int>]","[null]");
	}
	@Test public void test_2096() {
		checkIsSubtype("[X<X|int>]","[int]");
	}
	@Test public void test_2097() {
		checkNotSubtype("[X<X|int>]","[X<[X]>]");
	}
	@Test public void test_2098() {
		checkIsSubtype("[X<X|int>]","X<X|void>");
	}
	@Test public void test_2099() {
		checkNotSubtype("[X<X|int>]","X<X|any>");
	}
	@Test public void test_2100() {
		checkNotSubtype("[X<X|int>]","X<X|null>");
	}
	@Test public void test_2101() {
		checkNotSubtype("[X<X|int>]","X<X|int>");
	}
	@Test public void test_2102() {
		checkNotSubtype("[X<X|int>]","X<X|Y<[Y]>>");
	}
	@Test public void test_2103() {
		checkNotSubtype("[X<X|int>]","[[void]]");
	}
	@Test public void test_2104() {
		checkNotSubtype("[X<X|int>]","[[any]]");
	}
	@Test public void test_2105() {
		checkNotSubtype("[X<X|int>]","[[null]]");
	}
	@Test public void test_2106() {
		checkNotSubtype("[X<X|int>]","[[int]]");
	}
	@Test public void test_2107() {
		checkNotSubtype("[X<X|int>]","[[X<[X]>]]");
	}
	@Test public void test_2108() {
		checkNotSubtype("[X<X|int>]","X<[[[X]]]>");
	}
	@Test public void test_2109() {
		checkNotSubtype("[X<X|int>]","X<[[Y<X|Y>]]>");
	}
	@Test public void test_2110() {
		checkIsSubtype("[X<X|int>]","[X<X|void>]");
	}
	@Test public void test_2111() {
		checkNotSubtype("[X<X|int>]","[X<X|any>]");
	}
	@Test public void test_2112() {
		checkNotSubtype("[X<X|int>]","[X<X|null>]");
	}
	@Test public void test_2113() {
		checkIsSubtype("[X<X|int>]","[X<X|int>]");
	}
	@Test public void test_2114() {
		checkNotSubtype("[X<X|int>]","[X<X|Y<[Y]>>]");
	}
	@Test public void test_2115() {
		checkNotSubtype("[X<X|int>]","X<[Y<Y|[X]>]>");
	}
	@Test public void test_2116() {
		checkNotSubtype("[X<X|int>]","X<[Y<Y|(Z<X|Z>)>]>");
	}
	@Test public void test_2117() {
		checkIsSubtype("[X<X|int>]","void|void");
	}
	@Test public void test_2118() {
		checkNotSubtype("[X<X|int>]","void|any");
	}
	@Test public void test_2119() {
		checkNotSubtype("[X<X|int>]","void|null");
	}
	@Test public void test_2120() {
		checkNotSubtype("[X<X|int>]","void|int");
	}
	@Test public void test_2121() {
		checkNotSubtype("[X<X|int>]","void|X<[X]>");
	}
	@Test public void test_2122() {
		checkIsSubtype("[X<X|int>]","void|[void]");
	}
	@Test public void test_2123() {
		checkIsSubtype("[X<X|int>]","void|(X<void|X>)");
	}
	@Test public void test_2124() {
		checkNotSubtype("[X<X|int>]","any|void");
	}
	@Test public void test_2125() {
		checkNotSubtype("[X<X|int>]","any|any");
	}
	@Test public void test_2126() {
		checkNotSubtype("[X<X|int>]","any|null");
	}
	@Test public void test_2127() {
		checkNotSubtype("[X<X|int>]","any|int");
	}
	@Test public void test_2128() {
		checkNotSubtype("[X<X|int>]","any|X<[X]>");
	}
	@Test public void test_2129() {
		checkNotSubtype("[X<X|int>]","any|[any]");
	}
	@Test public void test_2130() {
		checkNotSubtype("[X<X|int>]","any|(X<any|X>)");
	}
	@Test public void test_2131() {
		checkNotSubtype("[X<X|int>]","null|void");
	}
	@Test public void test_2132() {
		checkNotSubtype("[X<X|int>]","null|any");
	}
	@Test public void test_2133() {
		checkNotSubtype("[X<X|int>]","null|null");
	}
	@Test public void test_2134() {
		checkNotSubtype("[X<X|int>]","null|int");
	}
	@Test public void test_2135() {
		checkNotSubtype("[X<X|int>]","null|X<[X]>");
	}
	@Test public void test_2136() {
		checkNotSubtype("[X<X|int>]","null|[null]");
	}
	@Test public void test_2137() {
		checkNotSubtype("[X<X|int>]","null|(X<null|X>)");
	}
	@Test public void test_2138() {
		checkNotSubtype("[X<X|int>]","int|void");
	}
	@Test public void test_2139() {
		checkNotSubtype("[X<X|int>]","int|any");
	}
	@Test public void test_2140() {
		checkNotSubtype("[X<X|int>]","int|null");
	}
	@Test public void test_2141() {
		checkNotSubtype("[X<X|int>]","int|int");
	}
	@Test public void test_2142() {
		checkNotSubtype("[X<X|int>]","int|X<[X]>");
	}
	@Test public void test_2143() {
		checkNotSubtype("[X<X|int>]","int|[int]");
	}
	@Test public void test_2144() {
		checkNotSubtype("[X<X|int>]","int|(X<int|X>)");
	}
	@Test public void test_2145() {
		checkIsSubtype("[X<X|int>]","[void]|void");
	}
	@Test public void test_2146() {
		checkNotSubtype("[X<X|int>]","X<[X]>|void");
	}
	@Test public void test_2147() {
		checkIsSubtype("[X<X|int>]","X<X|[void]>");
	}
	@Test public void test_2148() {
		checkNotSubtype("[X<X|int>]","[any]|any");
	}
	@Test public void test_2149() {
		checkNotSubtype("[X<X|int>]","X<[X]>|any");
	}
	@Test public void test_2150() {
		checkNotSubtype("[X<X|int>]","X<X|[any]>");
	}
	@Test public void test_2151() {
		checkNotSubtype("[X<X|int>]","[null]|null");
	}
	@Test public void test_2152() {
		checkNotSubtype("[X<X|int>]","X<[X]>|null");
	}
	@Test public void test_2153() {
		checkNotSubtype("[X<X|int>]","X<X|[null]>");
	}
	@Test public void test_2154() {
		checkNotSubtype("[X<X|int>]","[int]|int");
	}
	@Test public void test_2155() {
		checkNotSubtype("[X<X|int>]","X<[X]>|int");
	}
	@Test public void test_2156() {
		checkIsSubtype("[X<X|int>]","X<X|[int]>");
	}
	@Test public void test_2157() {
		checkNotSubtype("[X<X|int>]","[X<[X]>]|X<[X]>");
	}
	@Test public void test_2158() {
		checkNotSubtype("[X<X|int>]","X<[X]>|Y<[Y]>");
	}
	@Test public void test_2159() {
		checkNotSubtype("[X<X|int>]","X<[X]>|[X<[X]>]");
	}
	@Test public void test_2160() {
		checkNotSubtype("[X<X|int>]","X<X|[Y<[Y]>]>");
	}
	@Test public void test_2161() {
		checkNotSubtype("[X<X|int>]","X<X|[[X]]>");
	}
	@Test public void test_2162() {
		checkNotSubtype("[X<X|int>]","X<[X]>|(Y<X<[X]>|Y>)");
	}
	@Test public void test_2163() {
		checkNotSubtype("[X<X|int>]","X<X|[Y<X|Y>]>");
	}
	@Test public void test_2164() {
		checkIsSubtype("[X<X|int>]","(X<X|void>)|void");
	}
	@Test public void test_2165() {
		checkIsSubtype("[X<X|int>]","X<X|(Y<Y|void>)>");
	}
	@Test public void test_2166() {
		checkNotSubtype("[X<X|int>]","(X<X|any>)|any");
	}
	@Test public void test_2167() {
		checkNotSubtype("[X<X|int>]","X<X|(Y<Y|any>)>");
	}
	@Test public void test_2168() {
		checkNotSubtype("[X<X|int>]","(X<X|null>)|null");
	}
	@Test public void test_2169() {
		checkNotSubtype("[X<X|int>]","X<X|(Y<Y|null>)>");
	}
	@Test public void test_2170() {
		checkNotSubtype("[X<X|int>]","(X<X|int>)|int");
	}
	@Test public void test_2171() {
		checkNotSubtype("[X<X|int>]","X<X|(Y<Y|int>)>");
	}
	@Test public void test_2172() {
		checkNotSubtype("[X<X|int>]","(X<X|Y<[Y]>>)|Y<[Y]>");
	}
	@Test public void test_2173() {
		checkNotSubtype("[X<X|int>]","X<X|(Y<Y|Z<[Z]>>)>");
	}
	@Test public void test_2174() {
		checkNotSubtype("[X<X|int>]","X<X|(Y<Y|[X]>)>");
	}
	@Test public void test_2175() {
		checkIsSubtype("[X<X|int>]","X<X|(Y<Y|(Z<X|Z>)>)>");
	}
	@Test public void test_2176() {
		checkNotSubtype("[X<X|Y<[Y]>>]","any");
	}
	@Test public void test_2177() {
		checkNotSubtype("[X<X|Y<[Y]>>]","null");
	}
	@Test public void test_2178() {
		checkNotSubtype("[X<X|Y<[Y]>>]","int");
	}
	@Test public void test_2179() {
		checkIsSubtype("[X<X|Y<[Y]>>]","X<[X]>");
	}
	@Test public void test_2180() {
		checkIsSubtype("[X<X|Y<[Y]>>]","[void]");
	}
	@Test public void test_2181() {
		checkNotSubtype("[X<X|Y<[Y]>>]","[any]");
	}
	@Test public void test_2182() {
		checkNotSubtype("[X<X|Y<[Y]>>]","[null]");
	}
	@Test public void test_2183() {
		checkNotSubtype("[X<X|Y<[Y]>>]","[int]");
	}
	@Test public void test_2184() {
		checkIsSubtype("[X<X|Y<[Y]>>]","[X<[X]>]");
	}
	@Test public void test_2185() {
		checkIsSubtype("[X<X|Y<[Y]>>]","X<X|void>");
	}
	@Test public void test_2186() {
		checkNotSubtype("[X<X|Y<[Y]>>]","X<X|any>");
	}
	@Test public void test_2187() {
		checkNotSubtype("[X<X|Y<[Y]>>]","X<X|null>");
	}
	@Test public void test_2188() {
		checkNotSubtype("[X<X|Y<[Y]>>]","X<X|int>");
	}
	@Test public void test_2189() {
		checkIsSubtype("[X<X|Y<[Y]>>]","X<X|Y<[Y]>>");
	}
	@Test public void test_2190() {
		checkIsSubtype("[X<X|Y<[Y]>>]","[[void]]");
	}
	@Test public void test_2191() {
		checkNotSubtype("[X<X|Y<[Y]>>]","[[any]]");
	}
	@Test public void test_2192() {
		checkNotSubtype("[X<X|Y<[Y]>>]","[[null]]");
	}
	@Test public void test_2193() {
		checkNotSubtype("[X<X|Y<[Y]>>]","[[int]]");
	}
	@Test public void test_2194() {
		checkIsSubtype("[X<X|Y<[Y]>>]","[[X<[X]>]]");
	}
	@Test public void test_2195() {
		checkIsSubtype("[X<X|Y<[Y]>>]","X<[[[X]]]>");
	}
	@Test public void test_2196() {
		checkIsSubtype("[X<X|Y<[Y]>>]","X<[[Y<X|Y>]]>");
	}
	@Test public void test_2197() {
		checkIsSubtype("[X<X|Y<[Y]>>]","[X<X|void>]");
	}
	@Test public void test_2198() {
		checkNotSubtype("[X<X|Y<[Y]>>]","[X<X|any>]");
	}
	@Test public void test_2199() {
		checkNotSubtype("[X<X|Y<[Y]>>]","[X<X|null>]");
	}
	@Test public void test_2200() {
		checkNotSubtype("[X<X|Y<[Y]>>]","[X<X|int>]");
	}
	@Test public void test_2201() {
		checkIsSubtype("[X<X|Y<[Y]>>]","[X<X|Y<[Y]>>]");
	}
	@Test public void test_2202() {
		checkIsSubtype("[X<X|Y<[Y]>>]","X<[Y<Y|[X]>]>");
	}
	@Test public void test_2203() {
		checkIsSubtype("[X<X|Y<[Y]>>]","X<[Y<Y|(Z<X|Z>)>]>");
	}
	@Test public void test_2204() {
		checkIsSubtype("[X<X|Y<[Y]>>]","void|void");
	}
	@Test public void test_2205() {
		checkNotSubtype("[X<X|Y<[Y]>>]","void|any");
	}
	@Test public void test_2206() {
		checkNotSubtype("[X<X|Y<[Y]>>]","void|null");
	}
	@Test public void test_2207() {
		checkNotSubtype("[X<X|Y<[Y]>>]","void|int");
	}
	@Test public void test_2208() {
		checkIsSubtype("[X<X|Y<[Y]>>]","void|X<[X]>");
	}
	@Test public void test_2209() {
		checkIsSubtype("[X<X|Y<[Y]>>]","void|[void]");
	}
	@Test public void test_2210() {
		checkIsSubtype("[X<X|Y<[Y]>>]","void|(X<void|X>)");
	}
	@Test public void test_2211() {
		checkNotSubtype("[X<X|Y<[Y]>>]","any|void");
	}
	@Test public void test_2212() {
		checkNotSubtype("[X<X|Y<[Y]>>]","any|any");
	}
	@Test public void test_2213() {
		checkNotSubtype("[X<X|Y<[Y]>>]","any|null");
	}
	@Test public void test_2214() {
		checkNotSubtype("[X<X|Y<[Y]>>]","any|int");
	}
	@Test public void test_2215() {
		checkNotSubtype("[X<X|Y<[Y]>>]","any|X<[X]>");
	}
	@Test public void test_2216() {
		checkNotSubtype("[X<X|Y<[Y]>>]","any|[any]");
	}
	@Test public void test_2217() {
		checkNotSubtype("[X<X|Y<[Y]>>]","any|(X<any|X>)");
	}
	@Test public void test_2218() {
		checkNotSubtype("[X<X|Y<[Y]>>]","null|void");
	}
	@Test public void test_2219() {
		checkNotSubtype("[X<X|Y<[Y]>>]","null|any");
	}
	@Test public void test_2220() {
		checkNotSubtype("[X<X|Y<[Y]>>]","null|null");
	}
	@Test public void test_2221() {
		checkNotSubtype("[X<X|Y<[Y]>>]","null|int");
	}
	@Test public void test_2222() {
		checkNotSubtype("[X<X|Y<[Y]>>]","null|X<[X]>");
	}
	@Test public void test_2223() {
		checkNotSubtype("[X<X|Y<[Y]>>]","null|[null]");
	}
	@Test public void test_2224() {
		checkNotSubtype("[X<X|Y<[Y]>>]","null|(X<null|X>)");
	}
	@Test public void test_2225() {
		checkNotSubtype("[X<X|Y<[Y]>>]","int|void");
	}
	@Test public void test_2226() {
		checkNotSubtype("[X<X|Y<[Y]>>]","int|any");
	}
	@Test public void test_2227() {
		checkNotSubtype("[X<X|Y<[Y]>>]","int|null");
	}
	@Test public void test_2228() {
		checkNotSubtype("[X<X|Y<[Y]>>]","int|int");
	}
	@Test public void test_2229() {
		checkNotSubtype("[X<X|Y<[Y]>>]","int|X<[X]>");
	}
	@Test public void test_2230() {
		checkNotSubtype("[X<X|Y<[Y]>>]","int|[int]");
	}
	@Test public void test_2231() {
		checkNotSubtype("[X<X|Y<[Y]>>]","int|(X<int|X>)");
	}
	@Test public void test_2232() {
		checkIsSubtype("[X<X|Y<[Y]>>]","[void]|void");
	}
	@Test public void test_2233() {
		checkIsSubtype("[X<X|Y<[Y]>>]","X<[X]>|void");
	}
	@Test public void test_2234() {
		checkIsSubtype("[X<X|Y<[Y]>>]","X<X|[void]>");
	}
	@Test public void test_2235() {
		checkNotSubtype("[X<X|Y<[Y]>>]","[any]|any");
	}
	@Test public void test_2236() {
		checkNotSubtype("[X<X|Y<[Y]>>]","X<[X]>|any");
	}
	@Test public void test_2237() {
		checkNotSubtype("[X<X|Y<[Y]>>]","X<X|[any]>");
	}
	@Test public void test_2238() {
		checkNotSubtype("[X<X|Y<[Y]>>]","[null]|null");
	}
	@Test public void test_2239() {
		checkNotSubtype("[X<X|Y<[Y]>>]","X<[X]>|null");
	}
	@Test public void test_2240() {
		checkNotSubtype("[X<X|Y<[Y]>>]","X<X|[null]>");
	}
	@Test public void test_2241() {
		checkNotSubtype("[X<X|Y<[Y]>>]","[int]|int");
	}
	@Test public void test_2242() {
		checkNotSubtype("[X<X|Y<[Y]>>]","X<[X]>|int");
	}
	@Test public void test_2243() {
		checkNotSubtype("[X<X|Y<[Y]>>]","X<X|[int]>");
	}
	@Test public void test_2244() {
		checkIsSubtype("[X<X|Y<[Y]>>]","[X<[X]>]|X<[X]>");
	}
	@Test public void test_2245() {
		checkIsSubtype("[X<X|Y<[Y]>>]","X<[X]>|Y<[Y]>");
	}
	@Test public void test_2246() {
		checkIsSubtype("[X<X|Y<[Y]>>]","X<[X]>|[X<[X]>]");
	}
	@Test public void test_2247() {
		checkIsSubtype("[X<X|Y<[Y]>>]","X<X|[Y<[Y]>]>");
	}
	@Test public void test_2248() {
		checkIsSubtype("[X<X|Y<[Y]>>]","X<X|[[X]]>");
	}
	@Test public void test_2249() {
		checkIsSubtype("[X<X|Y<[Y]>>]","X<[X]>|(Y<X<[X]>|Y>)");
	}
	@Test public void test_2250() {
		checkIsSubtype("[X<X|Y<[Y]>>]","X<X|[Y<X|Y>]>");
	}
	@Test public void test_2251() {
		checkIsSubtype("[X<X|Y<[Y]>>]","(X<X|void>)|void");
	}
	@Test public void test_2252() {
		checkIsSubtype("[X<X|Y<[Y]>>]","X<X|(Y<Y|void>)>");
	}
	@Test public void test_2253() {
		checkNotSubtype("[X<X|Y<[Y]>>]","(X<X|any>)|any");
	}
	@Test public void test_2254() {
		checkNotSubtype("[X<X|Y<[Y]>>]","X<X|(Y<Y|any>)>");
	}
	@Test public void test_2255() {
		checkNotSubtype("[X<X|Y<[Y]>>]","(X<X|null>)|null");
	}
	@Test public void test_2256() {
		checkNotSubtype("[X<X|Y<[Y]>>]","X<X|(Y<Y|null>)>");
	}
	@Test public void test_2257() {
		checkNotSubtype("[X<X|Y<[Y]>>]","(X<X|int>)|int");
	}
	@Test public void test_2258() {
		checkNotSubtype("[X<X|Y<[Y]>>]","X<X|(Y<Y|int>)>");
	}
	@Test public void test_2259() {
		checkIsSubtype("[X<X|Y<[Y]>>]","(X<X|Y<[Y]>>)|Y<[Y]>");
	}
	@Test public void test_2260() {
		checkIsSubtype("[X<X|Y<[Y]>>]","X<X|(Y<Y|Z<[Z]>>)>");
	}
	@Test public void test_2261() {
		checkIsSubtype("[X<X|Y<[Y]>>]","X<X|(Y<Y|[X]>)>");
	}
	@Test public void test_2262() {
		checkIsSubtype("[X<X|Y<[Y]>>]","X<X|(Y<Y|(Z<X|Z>)>)>");
	}
	@Test public void test_2263() {
		checkNotSubtype("X<[Y<Y|[X]>]>","any");
	}
	@Test public void test_2264() {
		checkNotSubtype("X<[Y<Y|[X]>]>","null");
	}
	@Test public void test_2265() {
		checkNotSubtype("X<[Y<Y|[X]>]>","int");
	}
	@Test public void test_2266() {
		checkIsSubtype("X<[Y<Y|[X]>]>","X<[X]>");
	}
	@Test public void test_2267() {
		checkIsSubtype("X<[Y<Y|[X]>]>","[void]");
	}
	@Test public void test_2268() {
		checkNotSubtype("X<[Y<Y|[X]>]>","[any]");
	}
	@Test public void test_2269() {
		checkNotSubtype("X<[Y<Y|[X]>]>","[null]");
	}
	@Test public void test_2270() {
		checkNotSubtype("X<[Y<Y|[X]>]>","[int]");
	}
	@Test public void test_2271() {
		checkIsSubtype("X<[Y<Y|[X]>]>","[X<[X]>]");
	}
	@Test public void test_2272() {
		checkIsSubtype("X<[Y<Y|[X]>]>","X<X|void>");
	}
	@Test public void test_2273() {
		checkNotSubtype("X<[Y<Y|[X]>]>","X<X|any>");
	}
	@Test public void test_2274() {
		checkNotSubtype("X<[Y<Y|[X]>]>","X<X|null>");
	}
	@Test public void test_2275() {
		checkNotSubtype("X<[Y<Y|[X]>]>","X<X|int>");
	}
	@Test public void test_2276() {
		checkIsSubtype("X<[Y<Y|[X]>]>","X<X|Y<[Y]>>");
	}
	@Test public void test_2277() {
		checkIsSubtype("X<[Y<Y|[X]>]>","[[void]]");
	}
	@Test public void test_2278() {
		checkNotSubtype("X<[Y<Y|[X]>]>","[[any]]");
	}
	@Test public void test_2279() {
		checkNotSubtype("X<[Y<Y|[X]>]>","[[null]]");
	}
	@Test public void test_2280() {
		checkNotSubtype("X<[Y<Y|[X]>]>","[[int]]");
	}
	@Test public void test_2281() {
		checkIsSubtype("X<[Y<Y|[X]>]>","[[X<[X]>]]");
	}
	@Test public void test_2282() {
		checkIsSubtype("X<[Y<Y|[X]>]>","X<[[[X]]]>");
	}
	@Test public void test_2283() {
		checkIsSubtype("X<[Y<Y|[X]>]>","X<[[Y<X|Y>]]>");
	}
	@Test public void test_2284() {
		checkIsSubtype("X<[Y<Y|[X]>]>","[X<X|void>]");
	}
	@Test public void test_2285() {
		checkNotSubtype("X<[Y<Y|[X]>]>","[X<X|any>]");
	}
	@Test public void test_2286() {
		checkNotSubtype("X<[Y<Y|[X]>]>","[X<X|null>]");
	}
	@Test public void test_2287() {
		checkNotSubtype("X<[Y<Y|[X]>]>","[X<X|int>]");
	}
	@Test public void test_2288() {
		checkIsSubtype("X<[Y<Y|[X]>]>","[X<X|Y<[Y]>>]");
	}
	@Test public void test_2289() {
		checkIsSubtype("X<[Y<Y|[X]>]>","X<[Y<Y|[X]>]>");
	}
	@Test public void test_2290() {
		checkIsSubtype("X<[Y<Y|[X]>]>","X<[Y<Y|(Z<X|Z>)>]>");
	}
	@Test public void test_2291() {
		checkIsSubtype("X<[Y<Y|[X]>]>","void|void");
	}
	@Test public void test_2292() {
		checkNotSubtype("X<[Y<Y|[X]>]>","void|any");
	}
	@Test public void test_2293() {
		checkNotSubtype("X<[Y<Y|[X]>]>","void|null");
	}
	@Test public void test_2294() {
		checkNotSubtype("X<[Y<Y|[X]>]>","void|int");
	}
	@Test public void test_2295() {
		checkIsSubtype("X<[Y<Y|[X]>]>","void|X<[X]>");
	}
	@Test public void test_2296() {
		checkIsSubtype("X<[Y<Y|[X]>]>","void|[void]");
	}
	@Test public void test_2297() {
		checkIsSubtype("X<[Y<Y|[X]>]>","void|(X<void|X>)");
	}
	@Test public void test_2298() {
		checkNotSubtype("X<[Y<Y|[X]>]>","any|void");
	}
	@Test public void test_2299() {
		checkNotSubtype("X<[Y<Y|[X]>]>","any|any");
	}
	@Test public void test_2300() {
		checkNotSubtype("X<[Y<Y|[X]>]>","any|null");
	}
	@Test public void test_2301() {
		checkNotSubtype("X<[Y<Y|[X]>]>","any|int");
	}
	@Test public void test_2302() {
		checkNotSubtype("X<[Y<Y|[X]>]>","any|X<[X]>");
	}
	@Test public void test_2303() {
		checkNotSubtype("X<[Y<Y|[X]>]>","any|[any]");
	}
	@Test public void test_2304() {
		checkNotSubtype("X<[Y<Y|[X]>]>","any|(X<any|X>)");
	}
	@Test public void test_2305() {
		checkNotSubtype("X<[Y<Y|[X]>]>","null|void");
	}
	@Test public void test_2306() {
		checkNotSubtype("X<[Y<Y|[X]>]>","null|any");
	}
	@Test public void test_2307() {
		checkNotSubtype("X<[Y<Y|[X]>]>","null|null");
	}
	@Test public void test_2308() {
		checkNotSubtype("X<[Y<Y|[X]>]>","null|int");
	}
	@Test public void test_2309() {
		checkNotSubtype("X<[Y<Y|[X]>]>","null|X<[X]>");
	}
	@Test public void test_2310() {
		checkNotSubtype("X<[Y<Y|[X]>]>","null|[null]");
	}
	@Test public void test_2311() {
		checkNotSubtype("X<[Y<Y|[X]>]>","null|(X<null|X>)");
	}
	@Test public void test_2312() {
		checkNotSubtype("X<[Y<Y|[X]>]>","int|void");
	}
	@Test public void test_2313() {
		checkNotSubtype("X<[Y<Y|[X]>]>","int|any");
	}
	@Test public void test_2314() {
		checkNotSubtype("X<[Y<Y|[X]>]>","int|null");
	}
	@Test public void test_2315() {
		checkNotSubtype("X<[Y<Y|[X]>]>","int|int");
	}
	@Test public void test_2316() {
		checkNotSubtype("X<[Y<Y|[X]>]>","int|X<[X]>");
	}
	@Test public void test_2317() {
		checkNotSubtype("X<[Y<Y|[X]>]>","int|[int]");
	}
	@Test public void test_2318() {
		checkNotSubtype("X<[Y<Y|[X]>]>","int|(X<int|X>)");
	}
	@Test public void test_2319() {
		checkIsSubtype("X<[Y<Y|[X]>]>","[void]|void");
	}
	@Test public void test_2320() {
		checkIsSubtype("X<[Y<Y|[X]>]>","X<[X]>|void");
	}
	@Test public void test_2321() {
		checkIsSubtype("X<[Y<Y|[X]>]>","X<X|[void]>");
	}
	@Test public void test_2322() {
		checkNotSubtype("X<[Y<Y|[X]>]>","[any]|any");
	}
	@Test public void test_2323() {
		checkNotSubtype("X<[Y<Y|[X]>]>","X<[X]>|any");
	}
	@Test public void test_2324() {
		checkNotSubtype("X<[Y<Y|[X]>]>","X<X|[any]>");
	}
	@Test public void test_2325() {
		checkNotSubtype("X<[Y<Y|[X]>]>","[null]|null");
	}
	@Test public void test_2326() {
		checkNotSubtype("X<[Y<Y|[X]>]>","X<[X]>|null");
	}
	@Test public void test_2327() {
		checkNotSubtype("X<[Y<Y|[X]>]>","X<X|[null]>");
	}
	@Test public void test_2328() {
		checkNotSubtype("X<[Y<Y|[X]>]>","[int]|int");
	}
	@Test public void test_2329() {
		checkNotSubtype("X<[Y<Y|[X]>]>","X<[X]>|int");
	}
	@Test public void test_2330() {
		checkNotSubtype("X<[Y<Y|[X]>]>","X<X|[int]>");
	}
	@Test public void test_2331() {
		checkIsSubtype("X<[Y<Y|[X]>]>","[X<[X]>]|X<[X]>");
	}
	@Test public void test_2332() {
		checkIsSubtype("X<[Y<Y|[X]>]>","X<[X]>|Y<[Y]>");
	}
	@Test public void test_2333() {
		checkIsSubtype("X<[Y<Y|[X]>]>","X<[X]>|[X<[X]>]");
	}
	@Test public void test_2334() {
		checkIsSubtype("X<[Y<Y|[X]>]>","X<X|[Y<[Y]>]>");
	}
	@Test public void test_2335() {
		checkIsSubtype("X<[Y<Y|[X]>]>","X<X|[[X]]>");
	}
	@Test public void test_2336() {
		checkIsSubtype("X<[Y<Y|[X]>]>","X<[X]>|(Y<X<[X]>|Y>)");
	}
	@Test public void test_2337() {
		checkIsSubtype("X<[Y<Y|[X]>]>","X<X|[Y<X|Y>]>");
	}
	@Test public void test_2338() {
		checkIsSubtype("X<[Y<Y|[X]>]>","(X<X|void>)|void");
	}
	@Test public void test_2339() {
		checkIsSubtype("X<[Y<Y|[X]>]>","X<X|(Y<Y|void>)>");
	}
	@Test public void test_2340() {
		checkNotSubtype("X<[Y<Y|[X]>]>","(X<X|any>)|any");
	}
	@Test public void test_2341() {
		checkNotSubtype("X<[Y<Y|[X]>]>","X<X|(Y<Y|any>)>");
	}
	@Test public void test_2342() {
		checkNotSubtype("X<[Y<Y|[X]>]>","(X<X|null>)|null");
	}
	@Test public void test_2343() {
		checkNotSubtype("X<[Y<Y|[X]>]>","X<X|(Y<Y|null>)>");
	}
	@Test public void test_2344() {
		checkNotSubtype("X<[Y<Y|[X]>]>","(X<X|int>)|int");
	}
	@Test public void test_2345() {
		checkNotSubtype("X<[Y<Y|[X]>]>","X<X|(Y<Y|int>)>");
	}
	@Test public void test_2346() {
		checkIsSubtype("X<[Y<Y|[X]>]>","(X<X|Y<[Y]>>)|Y<[Y]>");
	}
	@Test public void test_2347() {
		checkIsSubtype("X<[Y<Y|[X]>]>","X<X|(Y<Y|Z<[Z]>>)>");
	}
	@Test public void test_2348() {
		checkIsSubtype("X<[Y<Y|[X]>]>","X<X|(Y<Y|[X]>)>");
	}
	@Test public void test_2349() {
		checkIsSubtype("X<[Y<Y|[X]>]>","X<X|(Y<Y|(Z<X|Z>)>)>");
	}
	@Test public void test_2350() {
		checkNotSubtype("X<[Y<Y|(Z<X|Z>)>]>","any");
	}
	@Test public void test_2351() {
		checkNotSubtype("X<[Y<Y|(Z<X|Z>)>]>","null");
	}
	@Test public void test_2352() {
		checkNotSubtype("X<[Y<Y|(Z<X|Z>)>]>","int");
	}
	@Test public void test_2353() {
		checkIsSubtype("X<[Y<Y|(Z<X|Z>)>]>","X<[X]>");
	}
	@Test public void test_2354() {
		checkIsSubtype("X<[Y<Y|(Z<X|Z>)>]>","[void]");
	}
	@Test public void test_2355() {
		checkNotSubtype("X<[Y<Y|(Z<X|Z>)>]>","[any]");
	}
	@Test public void test_2356() {
		checkNotSubtype("X<[Y<Y|(Z<X|Z>)>]>","[null]");
	}
	@Test public void test_2357() {
		checkNotSubtype("X<[Y<Y|(Z<X|Z>)>]>","[int]");
	}
	@Test public void test_2358() {
		checkIsSubtype("X<[Y<Y|(Z<X|Z>)>]>","[X<[X]>]");
	}
	@Test public void test_2359() {
		checkIsSubtype("X<[Y<Y|(Z<X|Z>)>]>","X<X|void>");
	}
	@Test public void test_2360() {
		checkNotSubtype("X<[Y<Y|(Z<X|Z>)>]>","X<X|any>");
	}
	@Test public void test_2361() {
		checkNotSubtype("X<[Y<Y|(Z<X|Z>)>]>","X<X|null>");
	}
	@Test public void test_2362() {
		checkNotSubtype("X<[Y<Y|(Z<X|Z>)>]>","X<X|int>");
	}
	@Test public void test_2363() {
		checkIsSubtype("X<[Y<Y|(Z<X|Z>)>]>","X<X|Y<[Y]>>");
	}
	@Test public void test_2364() {
		checkIsSubtype("X<[Y<Y|(Z<X|Z>)>]>","[[void]]");
	}
	@Test public void test_2365() {
		checkNotSubtype("X<[Y<Y|(Z<X|Z>)>]>","[[any]]");
	}
	@Test public void test_2366() {
		checkNotSubtype("X<[Y<Y|(Z<X|Z>)>]>","[[null]]");
	}
	@Test public void test_2367() {
		checkNotSubtype("X<[Y<Y|(Z<X|Z>)>]>","[[int]]");
	}
	@Test public void test_2368() {
		checkIsSubtype("X<[Y<Y|(Z<X|Z>)>]>","[[X<[X]>]]");
	}
	@Test public void test_2369() {
		checkIsSubtype("X<[Y<Y|(Z<X|Z>)>]>","X<[[[X]]]>");
	}
	@Test public void test_2370() {
		checkIsSubtype("X<[Y<Y|(Z<X|Z>)>]>","X<[[Y<X|Y>]]>");
	}
	@Test public void test_2371() {
		checkIsSubtype("X<[Y<Y|(Z<X|Z>)>]>","[X<X|void>]");
	}
	@Test public void test_2372() {
		checkNotSubtype("X<[Y<Y|(Z<X|Z>)>]>","[X<X|any>]");
	}
	@Test public void test_2373() {
		checkNotSubtype("X<[Y<Y|(Z<X|Z>)>]>","[X<X|null>]");
	}
	@Test public void test_2374() {
		checkNotSubtype("X<[Y<Y|(Z<X|Z>)>]>","[X<X|int>]");
	}
	@Test public void test_2375() {
		checkIsSubtype("X<[Y<Y|(Z<X|Z>)>]>","[X<X|Y<[Y]>>]");
	}
	@Test public void test_2376() {
		checkIsSubtype("X<[Y<Y|(Z<X|Z>)>]>","X<[Y<Y|[X]>]>");
	}
	@Test public void test_2377() {
		checkIsSubtype("X<[Y<Y|(Z<X|Z>)>]>","X<[Y<Y|(Z<X|Z>)>]>");
	}
	@Test public void test_2378() {
		checkIsSubtype("X<[Y<Y|(Z<X|Z>)>]>","void|void");
	}
	@Test public void test_2379() {
		checkNotSubtype("X<[Y<Y|(Z<X|Z>)>]>","void|any");
	}
	@Test public void test_2380() {
		checkNotSubtype("X<[Y<Y|(Z<X|Z>)>]>","void|null");
	}
	@Test public void test_2381() {
		checkNotSubtype("X<[Y<Y|(Z<X|Z>)>]>","void|int");
	}
	@Test public void test_2382() {
		checkIsSubtype("X<[Y<Y|(Z<X|Z>)>]>","void|X<[X]>");
	}
	@Test public void test_2383() {
		checkIsSubtype("X<[Y<Y|(Z<X|Z>)>]>","void|[void]");
	}
	@Test public void test_2384() {
		checkIsSubtype("X<[Y<Y|(Z<X|Z>)>]>","void|(X<void|X>)");
	}
	@Test public void test_2385() {
		checkNotSubtype("X<[Y<Y|(Z<X|Z>)>]>","any|void");
	}
	@Test public void test_2386() {
		checkNotSubtype("X<[Y<Y|(Z<X|Z>)>]>","any|any");
	}
	@Test public void test_2387() {
		checkNotSubtype("X<[Y<Y|(Z<X|Z>)>]>","any|null");
	}
	@Test public void test_2388() {
		checkNotSubtype("X<[Y<Y|(Z<X|Z>)>]>","any|int");
	}
	@Test public void test_2389() {
		checkNotSubtype("X<[Y<Y|(Z<X|Z>)>]>","any|X<[X]>");
	}
	@Test public void test_2390() {
		checkNotSubtype("X<[Y<Y|(Z<X|Z>)>]>","any|[any]");
	}
	@Test public void test_2391() {
		checkNotSubtype("X<[Y<Y|(Z<X|Z>)>]>","any|(X<any|X>)");
	}
	@Test public void test_2392() {
		checkNotSubtype("X<[Y<Y|(Z<X|Z>)>]>","null|void");
	}
	@Test public void test_2393() {
		checkNotSubtype("X<[Y<Y|(Z<X|Z>)>]>","null|any");
	}
	@Test public void test_2394() {
		checkNotSubtype("X<[Y<Y|(Z<X|Z>)>]>","null|null");
	}
	@Test public void test_2395() {
		checkNotSubtype("X<[Y<Y|(Z<X|Z>)>]>","null|int");
	}
	@Test public void test_2396() {
		checkNotSubtype("X<[Y<Y|(Z<X|Z>)>]>","null|X<[X]>");
	}
	@Test public void test_2397() {
		checkNotSubtype("X<[Y<Y|(Z<X|Z>)>]>","null|[null]");
	}
	@Test public void test_2398() {
		checkNotSubtype("X<[Y<Y|(Z<X|Z>)>]>","null|(X<null|X>)");
	}
	@Test public void test_2399() {
		checkNotSubtype("X<[Y<Y|(Z<X|Z>)>]>","int|void");
	}
	@Test public void test_2400() {
		checkNotSubtype("X<[Y<Y|(Z<X|Z>)>]>","int|any");
	}
	@Test public void test_2401() {
		checkNotSubtype("X<[Y<Y|(Z<X|Z>)>]>","int|null");
	}
	@Test public void test_2402() {
		checkNotSubtype("X<[Y<Y|(Z<X|Z>)>]>","int|int");
	}
	@Test public void test_2403() {
		checkNotSubtype("X<[Y<Y|(Z<X|Z>)>]>","int|X<[X]>");
	}
	@Test public void test_2404() {
		checkNotSubtype("X<[Y<Y|(Z<X|Z>)>]>","int|[int]");
	}
	@Test public void test_2405() {
		checkNotSubtype("X<[Y<Y|(Z<X|Z>)>]>","int|(X<int|X>)");
	}
	@Test public void test_2406() {
		checkIsSubtype("X<[Y<Y|(Z<X|Z>)>]>","[void]|void");
	}
	@Test public void test_2407() {
		checkIsSubtype("X<[Y<Y|(Z<X|Z>)>]>","X<[X]>|void");
	}
	@Test public void test_2408() {
		checkIsSubtype("X<[Y<Y|(Z<X|Z>)>]>","X<X|[void]>");
	}
	@Test public void test_2409() {
		checkNotSubtype("X<[Y<Y|(Z<X|Z>)>]>","[any]|any");
	}
	@Test public void test_2410() {
		checkNotSubtype("X<[Y<Y|(Z<X|Z>)>]>","X<[X]>|any");
	}
	@Test public void test_2411() {
		checkNotSubtype("X<[Y<Y|(Z<X|Z>)>]>","X<X|[any]>");
	}
	@Test public void test_2412() {
		checkNotSubtype("X<[Y<Y|(Z<X|Z>)>]>","[null]|null");
	}
	@Test public void test_2413() {
		checkNotSubtype("X<[Y<Y|(Z<X|Z>)>]>","X<[X]>|null");
	}
	@Test public void test_2414() {
		checkNotSubtype("X<[Y<Y|(Z<X|Z>)>]>","X<X|[null]>");
	}
	@Test public void test_2415() {
		checkNotSubtype("X<[Y<Y|(Z<X|Z>)>]>","[int]|int");
	}
	@Test public void test_2416() {
		checkNotSubtype("X<[Y<Y|(Z<X|Z>)>]>","X<[X]>|int");
	}
	@Test public void test_2417() {
		checkNotSubtype("X<[Y<Y|(Z<X|Z>)>]>","X<X|[int]>");
	}
	@Test public void test_2418() {
		checkIsSubtype("X<[Y<Y|(Z<X|Z>)>]>","[X<[X]>]|X<[X]>");
	}
	@Test public void test_2419() {
		checkIsSubtype("X<[Y<Y|(Z<X|Z>)>]>","X<[X]>|Y<[Y]>");
	}
	@Test public void test_2420() {
		checkIsSubtype("X<[Y<Y|(Z<X|Z>)>]>","X<[X]>|[X<[X]>]");
	}
	@Test public void test_2421() {
		checkIsSubtype("X<[Y<Y|(Z<X|Z>)>]>","X<X|[Y<[Y]>]>");
	}
	@Test public void test_2422() {
		checkIsSubtype("X<[Y<Y|(Z<X|Z>)>]>","X<X|[[X]]>");
	}
	@Test public void test_2423() {
		checkIsSubtype("X<[Y<Y|(Z<X|Z>)>]>","X<[X]>|(Y<X<[X]>|Y>)");
	}
	@Test public void test_2424() {
		checkIsSubtype("X<[Y<Y|(Z<X|Z>)>]>","X<X|[Y<X|Y>]>");
	}
	@Test public void test_2425() {
		checkIsSubtype("X<[Y<Y|(Z<X|Z>)>]>","(X<X|void>)|void");
	}
	@Test public void test_2426() {
		checkIsSubtype("X<[Y<Y|(Z<X|Z>)>]>","X<X|(Y<Y|void>)>");
	}
	@Test public void test_2427() {
		checkNotSubtype("X<[Y<Y|(Z<X|Z>)>]>","(X<X|any>)|any");
	}
	@Test public void test_2428() {
		checkNotSubtype("X<[Y<Y|(Z<X|Z>)>]>","X<X|(Y<Y|any>)>");
	}
	@Test public void test_2429() {
		checkNotSubtype("X<[Y<Y|(Z<X|Z>)>]>","(X<X|null>)|null");
	}
	@Test public void test_2430() {
		checkNotSubtype("X<[Y<Y|(Z<X|Z>)>]>","X<X|(Y<Y|null>)>");
	}
	@Test public void test_2431() {
		checkNotSubtype("X<[Y<Y|(Z<X|Z>)>]>","(X<X|int>)|int");
	}
	@Test public void test_2432() {
		checkNotSubtype("X<[Y<Y|(Z<X|Z>)>]>","X<X|(Y<Y|int>)>");
	}
	@Test public void test_2433() {
		checkIsSubtype("X<[Y<Y|(Z<X|Z>)>]>","(X<X|Y<[Y]>>)|Y<[Y]>");
	}
	@Test public void test_2434() {
		checkIsSubtype("X<[Y<Y|(Z<X|Z>)>]>","X<X|(Y<Y|Z<[Z]>>)>");
	}
	@Test public void test_2435() {
		checkIsSubtype("X<[Y<Y|(Z<X|Z>)>]>","X<X|(Y<Y|[X]>)>");
	}
	@Test public void test_2436() {
		checkIsSubtype("X<[Y<Y|(Z<X|Z>)>]>","X<X|(Y<Y|(Z<X|Z>)>)>");
	}
	@Test public void test_2437() {
		checkNotSubtype("void|void","any");
	}
	@Test public void test_2438() {
		checkNotSubtype("void|void","null");
	}
	@Test public void test_2439() {
		checkNotSubtype("void|void","int");
	}
	@Test public void test_2440() {
		checkNotSubtype("void|void","X<[X]>");
	}
	@Test public void test_2441() {
		checkNotSubtype("void|void","[void]");
	}
	@Test public void test_2442() {
		checkNotSubtype("void|void","[any]");
	}
	@Test public void test_2443() {
		checkNotSubtype("void|void","[null]");
	}
	@Test public void test_2444() {
		checkNotSubtype("void|void","[int]");
	}
	@Test public void test_2445() {
		checkNotSubtype("void|void","[X<[X]>]");
	}
	@Test public void test_2446() {
		checkIsSubtype("void|void","X<X|void>");
	}
	@Test public void test_2447() {
		checkNotSubtype("void|void","X<X|any>");
	}
	@Test public void test_2448() {
		checkNotSubtype("void|void","X<X|null>");
	}
	@Test public void test_2449() {
		checkNotSubtype("void|void","X<X|int>");
	}
	@Test public void test_2450() {
		checkNotSubtype("void|void","X<X|Y<[Y]>>");
	}
	@Test public void test_2451() {
		checkNotSubtype("void|void","[[void]]");
	}
	@Test public void test_2452() {
		checkNotSubtype("void|void","[[any]]");
	}
	@Test public void test_2453() {
		checkNotSubtype("void|void","[[null]]");
	}
	@Test public void test_2454() {
		checkNotSubtype("void|void","[[int]]");
	}
	@Test public void test_2455() {
		checkNotSubtype("void|void","[[X<[X]>]]");
	}
	@Test public void test_2456() {
		checkNotSubtype("void|void","X<[[[X]]]>");
	}
	@Test public void test_2457() {
		checkNotSubtype("void|void","X<[[Y<X|Y>]]>");
	}
	@Test public void test_2458() {
		checkNotSubtype("void|void","[X<X|void>]");
	}
	@Test public void test_2459() {
		checkNotSubtype("void|void","[X<X|any>]");
	}
	@Test public void test_2460() {
		checkNotSubtype("void|void","[X<X|null>]");
	}
	@Test public void test_2461() {
		checkNotSubtype("void|void","[X<X|int>]");
	}
	@Test public void test_2462() {
		checkNotSubtype("void|void","[X<X|Y<[Y]>>]");
	}
	@Test public void test_2463() {
		checkNotSubtype("void|void","X<[Y<Y|[X]>]>");
	}
	@Test public void test_2464() {
		checkNotSubtype("void|void","X<[Y<Y|(Z<X|Z>)>]>");
	}
	@Test public void test_2465() {
		checkIsSubtype("void|void","void|void");
	}
	@Test public void test_2466() {
		checkNotSubtype("void|void","void|any");
	}
	@Test public void test_2467() {
		checkNotSubtype("void|void","void|null");
	}
	@Test public void test_2468() {
		checkNotSubtype("void|void","void|int");
	}
	@Test public void test_2469() {
		checkNotSubtype("void|void","void|X<[X]>");
	}
	@Test public void test_2470() {
		checkNotSubtype("void|void","void|[void]");
	}
	@Test public void test_2471() {
		checkIsSubtype("void|void","void|(X<void|X>)");
	}
	@Test public void test_2472() {
		checkNotSubtype("void|void","any|void");
	}
	@Test public void test_2473() {
		checkNotSubtype("void|void","any|any");
	}
	@Test public void test_2474() {
		checkNotSubtype("void|void","any|null");
	}
	@Test public void test_2475() {
		checkNotSubtype("void|void","any|int");
	}
	@Test public void test_2476() {
		checkNotSubtype("void|void","any|X<[X]>");
	}
	@Test public void test_2477() {
		checkNotSubtype("void|void","any|[any]");
	}
	@Test public void test_2478() {
		checkNotSubtype("void|void","any|(X<any|X>)");
	}
	@Test public void test_2479() {
		checkNotSubtype("void|void","null|void");
	}
	@Test public void test_2480() {
		checkNotSubtype("void|void","null|any");
	}
	@Test public void test_2481() {
		checkNotSubtype("void|void","null|null");
	}
	@Test public void test_2482() {
		checkNotSubtype("void|void","null|int");
	}
	@Test public void test_2483() {
		checkNotSubtype("void|void","null|X<[X]>");
	}
	@Test public void test_2484() {
		checkNotSubtype("void|void","null|[null]");
	}
	@Test public void test_2485() {
		checkNotSubtype("void|void","null|(X<null|X>)");
	}
	@Test public void test_2486() {
		checkNotSubtype("void|void","int|void");
	}
	@Test public void test_2487() {
		checkNotSubtype("void|void","int|any");
	}
	@Test public void test_2488() {
		checkNotSubtype("void|void","int|null");
	}
	@Test public void test_2489() {
		checkNotSubtype("void|void","int|int");
	}
	@Test public void test_2490() {
		checkNotSubtype("void|void","int|X<[X]>");
	}
	@Test public void test_2491() {
		checkNotSubtype("void|void","int|[int]");
	}
	@Test public void test_2492() {
		checkNotSubtype("void|void","int|(X<int|X>)");
	}
	@Test public void test_2493() {
		checkNotSubtype("void|void","[void]|void");
	}
	@Test public void test_2494() {
		checkNotSubtype("void|void","X<[X]>|void");
	}
	@Test public void test_2495() {
		checkNotSubtype("void|void","X<X|[void]>");
	}
	@Test public void test_2496() {
		checkNotSubtype("void|void","[any]|any");
	}
	@Test public void test_2497() {
		checkNotSubtype("void|void","X<[X]>|any");
	}
	@Test public void test_2498() {
		checkNotSubtype("void|void","X<X|[any]>");
	}
	@Test public void test_2499() {
		checkNotSubtype("void|void","[null]|null");
	}
	@Test public void test_2500() {
		checkNotSubtype("void|void","X<[X]>|null");
	}
	@Test public void test_2501() {
		checkNotSubtype("void|void","X<X|[null]>");
	}
	@Test public void test_2502() {
		checkNotSubtype("void|void","[int]|int");
	}
	@Test public void test_2503() {
		checkNotSubtype("void|void","X<[X]>|int");
	}
	@Test public void test_2504() {
		checkNotSubtype("void|void","X<X|[int]>");
	}
	@Test public void test_2505() {
		checkNotSubtype("void|void","[X<[X]>]|X<[X]>");
	}
	@Test public void test_2506() {
		checkNotSubtype("void|void","X<[X]>|Y<[Y]>");
	}
	@Test public void test_2507() {
		checkNotSubtype("void|void","X<[X]>|[X<[X]>]");
	}
	@Test public void test_2508() {
		checkNotSubtype("void|void","X<X|[Y<[Y]>]>");
	}
	@Test public void test_2509() {
		checkNotSubtype("void|void","X<X|[[X]]>");
	}
	@Test public void test_2510() {
		checkNotSubtype("void|void","X<[X]>|(Y<X<[X]>|Y>)");
	}
	@Test public void test_2511() {
		checkNotSubtype("void|void","X<X|[Y<X|Y>]>");
	}
	@Test public void test_2512() {
		checkIsSubtype("void|void","(X<X|void>)|void");
	}
	@Test public void test_2513() {
		checkIsSubtype("void|void","X<X|(Y<Y|void>)>");
	}
	@Test public void test_2514() {
		checkNotSubtype("void|void","(X<X|any>)|any");
	}
	@Test public void test_2515() {
		checkNotSubtype("void|void","X<X|(Y<Y|any>)>");
	}
	@Test public void test_2516() {
		checkNotSubtype("void|void","(X<X|null>)|null");
	}
	@Test public void test_2517() {
		checkNotSubtype("void|void","X<X|(Y<Y|null>)>");
	}
	@Test public void test_2518() {
		checkNotSubtype("void|void","(X<X|int>)|int");
	}
	@Test public void test_2519() {
		checkNotSubtype("void|void","X<X|(Y<Y|int>)>");
	}
	@Test public void test_2520() {
		checkNotSubtype("void|void","(X<X|Y<[Y]>>)|Y<[Y]>");
	}
	@Test public void test_2521() {
		checkNotSubtype("void|void","X<X|(Y<Y|Z<[Z]>>)>");
	}
	@Test public void test_2522() {
		checkNotSubtype("void|void","X<X|(Y<Y|[X]>)>");
	}
	@Test public void test_2523() {
		checkIsSubtype("void|void","X<X|(Y<Y|(Z<X|Z>)>)>");
	}
	@Test public void test_2524() {
		checkIsSubtype("void|any","any");
	}
	@Test public void test_2525() {
		checkIsSubtype("void|any","null");
	}
	@Test public void test_2526() {
		checkIsSubtype("void|any","int");
	}
	@Test public void test_2527() {
		checkIsSubtype("void|any","X<[X]>");
	}
	@Test public void test_2528() {
		checkIsSubtype("void|any","[void]");
	}
	@Test public void test_2529() {
		checkIsSubtype("void|any","[any]");
	}
	@Test public void test_2530() {
		checkIsSubtype("void|any","[null]");
	}
	@Test public void test_2531() {
		checkIsSubtype("void|any","[int]");
	}
	@Test public void test_2532() {
		checkIsSubtype("void|any","[X<[X]>]");
	}
	@Test public void test_2533() {
		checkIsSubtype("void|any","X<X|void>");
	}
	@Test public void test_2534() {
		checkIsSubtype("void|any","X<X|any>");
	}
	@Test public void test_2535() {
		checkIsSubtype("void|any","X<X|null>");
	}
	@Test public void test_2536() {
		checkIsSubtype("void|any","X<X|int>");
	}
	@Test public void test_2537() {
		checkIsSubtype("void|any","X<X|Y<[Y]>>");
	}
	@Test public void test_2538() {
		checkIsSubtype("void|any","[[void]]");
	}
	@Test public void test_2539() {
		checkIsSubtype("void|any","[[any]]");
	}
	@Test public void test_2540() {
		checkIsSubtype("void|any","[[null]]");
	}
	@Test public void test_2541() {
		checkIsSubtype("void|any","[[int]]");
	}
	@Test public void test_2542() {
		checkIsSubtype("void|any","[[X<[X]>]]");
	}
	@Test public void test_2543() {
		checkIsSubtype("void|any","X<[[[X]]]>");
	}
	@Test public void test_2544() {
		checkIsSubtype("void|any","X<[[Y<X|Y>]]>");
	}
	@Test public void test_2545() {
		checkIsSubtype("void|any","[X<X|void>]");
	}
	@Test public void test_2546() {
		checkIsSubtype("void|any","[X<X|any>]");
	}
	@Test public void test_2547() {
		checkIsSubtype("void|any","[X<X|null>]");
	}
	@Test public void test_2548() {
		checkIsSubtype("void|any","[X<X|int>]");
	}
	@Test public void test_2549() {
		checkIsSubtype("void|any","[X<X|Y<[Y]>>]");
	}
	@Test public void test_2550() {
		checkIsSubtype("void|any","X<[Y<Y|[X]>]>");
	}
	@Test public void test_2551() {
		checkIsSubtype("void|any","X<[Y<Y|(Z<X|Z>)>]>");
	}
	@Test public void test_2552() {
		checkIsSubtype("void|any","void|void");
	}
	@Test public void test_2553() {
		checkIsSubtype("void|any","void|any");
	}
	@Test public void test_2554() {
		checkIsSubtype("void|any","void|null");
	}
	@Test public void test_2555() {
		checkIsSubtype("void|any","void|int");
	}
	@Test public void test_2556() {
		checkIsSubtype("void|any","void|X<[X]>");
	}
	@Test public void test_2557() {
		checkIsSubtype("void|any","void|[void]");
	}
	@Test public void test_2558() {
		checkIsSubtype("void|any","void|(X<void|X>)");
	}
	@Test public void test_2559() {
		checkIsSubtype("void|any","any|void");
	}
	@Test public void test_2560() {
		checkIsSubtype("void|any","any|any");
	}
	@Test public void test_2561() {
		checkIsSubtype("void|any","any|null");
	}
	@Test public void test_2562() {
		checkIsSubtype("void|any","any|int");
	}
	@Test public void test_2563() {
		checkIsSubtype("void|any","any|X<[X]>");
	}
	@Test public void test_2564() {
		checkIsSubtype("void|any","any|[any]");
	}
	@Test public void test_2565() {
		checkIsSubtype("void|any","any|(X<any|X>)");
	}
	@Test public void test_2566() {
		checkIsSubtype("void|any","null|void");
	}
	@Test public void test_2567() {
		checkIsSubtype("void|any","null|any");
	}
	@Test public void test_2568() {
		checkIsSubtype("void|any","null|null");
	}
	@Test public void test_2569() {
		checkIsSubtype("void|any","null|int");
	}
	@Test public void test_2570() {
		checkIsSubtype("void|any","null|X<[X]>");
	}
	@Test public void test_2571() {
		checkIsSubtype("void|any","null|[null]");
	}
	@Test public void test_2572() {
		checkIsSubtype("void|any","null|(X<null|X>)");
	}
	@Test public void test_2573() {
		checkIsSubtype("void|any","int|void");
	}
	@Test public void test_2574() {
		checkIsSubtype("void|any","int|any");
	}
	@Test public void test_2575() {
		checkIsSubtype("void|any","int|null");
	}
	@Test public void test_2576() {
		checkIsSubtype("void|any","int|int");
	}
	@Test public void test_2577() {
		checkIsSubtype("void|any","int|X<[X]>");
	}
	@Test public void test_2578() {
		checkIsSubtype("void|any","int|[int]");
	}
	@Test public void test_2579() {
		checkIsSubtype("void|any","int|(X<int|X>)");
	}
	@Test public void test_2580() {
		checkIsSubtype("void|any","[void]|void");
	}
	@Test public void test_2581() {
		checkIsSubtype("void|any","X<[X]>|void");
	}
	@Test public void test_2582() {
		checkIsSubtype("void|any","X<X|[void]>");
	}
	@Test public void test_2583() {
		checkIsSubtype("void|any","[any]|any");
	}
	@Test public void test_2584() {
		checkIsSubtype("void|any","X<[X]>|any");
	}
	@Test public void test_2585() {
		checkIsSubtype("void|any","X<X|[any]>");
	}
	@Test public void test_2586() {
		checkIsSubtype("void|any","[null]|null");
	}
	@Test public void test_2587() {
		checkIsSubtype("void|any","X<[X]>|null");
	}
	@Test public void test_2588() {
		checkIsSubtype("void|any","X<X|[null]>");
	}
	@Test public void test_2589() {
		checkIsSubtype("void|any","[int]|int");
	}
	@Test public void test_2590() {
		checkIsSubtype("void|any","X<[X]>|int");
	}
	@Test public void test_2591() {
		checkIsSubtype("void|any","X<X|[int]>");
	}
	@Test public void test_2592() {
		checkIsSubtype("void|any","[X<[X]>]|X<[X]>");
	}
	@Test public void test_2593() {
		checkIsSubtype("void|any","X<[X]>|Y<[Y]>");
	}
	@Test public void test_2594() {
		checkIsSubtype("void|any","X<[X]>|[X<[X]>]");
	}
	@Test public void test_2595() {
		checkIsSubtype("void|any","X<X|[Y<[Y]>]>");
	}
	@Test public void test_2596() {
		checkIsSubtype("void|any","X<X|[[X]]>");
	}
	@Test public void test_2597() {
		checkIsSubtype("void|any","X<[X]>|(Y<X<[X]>|Y>)");
	}
	@Test public void test_2598() {
		checkIsSubtype("void|any","X<X|[Y<X|Y>]>");
	}
	@Test public void test_2599() {
		checkIsSubtype("void|any","(X<X|void>)|void");
	}
	@Test public void test_2600() {
		checkIsSubtype("void|any","X<X|(Y<Y|void>)>");
	}
	@Test public void test_2601() {
		checkIsSubtype("void|any","(X<X|any>)|any");
	}
	@Test public void test_2602() {
		checkIsSubtype("void|any","X<X|(Y<Y|any>)>");
	}
	@Test public void test_2603() {
		checkIsSubtype("void|any","(X<X|null>)|null");
	}
	@Test public void test_2604() {
		checkIsSubtype("void|any","X<X|(Y<Y|null>)>");
	}
	@Test public void test_2605() {
		checkIsSubtype("void|any","(X<X|int>)|int");
	}
	@Test public void test_2606() {
		checkIsSubtype("void|any","X<X|(Y<Y|int>)>");
	}
	@Test public void test_2607() {
		checkIsSubtype("void|any","(X<X|Y<[Y]>>)|Y<[Y]>");
	}
	@Test public void test_2608() {
		checkIsSubtype("void|any","X<X|(Y<Y|Z<[Z]>>)>");
	}
	@Test public void test_2609() {
		checkIsSubtype("void|any","X<X|(Y<Y|[X]>)>");
	}
	@Test public void test_2610() {
		checkIsSubtype("void|any","X<X|(Y<Y|(Z<X|Z>)>)>");
	}
	@Test public void test_2611() {
		checkNotSubtype("void|null","any");
	}
	@Test public void test_2612() {
		checkIsSubtype("void|null","null");
	}
	@Test public void test_2613() {
		checkNotSubtype("void|null","int");
	}
	@Test public void test_2614() {
		checkNotSubtype("void|null","X<[X]>");
	}
	@Test public void test_2615() {
		checkNotSubtype("void|null","[void]");
	}
	@Test public void test_2616() {
		checkNotSubtype("void|null","[any]");
	}
	@Test public void test_2617() {
		checkNotSubtype("void|null","[null]");
	}
	@Test public void test_2618() {
		checkNotSubtype("void|null","[int]");
	}
	@Test public void test_2619() {
		checkNotSubtype("void|null","[X<[X]>]");
	}
	@Test public void test_2620() {
		checkIsSubtype("void|null","X<X|void>");
	}
	@Test public void test_2621() {
		checkNotSubtype("void|null","X<X|any>");
	}
	@Test public void test_2622() {
		checkIsSubtype("void|null","X<X|null>");
	}
	@Test public void test_2623() {
		checkNotSubtype("void|null","X<X|int>");
	}
	@Test public void test_2624() {
		checkNotSubtype("void|null","X<X|Y<[Y]>>");
	}
	@Test public void test_2625() {
		checkNotSubtype("void|null","[[void]]");
	}
	@Test public void test_2626() {
		checkNotSubtype("void|null","[[any]]");
	}
	@Test public void test_2627() {
		checkNotSubtype("void|null","[[null]]");
	}
	@Test public void test_2628() {
		checkNotSubtype("void|null","[[int]]");
	}
	@Test public void test_2629() {
		checkNotSubtype("void|null","[[X<[X]>]]");
	}
	@Test public void test_2630() {
		checkNotSubtype("void|null","X<[[[X]]]>");
	}
	@Test public void test_2631() {
		checkNotSubtype("void|null","X<[[Y<X|Y>]]>");
	}
	@Test public void test_2632() {
		checkNotSubtype("void|null","[X<X|void>]");
	}
	@Test public void test_2633() {
		checkNotSubtype("void|null","[X<X|any>]");
	}
	@Test public void test_2634() {
		checkNotSubtype("void|null","[X<X|null>]");
	}
	@Test public void test_2635() {
		checkNotSubtype("void|null","[X<X|int>]");
	}
	@Test public void test_2636() {
		checkNotSubtype("void|null","[X<X|Y<[Y]>>]");
	}
	@Test public void test_2637() {
		checkNotSubtype("void|null","X<[Y<Y|[X]>]>");
	}
	@Test public void test_2638() {
		checkNotSubtype("void|null","X<[Y<Y|(Z<X|Z>)>]>");
	}
	@Test public void test_2639() {
		checkIsSubtype("void|null","void|void");
	}
	@Test public void test_2640() {
		checkNotSubtype("void|null","void|any");
	}
	@Test public void test_2641() {
		checkIsSubtype("void|null","void|null");
	}
	@Test public void test_2642() {
		checkNotSubtype("void|null","void|int");
	}
	@Test public void test_2643() {
		checkNotSubtype("void|null","void|X<[X]>");
	}
	@Test public void test_2644() {
		checkNotSubtype("void|null","void|[void]");
	}
	@Test public void test_2645() {
		checkIsSubtype("void|null","void|(X<void|X>)");
	}
	@Test public void test_2646() {
		checkNotSubtype("void|null","any|void");
	}
	@Test public void test_2647() {
		checkNotSubtype("void|null","any|any");
	}
	@Test public void test_2648() {
		checkNotSubtype("void|null","any|null");
	}
	@Test public void test_2649() {
		checkNotSubtype("void|null","any|int");
	}
	@Test public void test_2650() {
		checkNotSubtype("void|null","any|X<[X]>");
	}
	@Test public void test_2651() {
		checkNotSubtype("void|null","any|[any]");
	}
	@Test public void test_2652() {
		checkNotSubtype("void|null","any|(X<any|X>)");
	}
	@Test public void test_2653() {
		checkIsSubtype("void|null","null|void");
	}
	@Test public void test_2654() {
		checkNotSubtype("void|null","null|any");
	}
	@Test public void test_2655() {
		checkIsSubtype("void|null","null|null");
	}
	@Test public void test_2656() {
		checkNotSubtype("void|null","null|int");
	}
	@Test public void test_2657() {
		checkNotSubtype("void|null","null|X<[X]>");
	}
	@Test public void test_2658() {
		checkNotSubtype("void|null","null|[null]");
	}
	@Test public void test_2659() {
		checkIsSubtype("void|null","null|(X<null|X>)");
	}
	@Test public void test_2660() {
		checkNotSubtype("void|null","int|void");
	}
	@Test public void test_2661() {
		checkNotSubtype("void|null","int|any");
	}
	@Test public void test_2662() {
		checkNotSubtype("void|null","int|null");
	}
	@Test public void test_2663() {
		checkNotSubtype("void|null","int|int");
	}
	@Test public void test_2664() {
		checkNotSubtype("void|null","int|X<[X]>");
	}
	@Test public void test_2665() {
		checkNotSubtype("void|null","int|[int]");
	}
	@Test public void test_2666() {
		checkNotSubtype("void|null","int|(X<int|X>)");
	}
	@Test public void test_2667() {
		checkNotSubtype("void|null","[void]|void");
	}
	@Test public void test_2668() {
		checkNotSubtype("void|null","X<[X]>|void");
	}
	@Test public void test_2669() {
		checkNotSubtype("void|null","X<X|[void]>");
	}
	@Test public void test_2670() {
		checkNotSubtype("void|null","[any]|any");
	}
	@Test public void test_2671() {
		checkNotSubtype("void|null","X<[X]>|any");
	}
	@Test public void test_2672() {
		checkNotSubtype("void|null","X<X|[any]>");
	}
	@Test public void test_2673() {
		checkNotSubtype("void|null","[null]|null");
	}
	@Test public void test_2674() {
		checkNotSubtype("void|null","X<[X]>|null");
	}
	@Test public void test_2675() {
		checkNotSubtype("void|null","X<X|[null]>");
	}
	@Test public void test_2676() {
		checkNotSubtype("void|null","[int]|int");
	}
	@Test public void test_2677() {
		checkNotSubtype("void|null","X<[X]>|int");
	}
	@Test public void test_2678() {
		checkNotSubtype("void|null","X<X|[int]>");
	}
	@Test public void test_2679() {
		checkNotSubtype("void|null","[X<[X]>]|X<[X]>");
	}
	@Test public void test_2680() {
		checkNotSubtype("void|null","X<[X]>|Y<[Y]>");
	}
	@Test public void test_2681() {
		checkNotSubtype("void|null","X<[X]>|[X<[X]>]");
	}
	@Test public void test_2682() {
		checkNotSubtype("void|null","X<X|[Y<[Y]>]>");
	}
	@Test public void test_2683() {
		checkNotSubtype("void|null","X<X|[[X]]>");
	}
	@Test public void test_2684() {
		checkNotSubtype("void|null","X<[X]>|(Y<X<[X]>|Y>)");
	}
	@Test public void test_2685() {
		checkNotSubtype("void|null","X<X|[Y<X|Y>]>");
	}
	@Test public void test_2686() {
		checkIsSubtype("void|null","(X<X|void>)|void");
	}
	@Test public void test_2687() {
		checkIsSubtype("void|null","X<X|(Y<Y|void>)>");
	}
	@Test public void test_2688() {
		checkNotSubtype("void|null","(X<X|any>)|any");
	}
	@Test public void test_2689() {
		checkNotSubtype("void|null","X<X|(Y<Y|any>)>");
	}
	@Test public void test_2690() {
		checkIsSubtype("void|null","(X<X|null>)|null");
	}
	@Test public void test_2691() {
		checkIsSubtype("void|null","X<X|(Y<Y|null>)>");
	}
	@Test public void test_2692() {
		checkNotSubtype("void|null","(X<X|int>)|int");
	}
	@Test public void test_2693() {
		checkNotSubtype("void|null","X<X|(Y<Y|int>)>");
	}
	@Test public void test_2694() {
		checkNotSubtype("void|null","(X<X|Y<[Y]>>)|Y<[Y]>");
	}
	@Test public void test_2695() {
		checkNotSubtype("void|null","X<X|(Y<Y|Z<[Z]>>)>");
	}
	@Test public void test_2696() {
		checkNotSubtype("void|null","X<X|(Y<Y|[X]>)>");
	}
	@Test public void test_2697() {
		checkIsSubtype("void|null","X<X|(Y<Y|(Z<X|Z>)>)>");
	}
	@Test public void test_2698() {
		checkNotSubtype("void|int","any");
	}
	@Test public void test_2699() {
		checkNotSubtype("void|int","null");
	}
	@Test public void test_2700() {
		checkIsSubtype("void|int","int");
	}
	@Test public void test_2701() {
		checkNotSubtype("void|int","X<[X]>");
	}
	@Test public void test_2702() {
		checkNotSubtype("void|int","[void]");
	}
	@Test public void test_2703() {
		checkNotSubtype("void|int","[any]");
	}
	@Test public void test_2704() {
		checkNotSubtype("void|int","[null]");
	}
	@Test public void test_2705() {
		checkNotSubtype("void|int","[int]");
	}
	@Test public void test_2706() {
		checkNotSubtype("void|int","[X<[X]>]");
	}
	@Test public void test_2707() {
		checkIsSubtype("void|int","X<X|void>");
	}
	@Test public void test_2708() {
		checkNotSubtype("void|int","X<X|any>");
	}
	@Test public void test_2709() {
		checkNotSubtype("void|int","X<X|null>");
	}
	@Test public void test_2710() {
		checkIsSubtype("void|int","X<X|int>");
	}
	@Test public void test_2711() {
		checkNotSubtype("void|int","X<X|Y<[Y]>>");
	}
	@Test public void test_2712() {
		checkNotSubtype("void|int","[[void]]");
	}
	@Test public void test_2713() {
		checkNotSubtype("void|int","[[any]]");
	}
	@Test public void test_2714() {
		checkNotSubtype("void|int","[[null]]");
	}
	@Test public void test_2715() {
		checkNotSubtype("void|int","[[int]]");
	}
	@Test public void test_2716() {
		checkNotSubtype("void|int","[[X<[X]>]]");
	}
	@Test public void test_2717() {
		checkNotSubtype("void|int","X<[[[X]]]>");
	}
	@Test public void test_2718() {
		checkNotSubtype("void|int","X<[[Y<X|Y>]]>");
	}
	@Test public void test_2719() {
		checkNotSubtype("void|int","[X<X|void>]");
	}
	@Test public void test_2720() {
		checkNotSubtype("void|int","[X<X|any>]");
	}
	@Test public void test_2721() {
		checkNotSubtype("void|int","[X<X|null>]");
	}
	@Test public void test_2722() {
		checkNotSubtype("void|int","[X<X|int>]");
	}
	@Test public void test_2723() {
		checkNotSubtype("void|int","[X<X|Y<[Y]>>]");
	}
	@Test public void test_2724() {
		checkNotSubtype("void|int","X<[Y<Y|[X]>]>");
	}
	@Test public void test_2725() {
		checkNotSubtype("void|int","X<[Y<Y|(Z<X|Z>)>]>");
	}
	@Test public void test_2726() {
		checkIsSubtype("void|int","void|void");
	}
	@Test public void test_2727() {
		checkNotSubtype("void|int","void|any");
	}
	@Test public void test_2728() {
		checkNotSubtype("void|int","void|null");
	}
	@Test public void test_2729() {
		checkIsSubtype("void|int","void|int");
	}
	@Test public void test_2730() {
		checkNotSubtype("void|int","void|X<[X]>");
	}
	@Test public void test_2731() {
		checkNotSubtype("void|int","void|[void]");
	}
	@Test public void test_2732() {
		checkIsSubtype("void|int","void|(X<void|X>)");
	}
	@Test public void test_2733() {
		checkNotSubtype("void|int","any|void");
	}
	@Test public void test_2734() {
		checkNotSubtype("void|int","any|any");
	}
	@Test public void test_2735() {
		checkNotSubtype("void|int","any|null");
	}
	@Test public void test_2736() {
		checkNotSubtype("void|int","any|int");
	}
	@Test public void test_2737() {
		checkNotSubtype("void|int","any|X<[X]>");
	}
	@Test public void test_2738() {
		checkNotSubtype("void|int","any|[any]");
	}
	@Test public void test_2739() {
		checkNotSubtype("void|int","any|(X<any|X>)");
	}
	@Test public void test_2740() {
		checkNotSubtype("void|int","null|void");
	}
	@Test public void test_2741() {
		checkNotSubtype("void|int","null|any");
	}
	@Test public void test_2742() {
		checkNotSubtype("void|int","null|null");
	}
	@Test public void test_2743() {
		checkNotSubtype("void|int","null|int");
	}
	@Test public void test_2744() {
		checkNotSubtype("void|int","null|X<[X]>");
	}
	@Test public void test_2745() {
		checkNotSubtype("void|int","null|[null]");
	}
	@Test public void test_2746() {
		checkNotSubtype("void|int","null|(X<null|X>)");
	}
	@Test public void test_2747() {
		checkIsSubtype("void|int","int|void");
	}
	@Test public void test_2748() {
		checkNotSubtype("void|int","int|any");
	}
	@Test public void test_2749() {
		checkNotSubtype("void|int","int|null");
	}
	@Test public void test_2750() {
		checkIsSubtype("void|int","int|int");
	}
	@Test public void test_2751() {
		checkNotSubtype("void|int","int|X<[X]>");
	}
	@Test public void test_2752() {
		checkNotSubtype("void|int","int|[int]");
	}
	@Test public void test_2753() {
		checkIsSubtype("void|int","int|(X<int|X>)");
	}
	@Test public void test_2754() {
		checkNotSubtype("void|int","[void]|void");
	}
	@Test public void test_2755() {
		checkNotSubtype("void|int","X<[X]>|void");
	}
	@Test public void test_2756() {
		checkNotSubtype("void|int","X<X|[void]>");
	}
	@Test public void test_2757() {
		checkNotSubtype("void|int","[any]|any");
	}
	@Test public void test_2758() {
		checkNotSubtype("void|int","X<[X]>|any");
	}
	@Test public void test_2759() {
		checkNotSubtype("void|int","X<X|[any]>");
	}
	@Test public void test_2760() {
		checkNotSubtype("void|int","[null]|null");
	}
	@Test public void test_2761() {
		checkNotSubtype("void|int","X<[X]>|null");
	}
	@Test public void test_2762() {
		checkNotSubtype("void|int","X<X|[null]>");
	}
	@Test public void test_2763() {
		checkNotSubtype("void|int","[int]|int");
	}
	@Test public void test_2764() {
		checkNotSubtype("void|int","X<[X]>|int");
	}
	@Test public void test_2765() {
		checkNotSubtype("void|int","X<X|[int]>");
	}
	@Test public void test_2766() {
		checkNotSubtype("void|int","[X<[X]>]|X<[X]>");
	}
	@Test public void test_2767() {
		checkNotSubtype("void|int","X<[X]>|Y<[Y]>");
	}
	@Test public void test_2768() {
		checkNotSubtype("void|int","X<[X]>|[X<[X]>]");
	}
	@Test public void test_2769() {
		checkNotSubtype("void|int","X<X|[Y<[Y]>]>");
	}
	@Test public void test_2770() {
		checkNotSubtype("void|int","X<X|[[X]]>");
	}
	@Test public void test_2771() {
		checkNotSubtype("void|int","X<[X]>|(Y<X<[X]>|Y>)");
	}
	@Test public void test_2772() {
		checkNotSubtype("void|int","X<X|[Y<X|Y>]>");
	}
	@Test public void test_2773() {
		checkIsSubtype("void|int","(X<X|void>)|void");
	}
	@Test public void test_2774() {
		checkIsSubtype("void|int","X<X|(Y<Y|void>)>");
	}
	@Test public void test_2775() {
		checkNotSubtype("void|int","(X<X|any>)|any");
	}
	@Test public void test_2776() {
		checkNotSubtype("void|int","X<X|(Y<Y|any>)>");
	}
	@Test public void test_2777() {
		checkNotSubtype("void|int","(X<X|null>)|null");
	}
	@Test public void test_2778() {
		checkNotSubtype("void|int","X<X|(Y<Y|null>)>");
	}
	@Test public void test_2779() {
		checkIsSubtype("void|int","(X<X|int>)|int");
	}
	@Test public void test_2780() {
		checkIsSubtype("void|int","X<X|(Y<Y|int>)>");
	}
	@Test public void test_2781() {
		checkNotSubtype("void|int","(X<X|Y<[Y]>>)|Y<[Y]>");
	}
	@Test public void test_2782() {
		checkNotSubtype("void|int","X<X|(Y<Y|Z<[Z]>>)>");
	}
	@Test public void test_2783() {
		checkNotSubtype("void|int","X<X|(Y<Y|[X]>)>");
	}
	@Test public void test_2784() {
		checkIsSubtype("void|int","X<X|(Y<Y|(Z<X|Z>)>)>");
	}
	@Test public void test_2785() {
		checkNotSubtype("void|X<[X]>","any");
	}
	@Test public void test_2786() {
		checkNotSubtype("void|X<[X]>","null");
	}
	@Test public void test_2787() {
		checkNotSubtype("void|X<[X]>","int");
	}
	@Test public void test_2788() {
		checkIsSubtype("void|X<[X]>","X<[X]>");
	}
	@Test public void test_2789() {
		checkIsSubtype("void|X<[X]>","[void]");
	}
	@Test public void test_2790() {
		checkNotSubtype("void|X<[X]>","[any]");
	}
	@Test public void test_2791() {
		checkNotSubtype("void|X<[X]>","[null]");
	}
	@Test public void test_2792() {
		checkNotSubtype("void|X<[X]>","[int]");
	}
	@Test public void test_2793() {
		checkIsSubtype("void|X<[X]>","[X<[X]>]");
	}
	@Test public void test_2794() {
		checkIsSubtype("void|X<[X]>","X<X|void>");
	}
	@Test public void test_2795() {
		checkNotSubtype("void|X<[X]>","X<X|any>");
	}
	@Test public void test_2796() {
		checkNotSubtype("void|X<[X]>","X<X|null>");
	}
	@Test public void test_2797() {
		checkNotSubtype("void|X<[X]>","X<X|int>");
	}
	@Test public void test_2798() {
		checkIsSubtype("void|X<[X]>","X<X|Y<[Y]>>");
	}
	@Test public void test_2799() {
		checkIsSubtype("void|X<[X]>","[[void]]");
	}
	@Test public void test_2800() {
		checkNotSubtype("void|X<[X]>","[[any]]");
	}
	@Test public void test_2801() {
		checkNotSubtype("void|X<[X]>","[[null]]");
	}
	@Test public void test_2802() {
		checkNotSubtype("void|X<[X]>","[[int]]");
	}
	@Test public void test_2803() {
		checkIsSubtype("void|X<[X]>","[[X<[X]>]]");
	}
	@Test public void test_2804() {
		checkIsSubtype("void|X<[X]>","X<[[[X]]]>");
	}
	@Test public void test_2805() {
		checkIsSubtype("void|X<[X]>","X<[[Y<X|Y>]]>");
	}
	@Test public void test_2806() {
		checkIsSubtype("void|X<[X]>","[X<X|void>]");
	}
	@Test public void test_2807() {
		checkNotSubtype("void|X<[X]>","[X<X|any>]");
	}
	@Test public void test_2808() {
		checkNotSubtype("void|X<[X]>","[X<X|null>]");
	}
	@Test public void test_2809() {
		checkNotSubtype("void|X<[X]>","[X<X|int>]");
	}
	@Test public void test_2810() {
		checkIsSubtype("void|X<[X]>","[X<X|Y<[Y]>>]");
	}
	@Test public void test_2811() {
		checkIsSubtype("void|X<[X]>","X<[Y<Y|[X]>]>");
	}
	@Test public void test_2812() {
		checkIsSubtype("void|X<[X]>","X<[Y<Y|(Z<X|Z>)>]>");
	}
	@Test public void test_2813() {
		checkIsSubtype("void|X<[X]>","void|void");
	}
	@Test public void test_2814() {
		checkNotSubtype("void|X<[X]>","void|any");
	}
	@Test public void test_2815() {
		checkNotSubtype("void|X<[X]>","void|null");
	}
	@Test public void test_2816() {
		checkNotSubtype("void|X<[X]>","void|int");
	}
	@Test public void test_2817() {
		checkIsSubtype("void|X<[X]>","void|X<[X]>");
	}
	@Test public void test_2818() {
		checkIsSubtype("void|X<[X]>","void|[void]");
	}
	@Test public void test_2819() {
		checkIsSubtype("void|X<[X]>","void|(X<void|X>)");
	}
	@Test public void test_2820() {
		checkNotSubtype("void|X<[X]>","any|void");
	}
	@Test public void test_2821() {
		checkNotSubtype("void|X<[X]>","any|any");
	}
	@Test public void test_2822() {
		checkNotSubtype("void|X<[X]>","any|null");
	}
	@Test public void test_2823() {
		checkNotSubtype("void|X<[X]>","any|int");
	}
	@Test public void test_2824() {
		checkNotSubtype("void|X<[X]>","any|X<[X]>");
	}
	@Test public void test_2825() {
		checkNotSubtype("void|X<[X]>","any|[any]");
	}
	@Test public void test_2826() {
		checkNotSubtype("void|X<[X]>","any|(X<any|X>)");
	}
	@Test public void test_2827() {
		checkNotSubtype("void|X<[X]>","null|void");
	}
	@Test public void test_2828() {
		checkNotSubtype("void|X<[X]>","null|any");
	}
	@Test public void test_2829() {
		checkNotSubtype("void|X<[X]>","null|null");
	}
	@Test public void test_2830() {
		checkNotSubtype("void|X<[X]>","null|int");
	}
	@Test public void test_2831() {
		checkNotSubtype("void|X<[X]>","null|X<[X]>");
	}
	@Test public void test_2832() {
		checkNotSubtype("void|X<[X]>","null|[null]");
	}
	@Test public void test_2833() {
		checkNotSubtype("void|X<[X]>","null|(X<null|X>)");
	}
	@Test public void test_2834() {
		checkNotSubtype("void|X<[X]>","int|void");
	}
	@Test public void test_2835() {
		checkNotSubtype("void|X<[X]>","int|any");
	}
	@Test public void test_2836() {
		checkNotSubtype("void|X<[X]>","int|null");
	}
	@Test public void test_2837() {
		checkNotSubtype("void|X<[X]>","int|int");
	}
	@Test public void test_2838() {
		checkNotSubtype("void|X<[X]>","int|X<[X]>");
	}
	@Test public void test_2839() {
		checkNotSubtype("void|X<[X]>","int|[int]");
	}
	@Test public void test_2840() {
		checkNotSubtype("void|X<[X]>","int|(X<int|X>)");
	}
	@Test public void test_2841() {
		checkIsSubtype("void|X<[X]>","[void]|void");
	}
	@Test public void test_2842() {
		checkIsSubtype("void|X<[X]>","X<[X]>|void");
	}
	@Test public void test_2843() {
		checkIsSubtype("void|X<[X]>","X<X|[void]>");
	}
	@Test public void test_2844() {
		checkNotSubtype("void|X<[X]>","[any]|any");
	}
	@Test public void test_2845() {
		checkNotSubtype("void|X<[X]>","X<[X]>|any");
	}
	@Test public void test_2846() {
		checkNotSubtype("void|X<[X]>","X<X|[any]>");
	}
	@Test public void test_2847() {
		checkNotSubtype("void|X<[X]>","[null]|null");
	}
	@Test public void test_2848() {
		checkNotSubtype("void|X<[X]>","X<[X]>|null");
	}
	@Test public void test_2849() {
		checkNotSubtype("void|X<[X]>","X<X|[null]>");
	}
	@Test public void test_2850() {
		checkNotSubtype("void|X<[X]>","[int]|int");
	}
	@Test public void test_2851() {
		checkNotSubtype("void|X<[X]>","X<[X]>|int");
	}
	@Test public void test_2852() {
		checkNotSubtype("void|X<[X]>","X<X|[int]>");
	}
	@Test public void test_2853() {
		checkIsSubtype("void|X<[X]>","[X<[X]>]|X<[X]>");
	}
	@Test public void test_2854() {
		checkIsSubtype("void|X<[X]>","X<[X]>|Y<[Y]>");
	}
	@Test public void test_2855() {
		checkIsSubtype("void|X<[X]>","X<[X]>|[X<[X]>]");
	}
	@Test public void test_2856() {
		checkIsSubtype("void|X<[X]>","X<X|[Y<[Y]>]>");
	}
	@Test public void test_2857() {
		checkIsSubtype("void|X<[X]>","X<X|[[X]]>");
	}
	@Test public void test_2858() {
		checkIsSubtype("void|X<[X]>","X<[X]>|(Y<X<[X]>|Y>)");
	}
	@Test public void test_2859() {
		checkIsSubtype("void|X<[X]>","X<X|[Y<X|Y>]>");
	}
	@Test public void test_2860() {
		checkIsSubtype("void|X<[X]>","(X<X|void>)|void");
	}
	@Test public void test_2861() {
		checkIsSubtype("void|X<[X]>","X<X|(Y<Y|void>)>");
	}
	@Test public void test_2862() {
		checkNotSubtype("void|X<[X]>","(X<X|any>)|any");
	}
	@Test public void test_2863() {
		checkNotSubtype("void|X<[X]>","X<X|(Y<Y|any>)>");
	}
	@Test public void test_2864() {
		checkNotSubtype("void|X<[X]>","(X<X|null>)|null");
	}
	@Test public void test_2865() {
		checkNotSubtype("void|X<[X]>","X<X|(Y<Y|null>)>");
	}
	@Test public void test_2866() {
		checkNotSubtype("void|X<[X]>","(X<X|int>)|int");
	}
	@Test public void test_2867() {
		checkNotSubtype("void|X<[X]>","X<X|(Y<Y|int>)>");
	}
	@Test public void test_2868() {
		checkIsSubtype("void|X<[X]>","(X<X|Y<[Y]>>)|Y<[Y]>");
	}
	@Test public void test_2869() {
		checkIsSubtype("void|X<[X]>","X<X|(Y<Y|Z<[Z]>>)>");
	}
	@Test public void test_2870() {
		checkIsSubtype("void|X<[X]>","X<X|(Y<Y|[X]>)>");
	}
	@Test public void test_2871() {
		checkIsSubtype("void|X<[X]>","X<X|(Y<Y|(Z<X|Z>)>)>");
	}
	@Test public void test_2872() {
		checkNotSubtype("void|[void]","any");
	}
	@Test public void test_2873() {
		checkNotSubtype("void|[void]","null");
	}
	@Test public void test_2874() {
		checkNotSubtype("void|[void]","int");
	}
	@Test public void test_2875() {
		checkNotSubtype("void|[void]","X<[X]>");
	}
	@Test public void test_2876() {
		checkIsSubtype("void|[void]","[void]");
	}
	@Test public void test_2877() {
		checkNotSubtype("void|[void]","[any]");
	}
	@Test public void test_2878() {
		checkNotSubtype("void|[void]","[null]");
	}
	@Test public void test_2879() {
		checkNotSubtype("void|[void]","[int]");
	}
	@Test public void test_2880() {
		checkNotSubtype("void|[void]","[X<[X]>]");
	}
	@Test public void test_2881() {
		checkIsSubtype("void|[void]","X<X|void>");
	}
	@Test public void test_2882() {
		checkNotSubtype("void|[void]","X<X|any>");
	}
	@Test public void test_2883() {
		checkNotSubtype("void|[void]","X<X|null>");
	}
	@Test public void test_2884() {
		checkNotSubtype("void|[void]","X<X|int>");
	}
	@Test public void test_2885() {
		checkNotSubtype("void|[void]","X<X|Y<[Y]>>");
	}
	@Test public void test_2886() {
		checkNotSubtype("void|[void]","[[void]]");
	}
	@Test public void test_2887() {
		checkNotSubtype("void|[void]","[[any]]");
	}
	@Test public void test_2888() {
		checkNotSubtype("void|[void]","[[null]]");
	}
	@Test public void test_2889() {
		checkNotSubtype("void|[void]","[[int]]");
	}
	@Test public void test_2890() {
		checkNotSubtype("void|[void]","[[X<[X]>]]");
	}
	@Test public void test_2891() {
		checkNotSubtype("void|[void]","X<[[[X]]]>");
	}
	@Test public void test_2892() {
		checkNotSubtype("void|[void]","X<[[Y<X|Y>]]>");
	}
	@Test public void test_2893() {
		checkIsSubtype("void|[void]","[X<X|void>]");
	}
	@Test public void test_2894() {
		checkNotSubtype("void|[void]","[X<X|any>]");
	}
	@Test public void test_2895() {
		checkNotSubtype("void|[void]","[X<X|null>]");
	}
	@Test public void test_2896() {
		checkNotSubtype("void|[void]","[X<X|int>]");
	}
	@Test public void test_2897() {
		checkNotSubtype("void|[void]","[X<X|Y<[Y]>>]");
	}
	@Test public void test_2898() {
		checkNotSubtype("void|[void]","X<[Y<Y|[X]>]>");
	}
	@Test public void test_2899() {
		checkNotSubtype("void|[void]","X<[Y<Y|(Z<X|Z>)>]>");
	}
	@Test public void test_2900() {
		checkIsSubtype("void|[void]","void|void");
	}
	@Test public void test_2901() {
		checkNotSubtype("void|[void]","void|any");
	}
	@Test public void test_2902() {
		checkNotSubtype("void|[void]","void|null");
	}
	@Test public void test_2903() {
		checkNotSubtype("void|[void]","void|int");
	}
	@Test public void test_2904() {
		checkNotSubtype("void|[void]","void|X<[X]>");
	}
	@Test public void test_2905() {
		checkIsSubtype("void|[void]","void|[void]");
	}
	@Test public void test_2906() {
		checkIsSubtype("void|[void]","void|(X<void|X>)");
	}
	@Test public void test_2907() {
		checkNotSubtype("void|[void]","any|void");
	}
	@Test public void test_2908() {
		checkNotSubtype("void|[void]","any|any");
	}
	@Test public void test_2909() {
		checkNotSubtype("void|[void]","any|null");
	}
	@Test public void test_2910() {
		checkNotSubtype("void|[void]","any|int");
	}
	@Test public void test_2911() {
		checkNotSubtype("void|[void]","any|X<[X]>");
	}
	@Test public void test_2912() {
		checkNotSubtype("void|[void]","any|[any]");
	}
	@Test public void test_2913() {
		checkNotSubtype("void|[void]","any|(X<any|X>)");
	}
	@Test public void test_2914() {
		checkNotSubtype("void|[void]","null|void");
	}
	@Test public void test_2915() {
		checkNotSubtype("void|[void]","null|any");
	}
	@Test public void test_2916() {
		checkNotSubtype("void|[void]","null|null");
	}
	@Test public void test_2917() {
		checkNotSubtype("void|[void]","null|int");
	}
	@Test public void test_2918() {
		checkNotSubtype("void|[void]","null|X<[X]>");
	}
	@Test public void test_2919() {
		checkNotSubtype("void|[void]","null|[null]");
	}
	@Test public void test_2920() {
		checkNotSubtype("void|[void]","null|(X<null|X>)");
	}
	@Test public void test_2921() {
		checkNotSubtype("void|[void]","int|void");
	}
	@Test public void test_2922() {
		checkNotSubtype("void|[void]","int|any");
	}
	@Test public void test_2923() {
		checkNotSubtype("void|[void]","int|null");
	}
	@Test public void test_2924() {
		checkNotSubtype("void|[void]","int|int");
	}
	@Test public void test_2925() {
		checkNotSubtype("void|[void]","int|X<[X]>");
	}
	@Test public void test_2926() {
		checkNotSubtype("void|[void]","int|[int]");
	}
	@Test public void test_2927() {
		checkNotSubtype("void|[void]","int|(X<int|X>)");
	}
	@Test public void test_2928() {
		checkIsSubtype("void|[void]","[void]|void");
	}
	@Test public void test_2929() {
		checkNotSubtype("void|[void]","X<[X]>|void");
	}
	@Test public void test_2930() {
		checkIsSubtype("void|[void]","X<X|[void]>");
	}
	@Test public void test_2931() {
		checkNotSubtype("void|[void]","[any]|any");
	}
	@Test public void test_2932() {
		checkNotSubtype("void|[void]","X<[X]>|any");
	}
	@Test public void test_2933() {
		checkNotSubtype("void|[void]","X<X|[any]>");
	}
	@Test public void test_2934() {
		checkNotSubtype("void|[void]","[null]|null");
	}
	@Test public void test_2935() {
		checkNotSubtype("void|[void]","X<[X]>|null");
	}
	@Test public void test_2936() {
		checkNotSubtype("void|[void]","X<X|[null]>");
	}
	@Test public void test_2937() {
		checkNotSubtype("void|[void]","[int]|int");
	}
	@Test public void test_2938() {
		checkNotSubtype("void|[void]","X<[X]>|int");
	}
	@Test public void test_2939() {
		checkNotSubtype("void|[void]","X<X|[int]>");
	}
	@Test public void test_2940() {
		checkNotSubtype("void|[void]","[X<[X]>]|X<[X]>");
	}
	@Test public void test_2941() {
		checkNotSubtype("void|[void]","X<[X]>|Y<[Y]>");
	}
	@Test public void test_2942() {
		checkNotSubtype("void|[void]","X<[X]>|[X<[X]>]");
	}
	@Test public void test_2943() {
		checkNotSubtype("void|[void]","X<X|[Y<[Y]>]>");
	}
	@Test public void test_2944() {
		checkNotSubtype("void|[void]","X<X|[[X]]>");
	}
	@Test public void test_2945() {
		checkNotSubtype("void|[void]","X<[X]>|(Y<X<[X]>|Y>)");
	}
	@Test public void test_2946() {
		checkNotSubtype("void|[void]","X<X|[Y<X|Y>]>");
	}
	@Test public void test_2947() {
		checkIsSubtype("void|[void]","(X<X|void>)|void");
	}
	@Test public void test_2948() {
		checkIsSubtype("void|[void]","X<X|(Y<Y|void>)>");
	}
	@Test public void test_2949() {
		checkNotSubtype("void|[void]","(X<X|any>)|any");
	}
	@Test public void test_2950() {
		checkNotSubtype("void|[void]","X<X|(Y<Y|any>)>");
	}
	@Test public void test_2951() {
		checkNotSubtype("void|[void]","(X<X|null>)|null");
	}
	@Test public void test_2952() {
		checkNotSubtype("void|[void]","X<X|(Y<Y|null>)>");
	}
	@Test public void test_2953() {
		checkNotSubtype("void|[void]","(X<X|int>)|int");
	}
	@Test public void test_2954() {
		checkNotSubtype("void|[void]","X<X|(Y<Y|int>)>");
	}
	@Test public void test_2955() {
		checkNotSubtype("void|[void]","(X<X|Y<[Y]>>)|Y<[Y]>");
	}
	@Test public void test_2956() {
		checkNotSubtype("void|[void]","X<X|(Y<Y|Z<[Z]>>)>");
	}
	@Test public void test_2957() {
		checkNotSubtype("void|[void]","X<X|(Y<Y|[X]>)>");
	}
	@Test public void test_2958() {
		checkIsSubtype("void|[void]","X<X|(Y<Y|(Z<X|Z>)>)>");
	}
	@Test public void test_2959() {
		checkNotSubtype("void|(X<void|X>)","any");
	}
	@Test public void test_2960() {
		checkNotSubtype("void|(X<void|X>)","null");
	}
	@Test public void test_2961() {
		checkNotSubtype("void|(X<void|X>)","int");
	}
	@Test public void test_2962() {
		checkNotSubtype("void|(X<void|X>)","X<[X]>");
	}
	@Test public void test_2963() {
		checkNotSubtype("void|(X<void|X>)","[void]");
	}
	@Test public void test_2964() {
		checkNotSubtype("void|(X<void|X>)","[any]");
	}
	@Test public void test_2965() {
		checkNotSubtype("void|(X<void|X>)","[null]");
	}
	@Test public void test_2966() {
		checkNotSubtype("void|(X<void|X>)","[int]");
	}
	@Test public void test_2967() {
		checkNotSubtype("void|(X<void|X>)","[X<[X]>]");
	}
	@Test public void test_2968() {
		checkIsSubtype("void|(X<void|X>)","X<X|void>");
	}
	@Test public void test_2969() {
		checkNotSubtype("void|(X<void|X>)","X<X|any>");
	}
	@Test public void test_2970() {
		checkNotSubtype("void|(X<void|X>)","X<X|null>");
	}
	@Test public void test_2971() {
		checkNotSubtype("void|(X<void|X>)","X<X|int>");
	}
	@Test public void test_2972() {
		checkNotSubtype("void|(X<void|X>)","X<X|Y<[Y]>>");
	}
	@Test public void test_2973() {
		checkNotSubtype("void|(X<void|X>)","[[void]]");
	}
	@Test public void test_2974() {
		checkNotSubtype("void|(X<void|X>)","[[any]]");
	}
	@Test public void test_2975() {
		checkNotSubtype("void|(X<void|X>)","[[null]]");
	}
	@Test public void test_2976() {
		checkNotSubtype("void|(X<void|X>)","[[int]]");
	}
	@Test public void test_2977() {
		checkNotSubtype("void|(X<void|X>)","[[X<[X]>]]");
	}
	@Test public void test_2978() {
		checkNotSubtype("void|(X<void|X>)","X<[[[X]]]>");
	}
	@Test public void test_2979() {
		checkNotSubtype("void|(X<void|X>)","X<[[Y<X|Y>]]>");
	}
	@Test public void test_2980() {
		checkNotSubtype("void|(X<void|X>)","[X<X|void>]");
	}
	@Test public void test_2981() {
		checkNotSubtype("void|(X<void|X>)","[X<X|any>]");
	}
	@Test public void test_2982() {
		checkNotSubtype("void|(X<void|X>)","[X<X|null>]");
	}
	@Test public void test_2983() {
		checkNotSubtype("void|(X<void|X>)","[X<X|int>]");
	}
	@Test public void test_2984() {
		checkNotSubtype("void|(X<void|X>)","[X<X|Y<[Y]>>]");
	}
	@Test public void test_2985() {
		checkNotSubtype("void|(X<void|X>)","X<[Y<Y|[X]>]>");
	}
	@Test public void test_2986() {
		checkNotSubtype("void|(X<void|X>)","X<[Y<Y|(Z<X|Z>)>]>");
	}
	@Test public void test_2987() {
		checkIsSubtype("void|(X<void|X>)","void|void");
	}
	@Test public void test_2988() {
		checkNotSubtype("void|(X<void|X>)","void|any");
	}
	@Test public void test_2989() {
		checkNotSubtype("void|(X<void|X>)","void|null");
	}
	@Test public void test_2990() {
		checkNotSubtype("void|(X<void|X>)","void|int");
	}
	@Test public void test_2991() {
		checkNotSubtype("void|(X<void|X>)","void|X<[X]>");
	}
	@Test public void test_2992() {
		checkNotSubtype("void|(X<void|X>)","void|[void]");
	}
	@Test public void test_2993() {
		checkIsSubtype("void|(X<void|X>)","void|(X<void|X>)");
	}
	@Test public void test_2994() {
		checkNotSubtype("void|(X<void|X>)","any|void");
	}
	@Test public void test_2995() {
		checkNotSubtype("void|(X<void|X>)","any|any");
	}
	@Test public void test_2996() {
		checkNotSubtype("void|(X<void|X>)","any|null");
	}
	@Test public void test_2997() {
		checkNotSubtype("void|(X<void|X>)","any|int");
	}
	@Test public void test_2998() {
		checkNotSubtype("void|(X<void|X>)","any|X<[X]>");
	}
	@Test public void test_2999() {
		checkNotSubtype("void|(X<void|X>)","any|[any]");
	}
	@Test public void test_3000() {
		checkNotSubtype("void|(X<void|X>)","any|(X<any|X>)");
	}
	@Test public void test_3001() {
		checkNotSubtype("void|(X<void|X>)","null|void");
	}
	@Test public void test_3002() {
		checkNotSubtype("void|(X<void|X>)","null|any");
	}
	@Test public void test_3003() {
		checkNotSubtype("void|(X<void|X>)","null|null");
	}
	@Test public void test_3004() {
		checkNotSubtype("void|(X<void|X>)","null|int");
	}
	@Test public void test_3005() {
		checkNotSubtype("void|(X<void|X>)","null|X<[X]>");
	}
	@Test public void test_3006() {
		checkNotSubtype("void|(X<void|X>)","null|[null]");
	}
	@Test public void test_3007() {
		checkNotSubtype("void|(X<void|X>)","null|(X<null|X>)");
	}
	@Test public void test_3008() {
		checkNotSubtype("void|(X<void|X>)","int|void");
	}
	@Test public void test_3009() {
		checkNotSubtype("void|(X<void|X>)","int|any");
	}
	@Test public void test_3010() {
		checkNotSubtype("void|(X<void|X>)","int|null");
	}
	@Test public void test_3011() {
		checkNotSubtype("void|(X<void|X>)","int|int");
	}
	@Test public void test_3012() {
		checkNotSubtype("void|(X<void|X>)","int|X<[X]>");
	}
	@Test public void test_3013() {
		checkNotSubtype("void|(X<void|X>)","int|[int]");
	}
	@Test public void test_3014() {
		checkNotSubtype("void|(X<void|X>)","int|(X<int|X>)");
	}
	@Test public void test_3015() {
		checkNotSubtype("void|(X<void|X>)","[void]|void");
	}
	@Test public void test_3016() {
		checkNotSubtype("void|(X<void|X>)","X<[X]>|void");
	}
	@Test public void test_3017() {
		checkNotSubtype("void|(X<void|X>)","X<X|[void]>");
	}
	@Test public void test_3018() {
		checkNotSubtype("void|(X<void|X>)","[any]|any");
	}
	@Test public void test_3019() {
		checkNotSubtype("void|(X<void|X>)","X<[X]>|any");
	}
	@Test public void test_3020() {
		checkNotSubtype("void|(X<void|X>)","X<X|[any]>");
	}
	@Test public void test_3021() {
		checkNotSubtype("void|(X<void|X>)","[null]|null");
	}
	@Test public void test_3022() {
		checkNotSubtype("void|(X<void|X>)","X<[X]>|null");
	}
	@Test public void test_3023() {
		checkNotSubtype("void|(X<void|X>)","X<X|[null]>");
	}
	@Test public void test_3024() {
		checkNotSubtype("void|(X<void|X>)","[int]|int");
	}
	@Test public void test_3025() {
		checkNotSubtype("void|(X<void|X>)","X<[X]>|int");
	}
	@Test public void test_3026() {
		checkNotSubtype("void|(X<void|X>)","X<X|[int]>");
	}
	@Test public void test_3027() {
		checkNotSubtype("void|(X<void|X>)","[X<[X]>]|X<[X]>");
	}
	@Test public void test_3028() {
		checkNotSubtype("void|(X<void|X>)","X<[X]>|Y<[Y]>");
	}
	@Test public void test_3029() {
		checkNotSubtype("void|(X<void|X>)","X<[X]>|[X<[X]>]");
	}
	@Test public void test_3030() {
		checkNotSubtype("void|(X<void|X>)","X<X|[Y<[Y]>]>");
	}
	@Test public void test_3031() {
		checkNotSubtype("void|(X<void|X>)","X<X|[[X]]>");
	}
	@Test public void test_3032() {
		checkNotSubtype("void|(X<void|X>)","X<[X]>|(Y<X<[X]>|Y>)");
	}
	@Test public void test_3033() {
		checkNotSubtype("void|(X<void|X>)","X<X|[Y<X|Y>]>");
	}
	@Test public void test_3034() {
		checkIsSubtype("void|(X<void|X>)","(X<X|void>)|void");
	}
	@Test public void test_3035() {
		checkIsSubtype("void|(X<void|X>)","X<X|(Y<Y|void>)>");
	}
	@Test public void test_3036() {
		checkNotSubtype("void|(X<void|X>)","(X<X|any>)|any");
	}
	@Test public void test_3037() {
		checkNotSubtype("void|(X<void|X>)","X<X|(Y<Y|any>)>");
	}
	@Test public void test_3038() {
		checkNotSubtype("void|(X<void|X>)","(X<X|null>)|null");
	}
	@Test public void test_3039() {
		checkNotSubtype("void|(X<void|X>)","X<X|(Y<Y|null>)>");
	}
	@Test public void test_3040() {
		checkNotSubtype("void|(X<void|X>)","(X<X|int>)|int");
	}
	@Test public void test_3041() {
		checkNotSubtype("void|(X<void|X>)","X<X|(Y<Y|int>)>");
	}
	@Test public void test_3042() {
		checkNotSubtype("void|(X<void|X>)","(X<X|Y<[Y]>>)|Y<[Y]>");
	}
	@Test public void test_3043() {
		checkNotSubtype("void|(X<void|X>)","X<X|(Y<Y|Z<[Z]>>)>");
	}
	@Test public void test_3044() {
		checkNotSubtype("void|(X<void|X>)","X<X|(Y<Y|[X]>)>");
	}
	@Test public void test_3045() {
		checkIsSubtype("void|(X<void|X>)","X<X|(Y<Y|(Z<X|Z>)>)>");
	}
	@Test public void test_3046() {
		checkIsSubtype("any|void","any");
	}
	@Test public void test_3047() {
		checkIsSubtype("any|void","null");
	}
	@Test public void test_3048() {
		checkIsSubtype("any|void","int");
	}
	@Test public void test_3049() {
		checkIsSubtype("any|void","X<[X]>");
	}
	@Test public void test_3050() {
		checkIsSubtype("any|void","[void]");
	}
	@Test public void test_3051() {
		checkIsSubtype("any|void","[any]");
	}
	@Test public void test_3052() {
		checkIsSubtype("any|void","[null]");
	}
	@Test public void test_3053() {
		checkIsSubtype("any|void","[int]");
	}
	@Test public void test_3054() {
		checkIsSubtype("any|void","[X<[X]>]");
	}
	@Test public void test_3055() {
		checkIsSubtype("any|void","X<X|void>");
	}
	@Test public void test_3056() {
		checkIsSubtype("any|void","X<X|any>");
	}
	@Test public void test_3057() {
		checkIsSubtype("any|void","X<X|null>");
	}
	@Test public void test_3058() {
		checkIsSubtype("any|void","X<X|int>");
	}
	@Test public void test_3059() {
		checkIsSubtype("any|void","X<X|Y<[Y]>>");
	}
	@Test public void test_3060() {
		checkIsSubtype("any|void","[[void]]");
	}
	@Test public void test_3061() {
		checkIsSubtype("any|void","[[any]]");
	}
	@Test public void test_3062() {
		checkIsSubtype("any|void","[[null]]");
	}
	@Test public void test_3063() {
		checkIsSubtype("any|void","[[int]]");
	}
	@Test public void test_3064() {
		checkIsSubtype("any|void","[[X<[X]>]]");
	}
	@Test public void test_3065() {
		checkIsSubtype("any|void","X<[[[X]]]>");
	}
	@Test public void test_3066() {
		checkIsSubtype("any|void","X<[[Y<X|Y>]]>");
	}
	@Test public void test_3067() {
		checkIsSubtype("any|void","[X<X|void>]");
	}
	@Test public void test_3068() {
		checkIsSubtype("any|void","[X<X|any>]");
	}
	@Test public void test_3069() {
		checkIsSubtype("any|void","[X<X|null>]");
	}
	@Test public void test_3070() {
		checkIsSubtype("any|void","[X<X|int>]");
	}
	@Test public void test_3071() {
		checkIsSubtype("any|void","[X<X|Y<[Y]>>]");
	}
	@Test public void test_3072() {
		checkIsSubtype("any|void","X<[Y<Y|[X]>]>");
	}
	@Test public void test_3073() {
		checkIsSubtype("any|void","X<[Y<Y|(Z<X|Z>)>]>");
	}
	@Test public void test_3074() {
		checkIsSubtype("any|void","void|void");
	}
	@Test public void test_3075() {
		checkIsSubtype("any|void","void|any");
	}
	@Test public void test_3076() {
		checkIsSubtype("any|void","void|null");
	}
	@Test public void test_3077() {
		checkIsSubtype("any|void","void|int");
	}
	@Test public void test_3078() {
		checkIsSubtype("any|void","void|X<[X]>");
	}
	@Test public void test_3079() {
		checkIsSubtype("any|void","void|[void]");
	}
	@Test public void test_3080() {
		checkIsSubtype("any|void","void|(X<void|X>)");
	}
	@Test public void test_3081() {
		checkIsSubtype("any|void","any|void");
	}
	@Test public void test_3082() {
		checkIsSubtype("any|void","any|any");
	}
	@Test public void test_3083() {
		checkIsSubtype("any|void","any|null");
	}
	@Test public void test_3084() {
		checkIsSubtype("any|void","any|int");
	}
	@Test public void test_3085() {
		checkIsSubtype("any|void","any|X<[X]>");
	}
	@Test public void test_3086() {
		checkIsSubtype("any|void","any|[any]");
	}
	@Test public void test_3087() {
		checkIsSubtype("any|void","any|(X<any|X>)");
	}
	@Test public void test_3088() {
		checkIsSubtype("any|void","null|void");
	}
	@Test public void test_3089() {
		checkIsSubtype("any|void","null|any");
	}
	@Test public void test_3090() {
		checkIsSubtype("any|void","null|null");
	}
	@Test public void test_3091() {
		checkIsSubtype("any|void","null|int");
	}
	@Test public void test_3092() {
		checkIsSubtype("any|void","null|X<[X]>");
	}
	@Test public void test_3093() {
		checkIsSubtype("any|void","null|[null]");
	}
	@Test public void test_3094() {
		checkIsSubtype("any|void","null|(X<null|X>)");
	}
	@Test public void test_3095() {
		checkIsSubtype("any|void","int|void");
	}
	@Test public void test_3096() {
		checkIsSubtype("any|void","int|any");
	}
	@Test public void test_3097() {
		checkIsSubtype("any|void","int|null");
	}
	@Test public void test_3098() {
		checkIsSubtype("any|void","int|int");
	}
	@Test public void test_3099() {
		checkIsSubtype("any|void","int|X<[X]>");
	}
	@Test public void test_3100() {
		checkIsSubtype("any|void","int|[int]");
	}
	@Test public void test_3101() {
		checkIsSubtype("any|void","int|(X<int|X>)");
	}
	@Test public void test_3102() {
		checkIsSubtype("any|void","[void]|void");
	}
	@Test public void test_3103() {
		checkIsSubtype("any|void","X<[X]>|void");
	}
	@Test public void test_3104() {
		checkIsSubtype("any|void","X<X|[void]>");
	}
	@Test public void test_3105() {
		checkIsSubtype("any|void","[any]|any");
	}
	@Test public void test_3106() {
		checkIsSubtype("any|void","X<[X]>|any");
	}
	@Test public void test_3107() {
		checkIsSubtype("any|void","X<X|[any]>");
	}
	@Test public void test_3108() {
		checkIsSubtype("any|void","[null]|null");
	}
	@Test public void test_3109() {
		checkIsSubtype("any|void","X<[X]>|null");
	}
	@Test public void test_3110() {
		checkIsSubtype("any|void","X<X|[null]>");
	}
	@Test public void test_3111() {
		checkIsSubtype("any|void","[int]|int");
	}
	@Test public void test_3112() {
		checkIsSubtype("any|void","X<[X]>|int");
	}
	@Test public void test_3113() {
		checkIsSubtype("any|void","X<X|[int]>");
	}
	@Test public void test_3114() {
		checkIsSubtype("any|void","[X<[X]>]|X<[X]>");
	}
	@Test public void test_3115() {
		checkIsSubtype("any|void","X<[X]>|Y<[Y]>");
	}
	@Test public void test_3116() {
		checkIsSubtype("any|void","X<[X]>|[X<[X]>]");
	}
	@Test public void test_3117() {
		checkIsSubtype("any|void","X<X|[Y<[Y]>]>");
	}
	@Test public void test_3118() {
		checkIsSubtype("any|void","X<X|[[X]]>");
	}
	@Test public void test_3119() {
		checkIsSubtype("any|void","X<[X]>|(Y<X<[X]>|Y>)");
	}
	@Test public void test_3120() {
		checkIsSubtype("any|void","X<X|[Y<X|Y>]>");
	}
	@Test public void test_3121() {
		checkIsSubtype("any|void","(X<X|void>)|void");
	}
	@Test public void test_3122() {
		checkIsSubtype("any|void","X<X|(Y<Y|void>)>");
	}
	@Test public void test_3123() {
		checkIsSubtype("any|void","(X<X|any>)|any");
	}
	@Test public void test_3124() {
		checkIsSubtype("any|void","X<X|(Y<Y|any>)>");
	}
	@Test public void test_3125() {
		checkIsSubtype("any|void","(X<X|null>)|null");
	}
	@Test public void test_3126() {
		checkIsSubtype("any|void","X<X|(Y<Y|null>)>");
	}
	@Test public void test_3127() {
		checkIsSubtype("any|void","(X<X|int>)|int");
	}
	@Test public void test_3128() {
		checkIsSubtype("any|void","X<X|(Y<Y|int>)>");
	}
	@Test public void test_3129() {
		checkIsSubtype("any|void","(X<X|Y<[Y]>>)|Y<[Y]>");
	}
	@Test public void test_3130() {
		checkIsSubtype("any|void","X<X|(Y<Y|Z<[Z]>>)>");
	}
	@Test public void test_3131() {
		checkIsSubtype("any|void","X<X|(Y<Y|[X]>)>");
	}
	@Test public void test_3132() {
		checkIsSubtype("any|void","X<X|(Y<Y|(Z<X|Z>)>)>");
	}
	@Test public void test_3133() {
		checkIsSubtype("any|any","any");
	}
	@Test public void test_3134() {
		checkIsSubtype("any|any","null");
	}
	@Test public void test_3135() {
		checkIsSubtype("any|any","int");
	}
	@Test public void test_3136() {
		checkIsSubtype("any|any","X<[X]>");
	}
	@Test public void test_3137() {
		checkIsSubtype("any|any","[void]");
	}
	@Test public void test_3138() {
		checkIsSubtype("any|any","[any]");
	}
	@Test public void test_3139() {
		checkIsSubtype("any|any","[null]");
	}
	@Test public void test_3140() {
		checkIsSubtype("any|any","[int]");
	}
	@Test public void test_3141() {
		checkIsSubtype("any|any","[X<[X]>]");
	}
	@Test public void test_3142() {
		checkIsSubtype("any|any","X<X|void>");
	}
	@Test public void test_3143() {
		checkIsSubtype("any|any","X<X|any>");
	}
	@Test public void test_3144() {
		checkIsSubtype("any|any","X<X|null>");
	}
	@Test public void test_3145() {
		checkIsSubtype("any|any","X<X|int>");
	}
	@Test public void test_3146() {
		checkIsSubtype("any|any","X<X|Y<[Y]>>");
	}
	@Test public void test_3147() {
		checkIsSubtype("any|any","[[void]]");
	}
	@Test public void test_3148() {
		checkIsSubtype("any|any","[[any]]");
	}
	@Test public void test_3149() {
		checkIsSubtype("any|any","[[null]]");
	}
	@Test public void test_3150() {
		checkIsSubtype("any|any","[[int]]");
	}
	@Test public void test_3151() {
		checkIsSubtype("any|any","[[X<[X]>]]");
	}
	@Test public void test_3152() {
		checkIsSubtype("any|any","X<[[[X]]]>");
	}
	@Test public void test_3153() {
		checkIsSubtype("any|any","X<[[Y<X|Y>]]>");
	}
	@Test public void test_3154() {
		checkIsSubtype("any|any","[X<X|void>]");
	}
	@Test public void test_3155() {
		checkIsSubtype("any|any","[X<X|any>]");
	}
	@Test public void test_3156() {
		checkIsSubtype("any|any","[X<X|null>]");
	}
	@Test public void test_3157() {
		checkIsSubtype("any|any","[X<X|int>]");
	}
	@Test public void test_3158() {
		checkIsSubtype("any|any","[X<X|Y<[Y]>>]");
	}
	@Test public void test_3159() {
		checkIsSubtype("any|any","X<[Y<Y|[X]>]>");
	}
	@Test public void test_3160() {
		checkIsSubtype("any|any","X<[Y<Y|(Z<X|Z>)>]>");
	}
	@Test public void test_3161() {
		checkIsSubtype("any|any","void|void");
	}
	@Test public void test_3162() {
		checkIsSubtype("any|any","void|any");
	}
	@Test public void test_3163() {
		checkIsSubtype("any|any","void|null");
	}
	@Test public void test_3164() {
		checkIsSubtype("any|any","void|int");
	}
	@Test public void test_3165() {
		checkIsSubtype("any|any","void|X<[X]>");
	}
	@Test public void test_3166() {
		checkIsSubtype("any|any","void|[void]");
	}
	@Test public void test_3167() {
		checkIsSubtype("any|any","void|(X<void|X>)");
	}
	@Test public void test_3168() {
		checkIsSubtype("any|any","any|void");
	}
	@Test public void test_3169() {
		checkIsSubtype("any|any","any|any");
	}
	@Test public void test_3170() {
		checkIsSubtype("any|any","any|null");
	}
	@Test public void test_3171() {
		checkIsSubtype("any|any","any|int");
	}
	@Test public void test_3172() {
		checkIsSubtype("any|any","any|X<[X]>");
	}
	@Test public void test_3173() {
		checkIsSubtype("any|any","any|[any]");
	}
	@Test public void test_3174() {
		checkIsSubtype("any|any","any|(X<any|X>)");
	}
	@Test public void test_3175() {
		checkIsSubtype("any|any","null|void");
	}
	@Test public void test_3176() {
		checkIsSubtype("any|any","null|any");
	}
	@Test public void test_3177() {
		checkIsSubtype("any|any","null|null");
	}
	@Test public void test_3178() {
		checkIsSubtype("any|any","null|int");
	}
	@Test public void test_3179() {
		checkIsSubtype("any|any","null|X<[X]>");
	}
	@Test public void test_3180() {
		checkIsSubtype("any|any","null|[null]");
	}
	@Test public void test_3181() {
		checkIsSubtype("any|any","null|(X<null|X>)");
	}
	@Test public void test_3182() {
		checkIsSubtype("any|any","int|void");
	}
	@Test public void test_3183() {
		checkIsSubtype("any|any","int|any");
	}
	@Test public void test_3184() {
		checkIsSubtype("any|any","int|null");
	}
	@Test public void test_3185() {
		checkIsSubtype("any|any","int|int");
	}
	@Test public void test_3186() {
		checkIsSubtype("any|any","int|X<[X]>");
	}
	@Test public void test_3187() {
		checkIsSubtype("any|any","int|[int]");
	}
	@Test public void test_3188() {
		checkIsSubtype("any|any","int|(X<int|X>)");
	}
	@Test public void test_3189() {
		checkIsSubtype("any|any","[void]|void");
	}
	@Test public void test_3190() {
		checkIsSubtype("any|any","X<[X]>|void");
	}
	@Test public void test_3191() {
		checkIsSubtype("any|any","X<X|[void]>");
	}
	@Test public void test_3192() {
		checkIsSubtype("any|any","[any]|any");
	}
	@Test public void test_3193() {
		checkIsSubtype("any|any","X<[X]>|any");
	}
	@Test public void test_3194() {
		checkIsSubtype("any|any","X<X|[any]>");
	}
	@Test public void test_3195() {
		checkIsSubtype("any|any","[null]|null");
	}
	@Test public void test_3196() {
		checkIsSubtype("any|any","X<[X]>|null");
	}
	@Test public void test_3197() {
		checkIsSubtype("any|any","X<X|[null]>");
	}
	@Test public void test_3198() {
		checkIsSubtype("any|any","[int]|int");
	}
	@Test public void test_3199() {
		checkIsSubtype("any|any","X<[X]>|int");
	}
	@Test public void test_3200() {
		checkIsSubtype("any|any","X<X|[int]>");
	}
	@Test public void test_3201() {
		checkIsSubtype("any|any","[X<[X]>]|X<[X]>");
	}
	@Test public void test_3202() {
		checkIsSubtype("any|any","X<[X]>|Y<[Y]>");
	}
	@Test public void test_3203() {
		checkIsSubtype("any|any","X<[X]>|[X<[X]>]");
	}
	@Test public void test_3204() {
		checkIsSubtype("any|any","X<X|[Y<[Y]>]>");
	}
	@Test public void test_3205() {
		checkIsSubtype("any|any","X<X|[[X]]>");
	}
	@Test public void test_3206() {
		checkIsSubtype("any|any","X<[X]>|(Y<X<[X]>|Y>)");
	}
	@Test public void test_3207() {
		checkIsSubtype("any|any","X<X|[Y<X|Y>]>");
	}
	@Test public void test_3208() {
		checkIsSubtype("any|any","(X<X|void>)|void");
	}
	@Test public void test_3209() {
		checkIsSubtype("any|any","X<X|(Y<Y|void>)>");
	}
	@Test public void test_3210() {
		checkIsSubtype("any|any","(X<X|any>)|any");
	}
	@Test public void test_3211() {
		checkIsSubtype("any|any","X<X|(Y<Y|any>)>");
	}
	@Test public void test_3212() {
		checkIsSubtype("any|any","(X<X|null>)|null");
	}
	@Test public void test_3213() {
		checkIsSubtype("any|any","X<X|(Y<Y|null>)>");
	}
	@Test public void test_3214() {
		checkIsSubtype("any|any","(X<X|int>)|int");
	}
	@Test public void test_3215() {
		checkIsSubtype("any|any","X<X|(Y<Y|int>)>");
	}
	@Test public void test_3216() {
		checkIsSubtype("any|any","(X<X|Y<[Y]>>)|Y<[Y]>");
	}
	@Test public void test_3217() {
		checkIsSubtype("any|any","X<X|(Y<Y|Z<[Z]>>)>");
	}
	@Test public void test_3218() {
		checkIsSubtype("any|any","X<X|(Y<Y|[X]>)>");
	}
	@Test public void test_3219() {
		checkIsSubtype("any|any","X<X|(Y<Y|(Z<X|Z>)>)>");
	}
	@Test public void test_3220() {
		checkIsSubtype("any|null","any");
	}
	@Test public void test_3221() {
		checkIsSubtype("any|null","null");
	}
	@Test public void test_3222() {
		checkIsSubtype("any|null","int");
	}
	@Test public void test_3223() {
		checkIsSubtype("any|null","X<[X]>");
	}
	@Test public void test_3224() {
		checkIsSubtype("any|null","[void]");
	}
	@Test public void test_3225() {
		checkIsSubtype("any|null","[any]");
	}
	@Test public void test_3226() {
		checkIsSubtype("any|null","[null]");
	}
	@Test public void test_3227() {
		checkIsSubtype("any|null","[int]");
	}
	@Test public void test_3228() {
		checkIsSubtype("any|null","[X<[X]>]");
	}
	@Test public void test_3229() {
		checkIsSubtype("any|null","X<X|void>");
	}
	@Test public void test_3230() {
		checkIsSubtype("any|null","X<X|any>");
	}
	@Test public void test_3231() {
		checkIsSubtype("any|null","X<X|null>");
	}
	@Test public void test_3232() {
		checkIsSubtype("any|null","X<X|int>");
	}
	@Test public void test_3233() {
		checkIsSubtype("any|null","X<X|Y<[Y]>>");
	}
	@Test public void test_3234() {
		checkIsSubtype("any|null","[[void]]");
	}
	@Test public void test_3235() {
		checkIsSubtype("any|null","[[any]]");
	}
	@Test public void test_3236() {
		checkIsSubtype("any|null","[[null]]");
	}
	@Test public void test_3237() {
		checkIsSubtype("any|null","[[int]]");
	}
	@Test public void test_3238() {
		checkIsSubtype("any|null","[[X<[X]>]]");
	}
	@Test public void test_3239() {
		checkIsSubtype("any|null","X<[[[X]]]>");
	}
	@Test public void test_3240() {
		checkIsSubtype("any|null","X<[[Y<X|Y>]]>");
	}
	@Test public void test_3241() {
		checkIsSubtype("any|null","[X<X|void>]");
	}
	@Test public void test_3242() {
		checkIsSubtype("any|null","[X<X|any>]");
	}
	@Test public void test_3243() {
		checkIsSubtype("any|null","[X<X|null>]");
	}
	@Test public void test_3244() {
		checkIsSubtype("any|null","[X<X|int>]");
	}
	@Test public void test_3245() {
		checkIsSubtype("any|null","[X<X|Y<[Y]>>]");
	}
	@Test public void test_3246() {
		checkIsSubtype("any|null","X<[Y<Y|[X]>]>");
	}
	@Test public void test_3247() {
		checkIsSubtype("any|null","X<[Y<Y|(Z<X|Z>)>]>");
	}
	@Test public void test_3248() {
		checkIsSubtype("any|null","void|void");
	}
	@Test public void test_3249() {
		checkIsSubtype("any|null","void|any");
	}
	@Test public void test_3250() {
		checkIsSubtype("any|null","void|null");
	}
	@Test public void test_3251() {
		checkIsSubtype("any|null","void|int");
	}
	@Test public void test_3252() {
		checkIsSubtype("any|null","void|X<[X]>");
	}
	@Test public void test_3253() {
		checkIsSubtype("any|null","void|[void]");
	}
	@Test public void test_3254() {
		checkIsSubtype("any|null","void|(X<void|X>)");
	}
	@Test public void test_3255() {
		checkIsSubtype("any|null","any|void");
	}
	@Test public void test_3256() {
		checkIsSubtype("any|null","any|any");
	}
	@Test public void test_3257() {
		checkIsSubtype("any|null","any|null");
	}
	@Test public void test_3258() {
		checkIsSubtype("any|null","any|int");
	}
	@Test public void test_3259() {
		checkIsSubtype("any|null","any|X<[X]>");
	}
	@Test public void test_3260() {
		checkIsSubtype("any|null","any|[any]");
	}
	@Test public void test_3261() {
		checkIsSubtype("any|null","any|(X<any|X>)");
	}
	@Test public void test_3262() {
		checkIsSubtype("any|null","null|void");
	}
	@Test public void test_3263() {
		checkIsSubtype("any|null","null|any");
	}
	@Test public void test_3264() {
		checkIsSubtype("any|null","null|null");
	}
	@Test public void test_3265() {
		checkIsSubtype("any|null","null|int");
	}
	@Test public void test_3266() {
		checkIsSubtype("any|null","null|X<[X]>");
	}
	@Test public void test_3267() {
		checkIsSubtype("any|null","null|[null]");
	}
	@Test public void test_3268() {
		checkIsSubtype("any|null","null|(X<null|X>)");
	}
	@Test public void test_3269() {
		checkIsSubtype("any|null","int|void");
	}
	@Test public void test_3270() {
		checkIsSubtype("any|null","int|any");
	}
	@Test public void test_3271() {
		checkIsSubtype("any|null","int|null");
	}
	@Test public void test_3272() {
		checkIsSubtype("any|null","int|int");
	}
	@Test public void test_3273() {
		checkIsSubtype("any|null","int|X<[X]>");
	}
	@Test public void test_3274() {
		checkIsSubtype("any|null","int|[int]");
	}
	@Test public void test_3275() {
		checkIsSubtype("any|null","int|(X<int|X>)");
	}
	@Test public void test_3276() {
		checkIsSubtype("any|null","[void]|void");
	}
	@Test public void test_3277() {
		checkIsSubtype("any|null","X<[X]>|void");
	}
	@Test public void test_3278() {
		checkIsSubtype("any|null","X<X|[void]>");
	}
	@Test public void test_3279() {
		checkIsSubtype("any|null","[any]|any");
	}
	@Test public void test_3280() {
		checkIsSubtype("any|null","X<[X]>|any");
	}
	@Test public void test_3281() {
		checkIsSubtype("any|null","X<X|[any]>");
	}
	@Test public void test_3282() {
		checkIsSubtype("any|null","[null]|null");
	}
	@Test public void test_3283() {
		checkIsSubtype("any|null","X<[X]>|null");
	}
	@Test public void test_3284() {
		checkIsSubtype("any|null","X<X|[null]>");
	}
	@Test public void test_3285() {
		checkIsSubtype("any|null","[int]|int");
	}
	@Test public void test_3286() {
		checkIsSubtype("any|null","X<[X]>|int");
	}
	@Test public void test_3287() {
		checkIsSubtype("any|null","X<X|[int]>");
	}
	@Test public void test_3288() {
		checkIsSubtype("any|null","[X<[X]>]|X<[X]>");
	}
	@Test public void test_3289() {
		checkIsSubtype("any|null","X<[X]>|Y<[Y]>");
	}
	@Test public void test_3290() {
		checkIsSubtype("any|null","X<[X]>|[X<[X]>]");
	}
	@Test public void test_3291() {
		checkIsSubtype("any|null","X<X|[Y<[Y]>]>");
	}
	@Test public void test_3292() {
		checkIsSubtype("any|null","X<X|[[X]]>");
	}
	@Test public void test_3293() {
		checkIsSubtype("any|null","X<[X]>|(Y<X<[X]>|Y>)");
	}
	@Test public void test_3294() {
		checkIsSubtype("any|null","X<X|[Y<X|Y>]>");
	}
	@Test public void test_3295() {
		checkIsSubtype("any|null","(X<X|void>)|void");
	}
	@Test public void test_3296() {
		checkIsSubtype("any|null","X<X|(Y<Y|void>)>");
	}
	@Test public void test_3297() {
		checkIsSubtype("any|null","(X<X|any>)|any");
	}
	@Test public void test_3298() {
		checkIsSubtype("any|null","X<X|(Y<Y|any>)>");
	}
	@Test public void test_3299() {
		checkIsSubtype("any|null","(X<X|null>)|null");
	}
	@Test public void test_3300() {
		checkIsSubtype("any|null","X<X|(Y<Y|null>)>");
	}
	@Test public void test_3301() {
		checkIsSubtype("any|null","(X<X|int>)|int");
	}
	@Test public void test_3302() {
		checkIsSubtype("any|null","X<X|(Y<Y|int>)>");
	}
	@Test public void test_3303() {
		checkIsSubtype("any|null","(X<X|Y<[Y]>>)|Y<[Y]>");
	}
	@Test public void test_3304() {
		checkIsSubtype("any|null","X<X|(Y<Y|Z<[Z]>>)>");
	}
	@Test public void test_3305() {
		checkIsSubtype("any|null","X<X|(Y<Y|[X]>)>");
	}
	@Test public void test_3306() {
		checkIsSubtype("any|null","X<X|(Y<Y|(Z<X|Z>)>)>");
	}
	@Test public void test_3307() {
		checkIsSubtype("any|int","any");
	}
	@Test public void test_3308() {
		checkIsSubtype("any|int","null");
	}
	@Test public void test_3309() {
		checkIsSubtype("any|int","int");
	}
	@Test public void test_3310() {
		checkIsSubtype("any|int","X<[X]>");
	}
	@Test public void test_3311() {
		checkIsSubtype("any|int","[void]");
	}
	@Test public void test_3312() {
		checkIsSubtype("any|int","[any]");
	}
	@Test public void test_3313() {
		checkIsSubtype("any|int","[null]");
	}
	@Test public void test_3314() {
		checkIsSubtype("any|int","[int]");
	}
	@Test public void test_3315() {
		checkIsSubtype("any|int","[X<[X]>]");
	}
	@Test public void test_3316() {
		checkIsSubtype("any|int","X<X|void>");
	}
	@Test public void test_3317() {
		checkIsSubtype("any|int","X<X|any>");
	}
	@Test public void test_3318() {
		checkIsSubtype("any|int","X<X|null>");
	}
	@Test public void test_3319() {
		checkIsSubtype("any|int","X<X|int>");
	}
	@Test public void test_3320() {
		checkIsSubtype("any|int","X<X|Y<[Y]>>");
	}
	@Test public void test_3321() {
		checkIsSubtype("any|int","[[void]]");
	}
	@Test public void test_3322() {
		checkIsSubtype("any|int","[[any]]");
	}
	@Test public void test_3323() {
		checkIsSubtype("any|int","[[null]]");
	}
	@Test public void test_3324() {
		checkIsSubtype("any|int","[[int]]");
	}
	@Test public void test_3325() {
		checkIsSubtype("any|int","[[X<[X]>]]");
	}
	@Test public void test_3326() {
		checkIsSubtype("any|int","X<[[[X]]]>");
	}
	@Test public void test_3327() {
		checkIsSubtype("any|int","X<[[Y<X|Y>]]>");
	}
	@Test public void test_3328() {
		checkIsSubtype("any|int","[X<X|void>]");
	}
	@Test public void test_3329() {
		checkIsSubtype("any|int","[X<X|any>]");
	}
	@Test public void test_3330() {
		checkIsSubtype("any|int","[X<X|null>]");
	}
	@Test public void test_3331() {
		checkIsSubtype("any|int","[X<X|int>]");
	}
	@Test public void test_3332() {
		checkIsSubtype("any|int","[X<X|Y<[Y]>>]");
	}
	@Test public void test_3333() {
		checkIsSubtype("any|int","X<[Y<Y|[X]>]>");
	}
	@Test public void test_3334() {
		checkIsSubtype("any|int","X<[Y<Y|(Z<X|Z>)>]>");
	}
	@Test public void test_3335() {
		checkIsSubtype("any|int","void|void");
	}
	@Test public void test_3336() {
		checkIsSubtype("any|int","void|any");
	}
	@Test public void test_3337() {
		checkIsSubtype("any|int","void|null");
	}
	@Test public void test_3338() {
		checkIsSubtype("any|int","void|int");
	}
	@Test public void test_3339() {
		checkIsSubtype("any|int","void|X<[X]>");
	}
	@Test public void test_3340() {
		checkIsSubtype("any|int","void|[void]");
	}
	@Test public void test_3341() {
		checkIsSubtype("any|int","void|(X<void|X>)");
	}
	@Test public void test_3342() {
		checkIsSubtype("any|int","any|void");
	}
	@Test public void test_3343() {
		checkIsSubtype("any|int","any|any");
	}
	@Test public void test_3344() {
		checkIsSubtype("any|int","any|null");
	}
	@Test public void test_3345() {
		checkIsSubtype("any|int","any|int");
	}
	@Test public void test_3346() {
		checkIsSubtype("any|int","any|X<[X]>");
	}
	@Test public void test_3347() {
		checkIsSubtype("any|int","any|[any]");
	}
	@Test public void test_3348() {
		checkIsSubtype("any|int","any|(X<any|X>)");
	}
	@Test public void test_3349() {
		checkIsSubtype("any|int","null|void");
	}
	@Test public void test_3350() {
		checkIsSubtype("any|int","null|any");
	}
	@Test public void test_3351() {
		checkIsSubtype("any|int","null|null");
	}
	@Test public void test_3352() {
		checkIsSubtype("any|int","null|int");
	}
	@Test public void test_3353() {
		checkIsSubtype("any|int","null|X<[X]>");
	}
	@Test public void test_3354() {
		checkIsSubtype("any|int","null|[null]");
	}
	@Test public void test_3355() {
		checkIsSubtype("any|int","null|(X<null|X>)");
	}
	@Test public void test_3356() {
		checkIsSubtype("any|int","int|void");
	}
	@Test public void test_3357() {
		checkIsSubtype("any|int","int|any");
	}
	@Test public void test_3358() {
		checkIsSubtype("any|int","int|null");
	}
	@Test public void test_3359() {
		checkIsSubtype("any|int","int|int");
	}
	@Test public void test_3360() {
		checkIsSubtype("any|int","int|X<[X]>");
	}
	@Test public void test_3361() {
		checkIsSubtype("any|int","int|[int]");
	}
	@Test public void test_3362() {
		checkIsSubtype("any|int","int|(X<int|X>)");
	}
	@Test public void test_3363() {
		checkIsSubtype("any|int","[void]|void");
	}
	@Test public void test_3364() {
		checkIsSubtype("any|int","X<[X]>|void");
	}
	@Test public void test_3365() {
		checkIsSubtype("any|int","X<X|[void]>");
	}
	@Test public void test_3366() {
		checkIsSubtype("any|int","[any]|any");
	}
	@Test public void test_3367() {
		checkIsSubtype("any|int","X<[X]>|any");
	}
	@Test public void test_3368() {
		checkIsSubtype("any|int","X<X|[any]>");
	}
	@Test public void test_3369() {
		checkIsSubtype("any|int","[null]|null");
	}
	@Test public void test_3370() {
		checkIsSubtype("any|int","X<[X]>|null");
	}
	@Test public void test_3371() {
		checkIsSubtype("any|int","X<X|[null]>");
	}
	@Test public void test_3372() {
		checkIsSubtype("any|int","[int]|int");
	}
	@Test public void test_3373() {
		checkIsSubtype("any|int","X<[X]>|int");
	}
	@Test public void test_3374() {
		checkIsSubtype("any|int","X<X|[int]>");
	}
	@Test public void test_3375() {
		checkIsSubtype("any|int","[X<[X]>]|X<[X]>");
	}
	@Test public void test_3376() {
		checkIsSubtype("any|int","X<[X]>|Y<[Y]>");
	}
	@Test public void test_3377() {
		checkIsSubtype("any|int","X<[X]>|[X<[X]>]");
	}
	@Test public void test_3378() {
		checkIsSubtype("any|int","X<X|[Y<[Y]>]>");
	}
	@Test public void test_3379() {
		checkIsSubtype("any|int","X<X|[[X]]>");
	}
	@Test public void test_3380() {
		checkIsSubtype("any|int","X<[X]>|(Y<X<[X]>|Y>)");
	}
	@Test public void test_3381() {
		checkIsSubtype("any|int","X<X|[Y<X|Y>]>");
	}
	@Test public void test_3382() {
		checkIsSubtype("any|int","(X<X|void>)|void");
	}
	@Test public void test_3383() {
		checkIsSubtype("any|int","X<X|(Y<Y|void>)>");
	}
	@Test public void test_3384() {
		checkIsSubtype("any|int","(X<X|any>)|any");
	}
	@Test public void test_3385() {
		checkIsSubtype("any|int","X<X|(Y<Y|any>)>");
	}
	@Test public void test_3386() {
		checkIsSubtype("any|int","(X<X|null>)|null");
	}
	@Test public void test_3387() {
		checkIsSubtype("any|int","X<X|(Y<Y|null>)>");
	}
	@Test public void test_3388() {
		checkIsSubtype("any|int","(X<X|int>)|int");
	}
	@Test public void test_3389() {
		checkIsSubtype("any|int","X<X|(Y<Y|int>)>");
	}
	@Test public void test_3390() {
		checkIsSubtype("any|int","(X<X|Y<[Y]>>)|Y<[Y]>");
	}
	@Test public void test_3391() {
		checkIsSubtype("any|int","X<X|(Y<Y|Z<[Z]>>)>");
	}
	@Test public void test_3392() {
		checkIsSubtype("any|int","X<X|(Y<Y|[X]>)>");
	}
	@Test public void test_3393() {
		checkIsSubtype("any|int","X<X|(Y<Y|(Z<X|Z>)>)>");
	}
	@Test public void test_3394() {
		checkIsSubtype("any|X<[X]>","any");
	}
	@Test public void test_3395() {
		checkIsSubtype("any|X<[X]>","null");
	}
	@Test public void test_3396() {
		checkIsSubtype("any|X<[X]>","int");
	}
	@Test public void test_3397() {
		checkIsSubtype("any|X<[X]>","X<[X]>");
	}
	@Test public void test_3398() {
		checkIsSubtype("any|X<[X]>","[void]");
	}
	@Test public void test_3399() {
		checkIsSubtype("any|X<[X]>","[any]");
	}
	@Test public void test_3400() {
		checkIsSubtype("any|X<[X]>","[null]");
	}
	@Test public void test_3401() {
		checkIsSubtype("any|X<[X]>","[int]");
	}
	@Test public void test_3402() {
		checkIsSubtype("any|X<[X]>","[X<[X]>]");
	}
	@Test public void test_3403() {
		checkIsSubtype("any|X<[X]>","X<X|void>");
	}
	@Test public void test_3404() {
		checkIsSubtype("any|X<[X]>","X<X|any>");
	}
	@Test public void test_3405() {
		checkIsSubtype("any|X<[X]>","X<X|null>");
	}
	@Test public void test_3406() {
		checkIsSubtype("any|X<[X]>","X<X|int>");
	}
	@Test public void test_3407() {
		checkIsSubtype("any|X<[X]>","X<X|Y<[Y]>>");
	}
	@Test public void test_3408() {
		checkIsSubtype("any|X<[X]>","[[void]]");
	}
	@Test public void test_3409() {
		checkIsSubtype("any|X<[X]>","[[any]]");
	}
	@Test public void test_3410() {
		checkIsSubtype("any|X<[X]>","[[null]]");
	}
	@Test public void test_3411() {
		checkIsSubtype("any|X<[X]>","[[int]]");
	}
	@Test public void test_3412() {
		checkIsSubtype("any|X<[X]>","[[X<[X]>]]");
	}
	@Test public void test_3413() {
		checkIsSubtype("any|X<[X]>","X<[[[X]]]>");
	}
	@Test public void test_3414() {
		checkIsSubtype("any|X<[X]>","X<[[Y<X|Y>]]>");
	}
	@Test public void test_3415() {
		checkIsSubtype("any|X<[X]>","[X<X|void>]");
	}
	@Test public void test_3416() {
		checkIsSubtype("any|X<[X]>","[X<X|any>]");
	}
	@Test public void test_3417() {
		checkIsSubtype("any|X<[X]>","[X<X|null>]");
	}
	@Test public void test_3418() {
		checkIsSubtype("any|X<[X]>","[X<X|int>]");
	}
	@Test public void test_3419() {
		checkIsSubtype("any|X<[X]>","[X<X|Y<[Y]>>]");
	}
	@Test public void test_3420() {
		checkIsSubtype("any|X<[X]>","X<[Y<Y|[X]>]>");
	}
	@Test public void test_3421() {
		checkIsSubtype("any|X<[X]>","X<[Y<Y|(Z<X|Z>)>]>");
	}
	@Test public void test_3422() {
		checkIsSubtype("any|X<[X]>","void|void");
	}
	@Test public void test_3423() {
		checkIsSubtype("any|X<[X]>","void|any");
	}
	@Test public void test_3424() {
		checkIsSubtype("any|X<[X]>","void|null");
	}
	@Test public void test_3425() {
		checkIsSubtype("any|X<[X]>","void|int");
	}
	@Test public void test_3426() {
		checkIsSubtype("any|X<[X]>","void|X<[X]>");
	}
	@Test public void test_3427() {
		checkIsSubtype("any|X<[X]>","void|[void]");
	}
	@Test public void test_3428() {
		checkIsSubtype("any|X<[X]>","void|(X<void|X>)");
	}
	@Test public void test_3429() {
		checkIsSubtype("any|X<[X]>","any|void");
	}
	@Test public void test_3430() {
		checkIsSubtype("any|X<[X]>","any|any");
	}
	@Test public void test_3431() {
		checkIsSubtype("any|X<[X]>","any|null");
	}
	@Test public void test_3432() {
		checkIsSubtype("any|X<[X]>","any|int");
	}
	@Test public void test_3433() {
		checkIsSubtype("any|X<[X]>","any|X<[X]>");
	}
	@Test public void test_3434() {
		checkIsSubtype("any|X<[X]>","any|[any]");
	}
	@Test public void test_3435() {
		checkIsSubtype("any|X<[X]>","any|(X<any|X>)");
	}
	@Test public void test_3436() {
		checkIsSubtype("any|X<[X]>","null|void");
	}
	@Test public void test_3437() {
		checkIsSubtype("any|X<[X]>","null|any");
	}
	@Test public void test_3438() {
		checkIsSubtype("any|X<[X]>","null|null");
	}
	@Test public void test_3439() {
		checkIsSubtype("any|X<[X]>","null|int");
	}
	@Test public void test_3440() {
		checkIsSubtype("any|X<[X]>","null|X<[X]>");
	}
	@Test public void test_3441() {
		checkIsSubtype("any|X<[X]>","null|[null]");
	}
	@Test public void test_3442() {
		checkIsSubtype("any|X<[X]>","null|(X<null|X>)");
	}
	@Test public void test_3443() {
		checkIsSubtype("any|X<[X]>","int|void");
	}
	@Test public void test_3444() {
		checkIsSubtype("any|X<[X]>","int|any");
	}
	@Test public void test_3445() {
		checkIsSubtype("any|X<[X]>","int|null");
	}
	@Test public void test_3446() {
		checkIsSubtype("any|X<[X]>","int|int");
	}
	@Test public void test_3447() {
		checkIsSubtype("any|X<[X]>","int|X<[X]>");
	}
	@Test public void test_3448() {
		checkIsSubtype("any|X<[X]>","int|[int]");
	}
	@Test public void test_3449() {
		checkIsSubtype("any|X<[X]>","int|(X<int|X>)");
	}
	@Test public void test_3450() {
		checkIsSubtype("any|X<[X]>","[void]|void");
	}
	@Test public void test_3451() {
		checkIsSubtype("any|X<[X]>","X<[X]>|void");
	}
	@Test public void test_3452() {
		checkIsSubtype("any|X<[X]>","X<X|[void]>");
	}
	@Test public void test_3453() {
		checkIsSubtype("any|X<[X]>","[any]|any");
	}
	@Test public void test_3454() {
		checkIsSubtype("any|X<[X]>","X<[X]>|any");
	}
	@Test public void test_3455() {
		checkIsSubtype("any|X<[X]>","X<X|[any]>");
	}
	@Test public void test_3456() {
		checkIsSubtype("any|X<[X]>","[null]|null");
	}
	@Test public void test_3457() {
		checkIsSubtype("any|X<[X]>","X<[X]>|null");
	}
	@Test public void test_3458() {
		checkIsSubtype("any|X<[X]>","X<X|[null]>");
	}
	@Test public void test_3459() {
		checkIsSubtype("any|X<[X]>","[int]|int");
	}
	@Test public void test_3460() {
		checkIsSubtype("any|X<[X]>","X<[X]>|int");
	}
	@Test public void test_3461() {
		checkIsSubtype("any|X<[X]>","X<X|[int]>");
	}
	@Test public void test_3462() {
		checkIsSubtype("any|X<[X]>","[X<[X]>]|X<[X]>");
	}
	@Test public void test_3463() {
		checkIsSubtype("any|X<[X]>","X<[X]>|Y<[Y]>");
	}
	@Test public void test_3464() {
		checkIsSubtype("any|X<[X]>","X<[X]>|[X<[X]>]");
	}
	@Test public void test_3465() {
		checkIsSubtype("any|X<[X]>","X<X|[Y<[Y]>]>");
	}
	@Test public void test_3466() {
		checkIsSubtype("any|X<[X]>","X<X|[[X]]>");
	}
	@Test public void test_3467() {
		checkIsSubtype("any|X<[X]>","X<[X]>|(Y<X<[X]>|Y>)");
	}
	@Test public void test_3468() {
		checkIsSubtype("any|X<[X]>","X<X|[Y<X|Y>]>");
	}
	@Test public void test_3469() {
		checkIsSubtype("any|X<[X]>","(X<X|void>)|void");
	}
	@Test public void test_3470() {
		checkIsSubtype("any|X<[X]>","X<X|(Y<Y|void>)>");
	}
	@Test public void test_3471() {
		checkIsSubtype("any|X<[X]>","(X<X|any>)|any");
	}
	@Test public void test_3472() {
		checkIsSubtype("any|X<[X]>","X<X|(Y<Y|any>)>");
	}
	@Test public void test_3473() {
		checkIsSubtype("any|X<[X]>","(X<X|null>)|null");
	}
	@Test public void test_3474() {
		checkIsSubtype("any|X<[X]>","X<X|(Y<Y|null>)>");
	}
	@Test public void test_3475() {
		checkIsSubtype("any|X<[X]>","(X<X|int>)|int");
	}
	@Test public void test_3476() {
		checkIsSubtype("any|X<[X]>","X<X|(Y<Y|int>)>");
	}
	@Test public void test_3477() {
		checkIsSubtype("any|X<[X]>","(X<X|Y<[Y]>>)|Y<[Y]>");
	}
	@Test public void test_3478() {
		checkIsSubtype("any|X<[X]>","X<X|(Y<Y|Z<[Z]>>)>");
	}
	@Test public void test_3479() {
		checkIsSubtype("any|X<[X]>","X<X|(Y<Y|[X]>)>");
	}
	@Test public void test_3480() {
		checkIsSubtype("any|X<[X]>","X<X|(Y<Y|(Z<X|Z>)>)>");
	}
	@Test public void test_3481() {
		checkIsSubtype("any|[any]","any");
	}
	@Test public void test_3482() {
		checkIsSubtype("any|[any]","null");
	}
	@Test public void test_3483() {
		checkIsSubtype("any|[any]","int");
	}
	@Test public void test_3484() {
		checkIsSubtype("any|[any]","X<[X]>");
	}
	@Test public void test_3485() {
		checkIsSubtype("any|[any]","[void]");
	}
	@Test public void test_3486() {
		checkIsSubtype("any|[any]","[any]");
	}
	@Test public void test_3487() {
		checkIsSubtype("any|[any]","[null]");
	}
	@Test public void test_3488() {
		checkIsSubtype("any|[any]","[int]");
	}
	@Test public void test_3489() {
		checkIsSubtype("any|[any]","[X<[X]>]");
	}
	@Test public void test_3490() {
		checkIsSubtype("any|[any]","X<X|void>");
	}
	@Test public void test_3491() {
		checkIsSubtype("any|[any]","X<X|any>");
	}
	@Test public void test_3492() {
		checkIsSubtype("any|[any]","X<X|null>");
	}
	@Test public void test_3493() {
		checkIsSubtype("any|[any]","X<X|int>");
	}
	@Test public void test_3494() {
		checkIsSubtype("any|[any]","X<X|Y<[Y]>>");
	}
	@Test public void test_3495() {
		checkIsSubtype("any|[any]","[[void]]");
	}
	@Test public void test_3496() {
		checkIsSubtype("any|[any]","[[any]]");
	}
	@Test public void test_3497() {
		checkIsSubtype("any|[any]","[[null]]");
	}
	@Test public void test_3498() {
		checkIsSubtype("any|[any]","[[int]]");
	}
	@Test public void test_3499() {
		checkIsSubtype("any|[any]","[[X<[X]>]]");
	}
	@Test public void test_3500() {
		checkIsSubtype("any|[any]","X<[[[X]]]>");
	}
	@Test public void test_3501() {
		checkIsSubtype("any|[any]","X<[[Y<X|Y>]]>");
	}
	@Test public void test_3502() {
		checkIsSubtype("any|[any]","[X<X|void>]");
	}
	@Test public void test_3503() {
		checkIsSubtype("any|[any]","[X<X|any>]");
	}
	@Test public void test_3504() {
		checkIsSubtype("any|[any]","[X<X|null>]");
	}
	@Test public void test_3505() {
		checkIsSubtype("any|[any]","[X<X|int>]");
	}
	@Test public void test_3506() {
		checkIsSubtype("any|[any]","[X<X|Y<[Y]>>]");
	}
	@Test public void test_3507() {
		checkIsSubtype("any|[any]","X<[Y<Y|[X]>]>");
	}
	@Test public void test_3508() {
		checkIsSubtype("any|[any]","X<[Y<Y|(Z<X|Z>)>]>");
	}
	@Test public void test_3509() {
		checkIsSubtype("any|[any]","void|void");
	}
	@Test public void test_3510() {
		checkIsSubtype("any|[any]","void|any");
	}
	@Test public void test_3511() {
		checkIsSubtype("any|[any]","void|null");
	}
	@Test public void test_3512() {
		checkIsSubtype("any|[any]","void|int");
	}
	@Test public void test_3513() {
		checkIsSubtype("any|[any]","void|X<[X]>");
	}
	@Test public void test_3514() {
		checkIsSubtype("any|[any]","void|[void]");
	}
	@Test public void test_3515() {
		checkIsSubtype("any|[any]","void|(X<void|X>)");
	}
	@Test public void test_3516() {
		checkIsSubtype("any|[any]","any|void");
	}
	@Test public void test_3517() {
		checkIsSubtype("any|[any]","any|any");
	}
	@Test public void test_3518() {
		checkIsSubtype("any|[any]","any|null");
	}
	@Test public void test_3519() {
		checkIsSubtype("any|[any]","any|int");
	}
	@Test public void test_3520() {
		checkIsSubtype("any|[any]","any|X<[X]>");
	}
	@Test public void test_3521() {
		checkIsSubtype("any|[any]","any|[any]");
	}
	@Test public void test_3522() {
		checkIsSubtype("any|[any]","any|(X<any|X>)");
	}
	@Test public void test_3523() {
		checkIsSubtype("any|[any]","null|void");
	}
	@Test public void test_3524() {
		checkIsSubtype("any|[any]","null|any");
	}
	@Test public void test_3525() {
		checkIsSubtype("any|[any]","null|null");
	}
	@Test public void test_3526() {
		checkIsSubtype("any|[any]","null|int");
	}
	@Test public void test_3527() {
		checkIsSubtype("any|[any]","null|X<[X]>");
	}
	@Test public void test_3528() {
		checkIsSubtype("any|[any]","null|[null]");
	}
	@Test public void test_3529() {
		checkIsSubtype("any|[any]","null|(X<null|X>)");
	}
	@Test public void test_3530() {
		checkIsSubtype("any|[any]","int|void");
	}
	@Test public void test_3531() {
		checkIsSubtype("any|[any]","int|any");
	}
	@Test public void test_3532() {
		checkIsSubtype("any|[any]","int|null");
	}
	@Test public void test_3533() {
		checkIsSubtype("any|[any]","int|int");
	}
	@Test public void test_3534() {
		checkIsSubtype("any|[any]","int|X<[X]>");
	}
	@Test public void test_3535() {
		checkIsSubtype("any|[any]","int|[int]");
	}
	@Test public void test_3536() {
		checkIsSubtype("any|[any]","int|(X<int|X>)");
	}
	@Test public void test_3537() {
		checkIsSubtype("any|[any]","[void]|void");
	}
	@Test public void test_3538() {
		checkIsSubtype("any|[any]","X<[X]>|void");
	}
	@Test public void test_3539() {
		checkIsSubtype("any|[any]","X<X|[void]>");
	}
	@Test public void test_3540() {
		checkIsSubtype("any|[any]","[any]|any");
	}
	@Test public void test_3541() {
		checkIsSubtype("any|[any]","X<[X]>|any");
	}
	@Test public void test_3542() {
		checkIsSubtype("any|[any]","X<X|[any]>");
	}
	@Test public void test_3543() {
		checkIsSubtype("any|[any]","[null]|null");
	}
	@Test public void test_3544() {
		checkIsSubtype("any|[any]","X<[X]>|null");
	}
	@Test public void test_3545() {
		checkIsSubtype("any|[any]","X<X|[null]>");
	}
	@Test public void test_3546() {
		checkIsSubtype("any|[any]","[int]|int");
	}
	@Test public void test_3547() {
		checkIsSubtype("any|[any]","X<[X]>|int");
	}
	@Test public void test_3548() {
		checkIsSubtype("any|[any]","X<X|[int]>");
	}
	@Test public void test_3549() {
		checkIsSubtype("any|[any]","[X<[X]>]|X<[X]>");
	}
	@Test public void test_3550() {
		checkIsSubtype("any|[any]","X<[X]>|Y<[Y]>");
	}
	@Test public void test_3551() {
		checkIsSubtype("any|[any]","X<[X]>|[X<[X]>]");
	}
	@Test public void test_3552() {
		checkIsSubtype("any|[any]","X<X|[Y<[Y]>]>");
	}
	@Test public void test_3553() {
		checkIsSubtype("any|[any]","X<X|[[X]]>");
	}
	@Test public void test_3554() {
		checkIsSubtype("any|[any]","X<[X]>|(Y<X<[X]>|Y>)");
	}
	@Test public void test_3555() {
		checkIsSubtype("any|[any]","X<X|[Y<X|Y>]>");
	}
	@Test public void test_3556() {
		checkIsSubtype("any|[any]","(X<X|void>)|void");
	}
	@Test public void test_3557() {
		checkIsSubtype("any|[any]","X<X|(Y<Y|void>)>");
	}
	@Test public void test_3558() {
		checkIsSubtype("any|[any]","(X<X|any>)|any");
	}
	@Test public void test_3559() {
		checkIsSubtype("any|[any]","X<X|(Y<Y|any>)>");
	}
	@Test public void test_3560() {
		checkIsSubtype("any|[any]","(X<X|null>)|null");
	}
	@Test public void test_3561() {
		checkIsSubtype("any|[any]","X<X|(Y<Y|null>)>");
	}
	@Test public void test_3562() {
		checkIsSubtype("any|[any]","(X<X|int>)|int");
	}
	@Test public void test_3563() {
		checkIsSubtype("any|[any]","X<X|(Y<Y|int>)>");
	}
	@Test public void test_3564() {
		checkIsSubtype("any|[any]","(X<X|Y<[Y]>>)|Y<[Y]>");
	}
	@Test public void test_3565() {
		checkIsSubtype("any|[any]","X<X|(Y<Y|Z<[Z]>>)>");
	}
	@Test public void test_3566() {
		checkIsSubtype("any|[any]","X<X|(Y<Y|[X]>)>");
	}
	@Test public void test_3567() {
		checkIsSubtype("any|[any]","X<X|(Y<Y|(Z<X|Z>)>)>");
	}
	@Test public void test_3568() {
		checkIsSubtype("any|(X<any|X>)","any");
	}
	@Test public void test_3569() {
		checkIsSubtype("any|(X<any|X>)","null");
	}
	@Test public void test_3570() {
		checkIsSubtype("any|(X<any|X>)","int");
	}
	@Test public void test_3571() {
		checkIsSubtype("any|(X<any|X>)","X<[X]>");
	}
	@Test public void test_3572() {
		checkIsSubtype("any|(X<any|X>)","[void]");
	}
	@Test public void test_3573() {
		checkIsSubtype("any|(X<any|X>)","[any]");
	}
	@Test public void test_3574() {
		checkIsSubtype("any|(X<any|X>)","[null]");
	}
	@Test public void test_3575() {
		checkIsSubtype("any|(X<any|X>)","[int]");
	}
	@Test public void test_3576() {
		checkIsSubtype("any|(X<any|X>)","[X<[X]>]");
	}
	@Test public void test_3577() {
		checkIsSubtype("any|(X<any|X>)","X<X|void>");
	}
	@Test public void test_3578() {
		checkIsSubtype("any|(X<any|X>)","X<X|any>");
	}
	@Test public void test_3579() {
		checkIsSubtype("any|(X<any|X>)","X<X|null>");
	}
	@Test public void test_3580() {
		checkIsSubtype("any|(X<any|X>)","X<X|int>");
	}
	@Test public void test_3581() {
		checkIsSubtype("any|(X<any|X>)","X<X|Y<[Y]>>");
	}
	@Test public void test_3582() {
		checkIsSubtype("any|(X<any|X>)","[[void]]");
	}
	@Test public void test_3583() {
		checkIsSubtype("any|(X<any|X>)","[[any]]");
	}
	@Test public void test_3584() {
		checkIsSubtype("any|(X<any|X>)","[[null]]");
	}
	@Test public void test_3585() {
		checkIsSubtype("any|(X<any|X>)","[[int]]");
	}
	@Test public void test_3586() {
		checkIsSubtype("any|(X<any|X>)","[[X<[X]>]]");
	}
	@Test public void test_3587() {
		checkIsSubtype("any|(X<any|X>)","X<[[[X]]]>");
	}
	@Test public void test_3588() {
		checkIsSubtype("any|(X<any|X>)","X<[[Y<X|Y>]]>");
	}
	@Test public void test_3589() {
		checkIsSubtype("any|(X<any|X>)","[X<X|void>]");
	}
	@Test public void test_3590() {
		checkIsSubtype("any|(X<any|X>)","[X<X|any>]");
	}
	@Test public void test_3591() {
		checkIsSubtype("any|(X<any|X>)","[X<X|null>]");
	}
	@Test public void test_3592() {
		checkIsSubtype("any|(X<any|X>)","[X<X|int>]");
	}
	@Test public void test_3593() {
		checkIsSubtype("any|(X<any|X>)","[X<X|Y<[Y]>>]");
	}
	@Test public void test_3594() {
		checkIsSubtype("any|(X<any|X>)","X<[Y<Y|[X]>]>");
	}
	@Test public void test_3595() {
		checkIsSubtype("any|(X<any|X>)","X<[Y<Y|(Z<X|Z>)>]>");
	}
	@Test public void test_3596() {
		checkIsSubtype("any|(X<any|X>)","void|void");
	}
	@Test public void test_3597() {
		checkIsSubtype("any|(X<any|X>)","void|any");
	}
	@Test public void test_3598() {
		checkIsSubtype("any|(X<any|X>)","void|null");
	}
	@Test public void test_3599() {
		checkIsSubtype("any|(X<any|X>)","void|int");
	}
	@Test public void test_3600() {
		checkIsSubtype("any|(X<any|X>)","void|X<[X]>");
	}
	@Test public void test_3601() {
		checkIsSubtype("any|(X<any|X>)","void|[void]");
	}
	@Test public void test_3602() {
		checkIsSubtype("any|(X<any|X>)","void|(X<void|X>)");
	}
	@Test public void test_3603() {
		checkIsSubtype("any|(X<any|X>)","any|void");
	}
	@Test public void test_3604() {
		checkIsSubtype("any|(X<any|X>)","any|any");
	}
	@Test public void test_3605() {
		checkIsSubtype("any|(X<any|X>)","any|null");
	}
	@Test public void test_3606() {
		checkIsSubtype("any|(X<any|X>)","any|int");
	}
	@Test public void test_3607() {
		checkIsSubtype("any|(X<any|X>)","any|X<[X]>");
	}
	@Test public void test_3608() {
		checkIsSubtype("any|(X<any|X>)","any|[any]");
	}
	@Test public void test_3609() {
		checkIsSubtype("any|(X<any|X>)","any|(X<any|X>)");
	}
	@Test public void test_3610() {
		checkIsSubtype("any|(X<any|X>)","null|void");
	}
	@Test public void test_3611() {
		checkIsSubtype("any|(X<any|X>)","null|any");
	}
	@Test public void test_3612() {
		checkIsSubtype("any|(X<any|X>)","null|null");
	}
	@Test public void test_3613() {
		checkIsSubtype("any|(X<any|X>)","null|int");
	}
	@Test public void test_3614() {
		checkIsSubtype("any|(X<any|X>)","null|X<[X]>");
	}
	@Test public void test_3615() {
		checkIsSubtype("any|(X<any|X>)","null|[null]");
	}
	@Test public void test_3616() {
		checkIsSubtype("any|(X<any|X>)","null|(X<null|X>)");
	}
	@Test public void test_3617() {
		checkIsSubtype("any|(X<any|X>)","int|void");
	}
	@Test public void test_3618() {
		checkIsSubtype("any|(X<any|X>)","int|any");
	}
	@Test public void test_3619() {
		checkIsSubtype("any|(X<any|X>)","int|null");
	}
	@Test public void test_3620() {
		checkIsSubtype("any|(X<any|X>)","int|int");
	}
	@Test public void test_3621() {
		checkIsSubtype("any|(X<any|X>)","int|X<[X]>");
	}
	@Test public void test_3622() {
		checkIsSubtype("any|(X<any|X>)","int|[int]");
	}
	@Test public void test_3623() {
		checkIsSubtype("any|(X<any|X>)","int|(X<int|X>)");
	}
	@Test public void test_3624() {
		checkIsSubtype("any|(X<any|X>)","[void]|void");
	}
	@Test public void test_3625() {
		checkIsSubtype("any|(X<any|X>)","X<[X]>|void");
	}
	@Test public void test_3626() {
		checkIsSubtype("any|(X<any|X>)","X<X|[void]>");
	}
	@Test public void test_3627() {
		checkIsSubtype("any|(X<any|X>)","[any]|any");
	}
	@Test public void test_3628() {
		checkIsSubtype("any|(X<any|X>)","X<[X]>|any");
	}
	@Test public void test_3629() {
		checkIsSubtype("any|(X<any|X>)","X<X|[any]>");
	}
	@Test public void test_3630() {
		checkIsSubtype("any|(X<any|X>)","[null]|null");
	}
	@Test public void test_3631() {
		checkIsSubtype("any|(X<any|X>)","X<[X]>|null");
	}
	@Test public void test_3632() {
		checkIsSubtype("any|(X<any|X>)","X<X|[null]>");
	}
	@Test public void test_3633() {
		checkIsSubtype("any|(X<any|X>)","[int]|int");
	}
	@Test public void test_3634() {
		checkIsSubtype("any|(X<any|X>)","X<[X]>|int");
	}
	@Test public void test_3635() {
		checkIsSubtype("any|(X<any|X>)","X<X|[int]>");
	}
	@Test public void test_3636() {
		checkIsSubtype("any|(X<any|X>)","[X<[X]>]|X<[X]>");
	}
	@Test public void test_3637() {
		checkIsSubtype("any|(X<any|X>)","X<[X]>|Y<[Y]>");
	}
	@Test public void test_3638() {
		checkIsSubtype("any|(X<any|X>)","X<[X]>|[X<[X]>]");
	}
	@Test public void test_3639() {
		checkIsSubtype("any|(X<any|X>)","X<X|[Y<[Y]>]>");
	}
	@Test public void test_3640() {
		checkIsSubtype("any|(X<any|X>)","X<X|[[X]]>");
	}
	@Test public void test_3641() {
		checkIsSubtype("any|(X<any|X>)","X<[X]>|(Y<X<[X]>|Y>)");
	}
	@Test public void test_3642() {
		checkIsSubtype("any|(X<any|X>)","X<X|[Y<X|Y>]>");
	}
	@Test public void test_3643() {
		checkIsSubtype("any|(X<any|X>)","(X<X|void>)|void");
	}
	@Test public void test_3644() {
		checkIsSubtype("any|(X<any|X>)","X<X|(Y<Y|void>)>");
	}
	@Test public void test_3645() {
		checkIsSubtype("any|(X<any|X>)","(X<X|any>)|any");
	}
	@Test public void test_3646() {
		checkIsSubtype("any|(X<any|X>)","X<X|(Y<Y|any>)>");
	}
	@Test public void test_3647() {
		checkIsSubtype("any|(X<any|X>)","(X<X|null>)|null");
	}
	@Test public void test_3648() {
		checkIsSubtype("any|(X<any|X>)","X<X|(Y<Y|null>)>");
	}
	@Test public void test_3649() {
		checkIsSubtype("any|(X<any|X>)","(X<X|int>)|int");
	}
	@Test public void test_3650() {
		checkIsSubtype("any|(X<any|X>)","X<X|(Y<Y|int>)>");
	}
	@Test public void test_3651() {
		checkIsSubtype("any|(X<any|X>)","(X<X|Y<[Y]>>)|Y<[Y]>");
	}
	@Test public void test_3652() {
		checkIsSubtype("any|(X<any|X>)","X<X|(Y<Y|Z<[Z]>>)>");
	}
	@Test public void test_3653() {
		checkIsSubtype("any|(X<any|X>)","X<X|(Y<Y|[X]>)>");
	}
	@Test public void test_3654() {
		checkIsSubtype("any|(X<any|X>)","X<X|(Y<Y|(Z<X|Z>)>)>");
	}
	@Test public void test_3655() {
		checkNotSubtype("null|void","any");
	}
	@Test public void test_3656() {
		checkIsSubtype("null|void","null");
	}
	@Test public void test_3657() {
		checkNotSubtype("null|void","int");
	}
	@Test public void test_3658() {
		checkNotSubtype("null|void","X<[X]>");
	}
	@Test public void test_3659() {
		checkNotSubtype("null|void","[void]");
	}
	@Test public void test_3660() {
		checkNotSubtype("null|void","[any]");
	}
	@Test public void test_3661() {
		checkNotSubtype("null|void","[null]");
	}
	@Test public void test_3662() {
		checkNotSubtype("null|void","[int]");
	}
	@Test public void test_3663() {
		checkNotSubtype("null|void","[X<[X]>]");
	}
	@Test public void test_3664() {
		checkIsSubtype("null|void","X<X|void>");
	}
	@Test public void test_3665() {
		checkNotSubtype("null|void","X<X|any>");
	}
	@Test public void test_3666() {
		checkIsSubtype("null|void","X<X|null>");
	}
	@Test public void test_3667() {
		checkNotSubtype("null|void","X<X|int>");
	}
	@Test public void test_3668() {
		checkNotSubtype("null|void","X<X|Y<[Y]>>");
	}
	@Test public void test_3669() {
		checkNotSubtype("null|void","[[void]]");
	}
	@Test public void test_3670() {
		checkNotSubtype("null|void","[[any]]");
	}
	@Test public void test_3671() {
		checkNotSubtype("null|void","[[null]]");
	}
	@Test public void test_3672() {
		checkNotSubtype("null|void","[[int]]");
	}
	@Test public void test_3673() {
		checkNotSubtype("null|void","[[X<[X]>]]");
	}
	@Test public void test_3674() {
		checkNotSubtype("null|void","X<[[[X]]]>");
	}
	@Test public void test_3675() {
		checkNotSubtype("null|void","X<[[Y<X|Y>]]>");
	}
	@Test public void test_3676() {
		checkNotSubtype("null|void","[X<X|void>]");
	}
	@Test public void test_3677() {
		checkNotSubtype("null|void","[X<X|any>]");
	}
	@Test public void test_3678() {
		checkNotSubtype("null|void","[X<X|null>]");
	}
	@Test public void test_3679() {
		checkNotSubtype("null|void","[X<X|int>]");
	}
	@Test public void test_3680() {
		checkNotSubtype("null|void","[X<X|Y<[Y]>>]");
	}
	@Test public void test_3681() {
		checkNotSubtype("null|void","X<[Y<Y|[X]>]>");
	}
	@Test public void test_3682() {
		checkNotSubtype("null|void","X<[Y<Y|(Z<X|Z>)>]>");
	}
	@Test public void test_3683() {
		checkIsSubtype("null|void","void|void");
	}
	@Test public void test_3684() {
		checkNotSubtype("null|void","void|any");
	}
	@Test public void test_3685() {
		checkIsSubtype("null|void","void|null");
	}
	@Test public void test_3686() {
		checkNotSubtype("null|void","void|int");
	}
	@Test public void test_3687() {
		checkNotSubtype("null|void","void|X<[X]>");
	}
	@Test public void test_3688() {
		checkNotSubtype("null|void","void|[void]");
	}
	@Test public void test_3689() {
		checkIsSubtype("null|void","void|(X<void|X>)");
	}
	@Test public void test_3690() {
		checkNotSubtype("null|void","any|void");
	}
	@Test public void test_3691() {
		checkNotSubtype("null|void","any|any");
	}
	@Test public void test_3692() {
		checkNotSubtype("null|void","any|null");
	}
	@Test public void test_3693() {
		checkNotSubtype("null|void","any|int");
	}
	@Test public void test_3694() {
		checkNotSubtype("null|void","any|X<[X]>");
	}
	@Test public void test_3695() {
		checkNotSubtype("null|void","any|[any]");
	}
	@Test public void test_3696() {
		checkNotSubtype("null|void","any|(X<any|X>)");
	}
	@Test public void test_3697() {
		checkIsSubtype("null|void","null|void");
	}
	@Test public void test_3698() {
		checkNotSubtype("null|void","null|any");
	}
	@Test public void test_3699() {
		checkIsSubtype("null|void","null|null");
	}
	@Test public void test_3700() {
		checkNotSubtype("null|void","null|int");
	}
	@Test public void test_3701() {
		checkNotSubtype("null|void","null|X<[X]>");
	}
	@Test public void test_3702() {
		checkNotSubtype("null|void","null|[null]");
	}
	@Test public void test_3703() {
		checkIsSubtype("null|void","null|(X<null|X>)");
	}
	@Test public void test_3704() {
		checkNotSubtype("null|void","int|void");
	}
	@Test public void test_3705() {
		checkNotSubtype("null|void","int|any");
	}
	@Test public void test_3706() {
		checkNotSubtype("null|void","int|null");
	}
	@Test public void test_3707() {
		checkNotSubtype("null|void","int|int");
	}
	@Test public void test_3708() {
		checkNotSubtype("null|void","int|X<[X]>");
	}
	@Test public void test_3709() {
		checkNotSubtype("null|void","int|[int]");
	}
	@Test public void test_3710() {
		checkNotSubtype("null|void","int|(X<int|X>)");
	}
	@Test public void test_3711() {
		checkNotSubtype("null|void","[void]|void");
	}
	@Test public void test_3712() {
		checkNotSubtype("null|void","X<[X]>|void");
	}
	@Test public void test_3713() {
		checkNotSubtype("null|void","X<X|[void]>");
	}
	@Test public void test_3714() {
		checkNotSubtype("null|void","[any]|any");
	}
	@Test public void test_3715() {
		checkNotSubtype("null|void","X<[X]>|any");
	}
	@Test public void test_3716() {
		checkNotSubtype("null|void","X<X|[any]>");
	}
	@Test public void test_3717() {
		checkNotSubtype("null|void","[null]|null");
	}
	@Test public void test_3718() {
		checkNotSubtype("null|void","X<[X]>|null");
	}
	@Test public void test_3719() {
		checkNotSubtype("null|void","X<X|[null]>");
	}
	@Test public void test_3720() {
		checkNotSubtype("null|void","[int]|int");
	}
	@Test public void test_3721() {
		checkNotSubtype("null|void","X<[X]>|int");
	}
	@Test public void test_3722() {
		checkNotSubtype("null|void","X<X|[int]>");
	}
	@Test public void test_3723() {
		checkNotSubtype("null|void","[X<[X]>]|X<[X]>");
	}
	@Test public void test_3724() {
		checkNotSubtype("null|void","X<[X]>|Y<[Y]>");
	}
	@Test public void test_3725() {
		checkNotSubtype("null|void","X<[X]>|[X<[X]>]");
	}
	@Test public void test_3726() {
		checkNotSubtype("null|void","X<X|[Y<[Y]>]>");
	}
	@Test public void test_3727() {
		checkNotSubtype("null|void","X<X|[[X]]>");
	}
	@Test public void test_3728() {
		checkNotSubtype("null|void","X<[X]>|(Y<X<[X]>|Y>)");
	}
	@Test public void test_3729() {
		checkNotSubtype("null|void","X<X|[Y<X|Y>]>");
	}
	@Test public void test_3730() {
		checkIsSubtype("null|void","(X<X|void>)|void");
	}
	@Test public void test_3731() {
		checkIsSubtype("null|void","X<X|(Y<Y|void>)>");
	}
	@Test public void test_3732() {
		checkNotSubtype("null|void","(X<X|any>)|any");
	}
	@Test public void test_3733() {
		checkNotSubtype("null|void","X<X|(Y<Y|any>)>");
	}
	@Test public void test_3734() {
		checkIsSubtype("null|void","(X<X|null>)|null");
	}
	@Test public void test_3735() {
		checkIsSubtype("null|void","X<X|(Y<Y|null>)>");
	}
	@Test public void test_3736() {
		checkNotSubtype("null|void","(X<X|int>)|int");
	}
	@Test public void test_3737() {
		checkNotSubtype("null|void","X<X|(Y<Y|int>)>");
	}
	@Test public void test_3738() {
		checkNotSubtype("null|void","(X<X|Y<[Y]>>)|Y<[Y]>");
	}
	@Test public void test_3739() {
		checkNotSubtype("null|void","X<X|(Y<Y|Z<[Z]>>)>");
	}
	@Test public void test_3740() {
		checkNotSubtype("null|void","X<X|(Y<Y|[X]>)>");
	}
	@Test public void test_3741() {
		checkIsSubtype("null|void","X<X|(Y<Y|(Z<X|Z>)>)>");
	}
	@Test public void test_3742() {
		checkIsSubtype("null|any","any");
	}
	@Test public void test_3743() {
		checkIsSubtype("null|any","null");
	}
	@Test public void test_3744() {
		checkIsSubtype("null|any","int");
	}
	@Test public void test_3745() {
		checkIsSubtype("null|any","X<[X]>");
	}
	@Test public void test_3746() {
		checkIsSubtype("null|any","[void]");
	}
	@Test public void test_3747() {
		checkIsSubtype("null|any","[any]");
	}
	@Test public void test_3748() {
		checkIsSubtype("null|any","[null]");
	}
	@Test public void test_3749() {
		checkIsSubtype("null|any","[int]");
	}
	@Test public void test_3750() {
		checkIsSubtype("null|any","[X<[X]>]");
	}
	@Test public void test_3751() {
		checkIsSubtype("null|any","X<X|void>");
	}
	@Test public void test_3752() {
		checkIsSubtype("null|any","X<X|any>");
	}
	@Test public void test_3753() {
		checkIsSubtype("null|any","X<X|null>");
	}
	@Test public void test_3754() {
		checkIsSubtype("null|any","X<X|int>");
	}
	@Test public void test_3755() {
		checkIsSubtype("null|any","X<X|Y<[Y]>>");
	}
	@Test public void test_3756() {
		checkIsSubtype("null|any","[[void]]");
	}
	@Test public void test_3757() {
		checkIsSubtype("null|any","[[any]]");
	}
	@Test public void test_3758() {
		checkIsSubtype("null|any","[[null]]");
	}
	@Test public void test_3759() {
		checkIsSubtype("null|any","[[int]]");
	}
	@Test public void test_3760() {
		checkIsSubtype("null|any","[[X<[X]>]]");
	}
	@Test public void test_3761() {
		checkIsSubtype("null|any","X<[[[X]]]>");
	}
	@Test public void test_3762() {
		checkIsSubtype("null|any","X<[[Y<X|Y>]]>");
	}
	@Test public void test_3763() {
		checkIsSubtype("null|any","[X<X|void>]");
	}
	@Test public void test_3764() {
		checkIsSubtype("null|any","[X<X|any>]");
	}
	@Test public void test_3765() {
		checkIsSubtype("null|any","[X<X|null>]");
	}
	@Test public void test_3766() {
		checkIsSubtype("null|any","[X<X|int>]");
	}
	@Test public void test_3767() {
		checkIsSubtype("null|any","[X<X|Y<[Y]>>]");
	}
	@Test public void test_3768() {
		checkIsSubtype("null|any","X<[Y<Y|[X]>]>");
	}
	@Test public void test_3769() {
		checkIsSubtype("null|any","X<[Y<Y|(Z<X|Z>)>]>");
	}
	@Test public void test_3770() {
		checkIsSubtype("null|any","void|void");
	}
	@Test public void test_3771() {
		checkIsSubtype("null|any","void|any");
	}
	@Test public void test_3772() {
		checkIsSubtype("null|any","void|null");
	}
	@Test public void test_3773() {
		checkIsSubtype("null|any","void|int");
	}
	@Test public void test_3774() {
		checkIsSubtype("null|any","void|X<[X]>");
	}
	@Test public void test_3775() {
		checkIsSubtype("null|any","void|[void]");
	}
	@Test public void test_3776() {
		checkIsSubtype("null|any","void|(X<void|X>)");
	}
	@Test public void test_3777() {
		checkIsSubtype("null|any","any|void");
	}
	@Test public void test_3778() {
		checkIsSubtype("null|any","any|any");
	}
	@Test public void test_3779() {
		checkIsSubtype("null|any","any|null");
	}
	@Test public void test_3780() {
		checkIsSubtype("null|any","any|int");
	}
	@Test public void test_3781() {
		checkIsSubtype("null|any","any|X<[X]>");
	}
	@Test public void test_3782() {
		checkIsSubtype("null|any","any|[any]");
	}
	@Test public void test_3783() {
		checkIsSubtype("null|any","any|(X<any|X>)");
	}
	@Test public void test_3784() {
		checkIsSubtype("null|any","null|void");
	}
	@Test public void test_3785() {
		checkIsSubtype("null|any","null|any");
	}
	@Test public void test_3786() {
		checkIsSubtype("null|any","null|null");
	}
	@Test public void test_3787() {
		checkIsSubtype("null|any","null|int");
	}
	@Test public void test_3788() {
		checkIsSubtype("null|any","null|X<[X]>");
	}
	@Test public void test_3789() {
		checkIsSubtype("null|any","null|[null]");
	}
	@Test public void test_3790() {
		checkIsSubtype("null|any","null|(X<null|X>)");
	}
	@Test public void test_3791() {
		checkIsSubtype("null|any","int|void");
	}
	@Test public void test_3792() {
		checkIsSubtype("null|any","int|any");
	}
	@Test public void test_3793() {
		checkIsSubtype("null|any","int|null");
	}
	@Test public void test_3794() {
		checkIsSubtype("null|any","int|int");
	}
	@Test public void test_3795() {
		checkIsSubtype("null|any","int|X<[X]>");
	}
	@Test public void test_3796() {
		checkIsSubtype("null|any","int|[int]");
	}
	@Test public void test_3797() {
		checkIsSubtype("null|any","int|(X<int|X>)");
	}
	@Test public void test_3798() {
		checkIsSubtype("null|any","[void]|void");
	}
	@Test public void test_3799() {
		checkIsSubtype("null|any","X<[X]>|void");
	}
	@Test public void test_3800() {
		checkIsSubtype("null|any","X<X|[void]>");
	}
	@Test public void test_3801() {
		checkIsSubtype("null|any","[any]|any");
	}
	@Test public void test_3802() {
		checkIsSubtype("null|any","X<[X]>|any");
	}
	@Test public void test_3803() {
		checkIsSubtype("null|any","X<X|[any]>");
	}
	@Test public void test_3804() {
		checkIsSubtype("null|any","[null]|null");
	}
	@Test public void test_3805() {
		checkIsSubtype("null|any","X<[X]>|null");
	}
	@Test public void test_3806() {
		checkIsSubtype("null|any","X<X|[null]>");
	}
	@Test public void test_3807() {
		checkIsSubtype("null|any","[int]|int");
	}
	@Test public void test_3808() {
		checkIsSubtype("null|any","X<[X]>|int");
	}
	@Test public void test_3809() {
		checkIsSubtype("null|any","X<X|[int]>");
	}
	@Test public void test_3810() {
		checkIsSubtype("null|any","[X<[X]>]|X<[X]>");
	}
	@Test public void test_3811() {
		checkIsSubtype("null|any","X<[X]>|Y<[Y]>");
	}
	@Test public void test_3812() {
		checkIsSubtype("null|any","X<[X]>|[X<[X]>]");
	}
	@Test public void test_3813() {
		checkIsSubtype("null|any","X<X|[Y<[Y]>]>");
	}
	@Test public void test_3814() {
		checkIsSubtype("null|any","X<X|[[X]]>");
	}
	@Test public void test_3815() {
		checkIsSubtype("null|any","X<[X]>|(Y<X<[X]>|Y>)");
	}
	@Test public void test_3816() {
		checkIsSubtype("null|any","X<X|[Y<X|Y>]>");
	}
	@Test public void test_3817() {
		checkIsSubtype("null|any","(X<X|void>)|void");
	}
	@Test public void test_3818() {
		checkIsSubtype("null|any","X<X|(Y<Y|void>)>");
	}
	@Test public void test_3819() {
		checkIsSubtype("null|any","(X<X|any>)|any");
	}
	@Test public void test_3820() {
		checkIsSubtype("null|any","X<X|(Y<Y|any>)>");
	}
	@Test public void test_3821() {
		checkIsSubtype("null|any","(X<X|null>)|null");
	}
	@Test public void test_3822() {
		checkIsSubtype("null|any","X<X|(Y<Y|null>)>");
	}
	@Test public void test_3823() {
		checkIsSubtype("null|any","(X<X|int>)|int");
	}
	@Test public void test_3824() {
		checkIsSubtype("null|any","X<X|(Y<Y|int>)>");
	}
	@Test public void test_3825() {
		checkIsSubtype("null|any","(X<X|Y<[Y]>>)|Y<[Y]>");
	}
	@Test public void test_3826() {
		checkIsSubtype("null|any","X<X|(Y<Y|Z<[Z]>>)>");
	}
	@Test public void test_3827() {
		checkIsSubtype("null|any","X<X|(Y<Y|[X]>)>");
	}
	@Test public void test_3828() {
		checkIsSubtype("null|any","X<X|(Y<Y|(Z<X|Z>)>)>");
	}
	@Test public void test_3829() {
		checkNotSubtype("null|null","any");
	}
	@Test public void test_3830() {
		checkIsSubtype("null|null","null");
	}
	@Test public void test_3831() {
		checkNotSubtype("null|null","int");
	}
	@Test public void test_3832() {
		checkNotSubtype("null|null","X<[X]>");
	}
	@Test public void test_3833() {
		checkNotSubtype("null|null","[void]");
	}
	@Test public void test_3834() {
		checkNotSubtype("null|null","[any]");
	}
	@Test public void test_3835() {
		checkNotSubtype("null|null","[null]");
	}
	@Test public void test_3836() {
		checkNotSubtype("null|null","[int]");
	}
	@Test public void test_3837() {
		checkNotSubtype("null|null","[X<[X]>]");
	}
	@Test public void test_3838() {
		checkIsSubtype("null|null","X<X|void>");
	}
	@Test public void test_3839() {
		checkNotSubtype("null|null","X<X|any>");
	}
	@Test public void test_3840() {
		checkIsSubtype("null|null","X<X|null>");
	}
	@Test public void test_3841() {
		checkNotSubtype("null|null","X<X|int>");
	}
	@Test public void test_3842() {
		checkNotSubtype("null|null","X<X|Y<[Y]>>");
	}
	@Test public void test_3843() {
		checkNotSubtype("null|null","[[void]]");
	}
	@Test public void test_3844() {
		checkNotSubtype("null|null","[[any]]");
	}
	@Test public void test_3845() {
		checkNotSubtype("null|null","[[null]]");
	}
	@Test public void test_3846() {
		checkNotSubtype("null|null","[[int]]");
	}
	@Test public void test_3847() {
		checkNotSubtype("null|null","[[X<[X]>]]");
	}
	@Test public void test_3848() {
		checkNotSubtype("null|null","X<[[[X]]]>");
	}
	@Test public void test_3849() {
		checkNotSubtype("null|null","X<[[Y<X|Y>]]>");
	}
	@Test public void test_3850() {
		checkNotSubtype("null|null","[X<X|void>]");
	}
	@Test public void test_3851() {
		checkNotSubtype("null|null","[X<X|any>]");
	}
	@Test public void test_3852() {
		checkNotSubtype("null|null","[X<X|null>]");
	}
	@Test public void test_3853() {
		checkNotSubtype("null|null","[X<X|int>]");
	}
	@Test public void test_3854() {
		checkNotSubtype("null|null","[X<X|Y<[Y]>>]");
	}
	@Test public void test_3855() {
		checkNotSubtype("null|null","X<[Y<Y|[X]>]>");
	}
	@Test public void test_3856() {
		checkNotSubtype("null|null","X<[Y<Y|(Z<X|Z>)>]>");
	}
	@Test public void test_3857() {
		checkIsSubtype("null|null","void|void");
	}
	@Test public void test_3858() {
		checkNotSubtype("null|null","void|any");
	}
	@Test public void test_3859() {
		checkIsSubtype("null|null","void|null");
	}
	@Test public void test_3860() {
		checkNotSubtype("null|null","void|int");
	}
	@Test public void test_3861() {
		checkNotSubtype("null|null","void|X<[X]>");
	}
	@Test public void test_3862() {
		checkNotSubtype("null|null","void|[void]");
	}
	@Test public void test_3863() {
		checkIsSubtype("null|null","void|(X<void|X>)");
	}
	@Test public void test_3864() {
		checkNotSubtype("null|null","any|void");
	}
	@Test public void test_3865() {
		checkNotSubtype("null|null","any|any");
	}
	@Test public void test_3866() {
		checkNotSubtype("null|null","any|null");
	}
	@Test public void test_3867() {
		checkNotSubtype("null|null","any|int");
	}
	@Test public void test_3868() {
		checkNotSubtype("null|null","any|X<[X]>");
	}
	@Test public void test_3869() {
		checkNotSubtype("null|null","any|[any]");
	}
	@Test public void test_3870() {
		checkNotSubtype("null|null","any|(X<any|X>)");
	}
	@Test public void test_3871() {
		checkIsSubtype("null|null","null|void");
	}
	@Test public void test_3872() {
		checkNotSubtype("null|null","null|any");
	}
	@Test public void test_3873() {
		checkIsSubtype("null|null","null|null");
	}
	@Test public void test_3874() {
		checkNotSubtype("null|null","null|int");
	}
	@Test public void test_3875() {
		checkNotSubtype("null|null","null|X<[X]>");
	}
	@Test public void test_3876() {
		checkNotSubtype("null|null","null|[null]");
	}
	@Test public void test_3877() {
		checkIsSubtype("null|null","null|(X<null|X>)");
	}
	@Test public void test_3878() {
		checkNotSubtype("null|null","int|void");
	}
	@Test public void test_3879() {
		checkNotSubtype("null|null","int|any");
	}
	@Test public void test_3880() {
		checkNotSubtype("null|null","int|null");
	}
	@Test public void test_3881() {
		checkNotSubtype("null|null","int|int");
	}
	@Test public void test_3882() {
		checkNotSubtype("null|null","int|X<[X]>");
	}
	@Test public void test_3883() {
		checkNotSubtype("null|null","int|[int]");
	}
	@Test public void test_3884() {
		checkNotSubtype("null|null","int|(X<int|X>)");
	}
	@Test public void test_3885() {
		checkNotSubtype("null|null","[void]|void");
	}
	@Test public void test_3886() {
		checkNotSubtype("null|null","X<[X]>|void");
	}
	@Test public void test_3887() {
		checkNotSubtype("null|null","X<X|[void]>");
	}
	@Test public void test_3888() {
		checkNotSubtype("null|null","[any]|any");
	}
	@Test public void test_3889() {
		checkNotSubtype("null|null","X<[X]>|any");
	}
	@Test public void test_3890() {
		checkNotSubtype("null|null","X<X|[any]>");
	}
	@Test public void test_3891() {
		checkNotSubtype("null|null","[null]|null");
	}
	@Test public void test_3892() {
		checkNotSubtype("null|null","X<[X]>|null");
	}
	@Test public void test_3893() {
		checkNotSubtype("null|null","X<X|[null]>");
	}
	@Test public void test_3894() {
		checkNotSubtype("null|null","[int]|int");
	}
	@Test public void test_3895() {
		checkNotSubtype("null|null","X<[X]>|int");
	}
	@Test public void test_3896() {
		checkNotSubtype("null|null","X<X|[int]>");
	}
	@Test public void test_3897() {
		checkNotSubtype("null|null","[X<[X]>]|X<[X]>");
	}
	@Test public void test_3898() {
		checkNotSubtype("null|null","X<[X]>|Y<[Y]>");
	}
	@Test public void test_3899() {
		checkNotSubtype("null|null","X<[X]>|[X<[X]>]");
	}
	@Test public void test_3900() {
		checkNotSubtype("null|null","X<X|[Y<[Y]>]>");
	}
	@Test public void test_3901() {
		checkNotSubtype("null|null","X<X|[[X]]>");
	}
	@Test public void test_3902() {
		checkNotSubtype("null|null","X<[X]>|(Y<X<[X]>|Y>)");
	}
	@Test public void test_3903() {
		checkNotSubtype("null|null","X<X|[Y<X|Y>]>");
	}
	@Test public void test_3904() {
		checkIsSubtype("null|null","(X<X|void>)|void");
	}
	@Test public void test_3905() {
		checkIsSubtype("null|null","X<X|(Y<Y|void>)>");
	}
	@Test public void test_3906() {
		checkNotSubtype("null|null","(X<X|any>)|any");
	}
	@Test public void test_3907() {
		checkNotSubtype("null|null","X<X|(Y<Y|any>)>");
	}
	@Test public void test_3908() {
		checkIsSubtype("null|null","(X<X|null>)|null");
	}
	@Test public void test_3909() {
		checkIsSubtype("null|null","X<X|(Y<Y|null>)>");
	}
	@Test public void test_3910() {
		checkNotSubtype("null|null","(X<X|int>)|int");
	}
	@Test public void test_3911() {
		checkNotSubtype("null|null","X<X|(Y<Y|int>)>");
	}
	@Test public void test_3912() {
		checkNotSubtype("null|null","(X<X|Y<[Y]>>)|Y<[Y]>");
	}
	@Test public void test_3913() {
		checkNotSubtype("null|null","X<X|(Y<Y|Z<[Z]>>)>");
	}
	@Test public void test_3914() {
		checkNotSubtype("null|null","X<X|(Y<Y|[X]>)>");
	}
	@Test public void test_3915() {
		checkIsSubtype("null|null","X<X|(Y<Y|(Z<X|Z>)>)>");
	}
	@Test public void test_3916() {
		checkNotSubtype("null|int","any");
	}
	@Test public void test_3917() {
		checkIsSubtype("null|int","null");
	}
	@Test public void test_3918() {
		checkIsSubtype("null|int","int");
	}
	@Test public void test_3919() {
		checkNotSubtype("null|int","X<[X]>");
	}
	@Test public void test_3920() {
		checkNotSubtype("null|int","[void]");
	}
	@Test public void test_3921() {
		checkNotSubtype("null|int","[any]");
	}
	@Test public void test_3922() {
		checkNotSubtype("null|int","[null]");
	}
	@Test public void test_3923() {
		checkNotSubtype("null|int","[int]");
	}
	@Test public void test_3924() {
		checkNotSubtype("null|int","[X<[X]>]");
	}
	@Test public void test_3925() {
		checkIsSubtype("null|int","X<X|void>");
	}
	@Test public void test_3926() {
		checkNotSubtype("null|int","X<X|any>");
	}
	@Test public void test_3927() {
		checkIsSubtype("null|int","X<X|null>");
	}
	@Test public void test_3928() {
		checkIsSubtype("null|int","X<X|int>");
	}
	@Test public void test_3929() {
		checkNotSubtype("null|int","X<X|Y<[Y]>>");
	}
	@Test public void test_3930() {
		checkNotSubtype("null|int","[[void]]");
	}
	@Test public void test_3931() {
		checkNotSubtype("null|int","[[any]]");
	}
	@Test public void test_3932() {
		checkNotSubtype("null|int","[[null]]");
	}
	@Test public void test_3933() {
		checkNotSubtype("null|int","[[int]]");
	}
	@Test public void test_3934() {
		checkNotSubtype("null|int","[[X<[X]>]]");
	}
	@Test public void test_3935() {
		checkNotSubtype("null|int","X<[[[X]]]>");
	}
	@Test public void test_3936() {
		checkNotSubtype("null|int","X<[[Y<X|Y>]]>");
	}
	@Test public void test_3937() {
		checkNotSubtype("null|int","[X<X|void>]");
	}
	@Test public void test_3938() {
		checkNotSubtype("null|int","[X<X|any>]");
	}
	@Test public void test_3939() {
		checkNotSubtype("null|int","[X<X|null>]");
	}
	@Test public void test_3940() {
		checkNotSubtype("null|int","[X<X|int>]");
	}
	@Test public void test_3941() {
		checkNotSubtype("null|int","[X<X|Y<[Y]>>]");
	}
	@Test public void test_3942() {
		checkNotSubtype("null|int","X<[Y<Y|[X]>]>");
	}
	@Test public void test_3943() {
		checkNotSubtype("null|int","X<[Y<Y|(Z<X|Z>)>]>");
	}
	@Test public void test_3944() {
		checkIsSubtype("null|int","void|void");
	}
	@Test public void test_3945() {
		checkNotSubtype("null|int","void|any");
	}
	@Test public void test_3946() {
		checkIsSubtype("null|int","void|null");
	}
	@Test public void test_3947() {
		checkIsSubtype("null|int","void|int");
	}
	@Test public void test_3948() {
		checkNotSubtype("null|int","void|X<[X]>");
	}
	@Test public void test_3949() {
		checkNotSubtype("null|int","void|[void]");
	}
	@Test public void test_3950() {
		checkIsSubtype("null|int","void|(X<void|X>)");
	}
	@Test public void test_3951() {
		checkNotSubtype("null|int","any|void");
	}
	@Test public void test_3952() {
		checkNotSubtype("null|int","any|any");
	}
	@Test public void test_3953() {
		checkNotSubtype("null|int","any|null");
	}
	@Test public void test_3954() {
		checkNotSubtype("null|int","any|int");
	}
	@Test public void test_3955() {
		checkNotSubtype("null|int","any|X<[X]>");
	}
	@Test public void test_3956() {
		checkNotSubtype("null|int","any|[any]");
	}
	@Test public void test_3957() {
		checkNotSubtype("null|int","any|(X<any|X>)");
	}
	@Test public void test_3958() {
		checkIsSubtype("null|int","null|void");
	}
	@Test public void test_3959() {
		checkNotSubtype("null|int","null|any");
	}
	@Test public void test_3960() {
		checkIsSubtype("null|int","null|null");
	}
	@Test public void test_3961() {
		checkIsSubtype("null|int","null|int");
	}
	@Test public void test_3962() {
		checkNotSubtype("null|int","null|X<[X]>");
	}
	@Test public void test_3963() {
		checkNotSubtype("null|int","null|[null]");
	}
	@Test public void test_3964() {
		checkIsSubtype("null|int","null|(X<null|X>)");
	}
	@Test public void test_3965() {
		checkIsSubtype("null|int","int|void");
	}
	@Test public void test_3966() {
		checkNotSubtype("null|int","int|any");
	}
	@Test public void test_3967() {
		checkIsSubtype("null|int","int|null");
	}
	@Test public void test_3968() {
		checkIsSubtype("null|int","int|int");
	}
	@Test public void test_3969() {
		checkNotSubtype("null|int","int|X<[X]>");
	}
	@Test public void test_3970() {
		checkNotSubtype("null|int","int|[int]");
	}
	@Test public void test_3971() {
		checkIsSubtype("null|int","int|(X<int|X>)");
	}
	@Test public void test_3972() {
		checkNotSubtype("null|int","[void]|void");
	}
	@Test public void test_3973() {
		checkNotSubtype("null|int","X<[X]>|void");
	}
	@Test public void test_3974() {
		checkNotSubtype("null|int","X<X|[void]>");
	}
	@Test public void test_3975() {
		checkNotSubtype("null|int","[any]|any");
	}
	@Test public void test_3976() {
		checkNotSubtype("null|int","X<[X]>|any");
	}
	@Test public void test_3977() {
		checkNotSubtype("null|int","X<X|[any]>");
	}
	@Test public void test_3978() {
		checkNotSubtype("null|int","[null]|null");
	}
	@Test public void test_3979() {
		checkNotSubtype("null|int","X<[X]>|null");
	}
	@Test public void test_3980() {
		checkNotSubtype("null|int","X<X|[null]>");
	}
	@Test public void test_3981() {
		checkNotSubtype("null|int","[int]|int");
	}
	@Test public void test_3982() {
		checkNotSubtype("null|int","X<[X]>|int");
	}
	@Test public void test_3983() {
		checkNotSubtype("null|int","X<X|[int]>");
	}
	@Test public void test_3984() {
		checkNotSubtype("null|int","[X<[X]>]|X<[X]>");
	}
	@Test public void test_3985() {
		checkNotSubtype("null|int","X<[X]>|Y<[Y]>");
	}
	@Test public void test_3986() {
		checkNotSubtype("null|int","X<[X]>|[X<[X]>]");
	}
	@Test public void test_3987() {
		checkNotSubtype("null|int","X<X|[Y<[Y]>]>");
	}
	@Test public void test_3988() {
		checkNotSubtype("null|int","X<X|[[X]]>");
	}
	@Test public void test_3989() {
		checkNotSubtype("null|int","X<[X]>|(Y<X<[X]>|Y>)");
	}
	@Test public void test_3990() {
		checkNotSubtype("null|int","X<X|[Y<X|Y>]>");
	}
	@Test public void test_3991() {
		checkIsSubtype("null|int","(X<X|void>)|void");
	}
	@Test public void test_3992() {
		checkIsSubtype("null|int","X<X|(Y<Y|void>)>");
	}
	@Test public void test_3993() {
		checkNotSubtype("null|int","(X<X|any>)|any");
	}
	@Test public void test_3994() {
		checkNotSubtype("null|int","X<X|(Y<Y|any>)>");
	}
	@Test public void test_3995() {
		checkIsSubtype("null|int","(X<X|null>)|null");
	}
	@Test public void test_3996() {
		checkIsSubtype("null|int","X<X|(Y<Y|null>)>");
	}
	@Test public void test_3997() {
		checkIsSubtype("null|int","(X<X|int>)|int");
	}
	@Test public void test_3998() {
		checkIsSubtype("null|int","X<X|(Y<Y|int>)>");
	}
	@Test public void test_3999() {
		checkNotSubtype("null|int","(X<X|Y<[Y]>>)|Y<[Y]>");
	}
	@Test public void test_4000() {
		checkNotSubtype("null|int","X<X|(Y<Y|Z<[Z]>>)>");
	}
	@Test public void test_4001() {
		checkNotSubtype("null|int","X<X|(Y<Y|[X]>)>");
	}
	@Test public void test_4002() {
		checkIsSubtype("null|int","X<X|(Y<Y|(Z<X|Z>)>)>");
	}
	@Test public void test_4003() {
		checkNotSubtype("null|X<[X]>","any");
	}
	@Test public void test_4004() {
		checkIsSubtype("null|X<[X]>","null");
	}
	@Test public void test_4005() {
		checkNotSubtype("null|X<[X]>","int");
	}
	@Test public void test_4006() {
		checkIsSubtype("null|X<[X]>","X<[X]>");
	}
	@Test public void test_4007() {
		checkIsSubtype("null|X<[X]>","[void]");
	}
	@Test public void test_4008() {
		checkNotSubtype("null|X<[X]>","[any]");
	}
	@Test public void test_4009() {
		checkNotSubtype("null|X<[X]>","[null]");
	}
	@Test public void test_4010() {
		checkNotSubtype("null|X<[X]>","[int]");
	}
	@Test public void test_4011() {
		checkIsSubtype("null|X<[X]>","[X<[X]>]");
	}
	@Test public void test_4012() {
		checkIsSubtype("null|X<[X]>","X<X|void>");
	}
	@Test public void test_4013() {
		checkNotSubtype("null|X<[X]>","X<X|any>");
	}
	@Test public void test_4014() {
		checkIsSubtype("null|X<[X]>","X<X|null>");
	}
	@Test public void test_4015() {
		checkNotSubtype("null|X<[X]>","X<X|int>");
	}
	@Test public void test_4016() {
		checkIsSubtype("null|X<[X]>","X<X|Y<[Y]>>");
	}
	@Test public void test_4017() {
		checkIsSubtype("null|X<[X]>","[[void]]");
	}
	@Test public void test_4018() {
		checkNotSubtype("null|X<[X]>","[[any]]");
	}
	@Test public void test_4019() {
		checkNotSubtype("null|X<[X]>","[[null]]");
	}
	@Test public void test_4020() {
		checkNotSubtype("null|X<[X]>","[[int]]");
	}
	@Test public void test_4021() {
		checkIsSubtype("null|X<[X]>","[[X<[X]>]]");
	}
	@Test public void test_4022() {
		checkIsSubtype("null|X<[X]>","X<[[[X]]]>");
	}
	@Test public void test_4023() {
		checkIsSubtype("null|X<[X]>","X<[[Y<X|Y>]]>");
	}
	@Test public void test_4024() {
		checkIsSubtype("null|X<[X]>","[X<X|void>]");
	}
	@Test public void test_4025() {
		checkNotSubtype("null|X<[X]>","[X<X|any>]");
	}
	@Test public void test_4026() {
		checkNotSubtype("null|X<[X]>","[X<X|null>]");
	}
	@Test public void test_4027() {
		checkNotSubtype("null|X<[X]>","[X<X|int>]");
	}
	@Test public void test_4028() {
		checkIsSubtype("null|X<[X]>","[X<X|Y<[Y]>>]");
	}
	@Test public void test_4029() {
		checkIsSubtype("null|X<[X]>","X<[Y<Y|[X]>]>");
	}
	@Test public void test_4030() {
		checkIsSubtype("null|X<[X]>","X<[Y<Y|(Z<X|Z>)>]>");
	}
	@Test public void test_4031() {
		checkIsSubtype("null|X<[X]>","void|void");
	}
	@Test public void test_4032() {
		checkNotSubtype("null|X<[X]>","void|any");
	}
	@Test public void test_4033() {
		checkIsSubtype("null|X<[X]>","void|null");
	}
	@Test public void test_4034() {
		checkNotSubtype("null|X<[X]>","void|int");
	}
	@Test public void test_4035() {
		checkIsSubtype("null|X<[X]>","void|X<[X]>");
	}
	@Test public void test_4036() {
		checkIsSubtype("null|X<[X]>","void|[void]");
	}
	@Test public void test_4037() {
		checkIsSubtype("null|X<[X]>","void|(X<void|X>)");
	}
	@Test public void test_4038() {
		checkNotSubtype("null|X<[X]>","any|void");
	}
	@Test public void test_4039() {
		checkNotSubtype("null|X<[X]>","any|any");
	}
	@Test public void test_4040() {
		checkNotSubtype("null|X<[X]>","any|null");
	}
	@Test public void test_4041() {
		checkNotSubtype("null|X<[X]>","any|int");
	}
	@Test public void test_4042() {
		checkNotSubtype("null|X<[X]>","any|X<[X]>");
	}
	@Test public void test_4043() {
		checkNotSubtype("null|X<[X]>","any|[any]");
	}
	@Test public void test_4044() {
		checkNotSubtype("null|X<[X]>","any|(X<any|X>)");
	}
	@Test public void test_4045() {
		checkIsSubtype("null|X<[X]>","null|void");
	}
	@Test public void test_4046() {
		checkNotSubtype("null|X<[X]>","null|any");
	}
	@Test public void test_4047() {
		checkIsSubtype("null|X<[X]>","null|null");
	}
	@Test public void test_4048() {
		checkNotSubtype("null|X<[X]>","null|int");
	}
	@Test public void test_4049() {
		checkIsSubtype("null|X<[X]>","null|X<[X]>");
	}
	@Test public void test_4050() {
		checkNotSubtype("null|X<[X]>","null|[null]");
	}
	@Test public void test_4051() {
		checkIsSubtype("null|X<[X]>","null|(X<null|X>)");
	}
	@Test public void test_4052() {
		checkNotSubtype("null|X<[X]>","int|void");
	}
	@Test public void test_4053() {
		checkNotSubtype("null|X<[X]>","int|any");
	}
	@Test public void test_4054() {
		checkNotSubtype("null|X<[X]>","int|null");
	}
	@Test public void test_4055() {
		checkNotSubtype("null|X<[X]>","int|int");
	}
	@Test public void test_4056() {
		checkNotSubtype("null|X<[X]>","int|X<[X]>");
	}
	@Test public void test_4057() {
		checkNotSubtype("null|X<[X]>","int|[int]");
	}
	@Test public void test_4058() {
		checkNotSubtype("null|X<[X]>","int|(X<int|X>)");
	}
	@Test public void test_4059() {
		checkIsSubtype("null|X<[X]>","[void]|void");
	}
	@Test public void test_4060() {
		checkIsSubtype("null|X<[X]>","X<[X]>|void");
	}
	@Test public void test_4061() {
		checkIsSubtype("null|X<[X]>","X<X|[void]>");
	}
	@Test public void test_4062() {
		checkNotSubtype("null|X<[X]>","[any]|any");
	}
	@Test public void test_4063() {
		checkNotSubtype("null|X<[X]>","X<[X]>|any");
	}
	@Test public void test_4064() {
		checkNotSubtype("null|X<[X]>","X<X|[any]>");
	}
	@Test public void test_4065() {
		checkNotSubtype("null|X<[X]>","[null]|null");
	}
	@Test public void test_4066() {
		checkIsSubtype("null|X<[X]>","X<[X]>|null");
	}
	@Test public void test_4067() {
		checkNotSubtype("null|X<[X]>","X<X|[null]>");
	}
	@Test public void test_4068() {
		checkNotSubtype("null|X<[X]>","[int]|int");
	}
	@Test public void test_4069() {
		checkNotSubtype("null|X<[X]>","X<[X]>|int");
	}
	@Test public void test_4070() {
		checkNotSubtype("null|X<[X]>","X<X|[int]>");
	}
	@Test public void test_4071() {
		checkIsSubtype("null|X<[X]>","[X<[X]>]|X<[X]>");
	}
	@Test public void test_4072() {
		checkIsSubtype("null|X<[X]>","X<[X]>|Y<[Y]>");
	}
	@Test public void test_4073() {
		checkIsSubtype("null|X<[X]>","X<[X]>|[X<[X]>]");
	}
	@Test public void test_4074() {
		checkIsSubtype("null|X<[X]>","X<X|[Y<[Y]>]>");
	}
	@Test public void test_4075() {
		checkIsSubtype("null|X<[X]>","X<X|[[X]]>");
	}
	@Test public void test_4076() {
		checkIsSubtype("null|X<[X]>","X<[X]>|(Y<X<[X]>|Y>)");
	}
	@Test public void test_4077() {
		checkIsSubtype("null|X<[X]>","X<X|[Y<X|Y>]>");
	}
	@Test public void test_4078() {
		checkIsSubtype("null|X<[X]>","(X<X|void>)|void");
	}
	@Test public void test_4079() {
		checkIsSubtype("null|X<[X]>","X<X|(Y<Y|void>)>");
	}
	@Test public void test_4080() {
		checkNotSubtype("null|X<[X]>","(X<X|any>)|any");
	}
	@Test public void test_4081() {
		checkNotSubtype("null|X<[X]>","X<X|(Y<Y|any>)>");
	}
	@Test public void test_4082() {
		checkIsSubtype("null|X<[X]>","(X<X|null>)|null");
	}
	@Test public void test_4083() {
		checkIsSubtype("null|X<[X]>","X<X|(Y<Y|null>)>");
	}
	@Test public void test_4084() {
		checkNotSubtype("null|X<[X]>","(X<X|int>)|int");
	}
	@Test public void test_4085() {
		checkNotSubtype("null|X<[X]>","X<X|(Y<Y|int>)>");
	}
	@Test public void test_4086() {
		checkIsSubtype("null|X<[X]>","(X<X|Y<[Y]>>)|Y<[Y]>");
	}
	@Test public void test_4087() {
		checkIsSubtype("null|X<[X]>","X<X|(Y<Y|Z<[Z]>>)>");
	}
	@Test public void test_4088() {
		checkIsSubtype("null|X<[X]>","X<X|(Y<Y|[X]>)>");
	}
	@Test public void test_4089() {
		checkIsSubtype("null|X<[X]>","X<X|(Y<Y|(Z<X|Z>)>)>");
	}
	@Test public void test_4090() {
		checkNotSubtype("null|[null]","any");
	}
	@Test public void test_4091() {
		checkIsSubtype("null|[null]","null");
	}
	@Test public void test_4092() {
		checkNotSubtype("null|[null]","int");
	}
	@Test public void test_4093() {
		checkNotSubtype("null|[null]","X<[X]>");
	}
	@Test public void test_4094() {
		checkIsSubtype("null|[null]","[void]");
	}
	@Test public void test_4095() {
		checkNotSubtype("null|[null]","[any]");
	}
	@Test public void test_4096() {
		checkIsSubtype("null|[null]","[null]");
	}
	@Test public void test_4097() {
		checkNotSubtype("null|[null]","[int]");
	}
	@Test public void test_4098() {
		checkNotSubtype("null|[null]","[X<[X]>]");
	}
	@Test public void test_4099() {
		checkIsSubtype("null|[null]","X<X|void>");
	}
	@Test public void test_4100() {
		checkNotSubtype("null|[null]","X<X|any>");
	}
	@Test public void test_4101() {
		checkIsSubtype("null|[null]","X<X|null>");
	}
	@Test public void test_4102() {
		checkNotSubtype("null|[null]","X<X|int>");
	}
	@Test public void test_4103() {
		checkNotSubtype("null|[null]","X<X|Y<[Y]>>");
	}
	@Test public void test_4104() {
		checkNotSubtype("null|[null]","[[void]]");
	}
	@Test public void test_4105() {
		checkNotSubtype("null|[null]","[[any]]");
	}
	@Test public void test_4106() {
		checkNotSubtype("null|[null]","[[null]]");
	}
	@Test public void test_4107() {
		checkNotSubtype("null|[null]","[[int]]");
	}
	@Test public void test_4108() {
		checkNotSubtype("null|[null]","[[X<[X]>]]");
	}
	@Test public void test_4109() {
		checkNotSubtype("null|[null]","X<[[[X]]]>");
	}
	@Test public void test_4110() {
		checkNotSubtype("null|[null]","X<[[Y<X|Y>]]>");
	}
	@Test public void test_4111() {
		checkIsSubtype("null|[null]","[X<X|void>]");
	}
	@Test public void test_4112() {
		checkNotSubtype("null|[null]","[X<X|any>]");
	}
	@Test public void test_4113() {
		checkIsSubtype("null|[null]","[X<X|null>]");
	}
	@Test public void test_4114() {
		checkNotSubtype("null|[null]","[X<X|int>]");
	}
	@Test public void test_4115() {
		checkNotSubtype("null|[null]","[X<X|Y<[Y]>>]");
	}
	@Test public void test_4116() {
		checkNotSubtype("null|[null]","X<[Y<Y|[X]>]>");
	}
	@Test public void test_4117() {
		checkNotSubtype("null|[null]","X<[Y<Y|(Z<X|Z>)>]>");
	}
	@Test public void test_4118() {
		checkIsSubtype("null|[null]","void|void");
	}
	@Test public void test_4119() {
		checkNotSubtype("null|[null]","void|any");
	}
	@Test public void test_4120() {
		checkIsSubtype("null|[null]","void|null");
	}
	@Test public void test_4121() {
		checkNotSubtype("null|[null]","void|int");
	}
	@Test public void test_4122() {
		checkNotSubtype("null|[null]","void|X<[X]>");
	}
	@Test public void test_4123() {
		checkIsSubtype("null|[null]","void|[void]");
	}
	@Test public void test_4124() {
		checkIsSubtype("null|[null]","void|(X<void|X>)");
	}
	@Test public void test_4125() {
		checkNotSubtype("null|[null]","any|void");
	}
	@Test public void test_4126() {
		checkNotSubtype("null|[null]","any|any");
	}
	@Test public void test_4127() {
		checkNotSubtype("null|[null]","any|null");
	}
	@Test public void test_4128() {
		checkNotSubtype("null|[null]","any|int");
	}
	@Test public void test_4129() {
		checkNotSubtype("null|[null]","any|X<[X]>");
	}
	@Test public void test_4130() {
		checkNotSubtype("null|[null]","any|[any]");
	}
	@Test public void test_4131() {
		checkNotSubtype("null|[null]","any|(X<any|X>)");
	}
	@Test public void test_4132() {
		checkIsSubtype("null|[null]","null|void");
	}
	@Test public void test_4133() {
		checkNotSubtype("null|[null]","null|any");
	}
	@Test public void test_4134() {
		checkIsSubtype("null|[null]","null|null");
	}
	@Test public void test_4135() {
		checkNotSubtype("null|[null]","null|int");
	}
	@Test public void test_4136() {
		checkNotSubtype("null|[null]","null|X<[X]>");
	}
	@Test public void test_4137() {
		checkIsSubtype("null|[null]","null|[null]");
	}
	@Test public void test_4138() {
		checkIsSubtype("null|[null]","null|(X<null|X>)");
	}
	@Test public void test_4139() {
		checkNotSubtype("null|[null]","int|void");
	}
	@Test public void test_4140() {
		checkNotSubtype("null|[null]","int|any");
	}
	@Test public void test_4141() {
		checkNotSubtype("null|[null]","int|null");
	}
	@Test public void test_4142() {
		checkNotSubtype("null|[null]","int|int");
	}
	@Test public void test_4143() {
		checkNotSubtype("null|[null]","int|X<[X]>");
	}
	@Test public void test_4144() {
		checkNotSubtype("null|[null]","int|[int]");
	}
	@Test public void test_4145() {
		checkNotSubtype("null|[null]","int|(X<int|X>)");
	}
	@Test public void test_4146() {
		checkIsSubtype("null|[null]","[void]|void");
	}
	@Test public void test_4147() {
		checkNotSubtype("null|[null]","X<[X]>|void");
	}
	@Test public void test_4148() {
		checkIsSubtype("null|[null]","X<X|[void]>");
	}
	@Test public void test_4149() {
		checkNotSubtype("null|[null]","[any]|any");
	}
	@Test public void test_4150() {
		checkNotSubtype("null|[null]","X<[X]>|any");
	}
	@Test public void test_4151() {
		checkNotSubtype("null|[null]","X<X|[any]>");
	}
	@Test public void test_4152() {
		checkIsSubtype("null|[null]","[null]|null");
	}
	@Test public void test_4153() {
		checkNotSubtype("null|[null]","X<[X]>|null");
	}
	@Test public void test_4154() {
		checkIsSubtype("null|[null]","X<X|[null]>");
	}
	@Test public void test_4155() {
		checkNotSubtype("null|[null]","[int]|int");
	}
	@Test public void test_4156() {
		checkNotSubtype("null|[null]","X<[X]>|int");
	}
	@Test public void test_4157() {
		checkNotSubtype("null|[null]","X<X|[int]>");
	}
	@Test public void test_4158() {
		checkNotSubtype("null|[null]","[X<[X]>]|X<[X]>");
	}
	@Test public void test_4159() {
		checkNotSubtype("null|[null]","X<[X]>|Y<[Y]>");
	}
	@Test public void test_4160() {
		checkNotSubtype("null|[null]","X<[X]>|[X<[X]>]");
	}
	@Test public void test_4161() {
		checkNotSubtype("null|[null]","X<X|[Y<[Y]>]>");
	}
	@Test public void test_4162() {
		checkNotSubtype("null|[null]","X<X|[[X]]>");
	}
	@Test public void test_4163() {
		checkNotSubtype("null|[null]","X<[X]>|(Y<X<[X]>|Y>)");
	}
	@Test public void test_4164() {
		checkNotSubtype("null|[null]","X<X|[Y<X|Y>]>");
	}
	@Test public void test_4165() {
		checkIsSubtype("null|[null]","(X<X|void>)|void");
	}
	@Test public void test_4166() {
		checkIsSubtype("null|[null]","X<X|(Y<Y|void>)>");
	}
	@Test public void test_4167() {
		checkNotSubtype("null|[null]","(X<X|any>)|any");
	}
	@Test public void test_4168() {
		checkNotSubtype("null|[null]","X<X|(Y<Y|any>)>");
	}
	@Test public void test_4169() {
		checkIsSubtype("null|[null]","(X<X|null>)|null");
	}
	@Test public void test_4170() {
		checkIsSubtype("null|[null]","X<X|(Y<Y|null>)>");
	}
	@Test public void test_4171() {
		checkNotSubtype("null|[null]","(X<X|int>)|int");
	}
	@Test public void test_4172() {
		checkNotSubtype("null|[null]","X<X|(Y<Y|int>)>");
	}
	@Test public void test_4173() {
		checkNotSubtype("null|[null]","(X<X|Y<[Y]>>)|Y<[Y]>");
	}
	@Test public void test_4174() {
		checkNotSubtype("null|[null]","X<X|(Y<Y|Z<[Z]>>)>");
	}
	@Test public void test_4175() {
		checkNotSubtype("null|[null]","X<X|(Y<Y|[X]>)>");
	}
	@Test public void test_4176() {
		checkIsSubtype("null|[null]","X<X|(Y<Y|(Z<X|Z>)>)>");
	}
	@Test public void test_4177() {
		checkNotSubtype("null|(X<null|X>)","any");
	}
	@Test public void test_4178() {
		checkIsSubtype("null|(X<null|X>)","null");
	}
	@Test public void test_4179() {
		checkNotSubtype("null|(X<null|X>)","int");
	}
	@Test public void test_4180() {
		checkNotSubtype("null|(X<null|X>)","X<[X]>");
	}
	@Test public void test_4181() {
		checkNotSubtype("null|(X<null|X>)","[void]");
	}
	@Test public void test_4182() {
		checkNotSubtype("null|(X<null|X>)","[any]");
	}
	@Test public void test_4183() {
		checkNotSubtype("null|(X<null|X>)","[null]");
	}
	@Test public void test_4184() {
		checkNotSubtype("null|(X<null|X>)","[int]");
	}
	@Test public void test_4185() {
		checkNotSubtype("null|(X<null|X>)","[X<[X]>]");
	}
	@Test public void test_4186() {
		checkIsSubtype("null|(X<null|X>)","X<X|void>");
	}
	@Test public void test_4187() {
		checkNotSubtype("null|(X<null|X>)","X<X|any>");
	}
	@Test public void test_4188() {
		checkIsSubtype("null|(X<null|X>)","X<X|null>");
	}
	@Test public void test_4189() {
		checkNotSubtype("null|(X<null|X>)","X<X|int>");
	}
	@Test public void test_4190() {
		checkNotSubtype("null|(X<null|X>)","X<X|Y<[Y]>>");
	}
	@Test public void test_4191() {
		checkNotSubtype("null|(X<null|X>)","[[void]]");
	}
	@Test public void test_4192() {
		checkNotSubtype("null|(X<null|X>)","[[any]]");
	}
	@Test public void test_4193() {
		checkNotSubtype("null|(X<null|X>)","[[null]]");
	}
	@Test public void test_4194() {
		checkNotSubtype("null|(X<null|X>)","[[int]]");
	}
	@Test public void test_4195() {
		checkNotSubtype("null|(X<null|X>)","[[X<[X]>]]");
	}
	@Test public void test_4196() {
		checkNotSubtype("null|(X<null|X>)","X<[[[X]]]>");
	}
	@Test public void test_4197() {
		checkNotSubtype("null|(X<null|X>)","X<[[Y<X|Y>]]>");
	}
	@Test public void test_4198() {
		checkNotSubtype("null|(X<null|X>)","[X<X|void>]");
	}
	@Test public void test_4199() {
		checkNotSubtype("null|(X<null|X>)","[X<X|any>]");
	}
	@Test public void test_4200() {
		checkNotSubtype("null|(X<null|X>)","[X<X|null>]");
	}
	@Test public void test_4201() {
		checkNotSubtype("null|(X<null|X>)","[X<X|int>]");
	}
	@Test public void test_4202() {
		checkNotSubtype("null|(X<null|X>)","[X<X|Y<[Y]>>]");
	}
	@Test public void test_4203() {
		checkNotSubtype("null|(X<null|X>)","X<[Y<Y|[X]>]>");
	}
	@Test public void test_4204() {
		checkNotSubtype("null|(X<null|X>)","X<[Y<Y|(Z<X|Z>)>]>");
	}
	@Test public void test_4205() {
		checkIsSubtype("null|(X<null|X>)","void|void");
	}
	@Test public void test_4206() {
		checkNotSubtype("null|(X<null|X>)","void|any");
	}
	@Test public void test_4207() {
		checkIsSubtype("null|(X<null|X>)","void|null");
	}
	@Test public void test_4208() {
		checkNotSubtype("null|(X<null|X>)","void|int");
	}
	@Test public void test_4209() {
		checkNotSubtype("null|(X<null|X>)","void|X<[X]>");
	}
	@Test public void test_4210() {
		checkNotSubtype("null|(X<null|X>)","void|[void]");
	}
	@Test public void test_4211() {
		checkIsSubtype("null|(X<null|X>)","void|(X<void|X>)");
	}
	@Test public void test_4212() {
		checkNotSubtype("null|(X<null|X>)","any|void");
	}
	@Test public void test_4213() {
		checkNotSubtype("null|(X<null|X>)","any|any");
	}
	@Test public void test_4214() {
		checkNotSubtype("null|(X<null|X>)","any|null");
	}
	@Test public void test_4215() {
		checkNotSubtype("null|(X<null|X>)","any|int");
	}
	@Test public void test_4216() {
		checkNotSubtype("null|(X<null|X>)","any|X<[X]>");
	}
	@Test public void test_4217() {
		checkNotSubtype("null|(X<null|X>)","any|[any]");
	}
	@Test public void test_4218() {
		checkNotSubtype("null|(X<null|X>)","any|(X<any|X>)");
	}
	@Test public void test_4219() {
		checkIsSubtype("null|(X<null|X>)","null|void");
	}
	@Test public void test_4220() {
		checkNotSubtype("null|(X<null|X>)","null|any");
	}
	@Test public void test_4221() {
		checkIsSubtype("null|(X<null|X>)","null|null");
	}
	@Test public void test_4222() {
		checkNotSubtype("null|(X<null|X>)","null|int");
	}
	@Test public void test_4223() {
		checkNotSubtype("null|(X<null|X>)","null|X<[X]>");
	}
	@Test public void test_4224() {
		checkNotSubtype("null|(X<null|X>)","null|[null]");
	}
	@Test public void test_4225() {
		checkIsSubtype("null|(X<null|X>)","null|(X<null|X>)");
	}
	@Test public void test_4226() {
		checkNotSubtype("null|(X<null|X>)","int|void");
	}
	@Test public void test_4227() {
		checkNotSubtype("null|(X<null|X>)","int|any");
	}
	@Test public void test_4228() {
		checkNotSubtype("null|(X<null|X>)","int|null");
	}
	@Test public void test_4229() {
		checkNotSubtype("null|(X<null|X>)","int|int");
	}
	@Test public void test_4230() {
		checkNotSubtype("null|(X<null|X>)","int|X<[X]>");
	}
	@Test public void test_4231() {
		checkNotSubtype("null|(X<null|X>)","int|[int]");
	}
	@Test public void test_4232() {
		checkNotSubtype("null|(X<null|X>)","int|(X<int|X>)");
	}
	@Test public void test_4233() {
		checkNotSubtype("null|(X<null|X>)","[void]|void");
	}
	@Test public void test_4234() {
		checkNotSubtype("null|(X<null|X>)","X<[X]>|void");
	}
	@Test public void test_4235() {
		checkNotSubtype("null|(X<null|X>)","X<X|[void]>");
	}
	@Test public void test_4236() {
		checkNotSubtype("null|(X<null|X>)","[any]|any");
	}
	@Test public void test_4237() {
		checkNotSubtype("null|(X<null|X>)","X<[X]>|any");
	}
	@Test public void test_4238() {
		checkNotSubtype("null|(X<null|X>)","X<X|[any]>");
	}
	@Test public void test_4239() {
		checkNotSubtype("null|(X<null|X>)","[null]|null");
	}
	@Test public void test_4240() {
		checkNotSubtype("null|(X<null|X>)","X<[X]>|null");
	}
	@Test public void test_4241() {
		checkNotSubtype("null|(X<null|X>)","X<X|[null]>");
	}
	@Test public void test_4242() {
		checkNotSubtype("null|(X<null|X>)","[int]|int");
	}
	@Test public void test_4243() {
		checkNotSubtype("null|(X<null|X>)","X<[X]>|int");
	}
	@Test public void test_4244() {
		checkNotSubtype("null|(X<null|X>)","X<X|[int]>");
	}
	@Test public void test_4245() {
		checkNotSubtype("null|(X<null|X>)","[X<[X]>]|X<[X]>");
	}
	@Test public void test_4246() {
		checkNotSubtype("null|(X<null|X>)","X<[X]>|Y<[Y]>");
	}
	@Test public void test_4247() {
		checkNotSubtype("null|(X<null|X>)","X<[X]>|[X<[X]>]");
	}
	@Test public void test_4248() {
		checkNotSubtype("null|(X<null|X>)","X<X|[Y<[Y]>]>");
	}
	@Test public void test_4249() {
		checkNotSubtype("null|(X<null|X>)","X<X|[[X]]>");
	}
	@Test public void test_4250() {
		checkNotSubtype("null|(X<null|X>)","X<[X]>|(Y<X<[X]>|Y>)");
	}
	@Test public void test_4251() {
		checkNotSubtype("null|(X<null|X>)","X<X|[Y<X|Y>]>");
	}
	@Test public void test_4252() {
		checkIsSubtype("null|(X<null|X>)","(X<X|void>)|void");
	}
	@Test public void test_4253() {
		checkIsSubtype("null|(X<null|X>)","X<X|(Y<Y|void>)>");
	}
	@Test public void test_4254() {
		checkNotSubtype("null|(X<null|X>)","(X<X|any>)|any");
	}
	@Test public void test_4255() {
		checkNotSubtype("null|(X<null|X>)","X<X|(Y<Y|any>)>");
	}
	@Test public void test_4256() {
		checkIsSubtype("null|(X<null|X>)","(X<X|null>)|null");
	}
	@Test public void test_4257() {
		checkIsSubtype("null|(X<null|X>)","X<X|(Y<Y|null>)>");
	}
	@Test public void test_4258() {
		checkNotSubtype("null|(X<null|X>)","(X<X|int>)|int");
	}
	@Test public void test_4259() {
		checkNotSubtype("null|(X<null|X>)","X<X|(Y<Y|int>)>");
	}
	@Test public void test_4260() {
		checkNotSubtype("null|(X<null|X>)","(X<X|Y<[Y]>>)|Y<[Y]>");
	}
	@Test public void test_4261() {
		checkNotSubtype("null|(X<null|X>)","X<X|(Y<Y|Z<[Z]>>)>");
	}
	@Test public void test_4262() {
		checkNotSubtype("null|(X<null|X>)","X<X|(Y<Y|[X]>)>");
	}
	@Test public void test_4263() {
		checkIsSubtype("null|(X<null|X>)","X<X|(Y<Y|(Z<X|Z>)>)>");
	}
	@Test public void test_4264() {
		checkNotSubtype("int|void","any");
	}
	@Test public void test_4265() {
		checkNotSubtype("int|void","null");
	}
	@Test public void test_4266() {
		checkIsSubtype("int|void","int");
	}
	@Test public void test_4267() {
		checkNotSubtype("int|void","X<[X]>");
	}
	@Test public void test_4268() {
		checkNotSubtype("int|void","[void]");
	}
	@Test public void test_4269() {
		checkNotSubtype("int|void","[any]");
	}
	@Test public void test_4270() {
		checkNotSubtype("int|void","[null]");
	}
	@Test public void test_4271() {
		checkNotSubtype("int|void","[int]");
	}
	@Test public void test_4272() {
		checkNotSubtype("int|void","[X<[X]>]");
	}
	@Test public void test_4273() {
		checkIsSubtype("int|void","X<X|void>");
	}
	@Test public void test_4274() {
		checkNotSubtype("int|void","X<X|any>");
	}
	@Test public void test_4275() {
		checkNotSubtype("int|void","X<X|null>");
	}
	@Test public void test_4276() {
		checkIsSubtype("int|void","X<X|int>");
	}
	@Test public void test_4277() {
		checkNotSubtype("int|void","X<X|Y<[Y]>>");
	}
	@Test public void test_4278() {
		checkNotSubtype("int|void","[[void]]");
	}
	@Test public void test_4279() {
		checkNotSubtype("int|void","[[any]]");
	}
	@Test public void test_4280() {
		checkNotSubtype("int|void","[[null]]");
	}
	@Test public void test_4281() {
		checkNotSubtype("int|void","[[int]]");
	}
	@Test public void test_4282() {
		checkNotSubtype("int|void","[[X<[X]>]]");
	}
	@Test public void test_4283() {
		checkNotSubtype("int|void","X<[[[X]]]>");
	}
	@Test public void test_4284() {
		checkNotSubtype("int|void","X<[[Y<X|Y>]]>");
	}
	@Test public void test_4285() {
		checkNotSubtype("int|void","[X<X|void>]");
	}
	@Test public void test_4286() {
		checkNotSubtype("int|void","[X<X|any>]");
	}
	@Test public void test_4287() {
		checkNotSubtype("int|void","[X<X|null>]");
	}
	@Test public void test_4288() {
		checkNotSubtype("int|void","[X<X|int>]");
	}
	@Test public void test_4289() {
		checkNotSubtype("int|void","[X<X|Y<[Y]>>]");
	}
	@Test public void test_4290() {
		checkNotSubtype("int|void","X<[Y<Y|[X]>]>");
	}
	@Test public void test_4291() {
		checkNotSubtype("int|void","X<[Y<Y|(Z<X|Z>)>]>");
	}
	@Test public void test_4292() {
		checkIsSubtype("int|void","void|void");
	}
	@Test public void test_4293() {
		checkNotSubtype("int|void","void|any");
	}
	@Test public void test_4294() {
		checkNotSubtype("int|void","void|null");
	}
	@Test public void test_4295() {
		checkIsSubtype("int|void","void|int");
	}
	@Test public void test_4296() {
		checkNotSubtype("int|void","void|X<[X]>");
	}
	@Test public void test_4297() {
		checkNotSubtype("int|void","void|[void]");
	}
	@Test public void test_4298() {
		checkIsSubtype("int|void","void|(X<void|X>)");
	}
	@Test public void test_4299() {
		checkNotSubtype("int|void","any|void");
	}
	@Test public void test_4300() {
		checkNotSubtype("int|void","any|any");
	}
	@Test public void test_4301() {
		checkNotSubtype("int|void","any|null");
	}
	@Test public void test_4302() {
		checkNotSubtype("int|void","any|int");
	}
	@Test public void test_4303() {
		checkNotSubtype("int|void","any|X<[X]>");
	}
	@Test public void test_4304() {
		checkNotSubtype("int|void","any|[any]");
	}
	@Test public void test_4305() {
		checkNotSubtype("int|void","any|(X<any|X>)");
	}
	@Test public void test_4306() {
		checkNotSubtype("int|void","null|void");
	}
	@Test public void test_4307() {
		checkNotSubtype("int|void","null|any");
	}
	@Test public void test_4308() {
		checkNotSubtype("int|void","null|null");
	}
	@Test public void test_4309() {
		checkNotSubtype("int|void","null|int");
	}
	@Test public void test_4310() {
		checkNotSubtype("int|void","null|X<[X]>");
	}
	@Test public void test_4311() {
		checkNotSubtype("int|void","null|[null]");
	}
	@Test public void test_4312() {
		checkNotSubtype("int|void","null|(X<null|X>)");
	}
	@Test public void test_4313() {
		checkIsSubtype("int|void","int|void");
	}
	@Test public void test_4314() {
		checkNotSubtype("int|void","int|any");
	}
	@Test public void test_4315() {
		checkNotSubtype("int|void","int|null");
	}
	@Test public void test_4316() {
		checkIsSubtype("int|void","int|int");
	}
	@Test public void test_4317() {
		checkNotSubtype("int|void","int|X<[X]>");
	}
	@Test public void test_4318() {
		checkNotSubtype("int|void","int|[int]");
	}
	@Test public void test_4319() {
		checkIsSubtype("int|void","int|(X<int|X>)");
	}
	@Test public void test_4320() {
		checkNotSubtype("int|void","[void]|void");
	}
	@Test public void test_4321() {
		checkNotSubtype("int|void","X<[X]>|void");
	}
	@Test public void test_4322() {
		checkNotSubtype("int|void","X<X|[void]>");
	}
	@Test public void test_4323() {
		checkNotSubtype("int|void","[any]|any");
	}
	@Test public void test_4324() {
		checkNotSubtype("int|void","X<[X]>|any");
	}
	@Test public void test_4325() {
		checkNotSubtype("int|void","X<X|[any]>");
	}
	@Test public void test_4326() {
		checkNotSubtype("int|void","[null]|null");
	}
	@Test public void test_4327() {
		checkNotSubtype("int|void","X<[X]>|null");
	}
	@Test public void test_4328() {
		checkNotSubtype("int|void","X<X|[null]>");
	}
	@Test public void test_4329() {
		checkNotSubtype("int|void","[int]|int");
	}
	@Test public void test_4330() {
		checkNotSubtype("int|void","X<[X]>|int");
	}
	@Test public void test_4331() {
		checkNotSubtype("int|void","X<X|[int]>");
	}
	@Test public void test_4332() {
		checkNotSubtype("int|void","[X<[X]>]|X<[X]>");
	}
	@Test public void test_4333() {
		checkNotSubtype("int|void","X<[X]>|Y<[Y]>");
	}
	@Test public void test_4334() {
		checkNotSubtype("int|void","X<[X]>|[X<[X]>]");
	}
	@Test public void test_4335() {
		checkNotSubtype("int|void","X<X|[Y<[Y]>]>");
	}
	@Test public void test_4336() {
		checkNotSubtype("int|void","X<X|[[X]]>");
	}
	@Test public void test_4337() {
		checkNotSubtype("int|void","X<[X]>|(Y<X<[X]>|Y>)");
	}
	@Test public void test_4338() {
		checkNotSubtype("int|void","X<X|[Y<X|Y>]>");
	}
	@Test public void test_4339() {
		checkIsSubtype("int|void","(X<X|void>)|void");
	}
	@Test public void test_4340() {
		checkIsSubtype("int|void","X<X|(Y<Y|void>)>");
	}
	@Test public void test_4341() {
		checkNotSubtype("int|void","(X<X|any>)|any");
	}
	@Test public void test_4342() {
		checkNotSubtype("int|void","X<X|(Y<Y|any>)>");
	}
	@Test public void test_4343() {
		checkNotSubtype("int|void","(X<X|null>)|null");
	}
	@Test public void test_4344() {
		checkNotSubtype("int|void","X<X|(Y<Y|null>)>");
	}
	@Test public void test_4345() {
		checkIsSubtype("int|void","(X<X|int>)|int");
	}
	@Test public void test_4346() {
		checkIsSubtype("int|void","X<X|(Y<Y|int>)>");
	}
	@Test public void test_4347() {
		checkNotSubtype("int|void","(X<X|Y<[Y]>>)|Y<[Y]>");
	}
	@Test public void test_4348() {
		checkNotSubtype("int|void","X<X|(Y<Y|Z<[Z]>>)>");
	}
	@Test public void test_4349() {
		checkNotSubtype("int|void","X<X|(Y<Y|[X]>)>");
	}
	@Test public void test_4350() {
		checkIsSubtype("int|void","X<X|(Y<Y|(Z<X|Z>)>)>");
	}
	@Test public void test_4351() {
		checkIsSubtype("int|any","any");
	}
	@Test public void test_4352() {
		checkIsSubtype("int|any","null");
	}
	@Test public void test_4353() {
		checkIsSubtype("int|any","int");
	}
	@Test public void test_4354() {
		checkIsSubtype("int|any","X<[X]>");
	}
	@Test public void test_4355() {
		checkIsSubtype("int|any","[void]");
	}
	@Test public void test_4356() {
		checkIsSubtype("int|any","[any]");
	}
	@Test public void test_4357() {
		checkIsSubtype("int|any","[null]");
	}
	@Test public void test_4358() {
		checkIsSubtype("int|any","[int]");
	}
	@Test public void test_4359() {
		checkIsSubtype("int|any","[X<[X]>]");
	}
	@Test public void test_4360() {
		checkIsSubtype("int|any","X<X|void>");
	}
	@Test public void test_4361() {
		checkIsSubtype("int|any","X<X|any>");
	}
	@Test public void test_4362() {
		checkIsSubtype("int|any","X<X|null>");
	}
	@Test public void test_4363() {
		checkIsSubtype("int|any","X<X|int>");
	}
	@Test public void test_4364() {
		checkIsSubtype("int|any","X<X|Y<[Y]>>");
	}
	@Test public void test_4365() {
		checkIsSubtype("int|any","[[void]]");
	}
	@Test public void test_4366() {
		checkIsSubtype("int|any","[[any]]");
	}
	@Test public void test_4367() {
		checkIsSubtype("int|any","[[null]]");
	}
	@Test public void test_4368() {
		checkIsSubtype("int|any","[[int]]");
	}
	@Test public void test_4369() {
		checkIsSubtype("int|any","[[X<[X]>]]");
	}
	@Test public void test_4370() {
		checkIsSubtype("int|any","X<[[[X]]]>");
	}
	@Test public void test_4371() {
		checkIsSubtype("int|any","X<[[Y<X|Y>]]>");
	}
	@Test public void test_4372() {
		checkIsSubtype("int|any","[X<X|void>]");
	}
	@Test public void test_4373() {
		checkIsSubtype("int|any","[X<X|any>]");
	}
	@Test public void test_4374() {
		checkIsSubtype("int|any","[X<X|null>]");
	}
	@Test public void test_4375() {
		checkIsSubtype("int|any","[X<X|int>]");
	}
	@Test public void test_4376() {
		checkIsSubtype("int|any","[X<X|Y<[Y]>>]");
	}
	@Test public void test_4377() {
		checkIsSubtype("int|any","X<[Y<Y|[X]>]>");
	}
	@Test public void test_4378() {
		checkIsSubtype("int|any","X<[Y<Y|(Z<X|Z>)>]>");
	}
	@Test public void test_4379() {
		checkIsSubtype("int|any","void|void");
	}
	@Test public void test_4380() {
		checkIsSubtype("int|any","void|any");
	}
	@Test public void test_4381() {
		checkIsSubtype("int|any","void|null");
	}
	@Test public void test_4382() {
		checkIsSubtype("int|any","void|int");
	}
	@Test public void test_4383() {
		checkIsSubtype("int|any","void|X<[X]>");
	}
	@Test public void test_4384() {
		checkIsSubtype("int|any","void|[void]");
	}
	@Test public void test_4385() {
		checkIsSubtype("int|any","void|(X<void|X>)");
	}
	@Test public void test_4386() {
		checkIsSubtype("int|any","any|void");
	}
	@Test public void test_4387() {
		checkIsSubtype("int|any","any|any");
	}
	@Test public void test_4388() {
		checkIsSubtype("int|any","any|null");
	}
	@Test public void test_4389() {
		checkIsSubtype("int|any","any|int");
	}
	@Test public void test_4390() {
		checkIsSubtype("int|any","any|X<[X]>");
	}
	@Test public void test_4391() {
		checkIsSubtype("int|any","any|[any]");
	}
	@Test public void test_4392() {
		checkIsSubtype("int|any","any|(X<any|X>)");
	}
	@Test public void test_4393() {
		checkIsSubtype("int|any","null|void");
	}
	@Test public void test_4394() {
		checkIsSubtype("int|any","null|any");
	}
	@Test public void test_4395() {
		checkIsSubtype("int|any","null|null");
	}
	@Test public void test_4396() {
		checkIsSubtype("int|any","null|int");
	}
	@Test public void test_4397() {
		checkIsSubtype("int|any","null|X<[X]>");
	}
	@Test public void test_4398() {
		checkIsSubtype("int|any","null|[null]");
	}
	@Test public void test_4399() {
		checkIsSubtype("int|any","null|(X<null|X>)");
	}
	@Test public void test_4400() {
		checkIsSubtype("int|any","int|void");
	}
	@Test public void test_4401() {
		checkIsSubtype("int|any","int|any");
	}
	@Test public void test_4402() {
		checkIsSubtype("int|any","int|null");
	}
	@Test public void test_4403() {
		checkIsSubtype("int|any","int|int");
	}
	@Test public void test_4404() {
		checkIsSubtype("int|any","int|X<[X]>");
	}
	@Test public void test_4405() {
		checkIsSubtype("int|any","int|[int]");
	}
	@Test public void test_4406() {
		checkIsSubtype("int|any","int|(X<int|X>)");
	}
	@Test public void test_4407() {
		checkIsSubtype("int|any","[void]|void");
	}
	@Test public void test_4408() {
		checkIsSubtype("int|any","X<[X]>|void");
	}
	@Test public void test_4409() {
		checkIsSubtype("int|any","X<X|[void]>");
	}
	@Test public void test_4410() {
		checkIsSubtype("int|any","[any]|any");
	}
	@Test public void test_4411() {
		checkIsSubtype("int|any","X<[X]>|any");
	}
	@Test public void test_4412() {
		checkIsSubtype("int|any","X<X|[any]>");
	}
	@Test public void test_4413() {
		checkIsSubtype("int|any","[null]|null");
	}
	@Test public void test_4414() {
		checkIsSubtype("int|any","X<[X]>|null");
	}
	@Test public void test_4415() {
		checkIsSubtype("int|any","X<X|[null]>");
	}
	@Test public void test_4416() {
		checkIsSubtype("int|any","[int]|int");
	}
	@Test public void test_4417() {
		checkIsSubtype("int|any","X<[X]>|int");
	}
	@Test public void test_4418() {
		checkIsSubtype("int|any","X<X|[int]>");
	}
	@Test public void test_4419() {
		checkIsSubtype("int|any","[X<[X]>]|X<[X]>");
	}
	@Test public void test_4420() {
		checkIsSubtype("int|any","X<[X]>|Y<[Y]>");
	}
	@Test public void test_4421() {
		checkIsSubtype("int|any","X<[X]>|[X<[X]>]");
	}
	@Test public void test_4422() {
		checkIsSubtype("int|any","X<X|[Y<[Y]>]>");
	}
	@Test public void test_4423() {
		checkIsSubtype("int|any","X<X|[[X]]>");
	}
	@Test public void test_4424() {
		checkIsSubtype("int|any","X<[X]>|(Y<X<[X]>|Y>)");
	}
	@Test public void test_4425() {
		checkIsSubtype("int|any","X<X|[Y<X|Y>]>");
	}
	@Test public void test_4426() {
		checkIsSubtype("int|any","(X<X|void>)|void");
	}
	@Test public void test_4427() {
		checkIsSubtype("int|any","X<X|(Y<Y|void>)>");
	}
	@Test public void test_4428() {
		checkIsSubtype("int|any","(X<X|any>)|any");
	}
	@Test public void test_4429() {
		checkIsSubtype("int|any","X<X|(Y<Y|any>)>");
	}
	@Test public void test_4430() {
		checkIsSubtype("int|any","(X<X|null>)|null");
	}
	@Test public void test_4431() {
		checkIsSubtype("int|any","X<X|(Y<Y|null>)>");
	}
	@Test public void test_4432() {
		checkIsSubtype("int|any","(X<X|int>)|int");
	}
	@Test public void test_4433() {
		checkIsSubtype("int|any","X<X|(Y<Y|int>)>");
	}
	@Test public void test_4434() {
		checkIsSubtype("int|any","(X<X|Y<[Y]>>)|Y<[Y]>");
	}
	@Test public void test_4435() {
		checkIsSubtype("int|any","X<X|(Y<Y|Z<[Z]>>)>");
	}
	@Test public void test_4436() {
		checkIsSubtype("int|any","X<X|(Y<Y|[X]>)>");
	}
	@Test public void test_4437() {
		checkIsSubtype("int|any","X<X|(Y<Y|(Z<X|Z>)>)>");
	}
	@Test public void test_4438() {
		checkNotSubtype("int|null","any");
	}
	@Test public void test_4439() {
		checkIsSubtype("int|null","null");
	}
	@Test public void test_4440() {
		checkIsSubtype("int|null","int");
	}
	@Test public void test_4441() {
		checkNotSubtype("int|null","X<[X]>");
	}
	@Test public void test_4442() {
		checkNotSubtype("int|null","[void]");
	}
	@Test public void test_4443() {
		checkNotSubtype("int|null","[any]");
	}
	@Test public void test_4444() {
		checkNotSubtype("int|null","[null]");
	}
	@Test public void test_4445() {
		checkNotSubtype("int|null","[int]");
	}
	@Test public void test_4446() {
		checkNotSubtype("int|null","[X<[X]>]");
	}
	@Test public void test_4447() {
		checkIsSubtype("int|null","X<X|void>");
	}
	@Test public void test_4448() {
		checkNotSubtype("int|null","X<X|any>");
	}
	@Test public void test_4449() {
		checkIsSubtype("int|null","X<X|null>");
	}
	@Test public void test_4450() {
		checkIsSubtype("int|null","X<X|int>");
	}
	@Test public void test_4451() {
		checkNotSubtype("int|null","X<X|Y<[Y]>>");
	}
	@Test public void test_4452() {
		checkNotSubtype("int|null","[[void]]");
	}
	@Test public void test_4453() {
		checkNotSubtype("int|null","[[any]]");
	}
	@Test public void test_4454() {
		checkNotSubtype("int|null","[[null]]");
	}
	@Test public void test_4455() {
		checkNotSubtype("int|null","[[int]]");
	}
	@Test public void test_4456() {
		checkNotSubtype("int|null","[[X<[X]>]]");
	}
	@Test public void test_4457() {
		checkNotSubtype("int|null","X<[[[X]]]>");
	}
	@Test public void test_4458() {
		checkNotSubtype("int|null","X<[[Y<X|Y>]]>");
	}
	@Test public void test_4459() {
		checkNotSubtype("int|null","[X<X|void>]");
	}
	@Test public void test_4460() {
		checkNotSubtype("int|null","[X<X|any>]");
	}
	@Test public void test_4461() {
		checkNotSubtype("int|null","[X<X|null>]");
	}
	@Test public void test_4462() {
		checkNotSubtype("int|null","[X<X|int>]");
	}
	@Test public void test_4463() {
		checkNotSubtype("int|null","[X<X|Y<[Y]>>]");
	}
	@Test public void test_4464() {
		checkNotSubtype("int|null","X<[Y<Y|[X]>]>");
	}
	@Test public void test_4465() {
		checkNotSubtype("int|null","X<[Y<Y|(Z<X|Z>)>]>");
	}
	@Test public void test_4466() {
		checkIsSubtype("int|null","void|void");
	}
	@Test public void test_4467() {
		checkNotSubtype("int|null","void|any");
	}
	@Test public void test_4468() {
		checkIsSubtype("int|null","void|null");
	}
	@Test public void test_4469() {
		checkIsSubtype("int|null","void|int");
	}
	@Test public void test_4470() {
		checkNotSubtype("int|null","void|X<[X]>");
	}
	@Test public void test_4471() {
		checkNotSubtype("int|null","void|[void]");
	}
	@Test public void test_4472() {
		checkIsSubtype("int|null","void|(X<void|X>)");
	}
	@Test public void test_4473() {
		checkNotSubtype("int|null","any|void");
	}
	@Test public void test_4474() {
		checkNotSubtype("int|null","any|any");
	}
	@Test public void test_4475() {
		checkNotSubtype("int|null","any|null");
	}
	@Test public void test_4476() {
		checkNotSubtype("int|null","any|int");
	}
	@Test public void test_4477() {
		checkNotSubtype("int|null","any|X<[X]>");
	}
	@Test public void test_4478() {
		checkNotSubtype("int|null","any|[any]");
	}
	@Test public void test_4479() {
		checkNotSubtype("int|null","any|(X<any|X>)");
	}
	@Test public void test_4480() {
		checkIsSubtype("int|null","null|void");
	}
	@Test public void test_4481() {
		checkNotSubtype("int|null","null|any");
	}
	@Test public void test_4482() {
		checkIsSubtype("int|null","null|null");
	}
	@Test public void test_4483() {
		checkIsSubtype("int|null","null|int");
	}
	@Test public void test_4484() {
		checkNotSubtype("int|null","null|X<[X]>");
	}
	@Test public void test_4485() {
		checkNotSubtype("int|null","null|[null]");
	}
	@Test public void test_4486() {
		checkIsSubtype("int|null","null|(X<null|X>)");
	}
	@Test public void test_4487() {
		checkIsSubtype("int|null","int|void");
	}
	@Test public void test_4488() {
		checkNotSubtype("int|null","int|any");
	}
	@Test public void test_4489() {
		checkIsSubtype("int|null","int|null");
	}
	@Test public void test_4490() {
		checkIsSubtype("int|null","int|int");
	}
	@Test public void test_4491() {
		checkNotSubtype("int|null","int|X<[X]>");
	}
	@Test public void test_4492() {
		checkNotSubtype("int|null","int|[int]");
	}
	@Test public void test_4493() {
		checkIsSubtype("int|null","int|(X<int|X>)");
	}
	@Test public void test_4494() {
		checkNotSubtype("int|null","[void]|void");
	}
	@Test public void test_4495() {
		checkNotSubtype("int|null","X<[X]>|void");
	}
	@Test public void test_4496() {
		checkNotSubtype("int|null","X<X|[void]>");
	}
	@Test public void test_4497() {
		checkNotSubtype("int|null","[any]|any");
	}
	@Test public void test_4498() {
		checkNotSubtype("int|null","X<[X]>|any");
	}
	@Test public void test_4499() {
		checkNotSubtype("int|null","X<X|[any]>");
	}
	@Test public void test_4500() {
		checkNotSubtype("int|null","[null]|null");
	}
	@Test public void test_4501() {
		checkNotSubtype("int|null","X<[X]>|null");
	}
	@Test public void test_4502() {
		checkNotSubtype("int|null","X<X|[null]>");
	}
	@Test public void test_4503() {
		checkNotSubtype("int|null","[int]|int");
	}
	@Test public void test_4504() {
		checkNotSubtype("int|null","X<[X]>|int");
	}
	@Test public void test_4505() {
		checkNotSubtype("int|null","X<X|[int]>");
	}
	@Test public void test_4506() {
		checkNotSubtype("int|null","[X<[X]>]|X<[X]>");
	}
	@Test public void test_4507() {
		checkNotSubtype("int|null","X<[X]>|Y<[Y]>");
	}
	@Test public void test_4508() {
		checkNotSubtype("int|null","X<[X]>|[X<[X]>]");
	}
	@Test public void test_4509() {
		checkNotSubtype("int|null","X<X|[Y<[Y]>]>");
	}
	@Test public void test_4510() {
		checkNotSubtype("int|null","X<X|[[X]]>");
	}
	@Test public void test_4511() {
		checkNotSubtype("int|null","X<[X]>|(Y<X<[X]>|Y>)");
	}
	@Test public void test_4512() {
		checkNotSubtype("int|null","X<X|[Y<X|Y>]>");
	}
	@Test public void test_4513() {
		checkIsSubtype("int|null","(X<X|void>)|void");
	}
	@Test public void test_4514() {
		checkIsSubtype("int|null","X<X|(Y<Y|void>)>");
	}
	@Test public void test_4515() {
		checkNotSubtype("int|null","(X<X|any>)|any");
	}
	@Test public void test_4516() {
		checkNotSubtype("int|null","X<X|(Y<Y|any>)>");
	}
	@Test public void test_4517() {
		checkIsSubtype("int|null","(X<X|null>)|null");
	}
	@Test public void test_4518() {
		checkIsSubtype("int|null","X<X|(Y<Y|null>)>");
	}
	@Test public void test_4519() {
		checkIsSubtype("int|null","(X<X|int>)|int");
	}
	@Test public void test_4520() {
		checkIsSubtype("int|null","X<X|(Y<Y|int>)>");
	}
	@Test public void test_4521() {
		checkNotSubtype("int|null","(X<X|Y<[Y]>>)|Y<[Y]>");
	}
	@Test public void test_4522() {
		checkNotSubtype("int|null","X<X|(Y<Y|Z<[Z]>>)>");
	}
	@Test public void test_4523() {
		checkNotSubtype("int|null","X<X|(Y<Y|[X]>)>");
	}
	@Test public void test_4524() {
		checkIsSubtype("int|null","X<X|(Y<Y|(Z<X|Z>)>)>");
	}
	@Test public void test_4525() {
		checkNotSubtype("int|int","any");
	}
	@Test public void test_4526() {
		checkNotSubtype("int|int","null");
	}
	@Test public void test_4527() {
		checkIsSubtype("int|int","int");
	}
	@Test public void test_4528() {
		checkNotSubtype("int|int","X<[X]>");
	}
	@Test public void test_4529() {
		checkNotSubtype("int|int","[void]");
	}
	@Test public void test_4530() {
		checkNotSubtype("int|int","[any]");
	}
	@Test public void test_4531() {
		checkNotSubtype("int|int","[null]");
	}
	@Test public void test_4532() {
		checkNotSubtype("int|int","[int]");
	}
	@Test public void test_4533() {
		checkNotSubtype("int|int","[X<[X]>]");
	}
	@Test public void test_4534() {
		checkIsSubtype("int|int","X<X|void>");
	}
	@Test public void test_4535() {
		checkNotSubtype("int|int","X<X|any>");
	}
	@Test public void test_4536() {
		checkNotSubtype("int|int","X<X|null>");
	}
	@Test public void test_4537() {
		checkIsSubtype("int|int","X<X|int>");
	}
	@Test public void test_4538() {
		checkNotSubtype("int|int","X<X|Y<[Y]>>");
	}
	@Test public void test_4539() {
		checkNotSubtype("int|int","[[void]]");
	}
	@Test public void test_4540() {
		checkNotSubtype("int|int","[[any]]");
	}
	@Test public void test_4541() {
		checkNotSubtype("int|int","[[null]]");
	}
	@Test public void test_4542() {
		checkNotSubtype("int|int","[[int]]");
	}
	@Test public void test_4543() {
		checkNotSubtype("int|int","[[X<[X]>]]");
	}
	@Test public void test_4544() {
		checkNotSubtype("int|int","X<[[[X]]]>");
	}
	@Test public void test_4545() {
		checkNotSubtype("int|int","X<[[Y<X|Y>]]>");
	}
	@Test public void test_4546() {
		checkNotSubtype("int|int","[X<X|void>]");
	}
	@Test public void test_4547() {
		checkNotSubtype("int|int","[X<X|any>]");
	}
	@Test public void test_4548() {
		checkNotSubtype("int|int","[X<X|null>]");
	}
	@Test public void test_4549() {
		checkNotSubtype("int|int","[X<X|int>]");
	}
	@Test public void test_4550() {
		checkNotSubtype("int|int","[X<X|Y<[Y]>>]");
	}
	@Test public void test_4551() {
		checkNotSubtype("int|int","X<[Y<Y|[X]>]>");
	}
	@Test public void test_4552() {
		checkNotSubtype("int|int","X<[Y<Y|(Z<X|Z>)>]>");
	}
	@Test public void test_4553() {
		checkIsSubtype("int|int","void|void");
	}
	@Test public void test_4554() {
		checkNotSubtype("int|int","void|any");
	}
	@Test public void test_4555() {
		checkNotSubtype("int|int","void|null");
	}
	@Test public void test_4556() {
		checkIsSubtype("int|int","void|int");
	}
	@Test public void test_4557() {
		checkNotSubtype("int|int","void|X<[X]>");
	}
	@Test public void test_4558() {
		checkNotSubtype("int|int","void|[void]");
	}
	@Test public void test_4559() {
		checkIsSubtype("int|int","void|(X<void|X>)");
	}
	@Test public void test_4560() {
		checkNotSubtype("int|int","any|void");
	}
	@Test public void test_4561() {
		checkNotSubtype("int|int","any|any");
	}
	@Test public void test_4562() {
		checkNotSubtype("int|int","any|null");
	}
	@Test public void test_4563() {
		checkNotSubtype("int|int","any|int");
	}
	@Test public void test_4564() {
		checkNotSubtype("int|int","any|X<[X]>");
	}
	@Test public void test_4565() {
		checkNotSubtype("int|int","any|[any]");
	}
	@Test public void test_4566() {
		checkNotSubtype("int|int","any|(X<any|X>)");
	}
	@Test public void test_4567() {
		checkNotSubtype("int|int","null|void");
	}
	@Test public void test_4568() {
		checkNotSubtype("int|int","null|any");
	}
	@Test public void test_4569() {
		checkNotSubtype("int|int","null|null");
	}
	@Test public void test_4570() {
		checkNotSubtype("int|int","null|int");
	}
	@Test public void test_4571() {
		checkNotSubtype("int|int","null|X<[X]>");
	}
	@Test public void test_4572() {
		checkNotSubtype("int|int","null|[null]");
	}
	@Test public void test_4573() {
		checkNotSubtype("int|int","null|(X<null|X>)");
	}
	@Test public void test_4574() {
		checkIsSubtype("int|int","int|void");
	}
	@Test public void test_4575() {
		checkNotSubtype("int|int","int|any");
	}
	@Test public void test_4576() {
		checkNotSubtype("int|int","int|null");
	}
	@Test public void test_4577() {
		checkIsSubtype("int|int","int|int");
	}
	@Test public void test_4578() {
		checkNotSubtype("int|int","int|X<[X]>");
	}
	@Test public void test_4579() {
		checkNotSubtype("int|int","int|[int]");
	}
	@Test public void test_4580() {
		checkIsSubtype("int|int","int|(X<int|X>)");
	}
	@Test public void test_4581() {
		checkNotSubtype("int|int","[void]|void");
	}
	@Test public void test_4582() {
		checkNotSubtype("int|int","X<[X]>|void");
	}
	@Test public void test_4583() {
		checkNotSubtype("int|int","X<X|[void]>");
	}
	@Test public void test_4584() {
		checkNotSubtype("int|int","[any]|any");
	}
	@Test public void test_4585() {
		checkNotSubtype("int|int","X<[X]>|any");
	}
	@Test public void test_4586() {
		checkNotSubtype("int|int","X<X|[any]>");
	}
	@Test public void test_4587() {
		checkNotSubtype("int|int","[null]|null");
	}
	@Test public void test_4588() {
		checkNotSubtype("int|int","X<[X]>|null");
	}
	@Test public void test_4589() {
		checkNotSubtype("int|int","X<X|[null]>");
	}
	@Test public void test_4590() {
		checkNotSubtype("int|int","[int]|int");
	}
	@Test public void test_4591() {
		checkNotSubtype("int|int","X<[X]>|int");
	}
	@Test public void test_4592() {
		checkNotSubtype("int|int","X<X|[int]>");
	}
	@Test public void test_4593() {
		checkNotSubtype("int|int","[X<[X]>]|X<[X]>");
	}
	@Test public void test_4594() {
		checkNotSubtype("int|int","X<[X]>|Y<[Y]>");
	}
	@Test public void test_4595() {
		checkNotSubtype("int|int","X<[X]>|[X<[X]>]");
	}
	@Test public void test_4596() {
		checkNotSubtype("int|int","X<X|[Y<[Y]>]>");
	}
	@Test public void test_4597() {
		checkNotSubtype("int|int","X<X|[[X]]>");
	}
	@Test public void test_4598() {
		checkNotSubtype("int|int","X<[X]>|(Y<X<[X]>|Y>)");
	}
	@Test public void test_4599() {
		checkNotSubtype("int|int","X<X|[Y<X|Y>]>");
	}
	@Test public void test_4600() {
		checkIsSubtype("int|int","(X<X|void>)|void");
	}
	@Test public void test_4601() {
		checkIsSubtype("int|int","X<X|(Y<Y|void>)>");
	}
	@Test public void test_4602() {
		checkNotSubtype("int|int","(X<X|any>)|any");
	}
	@Test public void test_4603() {
		checkNotSubtype("int|int","X<X|(Y<Y|any>)>");
	}
	@Test public void test_4604() {
		checkNotSubtype("int|int","(X<X|null>)|null");
	}
	@Test public void test_4605() {
		checkNotSubtype("int|int","X<X|(Y<Y|null>)>");
	}
	@Test public void test_4606() {
		checkIsSubtype("int|int","(X<X|int>)|int");
	}
	@Test public void test_4607() {
		checkIsSubtype("int|int","X<X|(Y<Y|int>)>");
	}
	@Test public void test_4608() {
		checkNotSubtype("int|int","(X<X|Y<[Y]>>)|Y<[Y]>");
	}
	@Test public void test_4609() {
		checkNotSubtype("int|int","X<X|(Y<Y|Z<[Z]>>)>");
	}
	@Test public void test_4610() {
		checkNotSubtype("int|int","X<X|(Y<Y|[X]>)>");
	}
	@Test public void test_4611() {
		checkIsSubtype("int|int","X<X|(Y<Y|(Z<X|Z>)>)>");
	}
	@Test public void test_4612() {
		checkNotSubtype("int|X<[X]>","any");
	}
	@Test public void test_4613() {
		checkNotSubtype("int|X<[X]>","null");
	}
	@Test public void test_4614() {
		checkIsSubtype("int|X<[X]>","int");
	}
	@Test public void test_4615() {
		checkIsSubtype("int|X<[X]>","X<[X]>");
	}
	@Test public void test_4616() {
		checkIsSubtype("int|X<[X]>","[void]");
	}
	@Test public void test_4617() {
		checkNotSubtype("int|X<[X]>","[any]");
	}
	@Test public void test_4618() {
		checkNotSubtype("int|X<[X]>","[null]");
	}
	@Test public void test_4619() {
		checkNotSubtype("int|X<[X]>","[int]");
	}
	@Test public void test_4620() {
		checkIsSubtype("int|X<[X]>","[X<[X]>]");
	}
	@Test public void test_4621() {
		checkIsSubtype("int|X<[X]>","X<X|void>");
	}
	@Test public void test_4622() {
		checkNotSubtype("int|X<[X]>","X<X|any>");
	}
	@Test public void test_4623() {
		checkNotSubtype("int|X<[X]>","X<X|null>");
	}
	@Test public void test_4624() {
		checkIsSubtype("int|X<[X]>","X<X|int>");
	}
	@Test public void test_4625() {
		checkIsSubtype("int|X<[X]>","X<X|Y<[Y]>>");
	}
	@Test public void test_4626() {
		checkIsSubtype("int|X<[X]>","[[void]]");
	}
	@Test public void test_4627() {
		checkNotSubtype("int|X<[X]>","[[any]]");
	}
	@Test public void test_4628() {
		checkNotSubtype("int|X<[X]>","[[null]]");
	}
	@Test public void test_4629() {
		checkNotSubtype("int|X<[X]>","[[int]]");
	}
	@Test public void test_4630() {
		checkIsSubtype("int|X<[X]>","[[X<[X]>]]");
	}
	@Test public void test_4631() {
		checkIsSubtype("int|X<[X]>","X<[[[X]]]>");
	}
	@Test public void test_4632() {
		checkIsSubtype("int|X<[X]>","X<[[Y<X|Y>]]>");
	}
	@Test public void test_4633() {
		checkIsSubtype("int|X<[X]>","[X<X|void>]");
	}
	@Test public void test_4634() {
		checkNotSubtype("int|X<[X]>","[X<X|any>]");
	}
	@Test public void test_4635() {
		checkNotSubtype("int|X<[X]>","[X<X|null>]");
	}
	@Test public void test_4636() {
		checkNotSubtype("int|X<[X]>","[X<X|int>]");
	}
	@Test public void test_4637() {
		checkIsSubtype("int|X<[X]>","[X<X|Y<[Y]>>]");
	}
	@Test public void test_4638() {
		checkIsSubtype("int|X<[X]>","X<[Y<Y|[X]>]>");
	}
	@Test public void test_4639() {
		checkIsSubtype("int|X<[X]>","X<[Y<Y|(Z<X|Z>)>]>");
	}
	@Test public void test_4640() {
		checkIsSubtype("int|X<[X]>","void|void");
	}
	@Test public void test_4641() {
		checkNotSubtype("int|X<[X]>","void|any");
	}
	@Test public void test_4642() {
		checkNotSubtype("int|X<[X]>","void|null");
	}
	@Test public void test_4643() {
		checkIsSubtype("int|X<[X]>","void|int");
	}
	@Test public void test_4644() {
		checkIsSubtype("int|X<[X]>","void|X<[X]>");
	}
	@Test public void test_4645() {
		checkIsSubtype("int|X<[X]>","void|[void]");
	}
	@Test public void test_4646() {
		checkIsSubtype("int|X<[X]>","void|(X<void|X>)");
	}
	@Test public void test_4647() {
		checkNotSubtype("int|X<[X]>","any|void");
	}
	@Test public void test_4648() {
		checkNotSubtype("int|X<[X]>","any|any");
	}
	@Test public void test_4649() {
		checkNotSubtype("int|X<[X]>","any|null");
	}
	@Test public void test_4650() {
		checkNotSubtype("int|X<[X]>","any|int");
	}
	@Test public void test_4651() {
		checkNotSubtype("int|X<[X]>","any|X<[X]>");
	}
	@Test public void test_4652() {
		checkNotSubtype("int|X<[X]>","any|[any]");
	}
	@Test public void test_4653() {
		checkNotSubtype("int|X<[X]>","any|(X<any|X>)");
	}
	@Test public void test_4654() {
		checkNotSubtype("int|X<[X]>","null|void");
	}
	@Test public void test_4655() {
		checkNotSubtype("int|X<[X]>","null|any");
	}
	@Test public void test_4656() {
		checkNotSubtype("int|X<[X]>","null|null");
	}
	@Test public void test_4657() {
		checkNotSubtype("int|X<[X]>","null|int");
	}
	@Test public void test_4658() {
		checkNotSubtype("int|X<[X]>","null|X<[X]>");
	}
	@Test public void test_4659() {
		checkNotSubtype("int|X<[X]>","null|[null]");
	}
	@Test public void test_4660() {
		checkNotSubtype("int|X<[X]>","null|(X<null|X>)");
	}
	@Test public void test_4661() {
		checkIsSubtype("int|X<[X]>","int|void");
	}
	@Test public void test_4662() {
		checkNotSubtype("int|X<[X]>","int|any");
	}
	@Test public void test_4663() {
		checkNotSubtype("int|X<[X]>","int|null");
	}
	@Test public void test_4664() {
		checkIsSubtype("int|X<[X]>","int|int");
	}
	@Test public void test_4665() {
		checkIsSubtype("int|X<[X]>","int|X<[X]>");
	}
	@Test public void test_4666() {
		checkNotSubtype("int|X<[X]>","int|[int]");
	}
	@Test public void test_4667() {
		checkIsSubtype("int|X<[X]>","int|(X<int|X>)");
	}
	@Test public void test_4668() {
		checkIsSubtype("int|X<[X]>","[void]|void");
	}
	@Test public void test_4669() {
		checkIsSubtype("int|X<[X]>","X<[X]>|void");
	}
	@Test public void test_4670() {
		checkIsSubtype("int|X<[X]>","X<X|[void]>");
	}
	@Test public void test_4671() {
		checkNotSubtype("int|X<[X]>","[any]|any");
	}
	@Test public void test_4672() {
		checkNotSubtype("int|X<[X]>","X<[X]>|any");
	}
	@Test public void test_4673() {
		checkNotSubtype("int|X<[X]>","X<X|[any]>");
	}
	@Test public void test_4674() {
		checkNotSubtype("int|X<[X]>","[null]|null");
	}
	@Test public void test_4675() {
		checkNotSubtype("int|X<[X]>","X<[X]>|null");
	}
	@Test public void test_4676() {
		checkNotSubtype("int|X<[X]>","X<X|[null]>");
	}
	@Test public void test_4677() {
		checkNotSubtype("int|X<[X]>","[int]|int");
	}
	@Test public void test_4678() {
		checkIsSubtype("int|X<[X]>","X<[X]>|int");
	}
	@Test public void test_4679() {
		checkNotSubtype("int|X<[X]>","X<X|[int]>");
	}
	@Test public void test_4680() {
		checkIsSubtype("int|X<[X]>","[X<[X]>]|X<[X]>");
	}
	@Test public void test_4681() {
		checkIsSubtype("int|X<[X]>","X<[X]>|Y<[Y]>");
	}
	@Test public void test_4682() {
		checkIsSubtype("int|X<[X]>","X<[X]>|[X<[X]>]");
	}
	@Test public void test_4683() {
		checkIsSubtype("int|X<[X]>","X<X|[Y<[Y]>]>");
	}
	@Test public void test_4684() {
		checkIsSubtype("int|X<[X]>","X<X|[[X]]>");
	}
	@Test public void test_4685() {
		checkIsSubtype("int|X<[X]>","X<[X]>|(Y<X<[X]>|Y>)");
	}
	@Test public void test_4686() {
		checkIsSubtype("int|X<[X]>","X<X|[Y<X|Y>]>");
	}
	@Test public void test_4687() {
		checkIsSubtype("int|X<[X]>","(X<X|void>)|void");
	}
	@Test public void test_4688() {
		checkIsSubtype("int|X<[X]>","X<X|(Y<Y|void>)>");
	}
	@Test public void test_4689() {
		checkNotSubtype("int|X<[X]>","(X<X|any>)|any");
	}
	@Test public void test_4690() {
		checkNotSubtype("int|X<[X]>","X<X|(Y<Y|any>)>");
	}
	@Test public void test_4691() {
		checkNotSubtype("int|X<[X]>","(X<X|null>)|null");
	}
	@Test public void test_4692() {
		checkNotSubtype("int|X<[X]>","X<X|(Y<Y|null>)>");
	}
	@Test public void test_4693() {
		checkIsSubtype("int|X<[X]>","(X<X|int>)|int");
	}
	@Test public void test_4694() {
		checkIsSubtype("int|X<[X]>","X<X|(Y<Y|int>)>");
	}
	@Test public void test_4695() {
		checkIsSubtype("int|X<[X]>","(X<X|Y<[Y]>>)|Y<[Y]>");
	}
	@Test public void test_4696() {
		checkIsSubtype("int|X<[X]>","X<X|(Y<Y|Z<[Z]>>)>");
	}
	@Test public void test_4697() {
		checkIsSubtype("int|X<[X]>","X<X|(Y<Y|[X]>)>");
	}
	@Test public void test_4698() {
		checkIsSubtype("int|X<[X]>","X<X|(Y<Y|(Z<X|Z>)>)>");
	}
	@Test public void test_4699() {
		checkNotSubtype("int|[int]","any");
	}
	@Test public void test_4700() {
		checkNotSubtype("int|[int]","null");
	}
	@Test public void test_4701() {
		checkIsSubtype("int|[int]","int");
	}
	@Test public void test_4702() {
		checkNotSubtype("int|[int]","X<[X]>");
	}
	@Test public void test_4703() {
		checkIsSubtype("int|[int]","[void]");
	}
	@Test public void test_4704() {
		checkNotSubtype("int|[int]","[any]");
	}
	@Test public void test_4705() {
		checkNotSubtype("int|[int]","[null]");
	}
	@Test public void test_4706() {
		checkIsSubtype("int|[int]","[int]");
	}
	@Test public void test_4707() {
		checkNotSubtype("int|[int]","[X<[X]>]");
	}
	@Test public void test_4708() {
		checkIsSubtype("int|[int]","X<X|void>");
	}
	@Test public void test_4709() {
		checkNotSubtype("int|[int]","X<X|any>");
	}
	@Test public void test_4710() {
		checkNotSubtype("int|[int]","X<X|null>");
	}
	@Test public void test_4711() {
		checkIsSubtype("int|[int]","X<X|int>");
	}
	@Test public void test_4712() {
		checkNotSubtype("int|[int]","X<X|Y<[Y]>>");
	}
	@Test public void test_4713() {
		checkNotSubtype("int|[int]","[[void]]");
	}
	@Test public void test_4714() {
		checkNotSubtype("int|[int]","[[any]]");
	}
	@Test public void test_4715() {
		checkNotSubtype("int|[int]","[[null]]");
	}
	@Test public void test_4716() {
		checkNotSubtype("int|[int]","[[int]]");
	}
	@Test public void test_4717() {
		checkNotSubtype("int|[int]","[[X<[X]>]]");
	}
	@Test public void test_4718() {
		checkNotSubtype("int|[int]","X<[[[X]]]>");
	}
	@Test public void test_4719() {
		checkNotSubtype("int|[int]","X<[[Y<X|Y>]]>");
	}
	@Test public void test_4720() {
		checkIsSubtype("int|[int]","[X<X|void>]");
	}
	@Test public void test_4721() {
		checkNotSubtype("int|[int]","[X<X|any>]");
	}
	@Test public void test_4722() {
		checkNotSubtype("int|[int]","[X<X|null>]");
	}
	@Test public void test_4723() {
		checkIsSubtype("int|[int]","[X<X|int>]");
	}
	@Test public void test_4724() {
		checkNotSubtype("int|[int]","[X<X|Y<[Y]>>]");
	}
	@Test public void test_4725() {
		checkNotSubtype("int|[int]","X<[Y<Y|[X]>]>");
	}
	@Test public void test_4726() {
		checkNotSubtype("int|[int]","X<[Y<Y|(Z<X|Z>)>]>");
	}
	@Test public void test_4727() {
		checkIsSubtype("int|[int]","void|void");
	}
	@Test public void test_4728() {
		checkNotSubtype("int|[int]","void|any");
	}
	@Test public void test_4729() {
		checkNotSubtype("int|[int]","void|null");
	}
	@Test public void test_4730() {
		checkIsSubtype("int|[int]","void|int");
	}
	@Test public void test_4731() {
		checkNotSubtype("int|[int]","void|X<[X]>");
	}
	@Test public void test_4732() {
		checkIsSubtype("int|[int]","void|[void]");
	}
	@Test public void test_4733() {
		checkIsSubtype("int|[int]","void|(X<void|X>)");
	}
	@Test public void test_4734() {
		checkNotSubtype("int|[int]","any|void");
	}
	@Test public void test_4735() {
		checkNotSubtype("int|[int]","any|any");
	}
	@Test public void test_4736() {
		checkNotSubtype("int|[int]","any|null");
	}
	@Test public void test_4737() {
		checkNotSubtype("int|[int]","any|int");
	}
	@Test public void test_4738() {
		checkNotSubtype("int|[int]","any|X<[X]>");
	}
	@Test public void test_4739() {
		checkNotSubtype("int|[int]","any|[any]");
	}
	@Test public void test_4740() {
		checkNotSubtype("int|[int]","any|(X<any|X>)");
	}
	@Test public void test_4741() {
		checkNotSubtype("int|[int]","null|void");
	}
	@Test public void test_4742() {
		checkNotSubtype("int|[int]","null|any");
	}
	@Test public void test_4743() {
		checkNotSubtype("int|[int]","null|null");
	}
	@Test public void test_4744() {
		checkNotSubtype("int|[int]","null|int");
	}
	@Test public void test_4745() {
		checkNotSubtype("int|[int]","null|X<[X]>");
	}
	@Test public void test_4746() {
		checkNotSubtype("int|[int]","null|[null]");
	}
	@Test public void test_4747() {
		checkNotSubtype("int|[int]","null|(X<null|X>)");
	}
	@Test public void test_4748() {
		checkIsSubtype("int|[int]","int|void");
	}
	@Test public void test_4749() {
		checkNotSubtype("int|[int]","int|any");
	}
	@Test public void test_4750() {
		checkNotSubtype("int|[int]","int|null");
	}
	@Test public void test_4751() {
		checkIsSubtype("int|[int]","int|int");
	}
	@Test public void test_4752() {
		checkNotSubtype("int|[int]","int|X<[X]>");
	}
	@Test public void test_4753() {
		checkIsSubtype("int|[int]","int|[int]");
	}
	@Test public void test_4754() {
		checkIsSubtype("int|[int]","int|(X<int|X>)");
	}
	@Test public void test_4755() {
		checkIsSubtype("int|[int]","[void]|void");
	}
	@Test public void test_4756() {
		checkNotSubtype("int|[int]","X<[X]>|void");
	}
	@Test public void test_4757() {
		checkIsSubtype("int|[int]","X<X|[void]>");
	}
	@Test public void test_4758() {
		checkNotSubtype("int|[int]","[any]|any");
	}
	@Test public void test_4759() {
		checkNotSubtype("int|[int]","X<[X]>|any");
	}
	@Test public void test_4760() {
		checkNotSubtype("int|[int]","X<X|[any]>");
	}
	@Test public void test_4761() {
		checkNotSubtype("int|[int]","[null]|null");
	}
	@Test public void test_4762() {
		checkNotSubtype("int|[int]","X<[X]>|null");
	}
	@Test public void test_4763() {
		checkNotSubtype("int|[int]","X<X|[null]>");
	}
	@Test public void test_4764() {
		checkIsSubtype("int|[int]","[int]|int");
	}
	@Test public void test_4765() {
		checkNotSubtype("int|[int]","X<[X]>|int");
	}
	@Test public void test_4766() {
		checkIsSubtype("int|[int]","X<X|[int]>");
	}
	@Test public void test_4767() {
		checkNotSubtype("int|[int]","[X<[X]>]|X<[X]>");
	}
	@Test public void test_4768() {
		checkNotSubtype("int|[int]","X<[X]>|Y<[Y]>");
	}
	@Test public void test_4769() {
		checkNotSubtype("int|[int]","X<[X]>|[X<[X]>]");
	}
	@Test public void test_4770() {
		checkNotSubtype("int|[int]","X<X|[Y<[Y]>]>");
	}
	@Test public void test_4771() {
		checkNotSubtype("int|[int]","X<X|[[X]]>");
	}
	@Test public void test_4772() {
		checkNotSubtype("int|[int]","X<[X]>|(Y<X<[X]>|Y>)");
	}
	@Test public void test_4773() {
		checkNotSubtype("int|[int]","X<X|[Y<X|Y>]>");
	}
	@Test public void test_4774() {
		checkIsSubtype("int|[int]","(X<X|void>)|void");
	}
	@Test public void test_4775() {
		checkIsSubtype("int|[int]","X<X|(Y<Y|void>)>");
	}
	@Test public void test_4776() {
		checkNotSubtype("int|[int]","(X<X|any>)|any");
	}
	@Test public void test_4777() {
		checkNotSubtype("int|[int]","X<X|(Y<Y|any>)>");
	}
	@Test public void test_4778() {
		checkNotSubtype("int|[int]","(X<X|null>)|null");
	}
	@Test public void test_4779() {
		checkNotSubtype("int|[int]","X<X|(Y<Y|null>)>");
	}
	@Test public void test_4780() {
		checkIsSubtype("int|[int]","(X<X|int>)|int");
	}
	@Test public void test_4781() {
		checkIsSubtype("int|[int]","X<X|(Y<Y|int>)>");
	}
	@Test public void test_4782() {
		checkNotSubtype("int|[int]","(X<X|Y<[Y]>>)|Y<[Y]>");
	}
	@Test public void test_4783() {
		checkNotSubtype("int|[int]","X<X|(Y<Y|Z<[Z]>>)>");
	}
	@Test public void test_4784() {
		checkNotSubtype("int|[int]","X<X|(Y<Y|[X]>)>");
	}
	@Test public void test_4785() {
		checkIsSubtype("int|[int]","X<X|(Y<Y|(Z<X|Z>)>)>");
	}
	@Test public void test_4786() {
		checkNotSubtype("int|(X<int|X>)","any");
	}
	@Test public void test_4787() {
		checkNotSubtype("int|(X<int|X>)","null");
	}
	@Test public void test_4788() {
		checkIsSubtype("int|(X<int|X>)","int");
	}
	@Test public void test_4789() {
		checkNotSubtype("int|(X<int|X>)","X<[X]>");
	}
	@Test public void test_4790() {
		checkNotSubtype("int|(X<int|X>)","[void]");
	}
	@Test public void test_4791() {
		checkNotSubtype("int|(X<int|X>)","[any]");
	}
	@Test public void test_4792() {
		checkNotSubtype("int|(X<int|X>)","[null]");
	}
	@Test public void test_4793() {
		checkNotSubtype("int|(X<int|X>)","[int]");
	}
	@Test public void test_4794() {
		checkNotSubtype("int|(X<int|X>)","[X<[X]>]");
	}
	@Test public void test_4795() {
		checkIsSubtype("int|(X<int|X>)","X<X|void>");
	}
	@Test public void test_4796() {
		checkNotSubtype("int|(X<int|X>)","X<X|any>");
	}
	@Test public void test_4797() {
		checkNotSubtype("int|(X<int|X>)","X<X|null>");
	}
	@Test public void test_4798() {
		checkIsSubtype("int|(X<int|X>)","X<X|int>");
	}
	@Test public void test_4799() {
		checkNotSubtype("int|(X<int|X>)","X<X|Y<[Y]>>");
	}
	@Test public void test_4800() {
		checkNotSubtype("int|(X<int|X>)","[[void]]");
	}
	@Test public void test_4801() {
		checkNotSubtype("int|(X<int|X>)","[[any]]");
	}
	@Test public void test_4802() {
		checkNotSubtype("int|(X<int|X>)","[[null]]");
	}
	@Test public void test_4803() {
		checkNotSubtype("int|(X<int|X>)","[[int]]");
	}
	@Test public void test_4804() {
		checkNotSubtype("int|(X<int|X>)","[[X<[X]>]]");
	}
	@Test public void test_4805() {
		checkNotSubtype("int|(X<int|X>)","X<[[[X]]]>");
	}
	@Test public void test_4806() {
		checkNotSubtype("int|(X<int|X>)","X<[[Y<X|Y>]]>");
	}
	@Test public void test_4807() {
		checkNotSubtype("int|(X<int|X>)","[X<X|void>]");
	}
	@Test public void test_4808() {
		checkNotSubtype("int|(X<int|X>)","[X<X|any>]");
	}
	@Test public void test_4809() {
		checkNotSubtype("int|(X<int|X>)","[X<X|null>]");
	}
	@Test public void test_4810() {
		checkNotSubtype("int|(X<int|X>)","[X<X|int>]");
	}
	@Test public void test_4811() {
		checkNotSubtype("int|(X<int|X>)","[X<X|Y<[Y]>>]");
	}
	@Test public void test_4812() {
		checkNotSubtype("int|(X<int|X>)","X<[Y<Y|[X]>]>");
	}
	@Test public void test_4813() {
		checkNotSubtype("int|(X<int|X>)","X<[Y<Y|(Z<X|Z>)>]>");
	}
	@Test public void test_4814() {
		checkIsSubtype("int|(X<int|X>)","void|void");
	}
	@Test public void test_4815() {
		checkNotSubtype("int|(X<int|X>)","void|any");
	}
	@Test public void test_4816() {
		checkNotSubtype("int|(X<int|X>)","void|null");
	}
	@Test public void test_4817() {
		checkIsSubtype("int|(X<int|X>)","void|int");
	}
	@Test public void test_4818() {
		checkNotSubtype("int|(X<int|X>)","void|X<[X]>");
	}
	@Test public void test_4819() {
		checkNotSubtype("int|(X<int|X>)","void|[void]");
	}
	@Test public void test_4820() {
		checkIsSubtype("int|(X<int|X>)","void|(X<void|X>)");
	}
	@Test public void test_4821() {
		checkNotSubtype("int|(X<int|X>)","any|void");
	}
	@Test public void test_4822() {
		checkNotSubtype("int|(X<int|X>)","any|any");
	}
	@Test public void test_4823() {
		checkNotSubtype("int|(X<int|X>)","any|null");
	}
	@Test public void test_4824() {
		checkNotSubtype("int|(X<int|X>)","any|int");
	}
	@Test public void test_4825() {
		checkNotSubtype("int|(X<int|X>)","any|X<[X]>");
	}
	@Test public void test_4826() {
		checkNotSubtype("int|(X<int|X>)","any|[any]");
	}
	@Test public void test_4827() {
		checkNotSubtype("int|(X<int|X>)","any|(X<any|X>)");
	}
	@Test public void test_4828() {
		checkNotSubtype("int|(X<int|X>)","null|void");
	}
	@Test public void test_4829() {
		checkNotSubtype("int|(X<int|X>)","null|any");
	}
	@Test public void test_4830() {
		checkNotSubtype("int|(X<int|X>)","null|null");
	}
	@Test public void test_4831() {
		checkNotSubtype("int|(X<int|X>)","null|int");
	}
	@Test public void test_4832() {
		checkNotSubtype("int|(X<int|X>)","null|X<[X]>");
	}
	@Test public void test_4833() {
		checkNotSubtype("int|(X<int|X>)","null|[null]");
	}
	@Test public void test_4834() {
		checkNotSubtype("int|(X<int|X>)","null|(X<null|X>)");
	}
	@Test public void test_4835() {
		checkIsSubtype("int|(X<int|X>)","int|void");
	}
	@Test public void test_4836() {
		checkNotSubtype("int|(X<int|X>)","int|any");
	}
	@Test public void test_4837() {
		checkNotSubtype("int|(X<int|X>)","int|null");
	}
	@Test public void test_4838() {
		checkIsSubtype("int|(X<int|X>)","int|int");
	}
	@Test public void test_4839() {
		checkNotSubtype("int|(X<int|X>)","int|X<[X]>");
	}
	@Test public void test_4840() {
		checkNotSubtype("int|(X<int|X>)","int|[int]");
	}
	@Test public void test_4841() {
		checkIsSubtype("int|(X<int|X>)","int|(X<int|X>)");
	}
	@Test public void test_4842() {
		checkNotSubtype("int|(X<int|X>)","[void]|void");
	}
	@Test public void test_4843() {
		checkNotSubtype("int|(X<int|X>)","X<[X]>|void");
	}
	@Test public void test_4844() {
		checkNotSubtype("int|(X<int|X>)","X<X|[void]>");
	}
	@Test public void test_4845() {
		checkNotSubtype("int|(X<int|X>)","[any]|any");
	}
	@Test public void test_4846() {
		checkNotSubtype("int|(X<int|X>)","X<[X]>|any");
	}
	@Test public void test_4847() {
		checkNotSubtype("int|(X<int|X>)","X<X|[any]>");
	}
	@Test public void test_4848() {
		checkNotSubtype("int|(X<int|X>)","[null]|null");
	}
	@Test public void test_4849() {
		checkNotSubtype("int|(X<int|X>)","X<[X]>|null");
	}
	@Test public void test_4850() {
		checkNotSubtype("int|(X<int|X>)","X<X|[null]>");
	}
	@Test public void test_4851() {
		checkNotSubtype("int|(X<int|X>)","[int]|int");
	}
	@Test public void test_4852() {
		checkNotSubtype("int|(X<int|X>)","X<[X]>|int");
	}
	@Test public void test_4853() {
		checkNotSubtype("int|(X<int|X>)","X<X|[int]>");
	}
	@Test public void test_4854() {
		checkNotSubtype("int|(X<int|X>)","[X<[X]>]|X<[X]>");
	}
	@Test public void test_4855() {
		checkNotSubtype("int|(X<int|X>)","X<[X]>|Y<[Y]>");
	}
	@Test public void test_4856() {
		checkNotSubtype("int|(X<int|X>)","X<[X]>|[X<[X]>]");
	}
	@Test public void test_4857() {
		checkNotSubtype("int|(X<int|X>)","X<X|[Y<[Y]>]>");
	}
	@Test public void test_4858() {
		checkNotSubtype("int|(X<int|X>)","X<X|[[X]]>");
	}
	@Test public void test_4859() {
		checkNotSubtype("int|(X<int|X>)","X<[X]>|(Y<X<[X]>|Y>)");
	}
	@Test public void test_4860() {
		checkNotSubtype("int|(X<int|X>)","X<X|[Y<X|Y>]>");
	}
	@Test public void test_4861() {
		checkIsSubtype("int|(X<int|X>)","(X<X|void>)|void");
	}
	@Test public void test_4862() {
		checkIsSubtype("int|(X<int|X>)","X<X|(Y<Y|void>)>");
	}
	@Test public void test_4863() {
		checkNotSubtype("int|(X<int|X>)","(X<X|any>)|any");
	}
	@Test public void test_4864() {
		checkNotSubtype("int|(X<int|X>)","X<X|(Y<Y|any>)>");
	}
	@Test public void test_4865() {
		checkNotSubtype("int|(X<int|X>)","(X<X|null>)|null");
	}
	@Test public void test_4866() {
		checkNotSubtype("int|(X<int|X>)","X<X|(Y<Y|null>)>");
	}
	@Test public void test_4867() {
		checkIsSubtype("int|(X<int|X>)","(X<X|int>)|int");
	}
	@Test public void test_4868() {
		checkIsSubtype("int|(X<int|X>)","X<X|(Y<Y|int>)>");
	}
	@Test public void test_4869() {
		checkNotSubtype("int|(X<int|X>)","(X<X|Y<[Y]>>)|Y<[Y]>");
	}
	@Test public void test_4870() {
		checkNotSubtype("int|(X<int|X>)","X<X|(Y<Y|Z<[Z]>>)>");
	}
	@Test public void test_4871() {
		checkNotSubtype("int|(X<int|X>)","X<X|(Y<Y|[X]>)>");
	}
	@Test public void test_4872() {
		checkIsSubtype("int|(X<int|X>)","X<X|(Y<Y|(Z<X|Z>)>)>");
	}
	@Test public void test_4873() {
		checkNotSubtype("[void]|void","any");
	}
	@Test public void test_4874() {
		checkNotSubtype("[void]|void","null");
	}
	@Test public void test_4875() {
		checkNotSubtype("[void]|void","int");
	}
	@Test public void test_4876() {
		checkNotSubtype("[void]|void","X<[X]>");
	}
	@Test public void test_4877() {
		checkIsSubtype("[void]|void","[void]");
	}
	@Test public void test_4878() {
		checkNotSubtype("[void]|void","[any]");
	}
	@Test public void test_4879() {
		checkNotSubtype("[void]|void","[null]");
	}
	@Test public void test_4880() {
		checkNotSubtype("[void]|void","[int]");
	}
	@Test public void test_4881() {
		checkNotSubtype("[void]|void","[X<[X]>]");
	}
	@Test public void test_4882() {
		checkIsSubtype("[void]|void","X<X|void>");
	}
	@Test public void test_4883() {
		checkNotSubtype("[void]|void","X<X|any>");
	}
	@Test public void test_4884() {
		checkNotSubtype("[void]|void","X<X|null>");
	}
	@Test public void test_4885() {
		checkNotSubtype("[void]|void","X<X|int>");
	}
	@Test public void test_4886() {
		checkNotSubtype("[void]|void","X<X|Y<[Y]>>");
	}
	@Test public void test_4887() {
		checkNotSubtype("[void]|void","[[void]]");
	}
	@Test public void test_4888() {
		checkNotSubtype("[void]|void","[[any]]");
	}
	@Test public void test_4889() {
		checkNotSubtype("[void]|void","[[null]]");
	}
	@Test public void test_4890() {
		checkNotSubtype("[void]|void","[[int]]");
	}
	@Test public void test_4891() {
		checkNotSubtype("[void]|void","[[X<[X]>]]");
	}
	@Test public void test_4892() {
		checkNotSubtype("[void]|void","X<[[[X]]]>");
	}
	@Test public void test_4893() {
		checkNotSubtype("[void]|void","X<[[Y<X|Y>]]>");
	}
	@Test public void test_4894() {
		checkIsSubtype("[void]|void","[X<X|void>]");
	}
	@Test public void test_4895() {
		checkNotSubtype("[void]|void","[X<X|any>]");
	}
	@Test public void test_4896() {
		checkNotSubtype("[void]|void","[X<X|null>]");
	}
	@Test public void test_4897() {
		checkNotSubtype("[void]|void","[X<X|int>]");
	}
	@Test public void test_4898() {
		checkNotSubtype("[void]|void","[X<X|Y<[Y]>>]");
	}
	@Test public void test_4899() {
		checkNotSubtype("[void]|void","X<[Y<Y|[X]>]>");
	}
	@Test public void test_4900() {
		checkNotSubtype("[void]|void","X<[Y<Y|(Z<X|Z>)>]>");
	}
	@Test public void test_4901() {
		checkIsSubtype("[void]|void","void|void");
	}
	@Test public void test_4902() {
		checkNotSubtype("[void]|void","void|any");
	}
	@Test public void test_4903() {
		checkNotSubtype("[void]|void","void|null");
	}
	@Test public void test_4904() {
		checkNotSubtype("[void]|void","void|int");
	}
	@Test public void test_4905() {
		checkNotSubtype("[void]|void","void|X<[X]>");
	}
	@Test public void test_4906() {
		checkIsSubtype("[void]|void","void|[void]");
	}
	@Test public void test_4907() {
		checkIsSubtype("[void]|void","void|(X<void|X>)");
	}
	@Test public void test_4908() {
		checkNotSubtype("[void]|void","any|void");
	}
	@Test public void test_4909() {
		checkNotSubtype("[void]|void","any|any");
	}
	@Test public void test_4910() {
		checkNotSubtype("[void]|void","any|null");
	}
	@Test public void test_4911() {
		checkNotSubtype("[void]|void","any|int");
	}
	@Test public void test_4912() {
		checkNotSubtype("[void]|void","any|X<[X]>");
	}
	@Test public void test_4913() {
		checkNotSubtype("[void]|void","any|[any]");
	}
	@Test public void test_4914() {
		checkNotSubtype("[void]|void","any|(X<any|X>)");
	}
	@Test public void test_4915() {
		checkNotSubtype("[void]|void","null|void");
	}
	@Test public void test_4916() {
		checkNotSubtype("[void]|void","null|any");
	}
	@Test public void test_4917() {
		checkNotSubtype("[void]|void","null|null");
	}
	@Test public void test_4918() {
		checkNotSubtype("[void]|void","null|int");
	}
	@Test public void test_4919() {
		checkNotSubtype("[void]|void","null|X<[X]>");
	}
	@Test public void test_4920() {
		checkNotSubtype("[void]|void","null|[null]");
	}
	@Test public void test_4921() {
		checkNotSubtype("[void]|void","null|(X<null|X>)");
	}
	@Test public void test_4922() {
		checkNotSubtype("[void]|void","int|void");
	}
	@Test public void test_4923() {
		checkNotSubtype("[void]|void","int|any");
	}
	@Test public void test_4924() {
		checkNotSubtype("[void]|void","int|null");
	}
	@Test public void test_4925() {
		checkNotSubtype("[void]|void","int|int");
	}
	@Test public void test_4926() {
		checkNotSubtype("[void]|void","int|X<[X]>");
	}
	@Test public void test_4927() {
		checkNotSubtype("[void]|void","int|[int]");
	}
	@Test public void test_4928() {
		checkNotSubtype("[void]|void","int|(X<int|X>)");
	}
	@Test public void test_4929() {
		checkIsSubtype("[void]|void","[void]|void");
	}
	@Test public void test_4930() {
		checkNotSubtype("[void]|void","X<[X]>|void");
	}
	@Test public void test_4931() {
		checkIsSubtype("[void]|void","X<X|[void]>");
	}
	@Test public void test_4932() {
		checkNotSubtype("[void]|void","[any]|any");
	}
	@Test public void test_4933() {
		checkNotSubtype("[void]|void","X<[X]>|any");
	}
	@Test public void test_4934() {
		checkNotSubtype("[void]|void","X<X|[any]>");
	}
	@Test public void test_4935() {
		checkNotSubtype("[void]|void","[null]|null");
	}
	@Test public void test_4936() {
		checkNotSubtype("[void]|void","X<[X]>|null");
	}
	@Test public void test_4937() {
		checkNotSubtype("[void]|void","X<X|[null]>");
	}
	@Test public void test_4938() {
		checkNotSubtype("[void]|void","[int]|int");
	}
	@Test public void test_4939() {
		checkNotSubtype("[void]|void","X<[X]>|int");
	}
	@Test public void test_4940() {
		checkNotSubtype("[void]|void","X<X|[int]>");
	}
	@Test public void test_4941() {
		checkNotSubtype("[void]|void","[X<[X]>]|X<[X]>");
	}
	@Test public void test_4942() {
		checkNotSubtype("[void]|void","X<[X]>|Y<[Y]>");
	}
	@Test public void test_4943() {
		checkNotSubtype("[void]|void","X<[X]>|[X<[X]>]");
	}
	@Test public void test_4944() {
		checkNotSubtype("[void]|void","X<X|[Y<[Y]>]>");
	}
	@Test public void test_4945() {
		checkNotSubtype("[void]|void","X<X|[[X]]>");
	}
	@Test public void test_4946() {
		checkNotSubtype("[void]|void","X<[X]>|(Y<X<[X]>|Y>)");
	}
	@Test public void test_4947() {
		checkNotSubtype("[void]|void","X<X|[Y<X|Y>]>");
	}
	@Test public void test_4948() {
		checkIsSubtype("[void]|void","(X<X|void>)|void");
	}
	@Test public void test_4949() {
		checkIsSubtype("[void]|void","X<X|(Y<Y|void>)>");
	}
	@Test public void test_4950() {
		checkNotSubtype("[void]|void","(X<X|any>)|any");
	}
	@Test public void test_4951() {
		checkNotSubtype("[void]|void","X<X|(Y<Y|any>)>");
	}
	@Test public void test_4952() {
		checkNotSubtype("[void]|void","(X<X|null>)|null");
	}
	@Test public void test_4953() {
		checkNotSubtype("[void]|void","X<X|(Y<Y|null>)>");
	}
	@Test public void test_4954() {
		checkNotSubtype("[void]|void","(X<X|int>)|int");
	}
	@Test public void test_4955() {
		checkNotSubtype("[void]|void","X<X|(Y<Y|int>)>");
	}
	@Test public void test_4956() {
		checkNotSubtype("[void]|void","(X<X|Y<[Y]>>)|Y<[Y]>");
	}
	@Test public void test_4957() {
		checkNotSubtype("[void]|void","X<X|(Y<Y|Z<[Z]>>)>");
	}
	@Test public void test_4958() {
		checkNotSubtype("[void]|void","X<X|(Y<Y|[X]>)>");
	}
	@Test public void test_4959() {
		checkIsSubtype("[void]|void","X<X|(Y<Y|(Z<X|Z>)>)>");
	}
	@Test public void test_4960() {
		checkNotSubtype("X<[X]>|void","any");
	}
	@Test public void test_4961() {
		checkNotSubtype("X<[X]>|void","null");
	}
	@Test public void test_4962() {
		checkNotSubtype("X<[X]>|void","int");
	}
	@Test public void test_4963() {
		checkIsSubtype("X<[X]>|void","X<[X]>");
	}
	@Test public void test_4964() {
		checkIsSubtype("X<[X]>|void","[void]");
	}
	@Test public void test_4965() {
		checkNotSubtype("X<[X]>|void","[any]");
	}
	@Test public void test_4966() {
		checkNotSubtype("X<[X]>|void","[null]");
	}
	@Test public void test_4967() {
		checkNotSubtype("X<[X]>|void","[int]");
	}
	@Test public void test_4968() {
		checkIsSubtype("X<[X]>|void","[X<[X]>]");
	}
	@Test public void test_4969() {
		checkIsSubtype("X<[X]>|void","X<X|void>");
	}
	@Test public void test_4970() {
		checkNotSubtype("X<[X]>|void","X<X|any>");
	}
	@Test public void test_4971() {
		checkNotSubtype("X<[X]>|void","X<X|null>");
	}
	@Test public void test_4972() {
		checkNotSubtype("X<[X]>|void","X<X|int>");
	}
	@Test public void test_4973() {
		checkIsSubtype("X<[X]>|void","X<X|Y<[Y]>>");
	}
	@Test public void test_4974() {
		checkIsSubtype("X<[X]>|void","[[void]]");
	}
	@Test public void test_4975() {
		checkNotSubtype("X<[X]>|void","[[any]]");
	}
	@Test public void test_4976() {
		checkNotSubtype("X<[X]>|void","[[null]]");
	}
	@Test public void test_4977() {
		checkNotSubtype("X<[X]>|void","[[int]]");
	}
	@Test public void test_4978() {
		checkIsSubtype("X<[X]>|void","[[X<[X]>]]");
	}
	@Test public void test_4979() {
		checkIsSubtype("X<[X]>|void","X<[[[X]]]>");
	}
	@Test public void test_4980() {
		checkIsSubtype("X<[X]>|void","X<[[Y<X|Y>]]>");
	}
	@Test public void test_4981() {
		checkIsSubtype("X<[X]>|void","[X<X|void>]");
	}
	@Test public void test_4982() {
		checkNotSubtype("X<[X]>|void","[X<X|any>]");
	}
	@Test public void test_4983() {
		checkNotSubtype("X<[X]>|void","[X<X|null>]");
	}
	@Test public void test_4984() {
		checkNotSubtype("X<[X]>|void","[X<X|int>]");
	}
	@Test public void test_4985() {
		checkIsSubtype("X<[X]>|void","[X<X|Y<[Y]>>]");
	}
	@Test public void test_4986() {
		checkIsSubtype("X<[X]>|void","X<[Y<Y|[X]>]>");
	}
	@Test public void test_4987() {
		checkIsSubtype("X<[X]>|void","X<[Y<Y|(Z<X|Z>)>]>");
	}
	@Test public void test_4988() {
		checkIsSubtype("X<[X]>|void","void|void");
	}
	@Test public void test_4989() {
		checkNotSubtype("X<[X]>|void","void|any");
	}
	@Test public void test_4990() {
		checkNotSubtype("X<[X]>|void","void|null");
	}
	@Test public void test_4991() {
		checkNotSubtype("X<[X]>|void","void|int");
	}
	@Test public void test_4992() {
		checkIsSubtype("X<[X]>|void","void|X<[X]>");
	}
	@Test public void test_4993() {
		checkIsSubtype("X<[X]>|void","void|[void]");
	}
	@Test public void test_4994() {
		checkIsSubtype("X<[X]>|void","void|(X<void|X>)");
	}
	@Test public void test_4995() {
		checkNotSubtype("X<[X]>|void","any|void");
	}
	@Test public void test_4996() {
		checkNotSubtype("X<[X]>|void","any|any");
	}
	@Test public void test_4997() {
		checkNotSubtype("X<[X]>|void","any|null");
	}
	@Test public void test_4998() {
		checkNotSubtype("X<[X]>|void","any|int");
	}
	@Test public void test_4999() {
		checkNotSubtype("X<[X]>|void","any|X<[X]>");
	}
	@Test public void test_5000() {
		checkNotSubtype("X<[X]>|void","any|[any]");
	}
	@Test public void test_5001() {
		checkNotSubtype("X<[X]>|void","any|(X<any|X>)");
	}
	@Test public void test_5002() {
		checkNotSubtype("X<[X]>|void","null|void");
	}
	@Test public void test_5003() {
		checkNotSubtype("X<[X]>|void","null|any");
	}
	@Test public void test_5004() {
		checkNotSubtype("X<[X]>|void","null|null");
	}
	@Test public void test_5005() {
		checkNotSubtype("X<[X]>|void","null|int");
	}
	@Test public void test_5006() {
		checkNotSubtype("X<[X]>|void","null|X<[X]>");
	}
	@Test public void test_5007() {
		checkNotSubtype("X<[X]>|void","null|[null]");
	}
	@Test public void test_5008() {
		checkNotSubtype("X<[X]>|void","null|(X<null|X>)");
	}
	@Test public void test_5009() {
		checkNotSubtype("X<[X]>|void","int|void");
	}
	@Test public void test_5010() {
		checkNotSubtype("X<[X]>|void","int|any");
	}
	@Test public void test_5011() {
		checkNotSubtype("X<[X]>|void","int|null");
	}
	@Test public void test_5012() {
		checkNotSubtype("X<[X]>|void","int|int");
	}
	@Test public void test_5013() {
		checkNotSubtype("X<[X]>|void","int|X<[X]>");
	}
	@Test public void test_5014() {
		checkNotSubtype("X<[X]>|void","int|[int]");
	}
	@Test public void test_5015() {
		checkNotSubtype("X<[X]>|void","int|(X<int|X>)");
	}
	@Test public void test_5016() {
		checkIsSubtype("X<[X]>|void","[void]|void");
	}
	@Test public void test_5017() {
		checkIsSubtype("X<[X]>|void","X<[X]>|void");
	}
	@Test public void test_5018() {
		checkIsSubtype("X<[X]>|void","X<X|[void]>");
	}
	@Test public void test_5019() {
		checkNotSubtype("X<[X]>|void","[any]|any");
	}
	@Test public void test_5020() {
		checkNotSubtype("X<[X]>|void","X<[X]>|any");
	}
	@Test public void test_5021() {
		checkNotSubtype("X<[X]>|void","X<X|[any]>");
	}
	@Test public void test_5022() {
		checkNotSubtype("X<[X]>|void","[null]|null");
	}
	@Test public void test_5023() {
		checkNotSubtype("X<[X]>|void","X<[X]>|null");
	}
	@Test public void test_5024() {
		checkNotSubtype("X<[X]>|void","X<X|[null]>");
	}
	@Test public void test_5025() {
		checkNotSubtype("X<[X]>|void","[int]|int");
	}
	@Test public void test_5026() {
		checkNotSubtype("X<[X]>|void","X<[X]>|int");
	}
	@Test public void test_5027() {
		checkNotSubtype("X<[X]>|void","X<X|[int]>");
	}
	@Test public void test_5028() {
		checkIsSubtype("X<[X]>|void","[X<[X]>]|X<[X]>");
	}
	@Test public void test_5029() {
		checkIsSubtype("X<[X]>|void","X<[X]>|Y<[Y]>");
	}
	@Test public void test_5030() {
		checkIsSubtype("X<[X]>|void","X<[X]>|[X<[X]>]");
	}
	@Test public void test_5031() {
		checkIsSubtype("X<[X]>|void","X<X|[Y<[Y]>]>");
	}
	@Test public void test_5032() {
		checkIsSubtype("X<[X]>|void","X<X|[[X]]>");
	}
	@Test public void test_5033() {
		checkIsSubtype("X<[X]>|void","X<[X]>|(Y<X<[X]>|Y>)");
	}
	@Test public void test_5034() {
		checkIsSubtype("X<[X]>|void","X<X|[Y<X|Y>]>");
	}
	@Test public void test_5035() {
		checkIsSubtype("X<[X]>|void","(X<X|void>)|void");
	}
	@Test public void test_5036() {
		checkIsSubtype("X<[X]>|void","X<X|(Y<Y|void>)>");
	}
	@Test public void test_5037() {
		checkNotSubtype("X<[X]>|void","(X<X|any>)|any");
	}
	@Test public void test_5038() {
		checkNotSubtype("X<[X]>|void","X<X|(Y<Y|any>)>");
	}
	@Test public void test_5039() {
		checkNotSubtype("X<[X]>|void","(X<X|null>)|null");
	}
	@Test public void test_5040() {
		checkNotSubtype("X<[X]>|void","X<X|(Y<Y|null>)>");
	}
	@Test public void test_5041() {
		checkNotSubtype("X<[X]>|void","(X<X|int>)|int");
	}
	@Test public void test_5042() {
		checkNotSubtype("X<[X]>|void","X<X|(Y<Y|int>)>");
	}
	@Test public void test_5043() {
		checkIsSubtype("X<[X]>|void","(X<X|Y<[Y]>>)|Y<[Y]>");
	}
	@Test public void test_5044() {
		checkIsSubtype("X<[X]>|void","X<X|(Y<Y|Z<[Z]>>)>");
	}
	@Test public void test_5045() {
		checkIsSubtype("X<[X]>|void","X<X|(Y<Y|[X]>)>");
	}
	@Test public void test_5046() {
		checkIsSubtype("X<[X]>|void","X<X|(Y<Y|(Z<X|Z>)>)>");
	}
	@Test public void test_5047() {
		checkNotSubtype("X<X|[void]>","any");
	}
	@Test public void test_5048() {
		checkNotSubtype("X<X|[void]>","null");
	}
	@Test public void test_5049() {
		checkNotSubtype("X<X|[void]>","int");
	}
	@Test public void test_5050() {
		checkNotSubtype("X<X|[void]>","X<[X]>");
	}
	@Test public void test_5051() {
		checkIsSubtype("X<X|[void]>","[void]");
	}
	@Test public void test_5052() {
		checkNotSubtype("X<X|[void]>","[any]");
	}
	@Test public void test_5053() {
		checkNotSubtype("X<X|[void]>","[null]");
	}
	@Test public void test_5054() {
		checkNotSubtype("X<X|[void]>","[int]");
	}
	@Test public void test_5055() {
		checkNotSubtype("X<X|[void]>","[X<[X]>]");
	}
	@Test public void test_5056() {
		checkIsSubtype("X<X|[void]>","X<X|void>");
	}
	@Test public void test_5057() {
		checkNotSubtype("X<X|[void]>","X<X|any>");
	}
	@Test public void test_5058() {
		checkNotSubtype("X<X|[void]>","X<X|null>");
	}
	@Test public void test_5059() {
		checkNotSubtype("X<X|[void]>","X<X|int>");
	}
	@Test public void test_5060() {
		checkNotSubtype("X<X|[void]>","X<X|Y<[Y]>>");
	}
	@Test public void test_5061() {
		checkNotSubtype("X<X|[void]>","[[void]]");
	}
	@Test public void test_5062() {
		checkNotSubtype("X<X|[void]>","[[any]]");
	}
	@Test public void test_5063() {
		checkNotSubtype("X<X|[void]>","[[null]]");
	}
	@Test public void test_5064() {
		checkNotSubtype("X<X|[void]>","[[int]]");
	}
	@Test public void test_5065() {
		checkNotSubtype("X<X|[void]>","[[X<[X]>]]");
	}
	@Test public void test_5066() {
		checkNotSubtype("X<X|[void]>","X<[[[X]]]>");
	}
	@Test public void test_5067() {
		checkNotSubtype("X<X|[void]>","X<[[Y<X|Y>]]>");
	}
	@Test public void test_5068() {
		checkIsSubtype("X<X|[void]>","[X<X|void>]");
	}
	@Test public void test_5069() {
		checkNotSubtype("X<X|[void]>","[X<X|any>]");
	}
	@Test public void test_5070() {
		checkNotSubtype("X<X|[void]>","[X<X|null>]");
	}
	@Test public void test_5071() {
		checkNotSubtype("X<X|[void]>","[X<X|int>]");
	}
	@Test public void test_5072() {
		checkNotSubtype("X<X|[void]>","[X<X|Y<[Y]>>]");
	}
	@Test public void test_5073() {
		checkNotSubtype("X<X|[void]>","X<[Y<Y|[X]>]>");
	}
	@Test public void test_5074() {
		checkNotSubtype("X<X|[void]>","X<[Y<Y|(Z<X|Z>)>]>");
	}
	@Test public void test_5075() {
		checkIsSubtype("X<X|[void]>","void|void");
	}
	@Test public void test_5076() {
		checkNotSubtype("X<X|[void]>","void|any");
	}
	@Test public void test_5077() {
		checkNotSubtype("X<X|[void]>","void|null");
	}
	@Test public void test_5078() {
		checkNotSubtype("X<X|[void]>","void|int");
	}
	@Test public void test_5079() {
		checkNotSubtype("X<X|[void]>","void|X<[X]>");
	}
	@Test public void test_5080() {
		checkIsSubtype("X<X|[void]>","void|[void]");
	}
	@Test public void test_5081() {
		checkIsSubtype("X<X|[void]>","void|(X<void|X>)");
	}
	@Test public void test_5082() {
		checkNotSubtype("X<X|[void]>","any|void");
	}
	@Test public void test_5083() {
		checkNotSubtype("X<X|[void]>","any|any");
	}
	@Test public void test_5084() {
		checkNotSubtype("X<X|[void]>","any|null");
	}
	@Test public void test_5085() {
		checkNotSubtype("X<X|[void]>","any|int");
	}
	@Test public void test_5086() {
		checkNotSubtype("X<X|[void]>","any|X<[X]>");
	}
	@Test public void test_5087() {
		checkNotSubtype("X<X|[void]>","any|[any]");
	}
	@Test public void test_5088() {
		checkNotSubtype("X<X|[void]>","any|(X<any|X>)");
	}
	@Test public void test_5089() {
		checkNotSubtype("X<X|[void]>","null|void");
	}
	@Test public void test_5090() {
		checkNotSubtype("X<X|[void]>","null|any");
	}
	@Test public void test_5091() {
		checkNotSubtype("X<X|[void]>","null|null");
	}
	@Test public void test_5092() {
		checkNotSubtype("X<X|[void]>","null|int");
	}
	@Test public void test_5093() {
		checkNotSubtype("X<X|[void]>","null|X<[X]>");
	}
	@Test public void test_5094() {
		checkNotSubtype("X<X|[void]>","null|[null]");
	}
	@Test public void test_5095() {
		checkNotSubtype("X<X|[void]>","null|(X<null|X>)");
	}
	@Test public void test_5096() {
		checkNotSubtype("X<X|[void]>","int|void");
	}
	@Test public void test_5097() {
		checkNotSubtype("X<X|[void]>","int|any");
	}
	@Test public void test_5098() {
		checkNotSubtype("X<X|[void]>","int|null");
	}
	@Test public void test_5099() {
		checkNotSubtype("X<X|[void]>","int|int");
	}
	@Test public void test_5100() {
		checkNotSubtype("X<X|[void]>","int|X<[X]>");
	}
	@Test public void test_5101() {
		checkNotSubtype("X<X|[void]>","int|[int]");
	}
	@Test public void test_5102() {
		checkNotSubtype("X<X|[void]>","int|(X<int|X>)");
	}
	@Test public void test_5103() {
		checkIsSubtype("X<X|[void]>","[void]|void");
	}
	@Test public void test_5104() {
		checkNotSubtype("X<X|[void]>","X<[X]>|void");
	}
	@Test public void test_5105() {
		checkIsSubtype("X<X|[void]>","X<X|[void]>");
	}
	@Test public void test_5106() {
		checkNotSubtype("X<X|[void]>","[any]|any");
	}
	@Test public void test_5107() {
		checkNotSubtype("X<X|[void]>","X<[X]>|any");
	}
	@Test public void test_5108() {
		checkNotSubtype("X<X|[void]>","X<X|[any]>");
	}
	@Test public void test_5109() {
		checkNotSubtype("X<X|[void]>","[null]|null");
	}
	@Test public void test_5110() {
		checkNotSubtype("X<X|[void]>","X<[X]>|null");
	}
	@Test public void test_5111() {
		checkNotSubtype("X<X|[void]>","X<X|[null]>");
	}
	@Test public void test_5112() {
		checkNotSubtype("X<X|[void]>","[int]|int");
	}
	@Test public void test_5113() {
		checkNotSubtype("X<X|[void]>","X<[X]>|int");
	}
	@Test public void test_5114() {
		checkNotSubtype("X<X|[void]>","X<X|[int]>");
	}
	@Test public void test_5115() {
		checkNotSubtype("X<X|[void]>","[X<[X]>]|X<[X]>");
	}
	@Test public void test_5116() {
		checkNotSubtype("X<X|[void]>","X<[X]>|Y<[Y]>");
	}
	@Test public void test_5117() {
		checkNotSubtype("X<X|[void]>","X<[X]>|[X<[X]>]");
	}
	@Test public void test_5118() {
		checkNotSubtype("X<X|[void]>","X<X|[Y<[Y]>]>");
	}
	@Test public void test_5119() {
		checkNotSubtype("X<X|[void]>","X<X|[[X]]>");
	}
	@Test public void test_5120() {
		checkNotSubtype("X<X|[void]>","X<[X]>|(Y<X<[X]>|Y>)");
	}
	@Test public void test_5121() {
		checkNotSubtype("X<X|[void]>","X<X|[Y<X|Y>]>");
	}
	@Test public void test_5122() {
		checkIsSubtype("X<X|[void]>","(X<X|void>)|void");
	}
	@Test public void test_5123() {
		checkIsSubtype("X<X|[void]>","X<X|(Y<Y|void>)>");
	}
	@Test public void test_5124() {
		checkNotSubtype("X<X|[void]>","(X<X|any>)|any");
	}
	@Test public void test_5125() {
		checkNotSubtype("X<X|[void]>","X<X|(Y<Y|any>)>");
	}
	@Test public void test_5126() {
		checkNotSubtype("X<X|[void]>","(X<X|null>)|null");
	}
	@Test public void test_5127() {
		checkNotSubtype("X<X|[void]>","X<X|(Y<Y|null>)>");
	}
	@Test public void test_5128() {
		checkNotSubtype("X<X|[void]>","(X<X|int>)|int");
	}
	@Test public void test_5129() {
		checkNotSubtype("X<X|[void]>","X<X|(Y<Y|int>)>");
	}
	@Test public void test_5130() {
		checkNotSubtype("X<X|[void]>","(X<X|Y<[Y]>>)|Y<[Y]>");
	}
	@Test public void test_5131() {
		checkNotSubtype("X<X|[void]>","X<X|(Y<Y|Z<[Z]>>)>");
	}
	@Test public void test_5132() {
		checkNotSubtype("X<X|[void]>","X<X|(Y<Y|[X]>)>");
	}
	@Test public void test_5133() {
		checkIsSubtype("X<X|[void]>","X<X|(Y<Y|(Z<X|Z>)>)>");
	}
	@Test public void test_5134() {
		checkIsSubtype("[any]|any","any");
	}
	@Test public void test_5135() {
		checkIsSubtype("[any]|any","null");
	}
	@Test public void test_5136() {
		checkIsSubtype("[any]|any","int");
	}
	@Test public void test_5137() {
		checkIsSubtype("[any]|any","X<[X]>");
	}
	@Test public void test_5138() {
		checkIsSubtype("[any]|any","[void]");
	}
	@Test public void test_5139() {
		checkIsSubtype("[any]|any","[any]");
	}
	@Test public void test_5140() {
		checkIsSubtype("[any]|any","[null]");
	}
	@Test public void test_5141() {
		checkIsSubtype("[any]|any","[int]");
	}
	@Test public void test_5142() {
		checkIsSubtype("[any]|any","[X<[X]>]");
	}
	@Test public void test_5143() {
		checkIsSubtype("[any]|any","X<X|void>");
	}
	@Test public void test_5144() {
		checkIsSubtype("[any]|any","X<X|any>");
	}
	@Test public void test_5145() {
		checkIsSubtype("[any]|any","X<X|null>");
	}
	@Test public void test_5146() {
		checkIsSubtype("[any]|any","X<X|int>");
	}
	@Test public void test_5147() {
		checkIsSubtype("[any]|any","X<X|Y<[Y]>>");
	}
	@Test public void test_5148() {
		checkIsSubtype("[any]|any","[[void]]");
	}
	@Test public void test_5149() {
		checkIsSubtype("[any]|any","[[any]]");
	}
	@Test public void test_5150() {
		checkIsSubtype("[any]|any","[[null]]");
	}
	@Test public void test_5151() {
		checkIsSubtype("[any]|any","[[int]]");
	}
	@Test public void test_5152() {
		checkIsSubtype("[any]|any","[[X<[X]>]]");
	}
	@Test public void test_5153() {
		checkIsSubtype("[any]|any","X<[[[X]]]>");
	}
	@Test public void test_5154() {
		checkIsSubtype("[any]|any","X<[[Y<X|Y>]]>");
	}
	@Test public void test_5155() {
		checkIsSubtype("[any]|any","[X<X|void>]");
	}
	@Test public void test_5156() {
		checkIsSubtype("[any]|any","[X<X|any>]");
	}
	@Test public void test_5157() {
		checkIsSubtype("[any]|any","[X<X|null>]");
	}
	@Test public void test_5158() {
		checkIsSubtype("[any]|any","[X<X|int>]");
	}
	@Test public void test_5159() {
		checkIsSubtype("[any]|any","[X<X|Y<[Y]>>]");
	}
	@Test public void test_5160() {
		checkIsSubtype("[any]|any","X<[Y<Y|[X]>]>");
	}
	@Test public void test_5161() {
		checkIsSubtype("[any]|any","X<[Y<Y|(Z<X|Z>)>]>");
	}
	@Test public void test_5162() {
		checkIsSubtype("[any]|any","void|void");
	}
	@Test public void test_5163() {
		checkIsSubtype("[any]|any","void|any");
	}
	@Test public void test_5164() {
		checkIsSubtype("[any]|any","void|null");
	}
	@Test public void test_5165() {
		checkIsSubtype("[any]|any","void|int");
	}
	@Test public void test_5166() {
		checkIsSubtype("[any]|any","void|X<[X]>");
	}
	@Test public void test_5167() {
		checkIsSubtype("[any]|any","void|[void]");
	}
	@Test public void test_5168() {
		checkIsSubtype("[any]|any","void|(X<void|X>)");
	}
	@Test public void test_5169() {
		checkIsSubtype("[any]|any","any|void");
	}
	@Test public void test_5170() {
		checkIsSubtype("[any]|any","any|any");
	}
	@Test public void test_5171() {
		checkIsSubtype("[any]|any","any|null");
	}
	@Test public void test_5172() {
		checkIsSubtype("[any]|any","any|int");
	}
	@Test public void test_5173() {
		checkIsSubtype("[any]|any","any|X<[X]>");
	}
	@Test public void test_5174() {
		checkIsSubtype("[any]|any","any|[any]");
	}
	@Test public void test_5175() {
		checkIsSubtype("[any]|any","any|(X<any|X>)");
	}
	@Test public void test_5176() {
		checkIsSubtype("[any]|any","null|void");
	}
	@Test public void test_5177() {
		checkIsSubtype("[any]|any","null|any");
	}
	@Test public void test_5178() {
		checkIsSubtype("[any]|any","null|null");
	}
	@Test public void test_5179() {
		checkIsSubtype("[any]|any","null|int");
	}
	@Test public void test_5180() {
		checkIsSubtype("[any]|any","null|X<[X]>");
	}
	@Test public void test_5181() {
		checkIsSubtype("[any]|any","null|[null]");
	}
	@Test public void test_5182() {
		checkIsSubtype("[any]|any","null|(X<null|X>)");
	}
	@Test public void test_5183() {
		checkIsSubtype("[any]|any","int|void");
	}
	@Test public void test_5184() {
		checkIsSubtype("[any]|any","int|any");
	}
	@Test public void test_5185() {
		checkIsSubtype("[any]|any","int|null");
	}
	@Test public void test_5186() {
		checkIsSubtype("[any]|any","int|int");
	}
	@Test public void test_5187() {
		checkIsSubtype("[any]|any","int|X<[X]>");
	}
	@Test public void test_5188() {
		checkIsSubtype("[any]|any","int|[int]");
	}
	@Test public void test_5189() {
		checkIsSubtype("[any]|any","int|(X<int|X>)");
	}
	@Test public void test_5190() {
		checkIsSubtype("[any]|any","[void]|void");
	}
	@Test public void test_5191() {
		checkIsSubtype("[any]|any","X<[X]>|void");
	}
	@Test public void test_5192() {
		checkIsSubtype("[any]|any","X<X|[void]>");
	}
	@Test public void test_5193() {
		checkIsSubtype("[any]|any","[any]|any");
	}
	@Test public void test_5194() {
		checkIsSubtype("[any]|any","X<[X]>|any");
	}
	@Test public void test_5195() {
		checkIsSubtype("[any]|any","X<X|[any]>");
	}
	@Test public void test_5196() {
		checkIsSubtype("[any]|any","[null]|null");
	}
	@Test public void test_5197() {
		checkIsSubtype("[any]|any","X<[X]>|null");
	}
	@Test public void test_5198() {
		checkIsSubtype("[any]|any","X<X|[null]>");
	}
	@Test public void test_5199() {
		checkIsSubtype("[any]|any","[int]|int");
	}
	@Test public void test_5200() {
		checkIsSubtype("[any]|any","X<[X]>|int");
	}
	@Test public void test_5201() {
		checkIsSubtype("[any]|any","X<X|[int]>");
	}
	@Test public void test_5202() {
		checkIsSubtype("[any]|any","[X<[X]>]|X<[X]>");
	}
	@Test public void test_5203() {
		checkIsSubtype("[any]|any","X<[X]>|Y<[Y]>");
	}
	@Test public void test_5204() {
		checkIsSubtype("[any]|any","X<[X]>|[X<[X]>]");
	}
	@Test public void test_5205() {
		checkIsSubtype("[any]|any","X<X|[Y<[Y]>]>");
	}
	@Test public void test_5206() {
		checkIsSubtype("[any]|any","X<X|[[X]]>");
	}
	@Test public void test_5207() {
		checkIsSubtype("[any]|any","X<[X]>|(Y<X<[X]>|Y>)");
	}
	@Test public void test_5208() {
		checkIsSubtype("[any]|any","X<X|[Y<X|Y>]>");
	}
	@Test public void test_5209() {
		checkIsSubtype("[any]|any","(X<X|void>)|void");
	}
	@Test public void test_5210() {
		checkIsSubtype("[any]|any","X<X|(Y<Y|void>)>");
	}
	@Test public void test_5211() {
		checkIsSubtype("[any]|any","(X<X|any>)|any");
	}
	@Test public void test_5212() {
		checkIsSubtype("[any]|any","X<X|(Y<Y|any>)>");
	}
	@Test public void test_5213() {
		checkIsSubtype("[any]|any","(X<X|null>)|null");
	}
	@Test public void test_5214() {
		checkIsSubtype("[any]|any","X<X|(Y<Y|null>)>");
	}
	@Test public void test_5215() {
		checkIsSubtype("[any]|any","(X<X|int>)|int");
	}
	@Test public void test_5216() {
		checkIsSubtype("[any]|any","X<X|(Y<Y|int>)>");
	}
	@Test public void test_5217() {
		checkIsSubtype("[any]|any","(X<X|Y<[Y]>>)|Y<[Y]>");
	}
	@Test public void test_5218() {
		checkIsSubtype("[any]|any","X<X|(Y<Y|Z<[Z]>>)>");
	}
	@Test public void test_5219() {
		checkIsSubtype("[any]|any","X<X|(Y<Y|[X]>)>");
	}
	@Test public void test_5220() {
		checkIsSubtype("[any]|any","X<X|(Y<Y|(Z<X|Z>)>)>");
	}
	@Test public void test_5221() {
		checkIsSubtype("X<[X]>|any","any");
	}
	@Test public void test_5222() {
		checkIsSubtype("X<[X]>|any","null");
	}
	@Test public void test_5223() {
		checkIsSubtype("X<[X]>|any","int");
	}
	@Test public void test_5224() {
		checkIsSubtype("X<[X]>|any","X<[X]>");
	}
	@Test public void test_5225() {
		checkIsSubtype("X<[X]>|any","[void]");
	}
	@Test public void test_5226() {
		checkIsSubtype("X<[X]>|any","[any]");
	}
	@Test public void test_5227() {
		checkIsSubtype("X<[X]>|any","[null]");
	}
	@Test public void test_5228() {
		checkIsSubtype("X<[X]>|any","[int]");
	}
	@Test public void test_5229() {
		checkIsSubtype("X<[X]>|any","[X<[X]>]");
	}
	@Test public void test_5230() {
		checkIsSubtype("X<[X]>|any","X<X|void>");
	}
	@Test public void test_5231() {
		checkIsSubtype("X<[X]>|any","X<X|any>");
	}
	@Test public void test_5232() {
		checkIsSubtype("X<[X]>|any","X<X|null>");
	}
	@Test public void test_5233() {
		checkIsSubtype("X<[X]>|any","X<X|int>");
	}
	@Test public void test_5234() {
		checkIsSubtype("X<[X]>|any","X<X|Y<[Y]>>");
	}
	@Test public void test_5235() {
		checkIsSubtype("X<[X]>|any","[[void]]");
	}
	@Test public void test_5236() {
		checkIsSubtype("X<[X]>|any","[[any]]");
	}
	@Test public void test_5237() {
		checkIsSubtype("X<[X]>|any","[[null]]");
	}
	@Test public void test_5238() {
		checkIsSubtype("X<[X]>|any","[[int]]");
	}
	@Test public void test_5239() {
		checkIsSubtype("X<[X]>|any","[[X<[X]>]]");
	}
	@Test public void test_5240() {
		checkIsSubtype("X<[X]>|any","X<[[[X]]]>");
	}
	@Test public void test_5241() {
		checkIsSubtype("X<[X]>|any","X<[[Y<X|Y>]]>");
	}
	@Test public void test_5242() {
		checkIsSubtype("X<[X]>|any","[X<X|void>]");
	}
	@Test public void test_5243() {
		checkIsSubtype("X<[X]>|any","[X<X|any>]");
	}
	@Test public void test_5244() {
		checkIsSubtype("X<[X]>|any","[X<X|null>]");
	}
	@Test public void test_5245() {
		checkIsSubtype("X<[X]>|any","[X<X|int>]");
	}
	@Test public void test_5246() {
		checkIsSubtype("X<[X]>|any","[X<X|Y<[Y]>>]");
	}
	@Test public void test_5247() {
		checkIsSubtype("X<[X]>|any","X<[Y<Y|[X]>]>");
	}
	@Test public void test_5248() {
		checkIsSubtype("X<[X]>|any","X<[Y<Y|(Z<X|Z>)>]>");
	}
	@Test public void test_5249() {
		checkIsSubtype("X<[X]>|any","void|void");
	}
	@Test public void test_5250() {
		checkIsSubtype("X<[X]>|any","void|any");
	}
	@Test public void test_5251() {
		checkIsSubtype("X<[X]>|any","void|null");
	}
	@Test public void test_5252() {
		checkIsSubtype("X<[X]>|any","void|int");
	}
	@Test public void test_5253() {
		checkIsSubtype("X<[X]>|any","void|X<[X]>");
	}
	@Test public void test_5254() {
		checkIsSubtype("X<[X]>|any","void|[void]");
	}
	@Test public void test_5255() {
		checkIsSubtype("X<[X]>|any","void|(X<void|X>)");
	}
	@Test public void test_5256() {
		checkIsSubtype("X<[X]>|any","any|void");
	}
	@Test public void test_5257() {
		checkIsSubtype("X<[X]>|any","any|any");
	}
	@Test public void test_5258() {
		checkIsSubtype("X<[X]>|any","any|null");
	}
	@Test public void test_5259() {
		checkIsSubtype("X<[X]>|any","any|int");
	}
	@Test public void test_5260() {
		checkIsSubtype("X<[X]>|any","any|X<[X]>");
	}
	@Test public void test_5261() {
		checkIsSubtype("X<[X]>|any","any|[any]");
	}
	@Test public void test_5262() {
		checkIsSubtype("X<[X]>|any","any|(X<any|X>)");
	}
	@Test public void test_5263() {
		checkIsSubtype("X<[X]>|any","null|void");
	}
	@Test public void test_5264() {
		checkIsSubtype("X<[X]>|any","null|any");
	}
	@Test public void test_5265() {
		checkIsSubtype("X<[X]>|any","null|null");
	}
	@Test public void test_5266() {
		checkIsSubtype("X<[X]>|any","null|int");
	}
	@Test public void test_5267() {
		checkIsSubtype("X<[X]>|any","null|X<[X]>");
	}
	@Test public void test_5268() {
		checkIsSubtype("X<[X]>|any","null|[null]");
	}
	@Test public void test_5269() {
		checkIsSubtype("X<[X]>|any","null|(X<null|X>)");
	}
	@Test public void test_5270() {
		checkIsSubtype("X<[X]>|any","int|void");
	}
	@Test public void test_5271() {
		checkIsSubtype("X<[X]>|any","int|any");
	}
	@Test public void test_5272() {
		checkIsSubtype("X<[X]>|any","int|null");
	}
	@Test public void test_5273() {
		checkIsSubtype("X<[X]>|any","int|int");
	}
	@Test public void test_5274() {
		checkIsSubtype("X<[X]>|any","int|X<[X]>");
	}
	@Test public void test_5275() {
		checkIsSubtype("X<[X]>|any","int|[int]");
	}
	@Test public void test_5276() {
		checkIsSubtype("X<[X]>|any","int|(X<int|X>)");
	}
	@Test public void test_5277() {
		checkIsSubtype("X<[X]>|any","[void]|void");
	}
	@Test public void test_5278() {
		checkIsSubtype("X<[X]>|any","X<[X]>|void");
	}
	@Test public void test_5279() {
		checkIsSubtype("X<[X]>|any","X<X|[void]>");
	}
	@Test public void test_5280() {
		checkIsSubtype("X<[X]>|any","[any]|any");
	}
	@Test public void test_5281() {
		checkIsSubtype("X<[X]>|any","X<[X]>|any");
	}
	@Test public void test_5282() {
		checkIsSubtype("X<[X]>|any","X<X|[any]>");
	}
	@Test public void test_5283() {
		checkIsSubtype("X<[X]>|any","[null]|null");
	}
	@Test public void test_5284() {
		checkIsSubtype("X<[X]>|any","X<[X]>|null");
	}
	@Test public void test_5285() {
		checkIsSubtype("X<[X]>|any","X<X|[null]>");
	}
	@Test public void test_5286() {
		checkIsSubtype("X<[X]>|any","[int]|int");
	}
	@Test public void test_5287() {
		checkIsSubtype("X<[X]>|any","X<[X]>|int");
	}
	@Test public void test_5288() {
		checkIsSubtype("X<[X]>|any","X<X|[int]>");
	}
	@Test public void test_5289() {
		checkIsSubtype("X<[X]>|any","[X<[X]>]|X<[X]>");
	}
	@Test public void test_5290() {
		checkIsSubtype("X<[X]>|any","X<[X]>|Y<[Y]>");
	}
	@Test public void test_5291() {
		checkIsSubtype("X<[X]>|any","X<[X]>|[X<[X]>]");
	}
	@Test public void test_5292() {
		checkIsSubtype("X<[X]>|any","X<X|[Y<[Y]>]>");
	}
	@Test public void test_5293() {
		checkIsSubtype("X<[X]>|any","X<X|[[X]]>");
	}
	@Test public void test_5294() {
		checkIsSubtype("X<[X]>|any","X<[X]>|(Y<X<[X]>|Y>)");
	}
	@Test public void test_5295() {
		checkIsSubtype("X<[X]>|any","X<X|[Y<X|Y>]>");
	}
	@Test public void test_5296() {
		checkIsSubtype("X<[X]>|any","(X<X|void>)|void");
	}
	@Test public void test_5297() {
		checkIsSubtype("X<[X]>|any","X<X|(Y<Y|void>)>");
	}
	@Test public void test_5298() {
		checkIsSubtype("X<[X]>|any","(X<X|any>)|any");
	}
	@Test public void test_5299() {
		checkIsSubtype("X<[X]>|any","X<X|(Y<Y|any>)>");
	}
	@Test public void test_5300() {
		checkIsSubtype("X<[X]>|any","(X<X|null>)|null");
	}
	@Test public void test_5301() {
		checkIsSubtype("X<[X]>|any","X<X|(Y<Y|null>)>");
	}
	@Test public void test_5302() {
		checkIsSubtype("X<[X]>|any","(X<X|int>)|int");
	}
	@Test public void test_5303() {
		checkIsSubtype("X<[X]>|any","X<X|(Y<Y|int>)>");
	}
	@Test public void test_5304() {
		checkIsSubtype("X<[X]>|any","(X<X|Y<[Y]>>)|Y<[Y]>");
	}
	@Test public void test_5305() {
		checkIsSubtype("X<[X]>|any","X<X|(Y<Y|Z<[Z]>>)>");
	}
	@Test public void test_5306() {
		checkIsSubtype("X<[X]>|any","X<X|(Y<Y|[X]>)>");
	}
	@Test public void test_5307() {
		checkIsSubtype("X<[X]>|any","X<X|(Y<Y|(Z<X|Z>)>)>");
	}
	@Test public void test_5308() {
		checkNotSubtype("X<X|[any]>","any");
	}
	@Test public void test_5309() {
		checkNotSubtype("X<X|[any]>","null");
	}
	@Test public void test_5310() {
		checkNotSubtype("X<X|[any]>","int");
	}
	@Test public void test_5311() {
		checkIsSubtype("X<X|[any]>","X<[X]>");
	}
	@Test public void test_5312() {
		checkIsSubtype("X<X|[any]>","[void]");
	}
	@Test public void test_5313() {
		checkIsSubtype("X<X|[any]>","[any]");
	}
	@Test public void test_5314() {
		checkIsSubtype("X<X|[any]>","[null]");
	}
	@Test public void test_5315() {
		checkIsSubtype("X<X|[any]>","[int]");
	}
	@Test public void test_5316() {
		checkIsSubtype("X<X|[any]>","[X<[X]>]");
	}
	@Test public void test_5317() {
		checkIsSubtype("X<X|[any]>","X<X|void>");
	}
	@Test public void test_5318() {
		checkNotSubtype("X<X|[any]>","X<X|any>");
	}
	@Test public void test_5319() {
		checkNotSubtype("X<X|[any]>","X<X|null>");
	}
	@Test public void test_5320() {
		checkNotSubtype("X<X|[any]>","X<X|int>");
	}
	@Test public void test_5321() {
		checkIsSubtype("X<X|[any]>","X<X|Y<[Y]>>");
	}
	@Test public void test_5322() {
		checkIsSubtype("X<X|[any]>","[[void]]");
	}
	@Test public void test_5323() {
		checkIsSubtype("X<X|[any]>","[[any]]");
	}
	@Test public void test_5324() {
		checkIsSubtype("X<X|[any]>","[[null]]");
	}
	@Test public void test_5325() {
		checkIsSubtype("X<X|[any]>","[[int]]");
	}
	@Test public void test_5326() {
		checkIsSubtype("X<X|[any]>","[[X<[X]>]]");
	}
	@Test public void test_5327() {
		checkIsSubtype("X<X|[any]>","X<[[[X]]]>");
	}
	@Test public void test_5328() {
		checkIsSubtype("X<X|[any]>","X<[[Y<X|Y>]]>");
	}
	@Test public void test_5329() {
		checkIsSubtype("X<X|[any]>","[X<X|void>]");
	}
	@Test public void test_5330() {
		checkIsSubtype("X<X|[any]>","[X<X|any>]");
	}
	@Test public void test_5331() {
		checkIsSubtype("X<X|[any]>","[X<X|null>]");
	}
	@Test public void test_5332() {
		checkIsSubtype("X<X|[any]>","[X<X|int>]");
	}
	@Test public void test_5333() {
		checkIsSubtype("X<X|[any]>","[X<X|Y<[Y]>>]");
	}
	@Test public void test_5334() {
		checkIsSubtype("X<X|[any]>","X<[Y<Y|[X]>]>");
	}
	@Test public void test_5335() {
		checkIsSubtype("X<X|[any]>","X<[Y<Y|(Z<X|Z>)>]>");
	}
	@Test public void test_5336() {
		checkIsSubtype("X<X|[any]>","void|void");
	}
	@Test public void test_5337() {
		checkNotSubtype("X<X|[any]>","void|any");
	}
	@Test public void test_5338() {
		checkNotSubtype("X<X|[any]>","void|null");
	}
	@Test public void test_5339() {
		checkNotSubtype("X<X|[any]>","void|int");
	}
	@Test public void test_5340() {
		checkIsSubtype("X<X|[any]>","void|X<[X]>");
	}
	@Test public void test_5341() {
		checkIsSubtype("X<X|[any]>","void|[void]");
	}
	@Test public void test_5342() {
		checkIsSubtype("X<X|[any]>","void|(X<void|X>)");
	}
	@Test public void test_5343() {
		checkNotSubtype("X<X|[any]>","any|void");
	}
	@Test public void test_5344() {
		checkNotSubtype("X<X|[any]>","any|any");
	}
	@Test public void test_5345() {
		checkNotSubtype("X<X|[any]>","any|null");
	}
	@Test public void test_5346() {
		checkNotSubtype("X<X|[any]>","any|int");
	}
	@Test public void test_5347() {
		checkNotSubtype("X<X|[any]>","any|X<[X]>");
	}
	@Test public void test_5348() {
		checkNotSubtype("X<X|[any]>","any|[any]");
	}
	@Test public void test_5349() {
		checkNotSubtype("X<X|[any]>","any|(X<any|X>)");
	}
	@Test public void test_5350() {
		checkNotSubtype("X<X|[any]>","null|void");
	}
	@Test public void test_5351() {
		checkNotSubtype("X<X|[any]>","null|any");
	}
	@Test public void test_5352() {
		checkNotSubtype("X<X|[any]>","null|null");
	}
	@Test public void test_5353() {
		checkNotSubtype("X<X|[any]>","null|int");
	}
	@Test public void test_5354() {
		checkNotSubtype("X<X|[any]>","null|X<[X]>");
	}
	@Test public void test_5355() {
		checkNotSubtype("X<X|[any]>","null|[null]");
	}
	@Test public void test_5356() {
		checkNotSubtype("X<X|[any]>","null|(X<null|X>)");
	}
	@Test public void test_5357() {
		checkNotSubtype("X<X|[any]>","int|void");
	}
	@Test public void test_5358() {
		checkNotSubtype("X<X|[any]>","int|any");
	}
	@Test public void test_5359() {
		checkNotSubtype("X<X|[any]>","int|null");
	}
	@Test public void test_5360() {
		checkNotSubtype("X<X|[any]>","int|int");
	}
	@Test public void test_5361() {
		checkNotSubtype("X<X|[any]>","int|X<[X]>");
	}
	@Test public void test_5362() {
		checkNotSubtype("X<X|[any]>","int|[int]");
	}
	@Test public void test_5363() {
		checkNotSubtype("X<X|[any]>","int|(X<int|X>)");
	}
	@Test public void test_5364() {
		checkIsSubtype("X<X|[any]>","[void]|void");
	}
	@Test public void test_5365() {
		checkIsSubtype("X<X|[any]>","X<[X]>|void");
	}
	@Test public void test_5366() {
		checkIsSubtype("X<X|[any]>","X<X|[void]>");
	}
	@Test public void test_5367() {
		checkNotSubtype("X<X|[any]>","[any]|any");
	}
	@Test public void test_5368() {
		checkNotSubtype("X<X|[any]>","X<[X]>|any");
	}
	@Test public void test_5369() {
		checkIsSubtype("X<X|[any]>","X<X|[any]>");
	}
	@Test public void test_5370() {
		checkNotSubtype("X<X|[any]>","[null]|null");
	}
	@Test public void test_5371() {
		checkNotSubtype("X<X|[any]>","X<[X]>|null");
	}
	@Test public void test_5372() {
		checkIsSubtype("X<X|[any]>","X<X|[null]>");
	}
	@Test public void test_5373() {
		checkNotSubtype("X<X|[any]>","[int]|int");
	}
	@Test public void test_5374() {
		checkNotSubtype("X<X|[any]>","X<[X]>|int");
	}
	@Test public void test_5375() {
		checkIsSubtype("X<X|[any]>","X<X|[int]>");
	}
	@Test public void test_5376() {
		checkIsSubtype("X<X|[any]>","[X<[X]>]|X<[X]>");
	}
	@Test public void test_5377() {
		checkIsSubtype("X<X|[any]>","X<[X]>|Y<[Y]>");
	}
	@Test public void test_5378() {
		checkIsSubtype("X<X|[any]>","X<[X]>|[X<[X]>]");
	}
	@Test public void test_5379() {
		checkIsSubtype("X<X|[any]>","X<X|[Y<[Y]>]>");
	}
	@Test public void test_5380() {
		checkIsSubtype("X<X|[any]>","X<X|[[X]]>");
	}
	@Test public void test_5381() {
		checkIsSubtype("X<X|[any]>","X<[X]>|(Y<X<[X]>|Y>)");
	}
	@Test public void test_5382() {
		checkIsSubtype("X<X|[any]>","X<X|[Y<X|Y>]>");
	}
	@Test public void test_5383() {
		checkIsSubtype("X<X|[any]>","(X<X|void>)|void");
	}
	@Test public void test_5384() {
		checkIsSubtype("X<X|[any]>","X<X|(Y<Y|void>)>");
	}
	@Test public void test_5385() {
		checkNotSubtype("X<X|[any]>","(X<X|any>)|any");
	}
	@Test public void test_5386() {
		checkNotSubtype("X<X|[any]>","X<X|(Y<Y|any>)>");
	}
	@Test public void test_5387() {
		checkNotSubtype("X<X|[any]>","(X<X|null>)|null");
	}
	@Test public void test_5388() {
		checkNotSubtype("X<X|[any]>","X<X|(Y<Y|null>)>");
	}
	@Test public void test_5389() {
		checkNotSubtype("X<X|[any]>","(X<X|int>)|int");
	}
	@Test public void test_5390() {
		checkNotSubtype("X<X|[any]>","X<X|(Y<Y|int>)>");
	}
	@Test public void test_5391() {
		checkIsSubtype("X<X|[any]>","(X<X|Y<[Y]>>)|Y<[Y]>");
	}
	@Test public void test_5392() {
		checkIsSubtype("X<X|[any]>","X<X|(Y<Y|Z<[Z]>>)>");
	}
	@Test public void test_5393() {
		checkIsSubtype("X<X|[any]>","X<X|(Y<Y|[X]>)>");
	}
	@Test public void test_5394() {
		checkIsSubtype("X<X|[any]>","X<X|(Y<Y|(Z<X|Z>)>)>");
	}
	@Test public void test_5395() {
		checkNotSubtype("[null]|null","any");
	}
	@Test public void test_5396() {
		checkIsSubtype("[null]|null","null");
	}
	@Test public void test_5397() {
		checkNotSubtype("[null]|null","int");
	}
	@Test public void test_5398() {
		checkNotSubtype("[null]|null","X<[X]>");
	}
	@Test public void test_5399() {
		checkIsSubtype("[null]|null","[void]");
	}
	@Test public void test_5400() {
		checkNotSubtype("[null]|null","[any]");
	}
	@Test public void test_5401() {
		checkIsSubtype("[null]|null","[null]");
	}
	@Test public void test_5402() {
		checkNotSubtype("[null]|null","[int]");
	}
	@Test public void test_5403() {
		checkNotSubtype("[null]|null","[X<[X]>]");
	}
	@Test public void test_5404() {
		checkIsSubtype("[null]|null","X<X|void>");
	}
	@Test public void test_5405() {
		checkNotSubtype("[null]|null","X<X|any>");
	}
	@Test public void test_5406() {
		checkIsSubtype("[null]|null","X<X|null>");
	}
	@Test public void test_5407() {
		checkNotSubtype("[null]|null","X<X|int>");
	}
	@Test public void test_5408() {
		checkNotSubtype("[null]|null","X<X|Y<[Y]>>");
	}
	@Test public void test_5409() {
		checkNotSubtype("[null]|null","[[void]]");
	}
	@Test public void test_5410() {
		checkNotSubtype("[null]|null","[[any]]");
	}
	@Test public void test_5411() {
		checkNotSubtype("[null]|null","[[null]]");
	}
	@Test public void test_5412() {
		checkNotSubtype("[null]|null","[[int]]");
	}
	@Test public void test_5413() {
		checkNotSubtype("[null]|null","[[X<[X]>]]");
	}
	@Test public void test_5414() {
		checkNotSubtype("[null]|null","X<[[[X]]]>");
	}
	@Test public void test_5415() {
		checkNotSubtype("[null]|null","X<[[Y<X|Y>]]>");
	}
	@Test public void test_5416() {
		checkIsSubtype("[null]|null","[X<X|void>]");
	}
	@Test public void test_5417() {
		checkNotSubtype("[null]|null","[X<X|any>]");
	}
	@Test public void test_5418() {
		checkIsSubtype("[null]|null","[X<X|null>]");
	}
	@Test public void test_5419() {
		checkNotSubtype("[null]|null","[X<X|int>]");
	}
	@Test public void test_5420() {
		checkNotSubtype("[null]|null","[X<X|Y<[Y]>>]");
	}
	@Test public void test_5421() {
		checkNotSubtype("[null]|null","X<[Y<Y|[X]>]>");
	}
	@Test public void test_5422() {
		checkNotSubtype("[null]|null","X<[Y<Y|(Z<X|Z>)>]>");
	}
	@Test public void test_5423() {
		checkIsSubtype("[null]|null","void|void");
	}
	@Test public void test_5424() {
		checkNotSubtype("[null]|null","void|any");
	}
	@Test public void test_5425() {
		checkIsSubtype("[null]|null","void|null");
	}
	@Test public void test_5426() {
		checkNotSubtype("[null]|null","void|int");
	}
	@Test public void test_5427() {
		checkNotSubtype("[null]|null","void|X<[X]>");
	}
	@Test public void test_5428() {
		checkIsSubtype("[null]|null","void|[void]");
	}
	@Test public void test_5429() {
		checkIsSubtype("[null]|null","void|(X<void|X>)");
	}
	@Test public void test_5430() {
		checkNotSubtype("[null]|null","any|void");
	}
	@Test public void test_5431() {
		checkNotSubtype("[null]|null","any|any");
	}
	@Test public void test_5432() {
		checkNotSubtype("[null]|null","any|null");
	}
	@Test public void test_5433() {
		checkNotSubtype("[null]|null","any|int");
	}
	@Test public void test_5434() {
		checkNotSubtype("[null]|null","any|X<[X]>");
	}
	@Test public void test_5435() {
		checkNotSubtype("[null]|null","any|[any]");
	}
	@Test public void test_5436() {
		checkNotSubtype("[null]|null","any|(X<any|X>)");
	}
	@Test public void test_5437() {
		checkIsSubtype("[null]|null","null|void");
	}
	@Test public void test_5438() {
		checkNotSubtype("[null]|null","null|any");
	}
	@Test public void test_5439() {
		checkIsSubtype("[null]|null","null|null");
	}
	@Test public void test_5440() {
		checkNotSubtype("[null]|null","null|int");
	}
	@Test public void test_5441() {
		checkNotSubtype("[null]|null","null|X<[X]>");
	}
	@Test public void test_5442() {
		checkIsSubtype("[null]|null","null|[null]");
	}
	@Test public void test_5443() {
		checkIsSubtype("[null]|null","null|(X<null|X>)");
	}
	@Test public void test_5444() {
		checkNotSubtype("[null]|null","int|void");
	}
	@Test public void test_5445() {
		checkNotSubtype("[null]|null","int|any");
	}
	@Test public void test_5446() {
		checkNotSubtype("[null]|null","int|null");
	}
	@Test public void test_5447() {
		checkNotSubtype("[null]|null","int|int");
	}
	@Test public void test_5448() {
		checkNotSubtype("[null]|null","int|X<[X]>");
	}
	@Test public void test_5449() {
		checkNotSubtype("[null]|null","int|[int]");
	}
	@Test public void test_5450() {
		checkNotSubtype("[null]|null","int|(X<int|X>)");
	}
	@Test public void test_5451() {
		checkIsSubtype("[null]|null","[void]|void");
	}
	@Test public void test_5452() {
		checkNotSubtype("[null]|null","X<[X]>|void");
	}
	@Test public void test_5453() {
		checkIsSubtype("[null]|null","X<X|[void]>");
	}
	@Test public void test_5454() {
		checkNotSubtype("[null]|null","[any]|any");
	}
	@Test public void test_5455() {
		checkNotSubtype("[null]|null","X<[X]>|any");
	}
	@Test public void test_5456() {
		checkNotSubtype("[null]|null","X<X|[any]>");
	}
	@Test public void test_5457() {
		checkIsSubtype("[null]|null","[null]|null");
	}
	@Test public void test_5458() {
		checkNotSubtype("[null]|null","X<[X]>|null");
	}
	@Test public void test_5459() {
		checkIsSubtype("[null]|null","X<X|[null]>");
	}
	@Test public void test_5460() {
		checkNotSubtype("[null]|null","[int]|int");
	}
	@Test public void test_5461() {
		checkNotSubtype("[null]|null","X<[X]>|int");
	}
	@Test public void test_5462() {
		checkNotSubtype("[null]|null","X<X|[int]>");
	}
	@Test public void test_5463() {
		checkNotSubtype("[null]|null","[X<[X]>]|X<[X]>");
	}
	@Test public void test_5464() {
		checkNotSubtype("[null]|null","X<[X]>|Y<[Y]>");
	}
	@Test public void test_5465() {
		checkNotSubtype("[null]|null","X<[X]>|[X<[X]>]");
	}
	@Test public void test_5466() {
		checkNotSubtype("[null]|null","X<X|[Y<[Y]>]>");
	}
	@Test public void test_5467() {
		checkNotSubtype("[null]|null","X<X|[[X]]>");
	}
	@Test public void test_5468() {
		checkNotSubtype("[null]|null","X<[X]>|(Y<X<[X]>|Y>)");
	}
	@Test public void test_5469() {
		checkNotSubtype("[null]|null","X<X|[Y<X|Y>]>");
	}
	@Test public void test_5470() {
		checkIsSubtype("[null]|null","(X<X|void>)|void");
	}
	@Test public void test_5471() {
		checkIsSubtype("[null]|null","X<X|(Y<Y|void>)>");
	}
	@Test public void test_5472() {
		checkNotSubtype("[null]|null","(X<X|any>)|any");
	}
	@Test public void test_5473() {
		checkNotSubtype("[null]|null","X<X|(Y<Y|any>)>");
	}
	@Test public void test_5474() {
		checkIsSubtype("[null]|null","(X<X|null>)|null");
	}
	@Test public void test_5475() {
		checkIsSubtype("[null]|null","X<X|(Y<Y|null>)>");
	}
	@Test public void test_5476() {
		checkNotSubtype("[null]|null","(X<X|int>)|int");
	}
	@Test public void test_5477() {
		checkNotSubtype("[null]|null","X<X|(Y<Y|int>)>");
	}
	@Test public void test_5478() {
		checkNotSubtype("[null]|null","(X<X|Y<[Y]>>)|Y<[Y]>");
	}
	@Test public void test_5479() {
		checkNotSubtype("[null]|null","X<X|(Y<Y|Z<[Z]>>)>");
	}
	@Test public void test_5480() {
		checkNotSubtype("[null]|null","X<X|(Y<Y|[X]>)>");
	}
	@Test public void test_5481() {
		checkIsSubtype("[null]|null","X<X|(Y<Y|(Z<X|Z>)>)>");
	}
	@Test public void test_5482() {
		checkNotSubtype("X<[X]>|null","any");
	}
	@Test public void test_5483() {
		checkIsSubtype("X<[X]>|null","null");
	}
	@Test public void test_5484() {
		checkNotSubtype("X<[X]>|null","int");
	}
	@Test public void test_5485() {
		checkIsSubtype("X<[X]>|null","X<[X]>");
	}
	@Test public void test_5486() {
		checkIsSubtype("X<[X]>|null","[void]");
	}
	@Test public void test_5487() {
		checkNotSubtype("X<[X]>|null","[any]");
	}
	@Test public void test_5488() {
		checkNotSubtype("X<[X]>|null","[null]");
	}
	@Test public void test_5489() {
		checkNotSubtype("X<[X]>|null","[int]");
	}
	@Test public void test_5490() {
		checkIsSubtype("X<[X]>|null","[X<[X]>]");
	}
	@Test public void test_5491() {
		checkIsSubtype("X<[X]>|null","X<X|void>");
	}
	@Test public void test_5492() {
		checkNotSubtype("X<[X]>|null","X<X|any>");
	}
	@Test public void test_5493() {
		checkIsSubtype("X<[X]>|null","X<X|null>");
	}
	@Test public void test_5494() {
		checkNotSubtype("X<[X]>|null","X<X|int>");
	}
	@Test public void test_5495() {
		checkIsSubtype("X<[X]>|null","X<X|Y<[Y]>>");
	}
	@Test public void test_5496() {
		checkIsSubtype("X<[X]>|null","[[void]]");
	}
	@Test public void test_5497() {
		checkNotSubtype("X<[X]>|null","[[any]]");
	}
	@Test public void test_5498() {
		checkNotSubtype("X<[X]>|null","[[null]]");
	}
	@Test public void test_5499() {
		checkNotSubtype("X<[X]>|null","[[int]]");
	}
	@Test public void test_5500() {
		checkIsSubtype("X<[X]>|null","[[X<[X]>]]");
	}
	@Test public void test_5501() {
		checkIsSubtype("X<[X]>|null","X<[[[X]]]>");
	}
	@Test public void test_5502() {
		checkIsSubtype("X<[X]>|null","X<[[Y<X|Y>]]>");
	}
	@Test public void test_5503() {
		checkIsSubtype("X<[X]>|null","[X<X|void>]");
	}
	@Test public void test_5504() {
		checkNotSubtype("X<[X]>|null","[X<X|any>]");
	}
	@Test public void test_5505() {
		checkNotSubtype("X<[X]>|null","[X<X|null>]");
	}
	@Test public void test_5506() {
		checkNotSubtype("X<[X]>|null","[X<X|int>]");
	}
	@Test public void test_5507() {
		checkIsSubtype("X<[X]>|null","[X<X|Y<[Y]>>]");
	}
	@Test public void test_5508() {
		checkIsSubtype("X<[X]>|null","X<[Y<Y|[X]>]>");
	}
	@Test public void test_5509() {
		checkIsSubtype("X<[X]>|null","X<[Y<Y|(Z<X|Z>)>]>");
	}
	@Test public void test_5510() {
		checkIsSubtype("X<[X]>|null","void|void");
	}
	@Test public void test_5511() {
		checkNotSubtype("X<[X]>|null","void|any");
	}
	@Test public void test_5512() {
		checkIsSubtype("X<[X]>|null","void|null");
	}
	@Test public void test_5513() {
		checkNotSubtype("X<[X]>|null","void|int");
	}
	@Test public void test_5514() {
		checkIsSubtype("X<[X]>|null","void|X<[X]>");
	}
	@Test public void test_5515() {
		checkIsSubtype("X<[X]>|null","void|[void]");
	}
	@Test public void test_5516() {
		checkIsSubtype("X<[X]>|null","void|(X<void|X>)");
	}
	@Test public void test_5517() {
		checkNotSubtype("X<[X]>|null","any|void");
	}
	@Test public void test_5518() {
		checkNotSubtype("X<[X]>|null","any|any");
	}
	@Test public void test_5519() {
		checkNotSubtype("X<[X]>|null","any|null");
	}
	@Test public void test_5520() {
		checkNotSubtype("X<[X]>|null","any|int");
	}
	@Test public void test_5521() {
		checkNotSubtype("X<[X]>|null","any|X<[X]>");
	}
	@Test public void test_5522() {
		checkNotSubtype("X<[X]>|null","any|[any]");
	}
	@Test public void test_5523() {
		checkNotSubtype("X<[X]>|null","any|(X<any|X>)");
	}
	@Test public void test_5524() {
		checkIsSubtype("X<[X]>|null","null|void");
	}
	@Test public void test_5525() {
		checkNotSubtype("X<[X]>|null","null|any");
	}
	@Test public void test_5526() {
		checkIsSubtype("X<[X]>|null","null|null");
	}
	@Test public void test_5527() {
		checkNotSubtype("X<[X]>|null","null|int");
	}
	@Test public void test_5528() {
		checkIsSubtype("X<[X]>|null","null|X<[X]>");
	}
	@Test public void test_5529() {
		checkNotSubtype("X<[X]>|null","null|[null]");
	}
	@Test public void test_5530() {
		checkIsSubtype("X<[X]>|null","null|(X<null|X>)");
	}
	@Test public void test_5531() {
		checkNotSubtype("X<[X]>|null","int|void");
	}
	@Test public void test_5532() {
		checkNotSubtype("X<[X]>|null","int|any");
	}
	@Test public void test_5533() {
		checkNotSubtype("X<[X]>|null","int|null");
	}
	@Test public void test_5534() {
		checkNotSubtype("X<[X]>|null","int|int");
	}
	@Test public void test_5535() {
		checkNotSubtype("X<[X]>|null","int|X<[X]>");
	}
	@Test public void test_5536() {
		checkNotSubtype("X<[X]>|null","int|[int]");
	}
	@Test public void test_5537() {
		checkNotSubtype("X<[X]>|null","int|(X<int|X>)");
	}
	@Test public void test_5538() {
		checkIsSubtype("X<[X]>|null","[void]|void");
	}
	@Test public void test_5539() {
		checkIsSubtype("X<[X]>|null","X<[X]>|void");
	}
	@Test public void test_5540() {
		checkIsSubtype("X<[X]>|null","X<X|[void]>");
	}
	@Test public void test_5541() {
		checkNotSubtype("X<[X]>|null","[any]|any");
	}
	@Test public void test_5542() {
		checkNotSubtype("X<[X]>|null","X<[X]>|any");
	}
	@Test public void test_5543() {
		checkNotSubtype("X<[X]>|null","X<X|[any]>");
	}
	@Test public void test_5544() {
		checkNotSubtype("X<[X]>|null","[null]|null");
	}
	@Test public void test_5545() {
		checkIsSubtype("X<[X]>|null","X<[X]>|null");
	}
	@Test public void test_5546() {
		checkNotSubtype("X<[X]>|null","X<X|[null]>");
	}
	@Test public void test_5547() {
		checkNotSubtype("X<[X]>|null","[int]|int");
	}
	@Test public void test_5548() {
		checkNotSubtype("X<[X]>|null","X<[X]>|int");
	}
	@Test public void test_5549() {
		checkNotSubtype("X<[X]>|null","X<X|[int]>");
	}
	@Test public void test_5550() {
		checkIsSubtype("X<[X]>|null","[X<[X]>]|X<[X]>");
	}
	@Test public void test_5551() {
		checkIsSubtype("X<[X]>|null","X<[X]>|Y<[Y]>");
	}
	@Test public void test_5552() {
		checkIsSubtype("X<[X]>|null","X<[X]>|[X<[X]>]");
	}
	@Test public void test_5553() {
		checkIsSubtype("X<[X]>|null","X<X|[Y<[Y]>]>");
	}
	@Test public void test_5554() {
		checkIsSubtype("X<[X]>|null","X<X|[[X]]>");
	}
	@Test public void test_5555() {
		checkIsSubtype("X<[X]>|null","X<[X]>|(Y<X<[X]>|Y>)");
	}
	@Test public void test_5556() {
		checkIsSubtype("X<[X]>|null","X<X|[Y<X|Y>]>");
	}
	@Test public void test_5557() {
		checkIsSubtype("X<[X]>|null","(X<X|void>)|void");
	}
	@Test public void test_5558() {
		checkIsSubtype("X<[X]>|null","X<X|(Y<Y|void>)>");
	}
	@Test public void test_5559() {
		checkNotSubtype("X<[X]>|null","(X<X|any>)|any");
	}
	@Test public void test_5560() {
		checkNotSubtype("X<[X]>|null","X<X|(Y<Y|any>)>");
	}
	@Test public void test_5561() {
		checkIsSubtype("X<[X]>|null","(X<X|null>)|null");
	}
	@Test public void test_5562() {
		checkIsSubtype("X<[X]>|null","X<X|(Y<Y|null>)>");
	}
	@Test public void test_5563() {
		checkNotSubtype("X<[X]>|null","(X<X|int>)|int");
	}
	@Test public void test_5564() {
		checkNotSubtype("X<[X]>|null","X<X|(Y<Y|int>)>");
	}
	@Test public void test_5565() {
		checkIsSubtype("X<[X]>|null","(X<X|Y<[Y]>>)|Y<[Y]>");
	}
	@Test public void test_5566() {
		checkIsSubtype("X<[X]>|null","X<X|(Y<Y|Z<[Z]>>)>");
	}
	@Test public void test_5567() {
		checkIsSubtype("X<[X]>|null","X<X|(Y<Y|[X]>)>");
	}
	@Test public void test_5568() {
		checkIsSubtype("X<[X]>|null","X<X|(Y<Y|(Z<X|Z>)>)>");
	}
	@Test public void test_5569() {
		checkNotSubtype("X<X|[null]>","any");
	}
	@Test public void test_5570() {
		checkNotSubtype("X<X|[null]>","null");
	}
	@Test public void test_5571() {
		checkNotSubtype("X<X|[null]>","int");
	}
	@Test public void test_5572() {
		checkNotSubtype("X<X|[null]>","X<[X]>");
	}
	@Test public void test_5573() {
		checkIsSubtype("X<X|[null]>","[void]");
	}
	@Test public void test_5574() {
		checkNotSubtype("X<X|[null]>","[any]");
	}
	@Test public void test_5575() {
		checkIsSubtype("X<X|[null]>","[null]");
	}
	@Test public void test_5576() {
		checkNotSubtype("X<X|[null]>","[int]");
	}
	@Test public void test_5577() {
		checkNotSubtype("X<X|[null]>","[X<[X]>]");
	}
	@Test public void test_5578() {
		checkIsSubtype("X<X|[null]>","X<X|void>");
	}
	@Test public void test_5579() {
		checkNotSubtype("X<X|[null]>","X<X|any>");
	}
	@Test public void test_5580() {
		checkNotSubtype("X<X|[null]>","X<X|null>");
	}
	@Test public void test_5581() {
		checkNotSubtype("X<X|[null]>","X<X|int>");
	}
	@Test public void test_5582() {
		checkNotSubtype("X<X|[null]>","X<X|Y<[Y]>>");
	}
	@Test public void test_5583() {
		checkNotSubtype("X<X|[null]>","[[void]]");
	}
	@Test public void test_5584() {
		checkNotSubtype("X<X|[null]>","[[any]]");
	}
	@Test public void test_5585() {
		checkNotSubtype("X<X|[null]>","[[null]]");
	}
	@Test public void test_5586() {
		checkNotSubtype("X<X|[null]>","[[int]]");
	}
	@Test public void test_5587() {
		checkNotSubtype("X<X|[null]>","[[X<[X]>]]");
	}
	@Test public void test_5588() {
		checkNotSubtype("X<X|[null]>","X<[[[X]]]>");
	}
	@Test public void test_5589() {
		checkNotSubtype("X<X|[null]>","X<[[Y<X|Y>]]>");
	}
	@Test public void test_5590() {
		checkIsSubtype("X<X|[null]>","[X<X|void>]");
	}
	@Test public void test_5591() {
		checkNotSubtype("X<X|[null]>","[X<X|any>]");
	}
	@Test public void test_5592() {
		checkIsSubtype("X<X|[null]>","[X<X|null>]");
	}
	@Test public void test_5593() {
		checkNotSubtype("X<X|[null]>","[X<X|int>]");
	}
	@Test public void test_5594() {
		checkNotSubtype("X<X|[null]>","[X<X|Y<[Y]>>]");
	}
	@Test public void test_5595() {
		checkNotSubtype("X<X|[null]>","X<[Y<Y|[X]>]>");
	}
	@Test public void test_5596() {
		checkNotSubtype("X<X|[null]>","X<[Y<Y|(Z<X|Z>)>]>");
	}
	@Test public void test_5597() {
		checkIsSubtype("X<X|[null]>","void|void");
	}
	@Test public void test_5598() {
		checkNotSubtype("X<X|[null]>","void|any");
	}
	@Test public void test_5599() {
		checkNotSubtype("X<X|[null]>","void|null");
	}
	@Test public void test_5600() {
		checkNotSubtype("X<X|[null]>","void|int");
	}
	@Test public void test_5601() {
		checkNotSubtype("X<X|[null]>","void|X<[X]>");
	}
	@Test public void test_5602() {
		checkIsSubtype("X<X|[null]>","void|[void]");
	}
	@Test public void test_5603() {
		checkIsSubtype("X<X|[null]>","void|(X<void|X>)");
	}
	@Test public void test_5604() {
		checkNotSubtype("X<X|[null]>","any|void");
	}
	@Test public void test_5605() {
		checkNotSubtype("X<X|[null]>","any|any");
	}
	@Test public void test_5606() {
		checkNotSubtype("X<X|[null]>","any|null");
	}
	@Test public void test_5607() {
		checkNotSubtype("X<X|[null]>","any|int");
	}
	@Test public void test_5608() {
		checkNotSubtype("X<X|[null]>","any|X<[X]>");
	}
	@Test public void test_5609() {
		checkNotSubtype("X<X|[null]>","any|[any]");
	}
	@Test public void test_5610() {
		checkNotSubtype("X<X|[null]>","any|(X<any|X>)");
	}
	@Test public void test_5611() {
		checkNotSubtype("X<X|[null]>","null|void");
	}
	@Test public void test_5612() {
		checkNotSubtype("X<X|[null]>","null|any");
	}
	@Test public void test_5613() {
		checkNotSubtype("X<X|[null]>","null|null");
	}
	@Test public void test_5614() {
		checkNotSubtype("X<X|[null]>","null|int");
	}
	@Test public void test_5615() {
		checkNotSubtype("X<X|[null]>","null|X<[X]>");
	}
	@Test public void test_5616() {
		checkNotSubtype("X<X|[null]>","null|[null]");
	}
	@Test public void test_5617() {
		checkNotSubtype("X<X|[null]>","null|(X<null|X>)");
	}
	@Test public void test_5618() {
		checkNotSubtype("X<X|[null]>","int|void");
	}
	@Test public void test_5619() {
		checkNotSubtype("X<X|[null]>","int|any");
	}
	@Test public void test_5620() {
		checkNotSubtype("X<X|[null]>","int|null");
	}
	@Test public void test_5621() {
		checkNotSubtype("X<X|[null]>","int|int");
	}
	@Test public void test_5622() {
		checkNotSubtype("X<X|[null]>","int|X<[X]>");
	}
	@Test public void test_5623() {
		checkNotSubtype("X<X|[null]>","int|[int]");
	}
	@Test public void test_5624() {
		checkNotSubtype("X<X|[null]>","int|(X<int|X>)");
	}
	@Test public void test_5625() {
		checkIsSubtype("X<X|[null]>","[void]|void");
	}
	@Test public void test_5626() {
		checkNotSubtype("X<X|[null]>","X<[X]>|void");
	}
	@Test public void test_5627() {
		checkIsSubtype("X<X|[null]>","X<X|[void]>");
	}
	@Test public void test_5628() {
		checkNotSubtype("X<X|[null]>","[any]|any");
	}
	@Test public void test_5629() {
		checkNotSubtype("X<X|[null]>","X<[X]>|any");
	}
	@Test public void test_5630() {
		checkNotSubtype("X<X|[null]>","X<X|[any]>");
	}
	@Test public void test_5631() {
		checkNotSubtype("X<X|[null]>","[null]|null");
	}
	@Test public void test_5632() {
		checkNotSubtype("X<X|[null]>","X<[X]>|null");
	}
	@Test public void test_5633() {
		checkIsSubtype("X<X|[null]>","X<X|[null]>");
	}
	@Test public void test_5634() {
		checkNotSubtype("X<X|[null]>","[int]|int");
	}
	@Test public void test_5635() {
		checkNotSubtype("X<X|[null]>","X<[X]>|int");
	}
	@Test public void test_5636() {
		checkNotSubtype("X<X|[null]>","X<X|[int]>");
	}
	@Test public void test_5637() {
		checkNotSubtype("X<X|[null]>","[X<[X]>]|X<[X]>");
	}
	@Test public void test_5638() {
		checkNotSubtype("X<X|[null]>","X<[X]>|Y<[Y]>");
	}
	@Test public void test_5639() {
		checkNotSubtype("X<X|[null]>","X<[X]>|[X<[X]>]");
	}
	@Test public void test_5640() {
		checkNotSubtype("X<X|[null]>","X<X|[Y<[Y]>]>");
	}
	@Test public void test_5641() {
		checkNotSubtype("X<X|[null]>","X<X|[[X]]>");
	}
	@Test public void test_5642() {
		checkNotSubtype("X<X|[null]>","X<[X]>|(Y<X<[X]>|Y>)");
	}
	@Test public void test_5643() {
		checkNotSubtype("X<X|[null]>","X<X|[Y<X|Y>]>");
	}
	@Test public void test_5644() {
		checkIsSubtype("X<X|[null]>","(X<X|void>)|void");
	}
	@Test public void test_5645() {
		checkIsSubtype("X<X|[null]>","X<X|(Y<Y|void>)>");
	}
	@Test public void test_5646() {
		checkNotSubtype("X<X|[null]>","(X<X|any>)|any");
	}
	@Test public void test_5647() {
		checkNotSubtype("X<X|[null]>","X<X|(Y<Y|any>)>");
	}
	@Test public void test_5648() {
		checkNotSubtype("X<X|[null]>","(X<X|null>)|null");
	}
	@Test public void test_5649() {
		checkNotSubtype("X<X|[null]>","X<X|(Y<Y|null>)>");
	}
	@Test public void test_5650() {
		checkNotSubtype("X<X|[null]>","(X<X|int>)|int");
	}
	@Test public void test_5651() {
		checkNotSubtype("X<X|[null]>","X<X|(Y<Y|int>)>");
	}
	@Test public void test_5652() {
		checkNotSubtype("X<X|[null]>","(X<X|Y<[Y]>>)|Y<[Y]>");
	}
	@Test public void test_5653() {
		checkNotSubtype("X<X|[null]>","X<X|(Y<Y|Z<[Z]>>)>");
	}
	@Test public void test_5654() {
		checkNotSubtype("X<X|[null]>","X<X|(Y<Y|[X]>)>");
	}
	@Test public void test_5655() {
		checkIsSubtype("X<X|[null]>","X<X|(Y<Y|(Z<X|Z>)>)>");
	}
	@Test public void test_5656() {
		checkNotSubtype("[int]|int","any");
	}
	@Test public void test_5657() {
		checkNotSubtype("[int]|int","null");
	}
	@Test public void test_5658() {
		checkIsSubtype("[int]|int","int");
	}
	@Test public void test_5659() {
		checkNotSubtype("[int]|int","X<[X]>");
	}
	@Test public void test_5660() {
		checkIsSubtype("[int]|int","[void]");
	}
	@Test public void test_5661() {
		checkNotSubtype("[int]|int","[any]");
	}
	@Test public void test_5662() {
		checkNotSubtype("[int]|int","[null]");
	}
	@Test public void test_5663() {
		checkIsSubtype("[int]|int","[int]");
	}
	@Test public void test_5664() {
		checkNotSubtype("[int]|int","[X<[X]>]");
	}
	@Test public void test_5665() {
		checkIsSubtype("[int]|int","X<X|void>");
	}
	@Test public void test_5666() {
		checkNotSubtype("[int]|int","X<X|any>");
	}
	@Test public void test_5667() {
		checkNotSubtype("[int]|int","X<X|null>");
	}
	@Test public void test_5668() {
		checkIsSubtype("[int]|int","X<X|int>");
	}
	@Test public void test_5669() {
		checkNotSubtype("[int]|int","X<X|Y<[Y]>>");
	}
	@Test public void test_5670() {
		checkNotSubtype("[int]|int","[[void]]");
	}
	@Test public void test_5671() {
		checkNotSubtype("[int]|int","[[any]]");
	}
	@Test public void test_5672() {
		checkNotSubtype("[int]|int","[[null]]");
	}
	@Test public void test_5673() {
		checkNotSubtype("[int]|int","[[int]]");
	}
	@Test public void test_5674() {
		checkNotSubtype("[int]|int","[[X<[X]>]]");
	}
	@Test public void test_5675() {
		checkNotSubtype("[int]|int","X<[[[X]]]>");
	}
	@Test public void test_5676() {
		checkNotSubtype("[int]|int","X<[[Y<X|Y>]]>");
	}
	@Test public void test_5677() {
		checkIsSubtype("[int]|int","[X<X|void>]");
	}
	@Test public void test_5678() {
		checkNotSubtype("[int]|int","[X<X|any>]");
	}
	@Test public void test_5679() {
		checkNotSubtype("[int]|int","[X<X|null>]");
	}
	@Test public void test_5680() {
		checkIsSubtype("[int]|int","[X<X|int>]");
	}
	@Test public void test_5681() {
		checkNotSubtype("[int]|int","[X<X|Y<[Y]>>]");
	}
	@Test public void test_5682() {
		checkNotSubtype("[int]|int","X<[Y<Y|[X]>]>");
	}
	@Test public void test_5683() {
		checkNotSubtype("[int]|int","X<[Y<Y|(Z<X|Z>)>]>");
	}
	@Test public void test_5684() {
		checkIsSubtype("[int]|int","void|void");
	}
	@Test public void test_5685() {
		checkNotSubtype("[int]|int","void|any");
	}
	@Test public void test_5686() {
		checkNotSubtype("[int]|int","void|null");
	}
	@Test public void test_5687() {
		checkIsSubtype("[int]|int","void|int");
	}
	@Test public void test_5688() {
		checkNotSubtype("[int]|int","void|X<[X]>");
	}
	@Test public void test_5689() {
		checkIsSubtype("[int]|int","void|[void]");
	}
	@Test public void test_5690() {
		checkIsSubtype("[int]|int","void|(X<void|X>)");
	}
	@Test public void test_5691() {
		checkNotSubtype("[int]|int","any|void");
	}
	@Test public void test_5692() {
		checkNotSubtype("[int]|int","any|any");
	}
	@Test public void test_5693() {
		checkNotSubtype("[int]|int","any|null");
	}
	@Test public void test_5694() {
		checkNotSubtype("[int]|int","any|int");
	}
	@Test public void test_5695() {
		checkNotSubtype("[int]|int","any|X<[X]>");
	}
	@Test public void test_5696() {
		checkNotSubtype("[int]|int","any|[any]");
	}
	@Test public void test_5697() {
		checkNotSubtype("[int]|int","any|(X<any|X>)");
	}
	@Test public void test_5698() {
		checkNotSubtype("[int]|int","null|void");
	}
	@Test public void test_5699() {
		checkNotSubtype("[int]|int","null|any");
	}
	@Test public void test_5700() {
		checkNotSubtype("[int]|int","null|null");
	}
	@Test public void test_5701() {
		checkNotSubtype("[int]|int","null|int");
	}
	@Test public void test_5702() {
		checkNotSubtype("[int]|int","null|X<[X]>");
	}
	@Test public void test_5703() {
		checkNotSubtype("[int]|int","null|[null]");
	}
	@Test public void test_5704() {
		checkNotSubtype("[int]|int","null|(X<null|X>)");
	}
	@Test public void test_5705() {
		checkIsSubtype("[int]|int","int|void");
	}
	@Test public void test_5706() {
		checkNotSubtype("[int]|int","int|any");
	}
	@Test public void test_5707() {
		checkNotSubtype("[int]|int","int|null");
	}
	@Test public void test_5708() {
		checkIsSubtype("[int]|int","int|int");
	}
	@Test public void test_5709() {
		checkNotSubtype("[int]|int","int|X<[X]>");
	}
	@Test public void test_5710() {
		checkIsSubtype("[int]|int","int|[int]");
	}
	@Test public void test_5711() {
		checkIsSubtype("[int]|int","int|(X<int|X>)");
	}
	@Test public void test_5712() {
		checkIsSubtype("[int]|int","[void]|void");
	}
	@Test public void test_5713() {
		checkNotSubtype("[int]|int","X<[X]>|void");
	}
	@Test public void test_5714() {
		checkIsSubtype("[int]|int","X<X|[void]>");
	}
	@Test public void test_5715() {
		checkNotSubtype("[int]|int","[any]|any");
	}
	@Test public void test_5716() {
		checkNotSubtype("[int]|int","X<[X]>|any");
	}
	@Test public void test_5717() {
		checkNotSubtype("[int]|int","X<X|[any]>");
	}
	@Test public void test_5718() {
		checkNotSubtype("[int]|int","[null]|null");
	}
	@Test public void test_5719() {
		checkNotSubtype("[int]|int","X<[X]>|null");
	}
	@Test public void test_5720() {
		checkNotSubtype("[int]|int","X<X|[null]>");
	}
	@Test public void test_5721() {
		checkIsSubtype("[int]|int","[int]|int");
	}
	@Test public void test_5722() {
		checkNotSubtype("[int]|int","X<[X]>|int");
	}
	@Test public void test_5723() {
		checkIsSubtype("[int]|int","X<X|[int]>");
	}
	@Test public void test_5724() {
		checkNotSubtype("[int]|int","[X<[X]>]|X<[X]>");
	}
	@Test public void test_5725() {
		checkNotSubtype("[int]|int","X<[X]>|Y<[Y]>");
	}
	@Test public void test_5726() {
		checkNotSubtype("[int]|int","X<[X]>|[X<[X]>]");
	}
	@Test public void test_5727() {
		checkNotSubtype("[int]|int","X<X|[Y<[Y]>]>");
	}
	@Test public void test_5728() {
		checkNotSubtype("[int]|int","X<X|[[X]]>");
	}
	@Test public void test_5729() {
		checkNotSubtype("[int]|int","X<[X]>|(Y<X<[X]>|Y>)");
	}
	@Test public void test_5730() {
		checkNotSubtype("[int]|int","X<X|[Y<X|Y>]>");
	}
	@Test public void test_5731() {
		checkIsSubtype("[int]|int","(X<X|void>)|void");
	}
	@Test public void test_5732() {
		checkIsSubtype("[int]|int","X<X|(Y<Y|void>)>");
	}
	@Test public void test_5733() {
		checkNotSubtype("[int]|int","(X<X|any>)|any");
	}
	@Test public void test_5734() {
		checkNotSubtype("[int]|int","X<X|(Y<Y|any>)>");
	}
	@Test public void test_5735() {
		checkNotSubtype("[int]|int","(X<X|null>)|null");
	}
	@Test public void test_5736() {
		checkNotSubtype("[int]|int","X<X|(Y<Y|null>)>");
	}
	@Test public void test_5737() {
		checkIsSubtype("[int]|int","(X<X|int>)|int");
	}
	@Test public void test_5738() {
		checkIsSubtype("[int]|int","X<X|(Y<Y|int>)>");
	}
	@Test public void test_5739() {
		checkNotSubtype("[int]|int","(X<X|Y<[Y]>>)|Y<[Y]>");
	}
	@Test public void test_5740() {
		checkNotSubtype("[int]|int","X<X|(Y<Y|Z<[Z]>>)>");
	}
	@Test public void test_5741() {
		checkNotSubtype("[int]|int","X<X|(Y<Y|[X]>)>");
	}
	@Test public void test_5742() {
		checkIsSubtype("[int]|int","X<X|(Y<Y|(Z<X|Z>)>)>");
	}
	@Test public void test_5743() {
		checkNotSubtype("X<[X]>|int","any");
	}
	@Test public void test_5744() {
		checkNotSubtype("X<[X]>|int","null");
	}
	@Test public void test_5745() {
		checkIsSubtype("X<[X]>|int","int");
	}
	@Test public void test_5746() {
		checkIsSubtype("X<[X]>|int","X<[X]>");
	}
	@Test public void test_5747() {
		checkIsSubtype("X<[X]>|int","[void]");
	}
	@Test public void test_5748() {
		checkNotSubtype("X<[X]>|int","[any]");
	}
	@Test public void test_5749() {
		checkNotSubtype("X<[X]>|int","[null]");
	}
	@Test public void test_5750() {
		checkNotSubtype("X<[X]>|int","[int]");
	}
	@Test public void test_5751() {
		checkIsSubtype("X<[X]>|int","[X<[X]>]");
	}
	@Test public void test_5752() {
		checkIsSubtype("X<[X]>|int","X<X|void>");
	}
	@Test public void test_5753() {
		checkNotSubtype("X<[X]>|int","X<X|any>");
	}
	@Test public void test_5754() {
		checkNotSubtype("X<[X]>|int","X<X|null>");
	}
	@Test public void test_5755() {
		checkIsSubtype("X<[X]>|int","X<X|int>");
	}
	@Test public void test_5756() {
		checkIsSubtype("X<[X]>|int","X<X|Y<[Y]>>");
	}
	@Test public void test_5757() {
		checkIsSubtype("X<[X]>|int","[[void]]");
	}
	@Test public void test_5758() {
		checkNotSubtype("X<[X]>|int","[[any]]");
	}
	@Test public void test_5759() {
		checkNotSubtype("X<[X]>|int","[[null]]");
	}
	@Test public void test_5760() {
		checkNotSubtype("X<[X]>|int","[[int]]");
	}
	@Test public void test_5761() {
		checkIsSubtype("X<[X]>|int","[[X<[X]>]]");
	}
	@Test public void test_5762() {
		checkIsSubtype("X<[X]>|int","X<[[[X]]]>");
	}
	@Test public void test_5763() {
		checkIsSubtype("X<[X]>|int","X<[[Y<X|Y>]]>");
	}
	@Test public void test_5764() {
		checkIsSubtype("X<[X]>|int","[X<X|void>]");
	}
	@Test public void test_5765() {
		checkNotSubtype("X<[X]>|int","[X<X|any>]");
	}
	@Test public void test_5766() {
		checkNotSubtype("X<[X]>|int","[X<X|null>]");
	}
	@Test public void test_5767() {
		checkNotSubtype("X<[X]>|int","[X<X|int>]");
	}
	@Test public void test_5768() {
		checkIsSubtype("X<[X]>|int","[X<X|Y<[Y]>>]");
	}
	@Test public void test_5769() {
		checkIsSubtype("X<[X]>|int","X<[Y<Y|[X]>]>");
	}
	@Test public void test_5770() {
		checkIsSubtype("X<[X]>|int","X<[Y<Y|(Z<X|Z>)>]>");
	}
	@Test public void test_5771() {
		checkIsSubtype("X<[X]>|int","void|void");
	}
	@Test public void test_5772() {
		checkNotSubtype("X<[X]>|int","void|any");
	}
	@Test public void test_5773() {
		checkNotSubtype("X<[X]>|int","void|null");
	}
	@Test public void test_5774() {
		checkIsSubtype("X<[X]>|int","void|int");
	}
	@Test public void test_5775() {
		checkIsSubtype("X<[X]>|int","void|X<[X]>");
	}
	@Test public void test_5776() {
		checkIsSubtype("X<[X]>|int","void|[void]");
	}
	@Test public void test_5777() {
		checkIsSubtype("X<[X]>|int","void|(X<void|X>)");
	}
	@Test public void test_5778() {
		checkNotSubtype("X<[X]>|int","any|void");
	}
	@Test public void test_5779() {
		checkNotSubtype("X<[X]>|int","any|any");
	}
	@Test public void test_5780() {
		checkNotSubtype("X<[X]>|int","any|null");
	}
	@Test public void test_5781() {
		checkNotSubtype("X<[X]>|int","any|int");
	}
	@Test public void test_5782() {
		checkNotSubtype("X<[X]>|int","any|X<[X]>");
	}
	@Test public void test_5783() {
		checkNotSubtype("X<[X]>|int","any|[any]");
	}
	@Test public void test_5784() {
		checkNotSubtype("X<[X]>|int","any|(X<any|X>)");
	}
	@Test public void test_5785() {
		checkNotSubtype("X<[X]>|int","null|void");
	}
	@Test public void test_5786() {
		checkNotSubtype("X<[X]>|int","null|any");
	}
	@Test public void test_5787() {
		checkNotSubtype("X<[X]>|int","null|null");
	}
	@Test public void test_5788() {
		checkNotSubtype("X<[X]>|int","null|int");
	}
	@Test public void test_5789() {
		checkNotSubtype("X<[X]>|int","null|X<[X]>");
	}
	@Test public void test_5790() {
		checkNotSubtype("X<[X]>|int","null|[null]");
	}
	@Test public void test_5791() {
		checkNotSubtype("X<[X]>|int","null|(X<null|X>)");
	}
	@Test public void test_5792() {
		checkIsSubtype("X<[X]>|int","int|void");
	}
	@Test public void test_5793() {
		checkNotSubtype("X<[X]>|int","int|any");
	}
	@Test public void test_5794() {
		checkNotSubtype("X<[X]>|int","int|null");
	}
	@Test public void test_5795() {
		checkIsSubtype("X<[X]>|int","int|int");
	}
	@Test public void test_5796() {
		checkIsSubtype("X<[X]>|int","int|X<[X]>");
	}
	@Test public void test_5797() {
		checkNotSubtype("X<[X]>|int","int|[int]");
	}
	@Test public void test_5798() {
		checkIsSubtype("X<[X]>|int","int|(X<int|X>)");
	}
	@Test public void test_5799() {
		checkIsSubtype("X<[X]>|int","[void]|void");
	}
	@Test public void test_5800() {
		checkIsSubtype("X<[X]>|int","X<[X]>|void");
	}
	@Test public void test_5801() {
		checkIsSubtype("X<[X]>|int","X<X|[void]>");
	}
	@Test public void test_5802() {
		checkNotSubtype("X<[X]>|int","[any]|any");
	}
	@Test public void test_5803() {
		checkNotSubtype("X<[X]>|int","X<[X]>|any");
	}
	@Test public void test_5804() {
		checkNotSubtype("X<[X]>|int","X<X|[any]>");
	}
	@Test public void test_5805() {
		checkNotSubtype("X<[X]>|int","[null]|null");
	}
	@Test public void test_5806() {
		checkNotSubtype("X<[X]>|int","X<[X]>|null");
	}
	@Test public void test_5807() {
		checkNotSubtype("X<[X]>|int","X<X|[null]>");
	}
	@Test public void test_5808() {
		checkNotSubtype("X<[X]>|int","[int]|int");
	}
	@Test public void test_5809() {
		checkIsSubtype("X<[X]>|int","X<[X]>|int");
	}
	@Test public void test_5810() {
		checkNotSubtype("X<[X]>|int","X<X|[int]>");
	}
	@Test public void test_5811() {
		checkIsSubtype("X<[X]>|int","[X<[X]>]|X<[X]>");
	}
	@Test public void test_5812() {
		checkIsSubtype("X<[X]>|int","X<[X]>|Y<[Y]>");
	}
	@Test public void test_5813() {
		checkIsSubtype("X<[X]>|int","X<[X]>|[X<[X]>]");
	}
	@Test public void test_5814() {
		checkIsSubtype("X<[X]>|int","X<X|[Y<[Y]>]>");
	}
	@Test public void test_5815() {
		checkIsSubtype("X<[X]>|int","X<X|[[X]]>");
	}
	@Test public void test_5816() {
		checkIsSubtype("X<[X]>|int","X<[X]>|(Y<X<[X]>|Y>)");
	}
	@Test public void test_5817() {
		checkIsSubtype("X<[X]>|int","X<X|[Y<X|Y>]>");
	}
	@Test public void test_5818() {
		checkIsSubtype("X<[X]>|int","(X<X|void>)|void");
	}
	@Test public void test_5819() {
		checkIsSubtype("X<[X]>|int","X<X|(Y<Y|void>)>");
	}
	@Test public void test_5820() {
		checkNotSubtype("X<[X]>|int","(X<X|any>)|any");
	}
	@Test public void test_5821() {
		checkNotSubtype("X<[X]>|int","X<X|(Y<Y|any>)>");
	}
	@Test public void test_5822() {
		checkNotSubtype("X<[X]>|int","(X<X|null>)|null");
	}
	@Test public void test_5823() {
		checkNotSubtype("X<[X]>|int","X<X|(Y<Y|null>)>");
	}
	@Test public void test_5824() {
		checkIsSubtype("X<[X]>|int","(X<X|int>)|int");
	}
	@Test public void test_5825() {
		checkIsSubtype("X<[X]>|int","X<X|(Y<Y|int>)>");
	}
	@Test public void test_5826() {
		checkIsSubtype("X<[X]>|int","(X<X|Y<[Y]>>)|Y<[Y]>");
	}
	@Test public void test_5827() {
		checkIsSubtype("X<[X]>|int","X<X|(Y<Y|Z<[Z]>>)>");
	}
	@Test public void test_5828() {
		checkIsSubtype("X<[X]>|int","X<X|(Y<Y|[X]>)>");
	}
	@Test public void test_5829() {
		checkIsSubtype("X<[X]>|int","X<X|(Y<Y|(Z<X|Z>)>)>");
	}
	@Test public void test_5830() {
		checkNotSubtype("X<X|[int]>","any");
	}
	@Test public void test_5831() {
		checkNotSubtype("X<X|[int]>","null");
	}
	@Test public void test_5832() {
		checkNotSubtype("X<X|[int]>","int");
	}
	@Test public void test_5833() {
		checkNotSubtype("X<X|[int]>","X<[X]>");
	}
	@Test public void test_5834() {
		checkIsSubtype("X<X|[int]>","[void]");
	}
	@Test public void test_5835() {
		checkNotSubtype("X<X|[int]>","[any]");
	}
	@Test public void test_5836() {
		checkNotSubtype("X<X|[int]>","[null]");
	}
	@Test public void test_5837() {
		checkIsSubtype("X<X|[int]>","[int]");
	}
	@Test public void test_5838() {
		checkNotSubtype("X<X|[int]>","[X<[X]>]");
	}
	@Test public void test_5839() {
		checkIsSubtype("X<X|[int]>","X<X|void>");
	}
	@Test public void test_5840() {
		checkNotSubtype("X<X|[int]>","X<X|any>");
	}
	@Test public void test_5841() {
		checkNotSubtype("X<X|[int]>","X<X|null>");
	}
	@Test public void test_5842() {
		checkNotSubtype("X<X|[int]>","X<X|int>");
	}
	@Test public void test_5843() {
		checkNotSubtype("X<X|[int]>","X<X|Y<[Y]>>");
	}
	@Test public void test_5844() {
		checkNotSubtype("X<X|[int]>","[[void]]");
	}
	@Test public void test_5845() {
		checkNotSubtype("X<X|[int]>","[[any]]");
	}
	@Test public void test_5846() {
		checkNotSubtype("X<X|[int]>","[[null]]");
	}
	@Test public void test_5847() {
		checkNotSubtype("X<X|[int]>","[[int]]");
	}
	@Test public void test_5848() {
		checkNotSubtype("X<X|[int]>","[[X<[X]>]]");
	}
	@Test public void test_5849() {
		checkNotSubtype("X<X|[int]>","X<[[[X]]]>");
	}
	@Test public void test_5850() {
		checkNotSubtype("X<X|[int]>","X<[[Y<X|Y>]]>");
	}
	@Test public void test_5851() {
		checkIsSubtype("X<X|[int]>","[X<X|void>]");
	}
	@Test public void test_5852() {
		checkNotSubtype("X<X|[int]>","[X<X|any>]");
	}
	@Test public void test_5853() {
		checkNotSubtype("X<X|[int]>","[X<X|null>]");
	}
	@Test public void test_5854() {
		checkIsSubtype("X<X|[int]>","[X<X|int>]");
	}
	@Test public void test_5855() {
		checkNotSubtype("X<X|[int]>","[X<X|Y<[Y]>>]");
	}
	@Test public void test_5856() {
		checkNotSubtype("X<X|[int]>","X<[Y<Y|[X]>]>");
	}
	@Test public void test_5857() {
		checkNotSubtype("X<X|[int]>","X<[Y<Y|(Z<X|Z>)>]>");
	}
	@Test public void test_5858() {
		checkIsSubtype("X<X|[int]>","void|void");
	}
	@Test public void test_5859() {
		checkNotSubtype("X<X|[int]>","void|any");
	}
	@Test public void test_5860() {
		checkNotSubtype("X<X|[int]>","void|null");
	}
	@Test public void test_5861() {
		checkNotSubtype("X<X|[int]>","void|int");
	}
	@Test public void test_5862() {
		checkNotSubtype("X<X|[int]>","void|X<[X]>");
	}
	@Test public void test_5863() {
		checkIsSubtype("X<X|[int]>","void|[void]");
	}
	@Test public void test_5864() {
		checkIsSubtype("X<X|[int]>","void|(X<void|X>)");
	}
	@Test public void test_5865() {
		checkNotSubtype("X<X|[int]>","any|void");
	}
	@Test public void test_5866() {
		checkNotSubtype("X<X|[int]>","any|any");
	}
	@Test public void test_5867() {
		checkNotSubtype("X<X|[int]>","any|null");
	}
	@Test public void test_5868() {
		checkNotSubtype("X<X|[int]>","any|int");
	}
	@Test public void test_5869() {
		checkNotSubtype("X<X|[int]>","any|X<[X]>");
	}
	@Test public void test_5870() {
		checkNotSubtype("X<X|[int]>","any|[any]");
	}
	@Test public void test_5871() {
		checkNotSubtype("X<X|[int]>","any|(X<any|X>)");
	}
	@Test public void test_5872() {
		checkNotSubtype("X<X|[int]>","null|void");
	}
	@Test public void test_5873() {
		checkNotSubtype("X<X|[int]>","null|any");
	}
	@Test public void test_5874() {
		checkNotSubtype("X<X|[int]>","null|null");
	}
	@Test public void test_5875() {
		checkNotSubtype("X<X|[int]>","null|int");
	}
	@Test public void test_5876() {
		checkNotSubtype("X<X|[int]>","null|X<[X]>");
	}
	@Test public void test_5877() {
		checkNotSubtype("X<X|[int]>","null|[null]");
	}
	@Test public void test_5878() {
		checkNotSubtype("X<X|[int]>","null|(X<null|X>)");
	}
	@Test public void test_5879() {
		checkNotSubtype("X<X|[int]>","int|void");
	}
	@Test public void test_5880() {
		checkNotSubtype("X<X|[int]>","int|any");
	}
	@Test public void test_5881() {
		checkNotSubtype("X<X|[int]>","int|null");
	}
	@Test public void test_5882() {
		checkNotSubtype("X<X|[int]>","int|int");
	}
	@Test public void test_5883() {
		checkNotSubtype("X<X|[int]>","int|X<[X]>");
	}
	@Test public void test_5884() {
		checkNotSubtype("X<X|[int]>","int|[int]");
	}
	@Test public void test_5885() {
		checkNotSubtype("X<X|[int]>","int|(X<int|X>)");
	}
	@Test public void test_5886() {
		checkIsSubtype("X<X|[int]>","[void]|void");
	}
	@Test public void test_5887() {
		checkNotSubtype("X<X|[int]>","X<[X]>|void");
	}
	@Test public void test_5888() {
		checkIsSubtype("X<X|[int]>","X<X|[void]>");
	}
	@Test public void test_5889() {
		checkNotSubtype("X<X|[int]>","[any]|any");
	}
	@Test public void test_5890() {
		checkNotSubtype("X<X|[int]>","X<[X]>|any");
	}
	@Test public void test_5891() {
		checkNotSubtype("X<X|[int]>","X<X|[any]>");
	}
	@Test public void test_5892() {
		checkNotSubtype("X<X|[int]>","[null]|null");
	}
	@Test public void test_5893() {
		checkNotSubtype("X<X|[int]>","X<[X]>|null");
	}
	@Test public void test_5894() {
		checkNotSubtype("X<X|[int]>","X<X|[null]>");
	}
	@Test public void test_5895() {
		checkNotSubtype("X<X|[int]>","[int]|int");
	}
	@Test public void test_5896() {
		checkNotSubtype("X<X|[int]>","X<[X]>|int");
	}
	@Test public void test_5897() {
		checkIsSubtype("X<X|[int]>","X<X|[int]>");
	}
	@Test public void test_5898() {
		checkNotSubtype("X<X|[int]>","[X<[X]>]|X<[X]>");
	}
	@Test public void test_5899() {
		checkNotSubtype("X<X|[int]>","X<[X]>|Y<[Y]>");
	}
	@Test public void test_5900() {
		checkNotSubtype("X<X|[int]>","X<[X]>|[X<[X]>]");
	}
	@Test public void test_5901() {
		checkNotSubtype("X<X|[int]>","X<X|[Y<[Y]>]>");
	}
	@Test public void test_5902() {
		checkNotSubtype("X<X|[int]>","X<X|[[X]]>");
	}
	@Test public void test_5903() {
		checkNotSubtype("X<X|[int]>","X<[X]>|(Y<X<[X]>|Y>)");
	}
	@Test public void test_5904() {
		checkNotSubtype("X<X|[int]>","X<X|[Y<X|Y>]>");
	}
	@Test public void test_5905() {
		checkIsSubtype("X<X|[int]>","(X<X|void>)|void");
	}
	@Test public void test_5906() {
		checkIsSubtype("X<X|[int]>","X<X|(Y<Y|void>)>");
	}
	@Test public void test_5907() {
		checkNotSubtype("X<X|[int]>","(X<X|any>)|any");
	}
	@Test public void test_5908() {
		checkNotSubtype("X<X|[int]>","X<X|(Y<Y|any>)>");
	}
	@Test public void test_5909() {
		checkNotSubtype("X<X|[int]>","(X<X|null>)|null");
	}
	@Test public void test_5910() {
		checkNotSubtype("X<X|[int]>","X<X|(Y<Y|null>)>");
	}
	@Test public void test_5911() {
		checkNotSubtype("X<X|[int]>","(X<X|int>)|int");
	}
	@Test public void test_5912() {
		checkNotSubtype("X<X|[int]>","X<X|(Y<Y|int>)>");
	}
	@Test public void test_5913() {
		checkNotSubtype("X<X|[int]>","(X<X|Y<[Y]>>)|Y<[Y]>");
	}
	@Test public void test_5914() {
		checkNotSubtype("X<X|[int]>","X<X|(Y<Y|Z<[Z]>>)>");
	}
	@Test public void test_5915() {
		checkNotSubtype("X<X|[int]>","X<X|(Y<Y|[X]>)>");
	}
	@Test public void test_5916() {
		checkIsSubtype("X<X|[int]>","X<X|(Y<Y|(Z<X|Z>)>)>");
	}
	@Test public void test_5917() {
		checkNotSubtype("[X<[X]>]|X<[X]>","any");
	}
	@Test public void test_5918() {
		checkNotSubtype("[X<[X]>]|X<[X]>","null");
	}
	@Test public void test_5919() {
		checkNotSubtype("[X<[X]>]|X<[X]>","int");
	}
	@Test public void test_5920() {
		checkIsSubtype("[X<[X]>]|X<[X]>","X<[X]>");
	}
	@Test public void test_5921() {
		checkIsSubtype("[X<[X]>]|X<[X]>","[void]");
	}
	@Test public void test_5922() {
		checkNotSubtype("[X<[X]>]|X<[X]>","[any]");
	}
	@Test public void test_5923() {
		checkNotSubtype("[X<[X]>]|X<[X]>","[null]");
	}
	@Test public void test_5924() {
		checkNotSubtype("[X<[X]>]|X<[X]>","[int]");
	}
	@Test public void test_5925() {
		checkIsSubtype("[X<[X]>]|X<[X]>","[X<[X]>]");
	}
	@Test public void test_5926() {
		checkIsSubtype("[X<[X]>]|X<[X]>","X<X|void>");
	}
	@Test public void test_5927() {
		checkNotSubtype("[X<[X]>]|X<[X]>","X<X|any>");
	}
	@Test public void test_5928() {
		checkNotSubtype("[X<[X]>]|X<[X]>","X<X|null>");
	}
	@Test public void test_5929() {
		checkNotSubtype("[X<[X]>]|X<[X]>","X<X|int>");
	}
	@Test public void test_5930() {
		checkIsSubtype("[X<[X]>]|X<[X]>","X<X|Y<[Y]>>");
	}
	@Test public void test_5931() {
		checkIsSubtype("[X<[X]>]|X<[X]>","[[void]]");
	}
	@Test public void test_5932() {
		checkNotSubtype("[X<[X]>]|X<[X]>","[[any]]");
	}
	@Test public void test_5933() {
		checkNotSubtype("[X<[X]>]|X<[X]>","[[null]]");
	}
	@Test public void test_5934() {
		checkNotSubtype("[X<[X]>]|X<[X]>","[[int]]");
	}
	@Test public void test_5935() {
		checkIsSubtype("[X<[X]>]|X<[X]>","[[X<[X]>]]");
	}
	@Test public void test_5936() {
		checkIsSubtype("[X<[X]>]|X<[X]>","X<[[[X]]]>");
	}
	@Test public void test_5937() {
		checkIsSubtype("[X<[X]>]|X<[X]>","X<[[Y<X|Y>]]>");
	}
	@Test public void test_5938() {
		checkIsSubtype("[X<[X]>]|X<[X]>","[X<X|void>]");
	}
	@Test public void test_5939() {
		checkNotSubtype("[X<[X]>]|X<[X]>","[X<X|any>]");
	}
	@Test public void test_5940() {
		checkNotSubtype("[X<[X]>]|X<[X]>","[X<X|null>]");
	}
	@Test public void test_5941() {
		checkNotSubtype("[X<[X]>]|X<[X]>","[X<X|int>]");
	}
	@Test public void test_5942() {
		checkIsSubtype("[X<[X]>]|X<[X]>","[X<X|Y<[Y]>>]");
	}
	@Test public void test_5943() {
		checkIsSubtype("[X<[X]>]|X<[X]>","X<[Y<Y|[X]>]>");
	}
	@Test public void test_5944() {
		checkIsSubtype("[X<[X]>]|X<[X]>","X<[Y<Y|(Z<X|Z>)>]>");
	}
	@Test public void test_5945() {
		checkIsSubtype("[X<[X]>]|X<[X]>","void|void");
	}
	@Test public void test_5946() {
		checkNotSubtype("[X<[X]>]|X<[X]>","void|any");
	}
	@Test public void test_5947() {
		checkNotSubtype("[X<[X]>]|X<[X]>","void|null");
	}
	@Test public void test_5948() {
		checkNotSubtype("[X<[X]>]|X<[X]>","void|int");
	}
	@Test public void test_5949() {
		checkIsSubtype("[X<[X]>]|X<[X]>","void|X<[X]>");
	}
	@Test public void test_5950() {
		checkIsSubtype("[X<[X]>]|X<[X]>","void|[void]");
	}
	@Test public void test_5951() {
		checkIsSubtype("[X<[X]>]|X<[X]>","void|(X<void|X>)");
	}
	@Test public void test_5952() {
		checkNotSubtype("[X<[X]>]|X<[X]>","any|void");
	}
	@Test public void test_5953() {
		checkNotSubtype("[X<[X]>]|X<[X]>","any|any");
	}
	@Test public void test_5954() {
		checkNotSubtype("[X<[X]>]|X<[X]>","any|null");
	}
	@Test public void test_5955() {
		checkNotSubtype("[X<[X]>]|X<[X]>","any|int");
	}
	@Test public void test_5956() {
		checkNotSubtype("[X<[X]>]|X<[X]>","any|X<[X]>");
	}
	@Test public void test_5957() {
		checkNotSubtype("[X<[X]>]|X<[X]>","any|[any]");
	}
	@Test public void test_5958() {
		checkNotSubtype("[X<[X]>]|X<[X]>","any|(X<any|X>)");
	}
	@Test public void test_5959() {
		checkNotSubtype("[X<[X]>]|X<[X]>","null|void");
	}
	@Test public void test_5960() {
		checkNotSubtype("[X<[X]>]|X<[X]>","null|any");
	}
	@Test public void test_5961() {
		checkNotSubtype("[X<[X]>]|X<[X]>","null|null");
	}
	@Test public void test_5962() {
		checkNotSubtype("[X<[X]>]|X<[X]>","null|int");
	}
	@Test public void test_5963() {
		checkNotSubtype("[X<[X]>]|X<[X]>","null|X<[X]>");
	}
	@Test public void test_5964() {
		checkNotSubtype("[X<[X]>]|X<[X]>","null|[null]");
	}
	@Test public void test_5965() {
		checkNotSubtype("[X<[X]>]|X<[X]>","null|(X<null|X>)");
	}
	@Test public void test_5966() {
		checkNotSubtype("[X<[X]>]|X<[X]>","int|void");
	}
	@Test public void test_5967() {
		checkNotSubtype("[X<[X]>]|X<[X]>","int|any");
	}
	@Test public void test_5968() {
		checkNotSubtype("[X<[X]>]|X<[X]>","int|null");
	}
	@Test public void test_5969() {
		checkNotSubtype("[X<[X]>]|X<[X]>","int|int");
	}
	@Test public void test_5970() {
		checkNotSubtype("[X<[X]>]|X<[X]>","int|X<[X]>");
	}
	@Test public void test_5971() {
		checkNotSubtype("[X<[X]>]|X<[X]>","int|[int]");
	}
	@Test public void test_5972() {
		checkNotSubtype("[X<[X]>]|X<[X]>","int|(X<int|X>)");
	}
	@Test public void test_5973() {
		checkIsSubtype("[X<[X]>]|X<[X]>","[void]|void");
	}
	@Test public void test_5974() {
		checkIsSubtype("[X<[X]>]|X<[X]>","X<[X]>|void");
	}
	@Test public void test_5975() {
		checkIsSubtype("[X<[X]>]|X<[X]>","X<X|[void]>");
	}
	@Test public void test_5976() {
		checkNotSubtype("[X<[X]>]|X<[X]>","[any]|any");
	}
	@Test public void test_5977() {
		checkNotSubtype("[X<[X]>]|X<[X]>","X<[X]>|any");
	}
	@Test public void test_5978() {
		checkNotSubtype("[X<[X]>]|X<[X]>","X<X|[any]>");
	}
	@Test public void test_5979() {
		checkNotSubtype("[X<[X]>]|X<[X]>","[null]|null");
	}
	@Test public void test_5980() {
		checkNotSubtype("[X<[X]>]|X<[X]>","X<[X]>|null");
	}
	@Test public void test_5981() {
		checkNotSubtype("[X<[X]>]|X<[X]>","X<X|[null]>");
	}
	@Test public void test_5982() {
		checkNotSubtype("[X<[X]>]|X<[X]>","[int]|int");
	}
	@Test public void test_5983() {
		checkNotSubtype("[X<[X]>]|X<[X]>","X<[X]>|int");
	}
	@Test public void test_5984() {
		checkNotSubtype("[X<[X]>]|X<[X]>","X<X|[int]>");
	}
	@Test public void test_5985() {
		checkIsSubtype("[X<[X]>]|X<[X]>","[X<[X]>]|X<[X]>");
	}
	@Test public void test_5986() {
		checkIsSubtype("[X<[X]>]|X<[X]>","X<[X]>|Y<[Y]>");
	}
	@Test public void test_5987() {
		checkIsSubtype("[X<[X]>]|X<[X]>","X<[X]>|[X<[X]>]");
	}
	@Test public void test_5988() {
		checkIsSubtype("[X<[X]>]|X<[X]>","X<X|[Y<[Y]>]>");
	}
	@Test public void test_5989() {
		checkIsSubtype("[X<[X]>]|X<[X]>","X<X|[[X]]>");
	}
	@Test public void test_5990() {
		checkIsSubtype("[X<[X]>]|X<[X]>","X<[X]>|(Y<X<[X]>|Y>)");
	}
	@Test public void test_5991() {
		checkIsSubtype("[X<[X]>]|X<[X]>","X<X|[Y<X|Y>]>");
	}
	@Test public void test_5992() {
		checkIsSubtype("[X<[X]>]|X<[X]>","(X<X|void>)|void");
	}
	@Test public void test_5993() {
		checkIsSubtype("[X<[X]>]|X<[X]>","X<X|(Y<Y|void>)>");
	}
	@Test public void test_5994() {
		checkNotSubtype("[X<[X]>]|X<[X]>","(X<X|any>)|any");
	}
	@Test public void test_5995() {
		checkNotSubtype("[X<[X]>]|X<[X]>","X<X|(Y<Y|any>)>");
	}
	@Test public void test_5996() {
		checkNotSubtype("[X<[X]>]|X<[X]>","(X<X|null>)|null");
	}
	@Test public void test_5997() {
		checkNotSubtype("[X<[X]>]|X<[X]>","X<X|(Y<Y|null>)>");
	}
	@Test public void test_5998() {
		checkNotSubtype("[X<[X]>]|X<[X]>","(X<X|int>)|int");
	}
	@Test public void test_5999() {
		checkNotSubtype("[X<[X]>]|X<[X]>","X<X|(Y<Y|int>)>");
	}
	@Test public void test_6000() {
		checkIsSubtype("[X<[X]>]|X<[X]>","(X<X|Y<[Y]>>)|Y<[Y]>");
	}
	@Test public void test_6001() {
		checkIsSubtype("[X<[X]>]|X<[X]>","X<X|(Y<Y|Z<[Z]>>)>");
	}
	@Test public void test_6002() {
		checkIsSubtype("[X<[X]>]|X<[X]>","X<X|(Y<Y|[X]>)>");
	}
	@Test public void test_6003() {
		checkIsSubtype("[X<[X]>]|X<[X]>","X<X|(Y<Y|(Z<X|Z>)>)>");
	}
	@Test public void test_6004() {
		checkNotSubtype("X<[X]>|Y<[Y]>","any");
	}
	@Test public void test_6005() {
		checkNotSubtype("X<[X]>|Y<[Y]>","null");
	}
	@Test public void test_6006() {
		checkNotSubtype("X<[X]>|Y<[Y]>","int");
	}
	@Test public void test_6007() {
		checkIsSubtype("X<[X]>|Y<[Y]>","X<[X]>");
	}
	@Test public void test_6008() {
		checkIsSubtype("X<[X]>|Y<[Y]>","[void]");
	}
	@Test public void test_6009() {
		checkNotSubtype("X<[X]>|Y<[Y]>","[any]");
	}
	@Test public void test_6010() {
		checkNotSubtype("X<[X]>|Y<[Y]>","[null]");
	}
	@Test public void test_6011() {
		checkNotSubtype("X<[X]>|Y<[Y]>","[int]");
	}
	@Test public void test_6012() {
		checkIsSubtype("X<[X]>|Y<[Y]>","[X<[X]>]");
	}
	@Test public void test_6013() {
		checkIsSubtype("X<[X]>|Y<[Y]>","X<X|void>");
	}
	@Test public void test_6014() {
		checkNotSubtype("X<[X]>|Y<[Y]>","X<X|any>");
	}
	@Test public void test_6015() {
		checkNotSubtype("X<[X]>|Y<[Y]>","X<X|null>");
	}
	@Test public void test_6016() {
		checkNotSubtype("X<[X]>|Y<[Y]>","X<X|int>");
	}
	@Test public void test_6017() {
		checkIsSubtype("X<[X]>|Y<[Y]>","X<X|Y<[Y]>>");
	}
	@Test public void test_6018() {
		checkIsSubtype("X<[X]>|Y<[Y]>","[[void]]");
	}
	@Test public void test_6019() {
		checkNotSubtype("X<[X]>|Y<[Y]>","[[any]]");
	}
	@Test public void test_6020() {
		checkNotSubtype("X<[X]>|Y<[Y]>","[[null]]");
	}
	@Test public void test_6021() {
		checkNotSubtype("X<[X]>|Y<[Y]>","[[int]]");
	}
	@Test public void test_6022() {
		checkIsSubtype("X<[X]>|Y<[Y]>","[[X<[X]>]]");
	}
	@Test public void test_6023() {
		checkIsSubtype("X<[X]>|Y<[Y]>","X<[[[X]]]>");
	}
	@Test public void test_6024() {
		checkIsSubtype("X<[X]>|Y<[Y]>","X<[[Y<X|Y>]]>");
	}
	@Test public void test_6025() {
		checkIsSubtype("X<[X]>|Y<[Y]>","[X<X|void>]");
	}
	@Test public void test_6026() {
		checkNotSubtype("X<[X]>|Y<[Y]>","[X<X|any>]");
	}
	@Test public void test_6027() {
		checkNotSubtype("X<[X]>|Y<[Y]>","[X<X|null>]");
	}
	@Test public void test_6028() {
		checkNotSubtype("X<[X]>|Y<[Y]>","[X<X|int>]");
	}
	@Test public void test_6029() {
		checkIsSubtype("X<[X]>|Y<[Y]>","[X<X|Y<[Y]>>]");
	}
	@Test public void test_6030() {
		checkIsSubtype("X<[X]>|Y<[Y]>","X<[Y<Y|[X]>]>");
	}
	@Test public void test_6031() {
		checkIsSubtype("X<[X]>|Y<[Y]>","X<[Y<Y|(Z<X|Z>)>]>");
	}
	@Test public void test_6032() {
		checkIsSubtype("X<[X]>|Y<[Y]>","void|void");
	}
	@Test public void test_6033() {
		checkNotSubtype("X<[X]>|Y<[Y]>","void|any");
	}
	@Test public void test_6034() {
		checkNotSubtype("X<[X]>|Y<[Y]>","void|null");
	}
	@Test public void test_6035() {
		checkNotSubtype("X<[X]>|Y<[Y]>","void|int");
	}
	@Test public void test_6036() {
		checkIsSubtype("X<[X]>|Y<[Y]>","void|X<[X]>");
	}
	@Test public void test_6037() {
		checkIsSubtype("X<[X]>|Y<[Y]>","void|[void]");
	}
	@Test public void test_6038() {
		checkIsSubtype("X<[X]>|Y<[Y]>","void|(X<void|X>)");
	}
	@Test public void test_6039() {
		checkNotSubtype("X<[X]>|Y<[Y]>","any|void");
	}
	@Test public void test_6040() {
		checkNotSubtype("X<[X]>|Y<[Y]>","any|any");
	}
	@Test public void test_6041() {
		checkNotSubtype("X<[X]>|Y<[Y]>","any|null");
	}
	@Test public void test_6042() {
		checkNotSubtype("X<[X]>|Y<[Y]>","any|int");
	}
	@Test public void test_6043() {
		checkNotSubtype("X<[X]>|Y<[Y]>","any|X<[X]>");
	}
	@Test public void test_6044() {
		checkNotSubtype("X<[X]>|Y<[Y]>","any|[any]");
	}
	@Test public void test_6045() {
		checkNotSubtype("X<[X]>|Y<[Y]>","any|(X<any|X>)");
	}
	@Test public void test_6046() {
		checkNotSubtype("X<[X]>|Y<[Y]>","null|void");
	}
	@Test public void test_6047() {
		checkNotSubtype("X<[X]>|Y<[Y]>","null|any");
	}
	@Test public void test_6048() {
		checkNotSubtype("X<[X]>|Y<[Y]>","null|null");
	}
	@Test public void test_6049() {
		checkNotSubtype("X<[X]>|Y<[Y]>","null|int");
	}
	@Test public void test_6050() {
		checkNotSubtype("X<[X]>|Y<[Y]>","null|X<[X]>");
	}
	@Test public void test_6051() {
		checkNotSubtype("X<[X]>|Y<[Y]>","null|[null]");
	}
	@Test public void test_6052() {
		checkNotSubtype("X<[X]>|Y<[Y]>","null|(X<null|X>)");
	}
	@Test public void test_6053() {
		checkNotSubtype("X<[X]>|Y<[Y]>","int|void");
	}
	@Test public void test_6054() {
		checkNotSubtype("X<[X]>|Y<[Y]>","int|any");
	}
	@Test public void test_6055() {
		checkNotSubtype("X<[X]>|Y<[Y]>","int|null");
	}
	@Test public void test_6056() {
		checkNotSubtype("X<[X]>|Y<[Y]>","int|int");
	}
	@Test public void test_6057() {
		checkNotSubtype("X<[X]>|Y<[Y]>","int|X<[X]>");
	}
	@Test public void test_6058() {
		checkNotSubtype("X<[X]>|Y<[Y]>","int|[int]");
	}
	@Test public void test_6059() {
		checkNotSubtype("X<[X]>|Y<[Y]>","int|(X<int|X>)");
	}
	@Test public void test_6060() {
		checkIsSubtype("X<[X]>|Y<[Y]>","[void]|void");
	}
	@Test public void test_6061() {
		checkIsSubtype("X<[X]>|Y<[Y]>","X<[X]>|void");
	}
	@Test public void test_6062() {
		checkIsSubtype("X<[X]>|Y<[Y]>","X<X|[void]>");
	}
	@Test public void test_6063() {
		checkNotSubtype("X<[X]>|Y<[Y]>","[any]|any");
	}
	@Test public void test_6064() {
		checkNotSubtype("X<[X]>|Y<[Y]>","X<[X]>|any");
	}
	@Test public void test_6065() {
		checkNotSubtype("X<[X]>|Y<[Y]>","X<X|[any]>");
	}
	@Test public void test_6066() {
		checkNotSubtype("X<[X]>|Y<[Y]>","[null]|null");
	}
	@Test public void test_6067() {
		checkNotSubtype("X<[X]>|Y<[Y]>","X<[X]>|null");
	}
	@Test public void test_6068() {
		checkNotSubtype("X<[X]>|Y<[Y]>","X<X|[null]>");
	}
	@Test public void test_6069() {
		checkNotSubtype("X<[X]>|Y<[Y]>","[int]|int");
	}
	@Test public void test_6070() {
		checkNotSubtype("X<[X]>|Y<[Y]>","X<[X]>|int");
	}
	@Test public void test_6071() {
		checkNotSubtype("X<[X]>|Y<[Y]>","X<X|[int]>");
	}
	@Test public void test_6072() {
		checkIsSubtype("X<[X]>|Y<[Y]>","[X<[X]>]|X<[X]>");
	}
	@Test public void test_6073() {
		checkIsSubtype("X<[X]>|Y<[Y]>","X<[X]>|Y<[Y]>");
	}
	@Test public void test_6074() {
		checkIsSubtype("X<[X]>|Y<[Y]>","X<[X]>|[X<[X]>]");
	}
	@Test public void test_6075() {
		checkIsSubtype("X<[X]>|Y<[Y]>","X<X|[Y<[Y]>]>");
	}
	@Test public void test_6076() {
		checkIsSubtype("X<[X]>|Y<[Y]>","X<X|[[X]]>");
	}
	@Test public void test_6077() {
		checkIsSubtype("X<[X]>|Y<[Y]>","X<[X]>|(Y<X<[X]>|Y>)");
	}
	@Test public void test_6078() {
		checkIsSubtype("X<[X]>|Y<[Y]>","X<X|[Y<X|Y>]>");
	}
	@Test public void test_6079() {
		checkIsSubtype("X<[X]>|Y<[Y]>","(X<X|void>)|void");
	}
	@Test public void test_6080() {
		checkIsSubtype("X<[X]>|Y<[Y]>","X<X|(Y<Y|void>)>");
	}
	@Test public void test_6081() {
		checkNotSubtype("X<[X]>|Y<[Y]>","(X<X|any>)|any");
	}
	@Test public void test_6082() {
		checkNotSubtype("X<[X]>|Y<[Y]>","X<X|(Y<Y|any>)>");
	}
	@Test public void test_6083() {
		checkNotSubtype("X<[X]>|Y<[Y]>","(X<X|null>)|null");
	}
	@Test public void test_6084() {
		checkNotSubtype("X<[X]>|Y<[Y]>","X<X|(Y<Y|null>)>");
	}
	@Test public void test_6085() {
		checkNotSubtype("X<[X]>|Y<[Y]>","(X<X|int>)|int");
	}
	@Test public void test_6086() {
		checkNotSubtype("X<[X]>|Y<[Y]>","X<X|(Y<Y|int>)>");
	}
	@Test public void test_6087() {
		checkIsSubtype("X<[X]>|Y<[Y]>","(X<X|Y<[Y]>>)|Y<[Y]>");
	}
	@Test public void test_6088() {
		checkIsSubtype("X<[X]>|Y<[Y]>","X<X|(Y<Y|Z<[Z]>>)>");
	}
	@Test public void test_6089() {
		checkIsSubtype("X<[X]>|Y<[Y]>","X<X|(Y<Y|[X]>)>");
	}
	@Test public void test_6090() {
		checkIsSubtype("X<[X]>|Y<[Y]>","X<X|(Y<Y|(Z<X|Z>)>)>");
	}
	@Test public void test_6091() {
		checkNotSubtype("X<[X]>|[X<[X]>]","any");
	}
	@Test public void test_6092() {
		checkNotSubtype("X<[X]>|[X<[X]>]","null");
	}
	@Test public void test_6093() {
		checkNotSubtype("X<[X]>|[X<[X]>]","int");
	}
	@Test public void test_6094() {
		checkIsSubtype("X<[X]>|[X<[X]>]","X<[X]>");
	}
	@Test public void test_6095() {
		checkIsSubtype("X<[X]>|[X<[X]>]","[void]");
	}
	@Test public void test_6096() {
		checkNotSubtype("X<[X]>|[X<[X]>]","[any]");
	}
	@Test public void test_6097() {
		checkNotSubtype("X<[X]>|[X<[X]>]","[null]");
	}
	@Test public void test_6098() {
		checkNotSubtype("X<[X]>|[X<[X]>]","[int]");
	}
	@Test public void test_6099() {
		checkIsSubtype("X<[X]>|[X<[X]>]","[X<[X]>]");
	}
	@Test public void test_6100() {
		checkIsSubtype("X<[X]>|[X<[X]>]","X<X|void>");
	}
	@Test public void test_6101() {
		checkNotSubtype("X<[X]>|[X<[X]>]","X<X|any>");
	}
	@Test public void test_6102() {
		checkNotSubtype("X<[X]>|[X<[X]>]","X<X|null>");
	}
	@Test public void test_6103() {
		checkNotSubtype("X<[X]>|[X<[X]>]","X<X|int>");
	}
	@Test public void test_6104() {
		checkIsSubtype("X<[X]>|[X<[X]>]","X<X|Y<[Y]>>");
	}
	@Test public void test_6105() {
		checkIsSubtype("X<[X]>|[X<[X]>]","[[void]]");
	}
	@Test public void test_6106() {
		checkNotSubtype("X<[X]>|[X<[X]>]","[[any]]");
	}
	@Test public void test_6107() {
		checkNotSubtype("X<[X]>|[X<[X]>]","[[null]]");
	}
	@Test public void test_6108() {
		checkNotSubtype("X<[X]>|[X<[X]>]","[[int]]");
	}
	@Test public void test_6109() {
		checkIsSubtype("X<[X]>|[X<[X]>]","[[X<[X]>]]");
	}
	@Test public void test_6110() {
		checkIsSubtype("X<[X]>|[X<[X]>]","X<[[[X]]]>");
	}
	@Test public void test_6111() {
		checkIsSubtype("X<[X]>|[X<[X]>]","X<[[Y<X|Y>]]>");
	}
	@Test public void test_6112() {
		checkIsSubtype("X<[X]>|[X<[X]>]","[X<X|void>]");
	}
	@Test public void test_6113() {
		checkNotSubtype("X<[X]>|[X<[X]>]","[X<X|any>]");
	}
	@Test public void test_6114() {
		checkNotSubtype("X<[X]>|[X<[X]>]","[X<X|null>]");
	}
	@Test public void test_6115() {
		checkNotSubtype("X<[X]>|[X<[X]>]","[X<X|int>]");
	}
	@Test public void test_6116() {
		checkIsSubtype("X<[X]>|[X<[X]>]","[X<X|Y<[Y]>>]");
	}
	@Test public void test_6117() {
		checkIsSubtype("X<[X]>|[X<[X]>]","X<[Y<Y|[X]>]>");
	}
	@Test public void test_6118() {
		checkIsSubtype("X<[X]>|[X<[X]>]","X<[Y<Y|(Z<X|Z>)>]>");
	}
	@Test public void test_6119() {
		checkIsSubtype("X<[X]>|[X<[X]>]","void|void");
	}
	@Test public void test_6120() {
		checkNotSubtype("X<[X]>|[X<[X]>]","void|any");
	}
	@Test public void test_6121() {
		checkNotSubtype("X<[X]>|[X<[X]>]","void|null");
	}
	@Test public void test_6122() {
		checkNotSubtype("X<[X]>|[X<[X]>]","void|int");
	}
	@Test public void test_6123() {
		checkIsSubtype("X<[X]>|[X<[X]>]","void|X<[X]>");
	}
	@Test public void test_6124() {
		checkIsSubtype("X<[X]>|[X<[X]>]","void|[void]");
	}
	@Test public void test_6125() {
		checkIsSubtype("X<[X]>|[X<[X]>]","void|(X<void|X>)");
	}
	@Test public void test_6126() {
		checkNotSubtype("X<[X]>|[X<[X]>]","any|void");
	}
	@Test public void test_6127() {
		checkNotSubtype("X<[X]>|[X<[X]>]","any|any");
	}
	@Test public void test_6128() {
		checkNotSubtype("X<[X]>|[X<[X]>]","any|null");
	}
	@Test public void test_6129() {
		checkNotSubtype("X<[X]>|[X<[X]>]","any|int");
	}
	@Test public void test_6130() {
		checkNotSubtype("X<[X]>|[X<[X]>]","any|X<[X]>");
	}
	@Test public void test_6131() {
		checkNotSubtype("X<[X]>|[X<[X]>]","any|[any]");
	}
	@Test public void test_6132() {
		checkNotSubtype("X<[X]>|[X<[X]>]","any|(X<any|X>)");
	}
	@Test public void test_6133() {
		checkNotSubtype("X<[X]>|[X<[X]>]","null|void");
	}
	@Test public void test_6134() {
		checkNotSubtype("X<[X]>|[X<[X]>]","null|any");
	}
	@Test public void test_6135() {
		checkNotSubtype("X<[X]>|[X<[X]>]","null|null");
	}
	@Test public void test_6136() {
		checkNotSubtype("X<[X]>|[X<[X]>]","null|int");
	}
	@Test public void test_6137() {
		checkNotSubtype("X<[X]>|[X<[X]>]","null|X<[X]>");
	}
	@Test public void test_6138() {
		checkNotSubtype("X<[X]>|[X<[X]>]","null|[null]");
	}
	@Test public void test_6139() {
		checkNotSubtype("X<[X]>|[X<[X]>]","null|(X<null|X>)");
	}
	@Test public void test_6140() {
		checkNotSubtype("X<[X]>|[X<[X]>]","int|void");
	}
	@Test public void test_6141() {
		checkNotSubtype("X<[X]>|[X<[X]>]","int|any");
	}
	@Test public void test_6142() {
		checkNotSubtype("X<[X]>|[X<[X]>]","int|null");
	}
	@Test public void test_6143() {
		checkNotSubtype("X<[X]>|[X<[X]>]","int|int");
	}
	@Test public void test_6144() {
		checkNotSubtype("X<[X]>|[X<[X]>]","int|X<[X]>");
	}
	@Test public void test_6145() {
		checkNotSubtype("X<[X]>|[X<[X]>]","int|[int]");
	}
	@Test public void test_6146() {
		checkNotSubtype("X<[X]>|[X<[X]>]","int|(X<int|X>)");
	}
	@Test public void test_6147() {
		checkIsSubtype("X<[X]>|[X<[X]>]","[void]|void");
	}
	@Test public void test_6148() {
		checkIsSubtype("X<[X]>|[X<[X]>]","X<[X]>|void");
	}
	@Test public void test_6149() {
		checkIsSubtype("X<[X]>|[X<[X]>]","X<X|[void]>");
	}
	@Test public void test_6150() {
		checkNotSubtype("X<[X]>|[X<[X]>]","[any]|any");
	}
	@Test public void test_6151() {
		checkNotSubtype("X<[X]>|[X<[X]>]","X<[X]>|any");
	}
	@Test public void test_6152() {
		checkNotSubtype("X<[X]>|[X<[X]>]","X<X|[any]>");
	}
	@Test public void test_6153() {
		checkNotSubtype("X<[X]>|[X<[X]>]","[null]|null");
	}
	@Test public void test_6154() {
		checkNotSubtype("X<[X]>|[X<[X]>]","X<[X]>|null");
	}
	@Test public void test_6155() {
		checkNotSubtype("X<[X]>|[X<[X]>]","X<X|[null]>");
	}
	@Test public void test_6156() {
		checkNotSubtype("X<[X]>|[X<[X]>]","[int]|int");
	}
	@Test public void test_6157() {
		checkNotSubtype("X<[X]>|[X<[X]>]","X<[X]>|int");
	}
	@Test public void test_6158() {
		checkNotSubtype("X<[X]>|[X<[X]>]","X<X|[int]>");
	}
	@Test public void test_6159() {
		checkIsSubtype("X<[X]>|[X<[X]>]","[X<[X]>]|X<[X]>");
	}
	@Test public void test_6160() {
		checkIsSubtype("X<[X]>|[X<[X]>]","X<[X]>|Y<[Y]>");
	}
	@Test public void test_6161() {
		checkIsSubtype("X<[X]>|[X<[X]>]","X<[X]>|[X<[X]>]");
	}
	@Test public void test_6162() {
		checkIsSubtype("X<[X]>|[X<[X]>]","X<X|[Y<[Y]>]>");
	}
	@Test public void test_6163() {
		checkIsSubtype("X<[X]>|[X<[X]>]","X<X|[[X]]>");
	}
	@Test public void test_6164() {
		checkIsSubtype("X<[X]>|[X<[X]>]","X<[X]>|(Y<X<[X]>|Y>)");
	}
	@Test public void test_6165() {
		checkIsSubtype("X<[X]>|[X<[X]>]","X<X|[Y<X|Y>]>");
	}
	@Test public void test_6166() {
		checkIsSubtype("X<[X]>|[X<[X]>]","(X<X|void>)|void");
	}
	@Test public void test_6167() {
		checkIsSubtype("X<[X]>|[X<[X]>]","X<X|(Y<Y|void>)>");
	}
	@Test public void test_6168() {
		checkNotSubtype("X<[X]>|[X<[X]>]","(X<X|any>)|any");
	}
	@Test public void test_6169() {
		checkNotSubtype("X<[X]>|[X<[X]>]","X<X|(Y<Y|any>)>");
	}
	@Test public void test_6170() {
		checkNotSubtype("X<[X]>|[X<[X]>]","(X<X|null>)|null");
	}
	@Test public void test_6171() {
		checkNotSubtype("X<[X]>|[X<[X]>]","X<X|(Y<Y|null>)>");
	}
	@Test public void test_6172() {
		checkNotSubtype("X<[X]>|[X<[X]>]","(X<X|int>)|int");
	}
	@Test public void test_6173() {
		checkNotSubtype("X<[X]>|[X<[X]>]","X<X|(Y<Y|int>)>");
	}
	@Test public void test_6174() {
		checkIsSubtype("X<[X]>|[X<[X]>]","(X<X|Y<[Y]>>)|Y<[Y]>");
	}
	@Test public void test_6175() {
		checkIsSubtype("X<[X]>|[X<[X]>]","X<X|(Y<Y|Z<[Z]>>)>");
	}
	@Test public void test_6176() {
		checkIsSubtype("X<[X]>|[X<[X]>]","X<X|(Y<Y|[X]>)>");
	}
	@Test public void test_6177() {
		checkIsSubtype("X<[X]>|[X<[X]>]","X<X|(Y<Y|(Z<X|Z>)>)>");
	}
	@Test public void test_6178() {
		checkNotSubtype("X<X|[Y<[Y]>]>","any");
	}
	@Test public void test_6179() {
		checkNotSubtype("X<X|[Y<[Y]>]>","null");
	}
	@Test public void test_6180() {
		checkNotSubtype("X<X|[Y<[Y]>]>","int");
	}
	@Test public void test_6181() {
		checkIsSubtype("X<X|[Y<[Y]>]>","X<[X]>");
	}
	@Test public void test_6182() {
		checkIsSubtype("X<X|[Y<[Y]>]>","[void]");
	}
	@Test public void test_6183() {
		checkNotSubtype("X<X|[Y<[Y]>]>","[any]");
	}
	@Test public void test_6184() {
		checkNotSubtype("X<X|[Y<[Y]>]>","[null]");
	}
	@Test public void test_6185() {
		checkNotSubtype("X<X|[Y<[Y]>]>","[int]");
	}
	@Test public void test_6186() {
		checkIsSubtype("X<X|[Y<[Y]>]>","[X<[X]>]");
	}
	@Test public void test_6187() {
		checkIsSubtype("X<X|[Y<[Y]>]>","X<X|void>");
	}
	@Test public void test_6188() {
		checkNotSubtype("X<X|[Y<[Y]>]>","X<X|any>");
	}
	@Test public void test_6189() {
		checkNotSubtype("X<X|[Y<[Y]>]>","X<X|null>");
	}
	@Test public void test_6190() {
		checkNotSubtype("X<X|[Y<[Y]>]>","X<X|int>");
	}
	@Test public void test_6191() {
		checkIsSubtype("X<X|[Y<[Y]>]>","X<X|Y<[Y]>>");
	}
	@Test public void test_6192() {
		checkIsSubtype("X<X|[Y<[Y]>]>","[[void]]");
	}
	@Test public void test_6193() {
		checkNotSubtype("X<X|[Y<[Y]>]>","[[any]]");
	}
	@Test public void test_6194() {
		checkNotSubtype("X<X|[Y<[Y]>]>","[[null]]");
	}
	@Test public void test_6195() {
		checkNotSubtype("X<X|[Y<[Y]>]>","[[int]]");
	}
	@Test public void test_6196() {
		checkIsSubtype("X<X|[Y<[Y]>]>","[[X<[X]>]]");
	}
	@Test public void test_6197() {
		checkIsSubtype("X<X|[Y<[Y]>]>","X<[[[X]]]>");
	}
	@Test public void test_6198() {
		checkIsSubtype("X<X|[Y<[Y]>]>","X<[[Y<X|Y>]]>");
	}
	@Test public void test_6199() {
		checkIsSubtype("X<X|[Y<[Y]>]>","[X<X|void>]");
	}
	@Test public void test_6200() {
		checkNotSubtype("X<X|[Y<[Y]>]>","[X<X|any>]");
	}
	@Test public void test_6201() {
		checkNotSubtype("X<X|[Y<[Y]>]>","[X<X|null>]");
	}
	@Test public void test_6202() {
		checkNotSubtype("X<X|[Y<[Y]>]>","[X<X|int>]");
	}
	@Test public void test_6203() {
		checkIsSubtype("X<X|[Y<[Y]>]>","[X<X|Y<[Y]>>]");
	}
	@Test public void test_6204() {
		checkIsSubtype("X<X|[Y<[Y]>]>","X<[Y<Y|[X]>]>");
	}
	@Test public void test_6205() {
		checkIsSubtype("X<X|[Y<[Y]>]>","X<[Y<Y|(Z<X|Z>)>]>");
	}
	@Test public void test_6206() {
		checkIsSubtype("X<X|[Y<[Y]>]>","void|void");
	}
	@Test public void test_6207() {
		checkNotSubtype("X<X|[Y<[Y]>]>","void|any");
	}
	@Test public void test_6208() {
		checkNotSubtype("X<X|[Y<[Y]>]>","void|null");
	}
	@Test public void test_6209() {
		checkNotSubtype("X<X|[Y<[Y]>]>","void|int");
	}
	@Test public void test_6210() {
		checkIsSubtype("X<X|[Y<[Y]>]>","void|X<[X]>");
	}
	@Test public void test_6211() {
		checkIsSubtype("X<X|[Y<[Y]>]>","void|[void]");
	}
	@Test public void test_6212() {
		checkIsSubtype("X<X|[Y<[Y]>]>","void|(X<void|X>)");
	}
	@Test public void test_6213() {
		checkNotSubtype("X<X|[Y<[Y]>]>","any|void");
	}
	@Test public void test_6214() {
		checkNotSubtype("X<X|[Y<[Y]>]>","any|any");
	}
	@Test public void test_6215() {
		checkNotSubtype("X<X|[Y<[Y]>]>","any|null");
	}
	@Test public void test_6216() {
		checkNotSubtype("X<X|[Y<[Y]>]>","any|int");
	}
	@Test public void test_6217() {
		checkNotSubtype("X<X|[Y<[Y]>]>","any|X<[X]>");
	}
	@Test public void test_6218() {
		checkNotSubtype("X<X|[Y<[Y]>]>","any|[any]");
	}
	@Test public void test_6219() {
		checkNotSubtype("X<X|[Y<[Y]>]>","any|(X<any|X>)");
	}
	@Test public void test_6220() {
		checkNotSubtype("X<X|[Y<[Y]>]>","null|void");
	}
	@Test public void test_6221() {
		checkNotSubtype("X<X|[Y<[Y]>]>","null|any");
	}
	@Test public void test_6222() {
		checkNotSubtype("X<X|[Y<[Y]>]>","null|null");
	}
	@Test public void test_6223() {
		checkNotSubtype("X<X|[Y<[Y]>]>","null|int");
	}
	@Test public void test_6224() {
		checkNotSubtype("X<X|[Y<[Y]>]>","null|X<[X]>");
	}
	@Test public void test_6225() {
		checkNotSubtype("X<X|[Y<[Y]>]>","null|[null]");
	}
	@Test public void test_6226() {
		checkNotSubtype("X<X|[Y<[Y]>]>","null|(X<null|X>)");
	}
	@Test public void test_6227() {
		checkNotSubtype("X<X|[Y<[Y]>]>","int|void");
	}
	@Test public void test_6228() {
		checkNotSubtype("X<X|[Y<[Y]>]>","int|any");
	}
	@Test public void test_6229() {
		checkNotSubtype("X<X|[Y<[Y]>]>","int|null");
	}
	@Test public void test_6230() {
		checkNotSubtype("X<X|[Y<[Y]>]>","int|int");
	}
	@Test public void test_6231() {
		checkNotSubtype("X<X|[Y<[Y]>]>","int|X<[X]>");
	}
	@Test public void test_6232() {
		checkNotSubtype("X<X|[Y<[Y]>]>","int|[int]");
	}
	@Test public void test_6233() {
		checkNotSubtype("X<X|[Y<[Y]>]>","int|(X<int|X>)");
	}
	@Test public void test_6234() {
		checkIsSubtype("X<X|[Y<[Y]>]>","[void]|void");
	}
	@Test public void test_6235() {
		checkIsSubtype("X<X|[Y<[Y]>]>","X<[X]>|void");
	}
	@Test public void test_6236() {
		checkIsSubtype("X<X|[Y<[Y]>]>","X<X|[void]>");
	}
	@Test public void test_6237() {
		checkNotSubtype("X<X|[Y<[Y]>]>","[any]|any");
	}
	@Test public void test_6238() {
		checkNotSubtype("X<X|[Y<[Y]>]>","X<[X]>|any");
	}
	@Test public void test_6239() {
		checkNotSubtype("X<X|[Y<[Y]>]>","X<X|[any]>");
	}
	@Test public void test_6240() {
		checkNotSubtype("X<X|[Y<[Y]>]>","[null]|null");
	}
	@Test public void test_6241() {
		checkNotSubtype("X<X|[Y<[Y]>]>","X<[X]>|null");
	}
	@Test public void test_6242() {
		checkNotSubtype("X<X|[Y<[Y]>]>","X<X|[null]>");
	}
	@Test public void test_6243() {
		checkNotSubtype("X<X|[Y<[Y]>]>","[int]|int");
	}
	@Test public void test_6244() {
		checkNotSubtype("X<X|[Y<[Y]>]>","X<[X]>|int");
	}
	@Test public void test_6245() {
		checkNotSubtype("X<X|[Y<[Y]>]>","X<X|[int]>");
	}
	@Test public void test_6246() {
		checkIsSubtype("X<X|[Y<[Y]>]>","[X<[X]>]|X<[X]>");
	}
	@Test public void test_6247() {
		checkIsSubtype("X<X|[Y<[Y]>]>","X<[X]>|Y<[Y]>");
	}
	@Test public void test_6248() {
		checkIsSubtype("X<X|[Y<[Y]>]>","X<[X]>|[X<[X]>]");
	}
	@Test public void test_6249() {
		checkIsSubtype("X<X|[Y<[Y]>]>","X<X|[Y<[Y]>]>");
	}
	@Test public void test_6250() {
		checkIsSubtype("X<X|[Y<[Y]>]>","X<X|[[X]]>");
	}
	@Test public void test_6251() {
		checkIsSubtype("X<X|[Y<[Y]>]>","X<[X]>|(Y<X<[X]>|Y>)");
	}
	@Test public void test_6252() {
		checkIsSubtype("X<X|[Y<[Y]>]>","X<X|[Y<X|Y>]>");
	}
	@Test public void test_6253() {
		checkIsSubtype("X<X|[Y<[Y]>]>","(X<X|void>)|void");
	}
	@Test public void test_6254() {
		checkIsSubtype("X<X|[Y<[Y]>]>","X<X|(Y<Y|void>)>");
	}
	@Test public void test_6255() {
		checkNotSubtype("X<X|[Y<[Y]>]>","(X<X|any>)|any");
	}
	@Test public void test_6256() {
		checkNotSubtype("X<X|[Y<[Y]>]>","X<X|(Y<Y|any>)>");
	}
	@Test public void test_6257() {
		checkNotSubtype("X<X|[Y<[Y]>]>","(X<X|null>)|null");
	}
	@Test public void test_6258() {
		checkNotSubtype("X<X|[Y<[Y]>]>","X<X|(Y<Y|null>)>");
	}
	@Test public void test_6259() {
		checkNotSubtype("X<X|[Y<[Y]>]>","(X<X|int>)|int");
	}
	@Test public void test_6260() {
		checkNotSubtype("X<X|[Y<[Y]>]>","X<X|(Y<Y|int>)>");
	}
	@Test public void test_6261() {
		checkIsSubtype("X<X|[Y<[Y]>]>","(X<X|Y<[Y]>>)|Y<[Y]>");
	}
	@Test public void test_6262() {
		checkIsSubtype("X<X|[Y<[Y]>]>","X<X|(Y<Y|Z<[Z]>>)>");
	}
	@Test public void test_6263() {
		checkIsSubtype("X<X|[Y<[Y]>]>","X<X|(Y<Y|[X]>)>");
	}
	@Test public void test_6264() {
		checkIsSubtype("X<X|[Y<[Y]>]>","X<X|(Y<Y|(Z<X|Z>)>)>");
	}
	@Test public void test_6265() {
		checkNotSubtype("X<X|[[X]]>","any");
	}
	@Test public void test_6266() {
		checkNotSubtype("X<X|[[X]]>","null");
	}
	@Test public void test_6267() {
		checkNotSubtype("X<X|[[X]]>","int");
	}
	@Test public void test_6268() {
		checkIsSubtype("X<X|[[X]]>","X<[X]>");
	}
	@Test public void test_6269() {
		checkIsSubtype("X<X|[[X]]>","[void]");
	}
	@Test public void test_6270() {
		checkNotSubtype("X<X|[[X]]>","[any]");
	}
	@Test public void test_6271() {
		checkNotSubtype("X<X|[[X]]>","[null]");
	}
	@Test public void test_6272() {
		checkNotSubtype("X<X|[[X]]>","[int]");
	}
	@Test public void test_6273() {
		checkIsSubtype("X<X|[[X]]>","[X<[X]>]");
	}
	@Test public void test_6274() {
		checkIsSubtype("X<X|[[X]]>","X<X|void>");
	}
	@Test public void test_6275() {
		checkNotSubtype("X<X|[[X]]>","X<X|any>");
	}
	@Test public void test_6276() {
		checkNotSubtype("X<X|[[X]]>","X<X|null>");
	}
	@Test public void test_6277() {
		checkNotSubtype("X<X|[[X]]>","X<X|int>");
	}
	@Test public void test_6278() {
		checkIsSubtype("X<X|[[X]]>","X<X|Y<[Y]>>");
	}
	@Test public void test_6279() {
		checkIsSubtype("X<X|[[X]]>","[[void]]");
	}
	@Test public void test_6280() {
		checkNotSubtype("X<X|[[X]]>","[[any]]");
	}
	@Test public void test_6281() {
		checkNotSubtype("X<X|[[X]]>","[[null]]");
	}
	@Test public void test_6282() {
		checkNotSubtype("X<X|[[X]]>","[[int]]");
	}
	@Test public void test_6283() {
		checkIsSubtype("X<X|[[X]]>","[[X<[X]>]]");
	}
	@Test public void test_6284() {
		checkIsSubtype("X<X|[[X]]>","X<[[[X]]]>");
	}
	@Test public void test_6285() {
		checkIsSubtype("X<X|[[X]]>","X<[[Y<X|Y>]]>");
	}
	@Test public void test_6286() {
		checkIsSubtype("X<X|[[X]]>","[X<X|void>]");
	}
	@Test public void test_6287() {
		checkNotSubtype("X<X|[[X]]>","[X<X|any>]");
	}
	@Test public void test_6288() {
		checkNotSubtype("X<X|[[X]]>","[X<X|null>]");
	}
	@Test public void test_6289() {
		checkNotSubtype("X<X|[[X]]>","[X<X|int>]");
	}
	@Test public void test_6290() {
		checkIsSubtype("X<X|[[X]]>","[X<X|Y<[Y]>>]");
	}
	@Test public void test_6291() {
		checkIsSubtype("X<X|[[X]]>","X<[Y<Y|[X]>]>");
	}
	@Test public void test_6292() {
		checkIsSubtype("X<X|[[X]]>","X<[Y<Y|(Z<X|Z>)>]>");
	}
	@Test public void test_6293() {
		checkIsSubtype("X<X|[[X]]>","void|void");
	}
	@Test public void test_6294() {
		checkNotSubtype("X<X|[[X]]>","void|any");
	}
	@Test public void test_6295() {
		checkNotSubtype("X<X|[[X]]>","void|null");
	}
	@Test public void test_6296() {
		checkNotSubtype("X<X|[[X]]>","void|int");
	}
	@Test public void test_6297() {
		checkIsSubtype("X<X|[[X]]>","void|X<[X]>");
	}
	@Test public void test_6298() {
		checkIsSubtype("X<X|[[X]]>","void|[void]");
	}
	@Test public void test_6299() {
		checkIsSubtype("X<X|[[X]]>","void|(X<void|X>)");
	}
	@Test public void test_6300() {
		checkNotSubtype("X<X|[[X]]>","any|void");
	}
	@Test public void test_6301() {
		checkNotSubtype("X<X|[[X]]>","any|any");
	}
	@Test public void test_6302() {
		checkNotSubtype("X<X|[[X]]>","any|null");
	}
	@Test public void test_6303() {
		checkNotSubtype("X<X|[[X]]>","any|int");
	}
	@Test public void test_6304() {
		checkNotSubtype("X<X|[[X]]>","any|X<[X]>");
	}
	@Test public void test_6305() {
		checkNotSubtype("X<X|[[X]]>","any|[any]");
	}
	@Test public void test_6306() {
		checkNotSubtype("X<X|[[X]]>","any|(X<any|X>)");
	}
	@Test public void test_6307() {
		checkNotSubtype("X<X|[[X]]>","null|void");
	}
	@Test public void test_6308() {
		checkNotSubtype("X<X|[[X]]>","null|any");
	}
	@Test public void test_6309() {
		checkNotSubtype("X<X|[[X]]>","null|null");
	}
	@Test public void test_6310() {
		checkNotSubtype("X<X|[[X]]>","null|int");
	}
	@Test public void test_6311() {
		checkNotSubtype("X<X|[[X]]>","null|X<[X]>");
	}
	@Test public void test_6312() {
		checkNotSubtype("X<X|[[X]]>","null|[null]");
	}
	@Test public void test_6313() {
		checkNotSubtype("X<X|[[X]]>","null|(X<null|X>)");
	}
	@Test public void test_6314() {
		checkNotSubtype("X<X|[[X]]>","int|void");
	}
	@Test public void test_6315() {
		checkNotSubtype("X<X|[[X]]>","int|any");
	}
	@Test public void test_6316() {
		checkNotSubtype("X<X|[[X]]>","int|null");
	}
	@Test public void test_6317() {
		checkNotSubtype("X<X|[[X]]>","int|int");
	}
	@Test public void test_6318() {
		checkNotSubtype("X<X|[[X]]>","int|X<[X]>");
	}
	@Test public void test_6319() {
		checkNotSubtype("X<X|[[X]]>","int|[int]");
	}
	@Test public void test_6320() {
		checkNotSubtype("X<X|[[X]]>","int|(X<int|X>)");
	}
	@Test public void test_6321() {
		checkIsSubtype("X<X|[[X]]>","[void]|void");
	}
	@Test public void test_6322() {
		checkIsSubtype("X<X|[[X]]>","X<[X]>|void");
	}
	@Test public void test_6323() {
		checkIsSubtype("X<X|[[X]]>","X<X|[void]>");
	}
	@Test public void test_6324() {
		checkNotSubtype("X<X|[[X]]>","[any]|any");
	}
	@Test public void test_6325() {
		checkNotSubtype("X<X|[[X]]>","X<[X]>|any");
	}
	@Test public void test_6326() {
		checkNotSubtype("X<X|[[X]]>","X<X|[any]>");
	}
	@Test public void test_6327() {
		checkNotSubtype("X<X|[[X]]>","[null]|null");
	}
	@Test public void test_6328() {
		checkNotSubtype("X<X|[[X]]>","X<[X]>|null");
	}
	@Test public void test_6329() {
		checkNotSubtype("X<X|[[X]]>","X<X|[null]>");
	}
	@Test public void test_6330() {
		checkNotSubtype("X<X|[[X]]>","[int]|int");
	}
	@Test public void test_6331() {
		checkNotSubtype("X<X|[[X]]>","X<[X]>|int");
	}
	@Test public void test_6332() {
		checkNotSubtype("X<X|[[X]]>","X<X|[int]>");
	}
	@Test public void test_6333() {
		checkIsSubtype("X<X|[[X]]>","[X<[X]>]|X<[X]>");
	}
	@Test public void test_6334() {
		checkIsSubtype("X<X|[[X]]>","X<[X]>|Y<[Y]>");
	}
	@Test public void test_6335() {
		checkIsSubtype("X<X|[[X]]>","X<[X]>|[X<[X]>]");
	}
	@Test public void test_6336() {
		checkIsSubtype("X<X|[[X]]>","X<X|[Y<[Y]>]>");
	}
	@Test public void test_6337() {
		checkIsSubtype("X<X|[[X]]>","X<X|[[X]]>");
	}
	@Test public void test_6338() {
		checkIsSubtype("X<X|[[X]]>","X<[X]>|(Y<X<[X]>|Y>)");
	}
	@Test public void test_6339() {
		checkIsSubtype("X<X|[[X]]>","X<X|[Y<X|Y>]>");
	}
	@Test public void test_6340() {
		checkIsSubtype("X<X|[[X]]>","(X<X|void>)|void");
	}
	@Test public void test_6341() {
		checkIsSubtype("X<X|[[X]]>","X<X|(Y<Y|void>)>");
	}
	@Test public void test_6342() {
		checkNotSubtype("X<X|[[X]]>","(X<X|any>)|any");
	}
	@Test public void test_6343() {
		checkNotSubtype("X<X|[[X]]>","X<X|(Y<Y|any>)>");
	}
	@Test public void test_6344() {
		checkNotSubtype("X<X|[[X]]>","(X<X|null>)|null");
	}
	@Test public void test_6345() {
		checkNotSubtype("X<X|[[X]]>","X<X|(Y<Y|null>)>");
	}
	@Test public void test_6346() {
		checkNotSubtype("X<X|[[X]]>","(X<X|int>)|int");
	}
	@Test public void test_6347() {
		checkNotSubtype("X<X|[[X]]>","X<X|(Y<Y|int>)>");
	}
	@Test public void test_6348() {
		checkIsSubtype("X<X|[[X]]>","(X<X|Y<[Y]>>)|Y<[Y]>");
	}
	@Test public void test_6349() {
		checkIsSubtype("X<X|[[X]]>","X<X|(Y<Y|Z<[Z]>>)>");
	}
	@Test public void test_6350() {
		checkIsSubtype("X<X|[[X]]>","X<X|(Y<Y|[X]>)>");
	}
	@Test public void test_6351() {
		checkIsSubtype("X<X|[[X]]>","X<X|(Y<Y|(Z<X|Z>)>)>");
	}
	@Test public void test_6352() {
		checkNotSubtype("X<[X]>|(Y<X<[X]>|Y>)","any");
	}
	@Test public void test_6353() {
		checkNotSubtype("X<[X]>|(Y<X<[X]>|Y>)","null");
	}
	@Test public void test_6354() {
		checkNotSubtype("X<[X]>|(Y<X<[X]>|Y>)","int");
	}
	@Test public void test_6355() {
		checkIsSubtype("X<[X]>|(Y<X<[X]>|Y>)","X<[X]>");
	}
	@Test public void test_6356() {
		checkIsSubtype("X<[X]>|(Y<X<[X]>|Y>)","[void]");
	}
	@Test public void test_6357() {
		checkNotSubtype("X<[X]>|(Y<X<[X]>|Y>)","[any]");
	}
	@Test public void test_6358() {
		checkNotSubtype("X<[X]>|(Y<X<[X]>|Y>)","[null]");
	}
	@Test public void test_6359() {
		checkNotSubtype("X<[X]>|(Y<X<[X]>|Y>)","[int]");
	}
	@Test public void test_6360() {
		checkIsSubtype("X<[X]>|(Y<X<[X]>|Y>)","[X<[X]>]");
	}
	@Test public void test_6361() {
		checkIsSubtype("X<[X]>|(Y<X<[X]>|Y>)","X<X|void>");
	}
	@Test public void test_6362() {
		checkNotSubtype("X<[X]>|(Y<X<[X]>|Y>)","X<X|any>");
	}
	@Test public void test_6363() {
		checkNotSubtype("X<[X]>|(Y<X<[X]>|Y>)","X<X|null>");
	}
	@Test public void test_6364() {
		checkNotSubtype("X<[X]>|(Y<X<[X]>|Y>)","X<X|int>");
	}
	@Test public void test_6365() {
		checkIsSubtype("X<[X]>|(Y<X<[X]>|Y>)","X<X|Y<[Y]>>");
	}
	@Test public void test_6366() {
		checkIsSubtype("X<[X]>|(Y<X<[X]>|Y>)","[[void]]");
	}
	@Test public void test_6367() {
		checkNotSubtype("X<[X]>|(Y<X<[X]>|Y>)","[[any]]");
	}
	@Test public void test_6368() {
		checkNotSubtype("X<[X]>|(Y<X<[X]>|Y>)","[[null]]");
	}
	@Test public void test_6369() {
		checkNotSubtype("X<[X]>|(Y<X<[X]>|Y>)","[[int]]");
	}
	@Test public void test_6370() {
		checkIsSubtype("X<[X]>|(Y<X<[X]>|Y>)","[[X<[X]>]]");
	}
	@Test public void test_6371() {
		checkIsSubtype("X<[X]>|(Y<X<[X]>|Y>)","X<[[[X]]]>");
	}
	@Test public void test_6372() {
		checkIsSubtype("X<[X]>|(Y<X<[X]>|Y>)","X<[[Y<X|Y>]]>");
	}
	@Test public void test_6373() {
		checkIsSubtype("X<[X]>|(Y<X<[X]>|Y>)","[X<X|void>]");
	}
	@Test public void test_6374() {
		checkNotSubtype("X<[X]>|(Y<X<[X]>|Y>)","[X<X|any>]");
	}
	@Test public void test_6375() {
		checkNotSubtype("X<[X]>|(Y<X<[X]>|Y>)","[X<X|null>]");
	}
	@Test public void test_6376() {
		checkNotSubtype("X<[X]>|(Y<X<[X]>|Y>)","[X<X|int>]");
	}
	@Test public void test_6377() {
		checkIsSubtype("X<[X]>|(Y<X<[X]>|Y>)","[X<X|Y<[Y]>>]");
	}
	@Test public void test_6378() {
		checkIsSubtype("X<[X]>|(Y<X<[X]>|Y>)","X<[Y<Y|[X]>]>");
	}
	@Test public void test_6379() {
		checkIsSubtype("X<[X]>|(Y<X<[X]>|Y>)","X<[Y<Y|(Z<X|Z>)>]>");
	}
	@Test public void test_6380() {
		checkIsSubtype("X<[X]>|(Y<X<[X]>|Y>)","void|void");
	}
	@Test public void test_6381() {
		checkNotSubtype("X<[X]>|(Y<X<[X]>|Y>)","void|any");
	}
	@Test public void test_6382() {
		checkNotSubtype("X<[X]>|(Y<X<[X]>|Y>)","void|null");
	}
	@Test public void test_6383() {
		checkNotSubtype("X<[X]>|(Y<X<[X]>|Y>)","void|int");
	}
	@Test public void test_6384() {
		checkIsSubtype("X<[X]>|(Y<X<[X]>|Y>)","void|X<[X]>");
	}
	@Test public void test_6385() {
		checkIsSubtype("X<[X]>|(Y<X<[X]>|Y>)","void|[void]");
	}
	@Test public void test_6386() {
		checkIsSubtype("X<[X]>|(Y<X<[X]>|Y>)","void|(X<void|X>)");
	}
	@Test public void test_6387() {
		checkNotSubtype("X<[X]>|(Y<X<[X]>|Y>)","any|void");
	}
	@Test public void test_6388() {
		checkNotSubtype("X<[X]>|(Y<X<[X]>|Y>)","any|any");
	}
	@Test public void test_6389() {
		checkNotSubtype("X<[X]>|(Y<X<[X]>|Y>)","any|null");
	}
	@Test public void test_6390() {
		checkNotSubtype("X<[X]>|(Y<X<[X]>|Y>)","any|int");
	}
	@Test public void test_6391() {
		checkNotSubtype("X<[X]>|(Y<X<[X]>|Y>)","any|X<[X]>");
	}
	@Test public void test_6392() {
		checkNotSubtype("X<[X]>|(Y<X<[X]>|Y>)","any|[any]");
	}
	@Test public void test_6393() {
		checkNotSubtype("X<[X]>|(Y<X<[X]>|Y>)","any|(X<any|X>)");
	}
	@Test public void test_6394() {
		checkNotSubtype("X<[X]>|(Y<X<[X]>|Y>)","null|void");
	}
	@Test public void test_6395() {
		checkNotSubtype("X<[X]>|(Y<X<[X]>|Y>)","null|any");
	}
	@Test public void test_6396() {
		checkNotSubtype("X<[X]>|(Y<X<[X]>|Y>)","null|null");
	}
	@Test public void test_6397() {
		checkNotSubtype("X<[X]>|(Y<X<[X]>|Y>)","null|int");
	}
	@Test public void test_6398() {
		checkNotSubtype("X<[X]>|(Y<X<[X]>|Y>)","null|X<[X]>");
	}
	@Test public void test_6399() {
		checkNotSubtype("X<[X]>|(Y<X<[X]>|Y>)","null|[null]");
	}
	@Test public void test_6400() {
		checkNotSubtype("X<[X]>|(Y<X<[X]>|Y>)","null|(X<null|X>)");
	}
	@Test public void test_6401() {
		checkNotSubtype("X<[X]>|(Y<X<[X]>|Y>)","int|void");
	}
	@Test public void test_6402() {
		checkNotSubtype("X<[X]>|(Y<X<[X]>|Y>)","int|any");
	}
	@Test public void test_6403() {
		checkNotSubtype("X<[X]>|(Y<X<[X]>|Y>)","int|null");
	}
	@Test public void test_6404() {
		checkNotSubtype("X<[X]>|(Y<X<[X]>|Y>)","int|int");
	}
	@Test public void test_6405() {
		checkNotSubtype("X<[X]>|(Y<X<[X]>|Y>)","int|X<[X]>");
	}
	@Test public void test_6406() {
		checkNotSubtype("X<[X]>|(Y<X<[X]>|Y>)","int|[int]");
	}
	@Test public void test_6407() {
		checkNotSubtype("X<[X]>|(Y<X<[X]>|Y>)","int|(X<int|X>)");
	}
	@Test public void test_6408() {
		checkIsSubtype("X<[X]>|(Y<X<[X]>|Y>)","[void]|void");
	}
	@Test public void test_6409() {
		checkIsSubtype("X<[X]>|(Y<X<[X]>|Y>)","X<[X]>|void");
	}
	@Test public void test_6410() {
		checkIsSubtype("X<[X]>|(Y<X<[X]>|Y>)","X<X|[void]>");
	}
	@Test public void test_6411() {
		checkNotSubtype("X<[X]>|(Y<X<[X]>|Y>)","[any]|any");
	}
	@Test public void test_6412() {
		checkNotSubtype("X<[X]>|(Y<X<[X]>|Y>)","X<[X]>|any");
	}
	@Test public void test_6413() {
		checkNotSubtype("X<[X]>|(Y<X<[X]>|Y>)","X<X|[any]>");
	}
	@Test public void test_6414() {
		checkNotSubtype("X<[X]>|(Y<X<[X]>|Y>)","[null]|null");
	}
	@Test public void test_6415() {
		checkNotSubtype("X<[X]>|(Y<X<[X]>|Y>)","X<[X]>|null");
	}
	@Test public void test_6416() {
		checkNotSubtype("X<[X]>|(Y<X<[X]>|Y>)","X<X|[null]>");
	}
	@Test public void test_6417() {
		checkNotSubtype("X<[X]>|(Y<X<[X]>|Y>)","[int]|int");
	}
	@Test public void test_6418() {
		checkNotSubtype("X<[X]>|(Y<X<[X]>|Y>)","X<[X]>|int");
	}
	@Test public void test_6419() {
		checkNotSubtype("X<[X]>|(Y<X<[X]>|Y>)","X<X|[int]>");
	}
	@Test public void test_6420() {
		checkIsSubtype("X<[X]>|(Y<X<[X]>|Y>)","[X<[X]>]|X<[X]>");
	}
	@Test public void test_6421() {
		checkIsSubtype("X<[X]>|(Y<X<[X]>|Y>)","X<[X]>|Y<[Y]>");
	}
	@Test public void test_6422() {
		checkIsSubtype("X<[X]>|(Y<X<[X]>|Y>)","X<[X]>|[X<[X]>]");
	}
	@Test public void test_6423() {
		checkIsSubtype("X<[X]>|(Y<X<[X]>|Y>)","X<X|[Y<[Y]>]>");
	}
	@Test public void test_6424() {
		checkIsSubtype("X<[X]>|(Y<X<[X]>|Y>)","X<X|[[X]]>");
	}
	@Test public void test_6425() {
		checkIsSubtype("X<[X]>|(Y<X<[X]>|Y>)","X<[X]>|(Y<X<[X]>|Y>)");
	}
	@Test public void test_6426() {
		checkIsSubtype("X<[X]>|(Y<X<[X]>|Y>)","X<X|[Y<X|Y>]>");
	}
	@Test public void test_6427() {
		checkIsSubtype("X<[X]>|(Y<X<[X]>|Y>)","(X<X|void>)|void");
	}
	@Test public void test_6428() {
		checkIsSubtype("X<[X]>|(Y<X<[X]>|Y>)","X<X|(Y<Y|void>)>");
	}
	@Test public void test_6429() {
		checkNotSubtype("X<[X]>|(Y<X<[X]>|Y>)","(X<X|any>)|any");
	}
	@Test public void test_6430() {
		checkNotSubtype("X<[X]>|(Y<X<[X]>|Y>)","X<X|(Y<Y|any>)>");
	}
	@Test public void test_6431() {
		checkNotSubtype("X<[X]>|(Y<X<[X]>|Y>)","(X<X|null>)|null");
	}
	@Test public void test_6432() {
		checkNotSubtype("X<[X]>|(Y<X<[X]>|Y>)","X<X|(Y<Y|null>)>");
	}
	@Test public void test_6433() {
		checkNotSubtype("X<[X]>|(Y<X<[X]>|Y>)","(X<X|int>)|int");
	}
	@Test public void test_6434() {
		checkNotSubtype("X<[X]>|(Y<X<[X]>|Y>)","X<X|(Y<Y|int>)>");
	}
	@Test public void test_6435() {
		checkIsSubtype("X<[X]>|(Y<X<[X]>|Y>)","(X<X|Y<[Y]>>)|Y<[Y]>");
	}
	@Test public void test_6436() {
		checkIsSubtype("X<[X]>|(Y<X<[X]>|Y>)","X<X|(Y<Y|Z<[Z]>>)>");
	}
	@Test public void test_6437() {
		checkIsSubtype("X<[X]>|(Y<X<[X]>|Y>)","X<X|(Y<Y|[X]>)>");
	}
	@Test public void test_6438() {
		checkIsSubtype("X<[X]>|(Y<X<[X]>|Y>)","X<X|(Y<Y|(Z<X|Z>)>)>");
	}
	@Test public void test_6439() {
		checkNotSubtype("X<X|[Y<X|Y>]>","any");
	}
	@Test public void test_6440() {
		checkNotSubtype("X<X|[Y<X|Y>]>","null");
	}
	@Test public void test_6441() {
		checkNotSubtype("X<X|[Y<X|Y>]>","int");
	}
	@Test public void test_6442() {
		checkIsSubtype("X<X|[Y<X|Y>]>","X<[X]>");
	}
	@Test public void test_6443() {
		checkIsSubtype("X<X|[Y<X|Y>]>","[void]");
	}
	@Test public void test_6444() {
		checkNotSubtype("X<X|[Y<X|Y>]>","[any]");
	}
	@Test public void test_6445() {
		checkNotSubtype("X<X|[Y<X|Y>]>","[null]");
	}
	@Test public void test_6446() {
		checkNotSubtype("X<X|[Y<X|Y>]>","[int]");
	}
	@Test public void test_6447() {
		checkIsSubtype("X<X|[Y<X|Y>]>","[X<[X]>]");
	}
	@Test public void test_6448() {
		checkIsSubtype("X<X|[Y<X|Y>]>","X<X|void>");
	}
	@Test public void test_6449() {
		checkNotSubtype("X<X|[Y<X|Y>]>","X<X|any>");
	}
	@Test public void test_6450() {
		checkNotSubtype("X<X|[Y<X|Y>]>","X<X|null>");
	}
	@Test public void test_6451() {
		checkNotSubtype("X<X|[Y<X|Y>]>","X<X|int>");
	}
	@Test public void test_6452() {
		checkIsSubtype("X<X|[Y<X|Y>]>","X<X|Y<[Y]>>");
	}
	@Test public void test_6453() {
		checkIsSubtype("X<X|[Y<X|Y>]>","[[void]]");
	}
	@Test public void test_6454() {
		checkNotSubtype("X<X|[Y<X|Y>]>","[[any]]");
	}
	@Test public void test_6455() {
		checkNotSubtype("X<X|[Y<X|Y>]>","[[null]]");
	}
	@Test public void test_6456() {
		checkNotSubtype("X<X|[Y<X|Y>]>","[[int]]");
	}
	@Test public void test_6457() {
		checkIsSubtype("X<X|[Y<X|Y>]>","[[X<[X]>]]");
	}
	@Test public void test_6458() {
		checkIsSubtype("X<X|[Y<X|Y>]>","X<[[[X]]]>");
	}
	@Test public void test_6459() {
		checkIsSubtype("X<X|[Y<X|Y>]>","X<[[Y<X|Y>]]>");
	}
	@Test public void test_6460() {
		checkIsSubtype("X<X|[Y<X|Y>]>","[X<X|void>]");
	}
	@Test public void test_6461() {
		checkNotSubtype("X<X|[Y<X|Y>]>","[X<X|any>]");
	}
	@Test public void test_6462() {
		checkNotSubtype("X<X|[Y<X|Y>]>","[X<X|null>]");
	}
	@Test public void test_6463() {
		checkNotSubtype("X<X|[Y<X|Y>]>","[X<X|int>]");
	}
	@Test public void test_6464() {
		checkIsSubtype("X<X|[Y<X|Y>]>","[X<X|Y<[Y]>>]");
	}
	@Test public void test_6465() {
		checkIsSubtype("X<X|[Y<X|Y>]>","X<[Y<Y|[X]>]>");
	}
	@Test public void test_6466() {
		checkIsSubtype("X<X|[Y<X|Y>]>","X<[Y<Y|(Z<X|Z>)>]>");
	}
	@Test public void test_6467() {
		checkIsSubtype("X<X|[Y<X|Y>]>","void|void");
	}
	@Test public void test_6468() {
		checkNotSubtype("X<X|[Y<X|Y>]>","void|any");
	}
	@Test public void test_6469() {
		checkNotSubtype("X<X|[Y<X|Y>]>","void|null");
	}
	@Test public void test_6470() {
		checkNotSubtype("X<X|[Y<X|Y>]>","void|int");
	}
	@Test public void test_6471() {
		checkIsSubtype("X<X|[Y<X|Y>]>","void|X<[X]>");
	}
	@Test public void test_6472() {
		checkIsSubtype("X<X|[Y<X|Y>]>","void|[void]");
	}
	@Test public void test_6473() {
		checkIsSubtype("X<X|[Y<X|Y>]>","void|(X<void|X>)");
	}
	@Test public void test_6474() {
		checkNotSubtype("X<X|[Y<X|Y>]>","any|void");
	}
	@Test public void test_6475() {
		checkNotSubtype("X<X|[Y<X|Y>]>","any|any");
	}
	@Test public void test_6476() {
		checkNotSubtype("X<X|[Y<X|Y>]>","any|null");
	}
	@Test public void test_6477() {
		checkNotSubtype("X<X|[Y<X|Y>]>","any|int");
	}
	@Test public void test_6478() {
		checkNotSubtype("X<X|[Y<X|Y>]>","any|X<[X]>");
	}
	@Test public void test_6479() {
		checkNotSubtype("X<X|[Y<X|Y>]>","any|[any]");
	}
	@Test public void test_6480() {
		checkNotSubtype("X<X|[Y<X|Y>]>","any|(X<any|X>)");
	}
	@Test public void test_6481() {
		checkNotSubtype("X<X|[Y<X|Y>]>","null|void");
	}
	@Test public void test_6482() {
		checkNotSubtype("X<X|[Y<X|Y>]>","null|any");
	}
	@Test public void test_6483() {
		checkNotSubtype("X<X|[Y<X|Y>]>","null|null");
	}
	@Test public void test_6484() {
		checkNotSubtype("X<X|[Y<X|Y>]>","null|int");
	}
	@Test public void test_6485() {
		checkNotSubtype("X<X|[Y<X|Y>]>","null|X<[X]>");
	}
	@Test public void test_6486() {
		checkNotSubtype("X<X|[Y<X|Y>]>","null|[null]");
	}
	@Test public void test_6487() {
		checkNotSubtype("X<X|[Y<X|Y>]>","null|(X<null|X>)");
	}
	@Test public void test_6488() {
		checkNotSubtype("X<X|[Y<X|Y>]>","int|void");
	}
	@Test public void test_6489() {
		checkNotSubtype("X<X|[Y<X|Y>]>","int|any");
	}
	@Test public void test_6490() {
		checkNotSubtype("X<X|[Y<X|Y>]>","int|null");
	}
	@Test public void test_6491() {
		checkNotSubtype("X<X|[Y<X|Y>]>","int|int");
	}
	@Test public void test_6492() {
		checkNotSubtype("X<X|[Y<X|Y>]>","int|X<[X]>");
	}
	@Test public void test_6493() {
		checkNotSubtype("X<X|[Y<X|Y>]>","int|[int]");
	}
	@Test public void test_6494() {
		checkNotSubtype("X<X|[Y<X|Y>]>","int|(X<int|X>)");
	}
	@Test public void test_6495() {
		checkIsSubtype("X<X|[Y<X|Y>]>","[void]|void");
	}
	@Test public void test_6496() {
		checkIsSubtype("X<X|[Y<X|Y>]>","X<[X]>|void");
	}
	@Test public void test_6497() {
		checkIsSubtype("X<X|[Y<X|Y>]>","X<X|[void]>");
	}
	@Test public void test_6498() {
		checkNotSubtype("X<X|[Y<X|Y>]>","[any]|any");
	}
	@Test public void test_6499() {
		checkNotSubtype("X<X|[Y<X|Y>]>","X<[X]>|any");
	}
	@Test public void test_6500() {
		checkNotSubtype("X<X|[Y<X|Y>]>","X<X|[any]>");
	}
	@Test public void test_6501() {
		checkNotSubtype("X<X|[Y<X|Y>]>","[null]|null");
	}
	@Test public void test_6502() {
		checkNotSubtype("X<X|[Y<X|Y>]>","X<[X]>|null");
	}
	@Test public void test_6503() {
		checkNotSubtype("X<X|[Y<X|Y>]>","X<X|[null]>");
	}
	@Test public void test_6504() {
		checkNotSubtype("X<X|[Y<X|Y>]>","[int]|int");
	}
	@Test public void test_6505() {
		checkNotSubtype("X<X|[Y<X|Y>]>","X<[X]>|int");
	}
	@Test public void test_6506() {
		checkNotSubtype("X<X|[Y<X|Y>]>","X<X|[int]>");
	}
	@Test public void test_6507() {
		checkIsSubtype("X<X|[Y<X|Y>]>","[X<[X]>]|X<[X]>");
	}
	@Test public void test_6508() {
		checkIsSubtype("X<X|[Y<X|Y>]>","X<[X]>|Y<[Y]>");
	}
	@Test public void test_6509() {
		checkIsSubtype("X<X|[Y<X|Y>]>","X<[X]>|[X<[X]>]");
	}
	@Test public void test_6510() {
		checkIsSubtype("X<X|[Y<X|Y>]>","X<X|[Y<[Y]>]>");
	}
	@Test public void test_6511() {
		checkIsSubtype("X<X|[Y<X|Y>]>","X<X|[[X]]>");
	}
	@Test public void test_6512() {
		checkIsSubtype("X<X|[Y<X|Y>]>","X<[X]>|(Y<X<[X]>|Y>)");
	}
	@Test public void test_6513() {
		checkIsSubtype("X<X|[Y<X|Y>]>","X<X|[Y<X|Y>]>");
	}
	@Test public void test_6514() {
		checkIsSubtype("X<X|[Y<X|Y>]>","(X<X|void>)|void");
	}
	@Test public void test_6515() {
		checkIsSubtype("X<X|[Y<X|Y>]>","X<X|(Y<Y|void>)>");
	}
	@Test public void test_6516() {
		checkNotSubtype("X<X|[Y<X|Y>]>","(X<X|any>)|any");
	}
	@Test public void test_6517() {
		checkNotSubtype("X<X|[Y<X|Y>]>","X<X|(Y<Y|any>)>");
	}
	@Test public void test_6518() {
		checkNotSubtype("X<X|[Y<X|Y>]>","(X<X|null>)|null");
	}
	@Test public void test_6519() {
		checkNotSubtype("X<X|[Y<X|Y>]>","X<X|(Y<Y|null>)>");
	}
	@Test public void test_6520() {
		checkNotSubtype("X<X|[Y<X|Y>]>","(X<X|int>)|int");
	}
	@Test public void test_6521() {
		checkNotSubtype("X<X|[Y<X|Y>]>","X<X|(Y<Y|int>)>");
	}
	@Test public void test_6522() {
		checkIsSubtype("X<X|[Y<X|Y>]>","(X<X|Y<[Y]>>)|Y<[Y]>");
	}
	@Test public void test_6523() {
		checkIsSubtype("X<X|[Y<X|Y>]>","X<X|(Y<Y|Z<[Z]>>)>");
	}
	@Test public void test_6524() {
		checkIsSubtype("X<X|[Y<X|Y>]>","X<X|(Y<Y|[X]>)>");
	}
	@Test public void test_6525() {
		checkIsSubtype("X<X|[Y<X|Y>]>","X<X|(Y<Y|(Z<X|Z>)>)>");
	}
	@Test public void test_6526() {
		checkNotSubtype("(X<X|void>)|void","any");
	}
	@Test public void test_6527() {
		checkNotSubtype("(X<X|void>)|void","null");
	}
	@Test public void test_6528() {
		checkNotSubtype("(X<X|void>)|void","int");
	}
	@Test public void test_6529() {
		checkNotSubtype("(X<X|void>)|void","X<[X]>");
	}
	@Test public void test_6530() {
		checkNotSubtype("(X<X|void>)|void","[void]");
	}
	@Test public void test_6531() {
		checkNotSubtype("(X<X|void>)|void","[any]");
	}
	@Test public void test_6532() {
		checkNotSubtype("(X<X|void>)|void","[null]");
	}
	@Test public void test_6533() {
		checkNotSubtype("(X<X|void>)|void","[int]");
	}
	@Test public void test_6534() {
		checkNotSubtype("(X<X|void>)|void","[X<[X]>]");
	}
	@Test public void test_6535() {
		checkIsSubtype("(X<X|void>)|void","X<X|void>");
	}
	@Test public void test_6536() {
		checkNotSubtype("(X<X|void>)|void","X<X|any>");
	}
	@Test public void test_6537() {
		checkNotSubtype("(X<X|void>)|void","X<X|null>");
	}
	@Test public void test_6538() {
		checkNotSubtype("(X<X|void>)|void","X<X|int>");
	}
	@Test public void test_6539() {
		checkNotSubtype("(X<X|void>)|void","X<X|Y<[Y]>>");
	}
	@Test public void test_6540() {
		checkNotSubtype("(X<X|void>)|void","[[void]]");
	}
	@Test public void test_6541() {
		checkNotSubtype("(X<X|void>)|void","[[any]]");
	}
	@Test public void test_6542() {
		checkNotSubtype("(X<X|void>)|void","[[null]]");
	}
	@Test public void test_6543() {
		checkNotSubtype("(X<X|void>)|void","[[int]]");
	}
	@Test public void test_6544() {
		checkNotSubtype("(X<X|void>)|void","[[X<[X]>]]");
	}
	@Test public void test_6545() {
		checkNotSubtype("(X<X|void>)|void","X<[[[X]]]>");
	}
	@Test public void test_6546() {
		checkNotSubtype("(X<X|void>)|void","X<[[Y<X|Y>]]>");
	}
	@Test public void test_6547() {
		checkNotSubtype("(X<X|void>)|void","[X<X|void>]");
	}
	@Test public void test_6548() {
		checkNotSubtype("(X<X|void>)|void","[X<X|any>]");
	}
	@Test public void test_6549() {
		checkNotSubtype("(X<X|void>)|void","[X<X|null>]");
	}
	@Test public void test_6550() {
		checkNotSubtype("(X<X|void>)|void","[X<X|int>]");
	}
	@Test public void test_6551() {
		checkNotSubtype("(X<X|void>)|void","[X<X|Y<[Y]>>]");
	}
	@Test public void test_6552() {
		checkNotSubtype("(X<X|void>)|void","X<[Y<Y|[X]>]>");
	}
	@Test public void test_6553() {
		checkNotSubtype("(X<X|void>)|void","X<[Y<Y|(Z<X|Z>)>]>");
	}
	@Test public void test_6554() {
		checkIsSubtype("(X<X|void>)|void","void|void");
	}
	@Test public void test_6555() {
		checkNotSubtype("(X<X|void>)|void","void|any");
	}
	@Test public void test_6556() {
		checkNotSubtype("(X<X|void>)|void","void|null");
	}
	@Test public void test_6557() {
		checkNotSubtype("(X<X|void>)|void","void|int");
	}
	@Test public void test_6558() {
		checkNotSubtype("(X<X|void>)|void","void|X<[X]>");
	}
	@Test public void test_6559() {
		checkNotSubtype("(X<X|void>)|void","void|[void]");
	}
	@Test public void test_6560() {
		checkIsSubtype("(X<X|void>)|void","void|(X<void|X>)");
	}
	@Test public void test_6561() {
		checkNotSubtype("(X<X|void>)|void","any|void");
	}
	@Test public void test_6562() {
		checkNotSubtype("(X<X|void>)|void","any|any");
	}
	@Test public void test_6563() {
		checkNotSubtype("(X<X|void>)|void","any|null");
	}
	@Test public void test_6564() {
		checkNotSubtype("(X<X|void>)|void","any|int");
	}
	@Test public void test_6565() {
		checkNotSubtype("(X<X|void>)|void","any|X<[X]>");
	}
	@Test public void test_6566() {
		checkNotSubtype("(X<X|void>)|void","any|[any]");
	}
	@Test public void test_6567() {
		checkNotSubtype("(X<X|void>)|void","any|(X<any|X>)");
	}
	@Test public void test_6568() {
		checkNotSubtype("(X<X|void>)|void","null|void");
	}
	@Test public void test_6569() {
		checkNotSubtype("(X<X|void>)|void","null|any");
	}
	@Test public void test_6570() {
		checkNotSubtype("(X<X|void>)|void","null|null");
	}
	@Test public void test_6571() {
		checkNotSubtype("(X<X|void>)|void","null|int");
	}
	@Test public void test_6572() {
		checkNotSubtype("(X<X|void>)|void","null|X<[X]>");
	}
	@Test public void test_6573() {
		checkNotSubtype("(X<X|void>)|void","null|[null]");
	}
	@Test public void test_6574() {
		checkNotSubtype("(X<X|void>)|void","null|(X<null|X>)");
	}
	@Test public void test_6575() {
		checkNotSubtype("(X<X|void>)|void","int|void");
	}
	@Test public void test_6576() {
		checkNotSubtype("(X<X|void>)|void","int|any");
	}
	@Test public void test_6577() {
		checkNotSubtype("(X<X|void>)|void","int|null");
	}
	@Test public void test_6578() {
		checkNotSubtype("(X<X|void>)|void","int|int");
	}
	@Test public void test_6579() {
		checkNotSubtype("(X<X|void>)|void","int|X<[X]>");
	}
	@Test public void test_6580() {
		checkNotSubtype("(X<X|void>)|void","int|[int]");
	}
	@Test public void test_6581() {
		checkNotSubtype("(X<X|void>)|void","int|(X<int|X>)");
	}
	@Test public void test_6582() {
		checkNotSubtype("(X<X|void>)|void","[void]|void");
	}
	@Test public void test_6583() {
		checkNotSubtype("(X<X|void>)|void","X<[X]>|void");
	}
	@Test public void test_6584() {
		checkNotSubtype("(X<X|void>)|void","X<X|[void]>");
	}
	@Test public void test_6585() {
		checkNotSubtype("(X<X|void>)|void","[any]|any");
	}
	@Test public void test_6586() {
		checkNotSubtype("(X<X|void>)|void","X<[X]>|any");
	}
	@Test public void test_6587() {
		checkNotSubtype("(X<X|void>)|void","X<X|[any]>");
	}
	@Test public void test_6588() {
		checkNotSubtype("(X<X|void>)|void","[null]|null");
	}
	@Test public void test_6589() {
		checkNotSubtype("(X<X|void>)|void","X<[X]>|null");
	}
	@Test public void test_6590() {
		checkNotSubtype("(X<X|void>)|void","X<X|[null]>");
	}
	@Test public void test_6591() {
		checkNotSubtype("(X<X|void>)|void","[int]|int");
	}
	@Test public void test_6592() {
		checkNotSubtype("(X<X|void>)|void","X<[X]>|int");
	}
	@Test public void test_6593() {
		checkNotSubtype("(X<X|void>)|void","X<X|[int]>");
	}
	@Test public void test_6594() {
		checkNotSubtype("(X<X|void>)|void","[X<[X]>]|X<[X]>");
	}
	@Test public void test_6595() {
		checkNotSubtype("(X<X|void>)|void","X<[X]>|Y<[Y]>");
	}
	@Test public void test_6596() {
		checkNotSubtype("(X<X|void>)|void","X<[X]>|[X<[X]>]");
	}
	@Test public void test_6597() {
		checkNotSubtype("(X<X|void>)|void","X<X|[Y<[Y]>]>");
	}
	@Test public void test_6598() {
		checkNotSubtype("(X<X|void>)|void","X<X|[[X]]>");
	}
	@Test public void test_6599() {
		checkNotSubtype("(X<X|void>)|void","X<[X]>|(Y<X<[X]>|Y>)");
	}
	@Test public void test_6600() {
		checkNotSubtype("(X<X|void>)|void","X<X|[Y<X|Y>]>");
	}
	@Test public void test_6601() {
		checkIsSubtype("(X<X|void>)|void","(X<X|void>)|void");
	}
	@Test public void test_6602() {
		checkIsSubtype("(X<X|void>)|void","X<X|(Y<Y|void>)>");
	}
	@Test public void test_6603() {
		checkNotSubtype("(X<X|void>)|void","(X<X|any>)|any");
	}
	@Test public void test_6604() {
		checkNotSubtype("(X<X|void>)|void","X<X|(Y<Y|any>)>");
	}
	@Test public void test_6605() {
		checkNotSubtype("(X<X|void>)|void","(X<X|null>)|null");
	}
	@Test public void test_6606() {
		checkNotSubtype("(X<X|void>)|void","X<X|(Y<Y|null>)>");
	}
	@Test public void test_6607() {
		checkNotSubtype("(X<X|void>)|void","(X<X|int>)|int");
	}
	@Test public void test_6608() {
		checkNotSubtype("(X<X|void>)|void","X<X|(Y<Y|int>)>");
	}
	@Test public void test_6609() {
		checkNotSubtype("(X<X|void>)|void","(X<X|Y<[Y]>>)|Y<[Y]>");
	}
	@Test public void test_6610() {
		checkNotSubtype("(X<X|void>)|void","X<X|(Y<Y|Z<[Z]>>)>");
	}
	@Test public void test_6611() {
		checkNotSubtype("(X<X|void>)|void","X<X|(Y<Y|[X]>)>");
	}
	@Test public void test_6612() {
		checkIsSubtype("(X<X|void>)|void","X<X|(Y<Y|(Z<X|Z>)>)>");
	}
	@Test public void test_6613() {
		checkNotSubtype("X<X|(Y<Y|void>)>","any");
	}
	@Test public void test_6614() {
		checkNotSubtype("X<X|(Y<Y|void>)>","null");
	}
	@Test public void test_6615() {
		checkNotSubtype("X<X|(Y<Y|void>)>","int");
	}
	@Test public void test_6616() {
		checkNotSubtype("X<X|(Y<Y|void>)>","X<[X]>");
	}
	@Test public void test_6617() {
		checkNotSubtype("X<X|(Y<Y|void>)>","[void]");
	}
	@Test public void test_6618() {
		checkNotSubtype("X<X|(Y<Y|void>)>","[any]");
	}
	@Test public void test_6619() {
		checkNotSubtype("X<X|(Y<Y|void>)>","[null]");
	}
	@Test public void test_6620() {
		checkNotSubtype("X<X|(Y<Y|void>)>","[int]");
	}
	@Test public void test_6621() {
		checkNotSubtype("X<X|(Y<Y|void>)>","[X<[X]>]");
	}
	@Test public void test_6622() {
		checkIsSubtype("X<X|(Y<Y|void>)>","X<X|void>");
	}
	@Test public void test_6623() {
		checkNotSubtype("X<X|(Y<Y|void>)>","X<X|any>");
	}
	@Test public void test_6624() {
		checkNotSubtype("X<X|(Y<Y|void>)>","X<X|null>");
	}
	@Test public void test_6625() {
		checkNotSubtype("X<X|(Y<Y|void>)>","X<X|int>");
	}
	@Test public void test_6626() {
		checkNotSubtype("X<X|(Y<Y|void>)>","X<X|Y<[Y]>>");
	}
	@Test public void test_6627() {
		checkNotSubtype("X<X|(Y<Y|void>)>","[[void]]");
	}
	@Test public void test_6628() {
		checkNotSubtype("X<X|(Y<Y|void>)>","[[any]]");
	}
	@Test public void test_6629() {
		checkNotSubtype("X<X|(Y<Y|void>)>","[[null]]");
	}
	@Test public void test_6630() {
		checkNotSubtype("X<X|(Y<Y|void>)>","[[int]]");
	}
	@Test public void test_6631() {
		checkNotSubtype("X<X|(Y<Y|void>)>","[[X<[X]>]]");
	}
	@Test public void test_6632() {
		checkNotSubtype("X<X|(Y<Y|void>)>","X<[[[X]]]>");
	}
	@Test public void test_6633() {
		checkNotSubtype("X<X|(Y<Y|void>)>","X<[[Y<X|Y>]]>");
	}
	@Test public void test_6634() {
		checkNotSubtype("X<X|(Y<Y|void>)>","[X<X|void>]");
	}
	@Test public void test_6635() {
		checkNotSubtype("X<X|(Y<Y|void>)>","[X<X|any>]");
	}
	@Test public void test_6636() {
		checkNotSubtype("X<X|(Y<Y|void>)>","[X<X|null>]");
	}
	@Test public void test_6637() {
		checkNotSubtype("X<X|(Y<Y|void>)>","[X<X|int>]");
	}
	@Test public void test_6638() {
		checkNotSubtype("X<X|(Y<Y|void>)>","[X<X|Y<[Y]>>]");
	}
	@Test public void test_6639() {
		checkNotSubtype("X<X|(Y<Y|void>)>","X<[Y<Y|[X]>]>");
	}
	@Test public void test_6640() {
		checkNotSubtype("X<X|(Y<Y|void>)>","X<[Y<Y|(Z<X|Z>)>]>");
	}
	@Test public void test_6641() {
		checkIsSubtype("X<X|(Y<Y|void>)>","void|void");
	}
	@Test public void test_6642() {
		checkNotSubtype("X<X|(Y<Y|void>)>","void|any");
	}
	@Test public void test_6643() {
		checkNotSubtype("X<X|(Y<Y|void>)>","void|null");
	}
	@Test public void test_6644() {
		checkNotSubtype("X<X|(Y<Y|void>)>","void|int");
	}
	@Test public void test_6645() {
		checkNotSubtype("X<X|(Y<Y|void>)>","void|X<[X]>");
	}
	@Test public void test_6646() {
		checkNotSubtype("X<X|(Y<Y|void>)>","void|[void]");
	}
	@Test public void test_6647() {
		checkIsSubtype("X<X|(Y<Y|void>)>","void|(X<void|X>)");
	}
	@Test public void test_6648() {
		checkNotSubtype("X<X|(Y<Y|void>)>","any|void");
	}
	@Test public void test_6649() {
		checkNotSubtype("X<X|(Y<Y|void>)>","any|any");
	}
	@Test public void test_6650() {
		checkNotSubtype("X<X|(Y<Y|void>)>","any|null");
	}
	@Test public void test_6651() {
		checkNotSubtype("X<X|(Y<Y|void>)>","any|int");
	}
	@Test public void test_6652() {
		checkNotSubtype("X<X|(Y<Y|void>)>","any|X<[X]>");
	}
	@Test public void test_6653() {
		checkNotSubtype("X<X|(Y<Y|void>)>","any|[any]");
	}
	@Test public void test_6654() {
		checkNotSubtype("X<X|(Y<Y|void>)>","any|(X<any|X>)");
	}
	@Test public void test_6655() {
		checkNotSubtype("X<X|(Y<Y|void>)>","null|void");
	}
	@Test public void test_6656() {
		checkNotSubtype("X<X|(Y<Y|void>)>","null|any");
	}
	@Test public void test_6657() {
		checkNotSubtype("X<X|(Y<Y|void>)>","null|null");
	}
	@Test public void test_6658() {
		checkNotSubtype("X<X|(Y<Y|void>)>","null|int");
	}
	@Test public void test_6659() {
		checkNotSubtype("X<X|(Y<Y|void>)>","null|X<[X]>");
	}
	@Test public void test_6660() {
		checkNotSubtype("X<X|(Y<Y|void>)>","null|[null]");
	}
	@Test public void test_6661() {
		checkNotSubtype("X<X|(Y<Y|void>)>","null|(X<null|X>)");
	}
	@Test public void test_6662() {
		checkNotSubtype("X<X|(Y<Y|void>)>","int|void");
	}
	@Test public void test_6663() {
		checkNotSubtype("X<X|(Y<Y|void>)>","int|any");
	}
	@Test public void test_6664() {
		checkNotSubtype("X<X|(Y<Y|void>)>","int|null");
	}
	@Test public void test_6665() {
		checkNotSubtype("X<X|(Y<Y|void>)>","int|int");
	}
	@Test public void test_6666() {
		checkNotSubtype("X<X|(Y<Y|void>)>","int|X<[X]>");
	}
	@Test public void test_6667() {
		checkNotSubtype("X<X|(Y<Y|void>)>","int|[int]");
	}
	@Test public void test_6668() {
		checkNotSubtype("X<X|(Y<Y|void>)>","int|(X<int|X>)");
	}
	@Test public void test_6669() {
		checkNotSubtype("X<X|(Y<Y|void>)>","[void]|void");
	}
	@Test public void test_6670() {
		checkNotSubtype("X<X|(Y<Y|void>)>","X<[X]>|void");
	}
	@Test public void test_6671() {
		checkNotSubtype("X<X|(Y<Y|void>)>","X<X|[void]>");
	}
	@Test public void test_6672() {
		checkNotSubtype("X<X|(Y<Y|void>)>","[any]|any");
	}
	@Test public void test_6673() {
		checkNotSubtype("X<X|(Y<Y|void>)>","X<[X]>|any");
	}
	@Test public void test_6674() {
		checkNotSubtype("X<X|(Y<Y|void>)>","X<X|[any]>");
	}
	@Test public void test_6675() {
		checkNotSubtype("X<X|(Y<Y|void>)>","[null]|null");
	}
	@Test public void test_6676() {
		checkNotSubtype("X<X|(Y<Y|void>)>","X<[X]>|null");
	}
	@Test public void test_6677() {
		checkNotSubtype("X<X|(Y<Y|void>)>","X<X|[null]>");
	}
	@Test public void test_6678() {
		checkNotSubtype("X<X|(Y<Y|void>)>","[int]|int");
	}
	@Test public void test_6679() {
		checkNotSubtype("X<X|(Y<Y|void>)>","X<[X]>|int");
	}
	@Test public void test_6680() {
		checkNotSubtype("X<X|(Y<Y|void>)>","X<X|[int]>");
	}
	@Test public void test_6681() {
		checkNotSubtype("X<X|(Y<Y|void>)>","[X<[X]>]|X<[X]>");
	}
	@Test public void test_6682() {
		checkNotSubtype("X<X|(Y<Y|void>)>","X<[X]>|Y<[Y]>");
	}
	@Test public void test_6683() {
		checkNotSubtype("X<X|(Y<Y|void>)>","X<[X]>|[X<[X]>]");
	}
	@Test public void test_6684() {
		checkNotSubtype("X<X|(Y<Y|void>)>","X<X|[Y<[Y]>]>");
	}
	@Test public void test_6685() {
		checkNotSubtype("X<X|(Y<Y|void>)>","X<X|[[X]]>");
	}
	@Test public void test_6686() {
		checkNotSubtype("X<X|(Y<Y|void>)>","X<[X]>|(Y<X<[X]>|Y>)");
	}
	@Test public void test_6687() {
		checkNotSubtype("X<X|(Y<Y|void>)>","X<X|[Y<X|Y>]>");
	}
	@Test public void test_6688() {
		checkIsSubtype("X<X|(Y<Y|void>)>","(X<X|void>)|void");
	}
	@Test public void test_6689() {
		checkIsSubtype("X<X|(Y<Y|void>)>","X<X|(Y<Y|void>)>");
	}
	@Test public void test_6690() {
		checkNotSubtype("X<X|(Y<Y|void>)>","(X<X|any>)|any");
	}
	@Test public void test_6691() {
		checkNotSubtype("X<X|(Y<Y|void>)>","X<X|(Y<Y|any>)>");
	}
	@Test public void test_6692() {
		checkNotSubtype("X<X|(Y<Y|void>)>","(X<X|null>)|null");
	}
	@Test public void test_6693() {
		checkNotSubtype("X<X|(Y<Y|void>)>","X<X|(Y<Y|null>)>");
	}
	@Test public void test_6694() {
		checkNotSubtype("X<X|(Y<Y|void>)>","(X<X|int>)|int");
	}
	@Test public void test_6695() {
		checkNotSubtype("X<X|(Y<Y|void>)>","X<X|(Y<Y|int>)>");
	}
	@Test public void test_6696() {
		checkNotSubtype("X<X|(Y<Y|void>)>","(X<X|Y<[Y]>>)|Y<[Y]>");
	}
	@Test public void test_6697() {
		checkNotSubtype("X<X|(Y<Y|void>)>","X<X|(Y<Y|Z<[Z]>>)>");
	}
	@Test public void test_6698() {
		checkNotSubtype("X<X|(Y<Y|void>)>","X<X|(Y<Y|[X]>)>");
	}
	@Test public void test_6699() {
		checkIsSubtype("X<X|(Y<Y|void>)>","X<X|(Y<Y|(Z<X|Z>)>)>");
	}
	@Test public void test_6700() {
		checkIsSubtype("(X<X|any>)|any","any");
	}
	@Test public void test_6701() {
		checkIsSubtype("(X<X|any>)|any","null");
	}
	@Test public void test_6702() {
		checkIsSubtype("(X<X|any>)|any","int");
	}
	@Test public void test_6703() {
		checkIsSubtype("(X<X|any>)|any","X<[X]>");
	}
	@Test public void test_6704() {
		checkIsSubtype("(X<X|any>)|any","[void]");
	}
	@Test public void test_6705() {
		checkIsSubtype("(X<X|any>)|any","[any]");
	}
	@Test public void test_6706() {
		checkIsSubtype("(X<X|any>)|any","[null]");
	}
	@Test public void test_6707() {
		checkIsSubtype("(X<X|any>)|any","[int]");
	}
	@Test public void test_6708() {
		checkIsSubtype("(X<X|any>)|any","[X<[X]>]");
	}
	@Test public void test_6709() {
		checkIsSubtype("(X<X|any>)|any","X<X|void>");
	}
	@Test public void test_6710() {
		checkIsSubtype("(X<X|any>)|any","X<X|any>");
	}
	@Test public void test_6711() {
		checkIsSubtype("(X<X|any>)|any","X<X|null>");
	}
	@Test public void test_6712() {
		checkIsSubtype("(X<X|any>)|any","X<X|int>");
	}
	@Test public void test_6713() {
		checkIsSubtype("(X<X|any>)|any","X<X|Y<[Y]>>");
	}
	@Test public void test_6714() {
		checkIsSubtype("(X<X|any>)|any","[[void]]");
	}
	@Test public void test_6715() {
		checkIsSubtype("(X<X|any>)|any","[[any]]");
	}
	@Test public void test_6716() {
		checkIsSubtype("(X<X|any>)|any","[[null]]");
	}
	@Test public void test_6717() {
		checkIsSubtype("(X<X|any>)|any","[[int]]");
	}
	@Test public void test_6718() {
		checkIsSubtype("(X<X|any>)|any","[[X<[X]>]]");
	}
	@Test public void test_6719() {
		checkIsSubtype("(X<X|any>)|any","X<[[[X]]]>");
	}
	@Test public void test_6720() {
		checkIsSubtype("(X<X|any>)|any","X<[[Y<X|Y>]]>");
	}
	@Test public void test_6721() {
		checkIsSubtype("(X<X|any>)|any","[X<X|void>]");
	}
	@Test public void test_6722() {
		checkIsSubtype("(X<X|any>)|any","[X<X|any>]");
	}
	@Test public void test_6723() {
		checkIsSubtype("(X<X|any>)|any","[X<X|null>]");
	}
	@Test public void test_6724() {
		checkIsSubtype("(X<X|any>)|any","[X<X|int>]");
	}
	@Test public void test_6725() {
		checkIsSubtype("(X<X|any>)|any","[X<X|Y<[Y]>>]");
	}
	@Test public void test_6726() {
		checkIsSubtype("(X<X|any>)|any","X<[Y<Y|[X]>]>");
	}
	@Test public void test_6727() {
		checkIsSubtype("(X<X|any>)|any","X<[Y<Y|(Z<X|Z>)>]>");
	}
	@Test public void test_6728() {
		checkIsSubtype("(X<X|any>)|any","void|void");
	}
	@Test public void test_6729() {
		checkIsSubtype("(X<X|any>)|any","void|any");
	}
	@Test public void test_6730() {
		checkIsSubtype("(X<X|any>)|any","void|null");
	}
	@Test public void test_6731() {
		checkIsSubtype("(X<X|any>)|any","void|int");
	}
	@Test public void test_6732() {
		checkIsSubtype("(X<X|any>)|any","void|X<[X]>");
	}
	@Test public void test_6733() {
		checkIsSubtype("(X<X|any>)|any","void|[void]");
	}
	@Test public void test_6734() {
		checkIsSubtype("(X<X|any>)|any","void|(X<void|X>)");
	}
	@Test public void test_6735() {
		checkIsSubtype("(X<X|any>)|any","any|void");
	}
	@Test public void test_6736() {
		checkIsSubtype("(X<X|any>)|any","any|any");
	}
	@Test public void test_6737() {
		checkIsSubtype("(X<X|any>)|any","any|null");
	}
	@Test public void test_6738() {
		checkIsSubtype("(X<X|any>)|any","any|int");
	}
	@Test public void test_6739() {
		checkIsSubtype("(X<X|any>)|any","any|X<[X]>");
	}
	@Test public void test_6740() {
		checkIsSubtype("(X<X|any>)|any","any|[any]");
	}
	@Test public void test_6741() {
		checkIsSubtype("(X<X|any>)|any","any|(X<any|X>)");
	}
	@Test public void test_6742() {
		checkIsSubtype("(X<X|any>)|any","null|void");
	}
	@Test public void test_6743() {
		checkIsSubtype("(X<X|any>)|any","null|any");
	}
	@Test public void test_6744() {
		checkIsSubtype("(X<X|any>)|any","null|null");
	}
	@Test public void test_6745() {
		checkIsSubtype("(X<X|any>)|any","null|int");
	}
	@Test public void test_6746() {
		checkIsSubtype("(X<X|any>)|any","null|X<[X]>");
	}
	@Test public void test_6747() {
		checkIsSubtype("(X<X|any>)|any","null|[null]");
	}
	@Test public void test_6748() {
		checkIsSubtype("(X<X|any>)|any","null|(X<null|X>)");
	}
	@Test public void test_6749() {
		checkIsSubtype("(X<X|any>)|any","int|void");
	}
	@Test public void test_6750() {
		checkIsSubtype("(X<X|any>)|any","int|any");
	}
	@Test public void test_6751() {
		checkIsSubtype("(X<X|any>)|any","int|null");
	}
	@Test public void test_6752() {
		checkIsSubtype("(X<X|any>)|any","int|int");
	}
	@Test public void test_6753() {
		checkIsSubtype("(X<X|any>)|any","int|X<[X]>");
	}
	@Test public void test_6754() {
		checkIsSubtype("(X<X|any>)|any","int|[int]");
	}
	@Test public void test_6755() {
		checkIsSubtype("(X<X|any>)|any","int|(X<int|X>)");
	}
	@Test public void test_6756() {
		checkIsSubtype("(X<X|any>)|any","[void]|void");
	}
	@Test public void test_6757() {
		checkIsSubtype("(X<X|any>)|any","X<[X]>|void");
	}
	@Test public void test_6758() {
		checkIsSubtype("(X<X|any>)|any","X<X|[void]>");
	}
	@Test public void test_6759() {
		checkIsSubtype("(X<X|any>)|any","[any]|any");
	}
	@Test public void test_6760() {
		checkIsSubtype("(X<X|any>)|any","X<[X]>|any");
	}
	@Test public void test_6761() {
		checkIsSubtype("(X<X|any>)|any","X<X|[any]>");
	}
	@Test public void test_6762() {
		checkIsSubtype("(X<X|any>)|any","[null]|null");
	}
	@Test public void test_6763() {
		checkIsSubtype("(X<X|any>)|any","X<[X]>|null");
	}
	@Test public void test_6764() {
		checkIsSubtype("(X<X|any>)|any","X<X|[null]>");
	}
	@Test public void test_6765() {
		checkIsSubtype("(X<X|any>)|any","[int]|int");
	}
	@Test public void test_6766() {
		checkIsSubtype("(X<X|any>)|any","X<[X]>|int");
	}
	@Test public void test_6767() {
		checkIsSubtype("(X<X|any>)|any","X<X|[int]>");
	}
	@Test public void test_6768() {
		checkIsSubtype("(X<X|any>)|any","[X<[X]>]|X<[X]>");
	}
	@Test public void test_6769() {
		checkIsSubtype("(X<X|any>)|any","X<[X]>|Y<[Y]>");
	}
	@Test public void test_6770() {
		checkIsSubtype("(X<X|any>)|any","X<[X]>|[X<[X]>]");
	}
	@Test public void test_6771() {
		checkIsSubtype("(X<X|any>)|any","X<X|[Y<[Y]>]>");
	}
	@Test public void test_6772() {
		checkIsSubtype("(X<X|any>)|any","X<X|[[X]]>");
	}
	@Test public void test_6773() {
		checkIsSubtype("(X<X|any>)|any","X<[X]>|(Y<X<[X]>|Y>)");
	}
	@Test public void test_6774() {
		checkIsSubtype("(X<X|any>)|any","X<X|[Y<X|Y>]>");
	}
	@Test public void test_6775() {
		checkIsSubtype("(X<X|any>)|any","(X<X|void>)|void");
	}
	@Test public void test_6776() {
		checkIsSubtype("(X<X|any>)|any","X<X|(Y<Y|void>)>");
	}
	@Test public void test_6777() {
		checkIsSubtype("(X<X|any>)|any","(X<X|any>)|any");
	}
	@Test public void test_6778() {
		checkIsSubtype("(X<X|any>)|any","X<X|(Y<Y|any>)>");
	}
	@Test public void test_6779() {
		checkIsSubtype("(X<X|any>)|any","(X<X|null>)|null");
	}
	@Test public void test_6780() {
		checkIsSubtype("(X<X|any>)|any","X<X|(Y<Y|null>)>");
	}
	@Test public void test_6781() {
		checkIsSubtype("(X<X|any>)|any","(X<X|int>)|int");
	}
	@Test public void test_6782() {
		checkIsSubtype("(X<X|any>)|any","X<X|(Y<Y|int>)>");
	}
	@Test public void test_6783() {
		checkIsSubtype("(X<X|any>)|any","(X<X|Y<[Y]>>)|Y<[Y]>");
	}
	@Test public void test_6784() {
		checkIsSubtype("(X<X|any>)|any","X<X|(Y<Y|Z<[Z]>>)>");
	}
	@Test public void test_6785() {
		checkIsSubtype("(X<X|any>)|any","X<X|(Y<Y|[X]>)>");
	}
	@Test public void test_6786() {
		checkIsSubtype("(X<X|any>)|any","X<X|(Y<Y|(Z<X|Z>)>)>");
	}
	@Test public void test_6787() {
		checkIsSubtype("X<X|(Y<Y|any>)>","any");
	}
	@Test public void test_6788() {
		checkIsSubtype("X<X|(Y<Y|any>)>","null");
	}
	@Test public void test_6789() {
		checkIsSubtype("X<X|(Y<Y|any>)>","int");
	}
	@Test public void test_6790() {
		checkIsSubtype("X<X|(Y<Y|any>)>","X<[X]>");
	}
	@Test public void test_6791() {
		checkIsSubtype("X<X|(Y<Y|any>)>","[void]");
	}
	@Test public void test_6792() {
		checkIsSubtype("X<X|(Y<Y|any>)>","[any]");
	}
	@Test public void test_6793() {
		checkIsSubtype("X<X|(Y<Y|any>)>","[null]");
	}
	@Test public void test_6794() {
		checkIsSubtype("X<X|(Y<Y|any>)>","[int]");
	}
	@Test public void test_6795() {
		checkIsSubtype("X<X|(Y<Y|any>)>","[X<[X]>]");
	}
	@Test public void test_6796() {
		checkIsSubtype("X<X|(Y<Y|any>)>","X<X|void>");
	}
	@Test public void test_6797() {
		checkIsSubtype("X<X|(Y<Y|any>)>","X<X|any>");
	}
	@Test public void test_6798() {
		checkIsSubtype("X<X|(Y<Y|any>)>","X<X|null>");
	}
	@Test public void test_6799() {
		checkIsSubtype("X<X|(Y<Y|any>)>","X<X|int>");
	}
	@Test public void test_6800() {
		checkIsSubtype("X<X|(Y<Y|any>)>","X<X|Y<[Y]>>");
	}
	@Test public void test_6801() {
		checkIsSubtype("X<X|(Y<Y|any>)>","[[void]]");
	}
	@Test public void test_6802() {
		checkIsSubtype("X<X|(Y<Y|any>)>","[[any]]");
	}
	@Test public void test_6803() {
		checkIsSubtype("X<X|(Y<Y|any>)>","[[null]]");
	}
	@Test public void test_6804() {
		checkIsSubtype("X<X|(Y<Y|any>)>","[[int]]");
	}
	@Test public void test_6805() {
		checkIsSubtype("X<X|(Y<Y|any>)>","[[X<[X]>]]");
	}
	@Test public void test_6806() {
		checkIsSubtype("X<X|(Y<Y|any>)>","X<[[[X]]]>");
	}
	@Test public void test_6807() {
		checkIsSubtype("X<X|(Y<Y|any>)>","X<[[Y<X|Y>]]>");
	}
	@Test public void test_6808() {
		checkIsSubtype("X<X|(Y<Y|any>)>","[X<X|void>]");
	}
	@Test public void test_6809() {
		checkIsSubtype("X<X|(Y<Y|any>)>","[X<X|any>]");
	}
	@Test public void test_6810() {
		checkIsSubtype("X<X|(Y<Y|any>)>","[X<X|null>]");
	}
	@Test public void test_6811() {
		checkIsSubtype("X<X|(Y<Y|any>)>","[X<X|int>]");
	}
	@Test public void test_6812() {
		checkIsSubtype("X<X|(Y<Y|any>)>","[X<X|Y<[Y]>>]");
	}
	@Test public void test_6813() {
		checkIsSubtype("X<X|(Y<Y|any>)>","X<[Y<Y|[X]>]>");
	}
	@Test public void test_6814() {
		checkIsSubtype("X<X|(Y<Y|any>)>","X<[Y<Y|(Z<X|Z>)>]>");
	}
	@Test public void test_6815() {
		checkIsSubtype("X<X|(Y<Y|any>)>","void|void");
	}
	@Test public void test_6816() {
		checkIsSubtype("X<X|(Y<Y|any>)>","void|any");
	}
	@Test public void test_6817() {
		checkIsSubtype("X<X|(Y<Y|any>)>","void|null");
	}
	@Test public void test_6818() {
		checkIsSubtype("X<X|(Y<Y|any>)>","void|int");
	}
	@Test public void test_6819() {
		checkIsSubtype("X<X|(Y<Y|any>)>","void|X<[X]>");
	}
	@Test public void test_6820() {
		checkIsSubtype("X<X|(Y<Y|any>)>","void|[void]");
	}
	@Test public void test_6821() {
		checkIsSubtype("X<X|(Y<Y|any>)>","void|(X<void|X>)");
	}
	@Test public void test_6822() {
		checkIsSubtype("X<X|(Y<Y|any>)>","any|void");
	}
	@Test public void test_6823() {
		checkIsSubtype("X<X|(Y<Y|any>)>","any|any");
	}
	@Test public void test_6824() {
		checkIsSubtype("X<X|(Y<Y|any>)>","any|null");
	}
	@Test public void test_6825() {
		checkIsSubtype("X<X|(Y<Y|any>)>","any|int");
	}
	@Test public void test_6826() {
		checkIsSubtype("X<X|(Y<Y|any>)>","any|X<[X]>");
	}
	@Test public void test_6827() {
		checkIsSubtype("X<X|(Y<Y|any>)>","any|[any]");
	}
	@Test public void test_6828() {
		checkIsSubtype("X<X|(Y<Y|any>)>","any|(X<any|X>)");
	}
	@Test public void test_6829() {
		checkIsSubtype("X<X|(Y<Y|any>)>","null|void");
	}
	@Test public void test_6830() {
		checkIsSubtype("X<X|(Y<Y|any>)>","null|any");
	}
	@Test public void test_6831() {
		checkIsSubtype("X<X|(Y<Y|any>)>","null|null");
	}
	@Test public void test_6832() {
		checkIsSubtype("X<X|(Y<Y|any>)>","null|int");
	}
	@Test public void test_6833() {
		checkIsSubtype("X<X|(Y<Y|any>)>","null|X<[X]>");
	}
	@Test public void test_6834() {
		checkIsSubtype("X<X|(Y<Y|any>)>","null|[null]");
	}
	@Test public void test_6835() {
		checkIsSubtype("X<X|(Y<Y|any>)>","null|(X<null|X>)");
	}
	@Test public void test_6836() {
		checkIsSubtype("X<X|(Y<Y|any>)>","int|void");
	}
	@Test public void test_6837() {
		checkIsSubtype("X<X|(Y<Y|any>)>","int|any");
	}
	@Test public void test_6838() {
		checkIsSubtype("X<X|(Y<Y|any>)>","int|null");
	}
	@Test public void test_6839() {
		checkIsSubtype("X<X|(Y<Y|any>)>","int|int");
	}
	@Test public void test_6840() {
		checkIsSubtype("X<X|(Y<Y|any>)>","int|X<[X]>");
	}
	@Test public void test_6841() {
		checkIsSubtype("X<X|(Y<Y|any>)>","int|[int]");
	}
	@Test public void test_6842() {
		checkIsSubtype("X<X|(Y<Y|any>)>","int|(X<int|X>)");
	}
	@Test public void test_6843() {
		checkIsSubtype("X<X|(Y<Y|any>)>","[void]|void");
	}
	@Test public void test_6844() {
		checkIsSubtype("X<X|(Y<Y|any>)>","X<[X]>|void");
	}
	@Test public void test_6845() {
		checkIsSubtype("X<X|(Y<Y|any>)>","X<X|[void]>");
	}
	@Test public void test_6846() {
		checkIsSubtype("X<X|(Y<Y|any>)>","[any]|any");
	}
	@Test public void test_6847() {
		checkIsSubtype("X<X|(Y<Y|any>)>","X<[X]>|any");
	}
	@Test public void test_6848() {
		checkIsSubtype("X<X|(Y<Y|any>)>","X<X|[any]>");
	}
	@Test public void test_6849() {
		checkIsSubtype("X<X|(Y<Y|any>)>","[null]|null");
	}
	@Test public void test_6850() {
		checkIsSubtype("X<X|(Y<Y|any>)>","X<[X]>|null");
	}
	@Test public void test_6851() {
		checkIsSubtype("X<X|(Y<Y|any>)>","X<X|[null]>");
	}
	@Test public void test_6852() {
		checkIsSubtype("X<X|(Y<Y|any>)>","[int]|int");
	}
	@Test public void test_6853() {
		checkIsSubtype("X<X|(Y<Y|any>)>","X<[X]>|int");
	}
	@Test public void test_6854() {
		checkIsSubtype("X<X|(Y<Y|any>)>","X<X|[int]>");
	}
	@Test public void test_6855() {
		checkIsSubtype("X<X|(Y<Y|any>)>","[X<[X]>]|X<[X]>");
	}
	@Test public void test_6856() {
		checkIsSubtype("X<X|(Y<Y|any>)>","X<[X]>|Y<[Y]>");
	}
	@Test public void test_6857() {
		checkIsSubtype("X<X|(Y<Y|any>)>","X<[X]>|[X<[X]>]");
	}
	@Test public void test_6858() {
		checkIsSubtype("X<X|(Y<Y|any>)>","X<X|[Y<[Y]>]>");
	}
	@Test public void test_6859() {
		checkIsSubtype("X<X|(Y<Y|any>)>","X<X|[[X]]>");
	}
	@Test public void test_6860() {
		checkIsSubtype("X<X|(Y<Y|any>)>","X<[X]>|(Y<X<[X]>|Y>)");
	}
	@Test public void test_6861() {
		checkIsSubtype("X<X|(Y<Y|any>)>","X<X|[Y<X|Y>]>");
	}
	@Test public void test_6862() {
		checkIsSubtype("X<X|(Y<Y|any>)>","(X<X|void>)|void");
	}
	@Test public void test_6863() {
		checkIsSubtype("X<X|(Y<Y|any>)>","X<X|(Y<Y|void>)>");
	}
	@Test public void test_6864() {
		checkIsSubtype("X<X|(Y<Y|any>)>","(X<X|any>)|any");
	}
	@Test public void test_6865() {
		checkIsSubtype("X<X|(Y<Y|any>)>","X<X|(Y<Y|any>)>");
	}
	@Test public void test_6866() {
		checkIsSubtype("X<X|(Y<Y|any>)>","(X<X|null>)|null");
	}
	@Test public void test_6867() {
		checkIsSubtype("X<X|(Y<Y|any>)>","X<X|(Y<Y|null>)>");
	}
	@Test public void test_6868() {
		checkIsSubtype("X<X|(Y<Y|any>)>","(X<X|int>)|int");
	}
	@Test public void test_6869() {
		checkIsSubtype("X<X|(Y<Y|any>)>","X<X|(Y<Y|int>)>");
	}
	@Test public void test_6870() {
		checkIsSubtype("X<X|(Y<Y|any>)>","(X<X|Y<[Y]>>)|Y<[Y]>");
	}
	@Test public void test_6871() {
		checkIsSubtype("X<X|(Y<Y|any>)>","X<X|(Y<Y|Z<[Z]>>)>");
	}
	@Test public void test_6872() {
		checkIsSubtype("X<X|(Y<Y|any>)>","X<X|(Y<Y|[X]>)>");
	}
	@Test public void test_6873() {
		checkIsSubtype("X<X|(Y<Y|any>)>","X<X|(Y<Y|(Z<X|Z>)>)>");
	}
	@Test public void test_6874() {
		checkNotSubtype("(X<X|null>)|null","any");
	}
	@Test public void test_6875() {
		checkIsSubtype("(X<X|null>)|null","null");
	}
	@Test public void test_6876() {
		checkNotSubtype("(X<X|null>)|null","int");
	}
	@Test public void test_6877() {
		checkNotSubtype("(X<X|null>)|null","X<[X]>");
	}
	@Test public void test_6878() {
		checkNotSubtype("(X<X|null>)|null","[void]");
	}
	@Test public void test_6879() {
		checkNotSubtype("(X<X|null>)|null","[any]");
	}
	@Test public void test_6880() {
		checkNotSubtype("(X<X|null>)|null","[null]");
	}
	@Test public void test_6881() {
		checkNotSubtype("(X<X|null>)|null","[int]");
	}
	@Test public void test_6882() {
		checkNotSubtype("(X<X|null>)|null","[X<[X]>]");
	}
	@Test public void test_6883() {
		checkIsSubtype("(X<X|null>)|null","X<X|void>");
	}
	@Test public void test_6884() {
		checkNotSubtype("(X<X|null>)|null","X<X|any>");
	}
	@Test public void test_6885() {
		checkIsSubtype("(X<X|null>)|null","X<X|null>");
	}
	@Test public void test_6886() {
		checkNotSubtype("(X<X|null>)|null","X<X|int>");
	}
	@Test public void test_6887() {
		checkNotSubtype("(X<X|null>)|null","X<X|Y<[Y]>>");
	}
	@Test public void test_6888() {
		checkNotSubtype("(X<X|null>)|null","[[void]]");
	}
	@Test public void test_6889() {
		checkNotSubtype("(X<X|null>)|null","[[any]]");
	}
	@Test public void test_6890() {
		checkNotSubtype("(X<X|null>)|null","[[null]]");
	}
	@Test public void test_6891() {
		checkNotSubtype("(X<X|null>)|null","[[int]]");
	}
	@Test public void test_6892() {
		checkNotSubtype("(X<X|null>)|null","[[X<[X]>]]");
	}
	@Test public void test_6893() {
		checkNotSubtype("(X<X|null>)|null","X<[[[X]]]>");
	}
	@Test public void test_6894() {
		checkNotSubtype("(X<X|null>)|null","X<[[Y<X|Y>]]>");
	}
	@Test public void test_6895() {
		checkNotSubtype("(X<X|null>)|null","[X<X|void>]");
	}
	@Test public void test_6896() {
		checkNotSubtype("(X<X|null>)|null","[X<X|any>]");
	}
	@Test public void test_6897() {
		checkNotSubtype("(X<X|null>)|null","[X<X|null>]");
	}
	@Test public void test_6898() {
		checkNotSubtype("(X<X|null>)|null","[X<X|int>]");
	}
	@Test public void test_6899() {
		checkNotSubtype("(X<X|null>)|null","[X<X|Y<[Y]>>]");
	}
	@Test public void test_6900() {
		checkNotSubtype("(X<X|null>)|null","X<[Y<Y|[X]>]>");
	}
	@Test public void test_6901() {
		checkNotSubtype("(X<X|null>)|null","X<[Y<Y|(Z<X|Z>)>]>");
	}
	@Test public void test_6902() {
		checkIsSubtype("(X<X|null>)|null","void|void");
	}
	@Test public void test_6903() {
		checkNotSubtype("(X<X|null>)|null","void|any");
	}
	@Test public void test_6904() {
		checkIsSubtype("(X<X|null>)|null","void|null");
	}
	@Test public void test_6905() {
		checkNotSubtype("(X<X|null>)|null","void|int");
	}
	@Test public void test_6906() {
		checkNotSubtype("(X<X|null>)|null","void|X<[X]>");
	}
	@Test public void test_6907() {
		checkNotSubtype("(X<X|null>)|null","void|[void]");
	}
	@Test public void test_6908() {
		checkIsSubtype("(X<X|null>)|null","void|(X<void|X>)");
	}
	@Test public void test_6909() {
		checkNotSubtype("(X<X|null>)|null","any|void");
	}
	@Test public void test_6910() {
		checkNotSubtype("(X<X|null>)|null","any|any");
	}
	@Test public void test_6911() {
		checkNotSubtype("(X<X|null>)|null","any|null");
	}
	@Test public void test_6912() {
		checkNotSubtype("(X<X|null>)|null","any|int");
	}
	@Test public void test_6913() {
		checkNotSubtype("(X<X|null>)|null","any|X<[X]>");
	}
	@Test public void test_6914() {
		checkNotSubtype("(X<X|null>)|null","any|[any]");
	}
	@Test public void test_6915() {
		checkNotSubtype("(X<X|null>)|null","any|(X<any|X>)");
	}
	@Test public void test_6916() {
		checkIsSubtype("(X<X|null>)|null","null|void");
	}
	@Test public void test_6917() {
		checkNotSubtype("(X<X|null>)|null","null|any");
	}
	@Test public void test_6918() {
		checkIsSubtype("(X<X|null>)|null","null|null");
	}
	@Test public void test_6919() {
		checkNotSubtype("(X<X|null>)|null","null|int");
	}
	@Test public void test_6920() {
		checkNotSubtype("(X<X|null>)|null","null|X<[X]>");
	}
	@Test public void test_6921() {
		checkNotSubtype("(X<X|null>)|null","null|[null]");
	}
	@Test public void test_6922() {
		checkIsSubtype("(X<X|null>)|null","null|(X<null|X>)");
	}
	@Test public void test_6923() {
		checkNotSubtype("(X<X|null>)|null","int|void");
	}
	@Test public void test_6924() {
		checkNotSubtype("(X<X|null>)|null","int|any");
	}
	@Test public void test_6925() {
		checkNotSubtype("(X<X|null>)|null","int|null");
	}
	@Test public void test_6926() {
		checkNotSubtype("(X<X|null>)|null","int|int");
	}
	@Test public void test_6927() {
		checkNotSubtype("(X<X|null>)|null","int|X<[X]>");
	}
	@Test public void test_6928() {
		checkNotSubtype("(X<X|null>)|null","int|[int]");
	}
	@Test public void test_6929() {
		checkNotSubtype("(X<X|null>)|null","int|(X<int|X>)");
	}
	@Test public void test_6930() {
		checkNotSubtype("(X<X|null>)|null","[void]|void");
	}
	@Test public void test_6931() {
		checkNotSubtype("(X<X|null>)|null","X<[X]>|void");
	}
	@Test public void test_6932() {
		checkNotSubtype("(X<X|null>)|null","X<X|[void]>");
	}
	@Test public void test_6933() {
		checkNotSubtype("(X<X|null>)|null","[any]|any");
	}
	@Test public void test_6934() {
		checkNotSubtype("(X<X|null>)|null","X<[X]>|any");
	}
	@Test public void test_6935() {
		checkNotSubtype("(X<X|null>)|null","X<X|[any]>");
	}
	@Test public void test_6936() {
		checkNotSubtype("(X<X|null>)|null","[null]|null");
	}
	@Test public void test_6937() {
		checkNotSubtype("(X<X|null>)|null","X<[X]>|null");
	}
	@Test public void test_6938() {
		checkNotSubtype("(X<X|null>)|null","X<X|[null]>");
	}
	@Test public void test_6939() {
		checkNotSubtype("(X<X|null>)|null","[int]|int");
	}
	@Test public void test_6940() {
		checkNotSubtype("(X<X|null>)|null","X<[X]>|int");
	}
	@Test public void test_6941() {
		checkNotSubtype("(X<X|null>)|null","X<X|[int]>");
	}
	@Test public void test_6942() {
		checkNotSubtype("(X<X|null>)|null","[X<[X]>]|X<[X]>");
	}
	@Test public void test_6943() {
		checkNotSubtype("(X<X|null>)|null","X<[X]>|Y<[Y]>");
	}
	@Test public void test_6944() {
		checkNotSubtype("(X<X|null>)|null","X<[X]>|[X<[X]>]");
	}
	@Test public void test_6945() {
		checkNotSubtype("(X<X|null>)|null","X<X|[Y<[Y]>]>");
	}
	@Test public void test_6946() {
		checkNotSubtype("(X<X|null>)|null","X<X|[[X]]>");
	}
	@Test public void test_6947() {
		checkNotSubtype("(X<X|null>)|null","X<[X]>|(Y<X<[X]>|Y>)");
	}
	@Test public void test_6948() {
		checkNotSubtype("(X<X|null>)|null","X<X|[Y<X|Y>]>");
	}
	@Test public void test_6949() {
		checkIsSubtype("(X<X|null>)|null","(X<X|void>)|void");
	}
	@Test public void test_6950() {
		checkIsSubtype("(X<X|null>)|null","X<X|(Y<Y|void>)>");
	}
	@Test public void test_6951() {
		checkNotSubtype("(X<X|null>)|null","(X<X|any>)|any");
	}
	@Test public void test_6952() {
		checkNotSubtype("(X<X|null>)|null","X<X|(Y<Y|any>)>");
	}
	@Test public void test_6953() {
		checkIsSubtype("(X<X|null>)|null","(X<X|null>)|null");
	}
	@Test public void test_6954() {
		checkIsSubtype("(X<X|null>)|null","X<X|(Y<Y|null>)>");
	}
	@Test public void test_6955() {
		checkNotSubtype("(X<X|null>)|null","(X<X|int>)|int");
	}
	@Test public void test_6956() {
		checkNotSubtype("(X<X|null>)|null","X<X|(Y<Y|int>)>");
	}
	@Test public void test_6957() {
		checkNotSubtype("(X<X|null>)|null","(X<X|Y<[Y]>>)|Y<[Y]>");
	}
	@Test public void test_6958() {
		checkNotSubtype("(X<X|null>)|null","X<X|(Y<Y|Z<[Z]>>)>");
	}
	@Test public void test_6959() {
		checkNotSubtype("(X<X|null>)|null","X<X|(Y<Y|[X]>)>");
	}
	@Test public void test_6960() {
		checkIsSubtype("(X<X|null>)|null","X<X|(Y<Y|(Z<X|Z>)>)>");
	}
	@Test public void test_6961() {
		checkNotSubtype("X<X|(Y<Y|null>)>","any");
	}
	@Test public void test_6962() {
		checkIsSubtype("X<X|(Y<Y|null>)>","null");
	}
	@Test public void test_6963() {
		checkNotSubtype("X<X|(Y<Y|null>)>","int");
	}
	@Test public void test_6964() {
		checkNotSubtype("X<X|(Y<Y|null>)>","X<[X]>");
	}
	@Test public void test_6965() {
		checkNotSubtype("X<X|(Y<Y|null>)>","[void]");
	}
	@Test public void test_6966() {
		checkNotSubtype("X<X|(Y<Y|null>)>","[any]");
	}
	@Test public void test_6967() {
		checkNotSubtype("X<X|(Y<Y|null>)>","[null]");
	}
	@Test public void test_6968() {
		checkNotSubtype("X<X|(Y<Y|null>)>","[int]");
	}
	@Test public void test_6969() {
		checkNotSubtype("X<X|(Y<Y|null>)>","[X<[X]>]");
	}
	@Test public void test_6970() {
		checkIsSubtype("X<X|(Y<Y|null>)>","X<X|void>");
	}
	@Test public void test_6971() {
		checkNotSubtype("X<X|(Y<Y|null>)>","X<X|any>");
	}
	@Test public void test_6972() {
		checkIsSubtype("X<X|(Y<Y|null>)>","X<X|null>");
	}
	@Test public void test_6973() {
		checkNotSubtype("X<X|(Y<Y|null>)>","X<X|int>");
	}
	@Test public void test_6974() {
		checkNotSubtype("X<X|(Y<Y|null>)>","X<X|Y<[Y]>>");
	}
	@Test public void test_6975() {
		checkNotSubtype("X<X|(Y<Y|null>)>","[[void]]");
	}
	@Test public void test_6976() {
		checkNotSubtype("X<X|(Y<Y|null>)>","[[any]]");
	}
	@Test public void test_6977() {
		checkNotSubtype("X<X|(Y<Y|null>)>","[[null]]");
	}
	@Test public void test_6978() {
		checkNotSubtype("X<X|(Y<Y|null>)>","[[int]]");
	}
	@Test public void test_6979() {
		checkNotSubtype("X<X|(Y<Y|null>)>","[[X<[X]>]]");
	}
	@Test public void test_6980() {
		checkNotSubtype("X<X|(Y<Y|null>)>","X<[[[X]]]>");
	}
	@Test public void test_6981() {
		checkNotSubtype("X<X|(Y<Y|null>)>","X<[[Y<X|Y>]]>");
	}
	@Test public void test_6982() {
		checkNotSubtype("X<X|(Y<Y|null>)>","[X<X|void>]");
	}
	@Test public void test_6983() {
		checkNotSubtype("X<X|(Y<Y|null>)>","[X<X|any>]");
	}
	@Test public void test_6984() {
		checkNotSubtype("X<X|(Y<Y|null>)>","[X<X|null>]");
	}
	@Test public void test_6985() {
		checkNotSubtype("X<X|(Y<Y|null>)>","[X<X|int>]");
	}
	@Test public void test_6986() {
		checkNotSubtype("X<X|(Y<Y|null>)>","[X<X|Y<[Y]>>]");
	}
	@Test public void test_6987() {
		checkNotSubtype("X<X|(Y<Y|null>)>","X<[Y<Y|[X]>]>");
	}
	@Test public void test_6988() {
		checkNotSubtype("X<X|(Y<Y|null>)>","X<[Y<Y|(Z<X|Z>)>]>");
	}
	@Test public void test_6989() {
		checkIsSubtype("X<X|(Y<Y|null>)>","void|void");
	}
	@Test public void test_6990() {
		checkNotSubtype("X<X|(Y<Y|null>)>","void|any");
	}
	@Test public void test_6991() {
		checkIsSubtype("X<X|(Y<Y|null>)>","void|null");
	}
	@Test public void test_6992() {
		checkNotSubtype("X<X|(Y<Y|null>)>","void|int");
	}
	@Test public void test_6993() {
		checkNotSubtype("X<X|(Y<Y|null>)>","void|X<[X]>");
	}
	@Test public void test_6994() {
		checkNotSubtype("X<X|(Y<Y|null>)>","void|[void]");
	}
	@Test public void test_6995() {
		checkIsSubtype("X<X|(Y<Y|null>)>","void|(X<void|X>)");
	}
	@Test public void test_6996() {
		checkNotSubtype("X<X|(Y<Y|null>)>","any|void");
	}
	@Test public void test_6997() {
		checkNotSubtype("X<X|(Y<Y|null>)>","any|any");
	}
	@Test public void test_6998() {
		checkNotSubtype("X<X|(Y<Y|null>)>","any|null");
	}
	@Test public void test_6999() {
		checkNotSubtype("X<X|(Y<Y|null>)>","any|int");
	}
	@Test public void test_7000() {
		checkNotSubtype("X<X|(Y<Y|null>)>","any|X<[X]>");
	}
	@Test public void test_7001() {
		checkNotSubtype("X<X|(Y<Y|null>)>","any|[any]");
	}
	@Test public void test_7002() {
		checkNotSubtype("X<X|(Y<Y|null>)>","any|(X<any|X>)");
	}
	@Test public void test_7003() {
		checkIsSubtype("X<X|(Y<Y|null>)>","null|void");
	}
	@Test public void test_7004() {
		checkNotSubtype("X<X|(Y<Y|null>)>","null|any");
	}
	@Test public void test_7005() {
		checkIsSubtype("X<X|(Y<Y|null>)>","null|null");
	}
	@Test public void test_7006() {
		checkNotSubtype("X<X|(Y<Y|null>)>","null|int");
	}
	@Test public void test_7007() {
		checkNotSubtype("X<X|(Y<Y|null>)>","null|X<[X]>");
	}
	@Test public void test_7008() {
		checkNotSubtype("X<X|(Y<Y|null>)>","null|[null]");
	}
	@Test public void test_7009() {
		checkIsSubtype("X<X|(Y<Y|null>)>","null|(X<null|X>)");
	}
	@Test public void test_7010() {
		checkNotSubtype("X<X|(Y<Y|null>)>","int|void");
	}
	@Test public void test_7011() {
		checkNotSubtype("X<X|(Y<Y|null>)>","int|any");
	}
	@Test public void test_7012() {
		checkNotSubtype("X<X|(Y<Y|null>)>","int|null");
	}
	@Test public void test_7013() {
		checkNotSubtype("X<X|(Y<Y|null>)>","int|int");
	}
	@Test public void test_7014() {
		checkNotSubtype("X<X|(Y<Y|null>)>","int|X<[X]>");
	}
	@Test public void test_7015() {
		checkNotSubtype("X<X|(Y<Y|null>)>","int|[int]");
	}
	@Test public void test_7016() {
		checkNotSubtype("X<X|(Y<Y|null>)>","int|(X<int|X>)");
	}
	@Test public void test_7017() {
		checkNotSubtype("X<X|(Y<Y|null>)>","[void]|void");
	}
	@Test public void test_7018() {
		checkNotSubtype("X<X|(Y<Y|null>)>","X<[X]>|void");
	}
	@Test public void test_7019() {
		checkNotSubtype("X<X|(Y<Y|null>)>","X<X|[void]>");
	}
	@Test public void test_7020() {
		checkNotSubtype("X<X|(Y<Y|null>)>","[any]|any");
	}
	@Test public void test_7021() {
		checkNotSubtype("X<X|(Y<Y|null>)>","X<[X]>|any");
	}
	@Test public void test_7022() {
		checkNotSubtype("X<X|(Y<Y|null>)>","X<X|[any]>");
	}
	@Test public void test_7023() {
		checkNotSubtype("X<X|(Y<Y|null>)>","[null]|null");
	}
	@Test public void test_7024() {
		checkNotSubtype("X<X|(Y<Y|null>)>","X<[X]>|null");
	}
	@Test public void test_7025() {
		checkNotSubtype("X<X|(Y<Y|null>)>","X<X|[null]>");
	}
	@Test public void test_7026() {
		checkNotSubtype("X<X|(Y<Y|null>)>","[int]|int");
	}
	@Test public void test_7027() {
		checkNotSubtype("X<X|(Y<Y|null>)>","X<[X]>|int");
	}
	@Test public void test_7028() {
		checkNotSubtype("X<X|(Y<Y|null>)>","X<X|[int]>");
	}
	@Test public void test_7029() {
		checkNotSubtype("X<X|(Y<Y|null>)>","[X<[X]>]|X<[X]>");
	}
	@Test public void test_7030() {
		checkNotSubtype("X<X|(Y<Y|null>)>","X<[X]>|Y<[Y]>");
	}
	@Test public void test_7031() {
		checkNotSubtype("X<X|(Y<Y|null>)>","X<[X]>|[X<[X]>]");
	}
	@Test public void test_7032() {
		checkNotSubtype("X<X|(Y<Y|null>)>","X<X|[Y<[Y]>]>");
	}
	@Test public void test_7033() {
		checkNotSubtype("X<X|(Y<Y|null>)>","X<X|[[X]]>");
	}
	@Test public void test_7034() {
		checkNotSubtype("X<X|(Y<Y|null>)>","X<[X]>|(Y<X<[X]>|Y>)");
	}
	@Test public void test_7035() {
		checkNotSubtype("X<X|(Y<Y|null>)>","X<X|[Y<X|Y>]>");
	}
	@Test public void test_7036() {
		checkIsSubtype("X<X|(Y<Y|null>)>","(X<X|void>)|void");
	}
	@Test public void test_7037() {
		checkIsSubtype("X<X|(Y<Y|null>)>","X<X|(Y<Y|void>)>");
	}
	@Test public void test_7038() {
		checkNotSubtype("X<X|(Y<Y|null>)>","(X<X|any>)|any");
	}
	@Test public void test_7039() {
		checkNotSubtype("X<X|(Y<Y|null>)>","X<X|(Y<Y|any>)>");
	}
	@Test public void test_7040() {
		checkIsSubtype("X<X|(Y<Y|null>)>","(X<X|null>)|null");
	}
	@Test public void test_7041() {
		checkIsSubtype("X<X|(Y<Y|null>)>","X<X|(Y<Y|null>)>");
	}
	@Test public void test_7042() {
		checkNotSubtype("X<X|(Y<Y|null>)>","(X<X|int>)|int");
	}
	@Test public void test_7043() {
		checkNotSubtype("X<X|(Y<Y|null>)>","X<X|(Y<Y|int>)>");
	}
	@Test public void test_7044() {
		checkNotSubtype("X<X|(Y<Y|null>)>","(X<X|Y<[Y]>>)|Y<[Y]>");
	}
	@Test public void test_7045() {
		checkNotSubtype("X<X|(Y<Y|null>)>","X<X|(Y<Y|Z<[Z]>>)>");
	}
	@Test public void test_7046() {
		checkNotSubtype("X<X|(Y<Y|null>)>","X<X|(Y<Y|[X]>)>");
	}
	@Test public void test_7047() {
		checkIsSubtype("X<X|(Y<Y|null>)>","X<X|(Y<Y|(Z<X|Z>)>)>");
	}
	@Test public void test_7048() {
		checkNotSubtype("(X<X|int>)|int","any");
	}
	@Test public void test_7049() {
		checkNotSubtype("(X<X|int>)|int","null");
	}
	@Test public void test_7050() {
		checkIsSubtype("(X<X|int>)|int","int");
	}
	@Test public void test_7051() {
		checkNotSubtype("(X<X|int>)|int","X<[X]>");
	}
	@Test public void test_7052() {
		checkNotSubtype("(X<X|int>)|int","[void]");
	}
	@Test public void test_7053() {
		checkNotSubtype("(X<X|int>)|int","[any]");
	}
	@Test public void test_7054() {
		checkNotSubtype("(X<X|int>)|int","[null]");
	}
	@Test public void test_7055() {
		checkNotSubtype("(X<X|int>)|int","[int]");
	}
	@Test public void test_7056() {
		checkNotSubtype("(X<X|int>)|int","[X<[X]>]");
	}
	@Test public void test_7057() {
		checkIsSubtype("(X<X|int>)|int","X<X|void>");
	}
	@Test public void test_7058() {
		checkNotSubtype("(X<X|int>)|int","X<X|any>");
	}
	@Test public void test_7059() {
		checkNotSubtype("(X<X|int>)|int","X<X|null>");
	}
	@Test public void test_7060() {
		checkIsSubtype("(X<X|int>)|int","X<X|int>");
	}
	@Test public void test_7061() {
		checkNotSubtype("(X<X|int>)|int","X<X|Y<[Y]>>");
	}
	@Test public void test_7062() {
		checkNotSubtype("(X<X|int>)|int","[[void]]");
	}
	@Test public void test_7063() {
		checkNotSubtype("(X<X|int>)|int","[[any]]");
	}
	@Test public void test_7064() {
		checkNotSubtype("(X<X|int>)|int","[[null]]");
	}
	@Test public void test_7065() {
		checkNotSubtype("(X<X|int>)|int","[[int]]");
	}
	@Test public void test_7066() {
		checkNotSubtype("(X<X|int>)|int","[[X<[X]>]]");
	}
	@Test public void test_7067() {
		checkNotSubtype("(X<X|int>)|int","X<[[[X]]]>");
	}
	@Test public void test_7068() {
		checkNotSubtype("(X<X|int>)|int","X<[[Y<X|Y>]]>");
	}
	@Test public void test_7069() {
		checkNotSubtype("(X<X|int>)|int","[X<X|void>]");
	}
	@Test public void test_7070() {
		checkNotSubtype("(X<X|int>)|int","[X<X|any>]");
	}
	@Test public void test_7071() {
		checkNotSubtype("(X<X|int>)|int","[X<X|null>]");
	}
	@Test public void test_7072() {
		checkNotSubtype("(X<X|int>)|int","[X<X|int>]");
	}
	@Test public void test_7073() {
		checkNotSubtype("(X<X|int>)|int","[X<X|Y<[Y]>>]");
	}
	@Test public void test_7074() {
		checkNotSubtype("(X<X|int>)|int","X<[Y<Y|[X]>]>");
	}
	@Test public void test_7075() {
		checkNotSubtype("(X<X|int>)|int","X<[Y<Y|(Z<X|Z>)>]>");
	}
	@Test public void test_7076() {
		checkIsSubtype("(X<X|int>)|int","void|void");
	}
	@Test public void test_7077() {
		checkNotSubtype("(X<X|int>)|int","void|any");
	}
	@Test public void test_7078() {
		checkNotSubtype("(X<X|int>)|int","void|null");
	}
	@Test public void test_7079() {
		checkIsSubtype("(X<X|int>)|int","void|int");
	}
	@Test public void test_7080() {
		checkNotSubtype("(X<X|int>)|int","void|X<[X]>");
	}
	@Test public void test_7081() {
		checkNotSubtype("(X<X|int>)|int","void|[void]");
	}
	@Test public void test_7082() {
		checkIsSubtype("(X<X|int>)|int","void|(X<void|X>)");
	}
	@Test public void test_7083() {
		checkNotSubtype("(X<X|int>)|int","any|void");
	}
	@Test public void test_7084() {
		checkNotSubtype("(X<X|int>)|int","any|any");
	}
	@Test public void test_7085() {
		checkNotSubtype("(X<X|int>)|int","any|null");
	}
	@Test public void test_7086() {
		checkNotSubtype("(X<X|int>)|int","any|int");
	}
	@Test public void test_7087() {
		checkNotSubtype("(X<X|int>)|int","any|X<[X]>");
	}
	@Test public void test_7088() {
		checkNotSubtype("(X<X|int>)|int","any|[any]");
	}
	@Test public void test_7089() {
		checkNotSubtype("(X<X|int>)|int","any|(X<any|X>)");
	}
	@Test public void test_7090() {
		checkNotSubtype("(X<X|int>)|int","null|void");
	}
	@Test public void test_7091() {
		checkNotSubtype("(X<X|int>)|int","null|any");
	}
	@Test public void test_7092() {
		checkNotSubtype("(X<X|int>)|int","null|null");
	}
	@Test public void test_7093() {
		checkNotSubtype("(X<X|int>)|int","null|int");
	}
	@Test public void test_7094() {
		checkNotSubtype("(X<X|int>)|int","null|X<[X]>");
	}
	@Test public void test_7095() {
		checkNotSubtype("(X<X|int>)|int","null|[null]");
	}
	@Test public void test_7096() {
		checkNotSubtype("(X<X|int>)|int","null|(X<null|X>)");
	}
	@Test public void test_7097() {
		checkIsSubtype("(X<X|int>)|int","int|void");
	}
	@Test public void test_7098() {
		checkNotSubtype("(X<X|int>)|int","int|any");
	}
	@Test public void test_7099() {
		checkNotSubtype("(X<X|int>)|int","int|null");
	}
	@Test public void test_7100() {
		checkIsSubtype("(X<X|int>)|int","int|int");
	}
	@Test public void test_7101() {
		checkNotSubtype("(X<X|int>)|int","int|X<[X]>");
	}
	@Test public void test_7102() {
		checkNotSubtype("(X<X|int>)|int","int|[int]");
	}
	@Test public void test_7103() {
		checkIsSubtype("(X<X|int>)|int","int|(X<int|X>)");
	}
	@Test public void test_7104() {
		checkNotSubtype("(X<X|int>)|int","[void]|void");
	}
	@Test public void test_7105() {
		checkNotSubtype("(X<X|int>)|int","X<[X]>|void");
	}
	@Test public void test_7106() {
		checkNotSubtype("(X<X|int>)|int","X<X|[void]>");
	}
	@Test public void test_7107() {
		checkNotSubtype("(X<X|int>)|int","[any]|any");
	}
	@Test public void test_7108() {
		checkNotSubtype("(X<X|int>)|int","X<[X]>|any");
	}
	@Test public void test_7109() {
		checkNotSubtype("(X<X|int>)|int","X<X|[any]>");
	}
	@Test public void test_7110() {
		checkNotSubtype("(X<X|int>)|int","[null]|null");
	}
	@Test public void test_7111() {
		checkNotSubtype("(X<X|int>)|int","X<[X]>|null");
	}
	@Test public void test_7112() {
		checkNotSubtype("(X<X|int>)|int","X<X|[null]>");
	}
	@Test public void test_7113() {
		checkNotSubtype("(X<X|int>)|int","[int]|int");
	}
	@Test public void test_7114() {
		checkNotSubtype("(X<X|int>)|int","X<[X]>|int");
	}
	@Test public void test_7115() {
		checkNotSubtype("(X<X|int>)|int","X<X|[int]>");
	}
	@Test public void test_7116() {
		checkNotSubtype("(X<X|int>)|int","[X<[X]>]|X<[X]>");
	}
	@Test public void test_7117() {
		checkNotSubtype("(X<X|int>)|int","X<[X]>|Y<[Y]>");
	}
	@Test public void test_7118() {
		checkNotSubtype("(X<X|int>)|int","X<[X]>|[X<[X]>]");
	}
	@Test public void test_7119() {
		checkNotSubtype("(X<X|int>)|int","X<X|[Y<[Y]>]>");
	}
	@Test public void test_7120() {
		checkNotSubtype("(X<X|int>)|int","X<X|[[X]]>");
	}
	@Test public void test_7121() {
		checkNotSubtype("(X<X|int>)|int","X<[X]>|(Y<X<[X]>|Y>)");
	}
	@Test public void test_7122() {
		checkNotSubtype("(X<X|int>)|int","X<X|[Y<X|Y>]>");
	}
	@Test public void test_7123() {
		checkIsSubtype("(X<X|int>)|int","(X<X|void>)|void");
	}
	@Test public void test_7124() {
		checkIsSubtype("(X<X|int>)|int","X<X|(Y<Y|void>)>");
	}
	@Test public void test_7125() {
		checkNotSubtype("(X<X|int>)|int","(X<X|any>)|any");
	}
	@Test public void test_7126() {
		checkNotSubtype("(X<X|int>)|int","X<X|(Y<Y|any>)>");
	}
	@Test public void test_7127() {
		checkNotSubtype("(X<X|int>)|int","(X<X|null>)|null");
	}
	@Test public void test_7128() {
		checkNotSubtype("(X<X|int>)|int","X<X|(Y<Y|null>)>");
	}
	@Test public void test_7129() {
		checkIsSubtype("(X<X|int>)|int","(X<X|int>)|int");
	}
	@Test public void test_7130() {
		checkIsSubtype("(X<X|int>)|int","X<X|(Y<Y|int>)>");
	}
	@Test public void test_7131() {
		checkNotSubtype("(X<X|int>)|int","(X<X|Y<[Y]>>)|Y<[Y]>");
	}
	@Test public void test_7132() {
		checkNotSubtype("(X<X|int>)|int","X<X|(Y<Y|Z<[Z]>>)>");
	}
	@Test public void test_7133() {
		checkNotSubtype("(X<X|int>)|int","X<X|(Y<Y|[X]>)>");
	}
	@Test public void test_7134() {
		checkIsSubtype("(X<X|int>)|int","X<X|(Y<Y|(Z<X|Z>)>)>");
	}
	@Test public void test_7135() {
		checkNotSubtype("X<X|(Y<Y|int>)>","any");
	}
	@Test public void test_7136() {
		checkNotSubtype("X<X|(Y<Y|int>)>","null");
	}
	@Test public void test_7137() {
		checkIsSubtype("X<X|(Y<Y|int>)>","int");
	}
	@Test public void test_7138() {
		checkNotSubtype("X<X|(Y<Y|int>)>","X<[X]>");
	}
	@Test public void test_7139() {
		checkNotSubtype("X<X|(Y<Y|int>)>","[void]");
	}
	@Test public void test_7140() {
		checkNotSubtype("X<X|(Y<Y|int>)>","[any]");
	}
	@Test public void test_7141() {
		checkNotSubtype("X<X|(Y<Y|int>)>","[null]");
	}
	@Test public void test_7142() {
		checkNotSubtype("X<X|(Y<Y|int>)>","[int]");
	}
	@Test public void test_7143() {
		checkNotSubtype("X<X|(Y<Y|int>)>","[X<[X]>]");
	}
	@Test public void test_7144() {
		checkIsSubtype("X<X|(Y<Y|int>)>","X<X|void>");
	}
	@Test public void test_7145() {
		checkNotSubtype("X<X|(Y<Y|int>)>","X<X|any>");
	}
	@Test public void test_7146() {
		checkNotSubtype("X<X|(Y<Y|int>)>","X<X|null>");
	}
	@Test public void test_7147() {
		checkIsSubtype("X<X|(Y<Y|int>)>","X<X|int>");
	}
	@Test public void test_7148() {
		checkNotSubtype("X<X|(Y<Y|int>)>","X<X|Y<[Y]>>");
	}
	@Test public void test_7149() {
		checkNotSubtype("X<X|(Y<Y|int>)>","[[void]]");
	}
	@Test public void test_7150() {
		checkNotSubtype("X<X|(Y<Y|int>)>","[[any]]");
	}
	@Test public void test_7151() {
		checkNotSubtype("X<X|(Y<Y|int>)>","[[null]]");
	}
	@Test public void test_7152() {
		checkNotSubtype("X<X|(Y<Y|int>)>","[[int]]");
	}
	@Test public void test_7153() {
		checkNotSubtype("X<X|(Y<Y|int>)>","[[X<[X]>]]");
	}
	@Test public void test_7154() {
		checkNotSubtype("X<X|(Y<Y|int>)>","X<[[[X]]]>");
	}
	@Test public void test_7155() {
		checkNotSubtype("X<X|(Y<Y|int>)>","X<[[Y<X|Y>]]>");
	}
	@Test public void test_7156() {
		checkNotSubtype("X<X|(Y<Y|int>)>","[X<X|void>]");
	}
	@Test public void test_7157() {
		checkNotSubtype("X<X|(Y<Y|int>)>","[X<X|any>]");
	}
	@Test public void test_7158() {
		checkNotSubtype("X<X|(Y<Y|int>)>","[X<X|null>]");
	}
	@Test public void test_7159() {
		checkNotSubtype("X<X|(Y<Y|int>)>","[X<X|int>]");
	}
	@Test public void test_7160() {
		checkNotSubtype("X<X|(Y<Y|int>)>","[X<X|Y<[Y]>>]");
	}
	@Test public void test_7161() {
		checkNotSubtype("X<X|(Y<Y|int>)>","X<[Y<Y|[X]>]>");
	}
	@Test public void test_7162() {
		checkNotSubtype("X<X|(Y<Y|int>)>","X<[Y<Y|(Z<X|Z>)>]>");
	}
	@Test public void test_7163() {
		checkIsSubtype("X<X|(Y<Y|int>)>","void|void");
	}
	@Test public void test_7164() {
		checkNotSubtype("X<X|(Y<Y|int>)>","void|any");
	}
	@Test public void test_7165() {
		checkNotSubtype("X<X|(Y<Y|int>)>","void|null");
	}
	@Test public void test_7166() {
		checkIsSubtype("X<X|(Y<Y|int>)>","void|int");
	}
	@Test public void test_7167() {
		checkNotSubtype("X<X|(Y<Y|int>)>","void|X<[X]>");
	}
	@Test public void test_7168() {
		checkNotSubtype("X<X|(Y<Y|int>)>","void|[void]");
	}
	@Test public void test_7169() {
		checkIsSubtype("X<X|(Y<Y|int>)>","void|(X<void|X>)");
	}
	@Test public void test_7170() {
		checkNotSubtype("X<X|(Y<Y|int>)>","any|void");
	}
	@Test public void test_7171() {
		checkNotSubtype("X<X|(Y<Y|int>)>","any|any");
	}
	@Test public void test_7172() {
		checkNotSubtype("X<X|(Y<Y|int>)>","any|null");
	}
	@Test public void test_7173() {
		checkNotSubtype("X<X|(Y<Y|int>)>","any|int");
	}
	@Test public void test_7174() {
		checkNotSubtype("X<X|(Y<Y|int>)>","any|X<[X]>");
	}
	@Test public void test_7175() {
		checkNotSubtype("X<X|(Y<Y|int>)>","any|[any]");
	}
	@Test public void test_7176() {
		checkNotSubtype("X<X|(Y<Y|int>)>","any|(X<any|X>)");
	}
	@Test public void test_7177() {
		checkNotSubtype("X<X|(Y<Y|int>)>","null|void");
	}
	@Test public void test_7178() {
		checkNotSubtype("X<X|(Y<Y|int>)>","null|any");
	}
	@Test public void test_7179() {
		checkNotSubtype("X<X|(Y<Y|int>)>","null|null");
	}
	@Test public void test_7180() {
		checkNotSubtype("X<X|(Y<Y|int>)>","null|int");
	}
	@Test public void test_7181() {
		checkNotSubtype("X<X|(Y<Y|int>)>","null|X<[X]>");
	}
	@Test public void test_7182() {
		checkNotSubtype("X<X|(Y<Y|int>)>","null|[null]");
	}
	@Test public void test_7183() {
		checkNotSubtype("X<X|(Y<Y|int>)>","null|(X<null|X>)");
	}
	@Test public void test_7184() {
		checkIsSubtype("X<X|(Y<Y|int>)>","int|void");
	}
	@Test public void test_7185() {
		checkNotSubtype("X<X|(Y<Y|int>)>","int|any");
	}
	@Test public void test_7186() {
		checkNotSubtype("X<X|(Y<Y|int>)>","int|null");
	}
	@Test public void test_7187() {
		checkIsSubtype("X<X|(Y<Y|int>)>","int|int");
	}
	@Test public void test_7188() {
		checkNotSubtype("X<X|(Y<Y|int>)>","int|X<[X]>");
	}
	@Test public void test_7189() {
		checkNotSubtype("X<X|(Y<Y|int>)>","int|[int]");
	}
	@Test public void test_7190() {
		checkIsSubtype("X<X|(Y<Y|int>)>","int|(X<int|X>)");
	}
	@Test public void test_7191() {
		checkNotSubtype("X<X|(Y<Y|int>)>","[void]|void");
	}
	@Test public void test_7192() {
		checkNotSubtype("X<X|(Y<Y|int>)>","X<[X]>|void");
	}
	@Test public void test_7193() {
		checkNotSubtype("X<X|(Y<Y|int>)>","X<X|[void]>");
	}
	@Test public void test_7194() {
		checkNotSubtype("X<X|(Y<Y|int>)>","[any]|any");
	}
	@Test public void test_7195() {
		checkNotSubtype("X<X|(Y<Y|int>)>","X<[X]>|any");
	}
	@Test public void test_7196() {
		checkNotSubtype("X<X|(Y<Y|int>)>","X<X|[any]>");
	}
	@Test public void test_7197() {
		checkNotSubtype("X<X|(Y<Y|int>)>","[null]|null");
	}
	@Test public void test_7198() {
		checkNotSubtype("X<X|(Y<Y|int>)>","X<[X]>|null");
	}
	@Test public void test_7199() {
		checkNotSubtype("X<X|(Y<Y|int>)>","X<X|[null]>");
	}
	@Test public void test_7200() {
		checkNotSubtype("X<X|(Y<Y|int>)>","[int]|int");
	}
	@Test public void test_7201() {
		checkNotSubtype("X<X|(Y<Y|int>)>","X<[X]>|int");
	}
	@Test public void test_7202() {
		checkNotSubtype("X<X|(Y<Y|int>)>","X<X|[int]>");
	}
	@Test public void test_7203() {
		checkNotSubtype("X<X|(Y<Y|int>)>","[X<[X]>]|X<[X]>");
	}
	@Test public void test_7204() {
		checkNotSubtype("X<X|(Y<Y|int>)>","X<[X]>|Y<[Y]>");
	}
	@Test public void test_7205() {
		checkNotSubtype("X<X|(Y<Y|int>)>","X<[X]>|[X<[X]>]");
	}
	@Test public void test_7206() {
		checkNotSubtype("X<X|(Y<Y|int>)>","X<X|[Y<[Y]>]>");
	}
	@Test public void test_7207() {
		checkNotSubtype("X<X|(Y<Y|int>)>","X<X|[[X]]>");
	}
	@Test public void test_7208() {
		checkNotSubtype("X<X|(Y<Y|int>)>","X<[X]>|(Y<X<[X]>|Y>)");
	}
	@Test public void test_7209() {
		checkNotSubtype("X<X|(Y<Y|int>)>","X<X|[Y<X|Y>]>");
	}
	@Test public void test_7210() {
		checkIsSubtype("X<X|(Y<Y|int>)>","(X<X|void>)|void");
	}
	@Test public void test_7211() {
		checkIsSubtype("X<X|(Y<Y|int>)>","X<X|(Y<Y|void>)>");
	}
	@Test public void test_7212() {
		checkNotSubtype("X<X|(Y<Y|int>)>","(X<X|any>)|any");
	}
	@Test public void test_7213() {
		checkNotSubtype("X<X|(Y<Y|int>)>","X<X|(Y<Y|any>)>");
	}
	@Test public void test_7214() {
		checkNotSubtype("X<X|(Y<Y|int>)>","(X<X|null>)|null");
	}
	@Test public void test_7215() {
		checkNotSubtype("X<X|(Y<Y|int>)>","X<X|(Y<Y|null>)>");
	}
	@Test public void test_7216() {
		checkIsSubtype("X<X|(Y<Y|int>)>","(X<X|int>)|int");
	}
	@Test public void test_7217() {
		checkIsSubtype("X<X|(Y<Y|int>)>","X<X|(Y<Y|int>)>");
	}
	@Test public void test_7218() {
		checkNotSubtype("X<X|(Y<Y|int>)>","(X<X|Y<[Y]>>)|Y<[Y]>");
	}
	@Test public void test_7219() {
		checkNotSubtype("X<X|(Y<Y|int>)>","X<X|(Y<Y|Z<[Z]>>)>");
	}
	@Test public void test_7220() {
		checkNotSubtype("X<X|(Y<Y|int>)>","X<X|(Y<Y|[X]>)>");
	}
	@Test public void test_7221() {
		checkIsSubtype("X<X|(Y<Y|int>)>","X<X|(Y<Y|(Z<X|Z>)>)>");
	}
	@Test public void test_7222() {
		checkNotSubtype("(X<X|Y<[Y]>>)|Y<[Y]>","any");
	}
	@Test public void test_7223() {
		checkNotSubtype("(X<X|Y<[Y]>>)|Y<[Y]>","null");
	}
	@Test public void test_7224() {
		checkNotSubtype("(X<X|Y<[Y]>>)|Y<[Y]>","int");
	}
	@Test public void test_7225() {
		checkIsSubtype("(X<X|Y<[Y]>>)|Y<[Y]>","X<[X]>");
	}
	@Test public void test_7226() {
		checkIsSubtype("(X<X|Y<[Y]>>)|Y<[Y]>","[void]");
	}
	@Test public void test_7227() {
		checkNotSubtype("(X<X|Y<[Y]>>)|Y<[Y]>","[any]");
	}
	@Test public void test_7228() {
		checkNotSubtype("(X<X|Y<[Y]>>)|Y<[Y]>","[null]");
	}
	@Test public void test_7229() {
		checkNotSubtype("(X<X|Y<[Y]>>)|Y<[Y]>","[int]");
	}
	@Test public void test_7230() {
		checkIsSubtype("(X<X|Y<[Y]>>)|Y<[Y]>","[X<[X]>]");
	}
	@Test public void test_7231() {
		checkIsSubtype("(X<X|Y<[Y]>>)|Y<[Y]>","X<X|void>");
	}
	@Test public void test_7232() {
		checkNotSubtype("(X<X|Y<[Y]>>)|Y<[Y]>","X<X|any>");
	}
	@Test public void test_7233() {
		checkNotSubtype("(X<X|Y<[Y]>>)|Y<[Y]>","X<X|null>");
	}
	@Test public void test_7234() {
		checkNotSubtype("(X<X|Y<[Y]>>)|Y<[Y]>","X<X|int>");
	}
	@Test public void test_7235() {
		checkIsSubtype("(X<X|Y<[Y]>>)|Y<[Y]>","X<X|Y<[Y]>>");
	}
	@Test public void test_7236() {
		checkIsSubtype("(X<X|Y<[Y]>>)|Y<[Y]>","[[void]]");
	}
	@Test public void test_7237() {
		checkNotSubtype("(X<X|Y<[Y]>>)|Y<[Y]>","[[any]]");
	}
	@Test public void test_7238() {
		checkNotSubtype("(X<X|Y<[Y]>>)|Y<[Y]>","[[null]]");
	}
	@Test public void test_7239() {
		checkNotSubtype("(X<X|Y<[Y]>>)|Y<[Y]>","[[int]]");
	}
	@Test public void test_7240() {
		checkIsSubtype("(X<X|Y<[Y]>>)|Y<[Y]>","[[X<[X]>]]");
	}
	@Test public void test_7241() {
		checkIsSubtype("(X<X|Y<[Y]>>)|Y<[Y]>","X<[[[X]]]>");
	}
	@Test public void test_7242() {
		checkIsSubtype("(X<X|Y<[Y]>>)|Y<[Y]>","X<[[Y<X|Y>]]>");
	}
	@Test public void test_7243() {
		checkIsSubtype("(X<X|Y<[Y]>>)|Y<[Y]>","[X<X|void>]");
	}
	@Test public void test_7244() {
		checkNotSubtype("(X<X|Y<[Y]>>)|Y<[Y]>","[X<X|any>]");
	}
	@Test public void test_7245() {
		checkNotSubtype("(X<X|Y<[Y]>>)|Y<[Y]>","[X<X|null>]");
	}
	@Test public void test_7246() {
		checkNotSubtype("(X<X|Y<[Y]>>)|Y<[Y]>","[X<X|int>]");
	}
	@Test public void test_7247() {
		checkIsSubtype("(X<X|Y<[Y]>>)|Y<[Y]>","[X<X|Y<[Y]>>]");
	}
	@Test public void test_7248() {
		checkIsSubtype("(X<X|Y<[Y]>>)|Y<[Y]>","X<[Y<Y|[X]>]>");
	}
	@Test public void test_7249() {
		checkIsSubtype("(X<X|Y<[Y]>>)|Y<[Y]>","X<[Y<Y|(Z<X|Z>)>]>");
	}
	@Test public void test_7250() {
		checkIsSubtype("(X<X|Y<[Y]>>)|Y<[Y]>","void|void");
	}
	@Test public void test_7251() {
		checkNotSubtype("(X<X|Y<[Y]>>)|Y<[Y]>","void|any");
	}
	@Test public void test_7252() {
		checkNotSubtype("(X<X|Y<[Y]>>)|Y<[Y]>","void|null");
	}
	@Test public void test_7253() {
		checkNotSubtype("(X<X|Y<[Y]>>)|Y<[Y]>","void|int");
	}
	@Test public void test_7254() {
		checkIsSubtype("(X<X|Y<[Y]>>)|Y<[Y]>","void|X<[X]>");
	}
	@Test public void test_7255() {
		checkIsSubtype("(X<X|Y<[Y]>>)|Y<[Y]>","void|[void]");
	}
	@Test public void test_7256() {
		checkIsSubtype("(X<X|Y<[Y]>>)|Y<[Y]>","void|(X<void|X>)");
	}
	@Test public void test_7257() {
		checkNotSubtype("(X<X|Y<[Y]>>)|Y<[Y]>","any|void");
	}
	@Test public void test_7258() {
		checkNotSubtype("(X<X|Y<[Y]>>)|Y<[Y]>","any|any");
	}
	@Test public void test_7259() {
		checkNotSubtype("(X<X|Y<[Y]>>)|Y<[Y]>","any|null");
	}
	@Test public void test_7260() {
		checkNotSubtype("(X<X|Y<[Y]>>)|Y<[Y]>","any|int");
	}
	@Test public void test_7261() {
		checkNotSubtype("(X<X|Y<[Y]>>)|Y<[Y]>","any|X<[X]>");
	}
	@Test public void test_7262() {
		checkNotSubtype("(X<X|Y<[Y]>>)|Y<[Y]>","any|[any]");
	}
	@Test public void test_7263() {
		checkNotSubtype("(X<X|Y<[Y]>>)|Y<[Y]>","any|(X<any|X>)");
	}
	@Test public void test_7264() {
		checkNotSubtype("(X<X|Y<[Y]>>)|Y<[Y]>","null|void");
	}
	@Test public void test_7265() {
		checkNotSubtype("(X<X|Y<[Y]>>)|Y<[Y]>","null|any");
	}
	@Test public void test_7266() {
		checkNotSubtype("(X<X|Y<[Y]>>)|Y<[Y]>","null|null");
	}
	@Test public void test_7267() {
		checkNotSubtype("(X<X|Y<[Y]>>)|Y<[Y]>","null|int");
	}
	@Test public void test_7268() {
		checkNotSubtype("(X<X|Y<[Y]>>)|Y<[Y]>","null|X<[X]>");
	}
	@Test public void test_7269() {
		checkNotSubtype("(X<X|Y<[Y]>>)|Y<[Y]>","null|[null]");
	}
	@Test public void test_7270() {
		checkNotSubtype("(X<X|Y<[Y]>>)|Y<[Y]>","null|(X<null|X>)");
	}
	@Test public void test_7271() {
		checkNotSubtype("(X<X|Y<[Y]>>)|Y<[Y]>","int|void");
	}
	@Test public void test_7272() {
		checkNotSubtype("(X<X|Y<[Y]>>)|Y<[Y]>","int|any");
	}
	@Test public void test_7273() {
		checkNotSubtype("(X<X|Y<[Y]>>)|Y<[Y]>","int|null");
	}
	@Test public void test_7274() {
		checkNotSubtype("(X<X|Y<[Y]>>)|Y<[Y]>","int|int");
	}
	@Test public void test_7275() {
		checkNotSubtype("(X<X|Y<[Y]>>)|Y<[Y]>","int|X<[X]>");
	}
	@Test public void test_7276() {
		checkNotSubtype("(X<X|Y<[Y]>>)|Y<[Y]>","int|[int]");
	}
	@Test public void test_7277() {
		checkNotSubtype("(X<X|Y<[Y]>>)|Y<[Y]>","int|(X<int|X>)");
	}
	@Test public void test_7278() {
		checkIsSubtype("(X<X|Y<[Y]>>)|Y<[Y]>","[void]|void");
	}
	@Test public void test_7279() {
		checkIsSubtype("(X<X|Y<[Y]>>)|Y<[Y]>","X<[X]>|void");
	}
	@Test public void test_7280() {
		checkIsSubtype("(X<X|Y<[Y]>>)|Y<[Y]>","X<X|[void]>");
	}
	@Test public void test_7281() {
		checkNotSubtype("(X<X|Y<[Y]>>)|Y<[Y]>","[any]|any");
	}
	@Test public void test_7282() {
		checkNotSubtype("(X<X|Y<[Y]>>)|Y<[Y]>","X<[X]>|any");
	}
	@Test public void test_7283() {
		checkNotSubtype("(X<X|Y<[Y]>>)|Y<[Y]>","X<X|[any]>");
	}
	@Test public void test_7284() {
		checkNotSubtype("(X<X|Y<[Y]>>)|Y<[Y]>","[null]|null");
	}
	@Test public void test_7285() {
		checkNotSubtype("(X<X|Y<[Y]>>)|Y<[Y]>","X<[X]>|null");
	}
	@Test public void test_7286() {
		checkNotSubtype("(X<X|Y<[Y]>>)|Y<[Y]>","X<X|[null]>");
	}
	@Test public void test_7287() {
		checkNotSubtype("(X<X|Y<[Y]>>)|Y<[Y]>","[int]|int");
	}
	@Test public void test_7288() {
		checkNotSubtype("(X<X|Y<[Y]>>)|Y<[Y]>","X<[X]>|int");
	}
	@Test public void test_7289() {
		checkNotSubtype("(X<X|Y<[Y]>>)|Y<[Y]>","X<X|[int]>");
	}
	@Test public void test_7290() {
		checkIsSubtype("(X<X|Y<[Y]>>)|Y<[Y]>","[X<[X]>]|X<[X]>");
	}
	@Test public void test_7291() {
		checkIsSubtype("(X<X|Y<[Y]>>)|Y<[Y]>","X<[X]>|Y<[Y]>");
	}
	@Test public void test_7292() {
		checkIsSubtype("(X<X|Y<[Y]>>)|Y<[Y]>","X<[X]>|[X<[X]>]");
	}
	@Test public void test_7293() {
		checkIsSubtype("(X<X|Y<[Y]>>)|Y<[Y]>","X<X|[Y<[Y]>]>");
	}
	@Test public void test_7294() {
		checkIsSubtype("(X<X|Y<[Y]>>)|Y<[Y]>","X<X|[[X]]>");
	}
	@Test public void test_7295() {
		checkIsSubtype("(X<X|Y<[Y]>>)|Y<[Y]>","X<[X]>|(Y<X<[X]>|Y>)");
	}
	@Test public void test_7296() {
		checkIsSubtype("(X<X|Y<[Y]>>)|Y<[Y]>","X<X|[Y<X|Y>]>");
	}
	@Test public void test_7297() {
		checkIsSubtype("(X<X|Y<[Y]>>)|Y<[Y]>","(X<X|void>)|void");
	}
	@Test public void test_7298() {
		checkIsSubtype("(X<X|Y<[Y]>>)|Y<[Y]>","X<X|(Y<Y|void>)>");
	}
	@Test public void test_7299() {
		checkNotSubtype("(X<X|Y<[Y]>>)|Y<[Y]>","(X<X|any>)|any");
	}
	@Test public void test_7300() {
		checkNotSubtype("(X<X|Y<[Y]>>)|Y<[Y]>","X<X|(Y<Y|any>)>");
	}
	@Test public void test_7301() {
		checkNotSubtype("(X<X|Y<[Y]>>)|Y<[Y]>","(X<X|null>)|null");
	}
	@Test public void test_7302() {
		checkNotSubtype("(X<X|Y<[Y]>>)|Y<[Y]>","X<X|(Y<Y|null>)>");
	}
	@Test public void test_7303() {
		checkNotSubtype("(X<X|Y<[Y]>>)|Y<[Y]>","(X<X|int>)|int");
	}
	@Test public void test_7304() {
		checkNotSubtype("(X<X|Y<[Y]>>)|Y<[Y]>","X<X|(Y<Y|int>)>");
	}
	@Test public void test_7305() {
		checkIsSubtype("(X<X|Y<[Y]>>)|Y<[Y]>","(X<X|Y<[Y]>>)|Y<[Y]>");
	}
	@Test public void test_7306() {
		checkIsSubtype("(X<X|Y<[Y]>>)|Y<[Y]>","X<X|(Y<Y|Z<[Z]>>)>");
	}
	@Test public void test_7307() {
		checkIsSubtype("(X<X|Y<[Y]>>)|Y<[Y]>","X<X|(Y<Y|[X]>)>");
	}
	@Test public void test_7308() {
		checkIsSubtype("(X<X|Y<[Y]>>)|Y<[Y]>","X<X|(Y<Y|(Z<X|Z>)>)>");
	}
	@Test public void test_7309() {
		checkNotSubtype("X<X|(Y<Y|Z<[Z]>>)>","any");
	}
	@Test public void test_7310() {
		checkNotSubtype("X<X|(Y<Y|Z<[Z]>>)>","null");
	}
	@Test public void test_7311() {
		checkNotSubtype("X<X|(Y<Y|Z<[Z]>>)>","int");
	}
	@Test public void test_7312() {
		checkIsSubtype("X<X|(Y<Y|Z<[Z]>>)>","X<[X]>");
	}
	@Test public void test_7313() {
		checkIsSubtype("X<X|(Y<Y|Z<[Z]>>)>","[void]");
	}
	@Test public void test_7314() {
		checkNotSubtype("X<X|(Y<Y|Z<[Z]>>)>","[any]");
	}
	@Test public void test_7315() {
		checkNotSubtype("X<X|(Y<Y|Z<[Z]>>)>","[null]");
	}
	@Test public void test_7316() {
		checkNotSubtype("X<X|(Y<Y|Z<[Z]>>)>","[int]");
	}
	@Test public void test_7317() {
		checkIsSubtype("X<X|(Y<Y|Z<[Z]>>)>","[X<[X]>]");
	}
	@Test public void test_7318() {
		checkIsSubtype("X<X|(Y<Y|Z<[Z]>>)>","X<X|void>");
	}
	@Test public void test_7319() {
		checkNotSubtype("X<X|(Y<Y|Z<[Z]>>)>","X<X|any>");
	}
	@Test public void test_7320() {
		checkNotSubtype("X<X|(Y<Y|Z<[Z]>>)>","X<X|null>");
	}
	@Test public void test_7321() {
		checkNotSubtype("X<X|(Y<Y|Z<[Z]>>)>","X<X|int>");
	}
	@Test public void test_7322() {
		checkIsSubtype("X<X|(Y<Y|Z<[Z]>>)>","X<X|Y<[Y]>>");
	}
	@Test public void test_7323() {
		checkIsSubtype("X<X|(Y<Y|Z<[Z]>>)>","[[void]]");
	}
	@Test public void test_7324() {
		checkNotSubtype("X<X|(Y<Y|Z<[Z]>>)>","[[any]]");
	}
	@Test public void test_7325() {
		checkNotSubtype("X<X|(Y<Y|Z<[Z]>>)>","[[null]]");
	}
	@Test public void test_7326() {
		checkNotSubtype("X<X|(Y<Y|Z<[Z]>>)>","[[int]]");
	}
	@Test public void test_7327() {
		checkIsSubtype("X<X|(Y<Y|Z<[Z]>>)>","[[X<[X]>]]");
	}
	@Test public void test_7328() {
		checkIsSubtype("X<X|(Y<Y|Z<[Z]>>)>","X<[[[X]]]>");
	}
	@Test public void test_7329() {
		checkIsSubtype("X<X|(Y<Y|Z<[Z]>>)>","X<[[Y<X|Y>]]>");
	}
	@Test public void test_7330() {
		checkIsSubtype("X<X|(Y<Y|Z<[Z]>>)>","[X<X|void>]");
	}
	@Test public void test_7331() {
		checkNotSubtype("X<X|(Y<Y|Z<[Z]>>)>","[X<X|any>]");
	}
	@Test public void test_7332() {
		checkNotSubtype("X<X|(Y<Y|Z<[Z]>>)>","[X<X|null>]");
	}
	@Test public void test_7333() {
		checkNotSubtype("X<X|(Y<Y|Z<[Z]>>)>","[X<X|int>]");
	}
	@Test public void test_7334() {
		checkIsSubtype("X<X|(Y<Y|Z<[Z]>>)>","[X<X|Y<[Y]>>]");
	}
	@Test public void test_7335() {
		checkIsSubtype("X<X|(Y<Y|Z<[Z]>>)>","X<[Y<Y|[X]>]>");
	}
	@Test public void test_7336() {
		checkIsSubtype("X<X|(Y<Y|Z<[Z]>>)>","X<[Y<Y|(Z<X|Z>)>]>");
	}
	@Test public void test_7337() {
		checkIsSubtype("X<X|(Y<Y|Z<[Z]>>)>","void|void");
	}
	@Test public void test_7338() {
		checkNotSubtype("X<X|(Y<Y|Z<[Z]>>)>","void|any");
	}
	@Test public void test_7339() {
		checkNotSubtype("X<X|(Y<Y|Z<[Z]>>)>","void|null");
	}
	@Test public void test_7340() {
		checkNotSubtype("X<X|(Y<Y|Z<[Z]>>)>","void|int");
	}
	@Test public void test_7341() {
		checkIsSubtype("X<X|(Y<Y|Z<[Z]>>)>","void|X<[X]>");
	}
	@Test public void test_7342() {
		checkIsSubtype("X<X|(Y<Y|Z<[Z]>>)>","void|[void]");
	}
	@Test public void test_7343() {
		checkIsSubtype("X<X|(Y<Y|Z<[Z]>>)>","void|(X<void|X>)");
	}
	@Test public void test_7344() {
		checkNotSubtype("X<X|(Y<Y|Z<[Z]>>)>","any|void");
	}
	@Test public void test_7345() {
		checkNotSubtype("X<X|(Y<Y|Z<[Z]>>)>","any|any");
	}
	@Test public void test_7346() {
		checkNotSubtype("X<X|(Y<Y|Z<[Z]>>)>","any|null");
	}
	@Test public void test_7347() {
		checkNotSubtype("X<X|(Y<Y|Z<[Z]>>)>","any|int");
	}
	@Test public void test_7348() {
		checkNotSubtype("X<X|(Y<Y|Z<[Z]>>)>","any|X<[X]>");
	}
	@Test public void test_7349() {
		checkNotSubtype("X<X|(Y<Y|Z<[Z]>>)>","any|[any]");
	}
	@Test public void test_7350() {
		checkNotSubtype("X<X|(Y<Y|Z<[Z]>>)>","any|(X<any|X>)");
	}
	@Test public void test_7351() {
		checkNotSubtype("X<X|(Y<Y|Z<[Z]>>)>","null|void");
	}
	@Test public void test_7352() {
		checkNotSubtype("X<X|(Y<Y|Z<[Z]>>)>","null|any");
	}
	@Test public void test_7353() {
		checkNotSubtype("X<X|(Y<Y|Z<[Z]>>)>","null|null");
	}
	@Test public void test_7354() {
		checkNotSubtype("X<X|(Y<Y|Z<[Z]>>)>","null|int");
	}
	@Test public void test_7355() {
		checkNotSubtype("X<X|(Y<Y|Z<[Z]>>)>","null|X<[X]>");
	}
	@Test public void test_7356() {
		checkNotSubtype("X<X|(Y<Y|Z<[Z]>>)>","null|[null]");
	}
	@Test public void test_7357() {
		checkNotSubtype("X<X|(Y<Y|Z<[Z]>>)>","null|(X<null|X>)");
	}
	@Test public void test_7358() {
		checkNotSubtype("X<X|(Y<Y|Z<[Z]>>)>","int|void");
	}
	@Test public void test_7359() {
		checkNotSubtype("X<X|(Y<Y|Z<[Z]>>)>","int|any");
	}
	@Test public void test_7360() {
		checkNotSubtype("X<X|(Y<Y|Z<[Z]>>)>","int|null");
	}
	@Test public void test_7361() {
		checkNotSubtype("X<X|(Y<Y|Z<[Z]>>)>","int|int");
	}
	@Test public void test_7362() {
		checkNotSubtype("X<X|(Y<Y|Z<[Z]>>)>","int|X<[X]>");
	}
	@Test public void test_7363() {
		checkNotSubtype("X<X|(Y<Y|Z<[Z]>>)>","int|[int]");
	}
	@Test public void test_7364() {
		checkNotSubtype("X<X|(Y<Y|Z<[Z]>>)>","int|(X<int|X>)");
	}
	@Test public void test_7365() {
		checkIsSubtype("X<X|(Y<Y|Z<[Z]>>)>","[void]|void");
	}
	@Test public void test_7366() {
		checkIsSubtype("X<X|(Y<Y|Z<[Z]>>)>","X<[X]>|void");
	}
	@Test public void test_7367() {
		checkIsSubtype("X<X|(Y<Y|Z<[Z]>>)>","X<X|[void]>");
	}
	@Test public void test_7368() {
		checkNotSubtype("X<X|(Y<Y|Z<[Z]>>)>","[any]|any");
	}
	@Test public void test_7369() {
		checkNotSubtype("X<X|(Y<Y|Z<[Z]>>)>","X<[X]>|any");
	}
	@Test public void test_7370() {
		checkNotSubtype("X<X|(Y<Y|Z<[Z]>>)>","X<X|[any]>");
	}
	@Test public void test_7371() {
		checkNotSubtype("X<X|(Y<Y|Z<[Z]>>)>","[null]|null");
	}
	@Test public void test_7372() {
		checkNotSubtype("X<X|(Y<Y|Z<[Z]>>)>","X<[X]>|null");
	}
	@Test public void test_7373() {
		checkNotSubtype("X<X|(Y<Y|Z<[Z]>>)>","X<X|[null]>");
	}
	@Test public void test_7374() {
		checkNotSubtype("X<X|(Y<Y|Z<[Z]>>)>","[int]|int");
	}
	@Test public void test_7375() {
		checkNotSubtype("X<X|(Y<Y|Z<[Z]>>)>","X<[X]>|int");
	}
	@Test public void test_7376() {
		checkNotSubtype("X<X|(Y<Y|Z<[Z]>>)>","X<X|[int]>");
	}
	@Test public void test_7377() {
		checkIsSubtype("X<X|(Y<Y|Z<[Z]>>)>","[X<[X]>]|X<[X]>");
	}
	@Test public void test_7378() {
		checkIsSubtype("X<X|(Y<Y|Z<[Z]>>)>","X<[X]>|Y<[Y]>");
	}
	@Test public void test_7379() {
		checkIsSubtype("X<X|(Y<Y|Z<[Z]>>)>","X<[X]>|[X<[X]>]");
	}
	@Test public void test_7380() {
		checkIsSubtype("X<X|(Y<Y|Z<[Z]>>)>","X<X|[Y<[Y]>]>");
	}
	@Test public void test_7381() {
		checkIsSubtype("X<X|(Y<Y|Z<[Z]>>)>","X<X|[[X]]>");
	}
	@Test public void test_7382() {
		checkIsSubtype("X<X|(Y<Y|Z<[Z]>>)>","X<[X]>|(Y<X<[X]>|Y>)");
	}
	@Test public void test_7383() {
		checkIsSubtype("X<X|(Y<Y|Z<[Z]>>)>","X<X|[Y<X|Y>]>");
	}
	@Test public void test_7384() {
		checkIsSubtype("X<X|(Y<Y|Z<[Z]>>)>","(X<X|void>)|void");
	}
	@Test public void test_7385() {
		checkIsSubtype("X<X|(Y<Y|Z<[Z]>>)>","X<X|(Y<Y|void>)>");
	}
	@Test public void test_7386() {
		checkNotSubtype("X<X|(Y<Y|Z<[Z]>>)>","(X<X|any>)|any");
	}
	@Test public void test_7387() {
		checkNotSubtype("X<X|(Y<Y|Z<[Z]>>)>","X<X|(Y<Y|any>)>");
	}
	@Test public void test_7388() {
		checkNotSubtype("X<X|(Y<Y|Z<[Z]>>)>","(X<X|null>)|null");
	}
	@Test public void test_7389() {
		checkNotSubtype("X<X|(Y<Y|Z<[Z]>>)>","X<X|(Y<Y|null>)>");
	}
	@Test public void test_7390() {
		checkNotSubtype("X<X|(Y<Y|Z<[Z]>>)>","(X<X|int>)|int");
	}
	@Test public void test_7391() {
		checkNotSubtype("X<X|(Y<Y|Z<[Z]>>)>","X<X|(Y<Y|int>)>");
	}
	@Test public void test_7392() {
		checkIsSubtype("X<X|(Y<Y|Z<[Z]>>)>","(X<X|Y<[Y]>>)|Y<[Y]>");
	}
	@Test public void test_7393() {
		checkIsSubtype("X<X|(Y<Y|Z<[Z]>>)>","X<X|(Y<Y|Z<[Z]>>)>");
	}
	@Test public void test_7394() {
		checkIsSubtype("X<X|(Y<Y|Z<[Z]>>)>","X<X|(Y<Y|[X]>)>");
	}
	@Test public void test_7395() {
		checkIsSubtype("X<X|(Y<Y|Z<[Z]>>)>","X<X|(Y<Y|(Z<X|Z>)>)>");
	}
	@Test public void test_7396() {
		checkNotSubtype("X<X|(Y<Y|[X]>)>","any");
	}
	@Test public void test_7397() {
		checkNotSubtype("X<X|(Y<Y|[X]>)>","null");
	}
	@Test public void test_7398() {
		checkNotSubtype("X<X|(Y<Y|[X]>)>","int");
	}
	@Test public void test_7399() {
		checkIsSubtype("X<X|(Y<Y|[X]>)>","X<[X]>");
	}
	@Test public void test_7400() {
		checkIsSubtype("X<X|(Y<Y|[X]>)>","[void]");
	}
	@Test public void test_7401() {
		checkNotSubtype("X<X|(Y<Y|[X]>)>","[any]");
	}
	@Test public void test_7402() {
		checkNotSubtype("X<X|(Y<Y|[X]>)>","[null]");
	}
	@Test public void test_7403() {
		checkNotSubtype("X<X|(Y<Y|[X]>)>","[int]");
	}
	@Test public void test_7404() {
		checkIsSubtype("X<X|(Y<Y|[X]>)>","[X<[X]>]");
	}
	@Test public void test_7405() {
		checkIsSubtype("X<X|(Y<Y|[X]>)>","X<X|void>");
	}
	@Test public void test_7406() {
		checkNotSubtype("X<X|(Y<Y|[X]>)>","X<X|any>");
	}
	@Test public void test_7407() {
		checkNotSubtype("X<X|(Y<Y|[X]>)>","X<X|null>");
	}
	@Test public void test_7408() {
		checkNotSubtype("X<X|(Y<Y|[X]>)>","X<X|int>");
	}
	@Test public void test_7409() {
		checkIsSubtype("X<X|(Y<Y|[X]>)>","X<X|Y<[Y]>>");
	}
	@Test public void test_7410() {
		checkIsSubtype("X<X|(Y<Y|[X]>)>","[[void]]");
	}
	@Test public void test_7411() {
		checkNotSubtype("X<X|(Y<Y|[X]>)>","[[any]]");
	}
	@Test public void test_7412() {
		checkNotSubtype("X<X|(Y<Y|[X]>)>","[[null]]");
	}
	@Test public void test_7413() {
		checkNotSubtype("X<X|(Y<Y|[X]>)>","[[int]]");
	}
	@Test public void test_7414() {
		checkIsSubtype("X<X|(Y<Y|[X]>)>","[[X<[X]>]]");
	}
	@Test public void test_7415() {
		checkIsSubtype("X<X|(Y<Y|[X]>)>","X<[[[X]]]>");
	}
	@Test public void test_7416() {
		checkIsSubtype("X<X|(Y<Y|[X]>)>","X<[[Y<X|Y>]]>");
	}
	@Test public void test_7417() {
		checkIsSubtype("X<X|(Y<Y|[X]>)>","[X<X|void>]");
	}
	@Test public void test_7418() {
		checkNotSubtype("X<X|(Y<Y|[X]>)>","[X<X|any>]");
	}
	@Test public void test_7419() {
		checkNotSubtype("X<X|(Y<Y|[X]>)>","[X<X|null>]");
	}
	@Test public void test_7420() {
		checkNotSubtype("X<X|(Y<Y|[X]>)>","[X<X|int>]");
	}
	@Test public void test_7421() {
		checkIsSubtype("X<X|(Y<Y|[X]>)>","[X<X|Y<[Y]>>]");
	}
	@Test public void test_7422() {
		checkIsSubtype("X<X|(Y<Y|[X]>)>","X<[Y<Y|[X]>]>");
	}
	@Test public void test_7423() {
		checkIsSubtype("X<X|(Y<Y|[X]>)>","X<[Y<Y|(Z<X|Z>)>]>");
	}
	@Test public void test_7424() {
		checkIsSubtype("X<X|(Y<Y|[X]>)>","void|void");
	}
	@Test public void test_7425() {
		checkNotSubtype("X<X|(Y<Y|[X]>)>","void|any");
	}
	@Test public void test_7426() {
		checkNotSubtype("X<X|(Y<Y|[X]>)>","void|null");
	}
	@Test public void test_7427() {
		checkNotSubtype("X<X|(Y<Y|[X]>)>","void|int");
	}
	@Test public void test_7428() {
		checkIsSubtype("X<X|(Y<Y|[X]>)>","void|X<[X]>");
	}
	@Test public void test_7429() {
		checkIsSubtype("X<X|(Y<Y|[X]>)>","void|[void]");
	}
	@Test public void test_7430() {
		checkIsSubtype("X<X|(Y<Y|[X]>)>","void|(X<void|X>)");
	}
	@Test public void test_7431() {
		checkNotSubtype("X<X|(Y<Y|[X]>)>","any|void");
	}
	@Test public void test_7432() {
		checkNotSubtype("X<X|(Y<Y|[X]>)>","any|any");
	}
	@Test public void test_7433() {
		checkNotSubtype("X<X|(Y<Y|[X]>)>","any|null");
	}
	@Test public void test_7434() {
		checkNotSubtype("X<X|(Y<Y|[X]>)>","any|int");
	}
	@Test public void test_7435() {
		checkNotSubtype("X<X|(Y<Y|[X]>)>","any|X<[X]>");
	}
	@Test public void test_7436() {
		checkNotSubtype("X<X|(Y<Y|[X]>)>","any|[any]");
	}
	@Test public void test_7437() {
		checkNotSubtype("X<X|(Y<Y|[X]>)>","any|(X<any|X>)");
	}
	@Test public void test_7438() {
		checkNotSubtype("X<X|(Y<Y|[X]>)>","null|void");
	}
	@Test public void test_7439() {
		checkNotSubtype("X<X|(Y<Y|[X]>)>","null|any");
	}
	@Test public void test_7440() {
		checkNotSubtype("X<X|(Y<Y|[X]>)>","null|null");
	}
	@Test public void test_7441() {
		checkNotSubtype("X<X|(Y<Y|[X]>)>","null|int");
	}
	@Test public void test_7442() {
		checkNotSubtype("X<X|(Y<Y|[X]>)>","null|X<[X]>");
	}
	@Test public void test_7443() {
		checkNotSubtype("X<X|(Y<Y|[X]>)>","null|[null]");
	}
	@Test public void test_7444() {
		checkNotSubtype("X<X|(Y<Y|[X]>)>","null|(X<null|X>)");
	}
	@Test public void test_7445() {
		checkNotSubtype("X<X|(Y<Y|[X]>)>","int|void");
	}
	@Test public void test_7446() {
		checkNotSubtype("X<X|(Y<Y|[X]>)>","int|any");
	}
	@Test public void test_7447() {
		checkNotSubtype("X<X|(Y<Y|[X]>)>","int|null");
	}
	@Test public void test_7448() {
		checkNotSubtype("X<X|(Y<Y|[X]>)>","int|int");
	}
	@Test public void test_7449() {
		checkNotSubtype("X<X|(Y<Y|[X]>)>","int|X<[X]>");
	}
	@Test public void test_7450() {
		checkNotSubtype("X<X|(Y<Y|[X]>)>","int|[int]");
	}
	@Test public void test_7451() {
		checkNotSubtype("X<X|(Y<Y|[X]>)>","int|(X<int|X>)");
	}
	@Test public void test_7452() {
		checkIsSubtype("X<X|(Y<Y|[X]>)>","[void]|void");
	}
	@Test public void test_7453() {
		checkIsSubtype("X<X|(Y<Y|[X]>)>","X<[X]>|void");
	}
	@Test public void test_7454() {
		checkIsSubtype("X<X|(Y<Y|[X]>)>","X<X|[void]>");
	}
	@Test public void test_7455() {
		checkNotSubtype("X<X|(Y<Y|[X]>)>","[any]|any");
	}
	@Test public void test_7456() {
		checkNotSubtype("X<X|(Y<Y|[X]>)>","X<[X]>|any");
	}
	@Test public void test_7457() {
		checkNotSubtype("X<X|(Y<Y|[X]>)>","X<X|[any]>");
	}
	@Test public void test_7458() {
		checkNotSubtype("X<X|(Y<Y|[X]>)>","[null]|null");
	}
	@Test public void test_7459() {
		checkNotSubtype("X<X|(Y<Y|[X]>)>","X<[X]>|null");
	}
	@Test public void test_7460() {
		checkNotSubtype("X<X|(Y<Y|[X]>)>","X<X|[null]>");
	}
	@Test public void test_7461() {
		checkNotSubtype("X<X|(Y<Y|[X]>)>","[int]|int");
	}
	@Test public void test_7462() {
		checkNotSubtype("X<X|(Y<Y|[X]>)>","X<[X]>|int");
	}
	@Test public void test_7463() {
		checkNotSubtype("X<X|(Y<Y|[X]>)>","X<X|[int]>");
	}
	@Test public void test_7464() {
		checkIsSubtype("X<X|(Y<Y|[X]>)>","[X<[X]>]|X<[X]>");
	}
	@Test public void test_7465() {
		checkIsSubtype("X<X|(Y<Y|[X]>)>","X<[X]>|Y<[Y]>");
	}
	@Test public void test_7466() {
		checkIsSubtype("X<X|(Y<Y|[X]>)>","X<[X]>|[X<[X]>]");
	}
	@Test public void test_7467() {
		checkIsSubtype("X<X|(Y<Y|[X]>)>","X<X|[Y<[Y]>]>");
	}
	@Test public void test_7468() {
		checkIsSubtype("X<X|(Y<Y|[X]>)>","X<X|[[X]]>");
	}
	@Test public void test_7469() {
		checkIsSubtype("X<X|(Y<Y|[X]>)>","X<[X]>|(Y<X<[X]>|Y>)");
	}
	@Test public void test_7470() {
		checkIsSubtype("X<X|(Y<Y|[X]>)>","X<X|[Y<X|Y>]>");
	}
	@Test public void test_7471() {
		checkIsSubtype("X<X|(Y<Y|[X]>)>","(X<X|void>)|void");
	}
	@Test public void test_7472() {
		checkIsSubtype("X<X|(Y<Y|[X]>)>","X<X|(Y<Y|void>)>");
	}
	@Test public void test_7473() {
		checkNotSubtype("X<X|(Y<Y|[X]>)>","(X<X|any>)|any");
	}
	@Test public void test_7474() {
		checkNotSubtype("X<X|(Y<Y|[X]>)>","X<X|(Y<Y|any>)>");
	}
	@Test public void test_7475() {
		checkNotSubtype("X<X|(Y<Y|[X]>)>","(X<X|null>)|null");
	}
	@Test public void test_7476() {
		checkNotSubtype("X<X|(Y<Y|[X]>)>","X<X|(Y<Y|null>)>");
	}
	@Test public void test_7477() {
		checkNotSubtype("X<X|(Y<Y|[X]>)>","(X<X|int>)|int");
	}
	@Test public void test_7478() {
		checkNotSubtype("X<X|(Y<Y|[X]>)>","X<X|(Y<Y|int>)>");
	}
	@Test public void test_7479() {
		checkIsSubtype("X<X|(Y<Y|[X]>)>","(X<X|Y<[Y]>>)|Y<[Y]>");
	}
	@Test public void test_7480() {
		checkIsSubtype("X<X|(Y<Y|[X]>)>","X<X|(Y<Y|Z<[Z]>>)>");
	}
	@Test public void test_7481() {
		checkIsSubtype("X<X|(Y<Y|[X]>)>","X<X|(Y<Y|[X]>)>");
	}
	@Test public void test_7482() {
		checkIsSubtype("X<X|(Y<Y|[X]>)>","X<X|(Y<Y|(Z<X|Z>)>)>");
	}
	@Test public void test_7483() {
		checkNotSubtype("X<X|(Y<Y|(Z<X|Z>)>)>","any");
	}
	@Test public void test_7484() {
		checkNotSubtype("X<X|(Y<Y|(Z<X|Z>)>)>","null");
	}
	@Test public void test_7485() {
		checkNotSubtype("X<X|(Y<Y|(Z<X|Z>)>)>","int");
	}
	@Test public void test_7486() {
		checkNotSubtype("X<X|(Y<Y|(Z<X|Z>)>)>","X<[X]>");
	}
	@Test public void test_7487() {
		checkNotSubtype("X<X|(Y<Y|(Z<X|Z>)>)>","[void]");
	}
	@Test public void test_7488() {
		checkNotSubtype("X<X|(Y<Y|(Z<X|Z>)>)>","[any]");
	}
	@Test public void test_7489() {
		checkNotSubtype("X<X|(Y<Y|(Z<X|Z>)>)>","[null]");
	}
	@Test public void test_7490() {
		checkNotSubtype("X<X|(Y<Y|(Z<X|Z>)>)>","[int]");
	}
	@Test public void test_7491() {
		checkNotSubtype("X<X|(Y<Y|(Z<X|Z>)>)>","[X<[X]>]");
	}
	@Test public void test_7492() {
		checkIsSubtype("X<X|(Y<Y|(Z<X|Z>)>)>","X<X|void>");
	}
	@Test public void test_7493() {
		checkNotSubtype("X<X|(Y<Y|(Z<X|Z>)>)>","X<X|any>");
	}
	@Test public void test_7494() {
		checkNotSubtype("X<X|(Y<Y|(Z<X|Z>)>)>","X<X|null>");
	}
	@Test public void test_7495() {
		checkNotSubtype("X<X|(Y<Y|(Z<X|Z>)>)>","X<X|int>");
	}
	@Test public void test_7496() {
		checkNotSubtype("X<X|(Y<Y|(Z<X|Z>)>)>","X<X|Y<[Y]>>");
	}
	@Test public void test_7497() {
		checkNotSubtype("X<X|(Y<Y|(Z<X|Z>)>)>","[[void]]");
	}
	@Test public void test_7498() {
		checkNotSubtype("X<X|(Y<Y|(Z<X|Z>)>)>","[[any]]");
	}
	@Test public void test_7499() {
		checkNotSubtype("X<X|(Y<Y|(Z<X|Z>)>)>","[[null]]");
	}
	@Test public void test_7500() {
		checkNotSubtype("X<X|(Y<Y|(Z<X|Z>)>)>","[[int]]");
	}
	@Test public void test_7501() {
		checkNotSubtype("X<X|(Y<Y|(Z<X|Z>)>)>","[[X<[X]>]]");
	}
	@Test public void test_7502() {
		checkNotSubtype("X<X|(Y<Y|(Z<X|Z>)>)>","X<[[[X]]]>");
	}
	@Test public void test_7503() {
		checkNotSubtype("X<X|(Y<Y|(Z<X|Z>)>)>","X<[[Y<X|Y>]]>");
	}
	@Test public void test_7504() {
		checkNotSubtype("X<X|(Y<Y|(Z<X|Z>)>)>","[X<X|void>]");
	}
	@Test public void test_7505() {
		checkNotSubtype("X<X|(Y<Y|(Z<X|Z>)>)>","[X<X|any>]");
	}
	@Test public void test_7506() {
		checkNotSubtype("X<X|(Y<Y|(Z<X|Z>)>)>","[X<X|null>]");
	}
	@Test public void test_7507() {
		checkNotSubtype("X<X|(Y<Y|(Z<X|Z>)>)>","[X<X|int>]");
	}
	@Test public void test_7508() {
		checkNotSubtype("X<X|(Y<Y|(Z<X|Z>)>)>","[X<X|Y<[Y]>>]");
	}
	@Test public void test_7509() {
		checkNotSubtype("X<X|(Y<Y|(Z<X|Z>)>)>","X<[Y<Y|[X]>]>");
	}
	@Test public void test_7510() {
		checkNotSubtype("X<X|(Y<Y|(Z<X|Z>)>)>","X<[Y<Y|(Z<X|Z>)>]>");
	}
	@Test public void test_7511() {
		checkIsSubtype("X<X|(Y<Y|(Z<X|Z>)>)>","void|void");
	}
	@Test public void test_7512() {
		checkNotSubtype("X<X|(Y<Y|(Z<X|Z>)>)>","void|any");
	}
	@Test public void test_7513() {
		checkNotSubtype("X<X|(Y<Y|(Z<X|Z>)>)>","void|null");
	}
	@Test public void test_7514() {
		checkNotSubtype("X<X|(Y<Y|(Z<X|Z>)>)>","void|int");
	}
	@Test public void test_7515() {
		checkNotSubtype("X<X|(Y<Y|(Z<X|Z>)>)>","void|X<[X]>");
	}
	@Test public void test_7516() {
		checkNotSubtype("X<X|(Y<Y|(Z<X|Z>)>)>","void|[void]");
	}
	@Test public void test_7517() {
		checkIsSubtype("X<X|(Y<Y|(Z<X|Z>)>)>","void|(X<void|X>)");
	}
	@Test public void test_7518() {
		checkNotSubtype("X<X|(Y<Y|(Z<X|Z>)>)>","any|void");
	}
	@Test public void test_7519() {
		checkNotSubtype("X<X|(Y<Y|(Z<X|Z>)>)>","any|any");
	}
	@Test public void test_7520() {
		checkNotSubtype("X<X|(Y<Y|(Z<X|Z>)>)>","any|null");
	}
	@Test public void test_7521() {
		checkNotSubtype("X<X|(Y<Y|(Z<X|Z>)>)>","any|int");
	}
	@Test public void test_7522() {
		checkNotSubtype("X<X|(Y<Y|(Z<X|Z>)>)>","any|X<[X]>");
	}
	@Test public void test_7523() {
		checkNotSubtype("X<X|(Y<Y|(Z<X|Z>)>)>","any|[any]");
	}
	@Test public void test_7524() {
		checkNotSubtype("X<X|(Y<Y|(Z<X|Z>)>)>","any|(X<any|X>)");
	}
	@Test public void test_7525() {
		checkNotSubtype("X<X|(Y<Y|(Z<X|Z>)>)>","null|void");
	}
	@Test public void test_7526() {
		checkNotSubtype("X<X|(Y<Y|(Z<X|Z>)>)>","null|any");
	}
	@Test public void test_7527() {
		checkNotSubtype("X<X|(Y<Y|(Z<X|Z>)>)>","null|null");
	}
	@Test public void test_7528() {
		checkNotSubtype("X<X|(Y<Y|(Z<X|Z>)>)>","null|int");
	}
	@Test public void test_7529() {
		checkNotSubtype("X<X|(Y<Y|(Z<X|Z>)>)>","null|X<[X]>");
	}
	@Test public void test_7530() {
		checkNotSubtype("X<X|(Y<Y|(Z<X|Z>)>)>","null|[null]");
	}
	@Test public void test_7531() {
		checkNotSubtype("X<X|(Y<Y|(Z<X|Z>)>)>","null|(X<null|X>)");
	}
	@Test public void test_7532() {
		checkNotSubtype("X<X|(Y<Y|(Z<X|Z>)>)>","int|void");
	}
	@Test public void test_7533() {
		checkNotSubtype("X<X|(Y<Y|(Z<X|Z>)>)>","int|any");
	}
	@Test public void test_7534() {
		checkNotSubtype("X<X|(Y<Y|(Z<X|Z>)>)>","int|null");
	}
	@Test public void test_7535() {
		checkNotSubtype("X<X|(Y<Y|(Z<X|Z>)>)>","int|int");
	}
	@Test public void test_7536() {
		checkNotSubtype("X<X|(Y<Y|(Z<X|Z>)>)>","int|X<[X]>");
	}
	@Test public void test_7537() {
		checkNotSubtype("X<X|(Y<Y|(Z<X|Z>)>)>","int|[int]");
	}
	@Test public void test_7538() {
		checkNotSubtype("X<X|(Y<Y|(Z<X|Z>)>)>","int|(X<int|X>)");
	}
	@Test public void test_7539() {
		checkNotSubtype("X<X|(Y<Y|(Z<X|Z>)>)>","[void]|void");
	}
	@Test public void test_7540() {
		checkNotSubtype("X<X|(Y<Y|(Z<X|Z>)>)>","X<[X]>|void");
	}
	@Test public void test_7541() {
		checkNotSubtype("X<X|(Y<Y|(Z<X|Z>)>)>","X<X|[void]>");
	}
	@Test public void test_7542() {
		checkNotSubtype("X<X|(Y<Y|(Z<X|Z>)>)>","[any]|any");
	}
	@Test public void test_7543() {
		checkNotSubtype("X<X|(Y<Y|(Z<X|Z>)>)>","X<[X]>|any");
	}
	@Test public void test_7544() {
		checkNotSubtype("X<X|(Y<Y|(Z<X|Z>)>)>","X<X|[any]>");
	}
	@Test public void test_7545() {
		checkNotSubtype("X<X|(Y<Y|(Z<X|Z>)>)>","[null]|null");
	}
	@Test public void test_7546() {
		checkNotSubtype("X<X|(Y<Y|(Z<X|Z>)>)>","X<[X]>|null");
	}
	@Test public void test_7547() {
		checkNotSubtype("X<X|(Y<Y|(Z<X|Z>)>)>","X<X|[null]>");
	}
	@Test public void test_7548() {
		checkNotSubtype("X<X|(Y<Y|(Z<X|Z>)>)>","[int]|int");
	}
	@Test public void test_7549() {
		checkNotSubtype("X<X|(Y<Y|(Z<X|Z>)>)>","X<[X]>|int");
	}
	@Test public void test_7550() {
		checkNotSubtype("X<X|(Y<Y|(Z<X|Z>)>)>","X<X|[int]>");
	}
	@Test public void test_7551() {
		checkNotSubtype("X<X|(Y<Y|(Z<X|Z>)>)>","[X<[X]>]|X<[X]>");
	}
	@Test public void test_7552() {
		checkNotSubtype("X<X|(Y<Y|(Z<X|Z>)>)>","X<[X]>|Y<[Y]>");
	}
	@Test public void test_7553() {
		checkNotSubtype("X<X|(Y<Y|(Z<X|Z>)>)>","X<[X]>|[X<[X]>]");
	}
	@Test public void test_7554() {
		checkNotSubtype("X<X|(Y<Y|(Z<X|Z>)>)>","X<X|[Y<[Y]>]>");
	}
	@Test public void test_7555() {
		checkNotSubtype("X<X|(Y<Y|(Z<X|Z>)>)>","X<X|[[X]]>");
	}
	@Test public void test_7556() {
		checkNotSubtype("X<X|(Y<Y|(Z<X|Z>)>)>","X<[X]>|(Y<X<[X]>|Y>)");
	}
	@Test public void test_7557() {
		checkNotSubtype("X<X|(Y<Y|(Z<X|Z>)>)>","X<X|[Y<X|Y>]>");
	}
	@Test public void test_7558() {
		checkIsSubtype("X<X|(Y<Y|(Z<X|Z>)>)>","(X<X|void>)|void");
	}
	@Test public void test_7559() {
		checkIsSubtype("X<X|(Y<Y|(Z<X|Z>)>)>","X<X|(Y<Y|void>)>");
	}
	@Test public void test_7560() {
		checkNotSubtype("X<X|(Y<Y|(Z<X|Z>)>)>","(X<X|any>)|any");
	}
	@Test public void test_7561() {
		checkNotSubtype("X<X|(Y<Y|(Z<X|Z>)>)>","X<X|(Y<Y|any>)>");
	}
	@Test public void test_7562() {
		checkNotSubtype("X<X|(Y<Y|(Z<X|Z>)>)>","(X<X|null>)|null");
	}
	@Test public void test_7563() {
		checkNotSubtype("X<X|(Y<Y|(Z<X|Z>)>)>","X<X|(Y<Y|null>)>");
	}
	@Test public void test_7564() {
		checkNotSubtype("X<X|(Y<Y|(Z<X|Z>)>)>","(X<X|int>)|int");
	}
	@Test public void test_7565() {
		checkNotSubtype("X<X|(Y<Y|(Z<X|Z>)>)>","X<X|(Y<Y|int>)>");
	}
	@Test public void test_7566() {
		checkNotSubtype("X<X|(Y<Y|(Z<X|Z>)>)>","(X<X|Y<[Y]>>)|Y<[Y]>");
	}
	@Test public void test_7567() {
		checkNotSubtype("X<X|(Y<Y|(Z<X|Z>)>)>","X<X|(Y<Y|Z<[Z]>>)>");
	}
	@Test public void test_7568() {
		checkNotSubtype("X<X|(Y<Y|(Z<X|Z>)>)>","X<X|(Y<Y|[X]>)>");
	}
	@Test public void test_7569() {
		checkIsSubtype("X<X|(Y<Y|(Z<X|Z>)>)>","X<X|(Y<Y|(Z<X|Z>)>)>");
	}

	private void checkIsSubtype(String from, String to) {
		Type ft = Type.fromString(from);
		Type tt = Type.fromString(to);
		assertTrue(Type.isSubtype(ft,tt));
	}
	private void checkNotSubtype(String from, String to) {
		Type ft = Type.fromString(from);
		Type tt = Type.fromString(to);
		assertFalse(Type.isSubtype(ft,tt));
	}
}
