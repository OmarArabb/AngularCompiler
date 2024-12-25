// Generated from C:/Users/n_alb/IdeaProjects/AngularCompiler/src/grammer/Parser.g4 by ANTLR 4.13.2
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Parser}.
 */
public interface ParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code importState}
	 * labeled alternative in {@link Parser#line}.
	 * @param ctx the parse tree
	 */
	void enterImportState(Parser.ImportStateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code importState}
	 * labeled alternative in {@link Parser#line}.
	 * @param ctx the parse tree
	 */
	void exitImportState(Parser.ImportStateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code class}
	 * labeled alternative in {@link Parser#line}.
	 * @param ctx the parse tree
	 */
	void enterClass(Parser.ClassContext ctx);
	/**
	 * Exit a parse tree produced by the {@code class}
	 * labeled alternative in {@link Parser#line}.
	 * @param ctx the parse tree
	 */
	void exitClass(Parser.ClassContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statemen}
	 * labeled alternative in {@link Parser#line}.
	 * @param ctx the parse tree
	 */
	void enterStatemen(Parser.StatemenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statemen}
	 * labeled alternative in {@link Parser#line}.
	 * @param ctx the parse tree
	 */
	void exitStatemen(Parser.StatemenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code iteration}
	 * labeled alternative in {@link Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIteration(Parser.IterationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code iteration}
	 * labeled alternative in {@link Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIteration(Parser.IterationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declarationStatement}
	 * labeled alternative in {@link Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationStatement(Parser.DeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declarationStatement}
	 * labeled alternative in {@link Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationStatement(Parser.DeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if}
	 * labeled alternative in {@link Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIf(Parser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if}
	 * labeled alternative in {@link Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIf(Parser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code return}
	 * labeled alternative in {@link Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn(Parser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code return}
	 * labeled alternative in {@link Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn(Parser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expre}
	 * labeled alternative in {@link Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExpre(Parser.ExpreContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expre}
	 * labeled alternative in {@link Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExpre(Parser.ExpreContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressions}
	 * labeled alternative in {@link Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExpressions(Parser.ExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressions}
	 * labeled alternative in {@link Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExpressions(Parser.ExpressionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayCall}
	 * labeled alternative in {@link Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterArrayCall(Parser.ArrayCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayCall}
	 * labeled alternative in {@link Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitArrayCall(Parser.ArrayCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dowhile}
	 * labeled alternative in {@link Parser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterDowhile(Parser.DowhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dowhile}
	 * labeled alternative in {@link Parser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitDowhile(Parser.DowhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forEach}
	 * labeled alternative in {@link Parser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterForEach(Parser.ForEachContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forEach}
	 * labeled alternative in {@link Parser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitForEach(Parser.ForEachContext ctx);
	/**
	 * Enter a parse tree produced by the {@code for}
	 * labeled alternative in {@link Parser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterFor(Parser.ForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code for}
	 * labeled alternative in {@link Parser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitFor(Parser.ForContext ctx);
	/**
	 * Enter a parse tree produced by the {@code while}
	 * labeled alternative in {@link Parser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhile(Parser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while}
	 * labeled alternative in {@link Parser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhile(Parser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variable}
	 * labeled alternative in {@link Parser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariable(Parser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variable}
	 * labeled alternative in {@link Parser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariable(Parser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code function}
	 * labeled alternative in {@link Parser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunction(Parser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code function}
	 * labeled alternative in {@link Parser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunction(Parser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code array}
	 * labeled alternative in {@link Parser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterArray(Parser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code array}
	 * labeled alternative in {@link Parser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitArray(Parser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(Parser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(Parser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(Parser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(Parser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(Parser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(Parser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(Parser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(Parser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(Parser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(Parser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(Parser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(Parser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(Parser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(Parser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#forEachStatement}.
	 * @param ctx the parse tree
	 */
	void enterForEachStatement(Parser.ForEachStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#forEachStatement}.
	 * @param ctx the parse tree
	 */
	void exitForEachStatement(Parser.ForEachStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(Parser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(Parser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(Parser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(Parser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#initializationExpression}.
	 * @param ctx the parse tree
	 */
	void enterInitializationExpression(Parser.InitializationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#initializationExpression}.
	 * @param ctx the parse tree
	 */
	void exitInitializationExpression(Parser.InitializationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#iterationExpression}.
	 * @param ctx the parse tree
	 */
	void enterIterationExpression(Parser.IterationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#iterationExpression}.
	 * @param ctx the parse tree
	 */
	void exitIterationExpression(Parser.IterationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(Parser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(Parser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStatement(Parser.DoWhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStatement(Parser.DoWhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#strictEqualityExpression}.
	 * @param ctx the parse tree
	 */
	void enterStrictEqualityExpression(Parser.StrictEqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#strictEqualityExpression}.
	 * @param ctx the parse tree
	 */
	void exitStrictEqualityExpression(Parser.StrictEqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(Parser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(Parser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(Parser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#arrayDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterArrayDeclaration(Parser.ArrayDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#arrayDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitArrayDeclaration(Parser.ArrayDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#arrayElements}.
	 * @param ctx the parse tree
	 */
	void enterArrayElements(Parser.ArrayElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#arrayElements}.
	 * @param ctx the parse tree
	 */
	void exitArrayElements(Parser.ArrayElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#arrayMethodCall}.
	 * @param ctx the parse tree
	 */
	void enterArrayMethodCall(Parser.ArrayMethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#arrayMethodCall}.
	 * @param ctx the parse tree
	 */
	void exitArrayMethodCall(Parser.ArrayMethodCallContext ctx);
}