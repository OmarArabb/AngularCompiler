import Ast.HTML.*;
import Ast.TypeScripts.Angular.AngularType;
import Ast.TypeScripts.Angular.InputStatement;
import Ast.TypeScripts.Angular.OutputStatement;
import Ast.TypeScripts.*;
import Ast.TypeScripts.Expression.*;
import Ast.TypeScripts.Program;
import Gammar.ProgramParserBaseVisitor;
import SymbolTable.SymbolTable;
import Gammar.ProgramParser;
import SymbolTable.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ProgramVisitor extends ProgramParserBaseVisitor<Object> {

    public SymbolTable symbolTable = new SymbolTable();


    @Override
    public Program visitProgram(ProgramParser.ProgramContext ctx) {















        Program program = new Program();
        List<Line> lines = new ArrayList<>();
        if (!ctx.line().isEmpty()) {
            for (ProgramParser.LineContext lineCtx : ctx.line()) {
                lines.add((Line) visit(lineCtx));
            }
            program.setLines(lines);
        }else if(ctx.htmlDoc() != null){
            program.setHtmlDocNode(visitHtmlDoc(ctx.htmlDoc()));
        }

        return program;
    }

    @Override
    public OutputStatement visitOutputStatement(ProgramParser.OutputStatementContext ctx) {
        String identifier = !ctx.IDENTIFIER().isEmpty() ? ctx.IDENTIFIER(0).getText() : null;
        VariableDeclaration variableDeclaration = (VariableDeclaration) visit(ctx.variableDeclaration());
        return new OutputStatement(identifier, variableDeclaration);
    }

    @Override
    public MapExpression visitMap(ProgramParser.MapContext ctx) {
        List<PassedParameter> passedParameters =
                ctx.passedParameter().stream()
                        .map(paramCtx -> (PassedParameter) visit(paramCtx))
                        .collect(Collectors.toList());
        return new MapExpression(passedParameters);
    }

    @Override
    public InputStatement visitInputStatement(ProgramParser.InputStatementContext ctx) {
        List<Parameter> parameters = ctx.parameters() != null ? ctx.parameters().parameter().stream().map(paramCtx -> (Parameter) visit(paramCtx)).collect(Collectors.toList()) : null;
        String identifier = !ctx.IDENTIFIER().isEmpty() ? ctx.IDENTIFIER(1).getText() : null;
        String type = ctx.TYPE() != null ? ctx.TYPE().getText() : null;
        return new InputStatement(parameters, identifier, type);
    }

    @Override
    public AngularType visitAngularType(ProgramParser.AngularTypeContext ctx) {
        String type = ctx.IDENTIFIER().getText();
        List<PassedParameter> namedAndRequiredParameters = ctx.map().passedParameter().stream().map(paramCtx -> (PassedParameter) visit(paramCtx)).collect(Collectors.toList());
        ClassDeclaration classDeclaration = (ClassDeclaration) visit(ctx.classDeclaration());
        return new AngularType(type, namedAndRequiredParameters, classDeclaration);
    }

    @Override
    public PassedParameter visitPassedParameter(ProgramParser.PassedParameterContext ctx) {
        String identifier = !ctx.IDENTIFIER().isEmpty() ? ctx.IDENTIFIER(0).getText() : "";
        Object value = null;
        if (ctx.NUMBER() != null) {
            value = Double.parseDouble(ctx.NUMBER().getText());
        } else if (ctx.BOOLEAN() != null) {
            value = Boolean.parseBoolean(ctx.BOOLEAN().getText());
        } else if (ctx.STRING() != null) {
            value = ctx.STRING().getText();
        } else if (ctx.arrayRightSide() != null) {
            value = visit(ctx.arrayRightSide());
        } else if (ctx.arrowFunction() != null) {
            value = visit(ctx.arrowFunction());
        }
        return new PassedParameter(identifier, value);
    }

    @Override
    public ImportStatement visitImportStatement(ProgramParser.ImportStatementContext ctx) {
        boolean isWildcard = ctx.TIMES() != null;
        List<String> identifiers = new ArrayList<>();
        for (int i = 0; i < ctx.IDENTIFIER().size(); i++) {
            identifiers.add(ctx.IDENTIFIER(i).getText());
        }
        String from = ctx.STRING().getText();
        return new ImportStatement(isWildcard, identifiers, from);
    }

    @Override
    public ClassDeclaration visitClassDeclaration(ProgramParser.ClassDeclarationContext ctx) {
        boolean isExported = ctx.EXPORT() != null;
        String identifier = ctx.IDENTIFIER(0).getText();
        String extend = ctx.EXTEND() != null ? ctx.IDENTIFIER(1).getText() : null;
        Row row = new Row(identifier, "--", "Class", "--", Integer.toString(ctx.LBRACE().getSymbol().getLine()), Integer.toString(ctx.RBRACE().getSymbol().getLine()));
        symbolTable.getSymbolTable().add(row);
        List<Declaration> declarations = ctx.declaration().stream()
                .map(declarationCtx -> (Declaration) visit(declarationCtx))
                .collect(Collectors.toList());
        for (int i = 0; i < declarations.size(); i++) {
            declarations.get(i).access = ctx.ACCESS_TYPE(i) != null ? ctx.ACCESS_TYPE(i).getText() : "private";
        }

        return new ClassDeclaration(isExported, identifier, extend, declarations);
    }

    @Override
    public VariableDeclaration visitVariableDeclaration(ProgramParser.VariableDeclarationContext ctx) {
        boolean isExported = ctx.EXPORT() != null;
        String variableTe = ctx.VARIABLE_TYPE() != null ? ctx.VARIABLE_TYPE().getText() : "";
        String identifier = ctx.IDENTIFIER().getText();
        String type = (ctx.TYPE() != null ? ctx.TYPE().getText() : "");
        Expression expression = ctx.expression() != null ? visitExpression(ctx.expression()) : null;

        Row row = new Row(identifier, "Data Te " + type, "Variable", (expression != null ? expression.toString() : "--"), Integer.toString(ctx.IDENTIFIER().getSymbol().getLine()), "--");
        symbolTable.getSymbolTable().add(row);
        return new VariableDeclaration(isExported, ctx.NEW() != null, variableTe, identifier, type, expression);
    }

    @Override
    public FunctionDeclaration visitFunctionDeclaration(ProgramParser.FunctionDeclarationContext ctx) {
        boolean function = ctx.FUNCTION() != null;
        String identifier = ctx.IDENTIFIER().getText();
        List<Parameter> parameters = visitParameters(ctx.parameters());
        String returnTe = ctx.TYPE() != null ? ctx.TYPE().getText() : null;
        Row row = new Row(identifier, "Return Te : " + (returnTe == null ? "any" : returnTe), "Function", "--", Integer.toString(ctx.block().LBRACE().getSymbol().getLine()), Integer.toString(ctx.block().RBRACE().getSymbol().getLine()));
        symbolTable.getSymbolTable().add(row);
        Block block = (Block) visit(ctx.block());
        return new FunctionDeclaration(identifier, function, parameters, returnTe, block);
    }

    @Override
    public Block visitBlock(ProgramParser.BlockContext ctx) {
        List<Statement> statements = ctx.statement().stream()
                .map(stmtCtx -> (Statement) visit(stmtCtx))
                .collect(Collectors.toList());
        return new Block(statements);
    }

    @Override
    public IfStatement visitIfStatement(ProgramParser.IfStatementContext ctx) {
        Expression condition = (Expression) visit(ctx.expression());
        Block block = (Block) visit(ctx.block(0));
        List<ElseIfStatement> elseIfStatements = new ArrayList<>();
        for (ProgramParser.ElseIfStatementContext elseIfCtx : ctx.elseIfStatement()) {
            elseIfStatements.add(visitElseIfStatement(elseIfCtx));
        }
        Block elseBlock = ctx.ELSE() != null ? visitBlock(ctx.block(1)) : null;
        return new IfStatement(condition, block, elseIfStatements, elseBlock);
    }

    @Override
    public ElseIfStatement visitElseIfStatement(ProgramParser.ElseIfStatementContext ctx) {
        Expression condition = (Expression) visit(ctx.expression());
        Block block = visitBlock(ctx.block());
        return new ElseIfStatement(condition, block);
    }

    @Override
    public ReturnStatement visitReturnStatement(ProgramParser.ReturnStatementContext ctx) {
        Expression expression = ctx.expression() != null ? (Expression) visit(ctx.expression()) : null;
        ArrayRightSide arrayRightSide = ctx.arrayRightSide() != null ? visitArrayRightSide(ctx.arrayRightSide()) : null;
        return new ReturnStatement(expression, arrayRightSide);
    }

    @Override
    public Expression visitExpression(ProgramParser.ExpressionContext ctx) {
        if (ctx.LPAREN() != null && ctx.RPAREN() != null) {
            return (Expression) visit(ctx.expression(0));
        } else if (ctx.map() != null) {
            return (Expression) visit(ctx.map());
        } else if (ctx.SEMICOLON() != null) {
            return (Expression) visit(ctx.expression(0));
        } else if (ctx.logicalOperations() != null) {
            Expression left = (Expression) visit(ctx.expression(0));
            String operator = ctx.logicalOperations().getText();
            Expression right = (Expression) visit(ctx.expression(1));
            return new BinaryExpression(left, operator, right);
        } else if (ctx.arithmeticOperations() != null) {
            Expression left = (Expression) visit(ctx.expression(0));
            String operator = ctx.arithmeticOperations().getText();
            Expression right = (Expression) visit(ctx.expression(1));
            return new BinaryExpression(left, operator, right);
        } else if (ctx.assignmentOperation() != null) {
            Expression left = (Expression) visit(ctx.expression(0));
            String operator = ctx.assignmentOperation().getText();
            Expression right = (Expression) visit(ctx.expression(1));
            return new BinaryExpression(left, operator, right);
        } else if (ctx.comparsionOperation() != null) {
            Expression left = (Expression) visit(ctx.expression(0));
            String operator = ctx.comparsionOperation().getText();
            Expression right = (Expression) visit(ctx.expression(1));
            return new BinaryExpression(left, operator, right);
        } else if (ctx.LBRACKET() != null && ctx.RBRACKET() != null) {
            String array = ctx.IDENTIFIER().getText();
            Expression index = (Expression) visit(ctx.expression(1));
            return new ArrayAccessExpression(array, index);
        } else if (ctx.INCREMENT() != null || ctx.DECREMENT() != null) {
            String operator = ctx.getChild(1).getText();
            Expression expression = (Expression) visit(ctx.memberAccess());
            return new UnaryExpression(operator, new LiteralExpression(expression.toString()));
        } else if (ctx.memberAccess() != null) {
            return (Expression) visit(ctx.memberAccess());
        } else if (ctx.NUMBER() != null) {
            return new LiteralExpression(ctx.NUMBER().getText());
        } else if (ctx.STRING() != null) {
            return new LiteralExpression(ctx.STRING().getText());
        } else if (ctx.BOOLEAN() != null) {
            return new LiteralExpression(ctx.BOOLEAN().getText());
        }
        return null;
    }

    @Override
    public ArrowFunction visitArrowFunction(ProgramParser.ArrowFunctionContext ctx) {
        List<Parameter> parameters = !ctx.parameters().isEmpty() ? visitParameters(ctx.parameters()) : null;
        String type = ctx.TYPE() != null ? ctx.TYPE().getText() : null;
        Block block = visitBlock(ctx.block());
        return new ArrowFunction(block, parameters, type);
    }

    @Override
    public Expression visitMemberAccess(ProgramParser.MemberAccessContext ctx) {

        StringBuilder identifier = new StringBuilder();
        for (int i = 0; i < ctx.children.size(); i++) {
            if (ctx.getChild(i) instanceof ProgramParser.FunctionCallContext) {
                Expression expression = (Expression) visit(ctx.getChild(i));
                identifier.append(expression);
            } else {
                identifier.append(ctx.getChild(i));
            }
        }
        return new FunctionCall(identifier.toString());
    }

    @Override
    public Expression visitFunctionCall(ProgramParser.FunctionCallContext ctx) {
        StringBuilder identifier = new StringBuilder();
        identifier.append(ctx.IDENTIFIER());
        ctx.passedParameter().forEach((p) -> identifier.append(visit(p)));

        return new FunctionCall(identifier.toString());
    }

    @Override
    public ArrayDeclaration visitArrayDeclaration(ProgramParser.ArrayDeclarationContext ctx) {
        String identifier = ctx.IDENTIFIER().getText();
        String type = ctx.TYPE().getText();
        ArrayRightSide arrayRightSide = ctx.arrayRightSide() != null ? visitArrayRightSide(ctx.arrayRightSide()) : null;
        Row row = new Row(identifier, "Array", type, (arrayRightSide != null ? arrayRightSide.toString() : "--"), Integer.toString(ctx.IDENTIFIER().getSymbol().getLine()), "--");
        symbolTable.getSymbolTable().add(row);
        return new ArrayDeclaration(identifier, type, arrayRightSide);

    }

    @Override
    public ArrayRightSide visitArrayRightSide(ProgramParser.ArrayRightSideContext ctx) {
        ArrayElements arrayElements = ctx.arrayElements() != null ? visitArrayElements(ctx.arrayElements()) : null;
        return new ArrayRightSide(arrayElements);
    }

    @Override
    public ArrayElements visitArrayElements(ProgramParser.ArrayElementsContext ctx) {
        List<Expression> elements = ctx.expression().stream()
                .map(exprCtx -> (Expression) visit(exprCtx))
                .collect(Collectors.toList());
        return new ArrayElements(elements);
    }

    @Override
    public List<Parameter> visitParameters(ProgramParser.ParametersContext ctx) {
        return ctx.parameter()
                .stream()
                .map(this::visitParameter).collect(Collectors.toList());
    }

    @Override
    public Parameter visitParameter(ProgramParser.ParameterContext ctx) {
        String identifier = ctx.IDENTIFIER().getText();
        String type = ctx.TYPE().getText();
        Row row = new Row(identifier, "Parameter", type, "--", Integer.toString(ctx.IDENTIFIER().getSymbol().getLine()), "--");
        symbolTable.getSymbolTable().add(row);
        return new Parameter(identifier, type);
    }

    @Override
    public ForStatement visitForStatement(ProgramParser.ForStatementContext ctx) {

        VariableDeclaration initialization = (VariableDeclaration) visit(ctx.variableDeclaration());
        Expression condition = (Expression) visit(ctx.expression(0));
        Expression iteration = (Expression) visit(ctx.expression(1));
        Block block = (Block) visit(ctx.block());
        return new ForStatement(initialization, condition, iteration, block);
    }

    @Override
    public WhileStatement visitWhileStatement(ProgramParser.WhileStatementContext ctx) {
        Expression condition = (Expression) visit(ctx.expression());
        Block block = (Block) visit(ctx.block());
        return new WhileStatement(condition, block);
    }

    @Override
    public DoWhileStatement visitDoWhileStatement(ProgramParser.DoWhileStatementContext ctx) {
        Block block = (Block) visit(ctx.block());
        Expression condition = (Expression) visit(ctx.expression());
        return new DoWhileStatement(block, condition);
    }

    @Override
    public InterfaceStatement visitInterface(ProgramParser.InterfaceContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        List<Parameter> parameters = !ctx.parameter().isEmpty() ? ctx.parameter()
                .stream()
                .map(this::visitParameter).toList() : null;

        return new InterfaceStatement(name, parameters);
    }



    @Override
    public HtmlDocNode visitHtmlDoc(ProgramParser.HtmlDocContext ctx) {
        boolean docType = ctx.doctype() != null;
        List<HtmlElementNode> htmlElements = new ArrayList<>();
        for (ProgramParser.HtmlElementContext htmlElementCtx : ctx.htmlElement()) {
            htmlElements.add(visitHtmlElement(htmlElementCtx));
        }
        return new HtmlDocNode(docType, htmlElements);
    }

    @Override
    public HtmlElementNode visitHtmlElement(ProgramParser.HtmlElementContext ctx) {
        if (ctx.openTag() != null && ctx.closeTag() != null) {
            OpenTagNode openTag = visitOpenTag(ctx.openTag());
            ContentNode content = ctx.content().children != null ? visitContent(ctx.content()) : null;
            CloseTagNode closeTag = visitCloseTag(ctx.closeTag());
            return new HtmlElementNode(openTag, content, closeTag, null, null, null, "normal");
        } else if (ctx.metaTag() != null) {
            TagContentNode tagContentNode = visitTagContent(ctx.metaTag().tagContent());
            OpenTagNode openTag = new OpenTagNode("meta" , tagContentNode);
            return new HtmlElementNode(openTag, null, null, null, null, null, "singleTag");
        } else if (ctx.scriptTag() != null) {
            ScriptNode scriptTag = visitScriptTag(ctx.scriptTag());
            return new HtmlElementNode(null, null, null, null, scriptTag, null, "script");
        } else if (ctx.styleTag() != null) {
            StyleNode styleTag = visitStyleTag(ctx.styleTag());
            return new HtmlElementNode(null, null, null, null, null, styleTag, "style");
        } else if (ctx.selfClosingTag() != null) {
            SelfClosingTagNode selfClosingTag = visitSelfClosingTag(ctx.selfClosingTag());
            return new HtmlElementNode(null, null, null, selfClosingTag, null, null, "selfClosing");
        }
        return null;
    }

    @Override
    public OpenTagNode visitOpenTag(ProgramParser.OpenTagContext ctx) {
        String tagName = ctx.TEXT().getText();
        TagContentNode attributes = ctx.tagContent().children != null ? visitTagContent(ctx.tagContent()) : null;
        return new OpenTagNode(tagName, attributes);
    }

    @Override
    public CloseTagNode visitCloseTag(ProgramParser.CloseTagContext ctx) {
        String tagName = ctx.TEXT().getText();
        return new CloseTagNode(tagName);
    }

    @Override
    public SelfClosingTagNode visitSelfClosingTag(ProgramParser.SelfClosingTagContext ctx) {
        String tagName = ctx.TEXT().getText();
        TagContentNode attributes = ctx.tagContent().children != null ? visitTagContent(ctx.tagContent()) : null;
        return new SelfClosingTagNode(tagName, attributes);
    }

    @Override
    public TagContentNode visitTagContent(ProgramParser.TagContentContext ctx) {

        List<Node> attributes = new ArrayList<>();
        for (ParseTree child : ctx.children) {
            if (child instanceof ProgramParser.AttributeContext) {
                attributes.add(visitAttribute((ProgramParser.AttributeContext) child));
            } else if (child instanceof ProgramParser.PropertyBindingContext) {
                attributes.add(visitPropertyBinding((ProgramParser.PropertyBindingContext)child));
            } else if (child instanceof ProgramParser.BindingContext) {
                attributes.add(visitBinding((ProgramParser.BindingContext)child));
            } else if (child instanceof ProgramParser.EventBindingContext) {
                attributes.add(visitEventBinding((ProgramParser.EventBindingContext)child));
            } else if (child instanceof ProgramParser.DirectiveContext) {
                attributes.add(visitDirective((ProgramParser.DirectiveContext)child));
            }
        }
        return new TagContentNode(attributes);
    }

    @Override
    public AttributeNode visitAttribute(ProgramParser.AttributeContext ctx) {
        String name = ctx.TEXT().getText();
        String value = ctx.ATTRIBUTE_VALUE().getText();
        if(Objects.equals(name, "*ngIf") || Objects.equals(name, "*ngFor") || Objects.equals(name, "*ngSwitch")){
            return new StructuralDirective(name , value);
        }
        return new AttributeNode(name, value);
    }

    @Override
    public ContentNode visitContent(ProgramParser.ContentContext ctx) {
        List<Node> content = new ArrayList<>();

        for (ParseTree child : ctx.children) {
            if (child instanceof ProgramParser.HtmlElementContext) {
                content.add(visitHtmlElement((ProgramParser.HtmlElementContext) child));
            } else if (child instanceof ProgramParser.CommentContext) {
                content.add(visitComment((ProgramParser.CommentContext) child));
            } else if (child instanceof ProgramParser.BindingContext) {
                content.add(visitBinding((ProgramParser.BindingContext) child));
            } else {
                content.add(new TextNode(child.getText()));
            }
        }
        return new ContentNode(content);
    }

    @Override
    public CommentNode visitComment(ProgramParser.CommentContext ctx) {
        String comment = ctx.COMMENTH().getText();
        return new CommentNode(comment);
    }

    @Override
    public BindingNode visitBinding(ProgramParser.BindingContext ctx) {
        String name = ctx.TEXT().getText();
        Row row = new Row(name, "PropertyBinding ", "Binding", "--", Integer.toString(ctx.TEXT().getSymbol().getLine()),"--");
        symbolTable.getSymbolTable().add(row);
        return new BindingNode(name);
    }

    @Override
    public ScriptNode visitScriptTag(ProgramParser.ScriptTagContext ctx) {
        TagContentNode tagContent = ctx.tagContent().children != null ? visitTagContent(ctx.tagContent()) : null;
        ContentNode content = ctx.children != null ? visitContent(ctx.content()) : null;
        return new ScriptNode(tagContent, content);
    }

    @Override
    public DirectiveNode visitDirective(ProgramParser.DirectiveContext ctx) {
        List<AttributeNode> attributeNodes = new ArrayList<>();
        String name = ctx.TEXT().getText();
        for (int i = 0; i < ctx.attribute().size(); i++) {
            attributeNodes.add(visitAttribute(ctx.attribute(i)));
        }

        return new DirectiveNode(name,attributeNodes);
    }

    @Override
    public EventBindingNode visitEventBinding(ProgramParser.EventBindingContext ctx) {
        String name = ctx.TEXT().getText();
        String value = ctx.ATTRIBUTE_VALUE().getText();
        Row row = new Row(name, "EventBinding ", "Binding", value, Integer.toString(ctx.ATTRIBUTE_VALUE().getSymbol().getLine()),"--");
        symbolTable.getSymbolTable().add(row);
        return new EventBindingNode(name,value);
    }

    @Override
    public PropertyBindingNode visitPropertyBinding(ProgramParser.PropertyBindingContext ctx) {
        String name = ctx.TEXT().getText();
        String value = ctx.ATTRIBUTE_VALUE().getText();
        Row row = new Row(name, "PropertyBinding ", "Binding", value, Integer.toString(ctx.ATTRIBUTE_VALUE().getSymbol().getLine()),"--");
        symbolTable.getSymbolTable().add(row);
        return new PropertyBindingNode(name,value);
    }

    @Override
    public StyleNode visitStyleTag(ProgramParser.StyleTagContext ctx) {
        List<StyleContent> content =  ctx.styleContent().stream()
                .map(style -> (StyleContent) visit(style))
                .collect(Collectors.toList());
        return new StyleNode(content);
    }

    @Override
    public StyleContent visitStyleContent(ProgramParser.StyleContentContext ctx) {
        boolean dot = ctx.DOTH() != null;
        List<String> texts = ctx.CSS_TEXT().stream().map(ParseTree::getText).toList();
        List<CssElement> cssElements = ctx.cssElement().stream().map(
                this::visitCssElement
        ).toList();
        return new StyleContent(cssElements,texts,dot);
    }

    @Override
    public CssElement visitCssElement(ProgramParser.CssElementContext ctx) {
        String name = ctx.CSS_TEXT(0).getText();
        List<String> values = new ArrayList<>();
        for (int i = 2; i < ctx.children.size() - 1; i++) {
            values.add(ctx.getChild(i).getText());
        }
        return new CssElement(name,values);
    }

}
