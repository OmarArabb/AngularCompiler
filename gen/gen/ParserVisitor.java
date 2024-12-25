// Generated from C:/Users/n_alb/IdeaProjects/AngularCompiler/src/grammer/Parser.g4 by ANTLR 4.13.2
package gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Parser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(Parser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code importState}
	 * labeled alternative in {@link Parser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportState(Parser.ImportStateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code class}
	 * labeled alternative in {@link Parser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass(Parser.ClassContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statemen}
	 * labeled alternative in {@link Parser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatemen(Parser.StatemenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code iteration}
	 * labeled alternative in {@link Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIteration(Parser.IterationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declarationStatement}
	 * labeled alternative in {@link Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationStatement(Parser.DeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if}
	 * labeled alternative in {@link Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(Parser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code return}
	 * labeled alternative in {@link Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(Parser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expre}
	 * labeled alternative in {@link Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpre(Parser.ExpreContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressions}
	 * labeled alternative in {@link Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressions(Parser.ExpressionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayCall}
	 * labeled alternative in {@link Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCall(Parser.ArrayCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dowhile}
	 * labeled alternative in {@link Parser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDowhile(Parser.DowhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forEach}
	 * labeled alternative in {@link Parser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForEach(Parser.ForEachContext ctx);
	/**
	 * Visit a parse tree produced by the {@code for}
	 * labeled alternative in {@link Parser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(Parser.ForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code while}
	 * labeled alternative in {@link Parser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(Parser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variable}
	 * labeled alternative in {@link Parser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(Parser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code function}
	 * labeled alternative in {@link Parser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(Parser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code array}
	 * labeled alternative in {@link Parser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(Parser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(Parser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(Parser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(Parser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(Parser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(Parser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(Parser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(Parser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#forEachStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForEachStatement(Parser.ForEachStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(Parser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatement(Parser.ImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#initializationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializationExpression(Parser.InitializationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#iterationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterationExpression(Parser.IterationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(Parser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#doWhileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileStatement(Parser.DoWhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#strictEqualityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrictEqualityExpression(Parser.StrictEqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(Parser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(Parser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#arrayDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDeclaration(Parser.ArrayDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#arrayElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayElements(Parser.ArrayElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#arrayMethodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayMethodCall(Parser.ArrayMethodCallContext ctx);
}