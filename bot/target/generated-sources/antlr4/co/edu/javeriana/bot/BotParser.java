// Generated from co/edu/javeriana/bot/Bot.g4 by ANTLR 4.5.1
package co.edu.javeriana.bot;


import org.jpavlich.bot.*;
import java.util.Map;
import java.util.HashMap;


import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BotParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FUNCTION=1, LET=2, PRINTLN=3, UP=4, DOWN=5, RIGHT=6, LEFT=7, PICK=8, DROP=9, 
		LOOK=10, NUMERO=11, BOOL=12, STRING=13, ID=14, BEGIN=15, END=16, IF=17, 
		ELSE=18, WHILE=19, GT=20, LT=21, ENTRE=22, EQ=23, GEQ=24, LEQ=25, NEQ=26, 
		AND=27, OR=28, NOT=29, MAS=30, MENOS=31, MULT=32, DIV=33, ASSIGN=34, READ=35, 
		WRITELN=36, SEMICOLON=37, PAR_OPEN=38, PAR_CLOSE=39, BRACKET_OPEN=40, 
		BRACKET_CLOSE=41, WRITE=42, WS=43;
	public static final int
		RULE_function = 0, RULE_sentence = 1, RULE_up = 2, RULE_down = 3, RULE_left = 4, 
		RULE_right = 5, RULE_pick = 6, RULE_drop = 7, RULE_expression = 8, RULE_term = 9;
	public static final String[] ruleNames = {
		"function", "sentence", "up", "down", "left", "right", "pick", "drop", 
		"expression", "term"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'function'", "'let'", "'println'", "'up'", "'down'", "'right'", 
		"'left'", "'pick'", "'drop'", "'look'", null, null, null, null, "'begin'", 
		"'end'", "'if'", "'else'", "'while'", "'>'", "'<'", "'<>'", "'=='", "'>='", 
		"'<='", "'!='", "'and'", "'or'", "'not'", "'+'", "'-'", "'*'", "'/'", 
		"'='", "'read'", "'writeln'", "';'", "'('", "')'", "'{'", "'}'", "'write'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "FUNCTION", "LET", "PRINTLN", "UP", "DOWN", "RIGHT", "LEFT", "PICK", 
		"DROP", "LOOK", "NUMERO", "BOOL", "STRING", "ID", "BEGIN", "END", "IF", 
		"ELSE", "WHILE", "GT", "LT", "ENTRE", "EQ", "GEQ", "LEQ", "NEQ", "AND", 
		"OR", "NOT", "MAS", "MENOS", "MULT", "DIV", "ASSIGN", "READ", "WRITELN", 
		"SEMICOLON", "PAR_OPEN", "PAR_CLOSE", "BRACKET_OPEN", "BRACKET_CLOSE", 
		"WRITE", "WS"
	};
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
	public String getGrammarFileName() { return "Bot.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }



	private Bot bot;

	public BotParser(TokenStream input, Bot bot) {
	    this(input);
	    this.bot = bot;
	}
	Map<String, Object> symbolTable = new HashMap<String, Object>();

	public BotParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FunctionContext extends ParserRuleContext {
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotVisitor ) return ((BotVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UP) | (1L << DOWN) | (1L << RIGHT) | (1L << LEFT) | (1L << PICK) | (1L << DROP))) != 0)) {
				{
				{
				setState(20);
				sentence();
				}
				}
				setState(25);
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

	public static class SentenceContext extends ParserRuleContext {
		public UpContext up() {
			return getRuleContext(UpContext.class,0);
		}
		public DownContext down() {
			return getRuleContext(DownContext.class,0);
		}
		public LeftContext left() {
			return getRuleContext(LeftContext.class,0);
		}
		public RightContext right() {
			return getRuleContext(RightContext.class,0);
		}
		public DropContext drop() {
			return getRuleContext(DropContext.class,0);
		}
		public PickContext pick() {
			return getRuleContext(PickContext.class,0);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitSentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotVisitor ) return ((BotVisitor<? extends T>)visitor).visitSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentence);
		try {
			setState(32);
			switch (_input.LA(1)) {
			case UP:
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				up();
				}
				break;
			case DOWN:
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
				down();
				}
				break;
			case LEFT:
				enterOuterAlt(_localctx, 3);
				{
				setState(28);
				left();
				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 4);
				{
				setState(29);
				right();
				}
				break;
			case DROP:
				enterOuterAlt(_localctx, 5);
				{
				setState(30);
				drop();
				}
				break;
			case PICK:
				enterOuterAlt(_localctx, 6);
				{
				setState(31);
				pick();
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

	public static class UpContext extends ParserRuleContext {
		public ExpressionContext expression;
		public TerminalNode UP() { return getToken(BotParser.UP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(BotParser.SEMICOLON, 0); }
		public UpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_up; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterUp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitUp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotVisitor ) return ((BotVisitor<? extends T>)visitor).visitUp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpContext up() throws RecognitionException {
		UpContext _localctx = new UpContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_up);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(UP);
			setState(35);
			((UpContext)_localctx).expression = expression();
			setState(36);
			match(SEMICOLON);

					//symbolTable.put("up",((UpContext)_localctx).expression.value);
					bot.up(((UpContext)_localctx).expression.value);
					System.out.println("Subir");
				
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

	public static class DownContext extends ParserRuleContext {
		public ExpressionContext expression;
		public TerminalNode DOWN() { return getToken(BotParser.DOWN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(BotParser.SEMICOLON, 0); }
		public DownContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_down; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterDown(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitDown(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotVisitor ) return ((BotVisitor<? extends T>)visitor).visitDown(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DownContext down() throws RecognitionException {
		DownContext _localctx = new DownContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_down);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(DOWN);
			setState(40);
			((DownContext)_localctx).expression = expression();
			setState(41);
			match(SEMICOLON);

					//symbolTable.put("down",((DownContext)_localctx).expression.value);
					bot.down(((DownContext)_localctx).expression.value);
					System.out.println("Bajar");
				
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

	public static class LeftContext extends ParserRuleContext {
		public ExpressionContext expression;
		public TerminalNode LEFT() { return getToken(BotParser.LEFT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(BotParser.SEMICOLON, 0); }
		public LeftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_left; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterLeft(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitLeft(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotVisitor ) return ((BotVisitor<? extends T>)visitor).visitLeft(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeftContext left() throws RecognitionException {
		LeftContext _localctx = new LeftContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_left);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(LEFT);
			setState(45);
			((LeftContext)_localctx).expression = expression();
			setState(46);
			match(SEMICOLON);

					//symbolTable.put("left",((LeftContext)_localctx).expression.value);
					bot.left(((LeftContext)_localctx).expression.value);
					System.out.println("Izquierda");
				
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

	public static class RightContext extends ParserRuleContext {
		public ExpressionContext expression;
		public TerminalNode RIGHT() { return getToken(BotParser.RIGHT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(BotParser.SEMICOLON, 0); }
		public RightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_right; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterRight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitRight(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotVisitor ) return ((BotVisitor<? extends T>)visitor).visitRight(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RightContext right() throws RecognitionException {
		RightContext _localctx = new RightContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_right);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(RIGHT);
			setState(50);
			((RightContext)_localctx).expression = expression();
			setState(51);
			match(SEMICOLON);

					//symbolTable.put("right",((RightContext)_localctx).expression.value);
					bot.right(((RightContext)_localctx).expression.value);
					System.out.println("Derecha");
				
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

	public static class PickContext extends ParserRuleContext {
		public TerminalNode PICK() { return getToken(BotParser.PICK, 0); }
		public TerminalNode SEMICOLON() { return getToken(BotParser.SEMICOLON, 0); }
		public PickContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pick; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterPick(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitPick(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotVisitor ) return ((BotVisitor<? extends T>)visitor).visitPick(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PickContext pick() throws RecognitionException {
		PickContext _localctx = new PickContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_pick);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(PICK);
			setState(55);
			match(SEMICOLON);

					bot.pick();
					System.out.println("Tomar");
				
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

	public static class DropContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(BotParser.DROP, 0); }
		public TerminalNode SEMICOLON() { return getToken(BotParser.SEMICOLON, 0); }
		public DropContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterDrop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitDrop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotVisitor ) return ((BotVisitor<? extends T>)visitor).visitDrop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropContext drop() throws RecognitionException {
		DropContext _localctx = new DropContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_drop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(DROP);
			setState(59);
			match(SEMICOLON);

					bot.drop();
					System.out.println("Soltar");
				
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
		public int value;
		public TermContext t1;
		public TermContext t2;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> MAS() { return getTokens(BotParser.MAS); }
		public TerminalNode MAS(int i) {
			return getToken(BotParser.MAS, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotVisitor ) return ((BotVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			((ExpressionContext)_localctx).t1 = term();
			((ExpressionContext)_localctx).value =  (int)((ExpressionContext)_localctx).t1.value;
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MAS) {
				{
				{
				setState(64);
				match(MAS);
				setState(65);
				((ExpressionContext)_localctx).t2 = term();
				((ExpressionContext)_localctx).value =  (int)_localctx.value + (int)((ExpressionContext)_localctx).t2.value;
				}
				}
				setState(72);
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
		public int value;
		public Token NUMERO;
		public TerminalNode NUMERO() { return getToken(BotParser.NUMERO, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotVisitor ) return ((BotVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			((TermContext)_localctx).NUMERO = match(NUMERO);
			((TermContext)_localctx).value =  Integer.parseInt((((TermContext)_localctx).NUMERO!=null?((TermContext)_localctx).NUMERO.getText():null)); 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3-O\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3\2"+
		"\7\2\30\n\2\f\2\16\2\33\13\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3#\n\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\7\nG\n\n\f"+
		"\n\16\nJ\13\n\3\13\3\13\3\13\3\13\2\2\f\2\4\6\b\n\f\16\20\22\24\2\2K\2"+
		"\31\3\2\2\2\4\"\3\2\2\2\6$\3\2\2\2\b)\3\2\2\2\n.\3\2\2\2\f\63\3\2\2\2"+
		"\168\3\2\2\2\20<\3\2\2\2\22@\3\2\2\2\24K\3\2\2\2\26\30\5\4\3\2\27\26\3"+
		"\2\2\2\30\33\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32\3\3\2\2\2\33\31\3"+
		"\2\2\2\34#\5\6\4\2\35#\5\b\5\2\36#\5\n\6\2\37#\5\f\7\2 #\5\20\t\2!#\5"+
		"\16\b\2\"\34\3\2\2\2\"\35\3\2\2\2\"\36\3\2\2\2\"\37\3\2\2\2\" \3\2\2\2"+
		"\"!\3\2\2\2#\5\3\2\2\2$%\7\6\2\2%&\5\22\n\2&\'\7\'\2\2\'(\b\4\1\2(\7\3"+
		"\2\2\2)*\7\7\2\2*+\5\22\n\2+,\7\'\2\2,-\b\5\1\2-\t\3\2\2\2./\7\t\2\2/"+
		"\60\5\22\n\2\60\61\7\'\2\2\61\62\b\6\1\2\62\13\3\2\2\2\63\64\7\b\2\2\64"+
		"\65\5\22\n\2\65\66\7\'\2\2\66\67\b\7\1\2\67\r\3\2\2\289\7\n\2\29:\7\'"+
		"\2\2:;\b\b\1\2;\17\3\2\2\2<=\7\13\2\2=>\7\'\2\2>?\b\t\1\2?\21\3\2\2\2"+
		"@A\5\24\13\2AH\b\n\1\2BC\7 \2\2CD\5\24\13\2DE\b\n\1\2EG\3\2\2\2FB\3\2"+
		"\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2I\23\3\2\2\2JH\3\2\2\2KL\7\r\2\2LM\b"+
		"\13\1\2M\25\3\2\2\2\5\31\"H";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}