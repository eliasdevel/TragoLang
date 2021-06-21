// $ANTLR 3.5.2 Trago.g 2021-06-21 16:33:58

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class TragoLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int T__31=31;
	public static final int T__32=32;
	public static final int T__33=33;
	public static final int CHAR=4;
	public static final int COMMENT=5;
	public static final int ELSE=6;
	public static final int EscapeSequence=7;
	public static final int FLOAT=8;
	public static final int FOR=9;
	public static final int Floating_point_constant=10;
	public static final int IF=11;
	public static final int INT=12;
	public static final int Identifier=13;
	public static final int Integer_constant=14;
	public static final int MAIN=15;
	public static final int PRINTF=16;
	public static final int RelationOP=17;
	public static final int STRING_LITERAL=18;
	public static final int VOID=19;
	public static final int WHILE=20;
	public static final int WS=21;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public TragoLexer() {} 
	public TragoLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public TragoLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "Trago.g"; }

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Trago.g:2:7: ( '&' )
			// Trago.g:2:9: '&'
			{
			match('&'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Trago.g:3:7: ( '(' )
			// Trago.g:3:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Trago.g:4:7: ( ')' )
			// Trago.g:4:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__24"

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Trago.g:5:7: ( '*' )
			// Trago.g:5:9: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Trago.g:6:7: ( '+' )
			// Trago.g:6:9: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__26"

	// $ANTLR start "T__27"
	public final void mT__27() throws RecognitionException {
		try {
			int _type = T__27;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Trago.g:7:7: ( ',' )
			// Trago.g:7:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__27"

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Trago.g:8:7: ( '-' )
			// Trago.g:8:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__28"

	// $ANTLR start "T__29"
	public final void mT__29() throws RecognitionException {
		try {
			int _type = T__29;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Trago.g:9:7: ( '/' )
			// Trago.g:9:9: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__29"

	// $ANTLR start "T__30"
	public final void mT__30() throws RecognitionException {
		try {
			int _type = T__30;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Trago.g:10:7: ( ';' )
			// Trago.g:10:9: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__30"

	// $ANTLR start "T__31"
	public final void mT__31() throws RecognitionException {
		try {
			int _type = T__31;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Trago.g:11:7: ( '=' )
			// Trago.g:11:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__31"

	// $ANTLR start "T__32"
	public final void mT__32() throws RecognitionException {
		try {
			int _type = T__32;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Trago.g:12:7: ( '{' )
			// Trago.g:12:9: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__32"

	// $ANTLR start "T__33"
	public final void mT__33() throws RecognitionException {
		try {
			int _type = T__33;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Trago.g:13:7: ( '}' )
			// Trago.g:13:9: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__33"

	// $ANTLR start "FLOAT"
	public final void mFLOAT() throws RecognitionException {
		try {
			int _type = FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Trago.g:513:6: ( 'caipira' )
			// Trago.g:513:7: 'caipira'
			{
			match("caipira"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Trago.g:514:4: ( 'ceva' )
			// Trago.g:514:5: 'ceva'
			{
			match("ceva"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "CHAR"
	public final void mCHAR() throws RecognitionException {
		try {
			int _type = CHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Trago.g:515:5: ( 'martelihno' )
			// Trago.g:515:7: 'martelihno'
			{
			match("martelihno"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR"

	// $ANTLR start "MAIN"
	public final void mMAIN() throws RecognitionException {
		try {
			int _type = MAIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Trago.g:516:5: ( 'boteco' )
			// Trago.g:516:7: 'boteco'
			{
			match("boteco"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MAIN"

	// $ANTLR start "VOID"
	public final void mVOID() throws RecognitionException {
		try {
			int _type = VOID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Trago.g:517:5: ( 'agua' )
			// Trago.g:517:7: 'agua'
			{
			match("agua"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VOID"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Trago.g:518:3: ( 'beber?' )
			// Trago.g:518:5: 'beber?'
			{
			match("beber?"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF"

	// $ANTLR start "ELSE"
	public final void mELSE() throws RecognitionException {
		try {
			int _type = ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Trago.g:519:5: ( 'nao' )
			// Trago.g:519:7: 'nao'
			{
			match("nao"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSE"

	// $ANTLR start "FOR"
	public final void mFOR() throws RecognitionException {
		try {
			int _type = FOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Trago.g:520:4: ( 'for' )
			// Trago.g:520:6: 'for'
			{
			match("for"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FOR"

	// $ANTLR start "WHILE"
	public final void mWHILE() throws RecognitionException {
		try {
			int _type = WHILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Trago.g:521:6: ( 'bebendo' )
			// Trago.g:521:8: 'bebendo'
			{
			match("bebendo"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHILE"

	// $ANTLR start "PRINTF"
	public final void mPRINTF() throws RecognitionException {
		try {
			int _type = PRINTF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Trago.g:522:7: ( 'mijo' )
			// Trago.g:522:8: 'mijo'
			{
			match("mijo"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PRINTF"

	// $ANTLR start "RelationOP"
	public final void mRelationOP() throws RecognitionException {
		try {
			int _type = RelationOP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Trago.g:523:11: ( '>' | '>=' | '<' | '<=' | '==' | '!=' )
			int alt1=6;
			switch ( input.LA(1) ) {
			case '>':
				{
				int LA1_1 = input.LA(2);
				if ( (LA1_1=='=') ) {
					alt1=2;
				}

				else {
					alt1=1;
				}

				}
				break;
			case '<':
				{
				int LA1_2 = input.LA(2);
				if ( (LA1_2=='=') ) {
					alt1=4;
				}

				else {
					alt1=3;
				}

				}
				break;
			case '=':
				{
				alt1=5;
				}
				break;
			case '!':
				{
				alt1=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// Trago.g:523:13: '>'
					{
					match('>'); 
					}
					break;
				case 2 :
					// Trago.g:523:18: '>='
					{
					match(">="); 

					}
					break;
				case 3 :
					// Trago.g:523:25: '<'
					{
					match('<'); 
					}
					break;
				case 4 :
					// Trago.g:523:31: '<='
					{
					match("<="); 

					}
					break;
				case 5 :
					// Trago.g:523:38: '=='
					{
					match("=="); 

					}
					break;
				case 6 :
					// Trago.g:523:45: '!='
					{
					match("!="); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RelationOP"

	// $ANTLR start "Identifier"
	public final void mIdentifier() throws RecognitionException {
		try {
			int _type = Identifier;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Trago.g:524:11: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// Trago.g:524:12: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// Trago.g:524:36: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// Trago.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop2;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Identifier"

	// $ANTLR start "Integer_constant"
	public final void mInteger_constant() throws RecognitionException {
		try {
			int _type = Integer_constant;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Trago.g:525:17: ( ( '0' .. '9' )+ )
			// Trago.g:525:18: ( '0' .. '9' )+
			{
			// Trago.g:525:18: ( '0' .. '9' )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// Trago.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Integer_constant"

	// $ANTLR start "Floating_point_constant"
	public final void mFloating_point_constant() throws RecognitionException {
		try {
			int _type = Floating_point_constant;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Trago.g:526:24: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ )
			// Trago.g:526:25: ( '0' .. '9' )+ '.' ( '0' .. '9' )+
			{
			// Trago.g:526:25: ( '0' .. '9' )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// Trago.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
			}

			match('.'); 
			// Trago.g:526:39: ( '0' .. '9' )+
			int cnt5=0;
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// Trago.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt5 >= 1 ) break loop5;
					EarlyExitException eee = new EarlyExitException(5, input);
					throw eee;
				}
				cnt5++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Floating_point_constant"

	// $ANTLR start "STRING_LITERAL"
	public final void mSTRING_LITERAL() throws RecognitionException {
		try {
			int _type = STRING_LITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Trago.g:528:5: ( '\"' ( EscapeSequence |~ ( '\\\\' | '\"' ) )* '\"' )
			// Trago.g:528:8: '\"' ( EscapeSequence |~ ( '\\\\' | '\"' ) )* '\"'
			{
			match('\"'); 
			// Trago.g:528:12: ( EscapeSequence |~ ( '\\\\' | '\"' ) )*
			loop6:
			while (true) {
				int alt6=3;
				int LA6_0 = input.LA(1);
				if ( (LA6_0=='\\') ) {
					alt6=1;
				}
				else if ( ((LA6_0 >= '\u0000' && LA6_0 <= '!')||(LA6_0 >= '#' && LA6_0 <= '[')||(LA6_0 >= ']' && LA6_0 <= '\uFFFF')) ) {
					alt6=2;
				}

				switch (alt6) {
				case 1 :
					// Trago.g:528:14: EscapeSequence
					{
					mEscapeSequence(); 

					}
					break;
				case 2 :
					// Trago.g:528:31: ~ ( '\\\\' | '\"' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop6;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING_LITERAL"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Trago.g:530:3: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// Trago.g:530:4: ( ' ' | '\\t' | '\\r' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Trago.g:531:8: ( '/*' ( . )* '*/' )
			// Trago.g:531:9: '/*' ( . )* '*/'
			{
			match("/*"); 

			// Trago.g:531:14: ( . )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0=='*') ) {
					int LA7_1 = input.LA(2);
					if ( (LA7_1=='/') ) {
						alt7=2;
					}
					else if ( ((LA7_1 >= '\u0000' && LA7_1 <= '.')||(LA7_1 >= '0' && LA7_1 <= '\uFFFF')) ) {
						alt7=1;
					}

				}
				else if ( ((LA7_0 >= '\u0000' && LA7_0 <= ')')||(LA7_0 >= '+' && LA7_0 <= '\uFFFF')) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// Trago.g:531:14: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop7;
				}
			}

			match("*/"); 


			    _channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "EscapeSequence"
	public final void mEscapeSequence() throws RecognitionException {
		try {
			// Trago.g:536:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
			// Trago.g:536:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
			{
			match('\\'); 
			if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EscapeSequence"

	@Override
	public void mTokens() throws RecognitionException {
		// Trago.g:1:8: ( T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | FLOAT | INT | CHAR | MAIN | VOID | IF | ELSE | FOR | WHILE | PRINTF | RelationOP | Identifier | Integer_constant | Floating_point_constant | STRING_LITERAL | WS | COMMENT )
		int alt8=29;
		alt8 = dfa8.predict(input);
		switch (alt8) {
			case 1 :
				// Trago.g:1:10: T__22
				{
				mT__22(); 

				}
				break;
			case 2 :
				// Trago.g:1:16: T__23
				{
				mT__23(); 

				}
				break;
			case 3 :
				// Trago.g:1:22: T__24
				{
				mT__24(); 

				}
				break;
			case 4 :
				// Trago.g:1:28: T__25
				{
				mT__25(); 

				}
				break;
			case 5 :
				// Trago.g:1:34: T__26
				{
				mT__26(); 

				}
				break;
			case 6 :
				// Trago.g:1:40: T__27
				{
				mT__27(); 

				}
				break;
			case 7 :
				// Trago.g:1:46: T__28
				{
				mT__28(); 

				}
				break;
			case 8 :
				// Trago.g:1:52: T__29
				{
				mT__29(); 

				}
				break;
			case 9 :
				// Trago.g:1:58: T__30
				{
				mT__30(); 

				}
				break;
			case 10 :
				// Trago.g:1:64: T__31
				{
				mT__31(); 

				}
				break;
			case 11 :
				// Trago.g:1:70: T__32
				{
				mT__32(); 

				}
				break;
			case 12 :
				// Trago.g:1:76: T__33
				{
				mT__33(); 

				}
				break;
			case 13 :
				// Trago.g:1:82: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 14 :
				// Trago.g:1:88: INT
				{
				mINT(); 

				}
				break;
			case 15 :
				// Trago.g:1:92: CHAR
				{
				mCHAR(); 

				}
				break;
			case 16 :
				// Trago.g:1:97: MAIN
				{
				mMAIN(); 

				}
				break;
			case 17 :
				// Trago.g:1:102: VOID
				{
				mVOID(); 

				}
				break;
			case 18 :
				// Trago.g:1:107: IF
				{
				mIF(); 

				}
				break;
			case 19 :
				// Trago.g:1:110: ELSE
				{
				mELSE(); 

				}
				break;
			case 20 :
				// Trago.g:1:115: FOR
				{
				mFOR(); 

				}
				break;
			case 21 :
				// Trago.g:1:119: WHILE
				{
				mWHILE(); 

				}
				break;
			case 22 :
				// Trago.g:1:125: PRINTF
				{
				mPRINTF(); 

				}
				break;
			case 23 :
				// Trago.g:1:132: RelationOP
				{
				mRelationOP(); 

				}
				break;
			case 24 :
				// Trago.g:1:143: Identifier
				{
				mIdentifier(); 

				}
				break;
			case 25 :
				// Trago.g:1:154: Integer_constant
				{
				mInteger_constant(); 

				}
				break;
			case 26 :
				// Trago.g:1:171: Floating_point_constant
				{
				mFloating_point_constant(); 

				}
				break;
			case 27 :
				// Trago.g:1:195: STRING_LITERAL
				{
				mSTRING_LITERAL(); 

				}
				break;
			case 28 :
				// Trago.g:1:210: WS
				{
				mWS(); 

				}
				break;
			case 29 :
				// Trago.g:1:213: COMMENT
				{
				mCOMMENT(); 

				}
				break;

		}
	}


	protected DFA8 dfa8 = new DFA8(this);
	static final String DFA8_eotS =
		"\10\uffff\1\31\1\uffff\1\32\2\uffff\6\24\2\uffff\1\44\5\uffff\11\24\2"+
		"\uffff\7\24\1\66\1\67\1\24\1\71\1\24\1\73\2\24\1\77\2\uffff\1\24\1\uffff"+
		"\1\24\1\uffff\3\24\1\uffff\2\24\1\107\1\uffff\1\24\1\111\1\24\1\uffff"+
		"\1\113\1\uffff\1\24\1\uffff\1\24\1\116\1\uffff";
	static final String DFA8_eofS =
		"\117\uffff";
	static final String DFA8_minS =
		"\1\11\7\uffff\1\52\1\uffff\1\75\2\uffff\2\141\1\145\1\147\1\141\1\157"+
		"\2\uffff\1\56\5\uffff\1\151\1\166\1\162\1\152\1\164\1\142\1\165\1\157"+
		"\1\162\2\uffff\1\160\1\141\1\164\1\157\2\145\1\141\2\60\1\151\1\60\1\145"+
		"\1\60\1\143\1\156\1\60\2\uffff\1\162\1\uffff\1\154\1\uffff\1\157\1\77"+
		"\1\144\1\uffff\1\141\1\151\1\60\1\uffff\1\157\1\60\1\150\1\uffff\1\60"+
		"\1\uffff\1\156\1\uffff\1\157\1\60\1\uffff";
	static final String DFA8_maxS =
		"\1\175\7\uffff\1\52\1\uffff\1\75\2\uffff\1\145\1\151\1\157\1\147\1\141"+
		"\1\157\2\uffff\1\71\5\uffff\1\151\1\166\1\162\1\152\1\164\1\142\1\165"+
		"\1\157\1\162\2\uffff\1\160\1\141\1\164\1\157\2\145\1\141\2\172\1\151\1"+
		"\172\1\145\1\172\1\143\1\162\1\172\2\uffff\1\162\1\uffff\1\154\1\uffff"+
		"\1\157\1\77\1\144\1\uffff\1\141\1\151\1\172\1\uffff\1\157\1\172\1\150"+
		"\1\uffff\1\172\1\uffff\1\156\1\uffff\1\157\1\172\1\uffff";
	static final String DFA8_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff\1\11\1\uffff\1\13\1\14\6"+
		"\uffff\1\27\1\30\1\uffff\1\33\1\34\1\35\1\10\1\12\11\uffff\1\31\1\32\20"+
		"\uffff\1\23\1\24\1\uffff\1\16\1\uffff\1\26\3\uffff\1\21\3\uffff\1\22\3"+
		"\uffff\1\20\1\uffff\1\15\1\uffff\1\25\2\uffff\1\17";
	static final String DFA8_specialS =
		"\117\uffff}>";
	static final String[] DFA8_transitionS = {
			"\2\27\2\uffff\1\27\22\uffff\1\27\1\23\1\26\3\uffff\1\1\1\uffff\1\2\1"+
			"\3\1\4\1\5\1\6\1\7\1\uffff\1\10\12\25\1\uffff\1\11\1\23\1\12\1\23\2\uffff"+
			"\32\24\4\uffff\1\24\1\uffff\1\20\1\17\1\15\2\24\1\22\6\24\1\16\1\21\14"+
			"\24\1\13\1\uffff\1\14",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\30",
			"",
			"\1\23",
			"",
			"",
			"\1\33\3\uffff\1\34",
			"\1\35\7\uffff\1\36",
			"\1\40\11\uffff\1\37",
			"\1\41",
			"\1\42",
			"\1\43",
			"",
			"",
			"\1\45\1\uffff\12\25",
			"",
			"",
			"",
			"",
			"",
			"\1\46",
			"\1\47",
			"\1\50",
			"\1\51",
			"\1\52",
			"\1\53",
			"\1\54",
			"\1\55",
			"\1\56",
			"",
			"",
			"\1\57",
			"\1\60",
			"\1\61",
			"\1\62",
			"\1\63",
			"\1\64",
			"\1\65",
			"\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
			"\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
			"\1\70",
			"\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
			"\1\72",
			"\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
			"\1\74",
			"\1\76\3\uffff\1\75",
			"\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
			"",
			"",
			"\1\100",
			"",
			"\1\101",
			"",
			"\1\102",
			"\1\103",
			"\1\104",
			"",
			"\1\105",
			"\1\106",
			"\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
			"",
			"\1\110",
			"\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
			"\1\112",
			"",
			"\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
			"",
			"\1\114",
			"",
			"\1\115",
			"\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
			""
	};

	static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
	static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
	static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
	static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
	static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
	static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
	static final short[][] DFA8_transition;

	static {
		int numStates = DFA8_transitionS.length;
		DFA8_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
		}
	}

	protected class DFA8 extends DFA {

		public DFA8(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 8;
			this.eot = DFA8_eot;
			this.eof = DFA8_eof;
			this.min = DFA8_min;
			this.max = DFA8_max;
			this.accept = DFA8_accept;
			this.special = DFA8_special;
			this.transition = DFA8_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | FLOAT | INT | CHAR | MAIN | VOID | IF | ELSE | FOR | WHILE | PRINTF | RelationOP | Identifier | Integer_constant | Floating_point_constant | STRING_LITERAL | WS | COMMENT );";
		}
	}

}
