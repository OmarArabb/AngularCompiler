// Generated from C:/Users/Omar Arab/IdeaProjects/untitled5/src/Gammar/ProgramParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ProgramParser}.
 */
public interface ProgramParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ProgramParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ProgramParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ProgramParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code importState}
	 * labeled alternative in {@link ProgramParser#line}.
	 * @param ctx the parse tree
	 */
	void enterImportState(ProgramParser.ImportStateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code importState}
	 * labeled alternative in {@link ProgramParser#line}.
	 * @param ctx the parse tree
	 */
	void exitImportState(ProgramParser.ImportStateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code class}
	 * labeled alternative in {@link ProgramParser#line}.
	 * @param ctx the parse tree
	 */
	void enterClass(ProgramParser.ClassContext ctx);
	/**
	 * Exit a parse tree produced by the {@code class}
	 * labeled alternative in {@link ProgramParser#line}.
	 * @param ctx the parse tree
	 */
	void exitClass(ProgramParser.ClassContext ctx);
	/**
	 * Enter a parse tree produced by the {@code angular}
	 * labeled alternative in {@link ProgramParser#line}.
	 * @param ctx the parse tree
	 */
	void enterAngular(ProgramParser.AngularContext ctx);
	/**
	 * Exit a parse tree produced by the {@code angular}
	 * labeled alternative in {@link ProgramParser#line}.
	 * @param ctx the parse tree
	 */
	void exitAngular(ProgramParser.AngularContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementt}
	 * labeled alternative in {@link ProgramParser#line}.
	 * @param ctx the parse tree
	 */
	void enterStatementt(ProgramParser.StatementtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementt}
	 * labeled alternative in {@link ProgramParser#line}.
	 * @param ctx the parse tree
	 */
	void exitStatementt(ProgramParser.StatementtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code interfaceStatement}
	 * labeled alternative in {@link ProgramParser#line}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceStatement(ProgramParser.InterfaceStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code interfaceStatement}
	 * labeled alternative in {@link ProgramParser#line}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceStatement(ProgramParser.InterfaceStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code iteration}
	 * labeled alternative in {@link ProgramParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIteration(ProgramParser.IterationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code iteration}
	 * labeled alternative in {@link ProgramParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIteration(ProgramParser.IterationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declarationStatement}
	 * labeled alternative in {@link ProgramParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationStatement(ProgramParser.DeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declarationStatement}
	 * labeled alternative in {@link ProgramParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationStatement(ProgramParser.DeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if}
	 * labeled alternative in {@link ProgramParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIf(ProgramParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if}
	 * labeled alternative in {@link ProgramParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIf(ProgramParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code return}
	 * labeled alternative in {@link ProgramParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn(ProgramParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code return}
	 * labeled alternative in {@link ProgramParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn(ProgramParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code express}
	 * labeled alternative in {@link ProgramParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExpress(ProgramParser.ExpressContext ctx);
	/**
	 * Exit a parse tree produced by the {@code express}
	 * labeled alternative in {@link ProgramParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExpress(ProgramParser.ExpressContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dowhile}
	 * labeled alternative in {@link ProgramParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterDowhile(ProgramParser.DowhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dowhile}
	 * labeled alternative in {@link ProgramParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitDowhile(ProgramParser.DowhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code for}
	 * labeled alternative in {@link ProgramParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterFor(ProgramParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code for}
	 * labeled alternative in {@link ProgramParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitFor(ProgramParser.ForContext ctx);
	/**
	 * Enter a parse tree produced by the {@code while}
	 * labeled alternative in {@link ProgramParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhile(ProgramParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while}
	 * labeled alternative in {@link ProgramParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhile(ProgramParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variable}
	 * labeled alternative in {@link ProgramParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariable(ProgramParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variable}
	 * labeled alternative in {@link ProgramParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariable(ProgramParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code function}
	 * labeled alternative in {@link ProgramParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunction(ProgramParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code function}
	 * labeled alternative in {@link ProgramParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunction(ProgramParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code array}
	 * labeled alternative in {@link ProgramParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterArray(ProgramParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code array}
	 * labeled alternative in {@link ProgramParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitArray(ProgramParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code input}
	 * labeled alternative in {@link ProgramParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterInput(ProgramParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code input}
	 * labeled alternative in {@link ProgramParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitInput(ProgramParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code output}
	 * labeled alternative in {@link ProgramParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterOutput(ProgramParser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code output}
	 * labeled alternative in {@link ProgramParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitOutput(ProgramParser.OutputContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#angularType}.
	 * @param ctx the parse tree
	 */
	void enterAngularType(ProgramParser.AngularTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#angularType}.
	 * @param ctx the parse tree
	 */
	void exitAngularType(ProgramParser.AngularTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#map}.
	 * @param ctx the parse tree
	 */
	void enterMap(ProgramParser.MapContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#map}.
	 * @param ctx the parse tree
	 */
	void exitMap(ProgramParser.MapContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#passedParameter}.
	 * @param ctx the parse tree
	 */
	void enterPassedParameter(ProgramParser.PassedParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#passedParameter}.
	 * @param ctx the parse tree
	 */
	void exitPassedParameter(ProgramParser.PassedParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#inputStatement}.
	 * @param ctx the parse tree
	 */
	void enterInputStatement(ProgramParser.InputStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#inputStatement}.
	 * @param ctx the parse tree
	 */
	void exitInputStatement(ProgramParser.InputStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#outputStatement}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatement(ProgramParser.OutputStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#outputStatement}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatement(ProgramParser.OutputStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(ProgramParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(ProgramParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(ProgramParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(ProgramParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(ProgramParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(ProgramParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(ProgramParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(ProgramParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(ProgramParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(ProgramParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(ProgramParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(ProgramParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#elseIfStatement}.
	 * @param ctx the parse tree
	 */
	void enterElseIfStatement(ProgramParser.ElseIfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#elseIfStatement}.
	 * @param ctx the parse tree
	 */
	void exitElseIfStatement(ProgramParser.ElseIfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(ProgramParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(ProgramParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(ProgramParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(ProgramParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStatement(ProgramParser.DoWhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStatement(ProgramParser.DoWhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(ProgramParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(ProgramParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(ProgramParser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(ProgramParser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(ProgramParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(ProgramParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ProgramParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ProgramParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#logicalOperations}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOperations(ProgramParser.LogicalOperationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#logicalOperations}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOperations(ProgramParser.LogicalOperationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#arithmeticOperations}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticOperations(ProgramParser.ArithmeticOperationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#arithmeticOperations}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticOperations(ProgramParser.ArithmeticOperationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#assignmentOperation}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperation(ProgramParser.AssignmentOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#assignmentOperation}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperation(ProgramParser.AssignmentOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#comparsionOperation}.
	 * @param ctx the parse tree
	 */
	void enterComparsionOperation(ProgramParser.ComparsionOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#comparsionOperation}.
	 * @param ctx the parse tree
	 */
	void exitComparsionOperation(ProgramParser.ComparsionOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#memberAccess}.
	 * @param ctx the parse tree
	 */
	void enterMemberAccess(ProgramParser.MemberAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#memberAccess}.
	 * @param ctx the parse tree
	 */
	void exitMemberAccess(ProgramParser.MemberAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#arrowFunction}.
	 * @param ctx the parse tree
	 */
	void enterArrowFunction(ProgramParser.ArrowFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#arrowFunction}.
	 * @param ctx the parse tree
	 */
	void exitArrowFunction(ProgramParser.ArrowFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(ProgramParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(ProgramParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterArrayDeclaration(ProgramParser.ArrayDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitArrayDeclaration(ProgramParser.ArrayDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#arrayRightSide}.
	 * @param ctx the parse tree
	 */
	void enterArrayRightSide(ProgramParser.ArrayRightSideContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#arrayRightSide}.
	 * @param ctx the parse tree
	 */
	void exitArrayRightSide(ProgramParser.ArrayRightSideContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#arrayElements}.
	 * @param ctx the parse tree
	 */
	void enterArrayElements(ProgramParser.ArrayElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#arrayElements}.
	 * @param ctx the parse tree
	 */
	void exitArrayElements(ProgramParser.ArrayElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#interface}.
	 * @param ctx the parse tree
	 */
	void enterInterface(ProgramParser.InterfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#interface}.
	 * @param ctx the parse tree
	 */
	void exitInterface(ProgramParser.InterfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#htmlDoc}.
	 * @param ctx the parse tree
	 */
	void enterHtmlDoc(ProgramParser.HtmlDocContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#htmlDoc}.
	 * @param ctx the parse tree
	 */
	void exitHtmlDoc(ProgramParser.HtmlDocContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#doctype}.
	 * @param ctx the parse tree
	 */
	void enterDoctype(ProgramParser.DoctypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#doctype}.
	 * @param ctx the parse tree
	 */
	void exitDoctype(ProgramParser.DoctypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElement(ProgramParser.HtmlElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElement(ProgramParser.HtmlElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#metaTag}.
	 * @param ctx the parse tree
	 */
	void enterMetaTag(ProgramParser.MetaTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#metaTag}.
	 * @param ctx the parse tree
	 */
	void exitMetaTag(ProgramParser.MetaTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#scriptTag}.
	 * @param ctx the parse tree
	 */
	void enterScriptTag(ProgramParser.ScriptTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#scriptTag}.
	 * @param ctx the parse tree
	 */
	void exitScriptTag(ProgramParser.ScriptTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#styleTag}.
	 * @param ctx the parse tree
	 */
	void enterStyleTag(ProgramParser.StyleTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#styleTag}.
	 * @param ctx the parse tree
	 */
	void exitStyleTag(ProgramParser.StyleTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#styleContent}.
	 * @param ctx the parse tree
	 */
	void enterStyleContent(ProgramParser.StyleContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#styleContent}.
	 * @param ctx the parse tree
	 */
	void exitStyleContent(ProgramParser.StyleContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#cssElement}.
	 * @param ctx the parse tree
	 */
	void enterCssElement(ProgramParser.CssElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#cssElement}.
	 * @param ctx the parse tree
	 */
	void exitCssElement(ProgramParser.CssElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#openTag}.
	 * @param ctx the parse tree
	 */
	void enterOpenTag(ProgramParser.OpenTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#openTag}.
	 * @param ctx the parse tree
	 */
	void exitOpenTag(ProgramParser.OpenTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#closeTag}.
	 * @param ctx the parse tree
	 */
	void enterCloseTag(ProgramParser.CloseTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#closeTag}.
	 * @param ctx the parse tree
	 */
	void exitCloseTag(ProgramParser.CloseTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#selfClosingTag}.
	 * @param ctx the parse tree
	 */
	void enterSelfClosingTag(ProgramParser.SelfClosingTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#selfClosingTag}.
	 * @param ctx the parse tree
	 */
	void exitSelfClosingTag(ProgramParser.SelfClosingTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(ProgramParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(ProgramParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#binding}.
	 * @param ctx the parse tree
	 */
	void enterBinding(ProgramParser.BindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#binding}.
	 * @param ctx the parse tree
	 */
	void exitBinding(ProgramParser.BindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#eventBinding}.
	 * @param ctx the parse tree
	 */
	void enterEventBinding(ProgramParser.EventBindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#eventBinding}.
	 * @param ctx the parse tree
	 */
	void exitEventBinding(ProgramParser.EventBindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#propertyBinding}.
	 * @param ctx the parse tree
	 */
	void enterPropertyBinding(ProgramParser.PropertyBindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#propertyBinding}.
	 * @param ctx the parse tree
	 */
	void exitPropertyBinding(ProgramParser.PropertyBindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#directive}.
	 * @param ctx the parse tree
	 */
	void enterDirective(ProgramParser.DirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#directive}.
	 * @param ctx the parse tree
	 */
	void exitDirective(ProgramParser.DirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#tagContent}.
	 * @param ctx the parse tree
	 */
	void enterTagContent(ProgramParser.TagContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#tagContent}.
	 * @param ctx the parse tree
	 */
	void exitTagContent(ProgramParser.TagContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#content}.
	 * @param ctx the parse tree
	 */
	void enterContent(ProgramParser.ContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#content}.
	 * @param ctx the parse tree
	 */
	void exitContent(ProgramParser.ContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(ProgramParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(ProgramParser.CommentContext ctx);
}