package Ast.Expression;

class EqualExpression extends StrictEqualityExpression {
    private Expression left;
    private Expression right;

    public EqualExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    // Getters and Setters

    @Override
    public String toString() {
        return left.toString() + " === " + right.toString();
    }
}