package Ast;

import java.util.List;
import java.util.stream.Collectors;

public abstract class Expression extends Statement {
    @Override
    public abstract String toString();
}

class BinaryExpression extends Expression {
    private Expression left;
    private String operator;
    private Expression right;

    public BinaryExpression(Expression left, String operator, Expression right) {
        this.left = left;
        this.operator = operator;
        this.right = right;
    }

    // Getters and Setters

    @Override
    public String toString() {
        return left.toString() + " " + operator + " " + right.toString();
    }
}

class UnaryExpression extends Expression {
    private String operator;
    private Expression operand;

    public UnaryExpression(String operator, Expression operand) {
        this.operator = operator;
        this.operand = operand;
    }

    // Getters and Setters

    @Override
    public String toString() {
        return operand.toString() + operator;
    }
}

class FunctionCallExpression extends Expression {
    private String identifier;
    private List<Expression> arguments;

    public FunctionCallExpression(String identifier, List<Expression> arguments) {
        this.identifier = identifier;
        this.arguments = arguments;
    }

    // Getters and Setters

    @Override
    public String toString() {
        return identifier + "(" + arguments.stream().map(Expression::toString).collect(Collectors.joining(", ")) + ")";
    }
}

class AssignmentExpression extends Expression {
    private String identifier;
    private String operator;
    private Expression expression;

    public AssignmentExpression(String identifier, String operator, Expression expression) {
        this.identifier = identifier;
        this.operator = operator;
        this.expression = expression;
    }

    // Getters and Setters

    @Override
    public String toString() {
        return identifier + " " + operator + " " + expression.toString();
    }
}

class MemberAccessExpression extends Expression {
    private String identifier;
    private List<String> members;

    public MemberAccessExpression(String identifier, List<String> members) {
        this.identifier = identifier;
        this.members = members;
    }

    // Getters and Setters

    @Override
    public String toString() {
        return identifier + members.stream().map(member -> "." + member).collect(Collectors.joining());
    }
}

class ArrayAccessExpression extends Expression {
    private String identifier;
    private Expression index;

    public ArrayAccessExpression(String identifier, Expression index) {
        this.identifier = identifier;
        this.index = index;
    }

    // Getters and Setters

    @Override
    public String toString() {
        return identifier + "[" + index.toString() + "]";
    }
}

class LiteralExpression extends Expression {
    private String value;

    public LiteralExpression(String value) {
        this.value = value;
    }

    // Getters and Setters

    @Override
    public String toString() {
        return value;
    }
}

