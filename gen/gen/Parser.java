// Generated from C:/Users/n_alb/IdeaProjects/AngularCompiler/src/grammer/Parser.g4 by ANTLR 4.13.2
package gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, ELSE=2, FOR=3, DO=4, WHILE=5, FUNCTION=6, RETURN=7, FOREACH=8, ARROW=9, 
		TYPE=10, VARIABLE_TYPE=11, PLUS=12, MINUS=13, TIMES=14, DIVIDE=15, EQUAL=16, 
		EQUAL_EQUAL=17, NOT_EQUAL=18, GREATER=19, GREATER_EQUAL=20, LESS=21, LESS_EQUAL=22, 
		INCREMENT=23, DECREMENT=24, MUL_ASSIGN=25, DIV_ASSIGN=26, MOD_ASSIGN=27, 
		LPAREN=28, RPAREN=29, LBRACKET=30, RBRACKET=31, SEMICOLON=32, COMMA=33, 
		COLON=34, DOT=35, IMPORT=36, EXPORT=37, FROM=38, AND=39, OR=40, IDENTIFIER=41, 
		NUMBER=42, STRING=43, BOOLEAN=44, WHITESPACE=45, COMMENT=46, BLOCK_COMMENT=47, 
		CLASS=48, LBRACE=49, RBRACE=50;
	public static final int
		RULE_program = 0, RULE_line = 1, RULE_statement = 2, RULE_iterationStatement = 3, 
		RULE_declaration = 4, RULE_expressionStatement = 5, RULE_classDeclaration = 6, 
		RULE_variableDeclaration = 7, RULE_functionDeclaration = 8, RULE_parameters = 9, 
		RULE_ifStatement = 10, RULE_forStatement = 11, RULE_forEachStatement = 12, 
		RULE_block = 13, RULE_importStatement = 14, RULE_initializationExpression = 15, 
		RULE_iterationExpression = 16, RULE_whileStatement = 17, RULE_doWhileStatement = 18, 
		RULE_strictEqualityExpression = 19, RULE_returnStatement = 20, RULE_expression = 21, 
		RULE_arrayDeclaration = 22, RULE_arrayElements = 23, RULE_arrayMethodCall = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "line", "statement", "iterationStatement", "declaration", 
			"expressionStatement", "classDeclaration", "variableDeclaration", "functionDeclaration", 
			"parameters", "ifStatement", "forStatement", "forEachStatement", "block", 
			"importStatement", "initializationExpression", "iterationExpression", 
			"whileStatement", "doWhileStatement", "strictEqualityExpression", "returnStatement", 
			"expression", "arrayDeclaration", "arrayElements", "arrayMethodCall"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'else'", "'for'", "'do'", "'while'", "'function'", "'return'", 
			"'forEach'", "'=>'", null, null, "'+'", "'-'", "'*'", "'/'", "'='", "'=='", 
			"'!='", "'>'", "'>='", "'<'", "'<='", "'++'", "'--'", "'*='", "'/='", 
			"'%='", "'('", "')'", "'['", "']'", "';'", "','", "':'", "'.'", "'import'", 
			"'export'", "'from'", "'&&'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "ELSE", "FOR", "DO", "WHILE", "FUNCTION", "RETURN", "FOREACH", 
			"ARROW", "TYPE", "VARIABLE_TYPE", "PLUS", "MINUS", "TIMES", "DIVIDE", 
			"EQUAL", "EQUAL_EQUAL", "NOT_EQUAL", "GREATER", "GREATER_EQUAL", "LESS", 
			"LESS_EQUAL", "INCREMENT", "DECREMENT", "MUL_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN", 
			"LPAREN", "RPAREN", "LBRACKET", "RBRACKET", "SEMICOLON", "COMMA", "COLON", 
			"DOT", "IMPORT", "EXPORT", "FROM", "AND", "OR", "IDENTIFIER", "NUMBER", 
			"STRING", "BOOLEAN", "WHITESPACE", "COMMENT", "BLOCK_COMMENT", "CLASS", 
			"LBRACE", "RBRACE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "Parser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(51); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(50);
				line();
				}
				}
				setState(53); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 314666483976442L) != 0) );
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

	@SuppressWarnings("CheckReturnValue")
	public static class LineContext extends ParserRuleContext {
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
	 
		public LineContext() { }
		public void copyFrom(LineContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatemenContext extends LineContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatemenContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterStatemen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitStatemen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitStatemen(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportStateContext extends LineContext {
		public ImportStatementContext importStatement() {
			return getRuleContext(ImportStatementContext.class,0);
		}
		public ImportStateContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterImportState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitImportState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitImportState(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassContext extends LineContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public ClassContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		try {
			setState(58);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new ImportStateContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				importStatement();
				}
				break;
			case 2:
				_localctx = new ClassContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				classDeclaration();
				}
				break;
			case 3:
				_localctx = new StatemenContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(57);
				statement();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationStatementContext extends StatementContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public DeclarationStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpreContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpreContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterExpre(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitExpre(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitExpre(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IterationContext extends StatementContext {
		public IterationStatementContext iterationStatement() {
			return getRuleContext(IterationStatementContext.class,0);
		}
		public IterationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterIteration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitIteration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitIteration(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfContext extends StatementContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public IfContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionsContext extends StatementContext {
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public ExpressionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterExpressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitExpressions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitExpressions(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnContext extends StatementContext {
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public ReturnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitReturn(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayCallContext extends StatementContext {
		public ArrayMethodCallContext arrayMethodCall() {
			return getRuleContext(ArrayMethodCallContext.class,0);
		}
		public ArrayCallContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterArrayCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitArrayCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitArrayCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new IterationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				iterationStatement();
				}
				break;
			case 2:
				_localctx = new DeclarationStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				declaration();
				}
				break;
			case 3:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
				ifStatement();
				}
				break;
			case 4:
				_localctx = new ReturnContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(63);
				returnStatement();
				}
				break;
			case 5:
				_localctx = new ExpreContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(64);
				expression(0);
				}
				break;
			case 6:
				_localctx = new ExpressionsContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(65);
				expressionStatement();
				}
				break;
			case 7:
				_localctx = new ArrayCallContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(66);
				arrayMethodCall();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class IterationStatementContext extends ParserRuleContext {
		public IterationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationStatement; }
	 
		public IterationStatementContext() { }
		public void copyFrom(IterationStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DowhileContext extends IterationStatementContext {
		public DoWhileStatementContext doWhileStatement() {
			return getRuleContext(DoWhileStatementContext.class,0);
		}
		public DowhileContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterDowhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitDowhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitDowhile(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForEachContext extends IterationStatementContext {
		public ForEachStatementContext forEachStatement() {
			return getRuleContext(ForEachStatementContext.class,0);
		}
		public ForEachContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterForEach(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitForEach(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitForEach(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForContext extends IterationStatementContext {
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public ForContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitFor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileContext extends IterationStatementContext {
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public WhileContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterationStatementContext iterationStatement() throws RecognitionException {
		IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_iterationStatement);
		try {
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DO:
				_localctx = new DowhileContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				doWhileStatement();
				}
				break;
			case IDENTIFIER:
				_localctx = new ForEachContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				forEachStatement();
				}
				break;
			case FOR:
				_localctx = new ForContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(71);
				forStatement();
				}
				break;
			case WHILE:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(72);
				whileStatement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	 
		public DeclarationContext() { }
		public void copyFrom(DeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayContext extends DeclarationContext {
		public ArrayDeclarationContext arrayDeclaration() {
			return getRuleContext(ArrayDeclarationContext.class,0);
		}
		public ArrayContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends DeclarationContext {
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public FunctionContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableContext extends DeclarationContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public VariableContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaration);
		try {
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new VariableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				variableDeclaration();
				}
				break;
			case 2:
				_localctx = new FunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				functionDeclaration();
				}
				break;
			case 3:
				_localctx = new ArrayContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(77);
				arrayDeclaration();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStatementContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(Parser.SEMICOLON, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(Parser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Parser.IDENTIFIER, i);
		}
		public TerminalNode EQUAL() { return getToken(Parser.EQUAL, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(Parser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(Parser.MINUS, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(Parser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(Parser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(Parser.MOD_ASSIGN, 0); }
		public TerminalNode INCREMENT() { return getToken(Parser.INCREMENT, 0); }
		public TerminalNode DECREMENT() { return getToken(Parser.DECREMENT, 0); }
		public TerminalNode LPAREN() { return getToken(Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Parser.RPAREN, 0); }
		public TerminalNode NUMBER() { return getToken(Parser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(Parser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(Parser.BOOLEAN, 0); }
		public List<TerminalNode> DOT() { return getTokens(Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(Parser.DOT, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parser.COMMA, i);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expressionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(80);
				match(IDENTIFIER);
				setState(81);
				match(EQUAL);
				setState(82);
				expression(0);
				}
				break;
			case 2:
				{
				setState(83);
				match(IDENTIFIER);
				setState(84);
				match(PLUS);
				setState(85);
				match(EQUAL);
				setState(86);
				expression(0);
				}
				break;
			case 3:
				{
				setState(87);
				match(IDENTIFIER);
				setState(88);
				match(MINUS);
				setState(89);
				match(EQUAL);
				setState(90);
				expression(0);
				}
				break;
			case 4:
				{
				setState(91);
				match(IDENTIFIER);
				setState(92);
				match(MUL_ASSIGN);
				setState(93);
				expression(0);
				}
				break;
			case 5:
				{
				setState(94);
				match(IDENTIFIER);
				setState(95);
				match(DIV_ASSIGN);
				setState(96);
				expression(0);
				}
				break;
			case 6:
				{
				setState(97);
				match(IDENTIFIER);
				setState(98);
				match(MOD_ASSIGN);
				setState(99);
				expression(0);
				}
				break;
			case 7:
				{
				setState(100);
				match(IDENTIFIER);
				setState(101);
				match(INCREMENT);
				}
				break;
			case 8:
				{
				setState(102);
				match(IDENTIFIER);
				setState(103);
				match(DECREMENT);
				}
				break;
			case 9:
				{
				setState(104);
				match(IDENTIFIER);
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(105);
					match(DOT);
					setState(106);
					match(IDENTIFIER);
					}
					}
					setState(111);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(112);
				match(LPAREN);
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 32985348833280L) != 0)) {
					{
					setState(113);
					expression(0);
					setState(118);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(114);
						match(COMMA);
						setState(115);
						expression(0);
						}
						}
						setState(120);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(123);
				match(RPAREN);
				}
				break;
			case 10:
				{
				setState(124);
				match(IDENTIFIER);
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(125);
					match(DOT);
					setState(126);
					match(IDENTIFIER);
					}
					}
					setState(131);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 11:
				{
				setState(132);
				match(NUMBER);
				}
				break;
			case 12:
				{
				setState(133);
				match(STRING);
				}
				break;
			case 13:
				{
				setState(134);
				match(BOOLEAN);
				}
				break;
			}
			setState(137);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(Parser.CLASS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(Parser.IDENTIFIER, 0); }
		public TerminalNode LBRACE() { return getToken(Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Parser.RBRACE, 0); }
		public TerminalNode EXPORT() { return getToken(Parser.EXPORT, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPORT) {
				{
				setState(139);
				match(EXPORT);
				}
			}

			setState(142);
			match(CLASS);
			setState(143);
			match(IDENTIFIER);
			setState(144);
			match(LBRACE);
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 137438955584L) != 0)) {
				{
				{
				setState(145);
				declaration();
				}
				}
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(151);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationContext extends ParserRuleContext {
		public TerminalNode VARIABLE_TYPE() { return getToken(Parser.VARIABLE_TYPE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(Parser.IDENTIFIER, 0); }
		public TerminalNode EQUAL() { return getToken(Parser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(Parser.SEMICOLON, 0); }
		public TerminalNode EXPORT() { return getToken(Parser.EXPORT, 0); }
		public TerminalNode COLON() { return getToken(Parser.COLON, 0); }
		public TerminalNode TYPE() { return getToken(Parser.TYPE, 0); }
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPORT) {
				{
				setState(153);
				match(EXPORT);
				}
			}

			setState(156);
			match(VARIABLE_TYPE);
			setState(157);
			match(IDENTIFIER);
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(158);
				match(COLON);
				setState(159);
				match(TYPE);
				}
			}

			setState(162);
			match(EQUAL);
			setState(163);
			expression(0);
			setState(164);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(Parser.FUNCTION, 0); }
		public TerminalNode IDENTIFIER() { return getToken(Parser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(Parser.LPAREN, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Parser.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(Parser.COLON, 0); }
		public TerminalNode TYPE() { return getToken(Parser.TYPE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_functionDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(FUNCTION);
			setState(167);
			match(IDENTIFIER);
			setState(168);
			match(LPAREN);
			setState(169);
			parameters();
			setState(170);
			match(RPAREN);
			setState(171);
			match(COLON);
			setState(172);
			match(TYPE);
			setState(173);
			block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParametersContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(Parser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Parser.IDENTIFIER, i);
		}
		public List<TerminalNode> COLON() { return getTokens(Parser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(Parser.COLON, i);
		}
		public List<TerminalNode> TYPE() { return getTokens(Parser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(Parser.TYPE, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parser.COMMA, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_parameters);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(175);
				match(IDENTIFIER);
				setState(176);
				match(COLON);
				setState(177);
				match(TYPE);
				setState(184);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(178);
						match(COMMA);
						setState(179);
						match(IDENTIFIER);
						setState(180);
						match(COLON);
						setState(181);
						match(TYPE);
						}
						} 
					}
					setState(186);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(187);
					match(COMMA);
					}
				}

				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public List<TerminalNode> IF() { return getTokens(Parser.IF); }
		public TerminalNode IF(int i) {
			return getToken(Parser.IF, i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(Parser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(Parser.LPAREN, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(Parser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(Parser.RPAREN, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<TerminalNode> ELSE() { return getTokens(Parser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(Parser.ELSE, i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ifStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(IF);
			setState(193);
			match(LPAREN);
			setState(194);
			expression(0);
			setState(195);
			match(RPAREN);
			setState(196);
			block();
			setState(206);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(197);
					match(ELSE);
					setState(198);
					match(IF);
					setState(199);
					match(LPAREN);
					setState(200);
					expression(0);
					setState(201);
					match(RPAREN);
					setState(202);
					block();
					}
					} 
				}
				setState(208);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(209);
				match(ELSE);
				setState(210);
				block();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(Parser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(Parser.LPAREN, 0); }
		public InitializationExpressionContext initializationExpression() {
			return getRuleContext(InitializationExpressionContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(Parser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(Parser.SEMICOLON, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IterationExpressionContext iterationExpression() {
			return getRuleContext(IterationExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Parser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(FOR);
			setState(214);
			match(LPAREN);
			setState(215);
			initializationExpression();
			setState(216);
			match(SEMICOLON);
			setState(217);
			expression(0);
			setState(218);
			match(SEMICOLON);
			setState(219);
			iterationExpression();
			setState(220);
			match(RPAREN);
			setState(221);
			block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForEachStatementContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(Parser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Parser.IDENTIFIER, i);
		}
		public TerminalNode DOT() { return getToken(Parser.DOT, 0); }
		public TerminalNode FOREACH() { return getToken(Parser.FOREACH, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(Parser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(Parser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(Parser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(Parser.RPAREN, i);
		}
		public TerminalNode ARROW() { return getToken(Parser.ARROW, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForEachStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forEachStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterForEachStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitForEachStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitForEachStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForEachStatementContext forEachStatement() throws RecognitionException {
		ForEachStatementContext _localctx = new ForEachStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_forEachStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(IDENTIFIER);
			setState(224);
			match(DOT);
			setState(225);
			match(FOREACH);
			setState(226);
			match(LPAREN);
			setState(227);
			match(LPAREN);
			setState(228);
			match(IDENTIFIER);
			setState(229);
			match(RPAREN);
			setState(230);
			match(ARROW);
			setState(231);
			block();
			setState(232);
			match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Parser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(LBRACE);
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 33122787789050L) != 0)) {
				{
				{
				setState(235);
				statement();
				}
				}
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(241);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImportStatementContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(Parser.IMPORT, 0); }
		public TerminalNode FROM() { return getToken(Parser.FROM, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(Parser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Parser.IDENTIFIER, i);
		}
		public TerminalNode SEMICOLON() { return getToken(Parser.SEMICOLON, 0); }
		public TerminalNode LBRACE() { return getToken(Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Parser.RBRACE, 0); }
		public TerminalNode TIMES() { return getToken(Parser.TIMES, 0); }
		public List<TerminalNode> COMMA() { return getTokens(Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parser.COMMA, i);
		}
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_importStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(IMPORT);
			setState(258);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(244);
				match(LBRACE);
				setState(245);
				match(IDENTIFIER);
				setState(250);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(246);
						match(COMMA);
						setState(247);
						match(IDENTIFIER);
						}
						} 
					}
					setState(252);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				}
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(253);
					match(COMMA);
					}
				}

				setState(256);
				match(RBRACE);
				}
				break;
			case TIMES:
				{
				setState(257);
				match(TIMES);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(260);
			match(FROM);
			setState(261);
			match(IDENTIFIER);
			setState(262);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InitializationExpressionContext extends ParserRuleContext {
		public TerminalNode VARIABLE_TYPE() { return getToken(Parser.VARIABLE_TYPE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(Parser.IDENTIFIER, 0); }
		public TerminalNode EQUAL() { return getToken(Parser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InitializationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializationExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterInitializationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitInitializationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitInitializationExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializationExpressionContext initializationExpression() throws RecognitionException {
		InitializationExpressionContext _localctx = new InitializationExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_initializationExpression);
		try {
			setState(271);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				match(VARIABLE_TYPE);
				setState(265);
				match(IDENTIFIER);
				setState(266);
				match(EQUAL);
				setState(267);
				expression(0);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				match(IDENTIFIER);
				setState(269);
				match(EQUAL);
				setState(270);
				expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IterationExpressionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Parser.IDENTIFIER, 0); }
		public TerminalNode INCREMENT() { return getToken(Parser.INCREMENT, 0); }
		public TerminalNode DECREMENT() { return getToken(Parser.DECREMENT, 0); }
		public TerminalNode PLUS() { return getToken(Parser.PLUS, 0); }
		public TerminalNode EQUAL() { return getToken(Parser.EQUAL, 0); }
		public TerminalNode NUMBER() { return getToken(Parser.NUMBER, 0); }
		public TerminalNode MINUS() { return getToken(Parser.MINUS, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(Parser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(Parser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(Parser.MOD_ASSIGN, 0); }
		public IterationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterIterationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitIterationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitIterationExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterationExpressionContext iterationExpression() throws RecognitionException {
		IterationExpressionContext _localctx = new IterationExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_iterationExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(IDENTIFIER);
			setState(290);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INCREMENT:
				{
				setState(274);
				match(INCREMENT);
				}
				break;
			case DECREMENT:
				{
				setState(275);
				match(DECREMENT);
				}
				break;
			case PLUS:
			case MINUS:
			case MUL_ASSIGN:
			case DIV_ASSIGN:
			case MOD_ASSIGN:
				{
				setState(288);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(276);
					match(PLUS);
					setState(277);
					match(EQUAL);
					setState(278);
					match(NUMBER);
					}
					break;
				case MINUS:
					{
					setState(279);
					match(MINUS);
					setState(280);
					match(EQUAL);
					setState(281);
					match(NUMBER);
					}
					break;
				case MUL_ASSIGN:
					{
					setState(282);
					match(MUL_ASSIGN);
					setState(283);
					match(NUMBER);
					}
					break;
				case DIV_ASSIGN:
					{
					setState(284);
					match(DIV_ASSIGN);
					setState(285);
					match(NUMBER);
					}
					break;
				case MOD_ASSIGN:
					{
					setState(286);
					match(MOD_ASSIGN);
					setState(287);
					match(NUMBER);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(Parser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(Parser.LPAREN, 0); }
		public StrictEqualityExpressionContext strictEqualityExpression() {
			return getRuleContext(StrictEqualityExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Parser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(WHILE);
			setState(293);
			match(LPAREN);
			setState(294);
			strictEqualityExpression();
			setState(295);
			match(RPAREN);
			setState(296);
			block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DoWhileStatementContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(Parser.DO, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(Parser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(Parser.LPAREN, 0); }
		public StrictEqualityExpressionContext strictEqualityExpression() {
			return getRuleContext(StrictEqualityExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Parser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(Parser.SEMICOLON, 0); }
		public DoWhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterDoWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitDoWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitDoWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWhileStatementContext doWhileStatement() throws RecognitionException {
		DoWhileStatementContext _localctx = new DoWhileStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_doWhileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(DO);
			setState(299);
			block();
			setState(300);
			match(WHILE);
			setState(301);
			match(LPAREN);
			setState(302);
			strictEqualityExpression();
			setState(303);
			match(RPAREN);
			setState(304);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StrictEqualityExpressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQUAL_EQUAL() { return getToken(Parser.EQUAL_EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(Parser.NOT_EQUAL, 0); }
		public TerminalNode GREATER() { return getToken(Parser.GREATER, 0); }
		public TerminalNode GREATER_EQUAL() { return getToken(Parser.GREATER_EQUAL, 0); }
		public TerminalNode LESS() { return getToken(Parser.LESS, 0); }
		public TerminalNode LESS_EQUAL() { return getToken(Parser.LESS_EQUAL, 0); }
		public TerminalNode BOOLEAN() { return getToken(Parser.BOOLEAN, 0); }
		public StrictEqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strictEqualityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterStrictEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitStrictEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitStrictEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrictEqualityExpressionContext strictEqualityExpression() throws RecognitionException {
		StrictEqualityExpressionContext _localctx = new StrictEqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_strictEqualityExpression);
		try {
			setState(331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(306);
				expression(0);
				setState(307);
				match(EQUAL_EQUAL);
				setState(308);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(310);
				expression(0);
				setState(311);
				match(NOT_EQUAL);
				setState(312);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(314);
				expression(0);
				setState(315);
				match(GREATER);
				setState(316);
				expression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(318);
				expression(0);
				setState(319);
				match(GREATER_EQUAL);
				setState(320);
				expression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(322);
				expression(0);
				setState(323);
				match(LESS);
				setState(324);
				expression(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(326);
				expression(0);
				setState(327);
				match(LESS_EQUAL);
				setState(328);
				expression(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(330);
				match(BOOLEAN);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(Parser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(Parser.SEMICOLON, 0); }
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(RETURN);
			setState(334);
			expression(0);
			setState(335);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(Parser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Parser.IDENTIFIER, i);
		}
		public TerminalNode MUL_ASSIGN() { return getToken(Parser.MUL_ASSIGN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DIV_ASSIGN() { return getToken(Parser.DIV_ASSIGN, 0); }
		public TerminalNode LPAREN() { return getToken(Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Parser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parser.COMMA, i);
		}
		public TerminalNode INCREMENT() { return getToken(Parser.INCREMENT, 0); }
		public TerminalNode DECREMENT() { return getToken(Parser.DECREMENT, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(Parser.MOD_ASSIGN, 0); }
		public TerminalNode EQUAL() { return getToken(Parser.EQUAL, 0); }
		public TerminalNode PLUS() { return getToken(Parser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(Parser.MINUS, 0); }
		public TerminalNode EQUAL_EQUAL() { return getToken(Parser.EQUAL_EQUAL, 0); }
		public List<TerminalNode> DOT() { return getTokens(Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(Parser.DOT, i);
		}
		public TerminalNode LBRACKET() { return getToken(Parser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(Parser.RBRACKET, 0); }
		public TerminalNode NUMBER() { return getToken(Parser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(Parser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(Parser.BOOLEAN, 0); }
		public TerminalNode TIMES() { return getToken(Parser.TIMES, 0); }
		public TerminalNode DIVIDE() { return getToken(Parser.DIVIDE, 0); }
		public TerminalNode AND() { return getToken(Parser.AND, 0); }
		public TerminalNode OR() { return getToken(Parser.OR, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(Parser.NOT_EQUAL, 0); }
		public TerminalNode GREATER() { return getToken(Parser.GREATER, 0); }
		public TerminalNode GREATER_EQUAL() { return getToken(Parser.GREATER_EQUAL, 0); }
		public TerminalNode LESS() { return getToken(Parser.LESS, 0); }
		public TerminalNode LESS_EQUAL() { return getToken(Parser.LESS_EQUAL, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(338);
				match(IDENTIFIER);
				setState(339);
				match(MUL_ASSIGN);
				setState(340);
				expression(29);
				}
				break;
			case 2:
				{
				setState(341);
				match(IDENTIFIER);
				setState(342);
				match(DIV_ASSIGN);
				setState(343);
				expression(28);
				}
				break;
			case 3:
				{
				setState(344);
				match(IDENTIFIER);
				setState(345);
				match(LPAREN);
				setState(354);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 32985348833280L) != 0)) {
					{
					setState(346);
					expression(0);
					setState(351);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(347);
						match(COMMA);
						setState(348);
						expression(0);
						}
						}
						setState(353);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(356);
				match(RPAREN);
				}
				break;
			case 4:
				{
				setState(357);
				match(IDENTIFIER);
				setState(358);
				match(INCREMENT);
				}
				break;
			case 5:
				{
				setState(359);
				match(IDENTIFIER);
				setState(360);
				match(DECREMENT);
				}
				break;
			case 6:
				{
				setState(361);
				match(IDENTIFIER);
				setState(362);
				match(MUL_ASSIGN);
				setState(363);
				expression(15);
				}
				break;
			case 7:
				{
				setState(364);
				match(IDENTIFIER);
				setState(365);
				match(MOD_ASSIGN);
				setState(366);
				expression(14);
				}
				break;
			case 8:
				{
				setState(367);
				match(IDENTIFIER);
				setState(368);
				match(EQUAL);
				setState(369);
				expression(13);
				}
				break;
			case 9:
				{
				setState(370);
				match(IDENTIFIER);
				setState(371);
				match(PLUS);
				setState(372);
				match(EQUAL);
				setState(373);
				expression(12);
				}
				break;
			case 10:
				{
				setState(374);
				match(IDENTIFIER);
				setState(375);
				match(MINUS);
				setState(376);
				match(EQUAL);
				setState(377);
				expression(11);
				}
				break;
			case 11:
				{
				setState(378);
				match(IDENTIFIER);
				setState(379);
				match(DIV_ASSIGN);
				setState(380);
				expression(10);
				}
				break;
			case 12:
				{
				setState(381);
				match(IDENTIFIER);
				setState(382);
				match(MOD_ASSIGN);
				setState(383);
				expression(9);
				}
				break;
			case 13:
				{
				setState(384);
				match(IDENTIFIER);
				setState(385);
				match(PLUS);
				setState(386);
				expression(8);
				}
				break;
			case 14:
				{
				setState(387);
				match(IDENTIFIER);
				setState(388);
				match(MINUS);
				setState(389);
				expression(7);
				}
				break;
			case 15:
				{
				setState(390);
				match(IDENTIFIER);
				setState(391);
				match(EQUAL_EQUAL);
				setState(392);
				expression(6);
				}
				break;
			case 16:
				{
				setState(393);
				match(IDENTIFIER);
				setState(398);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(394);
						match(DOT);
						setState(395);
						match(IDENTIFIER);
						}
						} 
					}
					setState(400);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				}
				}
				break;
			case 17:
				{
				setState(401);
				match(IDENTIFIER);
				setState(402);
				match(LBRACKET);
				setState(403);
				expression(0);
				setState(404);
				match(RBRACKET);
				}
				break;
			case 18:
				{
				setState(406);
				match(NUMBER);
				}
				break;
			case 19:
				{
				setState(407);
				match(STRING);
				}
				break;
			case 20:
				{
				setState(408);
				match(BOOLEAN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(446);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(444);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(411);
						if (!(precpred(_ctx, 31))) throw new FailedPredicateException(this, "precpred(_ctx, 31)");
						setState(412);
						match(TIMES);
						setState(413);
						expression(32);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(414);
						if (!(precpred(_ctx, 30))) throw new FailedPredicateException(this, "precpred(_ctx, 30)");
						setState(415);
						match(DIVIDE);
						setState(416);
						expression(31);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(417);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(418);
						match(AND);
						setState(419);
						expression(27);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(420);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(421);
						match(OR);
						setState(422);
						expression(26);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(423);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(424);
						match(PLUS);
						setState(425);
						expression(25);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(426);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(427);
						match(MINUS);
						setState(428);
						expression(24);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(429);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(430);
						match(NOT_EQUAL);
						setState(431);
						expression(23);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(432);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(433);
						match(GREATER);
						setState(434);
						expression(22);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(435);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(436);
						match(GREATER_EQUAL);
						setState(437);
						expression(21);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(438);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(439);
						match(LESS);
						setState(440);
						expression(20);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(441);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(442);
						match(LESS_EQUAL);
						setState(443);
						expression(19);
						}
						break;
					}
					} 
				}
				setState(448);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayDeclarationContext extends ParserRuleContext {
		public TerminalNode VARIABLE_TYPE() { return getToken(Parser.VARIABLE_TYPE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(Parser.IDENTIFIER, 0); }
		public List<TerminalNode> LBRACKET() { return getTokens(Parser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(Parser.LBRACKET, i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(Parser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(Parser.RBRACKET, i);
		}
		public TerminalNode COLON() { return getToken(Parser.COLON, 0); }
		public TerminalNode TYPE() { return getToken(Parser.TYPE, 0); }
		public TerminalNode EQUAL() { return getToken(Parser.EQUAL, 0); }
		public TerminalNode SEMICOLON() { return getToken(Parser.SEMICOLON, 0); }
		public ArrayElementsContext arrayElements() {
			return getRuleContext(ArrayElementsContext.class,0);
		}
		public ArrayDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterArrayDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitArrayDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitArrayDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayDeclarationContext arrayDeclaration() throws RecognitionException {
		ArrayDeclarationContext _localctx = new ArrayDeclarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_arrayDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			match(VARIABLE_TYPE);
			setState(450);
			match(IDENTIFIER);
			setState(451);
			match(LBRACKET);
			setState(452);
			match(RBRACKET);
			setState(453);
			match(COLON);
			setState(454);
			match(TYPE);
			setState(455);
			match(EQUAL);
			setState(456);
			match(LBRACKET);
			setState(458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 32985348833280L) != 0)) {
				{
				setState(457);
				arrayElements();
				}
			}

			setState(460);
			match(RBRACKET);
			setState(461);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayElementsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parser.COMMA, i);
		}
		public ArrayElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterArrayElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitArrayElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitArrayElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayElementsContext arrayElements() throws RecognitionException {
		ArrayElementsContext _localctx = new ArrayElementsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_arrayElements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			expression(0);
			setState(468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(464);
				match(COMMA);
				setState(465);
				expression(0);
				}
				}
				setState(470);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayMethodCallContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(Parser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Parser.IDENTIFIER, i);
		}
		public TerminalNode DOT() { return getToken(Parser.DOT, 0); }
		public TerminalNode FOREACH() { return getToken(Parser.FOREACH, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(Parser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(Parser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(Parser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(Parser.RPAREN, i);
		}
		public TerminalNode ARROW() { return getToken(Parser.ARROW, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(Parser.SEMICOLON, 0); }
		public ArrayMethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayMethodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterArrayMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitArrayMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitArrayMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayMethodCallContext arrayMethodCall() throws RecognitionException {
		ArrayMethodCallContext _localctx = new ArrayMethodCallContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_arrayMethodCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			match(IDENTIFIER);
			setState(472);
			match(DOT);
			setState(473);
			match(FOREACH);
			setState(474);
			match(LPAREN);
			setState(475);
			match(LPAREN);
			setState(476);
			match(IDENTIFIER);
			setState(477);
			match(RPAREN);
			setState(478);
			match(ARROW);
			setState(479);
			block();
			setState(480);
			match(RPAREN);
			setState(481);
			match(SEMICOLON);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 21:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 31);
		case 1:
			return precpred(_ctx, 30);
		case 2:
			return precpred(_ctx, 26);
		case 3:
			return precpred(_ctx, 25);
		case 4:
			return precpred(_ctx, 24);
		case 5:
			return precpred(_ctx, 23);
		case 6:
			return precpred(_ctx, 22);
		case 7:
			return precpred(_ctx, 21);
		case 8:
			return precpred(_ctx, 20);
		case 9:
			return precpred(_ctx, 19);
		case 10:
			return precpred(_ctx, 18);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00012\u01e4\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0001\u0000\u0004\u00004\b\u0000\u000b\u0000\f\u00005\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001;\b\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002D\b"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003J\b"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004O\b\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0005\u0005l\b\u0005\n\u0005\f\u0005o\t"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005u\b"+
		"\u0005\n\u0005\f\u0005x\t\u0005\u0003\u0005z\b\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u0080\b\u0005\n\u0005\f\u0005"+
		"\u0083\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0088\b"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0003\u0006\u008d\b\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u0093\b\u0006\n"+
		"\u0006\f\u0006\u0096\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0003"+
		"\u0007\u009b\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u00a1\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u00b7\b\t\n"+
		"\t\f\t\u00ba\t\t\u0001\t\u0003\t\u00bd\b\t\u0003\t\u00bf\b\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0005\n\u00cd\b\n\n\n\f\n\u00d0\t\n\u0001\n\u0001\n\u0003\n"+
		"\u00d4\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0005\r\u00ed\b\r\n\r\f\r\u00f0\t\r\u0001\r\u0001\r"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e"+
		"\u00f9\b\u000e\n\u000e\f\u000e\u00fc\t\u000e\u0001\u000e\u0003\u000e\u00ff"+
		"\b\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0103\b\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0110\b\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0121\b\u0010\u0003\u0010"+
		"\u0123\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u014c\b\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u015e\b\u0015"+
		"\n\u0015\f\u0015\u0161\t\u0015\u0003\u0015\u0163\b\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u018d\b\u0015\n\u0015\f\u0015"+
		"\u0190\t\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u019a\b\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0005\u0015\u01bd\b\u0015\n\u0015\f\u0015\u01c0"+
		"\t\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u01cb\b\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0005"+
		"\u0017\u01d3\b\u0017\n\u0017\f\u0017\u01d6\t\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0000\u0001"+
		"*\u0019\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.0\u0000\u0000\u0225\u00003\u0001\u0000\u0000"+
		"\u0000\u0002:\u0001\u0000\u0000\u0000\u0004C\u0001\u0000\u0000\u0000\u0006"+
		"I\u0001\u0000\u0000\u0000\bN\u0001\u0000\u0000\u0000\n\u0087\u0001\u0000"+
		"\u0000\u0000\f\u008c\u0001\u0000\u0000\u0000\u000e\u009a\u0001\u0000\u0000"+
		"\u0000\u0010\u00a6\u0001\u0000\u0000\u0000\u0012\u00be\u0001\u0000\u0000"+
		"\u0000\u0014\u00c0\u0001\u0000\u0000\u0000\u0016\u00d5\u0001\u0000\u0000"+
		"\u0000\u0018\u00df\u0001\u0000\u0000\u0000\u001a\u00ea\u0001\u0000\u0000"+
		"\u0000\u001c\u00f3\u0001\u0000\u0000\u0000\u001e\u010f\u0001\u0000\u0000"+
		"\u0000 \u0111\u0001\u0000\u0000\u0000\"\u0124\u0001\u0000\u0000\u0000"+
		"$\u012a\u0001\u0000\u0000\u0000&\u014b\u0001\u0000\u0000\u0000(\u014d"+
		"\u0001\u0000\u0000\u0000*\u0199\u0001\u0000\u0000\u0000,\u01c1\u0001\u0000"+
		"\u0000\u0000.\u01cf\u0001\u0000\u0000\u00000\u01d7\u0001\u0000\u0000\u0000"+
		"24\u0003\u0002\u0001\u000032\u0001\u0000\u0000\u000045\u0001\u0000\u0000"+
		"\u000053\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u00006\u0001\u0001"+
		"\u0000\u0000\u00007;\u0003\u001c\u000e\u00008;\u0003\f\u0006\u00009;\u0003"+
		"\u0004\u0002\u0000:7\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000"+
		":9\u0001\u0000\u0000\u0000;\u0003\u0001\u0000\u0000\u0000<D\u0003\u0006"+
		"\u0003\u0000=D\u0003\b\u0004\u0000>D\u0003\u0014\n\u0000?D\u0003(\u0014"+
		"\u0000@D\u0003*\u0015\u0000AD\u0003\n\u0005\u0000BD\u00030\u0018\u0000"+
		"C<\u0001\u0000\u0000\u0000C=\u0001\u0000\u0000\u0000C>\u0001\u0000\u0000"+
		"\u0000C?\u0001\u0000\u0000\u0000C@\u0001\u0000\u0000\u0000CA\u0001\u0000"+
		"\u0000\u0000CB\u0001\u0000\u0000\u0000D\u0005\u0001\u0000\u0000\u0000"+
		"EJ\u0003$\u0012\u0000FJ\u0003\u0018\f\u0000GJ\u0003\u0016\u000b\u0000"+
		"HJ\u0003\"\u0011\u0000IE\u0001\u0000\u0000\u0000IF\u0001\u0000\u0000\u0000"+
		"IG\u0001\u0000\u0000\u0000IH\u0001\u0000\u0000\u0000J\u0007\u0001\u0000"+
		"\u0000\u0000KO\u0003\u000e\u0007\u0000LO\u0003\u0010\b\u0000MO\u0003,"+
		"\u0016\u0000NK\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000NM\u0001"+
		"\u0000\u0000\u0000O\t\u0001\u0000\u0000\u0000PQ\u0005)\u0000\u0000QR\u0005"+
		"\u0010\u0000\u0000R\u0088\u0003*\u0015\u0000ST\u0005)\u0000\u0000TU\u0005"+
		"\f\u0000\u0000UV\u0005\u0010\u0000\u0000V\u0088\u0003*\u0015\u0000WX\u0005"+
		")\u0000\u0000XY\u0005\r\u0000\u0000YZ\u0005\u0010\u0000\u0000Z\u0088\u0003"+
		"*\u0015\u0000[\\\u0005)\u0000\u0000\\]\u0005\u0019\u0000\u0000]\u0088"+
		"\u0003*\u0015\u0000^_\u0005)\u0000\u0000_`\u0005\u001a\u0000\u0000`\u0088"+
		"\u0003*\u0015\u0000ab\u0005)\u0000\u0000bc\u0005\u001b\u0000\u0000c\u0088"+
		"\u0003*\u0015\u0000de\u0005)\u0000\u0000e\u0088\u0005\u0017\u0000\u0000"+
		"fg\u0005)\u0000\u0000g\u0088\u0005\u0018\u0000\u0000hm\u0005)\u0000\u0000"+
		"ij\u0005#\u0000\u0000jl\u0005)\u0000\u0000ki\u0001\u0000\u0000\u0000l"+
		"o\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000"+
		"\u0000np\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000py\u0005\u001c"+
		"\u0000\u0000qv\u0003*\u0015\u0000rs\u0005!\u0000\u0000su\u0003*\u0015"+
		"\u0000tr\u0001\u0000\u0000\u0000ux\u0001\u0000\u0000\u0000vt\u0001\u0000"+
		"\u0000\u0000vw\u0001\u0000\u0000\u0000wz\u0001\u0000\u0000\u0000xv\u0001"+
		"\u0000\u0000\u0000yq\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000"+
		"z{\u0001\u0000\u0000\u0000{\u0088\u0005\u001d\u0000\u0000|\u0081\u0005"+
		")\u0000\u0000}~\u0005#\u0000\u0000~\u0080\u0005)\u0000\u0000\u007f}\u0001"+
		"\u0000\u0000\u0000\u0080\u0083\u0001\u0000\u0000\u0000\u0081\u007f\u0001"+
		"\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0088\u0001"+
		"\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0084\u0088\u0005"+
		"*\u0000\u0000\u0085\u0088\u0005+\u0000\u0000\u0086\u0088\u0005,\u0000"+
		"\u0000\u0087P\u0001\u0000\u0000\u0000\u0087S\u0001\u0000\u0000\u0000\u0087"+
		"W\u0001\u0000\u0000\u0000\u0087[\u0001\u0000\u0000\u0000\u0087^\u0001"+
		"\u0000\u0000\u0000\u0087a\u0001\u0000\u0000\u0000\u0087d\u0001\u0000\u0000"+
		"\u0000\u0087f\u0001\u0000\u0000\u0000\u0087h\u0001\u0000\u0000\u0000\u0087"+
		"|\u0001\u0000\u0000\u0000\u0087\u0084\u0001\u0000\u0000\u0000\u0087\u0085"+
		"\u0001\u0000\u0000\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0088\u0089"+
		"\u0001\u0000\u0000\u0000\u0089\u008a\u0005 \u0000\u0000\u008a\u000b\u0001"+
		"\u0000\u0000\u0000\u008b\u008d\u0005%\u0000\u0000\u008c\u008b\u0001\u0000"+
		"\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000"+
		"\u0000\u0000\u008e\u008f\u00050\u0000\u0000\u008f\u0090\u0005)\u0000\u0000"+
		"\u0090\u0094\u00051\u0000\u0000\u0091\u0093\u0003\b\u0004\u0000\u0092"+
		"\u0091\u0001\u0000\u0000\u0000\u0093\u0096\u0001\u0000\u0000\u0000\u0094"+
		"\u0092\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095"+
		"\u0097\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0097"+
		"\u0098\u00052\u0000\u0000\u0098\r\u0001\u0000\u0000\u0000\u0099\u009b"+
		"\u0005%\u0000\u0000\u009a\u0099\u0001\u0000\u0000\u0000\u009a\u009b\u0001"+
		"\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u009d\u0005"+
		"\u000b\u0000\u0000\u009d\u00a0\u0005)\u0000\u0000\u009e\u009f\u0005\""+
		"\u0000\u0000\u009f\u00a1\u0005\n\u0000\u0000\u00a0\u009e\u0001\u0000\u0000"+
		"\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a3\u0005\u0010\u0000\u0000\u00a3\u00a4\u0003*\u0015\u0000"+
		"\u00a4\u00a5\u0005 \u0000\u0000\u00a5\u000f\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a7\u0005\u0006\u0000\u0000\u00a7\u00a8\u0005)\u0000\u0000\u00a8\u00a9"+
		"\u0005\u001c\u0000\u0000\u00a9\u00aa\u0003\u0012\t\u0000\u00aa\u00ab\u0005"+
		"\u001d\u0000\u0000\u00ab\u00ac\u0005\"\u0000\u0000\u00ac\u00ad\u0005\n"+
		"\u0000\u0000\u00ad\u00ae\u0003\u001a\r\u0000\u00ae\u0011\u0001\u0000\u0000"+
		"\u0000\u00af\u00b0\u0005)\u0000\u0000\u00b0\u00b1\u0005\"\u0000\u0000"+
		"\u00b1\u00b8\u0005\n\u0000\u0000\u00b2\u00b3\u0005!\u0000\u0000\u00b3"+
		"\u00b4\u0005)\u0000\u0000\u00b4\u00b5\u0005\"\u0000\u0000\u00b5\u00b7"+
		"\u0005\n\u0000\u0000\u00b6\u00b2\u0001\u0000\u0000\u0000\u00b7\u00ba\u0001"+
		"\u0000\u0000\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001"+
		"\u0000\u0000\u0000\u00b9\u00bc\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001"+
		"\u0000\u0000\u0000\u00bb\u00bd\u0005!\u0000\u0000\u00bc\u00bb\u0001\u0000"+
		"\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd\u00bf\u0001\u0000"+
		"\u0000\u0000\u00be\u00af\u0001\u0000\u0000\u0000\u00be\u00bf\u0001\u0000"+
		"\u0000\u0000\u00bf\u0013\u0001\u0000\u0000\u0000\u00c0\u00c1\u0005\u0001"+
		"\u0000\u0000\u00c1\u00c2\u0005\u001c\u0000\u0000\u00c2\u00c3\u0003*\u0015"+
		"\u0000\u00c3\u00c4\u0005\u001d\u0000\u0000\u00c4\u00ce\u0003\u001a\r\u0000"+
		"\u00c5\u00c6\u0005\u0002\u0000\u0000\u00c6\u00c7\u0005\u0001\u0000\u0000"+
		"\u00c7\u00c8\u0005\u001c\u0000\u0000\u00c8\u00c9\u0003*\u0015\u0000\u00c9"+
		"\u00ca\u0005\u001d\u0000\u0000\u00ca\u00cb\u0003\u001a\r\u0000\u00cb\u00cd"+
		"\u0001\u0000\u0000\u0000\u00cc\u00c5\u0001\u0000\u0000\u0000\u00cd\u00d0"+
		"\u0001\u0000\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00ce\u00cf"+
		"\u0001\u0000\u0000\u0000\u00cf\u00d3\u0001\u0000\u0000\u0000\u00d0\u00ce"+
		"\u0001\u0000\u0000\u0000\u00d1\u00d2\u0005\u0002\u0000\u0000\u00d2\u00d4"+
		"\u0003\u001a\r\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001"+
		"\u0000\u0000\u0000\u00d4\u0015\u0001\u0000\u0000\u0000\u00d5\u00d6\u0005"+
		"\u0003\u0000\u0000\u00d6\u00d7\u0005\u001c\u0000\u0000\u00d7\u00d8\u0003"+
		"\u001e\u000f\u0000\u00d8\u00d9\u0005 \u0000\u0000\u00d9\u00da\u0003*\u0015"+
		"\u0000\u00da\u00db\u0005 \u0000\u0000\u00db\u00dc\u0003 \u0010\u0000\u00dc"+
		"\u00dd\u0005\u001d\u0000\u0000\u00dd\u00de\u0003\u001a\r\u0000\u00de\u0017"+
		"\u0001\u0000\u0000\u0000\u00df\u00e0\u0005)\u0000\u0000\u00e0\u00e1\u0005"+
		"#\u0000\u0000\u00e1\u00e2\u0005\b\u0000\u0000\u00e2\u00e3\u0005\u001c"+
		"\u0000\u0000\u00e3\u00e4\u0005\u001c\u0000\u0000\u00e4\u00e5\u0005)\u0000"+
		"\u0000\u00e5\u00e6\u0005\u001d\u0000\u0000\u00e6\u00e7\u0005\t\u0000\u0000"+
		"\u00e7\u00e8\u0003\u001a\r\u0000\u00e8\u00e9\u0005\u001d\u0000\u0000\u00e9"+
		"\u0019\u0001\u0000\u0000\u0000\u00ea\u00ee\u00051\u0000\u0000\u00eb\u00ed"+
		"\u0003\u0004\u0002\u0000\u00ec\u00eb\u0001\u0000\u0000\u0000\u00ed\u00f0"+
		"\u0001\u0000\u0000\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ee\u00ef"+
		"\u0001\u0000\u0000\u0000\u00ef\u00f1\u0001\u0000\u0000\u0000\u00f0\u00ee"+
		"\u0001\u0000\u0000\u0000\u00f1\u00f2\u00052\u0000\u0000\u00f2\u001b\u0001"+
		"\u0000\u0000\u0000\u00f3\u0102\u0005$\u0000\u0000\u00f4\u00f5\u00051\u0000"+
		"\u0000\u00f5\u00fa\u0005)\u0000\u0000\u00f6\u00f7\u0005!\u0000\u0000\u00f7"+
		"\u00f9\u0005)\u0000\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000\u00f9\u00fc"+
		"\u0001\u0000\u0000\u0000\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fa\u00fb"+
		"\u0001\u0000\u0000\u0000\u00fb\u00fe\u0001\u0000\u0000\u0000\u00fc\u00fa"+
		"\u0001\u0000\u0000\u0000\u00fd\u00ff\u0005!\u0000\u0000\u00fe\u00fd\u0001"+
		"\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff\u0100\u0001"+
		"\u0000\u0000\u0000\u0100\u0103\u00052\u0000\u0000\u0101\u0103\u0005\u000e"+
		"\u0000\u0000\u0102\u00f4\u0001\u0000\u0000\u0000\u0102\u0101\u0001\u0000"+
		"\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104\u0105\u0005&\u0000"+
		"\u0000\u0105\u0106\u0005)\u0000\u0000\u0106\u0107\u0005 \u0000\u0000\u0107"+
		"\u001d\u0001\u0000\u0000\u0000\u0108\u0109\u0005\u000b\u0000\u0000\u0109"+
		"\u010a\u0005)\u0000\u0000\u010a\u010b\u0005\u0010\u0000\u0000\u010b\u0110"+
		"\u0003*\u0015\u0000\u010c\u010d\u0005)\u0000\u0000\u010d\u010e\u0005\u0010"+
		"\u0000\u0000\u010e\u0110\u0003*\u0015\u0000\u010f\u0108\u0001\u0000\u0000"+
		"\u0000\u010f\u010c\u0001\u0000\u0000\u0000\u0110\u001f\u0001\u0000\u0000"+
		"\u0000\u0111\u0122\u0005)\u0000\u0000\u0112\u0123\u0005\u0017\u0000\u0000"+
		"\u0113\u0123\u0005\u0018\u0000\u0000\u0114\u0115\u0005\f\u0000\u0000\u0115"+
		"\u0116\u0005\u0010\u0000\u0000\u0116\u0121\u0005*\u0000\u0000\u0117\u0118"+
		"\u0005\r\u0000\u0000\u0118\u0119\u0005\u0010\u0000\u0000\u0119\u0121\u0005"+
		"*\u0000\u0000\u011a\u011b\u0005\u0019\u0000\u0000\u011b\u0121\u0005*\u0000"+
		"\u0000\u011c\u011d\u0005\u001a\u0000\u0000\u011d\u0121\u0005*\u0000\u0000"+
		"\u011e\u011f\u0005\u001b\u0000\u0000\u011f\u0121\u0005*\u0000\u0000\u0120"+
		"\u0114\u0001\u0000\u0000\u0000\u0120\u0117\u0001\u0000\u0000\u0000\u0120"+
		"\u011a\u0001\u0000\u0000\u0000\u0120\u011c\u0001\u0000\u0000\u0000\u0120"+
		"\u011e\u0001\u0000\u0000\u0000\u0121\u0123\u0001\u0000\u0000\u0000\u0122"+
		"\u0112\u0001\u0000\u0000\u0000\u0122\u0113\u0001\u0000\u0000\u0000\u0122"+
		"\u0120\u0001\u0000\u0000\u0000\u0123!\u0001\u0000\u0000\u0000\u0124\u0125"+
		"\u0005\u0005\u0000\u0000\u0125\u0126\u0005\u001c\u0000\u0000\u0126\u0127"+
		"\u0003&\u0013\u0000\u0127\u0128\u0005\u001d\u0000\u0000\u0128\u0129\u0003"+
		"\u001a\r\u0000\u0129#\u0001\u0000\u0000\u0000\u012a\u012b\u0005\u0004"+
		"\u0000\u0000\u012b\u012c\u0003\u001a\r\u0000\u012c\u012d\u0005\u0005\u0000"+
		"\u0000\u012d\u012e\u0005\u001c\u0000\u0000\u012e\u012f\u0003&\u0013\u0000"+
		"\u012f\u0130\u0005\u001d\u0000\u0000\u0130\u0131\u0005 \u0000\u0000\u0131"+
		"%\u0001\u0000\u0000\u0000\u0132\u0133\u0003*\u0015\u0000\u0133\u0134\u0005"+
		"\u0011\u0000\u0000\u0134\u0135\u0003*\u0015\u0000\u0135\u014c\u0001\u0000"+
		"\u0000\u0000\u0136\u0137\u0003*\u0015\u0000\u0137\u0138\u0005\u0012\u0000"+
		"\u0000\u0138\u0139\u0003*\u0015\u0000\u0139\u014c\u0001\u0000\u0000\u0000"+
		"\u013a\u013b\u0003*\u0015\u0000\u013b\u013c\u0005\u0013\u0000\u0000\u013c"+
		"\u013d\u0003*\u0015\u0000\u013d\u014c\u0001\u0000\u0000\u0000\u013e\u013f"+
		"\u0003*\u0015\u0000\u013f\u0140\u0005\u0014\u0000\u0000\u0140\u0141\u0003"+
		"*\u0015\u0000\u0141\u014c\u0001\u0000\u0000\u0000\u0142\u0143\u0003*\u0015"+
		"\u0000\u0143\u0144\u0005\u0015\u0000\u0000\u0144\u0145\u0003*\u0015\u0000"+
		"\u0145\u014c\u0001\u0000\u0000\u0000\u0146\u0147\u0003*\u0015\u0000\u0147"+
		"\u0148\u0005\u0016\u0000\u0000\u0148\u0149\u0003*\u0015\u0000\u0149\u014c"+
		"\u0001\u0000\u0000\u0000\u014a\u014c\u0005,\u0000\u0000\u014b\u0132\u0001"+
		"\u0000\u0000\u0000\u014b\u0136\u0001\u0000\u0000\u0000\u014b\u013a\u0001"+
		"\u0000\u0000\u0000\u014b\u013e\u0001\u0000\u0000\u0000\u014b\u0142\u0001"+
		"\u0000\u0000\u0000\u014b\u0146\u0001\u0000\u0000\u0000\u014b\u014a\u0001"+
		"\u0000\u0000\u0000\u014c\'\u0001\u0000\u0000\u0000\u014d\u014e\u0005\u0007"+
		"\u0000\u0000\u014e\u014f\u0003*\u0015\u0000\u014f\u0150\u0005 \u0000\u0000"+
		"\u0150)\u0001\u0000\u0000\u0000\u0151\u0152\u0006\u0015\uffff\uffff\u0000"+
		"\u0152\u0153\u0005)\u0000\u0000\u0153\u0154\u0005\u0019\u0000\u0000\u0154"+
		"\u019a\u0003*\u0015\u001d\u0155\u0156\u0005)\u0000\u0000\u0156\u0157\u0005"+
		"\u001a\u0000\u0000\u0157\u019a\u0003*\u0015\u001c\u0158\u0159\u0005)\u0000"+
		"\u0000\u0159\u0162\u0005\u001c\u0000\u0000\u015a\u015f\u0003*\u0015\u0000"+
		"\u015b\u015c\u0005!\u0000\u0000\u015c\u015e\u0003*\u0015\u0000\u015d\u015b"+
		"\u0001\u0000\u0000\u0000\u015e\u0161\u0001\u0000\u0000\u0000\u015f\u015d"+
		"\u0001\u0000\u0000\u0000\u015f\u0160\u0001\u0000\u0000\u0000\u0160\u0163"+
		"\u0001\u0000\u0000\u0000\u0161\u015f\u0001\u0000\u0000\u0000\u0162\u015a"+
		"\u0001\u0000\u0000\u0000\u0162\u0163\u0001\u0000\u0000\u0000\u0163\u0164"+
		"\u0001\u0000\u0000\u0000\u0164\u019a\u0005\u001d\u0000\u0000\u0165\u0166"+
		"\u0005)\u0000\u0000\u0166\u019a\u0005\u0017\u0000\u0000\u0167\u0168\u0005"+
		")\u0000\u0000\u0168\u019a\u0005\u0018\u0000\u0000\u0169\u016a\u0005)\u0000"+
		"\u0000\u016a\u016b\u0005\u0019\u0000\u0000\u016b\u019a\u0003*\u0015\u000f"+
		"\u016c\u016d\u0005)\u0000\u0000\u016d\u016e\u0005\u001b\u0000\u0000\u016e"+
		"\u019a\u0003*\u0015\u000e\u016f\u0170\u0005)\u0000\u0000\u0170\u0171\u0005"+
		"\u0010\u0000\u0000\u0171\u019a\u0003*\u0015\r\u0172\u0173\u0005)\u0000"+
		"\u0000\u0173\u0174\u0005\f\u0000\u0000\u0174\u0175\u0005\u0010\u0000\u0000"+
		"\u0175\u019a\u0003*\u0015\f\u0176\u0177\u0005)\u0000\u0000\u0177\u0178"+
		"\u0005\r\u0000\u0000\u0178\u0179\u0005\u0010\u0000\u0000\u0179\u019a\u0003"+
		"*\u0015\u000b\u017a\u017b\u0005)\u0000\u0000\u017b\u017c\u0005\u001a\u0000"+
		"\u0000\u017c\u019a\u0003*\u0015\n\u017d\u017e\u0005)\u0000\u0000\u017e"+
		"\u017f\u0005\u001b\u0000\u0000\u017f\u019a\u0003*\u0015\t\u0180\u0181"+
		"\u0005)\u0000\u0000\u0181\u0182\u0005\f\u0000\u0000\u0182\u019a\u0003"+
		"*\u0015\b\u0183\u0184\u0005)\u0000\u0000\u0184\u0185\u0005\r\u0000\u0000"+
		"\u0185\u019a\u0003*\u0015\u0007\u0186\u0187\u0005)\u0000\u0000\u0187\u0188"+
		"\u0005\u0011\u0000\u0000\u0188\u019a\u0003*\u0015\u0006\u0189\u018e\u0005"+
		")\u0000\u0000\u018a\u018b\u0005#\u0000\u0000\u018b\u018d\u0005)\u0000"+
		"\u0000\u018c\u018a\u0001\u0000\u0000\u0000\u018d\u0190\u0001\u0000\u0000"+
		"\u0000\u018e\u018c\u0001\u0000\u0000\u0000\u018e\u018f\u0001\u0000\u0000"+
		"\u0000\u018f\u019a\u0001\u0000\u0000\u0000\u0190\u018e\u0001\u0000\u0000"+
		"\u0000\u0191\u0192\u0005)\u0000\u0000\u0192\u0193\u0005\u001e\u0000\u0000"+
		"\u0193\u0194\u0003*\u0015\u0000\u0194\u0195\u0005\u001f\u0000\u0000\u0195"+
		"\u019a\u0001\u0000\u0000\u0000\u0196\u019a\u0005*\u0000\u0000\u0197\u019a"+
		"\u0005+\u0000\u0000\u0198\u019a\u0005,\u0000\u0000\u0199\u0151\u0001\u0000"+
		"\u0000\u0000\u0199\u0155\u0001\u0000\u0000\u0000\u0199\u0158\u0001\u0000"+
		"\u0000\u0000\u0199\u0165\u0001\u0000\u0000\u0000\u0199\u0167\u0001\u0000"+
		"\u0000\u0000\u0199\u0169\u0001\u0000\u0000\u0000\u0199\u016c\u0001\u0000"+
		"\u0000\u0000\u0199\u016f\u0001\u0000\u0000\u0000\u0199\u0172\u0001\u0000"+
		"\u0000\u0000\u0199\u0176\u0001\u0000\u0000\u0000\u0199\u017a\u0001\u0000"+
		"\u0000\u0000\u0199\u017d\u0001\u0000\u0000\u0000\u0199\u0180\u0001\u0000"+
		"\u0000\u0000\u0199\u0183\u0001\u0000\u0000\u0000\u0199\u0186\u0001\u0000"+
		"\u0000\u0000\u0199\u0189\u0001\u0000\u0000\u0000\u0199\u0191\u0001\u0000"+
		"\u0000\u0000\u0199\u0196\u0001\u0000\u0000\u0000\u0199\u0197\u0001\u0000"+
		"\u0000\u0000\u0199\u0198\u0001\u0000\u0000\u0000\u019a\u01be\u0001\u0000"+
		"\u0000\u0000\u019b\u019c\n\u001f\u0000\u0000\u019c\u019d\u0005\u000e\u0000"+
		"\u0000\u019d\u01bd\u0003*\u0015 \u019e\u019f\n\u001e\u0000\u0000\u019f"+
		"\u01a0\u0005\u000f\u0000\u0000\u01a0\u01bd\u0003*\u0015\u001f\u01a1\u01a2"+
		"\n\u001a\u0000\u0000\u01a2\u01a3\u0005\'\u0000\u0000\u01a3\u01bd\u0003"+
		"*\u0015\u001b\u01a4\u01a5\n\u0019\u0000\u0000\u01a5\u01a6\u0005(\u0000"+
		"\u0000\u01a6\u01bd\u0003*\u0015\u001a\u01a7\u01a8\n\u0018\u0000\u0000"+
		"\u01a8\u01a9\u0005\f\u0000\u0000\u01a9\u01bd\u0003*\u0015\u0019\u01aa"+
		"\u01ab\n\u0017\u0000\u0000\u01ab\u01ac\u0005\r\u0000\u0000\u01ac\u01bd"+
		"\u0003*\u0015\u0018\u01ad\u01ae\n\u0016\u0000\u0000\u01ae\u01af\u0005"+
		"\u0012\u0000\u0000\u01af\u01bd\u0003*\u0015\u0017\u01b0\u01b1\n\u0015"+
		"\u0000\u0000\u01b1\u01b2\u0005\u0013\u0000\u0000\u01b2\u01bd\u0003*\u0015"+
		"\u0016\u01b3\u01b4\n\u0014\u0000\u0000\u01b4\u01b5\u0005\u0014\u0000\u0000"+
		"\u01b5\u01bd\u0003*\u0015\u0015\u01b6\u01b7\n\u0013\u0000\u0000\u01b7"+
		"\u01b8\u0005\u0015\u0000\u0000\u01b8\u01bd\u0003*\u0015\u0014\u01b9\u01ba"+
		"\n\u0012\u0000\u0000\u01ba\u01bb\u0005\u0016\u0000\u0000\u01bb\u01bd\u0003"+
		"*\u0015\u0013\u01bc\u019b\u0001\u0000\u0000\u0000\u01bc\u019e\u0001\u0000"+
		"\u0000\u0000\u01bc\u01a1\u0001\u0000\u0000\u0000\u01bc\u01a4\u0001\u0000"+
		"\u0000\u0000\u01bc\u01a7\u0001\u0000\u0000\u0000\u01bc\u01aa\u0001\u0000"+
		"\u0000\u0000\u01bc\u01ad\u0001\u0000\u0000\u0000\u01bc\u01b0\u0001\u0000"+
		"\u0000\u0000\u01bc\u01b3\u0001\u0000\u0000\u0000\u01bc\u01b6\u0001\u0000"+
		"\u0000\u0000\u01bc\u01b9\u0001\u0000\u0000\u0000\u01bd\u01c0\u0001\u0000"+
		"\u0000\u0000\u01be\u01bc\u0001\u0000\u0000\u0000\u01be\u01bf\u0001\u0000"+
		"\u0000\u0000\u01bf+\u0001\u0000\u0000\u0000\u01c0\u01be\u0001\u0000\u0000"+
		"\u0000\u01c1\u01c2\u0005\u000b\u0000\u0000\u01c2\u01c3\u0005)\u0000\u0000"+
		"\u01c3\u01c4\u0005\u001e\u0000\u0000\u01c4\u01c5\u0005\u001f\u0000\u0000"+
		"\u01c5\u01c6\u0005\"\u0000\u0000\u01c6\u01c7\u0005\n\u0000\u0000\u01c7"+
		"\u01c8\u0005\u0010\u0000\u0000\u01c8\u01ca\u0005\u001e\u0000\u0000\u01c9"+
		"\u01cb\u0003.\u0017\u0000\u01ca\u01c9\u0001\u0000\u0000\u0000\u01ca\u01cb"+
		"\u0001\u0000\u0000\u0000\u01cb\u01cc\u0001\u0000\u0000\u0000\u01cc\u01cd"+
		"\u0005\u001f\u0000\u0000\u01cd\u01ce\u0005 \u0000\u0000\u01ce-\u0001\u0000"+
		"\u0000\u0000\u01cf\u01d4\u0003*\u0015\u0000\u01d0\u01d1\u0005!\u0000\u0000"+
		"\u01d1\u01d3\u0003*\u0015\u0000\u01d2\u01d0\u0001\u0000\u0000\u0000\u01d3"+
		"\u01d6\u0001\u0000\u0000\u0000\u01d4\u01d2\u0001\u0000\u0000\u0000\u01d4"+
		"\u01d5\u0001\u0000\u0000\u0000\u01d5/\u0001\u0000\u0000\u0000\u01d6\u01d4"+
		"\u0001\u0000\u0000\u0000\u01d7\u01d8\u0005)\u0000\u0000\u01d8\u01d9\u0005"+
		"#\u0000\u0000\u01d9\u01da\u0005\b\u0000\u0000\u01da\u01db\u0005\u001c"+
		"\u0000\u0000\u01db\u01dc\u0005\u001c\u0000\u0000\u01dc\u01dd\u0005)\u0000"+
		"\u0000\u01dd\u01de\u0005\u001d\u0000\u0000\u01de\u01df\u0005\t\u0000\u0000"+
		"\u01df\u01e0\u0003\u001a\r\u0000\u01e0\u01e1\u0005\u001d\u0000\u0000\u01e1"+
		"\u01e2\u0005 \u0000\u0000\u01e21\u0001\u0000\u0000\u0000#5:CINmvy\u0081"+
		"\u0087\u008c\u0094\u009a\u00a0\u00b8\u00bc\u00be\u00ce\u00d3\u00ee\u00fa"+
		"\u00fe\u0102\u010f\u0120\u0122\u014b\u015f\u0162\u018e\u0199\u01bc\u01be"+
		"\u01ca\u01d4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}