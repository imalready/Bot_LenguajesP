// Generated from co/edu/javeriana/bot/Bot.g4 by ANTLR 4.5.1
package co.edu.javeriana.bot;


import org.jpavlich.bot.*;
import java.util.Map;
import java.util.HashMap;
import co.edu.javeriana.bot.ast.*;


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
	 * Visit a parse tree produced by {@link BotParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(BotParser.FunctionContext ctx);
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
	 * Visit a parse tree produced by {@link BotParser#pick}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPick(BotParser.PickContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#drop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop(BotParser.DropContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#println}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintln(BotParser.PrintlnContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional(BotParser.ConditionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#cycle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCycle(BotParser.CycleContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(BotParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(BotParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#decl_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_assign(BotParser.Decl_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(BotParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(BotParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(BotParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(BotParser.TermContext ctx);
}