// Generated from Trago.g by ANTLR 4.9.2

    //import java.util.ArrayList;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TragoParser}.
 */
public interface TragoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TragoParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(TragoParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link TragoParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(TragoParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link TragoParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(TragoParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link TragoParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(TragoParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link TragoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(TragoParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TragoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(TragoParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TragoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(TragoParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TragoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(TragoParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TragoParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(TragoParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link TragoParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(TragoParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link TragoParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(TragoParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TragoParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(TragoParser.FactorContext ctx);
}