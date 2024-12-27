package Ast.Expression;

public class AssignmentExpression extends Expression {
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
