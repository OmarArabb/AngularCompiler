package Ast.Expression;

public class UnaryExpression extends Expression {
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
