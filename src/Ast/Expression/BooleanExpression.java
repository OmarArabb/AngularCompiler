package Ast.Expression;

public class BooleanExpression extends StrictEqualityExpression {
    private boolean value;

    public BooleanExpression(boolean value) {
        this.value = value;
    }

    // Getters and Setters

    @Override
    public String toString() {
        return Boolean.toString(value);
    }
}
