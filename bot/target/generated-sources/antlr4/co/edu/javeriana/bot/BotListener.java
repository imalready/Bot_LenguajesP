// Generated from co/edu/javeriana/bot/Bot.g4 by ANTLR 4.5.1
package co.edu.javeriana.bot;


import org.jpavlich.bot.*;


import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BotParser}.
 */
public interface BotListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BotParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(BotParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(BotParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(BotParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(BotParser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#up}.
	 * @param ctx the parse tree
	 */
	void enterUp(BotParser.UpContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#up}.
	 * @param ctx the parse tree
	 */
	void exitUp(BotParser.UpContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#down}.
	 * @param ctx the parse tree
	 */
	void enterDown(BotParser.DownContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#down}.
	 * @param ctx the parse tree
	 */
	void exitDown(BotParser.DownContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#left}.
	 * @param ctx the parse tree
	 */
	void enterLeft(BotParser.LeftContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#left}.
	 * @param ctx the parse tree
	 */
	void exitLeft(BotParser.LeftContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#right}.
	 * @param ctx the parse tree
	 */
	void enterRight(BotParser.RightContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#right}.
	 * @param ctx the parse tree
	 */
	void exitRight(BotParser.RightContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#drop}.
	 * @param ctx the parse tree
	 */
	void enterDrop(BotParser.DropContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#drop}.
	 * @param ctx the parse tree
	 */
	void exitDrop(BotParser.DropContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#pick}.
	 * @param ctx the parse tree
	 */
	void enterPick(BotParser.PickContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#pick}.
	 * @param ctx the parse tree
	 */
	void exitPick(BotParser.PickContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(BotParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(BotParser.ExpressionContext ctx);
}