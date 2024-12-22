// Generated from C:/Users/Omar Arab/IdeaProjects/compilertest/src/HtmlParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HtmlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HtmlParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HtmlParser#htmlContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlContent(HtmlParser.HtmlContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#doctypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoctypeDeclaration(HtmlParser.DoctypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElement(HtmlParser.HtmlElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#htmlComment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlComment(HtmlParser.HtmlCommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#formElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormElement(HtmlParser.FormElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#formContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormContent(HtmlParser.FormContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#inputElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputElement(HtmlParser.InputElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#textareaElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextareaElement(HtmlParser.TextareaElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#buttonElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitButtonElement(HtmlParser.ButtonElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#tableElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableElement(HtmlParser.TableElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#tableRow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableRow(HtmlParser.TableRowContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#tableHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableHeader(HtmlParser.TableHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#tableCell}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableCell(HtmlParser.TableCellContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#listitem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListitem(HtmlParser.ListitemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#unorderedList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnorderedList(HtmlParser.UnorderedListContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#orderedList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderedList(HtmlParser.OrderedListContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#anchorTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnchorTag(HtmlParser.AnchorTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#imgTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImgTag(HtmlParser.ImgTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#headContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeadContent(HtmlParser.HeadContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#headElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeadElement(HtmlParser.HeadElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#titleTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTitleTag(HtmlParser.TitleTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#bodyContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodyContent(HtmlParser.BodyContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#bodyElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodyElement(HtmlParser.BodyElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#boldTextElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoldTextElement(HtmlParser.BoldTextElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#italicTextElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItalicTextElement(HtmlParser.ItalicTextElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#underlineTextElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnderlineTextElement(HtmlParser.UnderlineTextElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#breakLineElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakLineElement(HtmlParser.BreakLineElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#spanElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpanElement(HtmlParser.SpanElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#textContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextContent(HtmlParser.TextContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#h1Element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitH1Element(HtmlParser.H1ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#h2Element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitH2Element(HtmlParser.H2ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#h3Element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitH3Element(HtmlParser.H3ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#h4Element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitH4Element(HtmlParser.H4ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#h5Element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitH5Element(HtmlParser.H5ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#h6Element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitH6Element(HtmlParser.H6ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#pElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPElement(HtmlParser.PElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(HtmlParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(HtmlParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#angularDirectiveStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAngularDirectiveStatement(HtmlParser.AngularDirectiveStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(HtmlParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(HtmlParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(HtmlParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(HtmlParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(HtmlParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(HtmlParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#forEachStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForEachStatement(HtmlParser.ForEachStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#initializationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializationExpression(HtmlParser.InitializationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#conditionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionExpression(HtmlParser.ConditionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#iterationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterationExpression(HtmlParser.IterationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(HtmlParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#doWhileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileStatement(HtmlParser.DoWhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#strictEqualityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrictEqualityExpression(HtmlParser.StrictEqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(HtmlParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(HtmlParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDeclaration(HtmlParser.ArrayDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#arrayElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayElements(HtmlParser.ArrayElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#arrayMethodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayMethodCall(HtmlParser.ArrayMethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(HtmlParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionDeclaratin}
	 * labeled alternative in {@link HtmlParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaratin(HtmlParser.FunctionDeclaratinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableDeclartion}
	 * labeled alternative in {@link HtmlParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclartion(HtmlParser.VariableDeclartionContext ctx);
}