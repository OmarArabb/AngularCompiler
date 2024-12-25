// Generated from C:/Users/Omar Arab/IdeaProjects/compilertest/src/Parser.g4 by ANTLR 4.13.2
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
	/**
	 * Visit a parse tree produced by {@link Parser#htmlContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlContent(Parser.HtmlContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#doctypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoctypeDeclaration(Parser.DoctypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElement(Parser.HtmlElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#angularDirectiveStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAngularDirectiveStatement(Parser.AngularDirectiveStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#htmlComment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlComment(Parser.HtmlCommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#formElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormElement(Parser.FormElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#formContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormContent(Parser.FormContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#inputElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputElement(Parser.InputElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#textareaElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextareaElement(Parser.TextareaElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#buttonElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitButtonElement(Parser.ButtonElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#tableElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableElement(Parser.TableElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#tableRow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableRow(Parser.TableRowContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#tableHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableHeader(Parser.TableHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#tableCell}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableCell(Parser.TableCellContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#listitem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListitem(Parser.ListitemContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#unorderedList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnorderedList(Parser.UnorderedListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#orderedList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderedList(Parser.OrderedListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#anchorTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnchorTag(Parser.AnchorTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#imgTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImgTag(Parser.ImgTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#headContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeadContent(Parser.HeadContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#headElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeadElement(Parser.HeadElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#titleTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTitleTag(Parser.TitleTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#bodyContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodyContent(Parser.BodyContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#bodyElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodyElement(Parser.BodyElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#boldTextElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoldTextElement(Parser.BoldTextElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#italicTextElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItalicTextElement(Parser.ItalicTextElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#underlineTextElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnderlineTextElement(Parser.UnderlineTextElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#breakLineElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakLineElement(Parser.BreakLineElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#spanElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpanElement(Parser.SpanElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#textContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextContent(Parser.TextContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#h1Element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitH1Element(Parser.H1ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#h2Element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitH2Element(Parser.H2ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#h3Element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitH3Element(Parser.H3ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#h4Element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitH4Element(Parser.H4ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#h5Element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitH5Element(Parser.H5ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#h6Element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitH6Element(Parser.H6ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#pElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPElement(Parser.PElementContext ctx);
}