// Generated from c:\Users\Elias\Documents\tragoLang\Exp.g by ANTLR 4.8

    //import java.util.ArrayList;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExpParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PLUS=1, MINUS=2, TIMES=3, OVER=4, OPEN_P=5, CLOSE_P=6, NUM=7, SPACE=8;
	public static final int
		RULE_program = 0, RULE_expression = 1, RULE_term = 2, RULE_factor = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "expression", "term", "factor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'/'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PLUS", "MINUS", "TIMES", "OVER", "OPEN_P", "CLOSE_P", "NUM", "SPACE"
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

	@Override
	public String getGrammarFileName() { return "Exp.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    //private static ArrayList<String> symbol_table;

	    public static void main(String[] args) throws Exception
	    {
	        ANTLRInputStream input = new ANTLRInputStream(System.in);
	        ExpLexer lexer = new ExpLexer(input);
	        CommonTokenStream tokens = new CommonTokenStream(lexer);
	        ExpParser parser = new ExpParser(tokens);

	        //symbol_table = new ArrayList<String>();        
	        parser.program();
	        //System.out.println("symbols: " + symbol_table);
	    }

	public ExpParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{

			                System.out.println(".source Test.j");
			                System.out.println(".class  public Test");
			                System.out.println(".super  java/lang/Object\n");
			                System.out.println(".method public <init>()V");
			                System.out.println("    aload_0");
			                System.out.println("    invokenonvirtual java/lang/Object/<init>()V");
			                System.out.println("    return");
			                System.out.println(".end method\n");
			                System.out.println(".method public static main([Ljava/lang/String;)V\n");
			                System.out.println("    getstatic java/lang/System/out Ljava/io/PrintStream;");
			            
			setState(9);
			expression();

			                System.out.println("    invokevirtual java/io/PrintStream/println(I)V\n");
			                System.out.println("    return");
			                System.out.println(".limit stack 10");
			                System.out.println(".end method");
			            
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Token op;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(ExpParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(ExpParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(ExpParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(ExpParser.MINUS, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			term();
			setState(19);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(13);
				((ExpressionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(14);
				term();
				 System.out.println(((((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getType():0) == PLUS) ? "    iadd" : "    isub"); 
				}
				}
				setState(21);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public Token op;
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> TIMES() { return getTokens(ExpParser.TIMES); }
		public TerminalNode TIMES(int i) {
			return getToken(ExpParser.TIMES, i);
		}
		public List<TerminalNode> OVER() { return getTokens(ExpParser.OVER); }
		public TerminalNode OVER(int i) {
			return getToken(ExpParser.OVER, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			factor();
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TIMES || _la==OVER) {
				{
				{
				setState(23);
				((TermContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==TIMES || _la==OVER) ) {
					((TermContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(24);
				factor();
				 System.out.println(((((TermContext)_localctx).op!=null?((TermContext)_localctx).op.getType():0) == TIMES) ? "    imul" : "    idiv"); 
				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public Token NUM;
		public TerminalNode NUM() { return getToken(ExpParser.NUM, 0); }
		public TerminalNode OPEN_P() { return getToken(ExpParser.OPEN_P, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_P() { return getToken(ExpParser.CLOSE_P, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_factor);
		try {
			setState(38);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				((FactorContext)_localctx).NUM = match(NUM);
				 System.out.println("    ldc " + (((FactorContext)_localctx).NUM!=null?((FactorContext)_localctx).NUM.getText():null)); 
				}
				break;
			case OPEN_P:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				match(OPEN_P);
				setState(35);
				expression();
				setState(36);
				match(CLOSE_P);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\n+\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\7\3\24\n\3\f\3"+
		"\16\3\27\13\3\3\4\3\4\3\4\3\4\3\4\7\4\36\n\4\f\4\16\4!\13\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\5\5)\n\5\3\5\2\2\6\2\4\6\b\2\4\3\2\3\4\3\2\5\6\2)\2\n\3"+
		"\2\2\2\4\16\3\2\2\2\6\30\3\2\2\2\b(\3\2\2\2\n\13\b\2\1\2\13\f\5\4\3\2"+
		"\f\r\b\2\1\2\r\3\3\2\2\2\16\25\5\6\4\2\17\20\t\2\2\2\20\21\5\6\4\2\21"+
		"\22\b\3\1\2\22\24\3\2\2\2\23\17\3\2\2\2\24\27\3\2\2\2\25\23\3\2\2\2\25"+
		"\26\3\2\2\2\26\5\3\2\2\2\27\25\3\2\2\2\30\37\5\b\5\2\31\32\t\3\2\2\32"+
		"\33\5\b\5\2\33\34\b\4\1\2\34\36\3\2\2\2\35\31\3\2\2\2\36!\3\2\2\2\37\35"+
		"\3\2\2\2\37 \3\2\2\2 \7\3\2\2\2!\37\3\2\2\2\"#\7\t\2\2#)\b\5\1\2$%\7\7"+
		"\2\2%&\5\4\3\2&\'\7\b\2\2\')\3\2\2\2(\"\3\2\2\2($\3\2\2\2)\t\3\2\2\2\5"+
		"\25\37(";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}