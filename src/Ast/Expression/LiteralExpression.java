package Ast.Expression;

public class LiteralExpression extends Expression {
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
