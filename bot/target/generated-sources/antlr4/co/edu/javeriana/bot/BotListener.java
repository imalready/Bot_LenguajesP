// Generated from Bot.g4 by ANTLR 4.4
package co.edu.javeriana.bot;


import org.jpavlich.bot.*;
import java.util.Map;
import java.util.HashMap;


import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BotParser}.
 */
public interface BotListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BotParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(@NotNull BotParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(@NotNull BotParser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#drop}.
	 * @param ctx the parse tree
	 */
	void enterDrop(@NotNull BotParser.DropContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#drop}.
	 * @param ctx the parse tree
	 */
	void exitDrop(@NotNull BotParser.DropContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull BotParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull BotParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#left}.
	 * @param ctx the parse tree
	 */
	void enterLeft(@NotNull BotParser.LeftContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#left}.
	 * @param ctx the parse tree
	 */
	void exitLeft(@NotNull BotParser.LeftContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#pick}.
	 * @param ctx the parse tree
	 */
	void enterPick(@NotNull BotParser.PickContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#pick}.
	 * @param ctx the parse tree
	 */
	void exitPick(@NotNull BotParser.PickContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(@NotNull BotParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(@NotNull BotParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(@NotNull BotParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(@NotNull BotParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#up}.
	 * @param ctx the parse tree
	 */
	void enterUp(@NotNull BotParser.UpContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#up}.
	 * @param ctx the parse tree
	 */
	void exitUp(@NotNull BotParser.UpContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#right}.
	 * @param ctx the parse tree
	 */
	void enterRight(@NotNull BotParser.RightContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#right}.
	 * @param ctx the parse tree
	 */
	void exitRight(@NotNull BotParser.RightContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#down}.
	 * @param ctx the parse tree
	 */
	void enterDown(@NotNull BotParser.DownContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#down}.
	 * @param ctx the parse tree
	 */
	void exitDown(@NotNull BotParser.DownContext ctx);
}