// Generated from c:\Users\Elias\Documents\tragoLang\Trago.g by ANTLR 4.8

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
public class TragoLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PLUS=1, MINUS=2, TIMES=3, OVER=4, REMAINDER=5, OPEN_C=6, CLOSE_C=7, OPEN_P=8, 
		CLOSE_P=9, ATTRIB=10, FUNC=11, MAIN=12, PRINT=13, VAR=14, NUM=15, NL=16, 
		SPACE=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PLUS", "MINUS", "TIMES", "OVER", "REMAINDER", "OPEN_C", "CLOSE_C", "OPEN_P", 
			"CLOSE_P", "ATTRIB", "FUNC", "MAIN", "PRINT", "VAR", "NUM", "NL", "SPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'/'", "'%'", "'{'", "'}'", "'('", "')'", 
			"'='", "'vai'", "'boteco'", "'mijo'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PLUS", "MINUS", "TIMES", "OVER", "REMAINDER", "OPEN_C", "CLOSE_C", 
			"OPEN_P", "CLOSE_P", "ATTRIB", "FUNC", "MAIN", "PRINT", "VAR", "NUM", 
			"NL", "SPACE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23_\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3"+
		"\n\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\6\17K\n\17\r\17\16\17L\3\20\6\20P\n\20\r\20\16\20Q\3\21"+
		"\5\21U\n\21\3\21\3\21\3\22\6\22Z\n\22\r\22\16\22[\3\22\3\22\2\2\23\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23\3\2\3\4\2\13\13\"\"\2b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\3%\3\2\2\2\5\'\3\2\2\2\7)\3\2\2\2"+
		"\t+\3\2\2\2\13-\3\2\2\2\r/\3\2\2\2\17\61\3\2\2\2\21\63\3\2\2\2\23\65\3"+
		"\2\2\2\25\67\3\2\2\2\279\3\2\2\2\31=\3\2\2\2\33D\3\2\2\2\35J\3\2\2\2\37"+
		"O\3\2\2\2!T\3\2\2\2#Y\3\2\2\2%&\7-\2\2&\4\3\2\2\2\'(\7/\2\2(\6\3\2\2\2"+
		")*\7,\2\2*\b\3\2\2\2+,\7\61\2\2,\n\3\2\2\2-.\7\'\2\2.\f\3\2\2\2/\60\7"+
		"}\2\2\60\16\3\2\2\2\61\62\7\177\2\2\62\20\3\2\2\2\63\64\7*\2\2\64\22\3"+
		"\2\2\2\65\66\7+\2\2\66\24\3\2\2\2\678\7?\2\28\26\3\2\2\29:\7x\2\2:;\7"+
		"c\2\2;<\7k\2\2<\30\3\2\2\2=>\7d\2\2>?\7q\2\2?@\7v\2\2@A\7g\2\2AB\7e\2"+
		"\2BC\7q\2\2C\32\3\2\2\2DE\7o\2\2EF\7k\2\2FG\7l\2\2GH\7q\2\2H\34\3\2\2"+
		"\2IK\4c|\2JI\3\2\2\2KL\3\2\2\2LJ\3\2\2\2LM\3\2\2\2M\36\3\2\2\2NP\4\62"+
		";\2ON\3\2\2\2PQ\3\2\2\2QO\3\2\2\2QR\3\2\2\2R \3\2\2\2SU\7\17\2\2TS\3\2"+
		"\2\2TU\3\2\2\2UV\3\2\2\2VW\7\f\2\2W\"\3\2\2\2XZ\t\2\2\2YX\3\2\2\2Z[\3"+
		"\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\]\3\2\2\2]^\b\22\2\2^$\3\2\2\2\7\2LQT[\3"+
		"\3\22\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}