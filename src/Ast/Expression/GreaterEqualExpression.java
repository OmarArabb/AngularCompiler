package Ast.Expression;

public class GreaterEqualExpression extends StrictEqualityExpression {
    private Expression left;
    private Expression right;

    public GreaterEqualExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    // Getters and Setters

    @Override
    public String toString() {
        return left.toString() + " >= " + right.toString();
    }
}
