// Generated from co/edu/javeriana/bot/Bot.g4 by ANTLR 4.5.1
package co.edu.javeriana.bot;


import org.jpavlich.bot.*;


import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BotParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BotVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BotParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(BotParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentence(BotParser.SentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#up}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUp(BotParser.UpContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#down}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDown(BotParser.DownContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#left}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeft(BotParser.LeftContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#right}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRight(BotParser.RightContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#drop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop(BotParser.DropContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#pick}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPick(BotParser.PickContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(BotParser.ExpressionContext ctx);
}