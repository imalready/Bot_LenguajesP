// Generated from co/edu/javeriana/bot/Bot.g4 by ANTLR 4.5.1
package co.edu.javeriana.bot;


import org.jpavlich.bot.*;
import java.util.Map;
import java.util.HashMap;
import co.edu.javeriana.bot.ast.*;


import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BotParser}.
 */
public interface BotListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BotParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(BotParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(BotParser.FunctionContext ctx);
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
	 * Enter a parse tree produced by {@link BotParser#println}.
	 * @param ctx the parse tree
	 */
	void enterPrintln(BotParser.PrintlnContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#println}.
	 * @param ctx the parse tree
	 */
	void exitPrintln(BotParser.PrintlnContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterConditional(BotParser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitConditional(BotParser.ConditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#cycle}.
	 * @param ctx the parse tree
	 */
	void enterCycle(BotParser.CycleContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#cycle}.
	 * @param ctx the parse tree
	 */
	void exitCycle(BotParser.CycleContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(BotParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(BotParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(BotParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(BotParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#decl_assign}.
	 * @param ctx the parse tree
	 */
	void enterDecl_assign(BotParser.Decl_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#decl_assign}.
	 * @param ctx the parse tree
	 */
	void exitDecl_assign(BotParser.Decl_assignContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link BotParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(BotParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(BotParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(BotParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(BotParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(BotParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(BotParser.TermContext ctx);
}