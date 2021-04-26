// Generated from Trago.g by ANTLR 4.9.2

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
public class TragoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PLUS=1, MINUS=2, TIMES=3, OVER=4, REMAINDER=5, OPEN_C=6, CLOSE_C=7, OPEN_P=8, 
		CLOSE_P=9, ATTRIB=10, FUNC=11, MAIN=12, PRINT=13, VAR=14, NUM=15, NL=16, 
		SPACE=17;
	public static final int
		RULE_program = 0, RULE_main = 1, RULE_statement = 2, RULE_expression = 3, 
		RULE_term = 4, RULE_factor = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "main", "statement", "expression", "term", "factor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'/'", "'%'", "'{'", "'}'", "'('", "')'", 
			"'='", "'func'", "'main'", "'print'"
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

	@Override
	public String getGrammarFileName() { return "Trago.g"; }

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
	        TragoLexer lexer = new TragoLexer(input);
	        CommonTokenStream tokens = new CommonTokenStream(lexer);
	        TragoParser parser = new TragoParser(tokens);

	        //symbol_table = new ArrayList<String>();        
	        parser.program();
	        //System.out.println("symbols: " + symbol_table);
	    }

	public TragoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TragoListener ) ((TragoListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TragoListener ) ((TragoListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			main();
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

	public static class MainContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(TragoParser.FUNC, 0); }
		public TerminalNode MAIN() { return getToken(TragoParser.MAIN, 0); }
		public TerminalNode OPEN_P() { return getToken(TragoParser.OPEN_P, 0); }
		public TerminalNode CLOSE_P() { return getToken(TragoParser.CLOSE_P, 0); }
		public TerminalNode OPEN_C() { return getToken(TragoParser.OPEN_C, 0); }
		public TerminalNode CLOSE_C() { return getToken(TragoParser.CLOSE_C, 0); }
		public TerminalNode NL() { return getToken(TragoParser.NL, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TragoListener ) ((TragoListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TragoListener ) ((TragoListener)listener).exitMain(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			match(FUNC);
			setState(15);
			match(MAIN);
			setState(16);
			match(OPEN_P);
			setState(17);
			match(CLOSE_P);
			setState(18);
			match(OPEN_C);

			                System.out.println(".source Test.j");
			                System.out.println(".class  public Test");
			                System.out.println(".super  java/lang/Object\n");
			                System.out.println(".method public <init>()V");
			                System.out.println("    aload_0");
			                System.out.println("    invokenonvirtual java/lang/Object/<init>()V");
			                System.out.println("    return");
			                System.out.println(".end method\n");
			                System.out.println(".method public static main([Ljava/lang/String;)V\n");
			            
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PRINT || _la==NL) {
				{
				{
				setState(20);
				statement();
				}
				}
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(26);
			match(CLOSE_C);
			setState(27);
			match(NL);

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

	public static class StatementContext extends ParserRuleContext {
		public TerminalNode NL() { return getToken(TragoParser.NL, 0); }
		public TerminalNode PRINT() { return getToken(TragoParser.PRINT, 0); }
		public TerminalNode OPEN_P() { return getToken(TragoParser.OPEN_P, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_P() { return getToken(TragoParser.CLOSE_P, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TragoListener ) ((TragoListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TragoListener ) ((TragoListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(39);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NL:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				match(NL);
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				match(PRINT);
				setState(32);
				match(OPEN_P);
				   System.out.println("    getstatic java/lang/System/out Ljava/io/PrintStream;");
				setState(34);
				expression();
				setState(35);
				match(CLOSE_P);
				setState(36);
				match(NL);
				   System.out.println("    invokevirtual java/io/PrintStream/println(I)V\n");  
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

	public static class ExpressionContext extends ParserRuleContext {
		public Token op;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(TragoParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(TragoParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(TragoParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(TragoParser.MINUS, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TragoListener ) ((TragoListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TragoListener ) ((TragoListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			term();
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(42);
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
				setState(43);
				term();
				 System.out.println(((((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getType():0) == PLUS) ? "    iadd" : "    isub"); 
				}
				}
				setState(50);
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
		public List<TerminalNode> TIMES() { return getTokens(TragoParser.TIMES); }
		public TerminalNode TIMES(int i) {
			return getToken(TragoParser.TIMES, i);
		}
		public List<TerminalNode> OVER() { return getTokens(TragoParser.OVER); }
		public TerminalNode OVER(int i) {
			return getToken(TragoParser.OVER, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TragoListener ) ((TragoListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TragoListener ) ((TragoListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			factor();
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TIMES || _la==OVER) {
				{
				{
				setState(52);
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
				setState(53);
				factor();
				 System.out.println(((((TermContext)_localctx).op!=null?((TermContext)_localctx).op.getType():0) == TIMES) ? "    imul" : "    idiv"); 
				}
				}
				setState(60);
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
		public TerminalNode NUM() { return getToken(TragoParser.NUM, 0); }
		public TerminalNode OPEN_P() { return getToken(TragoParser.OPEN_P, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_P() { return getToken(TragoParser.CLOSE_P, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TragoListener ) ((TragoListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TragoListener ) ((TragoListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_factor);
		try {
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				((FactorContext)_localctx).NUM = match(NUM);
				 System.out.println("    ldc " + (((FactorContext)_localctx).NUM!=null?((FactorContext)_localctx).NUM.getText():null)); 
				}
				break;
			case OPEN_P:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				match(OPEN_P);
				setState(64);
				expression();
				setState(65);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\23H\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\7\3\30\n\3\f\3\16\3\33\13\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\5\4*\n\4\3\5\3\5\3\5\3\5\3\5\7\5\61\n\5\f\5\16\5\64\13\5\3"+
		"\6\3\6\3\6\3\6\3\6\7\6;\n\6\f\6\16\6>\13\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7"+
		"F\n\7\3\7\2\2\b\2\4\6\b\n\f\2\4\3\2\3\4\3\2\5\6\2F\2\16\3\2\2\2\4\20\3"+
		"\2\2\2\6)\3\2\2\2\b+\3\2\2\2\n\65\3\2\2\2\fE\3\2\2\2\16\17\5\4\3\2\17"+
		"\3\3\2\2\2\20\21\7\r\2\2\21\22\7\16\2\2\22\23\7\n\2\2\23\24\7\13\2\2\24"+
		"\25\7\b\2\2\25\31\b\3\1\2\26\30\5\6\4\2\27\26\3\2\2\2\30\33\3\2\2\2\31"+
		"\27\3\2\2\2\31\32\3\2\2\2\32\34\3\2\2\2\33\31\3\2\2\2\34\35\7\t\2\2\35"+
		"\36\7\22\2\2\36\37\b\3\1\2\37\5\3\2\2\2 *\7\22\2\2!\"\7\17\2\2\"#\7\n"+
		"\2\2#$\b\4\1\2$%\5\b\5\2%&\7\13\2\2&\'\7\22\2\2\'(\b\4\1\2(*\3\2\2\2)"+
		" \3\2\2\2)!\3\2\2\2*\7\3\2\2\2+\62\5\n\6\2,-\t\2\2\2-.\5\n\6\2./\b\5\1"+
		"\2/\61\3\2\2\2\60,\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63"+
		"\t\3\2\2\2\64\62\3\2\2\2\65<\5\f\7\2\66\67\t\3\2\2\678\5\f\7\289\b\6\1"+
		"\29;\3\2\2\2:\66\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=\13\3\2\2\2><\3"+
		"\2\2\2?@\7\21\2\2@F\b\7\1\2AB\7\n\2\2BC\5\b\5\2CD\7\13\2\2DF\3\2\2\2E"+
		"?\3\2\2\2EA\3\2\2\2F\r\3\2\2\2\7\31)\62<E";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}