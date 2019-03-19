// Generated from co/edu/javeriana/bot/Bot.g4 by ANTLR 4.5.1
package co.edu.javeriana.bot;


import org.jpavlich.bot.*;


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
		PROGRAM=1, VAR=2, PRINTLN=3, IF=4, UP=5, DOWN=6, RIGHT=7, LEFT=8, PICK=9, 
		DROP=10, LOOK=11, VARIABLE=12, NUMBERS=13, BOOL=14, STRING=15, ID=16, 
		BEGIN=17, END=18, ELSE=19, WHILE=20, GT=21, LT=22, EQ=23, GEQ=24, LEQ=25, 
		NEQ=26, AND=27, PLUS=28, MINUS=29, MULT=30, DIV=31, ASSIGN=32, FUNCTION=33, 
		READ=34, WRITELN=35, SEMICOLON=36, PAR_OPEN=37, PAR_CLOSE=38, BRACKET_OPEN=39, 
		BRACKET_CLOSE=40, WRITE=41, WS=42;
	public static final int
		RULE_program = 0, RULE_sentence = 1, RULE_up = 2, RULE_down = 3, RULE_left = 4, 
		RULE_right = 5, RULE_drop = 6, RULE_pick = 7, RULE_expression = 8;
	public static final String[] ruleNames = {
		"program", "sentence", "up", "down", "left", "right", "drop", "pick", 
		"expression"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'program'", "'var'", "'println'", "'if'", "'up'", "'down'", "'right'", 
		"'left'", "'pick'", "'drop'", "'look'", "'let'", null, null, null, null, 
		"'begin'", "'end'", "'else'", "'while'", "'>'", "'<'", "'=='", "'>='", 
		"'<='", "'!='", "'and'", "'+'", "'-'", "'*'", "'/'", "'='", "'function'", 
		"'read'", "'writeln'", "';'", "'('", "')'", "'{'", "'}'", "'write'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PROGRAM", "VAR", "PRINTLN", "IF", "UP", "DOWN", "RIGHT", "LEFT", 
		"PICK", "DROP", "LOOK", "VARIABLE", "NUMBERS", "BOOL", "STRING", "ID", 
		"BEGIN", "END", "ELSE", "WHILE", "GT", "LT", "EQ", "GEQ", "LEQ", "NEQ", 
		"AND", "PLUS", "MINUS", "MULT", "DIV", "ASSIGN", "FUNCTION", "READ", "WRITELN", 
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


	public BotParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotVisitor ) return ((BotVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UP) | (1L << DOWN) | (1L << RIGHT) | (1L << LEFT) | (1L << PICK) | (1L << DROP))) != 0)) {
				{
				{
				setState(18);
				sentence();
				}
				}
				setState(23);
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
			setState(30);
			switch (_input.LA(1)) {
			case UP:
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				up();
				}
				break;
			case DOWN:
				enterOuterAlt(_localctx, 2);
				{
				setState(25);
				down();
				}
				break;
			case LEFT:
				enterOuterAlt(_localctx, 3);
				{
				setState(26);
				left();
				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 4);
				{
				setState(27);
				right();
				}
				break;
			case DROP:
				enterOuterAlt(_localctx, 5);
				{
				setState(28);
				drop();
				}
				break;
			case PICK:
				enterOuterAlt(_localctx, 6);
				{
				setState(29);
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
			setState(32);
			match(UP);
			setState(33);
			expression();
			setState(34);
			match(SEMICOLON);
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
			setState(37);
			match(DOWN);
			setState(38);
			expression();
			setState(39);
			match(SEMICOLON);
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
			setState(42);
			match(LEFT);
			setState(43);
			expression();
			setState(44);
			match(SEMICOLON);
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
			setState(47);
			match(RIGHT);
			setState(48);
			expression();
			setState(49);
			match(SEMICOLON);
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
		enterRule(_localctx, 12, RULE_drop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(DROP);
			setState(53);
			match(SEMICOLON);
			System.out.println("Agarrar");
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
		enterRule(_localctx, 14, RULE_pick);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(PICK);
			setState(57);
			match(SEMICOLON);
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

	public static class ExpressionContext extends ParserRuleContext {
		public Object value;
		public Token NUMBERS;
		public TerminalNode NUMBERS() { return getToken(BotParser.NUMBERS, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			((ExpressionContext)_localctx).NUMBERS = match(NUMBERS);
			((ExpressionContext)_localctx).value =  (((ExpressionContext)_localctx).NUMBERS!=null?((ExpressionContext)_localctx).NUMBERS.getText():null); 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3,B\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\7\2\26\n"+
		"\2\f\2\16\2\31\13\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3!\n\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\2\2\13\2\4\6\b\n\f\16\20\22\2"+
		"\2>\2\27\3\2\2\2\4 \3\2\2\2\6\"\3\2\2\2\b\'\3\2\2\2\n,\3\2\2\2\f\61\3"+
		"\2\2\2\16\66\3\2\2\2\20:\3\2\2\2\22>\3\2\2\2\24\26\5\4\3\2\25\24\3\2\2"+
		"\2\26\31\3\2\2\2\27\25\3\2\2\2\27\30\3\2\2\2\30\3\3\2\2\2\31\27\3\2\2"+
		"\2\32!\5\6\4\2\33!\5\b\5\2\34!\5\n\6\2\35!\5\f\7\2\36!\5\16\b\2\37!\5"+
		"\20\t\2 \32\3\2\2\2 \33\3\2\2\2 \34\3\2\2\2 \35\3\2\2\2 \36\3\2\2\2 \37"+
		"\3\2\2\2!\5\3\2\2\2\"#\7\7\2\2#$\5\22\n\2$%\7&\2\2%&\b\4\1\2&\7\3\2\2"+
		"\2\'(\7\b\2\2()\5\22\n\2)*\7&\2\2*+\b\5\1\2+\t\3\2\2\2,-\7\n\2\2-.\5\22"+
		"\n\2./\7&\2\2/\60\b\6\1\2\60\13\3\2\2\2\61\62\7\t\2\2\62\63\5\22\n\2\63"+
		"\64\7&\2\2\64\65\b\7\1\2\65\r\3\2\2\2\66\67\7\f\2\2\678\7&\2\289\b\b\1"+
		"\29\17\3\2\2\2:;\7\13\2\2;<\7&\2\2<=\b\t\1\2=\21\3\2\2\2>?\7\17\2\2?@"+
		"\b\n\1\2@\23\3\2\2\2\4\27 ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}