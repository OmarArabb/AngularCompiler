package Ast;

public class ExpressionStatement extends Statement {
    private final String expression;

    public ExpressionStatement(String expression) {
        this.expression = expression;
    } // Getter

    public String getExpression() {
        return expression;
    }

    @Override
    public String toString() {
        return "ExpressionStatement: " + expression + ";";
    }
}
