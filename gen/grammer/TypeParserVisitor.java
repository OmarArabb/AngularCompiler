// Generated from C:/Users/n_alb/IdeaProjects/AngularCompiler/src/grammer/TypeParser.g4 by ANTLR 4.13.2
package grammer;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TypeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TypeParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TypeParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(TypeParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code importState}
	 * labeled alternative in {@link TypeParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportState(TypeParser.ImportStateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code class}
	 * labeled alternative in {@link TypeParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass(TypeParser.ClassContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementt}
	 * labeled alternative in {@link TypeParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementt(TypeParser.StatementtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code iteration}
	 * labeled alternative in {@link TypeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIteration(TypeParser.IterationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declarationStatement}
	 * labeled alternative in {@link TypeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationStatement(TypeParser.DeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if}
	 * labeled alternative in {@link TypeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(TypeParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code return}
	 * labeled alternative in {@link TypeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(TypeParser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code express}
	 * labeled alternative in {@link TypeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpress(TypeParser.ExpressContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionState}
	 * labeled alternative in {@link TypeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionState(TypeParser.ExpressionStateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayCall}
	 * labeled alternative in {@link TypeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCall(TypeParser.ArrayCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dowhile}
	 * labeled alternative in {@link TypeParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDowhile(TypeParser.DowhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forEach}
	 * labeled alternative in {@link TypeParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForEach(TypeParser.ForEachContext ctx);
	/**
	 * Visit a parse tree produced by the {@code for}
	 * labeled alternative in {@link TypeParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(TypeParser.ForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code while}
	 * labeled alternative in {@link TypeParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(TypeParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variable}
	 * labeled alternative in {@link TypeParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(TypeParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code function}
	 * labeled alternative in {@link TypeParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(TypeParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code array}
	 * labeled alternative in {@link TypeParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(TypeParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(TypeParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(TypeParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(TypeParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(TypeParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(TypeParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(TypeParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(TypeParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(TypeParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeParser#forEachStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForEachStatement(TypeParser.ForEachStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(TypeParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeParser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatement(TypeParser.ImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeParser#initializationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializationExpression(TypeParser.InitializationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeParser#iterationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterationExpression(TypeParser.IterationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(TypeParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeParser#doWhileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileStatement(TypeParser.DoWhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeParser#strictEqualityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrictEqualityExpression(TypeParser.StrictEqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(TypeParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(TypeParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDeclaration(TypeParser.ArrayDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeParser#arrayElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayElements(TypeParser.ArrayElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeParser#arrayMethodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayMethodCall(TypeParser.ArrayMethodCallContext ctx);
}