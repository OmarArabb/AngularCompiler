// Generated from C:/Users/Omar Arab/IdeaProjects/untitled5/src/Gammar/ProgramParser.g4 by ANTLR 4.13.2
package Gammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ProgramParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ProgramParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ProgramParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ProgramParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code importState}
	 * labeled alternative in {@link ProgramParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportState(ProgramParser.ImportStateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code class}
	 * labeled alternative in {@link ProgramParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass(ProgramParser.ClassContext ctx);
	/**
	 * Visit a parse tree produced by the {@code angular}
	 * labeled alternative in {@link ProgramParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAngular(ProgramParser.AngularContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementt}
	 * labeled alternative in {@link ProgramParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementt(ProgramParser.StatementtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code interfaceStatement}
	 * labeled alternative in {@link ProgramParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceStatement(ProgramParser.InterfaceStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code iteration}
	 * labeled alternative in {@link ProgramParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIteration(ProgramParser.IterationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declarationStatement}
	 * labeled alternative in {@link ProgramParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationStatement(ProgramParser.DeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if}
	 * labeled alternative in {@link ProgramParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(ProgramParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code return}
	 * labeled alternative in {@link ProgramParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(ProgramParser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code express}
	 * labeled alternative in {@link ProgramParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpress(ProgramParser.ExpressContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dowhile}
	 * labeled alternative in {@link ProgramParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDowhile(ProgramParser.DowhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code for}
	 * labeled alternative in {@link ProgramParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(ProgramParser.ForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code while}
	 * labeled alternative in {@link ProgramParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(ProgramParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variable}
	 * labeled alternative in {@link ProgramParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(ProgramParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code function}
	 * labeled alternative in {@link ProgramParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(ProgramParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code array}
	 * labeled alternative in {@link ProgramParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(ProgramParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code input}
	 * labeled alternative in {@link ProgramParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(ProgramParser.InputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code output}
	 * labeled alternative in {@link ProgramParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput(ProgramParser.OutputContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramParser#angularType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAngularType(ProgramParser.AngularTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramParser#map}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap(ProgramParser.MapContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramParser#passedParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPassedParameter(ProgramParser.PassedParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramParser#inputStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputStatement(ProgramParser.InputStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramParser#outputStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatement(ProgramParser.OutputStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(ProgramParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(ProgramParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(ProgramParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(ProgramParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(ProgramParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(ProgramParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramParser#elseIfStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIfStatement(ProgramParser.ElseIfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(ProgramParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(ProgramParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramParser#doWhileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileStatement(ProgramParser.DoWhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(ProgramParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramParser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatement(ProgramParser.ImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(ProgramParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(ProgramParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramParser#logicalOperations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOperations(ProgramParser.LogicalOperationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramParser#arithmeticOperations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticOperations(ProgramParser.ArithmeticOperationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramParser#assignmentOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperation(ProgramParser.AssignmentOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramParser#comparsionOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparsionOperation(ProgramParser.ComparsionOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramParser#memberAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberAccess(ProgramParser.MemberAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramParser#arrowFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowFunction(ProgramParser.ArrowFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(ProgramParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDeclaration(ProgramParser.ArrayDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramParser#arrayRightSide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayRightSide(ProgramParser.ArrayRightSideContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramParser#arrayElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayElements(ProgramParser.ArrayElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramParser#interface}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface(ProgramParser.InterfaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramParser#htmlDoc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlDoc(ProgramParser.HtmlDocContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramParser#doctype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoctype(ProgramParser.DoctypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElement(ProgramParser.HtmlElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramParser#metaTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetaTag(ProgramParser.MetaTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramParser#scriptTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScriptTag(ProgramParser.ScriptTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramParser#styleTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleTag(ProgramParser.StyleTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramParser#styleContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleContent(ProgramParser.StyleContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramParser#cssElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssElement(ProgramParser.CssElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramParser#openTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenTag(ProgramParser.OpenTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramParser#closeTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloseTag(ProgramParser.CloseTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramParser#selfClosingTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfClosingTag(ProgramParser.SelfClosingTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(ProgramParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramParser#binding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinding(ProgramParser.BindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramParser#eventBinding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventBinding(ProgramParser.EventBindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramParser#propertyBinding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyBinding(ProgramParser.PropertyBindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramParser#directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirective(ProgramParser.DirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramParser#tagContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagContent(ProgramParser.TagContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent(ProgramParser.ContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(ProgramParser.CommentContext ctx);
}