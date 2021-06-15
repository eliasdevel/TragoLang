// Generated from c:\Users\Elias\Documents\tragoLang\Trago_old.g by ANTLR 4.8

    //import java.util.ArrayList;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Trago_oldLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PLUS=1, MINUS=2, TIMES=3, OVER=4, REMAINDER=5, OPEN_C=6, CLOSE_C=7, OPEN_P=8, 
		CLOSE_P=9, ATTRIB=10, FUNC=11, MAIN=12, PRINT=13, VAR=14, NUM=15, NL=16, 
		SPACE=17, IF=18, ELSE=19, FOR=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PLUS", "MINUS", "TIMES", "OVER", "REMAINDER", "OPEN_C", "CLOSE_C", "OPEN_P", 
			"CLOSE_P", "ATTRIB", "FUNC", "MAIN", "PRINT", "VAR", "NUM", "NL", "SPACE", 
			"IF", "ELSE", "FOR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'/'", "'%'", "'{'", "'}'", "'('", "')'", 
			"'='", "'vai'", "'boteco'", "'mijo'", null, null, null, null, "'if'", 
			"'else'", "'for'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PLUS", "MINUS", "TIMES", "OVER", "REMAINDER", "OPEN_C", "CLOSE_C", 
			"OPEN_P", "CLOSE_P", "ATTRIB", "FUNC", "MAIN", "PRINT", "VAR", "NUM", 
			"NL", "SPACE", "IF", "ELSE", "FOR"
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


	    //private static ArrayList<String> symbol_table;

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


	public Trago_oldLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Trago_old.g"; }

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
		case 16:
			SPACE_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void SPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 skip(); 
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26q\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\6\17Q\n\17\r\17\16\17R"+
		"\3\20\6\20V\n\20\r\20\16\20W\3\21\5\21[\n\21\3\21\3\21\3\22\6\22`\n\22"+
		"\r\22\16\22a\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3"+
		"\25\3\25\3\25\2\2\26\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26\3\2\3\4\2\13\13\"\"\2"+
		"t\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3+\3\2\2\2\5-\3\2\2\2\7/\3\2\2"+
		"\2\t\61\3\2\2\2\13\63\3\2\2\2\r\65\3\2\2\2\17\67\3\2\2\2\219\3\2\2\2\23"+
		";\3\2\2\2\25=\3\2\2\2\27?\3\2\2\2\31C\3\2\2\2\33J\3\2\2\2\35P\3\2\2\2"+
		"\37U\3\2\2\2!Z\3\2\2\2#_\3\2\2\2%e\3\2\2\2\'h\3\2\2\2)m\3\2\2\2+,\7-\2"+
		"\2,\4\3\2\2\2-.\7/\2\2.\6\3\2\2\2/\60\7,\2\2\60\b\3\2\2\2\61\62\7\61\2"+
		"\2\62\n\3\2\2\2\63\64\7\'\2\2\64\f\3\2\2\2\65\66\7}\2\2\66\16\3\2\2\2"+
		"\678\7\177\2\28\20\3\2\2\29:\7*\2\2:\22\3\2\2\2;<\7+\2\2<\24\3\2\2\2="+
		">\7?\2\2>\26\3\2\2\2?@\7x\2\2@A\7c\2\2AB\7k\2\2B\30\3\2\2\2CD\7d\2\2D"+
		"E\7q\2\2EF\7v\2\2FG\7g\2\2GH\7e\2\2HI\7q\2\2I\32\3\2\2\2JK\7o\2\2KL\7"+
		"k\2\2LM\7l\2\2MN\7q\2\2N\34\3\2\2\2OQ\4c|\2PO\3\2\2\2QR\3\2\2\2RP\3\2"+
		"\2\2RS\3\2\2\2S\36\3\2\2\2TV\4\62;\2UT\3\2\2\2VW\3\2\2\2WU\3\2\2\2WX\3"+
		"\2\2\2X \3\2\2\2Y[\7\17\2\2ZY\3\2\2\2Z[\3\2\2\2[\\\3\2\2\2\\]\7\f\2\2"+
		"]\"\3\2\2\2^`\t\2\2\2_^\3\2\2\2`a\3\2\2\2a_\3\2\2\2ab\3\2\2\2bc\3\2\2"+
		"\2cd\b\22\2\2d$\3\2\2\2ef\7k\2\2fg\7h\2\2g&\3\2\2\2hi\7g\2\2ij\7n\2\2"+
		"jk\7u\2\2kl\7g\2\2l(\3\2\2\2mn\7h\2\2no\7q\2\2op\7t\2\2p*\3\2\2\2\7\2"+
		"RWZa\3\3\22\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}