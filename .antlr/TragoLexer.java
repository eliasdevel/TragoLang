// Generated from c:\Users\Elias\Documents\tragoLang\Trago.g by ANTLR 4.8

    // import packages here.
    import java.util.HashMap;
    import java.util.ArrayList;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TragoLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, FLOAT=13, INT=14, CHAR=15, MAIN=16, VOID=17, 
		IF=18, ELSE=19, FOR=20, PRINTF=21, RelationOP=22, Identifier=23, Integer_constant=24, 
		Floating_point_constant=25, STRING_LITERAL=26, WS=27, COMMENT=28;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "FLOAT", "INT", "CHAR", "MAIN", "VOID", "IF", 
			"ELSE", "FOR", "PRINTF", "RelationOP", "Identifier", "Integer_constant", 
			"Floating_point_constant", "STRING_LITERAL", "WS", "COMMENT", "EscapeSequence"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "';'", "','", "'='", "'+'", "'-'", 
			"'*'", "'/'", "'&'", "'float'", "'int'", "'char'", "'main'", "'void'", 
			"'if'", "'else'", "'for'", "'printf'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "FLOAT", "INT", "CHAR", "MAIN", "VOID", "IF", "ELSE", "FOR", "PRINTF", 
			"RelationOP", "Identifier", "Integer_constant", "Floating_point_constant", 
			"STRING_LITERAL", "WS", "COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	    public static void prn(String str){
	        System.out.println(str);
	    }

	    public static void main(String[] args) throws Exception
	    {
	        ANTLRInputStream input = new ANTLRInputStream(System.in);
	        TragoLexer lexer = new TragoLexer(input);
	        CommonTokenStream tokens = new CommonTokenStream(lexer);
	        TragoParser parser = new TragoParser(tokens);

	        //symbol_table = new ArrayList<String>();        
	        parser.program();
	        //System.out.println("symbols: " + symbol_table);
	    }

	    boolean TRACEON = false;

	    // ============================================
	    // Create a symbol table.
		// ArrayList is easy to extend to add more info. into symbol table.
		//
		// The structure of symbol table:
		// <variable ID, type, memory location>
		//    - type: the variable type   (please check "enum Type")
		//    - memory location: the location (locals in VM) the variable will be stored at.
	    // ============================================
	    HashMap<String, ArrayList> symtab = new HashMap<String, ArrayList>();

	    int labelCount = 0;
		
		
		// storageIndex is used to represent/index the location (locals) in VM.
		// The first index is 0.
		int storageIndex = 0;

	    // Record all assembly instructions.
	    List<String> TextCode = new ArrayList<String>();

	    // Type information.
	    public enum Type{
	       INT, FLOAT, CHAR;
	    }


	    /*
	     * Output prologue.
	     */
	    void prologue()
	    {
	       prn(";.source myCompiler.j");
	       prn(".class public static myResult");
	       prn(".super java/lang/Object");
	       prn(".method public static main([Ljava/lang/String;)V");
	       /* The size of stack and locals should be properly set. */
	       prn(".limit stack 100");
	       prn(".limit locals 100");
	    }
	    
		
	    /*
	     * Output epilogue.
	     */
	    void epilogue()
	    {
	       /* handle epilogue */
	       prn("return");
	       prn(".end method");
	    }
	    
	    
	    /* Generate a new label */
	    String newLabel()
	    {
	       labelCount ++;
	       return (new String("L")) + Integer.toString(labelCount);
	    } 
	    
	    
	    public List<String> getTextCode()
	    {
	       return TextCode;
	    }			


	public TragoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Trago.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 26:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		case 27:
			COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:


			    
			break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:


			    
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\36\u00c5\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3"+
		"\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\5\27\u008c\n\27\3\30\3\30\7\30\u0090\n\30\f\30\16\30\u0093\13\30"+
		"\3\31\6\31\u0096\n\31\r\31\16\31\u0097\3\32\6\32\u009b\n\32\r\32\16\32"+
		"\u009c\3\32\3\32\6\32\u00a1\n\32\r\32\16\32\u00a2\3\33\3\33\3\33\7\33"+
		"\u00a8\n\33\f\33\16\33\u00ab\13\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\7\35\u00b6\n\35\f\35\16\35\u00b9\13\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\5\36\u00c4\n\36\2\2\37\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\2\3\2\b\5\2C\\aac|\6\2\62"+
		";C\\aac|\4\2$$^^\5\2\13\f\17\17\"\"\7\2ddhhppttvv\4\2))^^\2\u00d1\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\3=\3\2\2"+
		"\2\5?\3\2\2\2\7A\3\2\2\2\tC\3\2\2\2\13E\3\2\2\2\rG\3\2\2\2\17I\3\2\2\2"+
		"\21K\3\2\2\2\23M\3\2\2\2\25O\3\2\2\2\27Q\3\2\2\2\31S\3\2\2\2\33U\3\2\2"+
		"\2\35[\3\2\2\2\37_\3\2\2\2!d\3\2\2\2#i\3\2\2\2%n\3\2\2\2\'q\3\2\2\2)v"+
		"\3\2\2\2+z\3\2\2\2-\u008b\3\2\2\2/\u008d\3\2\2\2\61\u0095\3\2\2\2\63\u009a"+
		"\3\2\2\2\65\u00a4\3\2\2\2\67\u00ae\3\2\2\29\u00b1\3\2\2\2;\u00bf\3\2\2"+
		"\2=>\7*\2\2>\4\3\2\2\2?@\7+\2\2@\6\3\2\2\2AB\7}\2\2B\b\3\2\2\2CD\7\177"+
		"\2\2D\n\3\2\2\2EF\7=\2\2F\f\3\2\2\2GH\7.\2\2H\16\3\2\2\2IJ\7?\2\2J\20"+
		"\3\2\2\2KL\7-\2\2L\22\3\2\2\2MN\7/\2\2N\24\3\2\2\2OP\7,\2\2P\26\3\2\2"+
		"\2QR\7\61\2\2R\30\3\2\2\2ST\7(\2\2T\32\3\2\2\2UV\7h\2\2VW\7n\2\2WX\7q"+
		"\2\2XY\7c\2\2YZ\7v\2\2Z\34\3\2\2\2[\\\7k\2\2\\]\7p\2\2]^\7v\2\2^\36\3"+
		"\2\2\2_`\7e\2\2`a\7j\2\2ab\7c\2\2bc\7t\2\2c \3\2\2\2de\7o\2\2ef\7c\2\2"+
		"fg\7k\2\2gh\7p\2\2h\"\3\2\2\2ij\7x\2\2jk\7q\2\2kl\7k\2\2lm\7f\2\2m$\3"+
		"\2\2\2no\7k\2\2op\7h\2\2p&\3\2\2\2qr\7g\2\2rs\7n\2\2st\7u\2\2tu\7g\2\2"+
		"u(\3\2\2\2vw\7h\2\2wx\7q\2\2xy\7t\2\2y*\3\2\2\2z{\7r\2\2{|\7t\2\2|}\7"+
		"k\2\2}~\7p\2\2~\177\7v\2\2\177\u0080\7h\2\2\u0080,\3\2\2\2\u0081\u008c"+
		"\7@\2\2\u0082\u0083\7@\2\2\u0083\u008c\7?\2\2\u0084\u008c\7>\2\2\u0085"+
		"\u0086\7>\2\2\u0086\u008c\7?\2\2\u0087\u0088\7?\2\2\u0088\u008c\7?\2\2"+
		"\u0089\u008a\7#\2\2\u008a\u008c\7?\2\2\u008b\u0081\3\2\2\2\u008b\u0082"+
		"\3\2\2\2\u008b\u0084\3\2\2\2\u008b\u0085\3\2\2\2\u008b\u0087\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008c.\3\2\2\2\u008d\u0091\t\2\2\2\u008e\u0090\t\3\2\2"+
		"\u008f\u008e\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092"+
		"\3\2\2\2\u0092\60\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0096\4\62;\2\u0095"+
		"\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2"+
		"\2\2\u0098\62\3\2\2\2\u0099\u009b\4\62;\2\u009a\u0099\3\2\2\2\u009b\u009c"+
		"\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\u00a0\7\60\2\2\u009f\u00a1\4\62;\2\u00a0\u009f\3\2\2\2\u00a1\u00a2\3"+
		"\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\64\3\2\2\2\u00a4"+
		"\u00a9\7$\2\2\u00a5\u00a8\5;\36\2\u00a6\u00a8\n\4\2\2\u00a7\u00a5\3\2"+
		"\2\2\u00a7\u00a6\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9"+
		"\u00aa\3\2\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ad\7$"+
		"\2\2\u00ad\66\3\2\2\2\u00ae\u00af\t\5\2\2\u00af\u00b0\b\34\2\2\u00b08"+
		"\3\2\2\2\u00b1\u00b2\7\61\2\2\u00b2\u00b3\7,\2\2\u00b3\u00b7\3\2\2\2\u00b4"+
		"\u00b6\13\2\2\2\u00b5\u00b4\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3"+
		"\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba"+
		"\u00bb\7,\2\2\u00bb\u00bc\7\61\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\b\35"+
		"\3\2\u00be:\3\2\2\2\u00bf\u00c3\7^\2\2\u00c0\u00c4\t\6\2\2\u00c1\u00c4"+
		"\3\2\2\2\u00c2\u00c4\t\7\2\2\u00c3\u00c0\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3"+
		"\u00c2\3\2\2\2\u00c4<\3\2\2\2\f\2\u008b\u0091\u0097\u009c\u00a2\u00a7"+
		"\u00a9\u00b7\u00c3\4\3\34\2\3\35\3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}