import Ast.*;
import Ast.ArrayElements;
import Ast.Expression.*;
import grammer.TypeParser;
import grammer.TypeParserBaseVisitor;

import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class ProgramVisitor extends TypeParserBaseVisitor<Object> {


    @Override
    public Program visitProgram(TypeParser.ProgramContext ctx) {
        List<Line> lines = new ArrayList<>();
        for (TypeParser.LineContext lineCtx : ctx.line()) {
            lines.add((Line) visit(lineCtx));
        }
        Program program = new Program();
        program.setLines(lines);
        return program;
    }


//    @Override
//    public Line visitLine(TypeParser.LineContext ctx) {
//        if (ctx.importStatement() != null) {
//            return (Line) visit(ctx.importStatement());
//        } else if (ctx.classDeclaration() != null) {
//            return (Line) visit(ctx.classDeclaration());
//        } else {
//            return (Line) visit(ctx.statement());
//        }
//    }

    @Override
    public ImportStatement visitImportStatement(TypeParser.ImportStatementContext ctx) {
        boolean isWildcard = ctx.TIMES() != null;
        List<String> identifiers = ctx.IDENTIFIER().stream().map(TerminalNode::getText).collect(Collectors.toList());
        String from = ctx.IDENTIFIER().get(ctx.IDENTIFIER().size() - 1).getText();
        return new ImportStatement(isWildcard, identifiers, from);
    }

    @Override
    public ClassDeclaration visitClassDeclaration(TypeParser.ClassDeclarationContext ctx) {

        String identifier = ctx.IDENTIFIER().getText();
        List<Declaration> declarations = ctx.declaration().stream()
                .map(declarationCtx -> (Declaration) visit(declarationCtx))
                .collect(Collectors.toList());
        return new ClassDeclaration(false, identifier, declarations);
    }

    @Override
    public Object visitStatementt(TypeParser.StatementtContext ctx) {
        return super.visitStatementt(ctx);
    }

    //    @Override
//    public Object visitStatementt(TypeParser.StatementtContext ctx) {
//
//
//        if (ctx.statement() != null) {
//            return visit(ctx.statement());
//        } else if (ctx.functionDeclaration() != null) {
//            return visit(ctx.functionDeclaration());
//        } else if (ctx.ifStatement() != null) {
//            return visit(ctx.ifStatement());
//        } else if (ctx.returnStatement() != null) {
//            return visit(ctx.returnStatement());
//        } else if (ctx.expressionStatement() != null) {
//            return visit(ctx.expressionStatement());
//        } else {
//            return visit(ctx.arrayMethodCall());
//        }
//    }

//    @Override
//    public Object visitState(TypeParser.StatemenContext ctx) {
//        TypeParser.StatementContext;
//        if (ctx.statement() != null) {
//            return (Statement) visit(ctx.statement());
//        } else if (ctx.functionDeclaration() != null) {
//            return (Statement) visit(ctx.functionDeclaration());
//        } else if (ctx.ifStatement() != null) {
//            return (Statement) visit(ctx.ifStatement());
//        } else if (ctx.returnStatement() != null) {
//            return (Statement) visit(ctx.returnStatement());
//        } else if (ctx.expressionStatement() != null) {
//            return (Statement) visit(ctx.expressionStatement());
//        } else {
//            return (Statement) visit(ctx.arrayMethodCall());
//        }
//    }

    @Override
    public VariableDeclaration visitVariableDeclaration(TypeParser.VariableDeclarationContext ctx) {
        String variableType = ctx.VARIABLE_TYPE().getText();
        String identifier = ctx.IDENTIFIER().getText();
        String type = ctx.TYPE() != null ? ctx.TYPE().getText() : null;
        Expression expression = (Expression) visit(ctx.expression());
        return new VariableDeclaration(false, variableType, identifier, type, expression);
    }

    @Override
    public FunctionDeclaration visitFunctionDeclaration(TypeParser.FunctionDeclarationContext ctx) {
        String identifier = ctx.IDENTIFIER().getText();
        List<Parameter> parameters = ctx.parameters().parameter().stream()
                .map(paramCtx -> new Parameter(paramCtx.IDENTIFIER().getText(), paramCtx.TYPE().getText()))
                .collect(Collectors.toList());
        String returnType = ctx.TYPE().getText();
        Block block = (Block) visit(ctx.block());
        return new FunctionDeclaration(identifier, parameters, returnType, block);
    }

    @Override
    public Block visitBlock(TypeParser.BlockContext ctx) {
        List<Statement> statements = ctx.statement().stream()
                .map(stmtCtx -> (Statement) visit(stmtCtx))
                .collect(Collectors.toList());
        return new Block(statements);
    }

    @Override
    public IfStatement visitIfStatement(TypeParser.IfStatementContext ctx) {
        Expression condition = (Expression) visit(ctx.expression(0));
        Block block = (Block) visit(ctx.block(0));
        List<IfStatement> elseIfStatements = ctx.ELSE().stream()
                .map(elseIfCtx -> (IfStatement) visit(elseIfCtx))
                .collect(Collectors.toList());
        Block elseBlock = ctx.ELSE() != null ? (Block) visit(ctx.ELSE(0)) : null;
        return new IfStatement(condition, block, elseIfStatements, elseBlock);
    }

    @Override
    public ReturnStatement visitReturnStatement(TypeParser.ReturnStatementContext ctx) {
        Expression expression = (Expression) visit(ctx.expression());
        return new ReturnStatement(expression);
    }

    @Override
    public List<ExpressionStatement> visitExpressionStatement(TypeParser.ExpressionStatementContext ctx) {
        List<ExpressionStatement> list = new ArrayList<>();
        ctx.expression().forEach((expr) -> {
            list.add(new ExpressionStatement(expr.getText()));
        });
        Expression expression = (Expression) visit(ctx.expression(0));
        return list;
    }

    @Override
    public ArrayMethodCall visitArrayMethodCall(TypeParser.ArrayMethodCallContext ctx) {
        StringBuilder identifier = new StringBuilder();
        ctx.IDENTIFIER().forEach((id) -> identifier.append(id.getText()));
        String element = ctx.IDENTIFIER().get(1).getText();
        Block block = (Block) visit(ctx.block());
        return new ArrayMethodCall(identifier.toString(), element, block);
    }

    @Override
    public Expression visitExpression(TypeParser.ExpressionContext ctx) {
        if (ctx.IDENTIFIER() != null) {
            StringBuilder stringBuilder = new StringBuilder();
            ctx.IDENTIFIER().forEach((id) -> {
                stringBuilder.append(id.getText());
            });

            return new LiteralExpression(stringBuilder.toString());
        } else if (ctx.NUMBER() != null) {
            return new LiteralExpression(ctx.NUMBER().getText());
        } else if (ctx.STRING() != null) {
            return new LiteralExpression(ctx.STRING().getText());
        } else if (ctx.TIMES() != null || ctx.DIVIDE() != null || ctx.PLUS() != null || ctx.MINUS() != null
                || ctx.EQUAL_EQUAL() != null || ctx.NOT_EQUAL() != null || ctx.GREATER() != null
                || ctx.GREATER_EQUAL() != null || ctx.LESS() != null || ctx.LESS_EQUAL() != null
                || ctx.AND() != null || ctx.OR() != null) {
            Expression left = (Expression) visit(ctx.expression(0));
            String operator = ctx.getChild(1).getText();
            Expression right = (Expression) visit(ctx.expression(1));
            return new BinaryExpression(left, operator, right);
        } else if (ctx.INCREMENT() != null || ctx.DECREMENT() != null) {
            String operator = ctx.getChild(1).getText();
            return new UnaryExpression(operator, new LiteralExpression(ctx.IDENTIFIER(0).getText()));
        } else {
            String identifier = ctx.IDENTIFIER(0).getText();
            if (ctx.LPAREN() != null) {
                List<Expression> arguments = ctx.expression().stream()
                        .map(exprCtx -> (Expression) visit(exprCtx))
                        .collect(Collectors.toList());
                return new FunctionCallExpression(identifier, arguments);
            } else if (ctx.LBRACKET() != null) {
                Expression index = (Expression) visit(ctx.expression(0));
                return new ArrayAccessExpression(identifier, index);
            } else if (ctx.DOT() != null) {
                List<String> members = ctx.IDENTIFIER().stream().map(TerminalNode::getText).collect(Collectors.toList());
                return new MemberAccessExpression(identifier, members);
            } else if (ctx.EQUAL() != null) {
                Expression value = (Expression) visit(ctx.expression(0));
                return new AssignmentExpression(identifier, ctx.EQUAL().getText(), value);
            } else if (ctx.PLUS() != null || ctx.MINUS() != null || ctx.MUL_ASSIGN() != null || ctx.DIV_ASSIGN() != null
                    || ctx.MOD_ASSIGN() != null) {
                Expression value = (Expression) visit(ctx.expression(0));
                return new AssignmentExpression(identifier, ctx.getChild(1).getText(), value);
            }
        }
        return null;
    }

    @Override
    public ArrayDeclaration visitArrayDeclaration(TypeParser.ArrayDeclarationContext ctx) {

        String identifier = ctx.IDENTIFIER().getText();
        String type = ctx.TYPE() != null ? ctx.TYPE().getText() : null;
        List<Expression> elements = ctx.arrayElements().expression().stream()
                .map(exprCtx -> (Expression) visit(exprCtx))
                .collect(Collectors.toList());
        return new ArrayDeclaration(identifier, type, elements);
    }

    @Override
    public ArrayElements visitArrayElements(TypeParser.ArrayElementsContext ctx) {
        List<Expression> elements = ctx.expression().stream()
                .map(exprCtx -> (Expression) visit(exprCtx))
                .collect(Collectors.toList());
        return new ArrayElements(elements);
    }


    @Override
    public Object visitForEachStatement(TypeParser.ForEachStatementContext ctx) {

        String identifier = ctx.IDENTIFIER(0).getText();
        String element = ctx.IDENTIFIER(0).getText();
        Block block = (Block) visit(ctx.block());
        return new ForEachStatement(identifier, element, block);
    }

    @Override
    public Object visitImportState(TypeParser.ImportStateContext ctx) {
        return super.visitImportState(ctx);
    }

    @Override
    public Object visitClass(TypeParser.ClassContext ctx) {

        return super.visitClass(ctx);
    }

    @Override
    public Object visitIteration(TypeParser.IterationContext ctx) {

        return super.visitIteration(ctx);
    }

    @Override
    public Object visitDeclarationStatement(TypeParser.DeclarationStatementContext ctx) {

        return super.visitDeclarationStatement(ctx);
    }

    @Override
    public Object visitIf(TypeParser.IfContext ctx) {
        return super.visitIf(ctx);
    }

    @Override
    public Object visitReturn(TypeParser.ReturnContext ctx) {

        return super.visitReturn(ctx);
    }

    @Override
    public Object visitExpress(TypeParser.ExpressContext ctx) {
        return super.visitExpress(ctx);
    }

    @Override
    public Object visitExpressionState(TypeParser.ExpressionStateContext ctx) {
        return super.visitExpressionState(ctx);
    }

    @Override
    public Object visitArrayCall(TypeParser.ArrayCallContext ctx) {
        return super.visitArrayCall(ctx);
    }

    @Override
    public Object visitDowhile(TypeParser.DowhileContext ctx) {
        return super.visitDowhile(ctx);
    }

    @Override
    public Object visitForEach(TypeParser.ForEachContext ctx) {
        return super.visitForEach(ctx);
    }

    @Override
    public Object visitFor(TypeParser.ForContext ctx) {
        return super.visitFor(ctx);
    }

    @Override
    public Object visitWhile(TypeParser.WhileContext ctx) {
        return super.visitWhile(ctx);
    }

    @Override
    public Object visitVariable(TypeParser.VariableContext ctx) {
        return super.visitVariable(ctx);
    }

    @Override
    public Object visitFunction(TypeParser.FunctionContext ctx) {
        return super.visitFunction(ctx);
    }

    @Override
    public Object visitArray(TypeParser.ArrayContext ctx) {
        return super.visitArray(ctx);
    }

    @Override
    public List<Parameter> visitParameters(TypeParser.ParametersContext ctx) {
        return ctx.parameter()
                .stream()
                .map(paramCtx -> (Parameter) visit(paramCtx)).collect(Collectors.toList());
    }

    @Override
    public Parameter visitParameter(TypeParser.ParameterContext ctx) {
        String identifier = ctx.IDENTIFIER().getText();
        String type = ctx.TYPE().getText();
        return new Parameter(identifier, type);
    }

    @Override
    public ForStatement visitForStatement(TypeParser.ForStatementContext ctx) {
        InitializationExpression initialization = (InitializationExpression) visit(ctx.initializationExpression());
        Expression condition = (Expression) visit(ctx.expression());
        IterationExpression iteration = (IterationExpression) visit(ctx.iterationExpression());
        Block block = (Block) visit(ctx.block());
        return new ForStatement(initialization, condition, iteration, block);
    }

    @Override
    public InitializationExpression visitInitializationExpression(TypeParser.InitializationExpressionContext ctx) {
        String variableType = ctx.VARIABLE_TYPE() != null ? ctx.VARIABLE_TYPE().getText() : null;
        String identifier = ctx.IDENTIFIER().getText();
        Expression expression = (Expression) visit(ctx.expression());
        return new InitializationExpression(variableType, identifier, expression);
    }

    @Override
    public IterationExpression visitIterationExpression(TypeParser.IterationExpressionContext ctx) {
        String identifier = ctx.IDENTIFIER().getText();
        String operator = ctx.INCREMENT() != null ? "++" : ctx.DECREMENT() != null ? "--" : ctx.PLUS_EQUAL() != null ? "+=" : ctx.MINUS_EQUAL() != null ? "-=" : ctx.MUL_ASSIGN() != null ? "*=" : ctx.DIV_ASSIGN() != null ? "/=" : ctx.MOD_ASSIGN() != null ? "%=" : null;
        String value = ctx.NUMBER() != null ? ctx.NUMBER().getText() : null;
        return new IterationExpression(identifier, operator, value);
    }

    @Override
    public WhileStatement visitWhileStatement(TypeParser.WhileStatementContext ctx) {
        Expression condition = (Expression) visit(ctx.strictEqualityExpression());
        Block block = (Block) visit(ctx.block());
        return new WhileStatement(condition, block);
    }

    @Override
    public DoWhileStatement visitDoWhileStatement(TypeParser.DoWhileStatementContext ctx) {
        Block block = (Block) visit(ctx.block());
        Expression condition = (Expression) visit(ctx.strictEqualityExpression());
        return new DoWhileStatement(block, condition);
    }

    @Override
    public Object visitStrictEqualityExpression(TypeParser.StrictEqualityExpressionContext ctx) {

        return super.visitStrictEqualityExpression(ctx);
    }
}


