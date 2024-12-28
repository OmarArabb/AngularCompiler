// Generated from C:/Users/n_alb/IdeaProjects/AngularCompiler/src/grammer/TypeParser.g4 by ANTLR 4.13.2
package grammer;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TypeParser}.
 */
public interface TypeParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TypeParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(TypeParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(TypeParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code importState}
	 * labeled alternative in {@link TypeParser#line}.
	 * @param ctx the parse tree
	 */
	void enterImportState(TypeParser.ImportStateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code importState}
	 * labeled alternative in {@link TypeParser#line}.
	 * @param ctx the parse tree
	 */
	void exitImportState(TypeParser.ImportStateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code class}
	 * labeled alternative in {@link TypeParser#line}.
	 * @param ctx the parse tree
	 */
	void enterClass(TypeParser.ClassContext ctx);
	/**
	 * Exit a parse tree produced by the {@code class}
	 * labeled alternative in {@link TypeParser#line}.
	 * @param ctx the parse tree
	 */
	void exitClass(TypeParser.ClassContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementt}
	 * labeled alternative in {@link TypeParser#line}.
	 * @param ctx the parse tree
	 */
	void enterStatementt(TypeParser.StatementtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementt}
	 * labeled alternative in {@link TypeParser#line}.
	 * @param ctx the parse tree
	 */
	void exitStatementt(TypeParser.StatementtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code iteration}
	 * labeled alternative in {@link TypeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIteration(TypeParser.IterationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code iteration}
	 * labeled alternative in {@link TypeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIteration(TypeParser.IterationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declarationStatement}
	 * labeled alternative in {@link TypeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationStatement(TypeParser.DeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declarationStatement}
	 * labeled alternative in {@link TypeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationStatement(TypeParser.DeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if}
	 * labeled alternative in {@link TypeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIf(TypeParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if}
	 * labeled alternative in {@link TypeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIf(TypeParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code return}
	 * labeled alternative in {@link TypeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn(TypeParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code return}
	 * labeled alternative in {@link TypeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn(TypeParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code express}
	 * labeled alternative in {@link TypeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExpress(TypeParser.ExpressContext ctx);
	/**
	 * Exit a parse tree produced by the {@code express}
	 * labeled alternative in {@link TypeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExpress(TypeParser.ExpressContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionState}
	 * labeled alternative in {@link TypeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionState(TypeParser.ExpressionStateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionState}
	 * labeled alternative in {@link TypeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionState(TypeParser.ExpressionStateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayCall}
	 * labeled alternative in {@link TypeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterArrayCall(TypeParser.ArrayCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayCall}
	 * labeled alternative in {@link TypeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitArrayCall(TypeParser.ArrayCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dowhile}
	 * labeled alternative in {@link TypeParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterDowhile(TypeParser.DowhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dowhile}
	 * labeled alternative in {@link TypeParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitDowhile(TypeParser.DowhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forEach}
	 * labeled alternative in {@link TypeParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterForEach(TypeParser.ForEachContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forEach}
	 * labeled alternative in {@link TypeParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitForEach(TypeParser.ForEachContext ctx);
	/**
	 * Enter a parse tree produced by the {@code for}
	 * labeled alternative in {@link TypeParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterFor(TypeParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code for}
	 * labeled alternative in {@link TypeParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitFor(TypeParser.ForContext ctx);
	/**
	 * Enter a parse tree produced by the {@code while}
	 * labeled alternative in {@link TypeParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhile(TypeParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while}
	 * labeled alternative in {@link TypeParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhile(TypeParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variable}
	 * labeled alternative in {@link TypeParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariable(TypeParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variable}
	 * labeled alternative in {@link TypeParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariable(TypeParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code function}
	 * labeled alternative in {@link TypeParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunction(TypeParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code function}
	 * labeled alternative in {@link TypeParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunction(TypeParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code array}
	 * labeled alternative in {@link TypeParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterArray(TypeParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code array}
	 * labeled alternative in {@link TypeParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitArray(TypeParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(TypeParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(TypeParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(TypeParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(TypeParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(TypeParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(TypeParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(TypeParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(TypeParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(TypeParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(TypeParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(TypeParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(TypeParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(TypeParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(TypeParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(TypeParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(TypeParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeParser#forEachStatement}.
	 * @param ctx the parse tree
	 */
	void enterForEachStatement(TypeParser.ForEachStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeParser#forEachStatement}.
	 * @param ctx the parse tree
	 */
	void exitForEachStatement(TypeParser.ForEachStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(TypeParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(TypeParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(TypeParser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(TypeParser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeParser#initializationExpression}.
	 * @param ctx the parse tree
	 */
	void enterInitializationExpression(TypeParser.InitializationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeParser#initializationExpression}.
	 * @param ctx the parse tree
	 */
	void exitInitializationExpression(TypeParser.InitializationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeParser#iterationExpression}.
	 * @param ctx the parse tree
	 */
	void enterIterationExpression(TypeParser.IterationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeParser#iterationExpression}.
	 * @param ctx the parse tree
	 */
	void exitIterationExpression(TypeParser.IterationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(TypeParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(TypeParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStatement(TypeParser.DoWhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStatement(TypeParser.DoWhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeParser#strictEqualityExpression}.
	 * @param ctx the parse tree
	 */
	void enterStrictEqualityExpression(TypeParser.StrictEqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeParser#strictEqualityExpression}.
	 * @param ctx the parse tree
	 */
	void exitStrictEqualityExpression(TypeParser.StrictEqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(TypeParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(TypeParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(TypeParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(TypeParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterArrayDeclaration(TypeParser.ArrayDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitArrayDeclaration(TypeParser.ArrayDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeParser#arrayElements}.
	 * @param ctx the parse tree
	 */
	void enterArrayElements(TypeParser.ArrayElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeParser#arrayElements}.
	 * @param ctx the parse tree
	 */
	void exitArrayElements(TypeParser.ArrayElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeParser#arrayMethodCall}.
	 * @param ctx the parse tree
	 */
	void enterArrayMethodCall(TypeParser.ArrayMethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeParser#arrayMethodCall}.
	 * @param ctx the parse tree
	 */
	void exitArrayMethodCall(TypeParser.ArrayMethodCallContext ctx);
}