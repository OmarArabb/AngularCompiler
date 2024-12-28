// Generated from C:/Users/n_alb/IdeaProjects/AngularCompiler/src/grammer/TypeParser.g4 by ANTLR 4.13.2
package grammer;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class TypeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, ELSE=2, FOR=3, DO=4, WHILE=5, FUNCTION=6, RETURN=7, FOREACH=8, ARROW=9, 
		TYPE=10, VARIABLE_TYPE=11, PLUS=12, MINUS=13, TIMES=14, DIVIDE=15, EQUAL=16, 
		EQUAL_EQUAL=17, NOT_EQUAL=18, GREATER=19, GREATER_EQUAL=20, LESS=21, LESS_EQUAL=22, 
		INCREMENT=23, DECREMENT=24, PLUS_EQUAL=25, MINUS_EQUAL=26, MUL_ASSIGN=27, 
		DIV_ASSIGN=28, MOD_ASSIGN=29, LPAREN=30, RPAREN=31, LBRACKET=32, RBRACKET=33, 
		SEMICOLON=34, COMMA=35, COLON=36, DOT=37, IMPORT=38, EXPORT=39, FROM=40, 
		AND=41, OR=42, IDENTIFIER=43, NUMBER=44, STRING=45, BOOLEAN=46, WHITESPACE=47, 
		COMMENT=48, BLOCK_COMMENT=49, CLASS=50, LBRACE=51, RBRACE=52;
	public static final int
		RULE_program = 0, RULE_line = 1, RULE_statement = 2, RULE_iterationStatement = 3, 
		RULE_declaration = 4, RULE_expressionStatement = 5, RULE_classDeclaration = 6, 
		RULE_variableDeclaration = 7, RULE_functionDeclaration = 8, RULE_parameters = 9, 
		RULE_parameter = 10, RULE_ifStatement = 11, RULE_forStatement = 12, RULE_forEachStatement = 13, 
		RULE_block = 14, RULE_importStatement = 15, RULE_initializationExpression = 16, 
		RULE_iterationExpression = 17, RULE_whileStatement = 18, RULE_doWhileStatement = 19, 
		RULE_strictEqualityExpression = 20, RULE_returnStatement = 21, RULE_expression = 22, 
		RULE_arrayDeclaration = 23, RULE_arrayElements = 24, RULE_arrayMethodCall = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "line", "statement", "iterationStatement", "declaration", 
			"expressionStatement", "classDeclaration", "variableDeclaration", "functionDeclaration", 
			"parameters", "parameter", "ifStatement", "forStatement", "forEachStatement", 
			"block", "importStatement", "initializationExpression", "iterationExpression", 
			"whileStatement", "doWhileStatement", "strictEqualityExpression", "returnStatement", 
			"expression", "arrayDeclaration", "arrayElements", "arrayMethodCall"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'else'", "'for'", "'do'", "'while'", "'function'", "'return'", 
			"'forEach'", "'=>'", null, null, "'+'", "'-'", "'*'", "'/'", "'='", "'=='", 
			"'!='", "'>'", "'>='", "'<'", "'<='", "'++'", "'--'", "'+='", "'-='", 
			"'*='", "'/='", "'%='", "'('", "')'", "'['", "']'", "';'", "','", "':'", 
			"'.'", "'import'", "'export'", "'from'", "'&&'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "ELSE", "FOR", "DO", "WHILE", "FUNCTION", "RETURN", "FOREACH", 
			"ARROW", "TYPE", "VARIABLE_TYPE", "PLUS", "MINUS", "TIMES", "DIVIDE", 
			"EQUAL", "EQUAL_EQUAL", "NOT_EQUAL", "GREATER", "GREATER_EQUAL", "LESS", 
			"LESS_EQUAL", "INCREMENT", "DECREMENT", "PLUS_EQUAL", "MINUS_EQUAL", 
			"MUL_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN", "LPAREN", "RPAREN", "LBRACKET", 
			"RBRACKET", "SEMICOLON", "COMMA", "COLON", "DOT", "IMPORT", "EXPORT", 
			"FROM", "AND", "OR", "IDENTIFIER", "NUMBER", "STRING", "BOOLEAN", "WHITESPACE", 
			"COMMENT", "BLOCK_COMMENT", "CLASS", "LBRACE", "RBRACE"
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
	public String getGrammarFileName() { return "TypeParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TypeParser(TokenStream input) {
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
			if ( listener instanceof TypeParserListener ) ((TypeParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeParserListener ) ((TypeParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeParserVisitor ) return ((TypeParserVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(53); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(52);
				line();
				}
				}
				setState(55); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1258665935898874L) != 0) );
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
	public static class ImportStateContext extends LineContext {
		public ImportStatementContext importStatement() {
			return getRuleContext(ImportStatementContext.class,0);
		}
		public ImportStateContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeParserListener ) ((TypeParserListener)listener).enterImportState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeParserListener ) ((TypeParserListener)listener).exitImportState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeParserVisitor ) return ((TypeParserVisitor<? extends T>)visitor).visitImportState(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementtContext extends LineContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementtContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeParserListener ) ((TypeParserListener)listener).enterStatementt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeParserListener ) ((TypeParserListener)listener).exitStatementt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeParserVisitor ) return ((TypeParserVisitor<? extends T>)visitor).visitStatementt(this);
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
			if ( listener instanceof TypeParserListener ) ((TypeParserListener)listener).enterClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeParserListener ) ((TypeParserListener)listener).exitClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeParserVisitor ) return ((TypeParserVisitor<? extends T>)visitor).visitClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		try {
			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new ImportStateContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				importStatement();
				}
				break;
			case 2:
				_localctx = new ClassContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				classDeclaration();
				}
				break;
			case 3:
				_localctx = new StatementtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(59);
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
			if ( listener instanceof TypeParserListener ) ((TypeParserListener)listener).enterDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeParserListener ) ((TypeParserListener)listener).exitDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeParserVisitor ) return ((TypeParserVisitor<? extends T>)visitor).visitDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStateContext extends StatementContext {
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public ExpressionStateContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeParserListener ) ((TypeParserListener)listener).enterExpressionState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeParserListener ) ((TypeParserListener)listener).exitExpressionState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeParserVisitor ) return ((TypeParserVisitor<? extends T>)visitor).visitExpressionState(this);
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
			if ( listener instanceof TypeParserListener ) ((TypeParserListener)listener).enterIteration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeParserListener ) ((TypeParserListener)listener).exitIteration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeParserVisitor ) return ((TypeParserVisitor<? extends T>)visitor).visitIteration(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeParserListener ) ((TypeParserListener)listener).enterExpress(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeParserListener ) ((TypeParserListener)listener).exitExpress(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeParserVisitor ) return ((TypeParserVisitor<? extends T>)visitor).visitExpress(this);
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
			if ( listener instanceof TypeParserListener ) ((TypeParserListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeParserListener ) ((TypeParserListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeParserVisitor ) return ((TypeParserVisitor<? extends T>)visitor).visitIf(this);
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
			if ( listener instanceof TypeParserListener ) ((TypeParserListener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeParserListener ) ((TypeParserListener)listener).exitReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeParserVisitor ) return ((TypeParserVisitor<? extends T>)visitor).visitReturn(this);
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
			if ( listener instanceof TypeParserListener ) ((TypeParserListener)listener).enterArrayCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeParserListener ) ((TypeParserListener)listener).exitArrayCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeParserVisitor ) return ((TypeParserVisitor<? extends T>)visitor).visitArrayCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(69);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new IterationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				iterationStatement();
				}
				break;
			case 2:
				_localctx = new DeclarationStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				declaration();
				}
				break;
			case 3:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
				ifStatement();
				}
				break;
			case 4:
				_localctx = new ReturnContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(65);
				returnStatement();
				}
				break;
			case 5:
				_localctx = new ExpressContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(66);
				expression(0);
				}
				break;
			case 6:
				_localctx = new ExpressionStateContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(67);
				expressionStatement();
				}
				break;
			case 7:
				_localctx = new ArrayCallContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(68);
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
			if ( listener instanceof TypeParserListener ) ((TypeParserListener)listener).enterDowhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeParserListener ) ((TypeParserListener)listener).exitDowhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeParserVisitor ) return ((TypeParserVisitor<? extends T>)visitor).visitDowhile(this);
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
			if ( listener instanceof TypeParserListener ) ((TypeParserListener)listener).enterForEach(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeParserListener ) ((TypeParserListener)listener).exitForEach(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeParserVisitor ) return ((TypeParserVisitor<? extends T>)visitor).visitForEach(this);
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
			if ( listener instanceof TypeParserListener ) ((TypeParserListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeParserListener ) ((TypeParserListener)listener).exitFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeParserVisitor ) return ((TypeParserVisitor<? extends T>)visitor).visitFor(this);
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
			if ( listener instanceof TypeParserListener ) ((TypeParserListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeParserListener ) ((TypeParserListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeParserVisitor ) return ((TypeParserVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterationStatementContext iterationStatement() throws RecognitionException {
		IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_iterationStatement);
		try {
			setState(75);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DO:
				_localctx = new DowhileContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				doWhileStatement();
				}
				break;
			case IDENTIFIER:
				_localctx = new ForEachContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				forEachStatement();
				}
				break;
			case FOR:
				_localctx = new ForContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(73);
				forStatement();
				}
				break;
			case WHILE:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(74);
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
			if ( listener instanceof TypeParserListener ) ((TypeParserListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeParserListener ) ((TypeParserListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeParserVisitor ) return ((TypeParserVisitor<? extends T>)visitor).visitArray(this);
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
			if ( listener instanceof TypeParserListener ) ((TypeParserListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeParserListener ) ((TypeParserListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeParserVisitor ) return ((TypeParserVisitor<? extends T>)visitor).visitFunction(this);
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
			if ( listener instanceof TypeParserListener ) ((TypeParserListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeParserListener ) ((TypeParserListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeParserVisitor ) return ((TypeParserVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaration);
		try {
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE_TYPE:
			case EXPORT:
				_localctx = new VariableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				variableDeclaration();
				}
				break;
			case FUNCTION:
				_localctx = new FunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				functionDeclaration();
				}
				break;
			case IDENTIFIER:
				_localctx = new ArrayContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(79);
				arrayDeclaration();
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
	public static class ExpressionStatementContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(TypeParser.SEMICOLON, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(TypeParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(TypeParser.IDENTIFIER, i);
		}
		public TerminalNode EQUAL() { return getToken(TypeParser.EQUAL, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(TypeParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(TypeParser.MINUS, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(TypeParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(TypeParser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(TypeParser.MOD_ASSIGN, 0); }
		public TerminalNode INCREMENT() { return getToken(TypeParser.INCREMENT, 0); }
		public TerminalNode DECREMENT() { return getToken(TypeParser.DECREMENT, 0); }
		public TerminalNode LPAREN() { return getToken(TypeParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(TypeParser.RPAREN, 0); }
		public TerminalNode NUMBER() { return getToken(TypeParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(TypeParser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(TypeParser.BOOLEAN, 0); }
		public List<TerminalNode> DOT() { return getTokens(TypeParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(TypeParser.DOT, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TypeParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TypeParser.COMMA, i);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeParserListener ) ((TypeParserListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeParserListener ) ((TypeParserListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeParserVisitor ) return ((TypeParserVisitor<? extends T>)visitor).visitExpressionStatement(this);
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
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(82);
				match(IDENTIFIER);
				setState(83);
				match(EQUAL);
				setState(84);
				expression(0);
				}
				break;
			case 2:
				{
				setState(85);
				match(IDENTIFIER);
				setState(86);
				match(PLUS);
				setState(87);
				match(EQUAL);
				setState(88);
				expression(0);
				}
				break;
			case 3:
				{
				setState(89);
				match(IDENTIFIER);
				setState(90);
				match(MINUS);
				setState(91);
				match(EQUAL);
				setState(92);
				expression(0);
				}
				break;
			case 4:
				{
				setState(93);
				match(IDENTIFIER);
				setState(94);
				match(MUL_ASSIGN);
				setState(95);
				expression(0);
				}
				break;
			case 5:
				{
				setState(96);
				match(IDENTIFIER);
				setState(97);
				match(DIV_ASSIGN);
				setState(98);
				expression(0);
				}
				break;
			case 6:
				{
				setState(99);
				match(IDENTIFIER);
				setState(100);
				match(MOD_ASSIGN);
				setState(101);
				expression(0);
				}
				break;
			case 7:
				{
				setState(102);
				match(IDENTIFIER);
				setState(103);
				match(INCREMENT);
				}
				break;
			case 8:
				{
				setState(104);
				match(IDENTIFIER);
				setState(105);
				match(DECREMENT);
				}
				break;
			case 9:
				{
				setState(106);
				match(IDENTIFIER);
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(107);
					match(DOT);
					setState(108);
					match(IDENTIFIER);
					}
					}
					setState(113);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(114);
				match(LPAREN);
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 131941395333120L) != 0)) {
					{
					setState(115);
					expression(0);
					setState(120);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(116);
						match(COMMA);
						setState(117);
						expression(0);
						}
						}
						setState(122);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(125);
				match(RPAREN);
				}
				break;
			case 10:
				{
				setState(126);
				match(IDENTIFIER);
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(127);
					match(DOT);
					setState(128);
					match(IDENTIFIER);
					}
					}
					setState(133);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 11:
				{
				setState(134);
				match(NUMBER);
				}
				break;
			case 12:
				{
				setState(135);
				match(STRING);
				}
				break;
			case 13:
				{
				setState(136);
				match(BOOLEAN);
				}
				break;
			}
			setState(139);
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
		public TerminalNode CLASS() { return getToken(TypeParser.CLASS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(TypeParser.IDENTIFIER, 0); }
		public TerminalNode LBRACE() { return getToken(TypeParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(TypeParser.RBRACE, 0); }
		public TerminalNode EXPORT() { return getToken(TypeParser.EXPORT, 0); }
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
			if ( listener instanceof TypeParserListener ) ((TypeParserListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeParserListener ) ((TypeParserListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeParserVisitor ) return ((TypeParserVisitor<? extends T>)visitor).visitClassDeclaration(this);
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
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPORT) {
				{
				setState(141);
				match(EXPORT);
				}
			}

			setState(144);
			match(CLASS);
			setState(145);
			match(IDENTIFIER);
			setState(146);
			match(LBRACE);
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9345848838208L) != 0)) {
				{
				{
				setState(147);
				declaration();
				}
				}
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(153);
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
		public TerminalNode VARIABLE_TYPE() { return getToken(TypeParser.VARIABLE_TYPE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(TypeParser.IDENTIFIER, 0); }
		public TerminalNode EQUAL() { return getToken(TypeParser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(TypeParser.SEMICOLON, 0); }
		public TerminalNode EXPORT() { return getToken(TypeParser.EXPORT, 0); }
		public TerminalNode COLON() { return getToken(TypeParser.COLON, 0); }
		public TerminalNode TYPE() { return getToken(TypeParser.TYPE, 0); }
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeParserListener ) ((TypeParserListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeParserListener ) ((TypeParserListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeParserVisitor ) return ((TypeParserVisitor<? extends T>)visitor).visitVariableDeclaration(this);
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
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPORT) {
				{
				setState(155);
				match(EXPORT);
				}
			}

			setState(158);
			match(VARIABLE_TYPE);
			setState(159);
			match(IDENTIFIER);
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(160);
				match(COLON);
				setState(161);
				match(TYPE);
				}
			}

			setState(164);
			match(EQUAL);
			setState(165);
			expression(0);
			setState(166);
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
		public TerminalNode FUNCTION() { return getToken(TypeParser.FUNCTION, 0); }
		public TerminalNode IDENTIFIER() { return getToken(TypeParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(TypeParser.LPAREN, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(TypeParser.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(TypeParser.COLON, 0); }
		public TerminalNode TYPE() { return getToken(TypeParser.TYPE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeParserListener ) ((TypeParserListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeParserListener ) ((TypeParserListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeParserVisitor ) return ((TypeParserVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_functionDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(FUNCTION);
			setState(169);
			match(IDENTIFIER);
			setState(170);
			match(LPAREN);
			setState(171);
			parameters();
			setState(172);
			match(RPAREN);
			setState(173);
			match(COLON);
			setState(174);
			match(TYPE);
			setState(175);
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
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TypeParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TypeParser.COMMA, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeParserListener ) ((TypeParserListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeParserListener ) ((TypeParserListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeParserVisitor ) return ((TypeParserVisitor<? extends T>)visitor).visitParameters(this);
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
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(177);
				parameter();
				setState(182);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(178);
						match(COMMA);
						setState(179);
						parameter();
						}
						} 
					}
					setState(184);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(185);
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
	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TypeParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(TypeParser.COLON, 0); }
		public TerminalNode TYPE() { return getToken(TypeParser.TYPE, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeParserListener ) ((TypeParserListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeParserListener ) ((TypeParserListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeParserVisitor ) return ((TypeParserVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(IDENTIFIER);
			setState(191);
			match(COLON);
			setState(192);
			match(TYPE);
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
		public List<TerminalNode> IF() { return getTokens(TypeParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(TypeParser.IF, i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(TypeParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(TypeParser.LPAREN, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(TypeParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(TypeParser.RPAREN, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<TerminalNode> ELSE() { return getTokens(TypeParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(TypeParser.ELSE, i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeParserListener ) ((TypeParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeParserListener ) ((TypeParserListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeParserVisitor ) return ((TypeParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ifStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(IF);
			setState(195);
			match(LPAREN);
			setState(196);
			expression(0);
			setState(197);
			match(RPAREN);
			setState(198);
			block();
			setState(208);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(199);
					match(ELSE);
					setState(200);
					match(IF);
					setState(201);
					match(LPAREN);
					setState(202);
					expression(0);
					setState(203);
					match(RPAREN);
					setState(204);
					block();
					}
					} 
				}
				setState(210);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(211);
				match(ELSE);
				setState(212);
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
		public TerminalNode FOR() { return getToken(TypeParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(TypeParser.LPAREN, 0); }
		public InitializationExpressionContext initializationExpression() {
			return getRuleContext(InitializationExpressionContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(TypeParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(TypeParser.SEMICOLON, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IterationExpressionContext iterationExpression() {
			return getRuleContext(IterationExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(TypeParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeParserListener ) ((TypeParserListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeParserListener ) ((TypeParserListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeParserVisitor ) return ((TypeParserVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(FOR);
			setState(216);
			match(LPAREN);
			setState(217);
			initializationExpression();
			setState(218);
			match(SEMICOLON);
			setState(219);
			expression(0);
			setState(220);
			match(SEMICOLON);
			setState(221);
			iterationExpression();
			setState(222);
			match(RPAREN);
			setState(223);
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
		public List<TerminalNode> IDENTIFIER() { return getTokens(TypeParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(TypeParser.IDENTIFIER, i);
		}
		public TerminalNode DOT() { return getToken(TypeParser.DOT, 0); }
		public TerminalNode FOREACH() { return getToken(TypeParser.FOREACH, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(TypeParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(TypeParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(TypeParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(TypeParser.RPAREN, i);
		}
		public TerminalNode ARROW() { return getToken(TypeParser.ARROW, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForEachStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forEachStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeParserListener ) ((TypeParserListener)listener).enterForEachStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeParserListener ) ((TypeParserListener)listener).exitForEachStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeParserVisitor ) return ((TypeParserVisitor<? extends T>)visitor).visitForEachStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForEachStatementContext forEachStatement() throws RecognitionException {
		ForEachStatementContext _localctx = new ForEachStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_forEachStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(IDENTIFIER);
			setState(226);
			match(DOT);
			setState(227);
			match(FOREACH);
			setState(228);
			match(LPAREN);
			setState(229);
			match(LPAREN);
			setState(230);
			match(IDENTIFIER);
			setState(231);
			match(RPAREN);
			setState(232);
			match(ARROW);
			setState(233);
			block();
			setState(234);
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
		public TerminalNode LBRACE() { return getToken(TypeParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(TypeParser.RBRACE, 0); }
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
			if ( listener instanceof TypeParserListener ) ((TypeParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeParserListener ) ((TypeParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeParserVisitor ) return ((TypeParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(LBRACE);
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 132491151149306L) != 0)) {
				{
				{
				setState(237);
				statement();
				}
				}
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(243);
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
		public TerminalNode IMPORT() { return getToken(TypeParser.IMPORT, 0); }
		public TerminalNode FROM() { return getToken(TypeParser.FROM, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(TypeParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(TypeParser.IDENTIFIER, i);
		}
		public TerminalNode SEMICOLON() { return getToken(TypeParser.SEMICOLON, 0); }
		public TerminalNode LBRACE() { return getToken(TypeParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(TypeParser.RBRACE, 0); }
		public TerminalNode TIMES() { return getToken(TypeParser.TIMES, 0); }
		public List<TerminalNode> COMMA() { return getTokens(TypeParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TypeParser.COMMA, i);
		}
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeParserListener ) ((TypeParserListener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeParserListener ) ((TypeParserListener)listener).exitImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeParserVisitor ) return ((TypeParserVisitor<? extends T>)visitor).visitImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_importStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(IMPORT);
			setState(260);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(246);
				match(LBRACE);
				setState(247);
				match(IDENTIFIER);
				setState(252);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(248);
						match(COMMA);
						setState(249);
						match(IDENTIFIER);
						}
						} 
					}
					setState(254);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				}
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(255);
					match(COMMA);
					}
				}

				setState(258);
				match(RBRACE);
				}
				break;
			case TIMES:
				{
				setState(259);
				match(TIMES);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(262);
			match(FROM);
			setState(263);
			match(IDENTIFIER);
			setState(264);
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
		public TerminalNode VARIABLE_TYPE() { return getToken(TypeParser.VARIABLE_TYPE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(TypeParser.IDENTIFIER, 0); }
		public TerminalNode EQUAL() { return getToken(TypeParser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InitializationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializationExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeParserListener ) ((TypeParserListener)listener).enterInitializationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeParserListener ) ((TypeParserListener)listener).exitInitializationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeParserVisitor ) return ((TypeParserVisitor<? extends T>)visitor).visitInitializationExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializationExpressionContext initializationExpression() throws RecognitionException {
		InitializationExpressionContext _localctx = new InitializationExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_initializationExpression);
		try {
			setState(273);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				match(VARIABLE_TYPE);
				setState(267);
				match(IDENTIFIER);
				setState(268);
				match(EQUAL);
				setState(269);
				expression(0);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(270);
				match(IDENTIFIER);
				setState(271);
				match(EQUAL);
				setState(272);
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
		public TerminalNode IDENTIFIER() { return getToken(TypeParser.IDENTIFIER, 0); }
		public TerminalNode INCREMENT() { return getToken(TypeParser.INCREMENT, 0); }
		public TerminalNode DECREMENT() { return getToken(TypeParser.DECREMENT, 0); }
		public TerminalNode PLUS_EQUAL() { return getToken(TypeParser.PLUS_EQUAL, 0); }
		public TerminalNode NUMBER() { return getToken(TypeParser.NUMBER, 0); }
		public TerminalNode MINUS_EQUAL() { return getToken(TypeParser.MINUS_EQUAL, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(TypeParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(TypeParser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(TypeParser.MOD_ASSIGN, 0); }
		public IterationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeParserListener ) ((TypeParserListener)listener).enterIterationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeParserListener ) ((TypeParserListener)listener).exitIterationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeParserVisitor ) return ((TypeParserVisitor<? extends T>)visitor).visitIterationExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterationExpressionContext iterationExpression() throws RecognitionException {
		IterationExpressionContext _localctx = new IterationExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_iterationExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(IDENTIFIER);
			setState(290);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INCREMENT:
				{
				setState(276);
				match(INCREMENT);
				}
				break;
			case DECREMENT:
				{
				setState(277);
				match(DECREMENT);
				}
				break;
			case PLUS_EQUAL:
			case MINUS_EQUAL:
			case MUL_ASSIGN:
			case DIV_ASSIGN:
			case MOD_ASSIGN:
				{
				setState(288);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS_EQUAL:
					{
					setState(278);
					match(PLUS_EQUAL);
					setState(279);
					match(NUMBER);
					}
					break;
				case MINUS_EQUAL:
					{
					setState(280);
					match(MINUS_EQUAL);
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
		public TerminalNode WHILE() { return getToken(TypeParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(TypeParser.LPAREN, 0); }
		public StrictEqualityExpressionContext strictEqualityExpression() {
			return getRuleContext(StrictEqualityExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(TypeParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeParserListener ) ((TypeParserListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeParserListener ) ((TypeParserListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeParserVisitor ) return ((TypeParserVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_whileStatement);
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
		public TerminalNode DO() { return getToken(TypeParser.DO, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(TypeParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(TypeParser.LPAREN, 0); }
		public StrictEqualityExpressionContext strictEqualityExpression() {
			return getRuleContext(StrictEqualityExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(TypeParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(TypeParser.SEMICOLON, 0); }
		public DoWhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeParserListener ) ((TypeParserListener)listener).enterDoWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeParserListener ) ((TypeParserListener)listener).exitDoWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeParserVisitor ) return ((TypeParserVisitor<? extends T>)visitor).visitDoWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWhileStatementContext doWhileStatement() throws RecognitionException {
		DoWhileStatementContext _localctx = new DoWhileStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_doWhileStatement);
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
		public TerminalNode EQUAL_EQUAL() { return getToken(TypeParser.EQUAL_EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(TypeParser.NOT_EQUAL, 0); }
		public TerminalNode GREATER() { return getToken(TypeParser.GREATER, 0); }
		public TerminalNode GREATER_EQUAL() { return getToken(TypeParser.GREATER_EQUAL, 0); }
		public TerminalNode LESS() { return getToken(TypeParser.LESS, 0); }
		public TerminalNode LESS_EQUAL() { return getToken(TypeParser.LESS_EQUAL, 0); }
		public TerminalNode BOOLEAN() { return getToken(TypeParser.BOOLEAN, 0); }
		public StrictEqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strictEqualityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeParserListener ) ((TypeParserListener)listener).enterStrictEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeParserListener ) ((TypeParserListener)listener).exitStrictEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeParserVisitor ) return ((TypeParserVisitor<? extends T>)visitor).visitStrictEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrictEqualityExpressionContext strictEqualityExpression() throws RecognitionException {
		StrictEqualityExpressionContext _localctx = new StrictEqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_strictEqualityExpression);
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
		public TerminalNode RETURN() { return getToken(TypeParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(TypeParser.SEMICOLON, 0); }
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeParserListener ) ((TypeParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeParserListener ) ((TypeParserListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeParserVisitor ) return ((TypeParserVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_returnStatement);
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
		public List<TerminalNode> IDENTIFIER() { return getTokens(TypeParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(TypeParser.IDENTIFIER, i);
		}
		public TerminalNode MUL_ASSIGN() { return getToken(TypeParser.MUL_ASSIGN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DIV_ASSIGN() { return getToken(TypeParser.DIV_ASSIGN, 0); }
		public TerminalNode LPAREN() { return getToken(TypeParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(TypeParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(TypeParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TypeParser.COMMA, i);
		}
		public TerminalNode INCREMENT() { return getToken(TypeParser.INCREMENT, 0); }
		public TerminalNode DECREMENT() { return getToken(TypeParser.DECREMENT, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(TypeParser.MOD_ASSIGN, 0); }
		public TerminalNode EQUAL() { return getToken(TypeParser.EQUAL, 0); }
		public TerminalNode PLUS_EQUAL() { return getToken(TypeParser.PLUS_EQUAL, 0); }
		public TerminalNode MINUS_EQUAL() { return getToken(TypeParser.MINUS_EQUAL, 0); }
		public TerminalNode PLUS() { return getToken(TypeParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(TypeParser.MINUS, 0); }
		public TerminalNode EQUAL_EQUAL() { return getToken(TypeParser.EQUAL_EQUAL, 0); }
		public List<TerminalNode> DOT() { return getTokens(TypeParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(TypeParser.DOT, i);
		}
		public TerminalNode LBRACKET() { return getToken(TypeParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(TypeParser.RBRACKET, 0); }
		public TerminalNode NUMBER() { return getToken(TypeParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(TypeParser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(TypeParser.BOOLEAN, 0); }
		public TerminalNode TIMES() { return getToken(TypeParser.TIMES, 0); }
		public TerminalNode DIVIDE() { return getToken(TypeParser.DIVIDE, 0); }
		public TerminalNode AND() { return getToken(TypeParser.AND, 0); }
		public TerminalNode OR() { return getToken(TypeParser.OR, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(TypeParser.NOT_EQUAL, 0); }
		public TerminalNode GREATER() { return getToken(TypeParser.GREATER, 0); }
		public TerminalNode GREATER_EQUAL() { return getToken(TypeParser.GREATER_EQUAL, 0); }
		public TerminalNode LESS() { return getToken(TypeParser.LESS, 0); }
		public TerminalNode LESS_EQUAL() { return getToken(TypeParser.LESS_EQUAL, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeParserListener ) ((TypeParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeParserListener ) ((TypeParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeParserVisitor ) return ((TypeParserVisitor<? extends T>)visitor).visitExpression(this);
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
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
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
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 131941395333120L) != 0)) {
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
				match(PLUS_EQUAL);
				setState(372);
				expression(12);
				}
				break;
			case 10:
				{
				setState(373);
				match(IDENTIFIER);
				setState(374);
				match(MINUS_EQUAL);
				setState(375);
				expression(11);
				}
				break;
			case 11:
				{
				setState(376);
				match(IDENTIFIER);
				setState(377);
				match(DIV_ASSIGN);
				setState(378);
				expression(10);
				}
				break;
			case 12:
				{
				setState(379);
				match(IDENTIFIER);
				setState(380);
				match(MOD_ASSIGN);
				setState(381);
				expression(9);
				}
				break;
			case 13:
				{
				setState(382);
				match(IDENTIFIER);
				setState(383);
				match(PLUS);
				setState(384);
				expression(8);
				}
				break;
			case 14:
				{
				setState(385);
				match(IDENTIFIER);
				setState(386);
				match(MINUS);
				setState(387);
				expression(7);
				}
				break;
			case 15:
				{
				setState(388);
				match(IDENTIFIER);
				setState(389);
				match(EQUAL_EQUAL);
				setState(390);
				expression(6);
				}
				break;
			case 16:
				{
				setState(391);
				match(IDENTIFIER);
				setState(396);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(392);
						match(DOT);
						setState(393);
						match(IDENTIFIER);
						}
						} 
					}
					setState(398);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				}
				}
				break;
			case 17:
				{
				setState(399);
				match(IDENTIFIER);
				setState(400);
				match(LBRACKET);
				setState(401);
				expression(0);
				setState(402);
				match(RBRACKET);
				}
				break;
			case 18:
				{
				setState(404);
				match(NUMBER);
				}
				break;
			case 19:
				{
				setState(405);
				match(STRING);
				}
				break;
			case 20:
				{
				setState(406);
				match(BOOLEAN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(444);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(442);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(409);
						if (!(precpred(_ctx, 31))) throw new FailedPredicateException(this, "precpred(_ctx, 31)");
						setState(410);
						match(TIMES);
						setState(411);
						expression(32);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(412);
						if (!(precpred(_ctx, 30))) throw new FailedPredicateException(this, "precpred(_ctx, 30)");
						setState(413);
						match(DIVIDE);
						setState(414);
						expression(31);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(415);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(416);
						match(AND);
						setState(417);
						expression(27);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(418);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(419);
						match(OR);
						setState(420);
						expression(26);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(421);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(422);
						match(PLUS);
						setState(423);
						expression(25);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(424);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(425);
						match(MINUS);
						setState(426);
						expression(24);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(427);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(428);
						match(NOT_EQUAL);
						setState(429);
						expression(23);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(430);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(431);
						match(GREATER);
						setState(432);
						expression(22);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(433);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(434);
						match(GREATER_EQUAL);
						setState(435);
						expression(21);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(436);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(437);
						match(LESS);
						setState(438);
						expression(20);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(439);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(440);
						match(LESS_EQUAL);
						setState(441);
						expression(19);
						}
						break;
					}
					} 
				}
				setState(446);
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
		public TerminalNode IDENTIFIER() { return getToken(TypeParser.IDENTIFIER, 0); }
		public List<TerminalNode> LBRACKET() { return getTokens(TypeParser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(TypeParser.LBRACKET, i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(TypeParser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(TypeParser.RBRACKET, i);
		}
		public TerminalNode COLON() { return getToken(TypeParser.COLON, 0); }
		public TerminalNode TYPE() { return getToken(TypeParser.TYPE, 0); }
		public TerminalNode EQUAL() { return getToken(TypeParser.EQUAL, 0); }
		public TerminalNode SEMICOLON() { return getToken(TypeParser.SEMICOLON, 0); }
		public ArrayElementsContext arrayElements() {
			return getRuleContext(ArrayElementsContext.class,0);
		}
		public ArrayDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeParserListener ) ((TypeParserListener)listener).enterArrayDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeParserListener ) ((TypeParserListener)listener).exitArrayDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeParserVisitor ) return ((TypeParserVisitor<? extends T>)visitor).visitArrayDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayDeclarationContext arrayDeclaration() throws RecognitionException {
		ArrayDeclarationContext _localctx = new ArrayDeclarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_arrayDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			match(IDENTIFIER);
			setState(448);
			match(LBRACKET);
			setState(449);
			match(RBRACKET);
			setState(450);
			match(COLON);
			setState(451);
			match(TYPE);
			setState(452);
			match(EQUAL);
			setState(453);
			match(LBRACKET);
			setState(455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 131941395333120L) != 0)) {
				{
				setState(454);
				arrayElements();
				}
			}

			setState(457);
			match(RBRACKET);
			setState(458);
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
		public List<TerminalNode> COMMA() { return getTokens(TypeParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TypeParser.COMMA, i);
		}
		public ArrayElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeParserListener ) ((TypeParserListener)listener).enterArrayElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeParserListener ) ((TypeParserListener)listener).exitArrayElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeParserVisitor ) return ((TypeParserVisitor<? extends T>)visitor).visitArrayElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayElementsContext arrayElements() throws RecognitionException {
		ArrayElementsContext _localctx = new ArrayElementsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_arrayElements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			expression(0);
			setState(465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(461);
				match(COMMA);
				setState(462);
				expression(0);
				}
				}
				setState(467);
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
		public List<TerminalNode> IDENTIFIER() { return getTokens(TypeParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(TypeParser.IDENTIFIER, i);
		}
		public TerminalNode DOT() { return getToken(TypeParser.DOT, 0); }
		public TerminalNode FOREACH() { return getToken(TypeParser.FOREACH, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(TypeParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(TypeParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(TypeParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(TypeParser.RPAREN, i);
		}
		public TerminalNode ARROW() { return getToken(TypeParser.ARROW, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(TypeParser.SEMICOLON, 0); }
		public ArrayMethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayMethodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeParserListener ) ((TypeParserListener)listener).enterArrayMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeParserListener ) ((TypeParserListener)listener).exitArrayMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeParserVisitor ) return ((TypeParserVisitor<? extends T>)visitor).visitArrayMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayMethodCallContext arrayMethodCall() throws RecognitionException {
		ArrayMethodCallContext _localctx = new ArrayMethodCallContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_arrayMethodCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			match(IDENTIFIER);
			setState(469);
			match(DOT);
			setState(470);
			match(FOREACH);
			setState(471);
			match(LPAREN);
			setState(472);
			match(LPAREN);
			setState(473);
			match(IDENTIFIER);
			setState(474);
			match(RPAREN);
			setState(475);
			match(ARROW);
			setState(476);
			block();
			setState(477);
			match(RPAREN);
			setState(478);
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
		case 22:
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
		"\u0004\u00014\u01e1\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0001\u0000\u0004\u00006\b\u0000\u000b\u0000"+
		"\f\u00007\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001=\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002F\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003L\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004Q\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005n\b"+
		"\u0005\n\u0005\f\u0005q\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0005\u0005w\b\u0005\n\u0005\f\u0005z\t\u0005\u0003\u0005|\b\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u0082\b\u0005"+
		"\n\u0005\f\u0005\u0085\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\u008a\b\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0003\u0006\u008f"+
		"\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u0095"+
		"\b\u0006\n\u0006\f\u0006\u0098\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0003\u0007\u009d\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u00a3\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0005\t\u00b5\b\t\n\t\f\t\u00b8\t\t\u0001\t"+
		"\u0003\t\u00bb\b\t\u0003\t\u00bd\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005"+
		"\u000b\u00cf\b\u000b\n\u000b\f\u000b\u00d2\t\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u00d6\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0005\u000e\u00ef\b\u000e\n\u000e\f\u000e\u00f2\t\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005"+
		"\u000f\u00fb\b\u000f\n\u000f\f\u000f\u00fe\t\u000f\u0001\u000f\u0003\u000f"+
		"\u0101\b\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0105\b\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0112"+
		"\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0003\u0011\u0121\b\u0011\u0003\u0011\u0123\b\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u014c\b\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u015e\b\u0016\n\u0016"+
		"\f\u0016\u0161\t\u0016\u0003\u0016\u0163\b\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0005\u0016\u018b\b\u0016\n\u0016\f\u0016\u018e\t\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0003\u0016\u0198\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005"+
		"\u0016\u01bb\b\u0016\n\u0016\f\u0016\u01be\t\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0003\u0017\u01c8\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0005\u0018\u01d0\b\u0018\n\u0018\f\u0018\u01d3"+
		"\t\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0000\u0001,\u001a\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02\u0000\u0000"+
		"\u0221\u00005\u0001\u0000\u0000\u0000\u0002<\u0001\u0000\u0000\u0000\u0004"+
		"E\u0001\u0000\u0000\u0000\u0006K\u0001\u0000\u0000\u0000\bP\u0001\u0000"+
		"\u0000\u0000\n\u0089\u0001\u0000\u0000\u0000\f\u008e\u0001\u0000\u0000"+
		"\u0000\u000e\u009c\u0001\u0000\u0000\u0000\u0010\u00a8\u0001\u0000\u0000"+
		"\u0000\u0012\u00bc\u0001\u0000\u0000\u0000\u0014\u00be\u0001\u0000\u0000"+
		"\u0000\u0016\u00c2\u0001\u0000\u0000\u0000\u0018\u00d7\u0001\u0000\u0000"+
		"\u0000\u001a\u00e1\u0001\u0000\u0000\u0000\u001c\u00ec\u0001\u0000\u0000"+
		"\u0000\u001e\u00f5\u0001\u0000\u0000\u0000 \u0111\u0001\u0000\u0000\u0000"+
		"\"\u0113\u0001\u0000\u0000\u0000$\u0124\u0001\u0000\u0000\u0000&\u012a"+
		"\u0001\u0000\u0000\u0000(\u014b\u0001\u0000\u0000\u0000*\u014d\u0001\u0000"+
		"\u0000\u0000,\u0197\u0001\u0000\u0000\u0000.\u01bf\u0001\u0000\u0000\u0000"+
		"0\u01cc\u0001\u0000\u0000\u00002\u01d4\u0001\u0000\u0000\u000046\u0003"+
		"\u0002\u0001\u000054\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u0000"+
		"75\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u00008\u0001\u0001\u0000"+
		"\u0000\u00009=\u0003\u001e\u000f\u0000:=\u0003\f\u0006\u0000;=\u0003\u0004"+
		"\u0002\u0000<9\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000<;\u0001"+
		"\u0000\u0000\u0000=\u0003\u0001\u0000\u0000\u0000>F\u0003\u0006\u0003"+
		"\u0000?F\u0003\b\u0004\u0000@F\u0003\u0016\u000b\u0000AF\u0003*\u0015"+
		"\u0000BF\u0003,\u0016\u0000CF\u0003\n\u0005\u0000DF\u00032\u0019\u0000"+
		"E>\u0001\u0000\u0000\u0000E?\u0001\u0000\u0000\u0000E@\u0001\u0000\u0000"+
		"\u0000EA\u0001\u0000\u0000\u0000EB\u0001\u0000\u0000\u0000EC\u0001\u0000"+
		"\u0000\u0000ED\u0001\u0000\u0000\u0000F\u0005\u0001\u0000\u0000\u0000"+
		"GL\u0003&\u0013\u0000HL\u0003\u001a\r\u0000IL\u0003\u0018\f\u0000JL\u0003"+
		"$\u0012\u0000KG\u0001\u0000\u0000\u0000KH\u0001\u0000\u0000\u0000KI\u0001"+
		"\u0000\u0000\u0000KJ\u0001\u0000\u0000\u0000L\u0007\u0001\u0000\u0000"+
		"\u0000MQ\u0003\u000e\u0007\u0000NQ\u0003\u0010\b\u0000OQ\u0003.\u0017"+
		"\u0000PM\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000PO\u0001\u0000"+
		"\u0000\u0000Q\t\u0001\u0000\u0000\u0000RS\u0005+\u0000\u0000ST\u0005\u0010"+
		"\u0000\u0000T\u008a\u0003,\u0016\u0000UV\u0005+\u0000\u0000VW\u0005\f"+
		"\u0000\u0000WX\u0005\u0010\u0000\u0000X\u008a\u0003,\u0016\u0000YZ\u0005"+
		"+\u0000\u0000Z[\u0005\r\u0000\u0000[\\\u0005\u0010\u0000\u0000\\\u008a"+
		"\u0003,\u0016\u0000]^\u0005+\u0000\u0000^_\u0005\u001b\u0000\u0000_\u008a"+
		"\u0003,\u0016\u0000`a\u0005+\u0000\u0000ab\u0005\u001c\u0000\u0000b\u008a"+
		"\u0003,\u0016\u0000cd\u0005+\u0000\u0000de\u0005\u001d\u0000\u0000e\u008a"+
		"\u0003,\u0016\u0000fg\u0005+\u0000\u0000g\u008a\u0005\u0017\u0000\u0000"+
		"hi\u0005+\u0000\u0000i\u008a\u0005\u0018\u0000\u0000jo\u0005+\u0000\u0000"+
		"kl\u0005%\u0000\u0000ln\u0005+\u0000\u0000mk\u0001\u0000\u0000\u0000n"+
		"q\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000op\u0001\u0000\u0000"+
		"\u0000pr\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000r{\u0005\u001e"+
		"\u0000\u0000sx\u0003,\u0016\u0000tu\u0005#\u0000\u0000uw\u0003,\u0016"+
		"\u0000vt\u0001\u0000\u0000\u0000wz\u0001\u0000\u0000\u0000xv\u0001\u0000"+
		"\u0000\u0000xy\u0001\u0000\u0000\u0000y|\u0001\u0000\u0000\u0000zx\u0001"+
		"\u0000\u0000\u0000{s\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000"+
		"|}\u0001\u0000\u0000\u0000}\u008a\u0005\u001f\u0000\u0000~\u0083\u0005"+
		"+\u0000\u0000\u007f\u0080\u0005%\u0000\u0000\u0080\u0082\u0005+\u0000"+
		"\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0082\u0085\u0001\u0000\u0000"+
		"\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000"+
		"\u0000\u0084\u008a\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000"+
		"\u0000\u0086\u008a\u0005,\u0000\u0000\u0087\u008a\u0005-\u0000\u0000\u0088"+
		"\u008a\u0005.\u0000\u0000\u0089R\u0001\u0000\u0000\u0000\u0089U\u0001"+
		"\u0000\u0000\u0000\u0089Y\u0001\u0000\u0000\u0000\u0089]\u0001\u0000\u0000"+
		"\u0000\u0089`\u0001\u0000\u0000\u0000\u0089c\u0001\u0000\u0000\u0000\u0089"+
		"f\u0001\u0000\u0000\u0000\u0089h\u0001\u0000\u0000\u0000\u0089j\u0001"+
		"\u0000\u0000\u0000\u0089~\u0001\u0000\u0000\u0000\u0089\u0086\u0001\u0000"+
		"\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u0089\u0088\u0001\u0000"+
		"\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008c\u0005\"\u0000"+
		"\u0000\u008c\u000b\u0001\u0000\u0000\u0000\u008d\u008f\u0005\'\u0000\u0000"+
		"\u008e\u008d\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000"+
		"\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0091\u00052\u0000\u0000\u0091"+
		"\u0092\u0005+\u0000\u0000\u0092\u0096\u00053\u0000\u0000\u0093\u0095\u0003"+
		"\b\u0004\u0000\u0094\u0093\u0001\u0000\u0000\u0000\u0095\u0098\u0001\u0000"+
		"\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000"+
		"\u0000\u0000\u0097\u0099\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000"+
		"\u0000\u0000\u0099\u009a\u00054\u0000\u0000\u009a\r\u0001\u0000\u0000"+
		"\u0000\u009b\u009d\u0005\'\u0000\u0000\u009c\u009b\u0001\u0000\u0000\u0000"+
		"\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000"+
		"\u009e\u009f\u0005\u000b\u0000\u0000\u009f\u00a2\u0005+\u0000\u0000\u00a0"+
		"\u00a1\u0005$\u0000\u0000\u00a1\u00a3\u0005\n\u0000\u0000\u00a2\u00a0"+
		"\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a4"+
		"\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005\u0010\u0000\u0000\u00a5\u00a6"+
		"\u0003,\u0016\u0000\u00a6\u00a7\u0005\"\u0000\u0000\u00a7\u000f\u0001"+
		"\u0000\u0000\u0000\u00a8\u00a9\u0005\u0006\u0000\u0000\u00a9\u00aa\u0005"+
		"+\u0000\u0000\u00aa\u00ab\u0005\u001e\u0000\u0000\u00ab\u00ac\u0003\u0012"+
		"\t\u0000\u00ac\u00ad\u0005\u001f\u0000\u0000\u00ad\u00ae\u0005$\u0000"+
		"\u0000\u00ae\u00af\u0005\n\u0000\u0000\u00af\u00b0\u0003\u001c\u000e\u0000"+
		"\u00b0\u0011\u0001\u0000\u0000\u0000\u00b1\u00b6\u0003\u0014\n\u0000\u00b2"+
		"\u00b3\u0005#\u0000\u0000\u00b3\u00b5\u0003\u0014\n\u0000\u00b4\u00b2"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b8\u0001\u0000\u0000\u0000\u00b6\u00b4"+
		"\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7\u00ba"+
		"\u0001\u0000\u0000\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b9\u00bb"+
		"\u0005#\u0000\u0000\u00ba\u00b9\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001"+
		"\u0000\u0000\u0000\u00bb\u00bd\u0001\u0000\u0000\u0000\u00bc\u00b1\u0001"+
		"\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd\u0013\u0001"+
		"\u0000\u0000\u0000\u00be\u00bf\u0005+\u0000\u0000\u00bf\u00c0\u0005$\u0000"+
		"\u0000\u00c0\u00c1\u0005\n\u0000\u0000\u00c1\u0015\u0001\u0000\u0000\u0000"+
		"\u00c2\u00c3\u0005\u0001\u0000\u0000\u00c3\u00c4\u0005\u001e\u0000\u0000"+
		"\u00c4\u00c5\u0003,\u0016\u0000\u00c5\u00c6\u0005\u001f\u0000\u0000\u00c6"+
		"\u00d0\u0003\u001c\u000e\u0000\u00c7\u00c8\u0005\u0002\u0000\u0000\u00c8"+
		"\u00c9\u0005\u0001\u0000\u0000\u00c9\u00ca\u0005\u001e\u0000\u0000\u00ca"+
		"\u00cb\u0003,\u0016\u0000\u00cb\u00cc\u0005\u001f\u0000\u0000\u00cc\u00cd"+
		"\u0003\u001c\u000e\u0000\u00cd\u00cf\u0001\u0000\u0000\u0000\u00ce\u00c7"+
		"\u0001\u0000\u0000\u0000\u00cf\u00d2\u0001\u0000\u0000\u0000\u00d0\u00ce"+
		"\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u00d5"+
		"\u0001\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d3\u00d4"+
		"\u0005\u0002\u0000\u0000\u00d4\u00d6\u0003\u001c\u000e\u0000\u00d5\u00d3"+
		"\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6\u0017"+
		"\u0001\u0000\u0000\u0000\u00d7\u00d8\u0005\u0003\u0000\u0000\u00d8\u00d9"+
		"\u0005\u001e\u0000\u0000\u00d9\u00da\u0003 \u0010\u0000\u00da\u00db\u0005"+
		"\"\u0000\u0000\u00db\u00dc\u0003,\u0016\u0000\u00dc\u00dd\u0005\"\u0000"+
		"\u0000\u00dd\u00de\u0003\"\u0011\u0000\u00de\u00df\u0005\u001f\u0000\u0000"+
		"\u00df\u00e0\u0003\u001c\u000e\u0000\u00e0\u0019\u0001\u0000\u0000\u0000"+
		"\u00e1\u00e2\u0005+\u0000\u0000\u00e2\u00e3\u0005%\u0000\u0000\u00e3\u00e4"+
		"\u0005\b\u0000\u0000\u00e4\u00e5\u0005\u001e\u0000\u0000\u00e5\u00e6\u0005"+
		"\u001e\u0000\u0000\u00e6\u00e7\u0005+\u0000\u0000\u00e7\u00e8\u0005\u001f"+
		"\u0000\u0000\u00e8\u00e9\u0005\t\u0000\u0000\u00e9\u00ea\u0003\u001c\u000e"+
		"\u0000\u00ea\u00eb\u0005\u001f\u0000\u0000\u00eb\u001b\u0001\u0000\u0000"+
		"\u0000\u00ec\u00f0\u00053\u0000\u0000\u00ed\u00ef\u0003\u0004\u0002\u0000"+
		"\u00ee\u00ed\u0001\u0000\u0000\u0000\u00ef\u00f2\u0001\u0000\u0000\u0000"+
		"\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f0\u00f1\u0001\u0000\u0000\u0000"+
		"\u00f1\u00f3\u0001\u0000\u0000\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000"+
		"\u00f3\u00f4\u00054\u0000\u0000\u00f4\u001d\u0001\u0000\u0000\u0000\u00f5"+
		"\u0104\u0005&\u0000\u0000\u00f6\u00f7\u00053\u0000\u0000\u00f7\u00fc\u0005"+
		"+\u0000\u0000\u00f8\u00f9\u0005#\u0000\u0000\u00f9\u00fb\u0005+\u0000"+
		"\u0000\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fb\u00fe\u0001\u0000\u0000"+
		"\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001\u0000\u0000"+
		"\u0000\u00fd\u0100\u0001\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000"+
		"\u0000\u00ff\u0101\u0005#\u0000\u0000\u0100\u00ff\u0001\u0000\u0000\u0000"+
		"\u0100\u0101\u0001\u0000\u0000\u0000\u0101\u0102\u0001\u0000\u0000\u0000"+
		"\u0102\u0105\u00054\u0000\u0000\u0103\u0105\u0005\u000e\u0000\u0000\u0104"+
		"\u00f6\u0001\u0000\u0000\u0000\u0104\u0103\u0001\u0000\u0000\u0000\u0105"+
		"\u0106\u0001\u0000\u0000\u0000\u0106\u0107\u0005(\u0000\u0000\u0107\u0108"+
		"\u0005+\u0000\u0000\u0108\u0109\u0005\"\u0000\u0000\u0109\u001f\u0001"+
		"\u0000\u0000\u0000\u010a\u010b\u0005\u000b\u0000\u0000\u010b\u010c\u0005"+
		"+\u0000\u0000\u010c\u010d\u0005\u0010\u0000\u0000\u010d\u0112\u0003,\u0016"+
		"\u0000\u010e\u010f\u0005+\u0000\u0000\u010f\u0110\u0005\u0010\u0000\u0000"+
		"\u0110\u0112\u0003,\u0016\u0000\u0111\u010a\u0001\u0000\u0000\u0000\u0111"+
		"\u010e\u0001\u0000\u0000\u0000\u0112!\u0001\u0000\u0000\u0000\u0113\u0122"+
		"\u0005+\u0000\u0000\u0114\u0123\u0005\u0017\u0000\u0000\u0115\u0123\u0005"+
		"\u0018\u0000\u0000\u0116\u0117\u0005\u0019\u0000\u0000\u0117\u0121\u0005"+
		",\u0000\u0000\u0118\u0119\u0005\u001a\u0000\u0000\u0119\u0121\u0005,\u0000"+
		"\u0000\u011a\u011b\u0005\u001b\u0000\u0000\u011b\u0121\u0005,\u0000\u0000"+
		"\u011c\u011d\u0005\u001c\u0000\u0000\u011d\u0121\u0005,\u0000\u0000\u011e"+
		"\u011f\u0005\u001d\u0000\u0000\u011f\u0121\u0005,\u0000\u0000\u0120\u0116"+
		"\u0001\u0000\u0000\u0000\u0120\u0118\u0001\u0000\u0000\u0000\u0120\u011a"+
		"\u0001\u0000\u0000\u0000\u0120\u011c\u0001\u0000\u0000\u0000\u0120\u011e"+
		"\u0001\u0000\u0000\u0000\u0121\u0123\u0001\u0000\u0000\u0000\u0122\u0114"+
		"\u0001\u0000\u0000\u0000\u0122\u0115\u0001\u0000\u0000\u0000\u0122\u0120"+
		"\u0001\u0000\u0000\u0000\u0123#\u0001\u0000\u0000\u0000\u0124\u0125\u0005"+
		"\u0005\u0000\u0000\u0125\u0126\u0005\u001e\u0000\u0000\u0126\u0127\u0003"+
		"(\u0014\u0000\u0127\u0128\u0005\u001f\u0000\u0000\u0128\u0129\u0003\u001c"+
		"\u000e\u0000\u0129%\u0001\u0000\u0000\u0000\u012a\u012b\u0005\u0004\u0000"+
		"\u0000\u012b\u012c\u0003\u001c\u000e\u0000\u012c\u012d\u0005\u0005\u0000"+
		"\u0000\u012d\u012e\u0005\u001e\u0000\u0000\u012e\u012f\u0003(\u0014\u0000"+
		"\u012f\u0130\u0005\u001f\u0000\u0000\u0130\u0131\u0005\"\u0000\u0000\u0131"+
		"\'\u0001\u0000\u0000\u0000\u0132\u0133\u0003,\u0016\u0000\u0133\u0134"+
		"\u0005\u0011\u0000\u0000\u0134\u0135\u0003,\u0016\u0000\u0135\u014c\u0001"+
		"\u0000\u0000\u0000\u0136\u0137\u0003,\u0016\u0000\u0137\u0138\u0005\u0012"+
		"\u0000\u0000\u0138\u0139\u0003,\u0016\u0000\u0139\u014c\u0001\u0000\u0000"+
		"\u0000\u013a\u013b\u0003,\u0016\u0000\u013b\u013c\u0005\u0013\u0000\u0000"+
		"\u013c\u013d\u0003,\u0016\u0000\u013d\u014c\u0001\u0000\u0000\u0000\u013e"+
		"\u013f\u0003,\u0016\u0000\u013f\u0140\u0005\u0014\u0000\u0000\u0140\u0141"+
		"\u0003,\u0016\u0000\u0141\u014c\u0001\u0000\u0000\u0000\u0142\u0143\u0003"+
		",\u0016\u0000\u0143\u0144\u0005\u0015\u0000\u0000\u0144\u0145\u0003,\u0016"+
		"\u0000\u0145\u014c\u0001\u0000\u0000\u0000\u0146\u0147\u0003,\u0016\u0000"+
		"\u0147\u0148\u0005\u0016\u0000\u0000\u0148\u0149\u0003,\u0016\u0000\u0149"+
		"\u014c\u0001\u0000\u0000\u0000\u014a\u014c\u0005.\u0000\u0000\u014b\u0132"+
		"\u0001\u0000\u0000\u0000\u014b\u0136\u0001\u0000\u0000\u0000\u014b\u013a"+
		"\u0001\u0000\u0000\u0000\u014b\u013e\u0001\u0000\u0000\u0000\u014b\u0142"+
		"\u0001\u0000\u0000\u0000\u014b\u0146\u0001\u0000\u0000\u0000\u014b\u014a"+
		"\u0001\u0000\u0000\u0000\u014c)\u0001\u0000\u0000\u0000\u014d\u014e\u0005"+
		"\u0007\u0000\u0000\u014e\u014f\u0003,\u0016\u0000\u014f\u0150\u0005\""+
		"\u0000\u0000\u0150+\u0001\u0000\u0000\u0000\u0151\u0152\u0006\u0016\uffff"+
		"\uffff\u0000\u0152\u0153\u0005+\u0000\u0000\u0153\u0154\u0005\u001b\u0000"+
		"\u0000\u0154\u0198\u0003,\u0016\u001d\u0155\u0156\u0005+\u0000\u0000\u0156"+
		"\u0157\u0005\u001c\u0000\u0000\u0157\u0198\u0003,\u0016\u001c\u0158\u0159"+
		"\u0005+\u0000\u0000\u0159\u0162\u0005\u001e\u0000\u0000\u015a\u015f\u0003"+
		",\u0016\u0000\u015b\u015c\u0005#\u0000\u0000\u015c\u015e\u0003,\u0016"+
		"\u0000\u015d\u015b\u0001\u0000\u0000\u0000\u015e\u0161\u0001\u0000\u0000"+
		"\u0000\u015f\u015d\u0001\u0000\u0000\u0000\u015f\u0160\u0001\u0000\u0000"+
		"\u0000\u0160\u0163\u0001\u0000\u0000\u0000\u0161\u015f\u0001\u0000\u0000"+
		"\u0000\u0162\u015a\u0001\u0000\u0000\u0000\u0162\u0163\u0001\u0000\u0000"+
		"\u0000\u0163\u0164\u0001\u0000\u0000\u0000\u0164\u0198\u0005\u001f\u0000"+
		"\u0000\u0165\u0166\u0005+\u0000\u0000\u0166\u0198\u0005\u0017\u0000\u0000"+
		"\u0167\u0168\u0005+\u0000\u0000\u0168\u0198\u0005\u0018\u0000\u0000\u0169"+
		"\u016a\u0005+\u0000\u0000\u016a\u016b\u0005\u001b\u0000\u0000\u016b\u0198"+
		"\u0003,\u0016\u000f\u016c\u016d\u0005+\u0000\u0000\u016d\u016e\u0005\u001d"+
		"\u0000\u0000\u016e\u0198\u0003,\u0016\u000e\u016f\u0170\u0005+\u0000\u0000"+
		"\u0170\u0171\u0005\u0010\u0000\u0000\u0171\u0198\u0003,\u0016\r\u0172"+
		"\u0173\u0005+\u0000\u0000\u0173\u0174\u0005\u0019\u0000\u0000\u0174\u0198"+
		"\u0003,\u0016\f\u0175\u0176\u0005+\u0000\u0000\u0176\u0177\u0005\u001a"+
		"\u0000\u0000\u0177\u0198\u0003,\u0016\u000b\u0178\u0179\u0005+\u0000\u0000"+
		"\u0179\u017a\u0005\u001c\u0000\u0000\u017a\u0198\u0003,\u0016\n\u017b"+
		"\u017c\u0005+\u0000\u0000\u017c\u017d\u0005\u001d\u0000\u0000\u017d\u0198"+
		"\u0003,\u0016\t\u017e\u017f\u0005+\u0000\u0000\u017f\u0180\u0005\f\u0000"+
		"\u0000\u0180\u0198\u0003,\u0016\b\u0181\u0182\u0005+\u0000\u0000\u0182"+
		"\u0183\u0005\r\u0000\u0000\u0183\u0198\u0003,\u0016\u0007\u0184\u0185"+
		"\u0005+\u0000\u0000\u0185\u0186\u0005\u0011\u0000\u0000\u0186\u0198\u0003"+
		",\u0016\u0006\u0187\u018c\u0005+\u0000\u0000\u0188\u0189\u0005%\u0000"+
		"\u0000\u0189\u018b\u0005+\u0000\u0000\u018a\u0188\u0001\u0000\u0000\u0000"+
		"\u018b\u018e\u0001\u0000\u0000\u0000\u018c\u018a\u0001\u0000\u0000\u0000"+
		"\u018c\u018d\u0001\u0000\u0000\u0000\u018d\u0198\u0001\u0000\u0000\u0000"+
		"\u018e\u018c\u0001\u0000\u0000\u0000\u018f\u0190\u0005+\u0000\u0000\u0190"+
		"\u0191\u0005 \u0000\u0000\u0191\u0192\u0003,\u0016\u0000\u0192\u0193\u0005"+
		"!\u0000\u0000\u0193\u0198\u0001\u0000\u0000\u0000\u0194\u0198\u0005,\u0000"+
		"\u0000\u0195\u0198\u0005-\u0000\u0000\u0196\u0198\u0005.\u0000\u0000\u0197"+
		"\u0151\u0001\u0000\u0000\u0000\u0197\u0155\u0001\u0000\u0000\u0000\u0197"+
		"\u0158\u0001\u0000\u0000\u0000\u0197\u0165\u0001\u0000\u0000\u0000\u0197"+
		"\u0167\u0001\u0000\u0000\u0000\u0197\u0169\u0001\u0000\u0000\u0000\u0197"+
		"\u016c\u0001\u0000\u0000\u0000\u0197\u016f\u0001\u0000\u0000\u0000\u0197"+
		"\u0172\u0001\u0000\u0000\u0000\u0197\u0175\u0001\u0000\u0000\u0000\u0197"+
		"\u0178\u0001\u0000\u0000\u0000\u0197\u017b\u0001\u0000\u0000\u0000\u0197"+
		"\u017e\u0001\u0000\u0000\u0000\u0197\u0181\u0001\u0000\u0000\u0000\u0197"+
		"\u0184\u0001\u0000\u0000\u0000\u0197\u0187\u0001\u0000\u0000\u0000\u0197"+
		"\u018f\u0001\u0000\u0000\u0000\u0197\u0194\u0001\u0000\u0000\u0000\u0197"+
		"\u0195\u0001\u0000\u0000\u0000\u0197\u0196\u0001\u0000\u0000\u0000\u0198"+
		"\u01bc\u0001\u0000\u0000\u0000\u0199\u019a\n\u001f\u0000\u0000\u019a\u019b"+
		"\u0005\u000e\u0000\u0000\u019b\u01bb\u0003,\u0016 \u019c\u019d\n\u001e"+
		"\u0000\u0000\u019d\u019e\u0005\u000f\u0000\u0000\u019e\u01bb\u0003,\u0016"+
		"\u001f\u019f\u01a0\n\u001a\u0000\u0000\u01a0\u01a1\u0005)\u0000\u0000"+
		"\u01a1\u01bb\u0003,\u0016\u001b\u01a2\u01a3\n\u0019\u0000\u0000\u01a3"+
		"\u01a4\u0005*\u0000\u0000\u01a4\u01bb\u0003,\u0016\u001a\u01a5\u01a6\n"+
		"\u0018\u0000\u0000\u01a6\u01a7\u0005\f\u0000\u0000\u01a7\u01bb\u0003,"+
		"\u0016\u0019\u01a8\u01a9\n\u0017\u0000\u0000\u01a9\u01aa\u0005\r\u0000"+
		"\u0000\u01aa\u01bb\u0003,\u0016\u0018\u01ab\u01ac\n\u0016\u0000\u0000"+
		"\u01ac\u01ad\u0005\u0012\u0000\u0000\u01ad\u01bb\u0003,\u0016\u0017\u01ae"+
		"\u01af\n\u0015\u0000\u0000\u01af\u01b0\u0005\u0013\u0000\u0000\u01b0\u01bb"+
		"\u0003,\u0016\u0016\u01b1\u01b2\n\u0014\u0000\u0000\u01b2\u01b3\u0005"+
		"\u0014\u0000\u0000\u01b3\u01bb\u0003,\u0016\u0015\u01b4\u01b5\n\u0013"+
		"\u0000\u0000\u01b5\u01b6\u0005\u0015\u0000\u0000\u01b6\u01bb\u0003,\u0016"+
		"\u0014\u01b7\u01b8\n\u0012\u0000\u0000\u01b8\u01b9\u0005\u0016\u0000\u0000"+
		"\u01b9\u01bb\u0003,\u0016\u0013\u01ba\u0199\u0001\u0000\u0000\u0000\u01ba"+
		"\u019c\u0001\u0000\u0000\u0000\u01ba\u019f\u0001\u0000\u0000\u0000\u01ba"+
		"\u01a2\u0001\u0000\u0000\u0000\u01ba\u01a5\u0001\u0000\u0000\u0000\u01ba"+
		"\u01a8\u0001\u0000\u0000\u0000\u01ba\u01ab\u0001\u0000\u0000\u0000\u01ba"+
		"\u01ae\u0001\u0000\u0000\u0000\u01ba\u01b1\u0001\u0000\u0000\u0000\u01ba"+
		"\u01b4\u0001\u0000\u0000\u0000\u01ba\u01b7\u0001\u0000\u0000\u0000\u01bb"+
		"\u01be\u0001\u0000\u0000\u0000\u01bc\u01ba\u0001\u0000\u0000\u0000\u01bc"+
		"\u01bd\u0001\u0000\u0000\u0000\u01bd-\u0001\u0000\u0000\u0000\u01be\u01bc"+
		"\u0001\u0000\u0000\u0000\u01bf\u01c0\u0005+\u0000\u0000\u01c0\u01c1\u0005"+
		" \u0000\u0000\u01c1\u01c2\u0005!\u0000\u0000\u01c2\u01c3\u0005$\u0000"+
		"\u0000\u01c3\u01c4\u0005\n\u0000\u0000\u01c4\u01c5\u0005\u0010\u0000\u0000"+
		"\u01c5\u01c7\u0005 \u0000\u0000\u01c6\u01c8\u00030\u0018\u0000\u01c7\u01c6"+
		"\u0001\u0000\u0000\u0000\u01c7\u01c8\u0001\u0000\u0000\u0000\u01c8\u01c9"+
		"\u0001\u0000\u0000\u0000\u01c9\u01ca\u0005!\u0000\u0000\u01ca\u01cb\u0005"+
		"\"\u0000\u0000\u01cb/\u0001\u0000\u0000\u0000\u01cc\u01d1\u0003,\u0016"+
		"\u0000\u01cd\u01ce\u0005#\u0000\u0000\u01ce\u01d0\u0003,\u0016\u0000\u01cf"+
		"\u01cd\u0001\u0000\u0000\u0000\u01d0\u01d3\u0001\u0000\u0000\u0000\u01d1"+
		"\u01cf\u0001\u0000\u0000\u0000\u01d1\u01d2\u0001\u0000\u0000\u0000\u01d2"+
		"1\u0001\u0000\u0000\u0000\u01d3\u01d1\u0001\u0000\u0000\u0000\u01d4\u01d5"+
		"\u0005+\u0000\u0000\u01d5\u01d6\u0005%\u0000\u0000\u01d6\u01d7\u0005\b"+
		"\u0000\u0000\u01d7\u01d8\u0005\u001e\u0000\u0000\u01d8\u01d9\u0005\u001e"+
		"\u0000\u0000\u01d9\u01da\u0005+\u0000\u0000\u01da\u01db\u0005\u001f\u0000"+
		"\u0000\u01db\u01dc\u0005\t\u0000\u0000\u01dc\u01dd\u0003\u001c\u000e\u0000"+
		"\u01dd\u01de\u0005\u001f\u0000\u0000\u01de\u01df\u0005\"\u0000\u0000\u01df"+
		"3\u0001\u0000\u0000\u0000#7<EKPox{\u0083\u0089\u008e\u0096\u009c\u00a2"+
		"\u00b6\u00ba\u00bc\u00d0\u00d5\u00f0\u00fc\u0100\u0104\u0111\u0120\u0122"+
		"\u014b\u015f\u0162\u018c\u0197\u01ba\u01bc\u01c7\u01d1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}