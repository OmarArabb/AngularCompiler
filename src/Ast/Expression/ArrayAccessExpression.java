package Ast.Expression;

public class ArrayAccessExpression extends Expression {
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
