// $ANTLR 3.5.2 Trago.g 2021-06-21 19:49:26

    // import packages here.
    import java.util.HashMap;
    import java.util.ArrayList;
    import java.io.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class TragoParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "CHAR", "COMMENT", "ELSE", "EscapeSequence", 
		"FLOAT", "FOR", "Floating_point_constant", "IF", "INT", "Identifier", 
		"Integer_constant", "MAIN", "PRINTF", "RelationOP", "STRING_LITERAL", 
		"VOID", "WHILE", "WS", "'&'", "'('", "')'", "'*'", "'+'", "','", "'-'", 
		"'/'", "';'", "'='", "'{'", "'}'"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public TragoParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public TragoParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return TragoParser.tokenNames; }
	@Override public String getGrammarFileName() { return "Trago.g"; }



	 
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
	       prn(";.source Test.j");
	       prn(".class public static Test");
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



	// $ANTLR start "program"
	// Trago.g:99:1: program : VOID MAIN '(' ')' '{' declarations statements '}' ;
	public final void program() throws RecognitionException {
		try {
			// Trago.g:99:8: ( VOID MAIN '(' ')' '{' declarations statements '}' )
			// Trago.g:99:10: VOID MAIN '(' ')' '{' declarations statements '}'
			{
			match(input,VOID,FOLLOW_VOID_in_program22); 
			match(input,MAIN,FOLLOW_MAIN_in_program24); 
			match(input,23,FOLLOW_23_in_program26); 
			match(input,24,FOLLOW_24_in_program28); 

			           /* Output function prologue */
			           prologue();
			        
			match(input,32,FOLLOW_32_in_program49); 
			pushFollow(FOLLOW_declarations_in_program63);
			declarations();
			state._fsp--;

			pushFollow(FOLLOW_statements_in_program76);
			statements();
			state._fsp--;

			match(input,33,FOLLOW_33_in_program86); 

					   if (TRACEON)
					      System.out.println("VOID MAIN () {declarations statements}");

			           /* output function epilogue */	  
			           epilogue();
			        
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "program"



	// $ANTLR start "declarations"
	// Trago.g:119:1: declarations : ( type Identifier ';' declarations |);
	public final void declarations() throws RecognitionException {
		Token Identifier1=null;
		Type type2 =null;

		try {
			// Trago.g:119:13: ( type Identifier ';' declarations |)
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==CHAR||LA1_0==FLOAT||LA1_0==INT) ) {
				alt1=1;
			}
			else if ( (LA1_0==FOR||LA1_0==IF||LA1_0==Identifier||LA1_0==PRINTF||LA1_0==WHILE||LA1_0==33) ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// Trago.g:119:15: type Identifier ';' declarations
					{
					pushFollow(FOLLOW_type_in_declarations113);
					type2=type();
					state._fsp--;

					Identifier1=(Token)match(input,Identifier,FOLLOW_Identifier_in_declarations115); 
					match(input,30,FOLLOW_30_in_declarations117); 
					pushFollow(FOLLOW_declarations_in_declarations119);
					declarations();
					state._fsp--;


								    if (TRACEON)
						            System.out.println("declarations: type Identifier : declarations");

					          if (symtab.containsKey((Identifier1!=null?Identifier1.getText():null))) {
									    // variable re-declared.
					              System.out.println("Type Error: " + 
					                                  Identifier1.getLine() + 
					                                  ": Redeclared identifier.");
					              System.exit(0);
					          }
					                 
									 /* Add ID and its attr_type into the symbol table. */
									 ArrayList the_list = new ArrayList();
									 the_list.add(type2);
									 the_list.add(storageIndex);
									 storageIndex = storageIndex + 1;
					         symtab.put((Identifier1!=null?Identifier1.getText():null), the_list);
					      
					}
					break;
				case 2 :
					// Trago.g:139:9: 
					{

								     if (TRACEON)
					                    System.out.println("declarations: ");
								  
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "declarations"



	// $ANTLR start "type"
	// Trago.g:146:1: type returns [Type attr_type] : ( INT | CHAR | FLOAT );
	public final Type type() throws RecognitionException {
		Type attr_type = null;


		try {
			// Trago.g:148:5: ( INT | CHAR | FLOAT )
			int alt2=3;
			switch ( input.LA(1) ) {
			case INT:
				{
				alt2=1;
				}
				break;
			case CHAR:
				{
				alt2=2;
				}
				break;
			case FLOAT:
				{
				alt2=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// Trago.g:148:7: INT
					{
					match(input,INT,FOLLOW_INT_in_type175); 
					 if (TRACEON) System.out.println("type: INT"); attr_type=Type.INT; 
					}
					break;
				case 2 :
					// Trago.g:149:7: CHAR
					{
					match(input,CHAR,FOLLOW_CHAR_in_type185); 
					 if (TRACEON) System.out.println("type: CHAR"); attr_type=Type.CHAR; 
					}
					break;
				case 3 :
					// Trago.g:150:7: FLOAT
					{
					match(input,FLOAT,FOLLOW_FLOAT_in_type195); 
					if (TRACEON) System.out.println("type: FLOAT"); attr_type=Type.FLOAT; 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return attr_type;
	}
	// $ANTLR end "type"



	// $ANTLR start "statements"
	// Trago.g:153:1: statements : ( statement statements |);
	public final void statements() throws RecognitionException {
		try {
			// Trago.g:153:11: ( statement statements |)
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==FOR||LA3_0==IF||LA3_0==Identifier||LA3_0==PRINTF||LA3_0==WHILE) ) {
				alt3=1;
			}
			else if ( (LA3_0==33) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// Trago.g:153:12: statement statements
					{
					pushFollow(FOLLOW_statement_in_statements205);
					statement();
					state._fsp--;

					pushFollow(FOLLOW_statements_in_statements207);
					statements();
					state._fsp--;

					}
					break;
				case 2 :
					// Trago.g:155:11: 
					{
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "statements"



	// $ANTLR start "statement"
	// Trago.g:157:1: statement : ( assign_stmt ';' | if_stmt | func_no_return_stmt ';' | for_stmt | while_stmt | printf_statements );
	public final void statement() throws RecognitionException {
		try {
			// Trago.g:157:10: ( assign_stmt ';' | if_stmt | func_no_return_stmt ';' | for_stmt | while_stmt | printf_statements )
			int alt4=6;
			switch ( input.LA(1) ) {
			case Identifier:
				{
				int LA4_1 = input.LA(2);
				if ( (LA4_1==31) ) {
					alt4=1;
				}
				else if ( (LA4_1==23) ) {
					alt4=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case IF:
				{
				alt4=2;
				}
				break;
			case FOR:
				{
				alt4=4;
				}
				break;
			case WHILE:
				{
				alt4=5;
				}
				break;
			case PRINTF:
				{
				alt4=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// Trago.g:157:12: assign_stmt ';'
					{
					pushFollow(FOLLOW_assign_stmt_in_statement237);
					assign_stmt();
					state._fsp--;

					match(input,30,FOLLOW_30_in_statement239); 
					}
					break;
				case 2 :
					// Trago.g:158:12: if_stmt
					{
					pushFollow(FOLLOW_if_stmt_in_statement252);
					if_stmt();
					state._fsp--;

					}
					break;
				case 3 :
					// Trago.g:159:12: func_no_return_stmt ';'
					{
					pushFollow(FOLLOW_func_no_return_stmt_in_statement265);
					func_no_return_stmt();
					state._fsp--;

					match(input,30,FOLLOW_30_in_statement267); 
					}
					break;
				case 4 :
					// Trago.g:160:12: for_stmt
					{
					pushFollow(FOLLOW_for_stmt_in_statement280);
					for_stmt();
					state._fsp--;

					}
					break;
				case 5 :
					// Trago.g:161:12: while_stmt
					{
					pushFollow(FOLLOW_while_stmt_in_statement293);
					while_stmt();
					state._fsp--;

					}
					break;
				case 6 :
					// Trago.g:162:12: printf_statements
					{
					pushFollow(FOLLOW_printf_statements_in_statement306);
					printf_statements();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "statement"



	// $ANTLR start "printf_statements"
	// Trago.g:165:1: printf_statements returns [List <String> c=new ArrayList()] : PRINTF '(' a= STRING_LITERAL ( ',' b= Identifier )* ')' ';' ;
	public final List <String> printf_statements() throws RecognitionException {
		List <String> c = new ArrayList();


		Token a=null;
		Token b=null;

		try {
			// Trago.g:165:59: ( PRINTF '(' a= STRING_LITERAL ( ',' b= Identifier )* ')' ';' )
			// Trago.g:165:61: PRINTF '(' a= STRING_LITERAL ( ',' b= Identifier )* ')' ';'
			{
			match(input,PRINTF,FOLLOW_PRINTF_in_printf_statements335); 
			match(input,23,FOLLOW_23_in_printf_statements336); 
			a=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_printf_statements340); 
			// Trago.g:165:88: ( ',' b= Identifier )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==27) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// Trago.g:165:89: ',' b= Identifier
					{
					match(input,27,FOLLOW_27_in_printf_statements343); 
					b=(Token)match(input,Identifier,FOLLOW_Identifier_in_printf_statements346); 
					c.add((b!=null?b.getText():null));
					}
					break;

				default :
					break loop5;
				}
			}

			match(input,24,FOLLOW_24_in_printf_statements350); 
			match(input,30,FOLLOW_30_in_printf_statements352); 

			            prn("\t; print the value.");
			            (a!=null?a.getText():null).toString();
			            String result=new String((a!=null?a.getText():null));
			            String[] pun={"\\n","\\b","\\t","\\f","\\r","\\\"","\\\'", "\\\\"};
			            for(int i=0;i<pun.length;i++){
			                int newline=result.indexOf(pun[i]);
			                if(newline!=-1){
			                    String newline2=result.substring(newline,newline+2);
			                    result=result.replace(newline2,"");
			                }
			            }
			            //Contain variable
			            if(result.contains("%d")||result.contains("%f")&&c!=null){
			                int index_var=0;
			                for(int i=1;i<result.length()-1;i++){
			                    if(result.charAt(i)=='%'){
			                        Type the_type;
			                        int the_mem;
			                        String id=c.get(index_var);
			                        index_var++;
			                        the_type = (Type) symtab.get(id).get(0);
			                        the_mem = (int) symtab.get(id).get(1);
			                        String str_type= String.valueOf(the_type);
			                        //check type
			                        if ( (str_type.equals("INT")&& result.charAt(i+1)=='f') 
			                             || (str_type.equals("FLOAT")&& result.charAt(i+1)=='d')) {
			                            System.out.println("Printf : Type error!\n");
			                            System.exit(0);
			                        }
			                        if(str_type.equals("INT")){
			                            prn("\tgetstatic java/lang/System/out Ljava/io/PrintStream;");
			                            prn("\tiload "+the_mem);
			                            prn("\tinvokevirtual java/io/PrintStream/print(I)V");
			                            result=result.replaceFirst("%d","");
			                        }
			                        else if(str_type.equals("FLOAT")){
			                            prn("\tgetstatic java/lang/System/out Ljava/io/PrintStream;");
			                            prn("\tfload "+the_mem);
			                            prn("\tinvokevirtual java/io/PrintStream/print(F)V");
			                            result=result.replaceFirst("%f","");
			                        }
			                    }
			                    //Other Literal
			                    int index=result.indexOf("%");
			                    if(index!=-1){
			                        String cut=result.substring(i,index);
			                        prn("\tgetstatic java/lang/System/out Ljava/io/PrintStream;");
			                        prn("\tldc \""+cut+"\"");
			                        prn("\tinvokevirtual java/io/PrintStream/print(Ljava/lang/String;)V");
			                        i=index-1;
			                    }
			                    //Remain Literal without any variable
			                    else{
			                        String cut=result.substring(i,result.length()-1);
			                        prn("\tgetstatic java/lang/System/out Ljava/io/PrintStream;");
			                        prn("\tldc \""+cut+"\"");
			                        prn("\tinvokevirtual java/io/PrintStream/println(Ljava/lang/String;)V");
			                        i=result.length()-2;
			                    }

			                }
			            }
			            //No variable
			            else if(b==null){
			                prn("\tgetstatic java/lang/System/out Ljava/io/PrintStream;");
			                prn("\tldc "+result);
			                prn("\tinvokevirtual java/io/PrintStream/println(Ljava/lang/String;)V");
			            }
			            //Error 
			            else{
			                System.out.println("Printf : Type error!\n");
			                System.exit(0);
			            }        

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return c;
	}
	// $ANTLR end "printf_statements"



	// $ANTLR start "for_stmt"
	// Trago.g:240:1: for_stmt returns [String lab] : FOR '(' assign_stmt ';' a= cond_expression ';' assign_stmt ')' block_stmt ;
	public final String for_stmt() throws RecognitionException {
		String lab = null;


		ParserRuleReturnScope a =null;

		try {
			// Trago.g:240:29: ( FOR '(' assign_stmt ';' a= cond_expression ';' assign_stmt ')' block_stmt )
			// Trago.g:240:31: FOR '(' assign_stmt ';' a= cond_expression ';' assign_stmt ')' block_stmt
			{
			match(input,FOR,FOLLOW_FOR_in_for_stmt362); 
			match(input,23,FOLLOW_23_in_for_stmt364); 
			pushFollow(FOLLOW_assign_stmt_in_for_stmt366);
			assign_stmt();
			state._fsp--;

			match(input,30,FOLLOW_30_in_for_stmt368); 
			pushFollow(FOLLOW_cond_expression_in_for_stmt391);
			a=cond_expression();
			state._fsp--;

			match(input,30,FOLLOW_30_in_for_stmt393); 
			pushFollow(FOLLOW_assign_stmt_in_for_stmt409);
			assign_stmt();
			state._fsp--;

			match(input,24,FOLLOW_24_in_for_stmt422); 
			pushFollow(FOLLOW_block_stmt_in_for_stmt439);
			block_stmt();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return lab;
	}
	// $ANTLR end "for_stmt"



	// $ANTLR start "while_stmt"
	// Trago.g:246:1: while_stmt returns [String lab] : WHILE '(' a= cond_expression ')' block_stmt ;
	public final String while_stmt() throws RecognitionException {
		String lab = null;


		ParserRuleReturnScope a =null;

		try {
			// Trago.g:246:31: ( WHILE '(' a= cond_expression ')' block_stmt )
			// Trago.g:246:33: WHILE '(' a= cond_expression ')' block_stmt
			{
			match(input,WHILE,FOLLOW_WHILE_in_while_stmt457); 

			                    String label=newLabel();
			                    lab =label;
			                    
			                    prn(label+": ");
			                   
			match(input,23,FOLLOW_23_in_while_stmt462); 
			pushFollow(FOLLOW_cond_expression_in_while_stmt466);
			a=cond_expression();
			state._fsp--;

			match(input,24,FOLLOW_24_in_while_stmt468); 
			pushFollow(FOLLOW_block_stmt_in_while_stmt470);
			block_stmt();
			state._fsp--;


			                  
			                  prn("\tgoto "+label);
			                  prn((a!=null?((TragoParser.cond_expression_return)a).lab:null)+":");
			               
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return lab;
	}
	// $ANTLR end "while_stmt"



	// $ANTLR start "if_stmt"
	// Trago.g:258:1: if_stmt : if_then_stmt if_else_stmt[$if_then_stmt.lab] ;
	public final void if_stmt() throws RecognitionException {
		String if_then_stmt3 =null;

		try {
			// Trago.g:259:13: ( if_then_stmt if_else_stmt[$if_then_stmt.lab] )
			// Trago.g:259:15: if_then_stmt if_else_stmt[$if_then_stmt.lab]
			{
			pushFollow(FOLLOW_if_then_stmt_in_if_stmt506);
			if_then_stmt3=if_then_stmt();
			state._fsp--;

			pushFollow(FOLLOW_if_else_stmt_in_if_stmt508);
			if_else_stmt(if_then_stmt3);
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "if_stmt"



	// $ANTLR start "if_then_stmt"
	// Trago.g:262:1: if_then_stmt returns [String lab] : IF '(' a= cond_expression ')' block_stmt ;
	public final String if_then_stmt() throws RecognitionException {
		String lab = null;


		ParserRuleReturnScope a =null;

		try {
			// Trago.g:263:20: ( IF '(' a= cond_expression ')' block_stmt )
			// Trago.g:263:22: IF '(' a= cond_expression ')' block_stmt
			{
			match(input,IF,FOLLOW_IF_in_if_then_stmt536); 
			match(input,23,FOLLOW_23_in_if_then_stmt538); 
			pushFollow(FOLLOW_cond_expression_in_if_then_stmt542);
			a=cond_expression();
			state._fsp--;

			match(input,24,FOLLOW_24_in_if_then_stmt544); 
			pushFollow(FOLLOW_block_stmt_in_if_then_stmt546);
			block_stmt();
			state._fsp--;


			                  String label=newLabel();
			                  lab =label;
			                  prn("\tgoto "+label);
			                  prn((a!=null?((TragoParser.cond_expression_return)a).lab:null)+":");
			               
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return lab;
	}
	// $ANTLR end "if_then_stmt"



	// $ANTLR start "if_else_stmt"
	// Trago.g:272:1: if_else_stmt[String lab] : ( ELSE block_stmt |);
	public final void if_else_stmt(String lab) throws RecognitionException {
		try {
			// Trago.g:273:13: ( ELSE block_stmt |)
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==ELSE) ) {
				alt6=1;
			}
			else if ( (LA6_0==FOR||LA6_0==IF||LA6_0==Identifier||LA6_0==PRINTF||LA6_0==WHILE||LA6_0==33) ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// Trago.g:273:15: ELSE block_stmt
					{
					match(input,ELSE,FOLLOW_ELSE_in_if_else_stmt570); 
					pushFollow(FOLLOW_block_stmt_in_if_else_stmt572);
					block_stmt();
					state._fsp--;


					              prn(lab+":");
					            
					}
					break;
				case 2 :
					// Trago.g:276:15: 
					{
					prn(lab+":");
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "if_else_stmt"



	// $ANTLR start "block_stmt"
	// Trago.g:280:1: block_stmt : '{' statements '}' ;
	public final void block_stmt() throws RecognitionException {
		try {
			// Trago.g:280:11: ( '{' statements '}' )
			// Trago.g:280:13: '{' statements '}'
			{
			match(input,32,FOLLOW_32_in_block_stmt616); 
			pushFollow(FOLLOW_statements_in_block_stmt618);
			statements();
			state._fsp--;

			match(input,33,FOLLOW_33_in_block_stmt620); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "block_stmt"



	// $ANTLR start "assign_stmt"
	// Trago.g:284:1: assign_stmt : Identifier '=' (a= type )? arith_expression ;
	public final void assign_stmt() throws RecognitionException {
		Token Identifier4=null;
		Type a =null;
		ParserRuleReturnScope arith_expression5 =null;

		try {
			// Trago.g:284:12: ( Identifier '=' (a= type )? arith_expression )
			// Trago.g:284:14: Identifier '=' (a= type )? arith_expression
			{
			Identifier4=(Token)match(input,Identifier,FOLLOW_Identifier_in_assign_stmt632); 
			match(input,31,FOLLOW_31_in_assign_stmt634); 
			// Trago.g:284:29: (a= type )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==CHAR||LA7_0==FLOAT||LA7_0==INT) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// Trago.g:284:30: a= type
					{
					pushFollow(FOLLOW_type_in_assign_stmt639);
					a=type();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_arith_expression_in_assign_stmt643);
			arith_expression5=arith_expression();
			state._fsp--;


						      Type the_type;
						      int the_mem;
						      // get the ID's location and type from symtab.			   
						      the_type = (Type) symtab.get((Identifier4!=null?Identifier4.getText():null)).get(0);
						      the_mem = (int) symtab.get((Identifier4!=null?Identifier4.getText():null)).get(1);
						      if (the_type != (arith_expression5!=null?((TragoParser.arith_expression_return)arith_expression5).attr_type:null)) {
						          System.out.println("Type error!\n");
							        System.exit(0);
						      }
						       // issue store insruction:
			               // => store the top element of the operand stack into the locals.
						   switch (the_type) {
						   case INT:
						              prn("\tistore " + the_mem);
						              break;
						   case FLOAT:
			                          prn("\tfstore " + the_mem);
						              break;
						   case CHAR:
						              break;
						   }
			             
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "assign_stmt"



	// $ANTLR start "func_no_return_stmt"
	// Trago.g:309:1: func_no_return_stmt : Identifier '(' argument ')' ;
	public final void func_no_return_stmt() throws RecognitionException {
		try {
			// Trago.g:309:20: ( Identifier '(' argument ')' )
			// Trago.g:309:22: Identifier '(' argument ')'
			{
			match(input,Identifier,FOLLOW_Identifier_in_func_no_return_stmt664); 
			match(input,23,FOLLOW_23_in_func_no_return_stmt666); 
			pushFollow(FOLLOW_argument_in_func_no_return_stmt668);
			argument();
			state._fsp--;

			match(input,24,FOLLOW_24_in_func_no_return_stmt670); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "func_no_return_stmt"



	// $ANTLR start "argument"
	// Trago.g:311:1: argument : arg ( ',' arg )* ;
	public final void argument() throws RecognitionException {
		try {
			// Trago.g:311:9: ( arg ( ',' arg )* )
			// Trago.g:311:11: arg ( ',' arg )*
			{
			pushFollow(FOLLOW_arg_in_argument696);
			arg();
			state._fsp--;

			// Trago.g:311:15: ( ',' arg )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==27) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// Trago.g:311:16: ',' arg
					{
					match(input,27,FOLLOW_27_in_argument699); 
					pushFollow(FOLLOW_arg_in_argument701);
					arg();
					state._fsp--;

					}
					break;

				default :
					break loop8;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "argument"



	// $ANTLR start "arg"
	// Trago.g:313:1: arg : ( arith_expression | STRING_LITERAL );
	public final void arg() throws RecognitionException {
		try {
			// Trago.g:313:4: ( arith_expression | STRING_LITERAL )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==Floating_point_constant||(LA9_0 >= Identifier && LA9_0 <= Integer_constant)||(LA9_0 >= 22 && LA9_0 <= 23)||LA9_0==28) ) {
				alt9=1;
			}
			else if ( (LA9_0==STRING_LITERAL) ) {
				alt9=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// Trago.g:313:6: arith_expression
					{
					pushFollow(FOLLOW_arith_expression_in_arg718);
					arith_expression();
					state._fsp--;

					}
					break;
				case 2 :
					// Trago.g:314:6: STRING_LITERAL
					{
					match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_arg725); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "arg"


	public static class cond_expression_return extends ParserRuleReturnScope {
		public boolean truth;
		public Type type;
		public String lab;
	};


	// $ANTLR start "cond_expression"
	// Trago.g:317:1: cond_expression returns [boolean truth,Type type,String lab] : a= arith_expression (b= RelationOP c= arith_expression )* ;
	public final TragoParser.cond_expression_return cond_expression() throws RecognitionException {
		TragoParser.cond_expression_return retval = new TragoParser.cond_expression_return();
		retval.start = input.LT(1);

		Token b=null;
		ParserRuleReturnScope a =null;
		ParserRuleReturnScope c =null;

		try {
			// Trago.g:319:16: (a= arith_expression (b= RelationOP c= arith_expression )* )
			// Trago.g:319:18: a= arith_expression (b= RelationOP c= arith_expression )*
			{
			pushFollow(FOLLOW_arith_expression_in_cond_expression763);
			a=arith_expression();
			state._fsp--;


							    /*if ((a!=null?((TragoParser.arith_expression_return)a).attr_type:null).ordinal() != 0)
								      truth = true;
								  else
								      truth = false;*/
							    
			// Trago.g:325:9: (b= RelationOP c= arith_expression )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==RelationOP) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// Trago.g:325:10: b= RelationOP c= arith_expression
					{
					b=(Token)match(input,RelationOP,FOLLOW_RelationOP_in_cond_expression777); 
					pushFollow(FOLLOW_arith_expression_in_cond_expression781);
					c=arith_expression();
					state._fsp--;

					}
					break;

				default :
					break loop10;
				}
			}


			            if((a!=null?((TragoParser.arith_expression_return)a).attr_type:null)!=(c!=null?((TragoParser.arith_expression_return)c).attr_type:null)){
			                System.out.println("Comparsion:Type Error");
			                System.exit(0);
			            }
			            retval.type =(a!=null?((TragoParser.arith_expression_return)a).attr_type:null);
			            String compare=new String((b!=null?b.getText():null));
			            String[] operators={">",">=","<","<=","==","!="};
			            //Check Identifier
			            // if(symtab.containsKey((a!=null?input.toString(a.start,a.stop):null))){
			            //     prn("; here")
			            //     if((a!=null?((TragoParser.arith_expression_return)a).attr_type:null) == Type.INT)
			            //         prn("\tiload "+symtab.get((a!=null?input.toString(a.start,a.stop):null)).get(1)); 
			            //     else if((a!=null?((TragoParser.arith_expression_return)a).attr_type:null) == Type.FLOAT)
			            //         prn("\tfload "+symtab.get((a!=null?input.toString(a.start,a.stop):null)).get(1));  
			            // }
			            // else
			            //       prn("\tldc "+(a!=null?input.toString(a.start,a.stop):null));
			            // if(symtab.containsKey((c!=null?input.toString(c.start,c.stop):null))){
			            //     if((c!=null?((TragoParser.arith_expression_return)c).attr_type:null) == Type.INT)
			            //         prn("\tiload "+symtab.get((c!=null?input.toString(c.start,c.stop):null)).get(1));
			            //     else if((c!=null?((TragoParser.arith_expression_return)c).attr_type:null) == Type.FLOAT)
			            //         prn("\tfload "+symtab.get((c!=null?input.toString(c.start,c.stop):null)).get(1));
			            // }
			            // else
			            //       prn("\tldc "+(c!=null?input.toString(c.start,c.stop):null));
			            //Logical Operator
			            String label=newLabel();
			            retval.lab =label;
			            if(compare.equals(operators[0])){
			                if((a!=null?((TragoParser.arith_expression_return)a).attr_type:null) == Type.INT)
			                    prn("\tif_icmple "+label);
			                else if((a!=null?((TragoParser.arith_expression_return)a).attr_type:null) == Type.FLOAT){
			                    prn("\tfcmpl");
			                    prn("\tifle "+label);
			                }
			            }
			            else if(compare.equals(operators[1])){
			                if((a!=null?((TragoParser.arith_expression_return)a).attr_type:null) == Type.INT)
			                    prn("\tif_icmplt "+label);
			                else if((a!=null?((TragoParser.arith_expression_return)a).attr_type:null) == Type.FLOAT){
			                    prn("\tfcmpl");
			                    prn("\tiflt "+label);
			                }
			            }
			            else if(compare.equals(operators[2])){
			                if((a!=null?((TragoParser.arith_expression_return)a).attr_type:null) == Type.INT)
			                    prn("\tif_icmpge "+label);
			                else if((a!=null?((TragoParser.arith_expression_return)a).attr_type:null) == Type.FLOAT){
			                    prn("\tfcmpl");
			                    prn("\tifge "+label);
			                }
			            }
			            else if(compare.equals(operators[3])){
			                if((a!=null?((TragoParser.arith_expression_return)a).attr_type:null) == Type.INT)
			                    prn("\tif_icmpgt "+label);
			                else if((a!=null?((TragoParser.arith_expression_return)a).attr_type:null) == Type.FLOAT){
			                    prn("\tfcmpl");
			                    prn("\tifgt "+label);
			                }
			            }
			            else if(compare.equals(operators[4])){
			                if((a!=null?((TragoParser.arith_expression_return)a).attr_type:null) == Type.INT)
			                    prn("\tif_icmpne "+label);
			                else if((a!=null?((TragoParser.arith_expression_return)a).attr_type:null) == Type.FLOAT){
			                    prn("\tfcmpl");
			                    prn("\tifne "+label);
			                }
			            }
			            else if(compare.equals(operators[5])){
			                if((a!=null?((TragoParser.arith_expression_return)a).attr_type:null) == Type.INT)
			                    prn("\tif_icmpeq "+label);
			                else if((a!=null?((TragoParser.arith_expression_return)a).attr_type:null) == Type.FLOAT){
			                    prn("\tfcmpl");
			                    prn("\tifeq "+label);
			                }
			            }
			        
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "cond_expression"


	public static class arith_expression_return extends ParserRuleReturnScope {
		public Type attr_type;
	};


	// $ANTLR start "arith_expression"
	// Trago.g:404:1: arith_expression returns [Type attr_type] : a= multExpr ( '+' b= multExpr | '-' c= multExpr )* ;
	public final TragoParser.arith_expression_return arith_expression() throws RecognitionException {
		TragoParser.arith_expression_return retval = new TragoParser.arith_expression_return();
		retval.start = input.LT(1);

		Type a =null;
		Type b =null;
		Type c =null;

		try {
			// Trago.g:406:17: (a= multExpr ( '+' b= multExpr | '-' c= multExpr )* )
			// Trago.g:406:19: a= multExpr ( '+' b= multExpr | '-' c= multExpr )*
			{
			pushFollow(FOLLOW_multExpr_in_arith_expression820);
			a=multExpr();
			state._fsp--;

			 retval.attr_type = a; 
			// Trago.g:407:19: ( '+' b= multExpr | '-' c= multExpr )*
			loop11:
			while (true) {
				int alt11=3;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==26) ) {
					alt11=1;
				}
				else if ( (LA11_0==28) ) {
					alt11=2;
				}

				switch (alt11) {
				case 1 :
					// Trago.g:407:21: '+' b= multExpr
					{
					match(input,26,FOLLOW_26_in_arith_expression844); 
					pushFollow(FOLLOW_multExpr_in_arith_expression848);
					b=multExpr();
					state._fsp--;


											              if ((retval.attr_type == Type.INT) &&
											                (b == Type.INT))
											                  prn("\tiadd");
					                          else if((retval.attr_type == Type.FLOAT) &&
					                                  (b == Type.FLOAT))
					                              prn("\tfadd");
					                      
					}
					break;
				case 2 :
					// Trago.g:415:21: '-' c= multExpr
					{
					match(input,28,FOLLOW_28_in_arith_expression872); 
					pushFollow(FOLLOW_multExpr_in_arith_expression876);
					c=multExpr();
					state._fsp--;


					                          if ((retval.attr_type == Type.INT) &&
					                            (c == Type.INT))
					                              prn("\tisub");
					                          else if((retval.attr_type == Type.FLOAT) &&
					                                  (c == Type.FLOAT))
					                              prn("\tfsub");
					                      
					}
					break;

				default :
					break loop11;
				}
			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "arith_expression"



	// $ANTLR start "multExpr"
	// Trago.g:425:1: multExpr returns [Type attr_type] : a= signExpr ( '*' b= signExpr | '/' c= signExpr )* ;
	public final Type multExpr() throws RecognitionException {
		Type attr_type = null;


		Type a =null;
		Type b =null;
		Type c =null;

		try {
			// Trago.g:427:11: (a= signExpr ( '*' b= signExpr | '/' c= signExpr )* )
			// Trago.g:427:13: a= signExpr ( '*' b= signExpr | '/' c= signExpr )*
			{
			pushFollow(FOLLOW_signExpr_in_multExpr939);
			a=signExpr();
			state._fsp--;

			 attr_type =a; 
			// Trago.g:428:11: ( '*' b= signExpr | '/' c= signExpr )*
			loop12:
			while (true) {
				int alt12=3;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==25) ) {
					alt12=1;
				}
				else if ( (LA12_0==29) ) {
					alt12=2;
				}

				switch (alt12) {
				case 1 :
					// Trago.g:428:13: '*' b= signExpr
					{
					match(input,25,FOLLOW_25_in_multExpr955); 
					pushFollow(FOLLOW_signExpr_in_multExpr959);
					b=signExpr();
					state._fsp--;

					 
					            if ((attr_type == Type.INT) &&
					                  (b == Type.INT))
					                 prn("\timul");
					            else if((attr_type == Type.FLOAT) &&
					                  (b == Type.FLOAT))
					              prn("\tfmul");
					                       
					}
					break;
				case 2 :
					// Trago.g:437:13: '/' c= signExpr
					{
					match(input,29,FOLLOW_29_in_multExpr981); 
					pushFollow(FOLLOW_signExpr_in_multExpr985);
					c=signExpr();
					state._fsp--;


					            if ((attr_type == Type.INT) &&
					                  (c == Type.INT))
					                 prn("\tidiv");
					            else if((attr_type == Type.FLOAT) &&
					                  (c == Type.FLOAT))
					              prn("\tfdiv");
					                       
					}
					break;

				default :
					break loop12;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return attr_type;
	}
	// $ANTLR end "multExpr"



	// $ANTLR start "signExpr"
	// Trago.g:448:1: signExpr returns [Type attr_type] : (a= primaryExpr | '-' b= primaryExpr );
	public final Type signExpr() throws RecognitionException {
		Type attr_type = null;


		Type a =null;
		Type b =null;

		try {
			// Trago.g:450:9: (a= primaryExpr | '-' b= primaryExpr )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==Floating_point_constant||(LA13_0 >= Identifier && LA13_0 <= Integer_constant)||(LA13_0 >= 22 && LA13_0 <= 23)) ) {
				alt13=1;
			}
			else if ( (LA13_0==28) ) {
				alt13=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// Trago.g:450:11: a= primaryExpr
					{
					pushFollow(FOLLOW_primaryExpr_in_signExpr1025);
					a=primaryExpr();
					state._fsp--;

					 attr_type =a; 
					}
					break;
				case 2 :
					// Trago.g:451:11: '-' b= primaryExpr
					{
					match(input,28,FOLLOW_28_in_signExpr1040); 
					pushFollow(FOLLOW_primaryExpr_in_signExpr1044);
					b=primaryExpr();
					state._fsp--;

					 
					          attr_type =b;
					          if(b==Type.INT)
					              prn("\tineg");
					          else if(b==Type.FLOAT)
					              prn("\tfneg");
					      
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return attr_type;
	}
	// $ANTLR end "signExpr"



	// $ANTLR start "primaryExpr"
	// Trago.g:458:1: primaryExpr returns [Type attr_type] : ( Integer_constant | Floating_point_constant | Identifier | '&' Identifier | '(' a= arith_expression ')' );
	public final Type primaryExpr() throws RecognitionException {
		Type attr_type = null;


		Token Integer_constant6=null;
		Token Floating_point_constant7=null;
		Token Identifier8=null;
		Token Identifier9=null;
		ParserRuleReturnScope a =null;

		try {
			// Trago.g:460:12: ( Integer_constant | Floating_point_constant | Identifier | '&' Identifier | '(' a= arith_expression ')' )
			int alt14=5;
			switch ( input.LA(1) ) {
			case Integer_constant:
				{
				alt14=1;
				}
				break;
			case Floating_point_constant:
				{
				alt14=2;
				}
				break;
			case Identifier:
				{
				alt14=3;
				}
				break;
			case 22:
				{
				alt14=4;
				}
				break;
			case 23:
				{
				alt14=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}
			switch (alt14) {
				case 1 :
					// Trago.g:460:14: Integer_constant
					{
					Integer_constant6=(Token)match(input,Integer_constant,FOLLOW_Integer_constant_in_primaryExpr1068); 

								    attr_type = Type.INT;
									
									// code generation.
									// push the integer into the operand stack.
									prn("\tldc " + (Integer_constant6!=null?Integer_constant6.getText():null));
								 
					}
					break;
				case 2 :
					// Trago.g:468:14: Floating_point_constant
					{
					Floating_point_constant7=(Token)match(input,Floating_point_constant,FOLLOW_Floating_point_constant_in_primaryExpr1092); 

					                 attr_type = Type.FLOAT;
					                 prn("\tldc " + (Floating_point_constant7!=null?Floating_point_constant7.getText():null));
					           
					}
					break;
				case 3 :
					// Trago.g:472:14: Identifier
					{
					Identifier8=(Token)match(input,Identifier,FOLLOW_Identifier_in_primaryExpr1108); 

								    // get type information from symtab.
								    attr_type = (Type) symtab.get((Identifier8!=null?Identifier8.getText():null)).get(0);
									
									switch (attr_type) {
									case INT: 
									          // load the variable into the operand stack.
									          prn("\tiload " + symtab.get((Identifier8!=null?Identifier8.getText():null)).get(1));
									          break;
									case FLOAT:
					                  prn("\tfload " + symtab.get((Identifier8!=null?Identifier8.getText():null)).get(1));
									          break;
									case CHAR:
									          break;
									
									}
							
					}
					break;
				case 4 :
					// Trago.g:490:9: '&' Identifier
					{
					match(input,22,FOLLOW_22_in_primaryExpr1125); 
					Identifier9=(Token)match(input,Identifier,FOLLOW_Identifier_in_primaryExpr1127); 

					          // get type information from symtab.
					          attr_type = (Type) symtab.get((Identifier9!=null?Identifier9.getText():null)).get(0);
					        
					        switch (attr_type) {
					        case INT: 
					                  // load the variable into the operand stack.
					                  prn("\tiload " + symtab.get((Identifier9!=null?Identifier9.getText():null)).get(1));
					                  break;
					        case FLOAT:
					                  prn("\tfload " + symtab.get((Identifier9!=null?Identifier9.getText():null)).get(1));
					                  break;
					        case CHAR:
					                  break;
					        
					        }
					    
					}
					break;
				case 5 :
					// Trago.g:507:7: '(' a= arith_expression ')'
					{
					match(input,23,FOLLOW_23_in_primaryExpr1136); 
					pushFollow(FOLLOW_arith_expression_in_primaryExpr1140);
					a=arith_expression();
					state._fsp--;

					match(input,24,FOLLOW_24_in_primaryExpr1142); 

					        attr_type =(a!=null?((TragoParser.arith_expression_return)a).attr_type:null);
					     
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return attr_type;
	}
	// $ANTLR end "primaryExpr"

	// Delegated rules



	public static final BitSet FOLLOW_VOID_in_program22 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_MAIN_in_program24 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_program26 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_program28 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_program49 = new BitSet(new long[]{0x0000000200113B10L});
	public static final BitSet FOLLOW_declarations_in_program63 = new BitSet(new long[]{0x0000000200112A00L});
	public static final BitSet FOLLOW_statements_in_program76 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_program86 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_declarations113 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_Identifier_in_declarations115 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_declarations117 = new BitSet(new long[]{0x0000000000001110L});
	public static final BitSet FOLLOW_declarations_in_declarations119 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_type175 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_type185 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_type195 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_statements205 = new BitSet(new long[]{0x0000000000112A00L});
	public static final BitSet FOLLOW_statements_in_statements207 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assign_stmt_in_statement237 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_statement239 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_stmt_in_statement252 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_func_no_return_stmt_in_statement265 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_statement267 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_for_stmt_in_statement280 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_while_stmt_in_statement293 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_printf_statements_in_statement306 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINTF_in_printf_statements335 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_printf_statements336 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_printf_statements340 = new BitSet(new long[]{0x0000000009000000L});
	public static final BitSet FOLLOW_27_in_printf_statements343 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_Identifier_in_printf_statements346 = new BitSet(new long[]{0x0000000009000000L});
	public static final BitSet FOLLOW_24_in_printf_statements350 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_printf_statements352 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_for_stmt362 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_for_stmt364 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_assign_stmt_in_for_stmt366 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_for_stmt368 = new BitSet(new long[]{0x0000000010C06400L});
	public static final BitSet FOLLOW_cond_expression_in_for_stmt391 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_for_stmt393 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_assign_stmt_in_for_stmt409 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_for_stmt422 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_block_stmt_in_for_stmt439 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_while_stmt457 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_while_stmt462 = new BitSet(new long[]{0x0000000010C06400L});
	public static final BitSet FOLLOW_cond_expression_in_while_stmt466 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_while_stmt468 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_block_stmt_in_while_stmt470 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_then_stmt_in_if_stmt506 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_if_else_stmt_in_if_stmt508 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_if_then_stmt536 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_if_then_stmt538 = new BitSet(new long[]{0x0000000010C06400L});
	public static final BitSet FOLLOW_cond_expression_in_if_then_stmt542 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_if_then_stmt544 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_block_stmt_in_if_then_stmt546 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELSE_in_if_else_stmt570 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_block_stmt_in_if_else_stmt572 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_block_stmt616 = new BitSet(new long[]{0x0000000200112A00L});
	public static final BitSet FOLLOW_statements_in_block_stmt618 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_block_stmt620 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_assign_stmt632 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_assign_stmt634 = new BitSet(new long[]{0x0000000010C07510L});
	public static final BitSet FOLLOW_type_in_assign_stmt639 = new BitSet(new long[]{0x0000000010C06400L});
	public static final BitSet FOLLOW_arith_expression_in_assign_stmt643 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_func_no_return_stmt664 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_func_no_return_stmt666 = new BitSet(new long[]{0x0000000010C46400L});
	public static final BitSet FOLLOW_argument_in_func_no_return_stmt668 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_func_no_return_stmt670 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arg_in_argument696 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_27_in_argument699 = new BitSet(new long[]{0x0000000010C46400L});
	public static final BitSet FOLLOW_arg_in_argument701 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_arith_expression_in_arg718 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_arg725 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arith_expression_in_cond_expression763 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_RelationOP_in_cond_expression777 = new BitSet(new long[]{0x0000000010C06400L});
	public static final BitSet FOLLOW_arith_expression_in_cond_expression781 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression820 = new BitSet(new long[]{0x0000000014000002L});
	public static final BitSet FOLLOW_26_in_arith_expression844 = new BitSet(new long[]{0x0000000010C06400L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression848 = new BitSet(new long[]{0x0000000014000002L});
	public static final BitSet FOLLOW_28_in_arith_expression872 = new BitSet(new long[]{0x0000000010C06400L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression876 = new BitSet(new long[]{0x0000000014000002L});
	public static final BitSet FOLLOW_signExpr_in_multExpr939 = new BitSet(new long[]{0x0000000022000002L});
	public static final BitSet FOLLOW_25_in_multExpr955 = new BitSet(new long[]{0x0000000010C06400L});
	public static final BitSet FOLLOW_signExpr_in_multExpr959 = new BitSet(new long[]{0x0000000022000002L});
	public static final BitSet FOLLOW_29_in_multExpr981 = new BitSet(new long[]{0x0000000010C06400L});
	public static final BitSet FOLLOW_signExpr_in_multExpr985 = new BitSet(new long[]{0x0000000022000002L});
	public static final BitSet FOLLOW_primaryExpr_in_signExpr1025 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_signExpr1040 = new BitSet(new long[]{0x0000000000C06400L});
	public static final BitSet FOLLOW_primaryExpr_in_signExpr1044 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Integer_constant_in_primaryExpr1068 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Floating_point_constant_in_primaryExpr1092 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_primaryExpr1108 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_primaryExpr1125 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_Identifier_in_primaryExpr1127 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_primaryExpr1136 = new BitSet(new long[]{0x0000000010C06400L});
	public static final BitSet FOLLOW_arith_expression_in_primaryExpr1140 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_primaryExpr1142 = new BitSet(new long[]{0x0000000000000002L});
}
