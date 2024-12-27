package Ast.Expression;

public class GreaterExpression extends StrictEqualityExpression {
    private Expression left;
    private Expression right;

    public GreaterExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    // Getters and Setters

    @Override
    public String toString() {
        return left.toString() + " > " + right.toString();
    }
}
