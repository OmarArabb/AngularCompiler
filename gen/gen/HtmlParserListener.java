// Generated from C:/Users/n_alb/IdeaProjects/AngularCompiler/src/grammer/HtmlParser.g4 by ANTLR 4.13.2
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HtmlParser}.
 */
public interface HtmlParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HtmlParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlContent(HtmlParser.HtmlContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlContent(HtmlParser.HtmlContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#doctypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterDoctypeDeclaration(HtmlParser.DoctypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#doctypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitDoctypeDeclaration(HtmlParser.DoctypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElement(HtmlParser.HtmlElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElement(HtmlParser.HtmlElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#angularDirectiveStatement}.
	 * @param ctx the parse tree
	 */
	void enterAngularDirectiveStatement(HtmlParser.AngularDirectiveStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#angularDirectiveStatement}.
	 * @param ctx the parse tree
	 */
	void exitAngularDirectiveStatement(HtmlParser.AngularDirectiveStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#htmlComment}.
	 * @param ctx the parse tree
	 */
	void enterHtmlComment(HtmlParser.HtmlCommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#htmlComment}.
	 * @param ctx the parse tree
	 */
	void exitHtmlComment(HtmlParser.HtmlCommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#formElement}.
	 * @param ctx the parse tree
	 */
	void enterFormElement(HtmlParser.FormElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#formElement}.
	 * @param ctx the parse tree
	 */
	void exitFormElement(HtmlParser.FormElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#formContent}.
	 * @param ctx the parse tree
	 */
	void enterFormContent(HtmlParser.FormContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#formContent}.
	 * @param ctx the parse tree
	 */
	void exitFormContent(HtmlParser.FormContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#inputElement}.
	 * @param ctx the parse tree
	 */
	void enterInputElement(HtmlParser.InputElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#inputElement}.
	 * @param ctx the parse tree
	 */
	void exitInputElement(HtmlParser.InputElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#textareaElement}.
	 * @param ctx the parse tree
	 */
	void enterTextareaElement(HtmlParser.TextareaElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#textareaElement}.
	 * @param ctx the parse tree
	 */
	void exitTextareaElement(HtmlParser.TextareaElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#buttonElement}.
	 * @param ctx the parse tree
	 */
	void enterButtonElement(HtmlParser.ButtonElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#buttonElement}.
	 * @param ctx the parse tree
	 */
	void exitButtonElement(HtmlParser.ButtonElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#tableElement}.
	 * @param ctx the parse tree
	 */
	void enterTableElement(HtmlParser.TableElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#tableElement}.
	 * @param ctx the parse tree
	 */
	void exitTableElement(HtmlParser.TableElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#tableRow}.
	 * @param ctx the parse tree
	 */
	void enterTableRow(HtmlParser.TableRowContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#tableRow}.
	 * @param ctx the parse tree
	 */
	void exitTableRow(HtmlParser.TableRowContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#tableHeader}.
	 * @param ctx the parse tree
	 */
	void enterTableHeader(HtmlParser.TableHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#tableHeader}.
	 * @param ctx the parse tree
	 */
	void exitTableHeader(HtmlParser.TableHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#tableCell}.
	 * @param ctx the parse tree
	 */
	void enterTableCell(HtmlParser.TableCellContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#tableCell}.
	 * @param ctx the parse tree
	 */
	void exitTableCell(HtmlParser.TableCellContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#listitem}.
	 * @param ctx the parse tree
	 */
	void enterListitem(HtmlParser.ListitemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#listitem}.
	 * @param ctx the parse tree
	 */
	void exitListitem(HtmlParser.ListitemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#unorderedList}.
	 * @param ctx the parse tree
	 */
	void enterUnorderedList(HtmlParser.UnorderedListContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#unorderedList}.
	 * @param ctx the parse tree
	 */
	void exitUnorderedList(HtmlParser.UnorderedListContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#orderedList}.
	 * @param ctx the parse tree
	 */
	void enterOrderedList(HtmlParser.OrderedListContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#orderedList}.
	 * @param ctx the parse tree
	 */
	void exitOrderedList(HtmlParser.OrderedListContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#anchorTag}.
	 * @param ctx the parse tree
	 */
	void enterAnchorTag(HtmlParser.AnchorTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#anchorTag}.
	 * @param ctx the parse tree
	 */
	void exitAnchorTag(HtmlParser.AnchorTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#imgTag}.
	 * @param ctx the parse tree
	 */
	void enterImgTag(HtmlParser.ImgTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#imgTag}.
	 * @param ctx the parse tree
	 */
	void exitImgTag(HtmlParser.ImgTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#headContent}.
	 * @param ctx the parse tree
	 */
	void enterHeadContent(HtmlParser.HeadContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#headContent}.
	 * @param ctx the parse tree
	 */
	void exitHeadContent(HtmlParser.HeadContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#headElement}.
	 * @param ctx the parse tree
	 */
	void enterHeadElement(HtmlParser.HeadElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#headElement}.
	 * @param ctx the parse tree
	 */
	void exitHeadElement(HtmlParser.HeadElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#titleTag}.
	 * @param ctx the parse tree
	 */
	void enterTitleTag(HtmlParser.TitleTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#titleTag}.
	 * @param ctx the parse tree
	 */
	void exitTitleTag(HtmlParser.TitleTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#bodyContent}.
	 * @param ctx the parse tree
	 */
	void enterBodyContent(HtmlParser.BodyContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#bodyContent}.
	 * @param ctx the parse tree
	 */
	void exitBodyContent(HtmlParser.BodyContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#bodyElement}.
	 * @param ctx the parse tree
	 */
	void enterBodyElement(HtmlParser.BodyElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#bodyElement}.
	 * @param ctx the parse tree
	 */
	void exitBodyElement(HtmlParser.BodyElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#boldTextElement}.
	 * @param ctx the parse tree
	 */
	void enterBoldTextElement(HtmlParser.BoldTextElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#boldTextElement}.
	 * @param ctx the parse tree
	 */
	void exitBoldTextElement(HtmlParser.BoldTextElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#italicTextElement}.
	 * @param ctx the parse tree
	 */
	void enterItalicTextElement(HtmlParser.ItalicTextElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#italicTextElement}.
	 * @param ctx the parse tree
	 */
	void exitItalicTextElement(HtmlParser.ItalicTextElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#underlineTextElement}.
	 * @param ctx the parse tree
	 */
	void enterUnderlineTextElement(HtmlParser.UnderlineTextElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#underlineTextElement}.
	 * @param ctx the parse tree
	 */
	void exitUnderlineTextElement(HtmlParser.UnderlineTextElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#breakLineElement}.
	 * @param ctx the parse tree
	 */
	void enterBreakLineElement(HtmlParser.BreakLineElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#breakLineElement}.
	 * @param ctx the parse tree
	 */
	void exitBreakLineElement(HtmlParser.BreakLineElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#spanElement}.
	 * @param ctx the parse tree
	 */
	void enterSpanElement(HtmlParser.SpanElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#spanElement}.
	 * @param ctx the parse tree
	 */
	void exitSpanElement(HtmlParser.SpanElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#textContent}.
	 * @param ctx the parse tree
	 */
	void enterTextContent(HtmlParser.TextContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#textContent}.
	 * @param ctx the parse tree
	 */
	void exitTextContent(HtmlParser.TextContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#h1Element}.
	 * @param ctx the parse tree
	 */
	void enterH1Element(HtmlParser.H1ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#h1Element}.
	 * @param ctx the parse tree
	 */
	void exitH1Element(HtmlParser.H1ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#h2Element}.
	 * @param ctx the parse tree
	 */
	void enterH2Element(HtmlParser.H2ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#h2Element}.
	 * @param ctx the parse tree
	 */
	void exitH2Element(HtmlParser.H2ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#h3Element}.
	 * @param ctx the parse tree
	 */
	void enterH3Element(HtmlParser.H3ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#h3Element}.
	 * @param ctx the parse tree
	 */
	void exitH3Element(HtmlParser.H3ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#h4Element}.
	 * @param ctx the parse tree
	 */
	void enterH4Element(HtmlParser.H4ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#h4Element}.
	 * @param ctx the parse tree
	 */
	void exitH4Element(HtmlParser.H4ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#h5Element}.
	 * @param ctx the parse tree
	 */
	void enterH5Element(HtmlParser.H5ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#h5Element}.
	 * @param ctx the parse tree
	 */
	void exitH5Element(HtmlParser.H5ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#h6Element}.
	 * @param ctx the parse tree
	 */
	void enterH6Element(HtmlParser.H6ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#h6Element}.
	 * @param ctx the parse tree
	 */
	void exitH6Element(HtmlParser.H6ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#pElement}.
	 * @param ctx the parse tree
	 */
	void enterPElement(HtmlParser.PElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#pElement}.
	 * @param ctx the parse tree
	 */
	void exitPElement(HtmlParser.PElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(HtmlParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(HtmlParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code importState}
	 * labeled alternative in {@link HtmlParser#line}.
	 * @param ctx the parse tree
	 */
	void enterImportState(HtmlParser.ImportStateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code importState}
	 * labeled alternative in {@link HtmlParser#line}.
	 * @param ctx the parse tree
	 */
	void exitImportState(HtmlParser.ImportStateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code class}
	 * labeled alternative in {@link HtmlParser#line}.
	 * @param ctx the parse tree
	 */
	void enterClass(HtmlParser.ClassContext ctx);
	/**
	 * Exit a parse tree produced by the {@code class}
	 * labeled alternative in {@link HtmlParser#line}.
	 * @param ctx the parse tree
	 */
	void exitClass(HtmlParser.ClassContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementt}
	 * labeled alternative in {@link HtmlParser#line}.
	 * @param ctx the parse tree
	 */
	void enterStatementt(HtmlParser.StatementtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementt}
	 * labeled alternative in {@link HtmlParser#line}.
	 * @param ctx the parse tree
	 */
	void exitStatementt(HtmlParser.StatementtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code iteration}
	 * labeled alternative in {@link HtmlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIteration(HtmlParser.IterationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code iteration}
	 * labeled alternative in {@link HtmlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIteration(HtmlParser.IterationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declarationStatement}
	 * labeled alternative in {@link HtmlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationStatement(HtmlParser.DeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declarationStatement}
	 * labeled alternative in {@link HtmlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationStatement(HtmlParser.DeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if}
	 * labeled alternative in {@link HtmlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIf(HtmlParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if}
	 * labeled alternative in {@link HtmlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIf(HtmlParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code return}
	 * labeled alternative in {@link HtmlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn(HtmlParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code return}
	 * labeled alternative in {@link HtmlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn(HtmlParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code express}
	 * labeled alternative in {@link HtmlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExpress(HtmlParser.ExpressContext ctx);
	/**
	 * Exit a parse tree produced by the {@code express}
	 * labeled alternative in {@link HtmlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExpress(HtmlParser.ExpressContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionState}
	 * labeled alternative in {@link HtmlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionState(HtmlParser.ExpressionStateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionState}
	 * labeled alternative in {@link HtmlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionState(HtmlParser.ExpressionStateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayCall}
	 * labeled alternative in {@link HtmlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterArrayCall(HtmlParser.ArrayCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayCall}
	 * labeled alternative in {@link HtmlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitArrayCall(HtmlParser.ArrayCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dowhile}
	 * labeled alternative in {@link HtmlParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterDowhile(HtmlParser.DowhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dowhile}
	 * labeled alternative in {@link HtmlParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitDowhile(HtmlParser.DowhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forEach}
	 * labeled alternative in {@link HtmlParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterForEach(HtmlParser.ForEachContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forEach}
	 * labeled alternative in {@link HtmlParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitForEach(HtmlParser.ForEachContext ctx);
	/**
	 * Enter a parse tree produced by the {@code for}
	 * labeled alternative in {@link HtmlParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterFor(HtmlParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code for}
	 * labeled alternative in {@link HtmlParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitFor(HtmlParser.ForContext ctx);
	/**
	 * Enter a parse tree produced by the {@code while}
	 * labeled alternative in {@link HtmlParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhile(HtmlParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while}
	 * labeled alternative in {@link HtmlParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhile(HtmlParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variable}
	 * labeled alternative in {@link HtmlParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariable(HtmlParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variable}
	 * labeled alternative in {@link HtmlParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariable(HtmlParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code function}
	 * labeled alternative in {@link HtmlParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunction(HtmlParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code function}
	 * labeled alternative in {@link HtmlParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunction(HtmlParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code array}
	 * labeled alternative in {@link HtmlParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterArray(HtmlParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code array}
	 * labeled alternative in {@link HtmlParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitArray(HtmlParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(HtmlParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(HtmlParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(HtmlParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(HtmlParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(HtmlParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(HtmlParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(HtmlParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(HtmlParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(HtmlParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(HtmlParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(HtmlParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(HtmlParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(HtmlParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(HtmlParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(HtmlParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(HtmlParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#forEachStatement}.
	 * @param ctx the parse tree
	 */
	void enterForEachStatement(HtmlParser.ForEachStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#forEachStatement}.
	 * @param ctx the parse tree
	 */
	void exitForEachStatement(HtmlParser.ForEachStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(HtmlParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(HtmlParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(HtmlParser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(HtmlParser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#initializationExpression}.
	 * @param ctx the parse tree
	 */
	void enterInitializationExpression(HtmlParser.InitializationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#initializationExpression}.
	 * @param ctx the parse tree
	 */
	void exitInitializationExpression(HtmlParser.InitializationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#iterationExpression}.
	 * @param ctx the parse tree
	 */
	void enterIterationExpression(HtmlParser.IterationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#iterationExpression}.
	 * @param ctx the parse tree
	 */
	void exitIterationExpression(HtmlParser.IterationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(HtmlParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(HtmlParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStatement(HtmlParser.DoWhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStatement(HtmlParser.DoWhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#strictEqualityExpression}.
	 * @param ctx the parse tree
	 */
	void enterStrictEqualityExpression(HtmlParser.StrictEqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#strictEqualityExpression}.
	 * @param ctx the parse tree
	 */
	void exitStrictEqualityExpression(HtmlParser.StrictEqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(HtmlParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(HtmlParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(HtmlParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(HtmlParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterArrayDeclaration(HtmlParser.ArrayDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitArrayDeclaration(HtmlParser.ArrayDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#arrayElements}.
	 * @param ctx the parse tree
	 */
	void enterArrayElements(HtmlParser.ArrayElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#arrayElements}.
	 * @param ctx the parse tree
	 */
	void exitArrayElements(HtmlParser.ArrayElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#arrayMethodCall}.
	 * @param ctx the parse tree
	 */
	void enterArrayMethodCall(HtmlParser.ArrayMethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#arrayMethodCall}.
	 * @param ctx the parse tree
	 */
	void exitArrayMethodCall(HtmlParser.ArrayMethodCallContext ctx);
}