package Ast.Expression;

public class BinaryExpression extends Expression {
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
