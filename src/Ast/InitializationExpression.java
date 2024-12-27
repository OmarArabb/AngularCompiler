package Ast;

import Ast.Expression.Expression;

public class InitializationExpression extends Statement {
    private String variableType;
    private String identifier;
    private Expression expression;

    public InitializationExpression(String variableType, String identifier, Expression expression) {
        this.variableType = variableType;
        this.identifier = identifier;
        this.expression = expression;
    }

    // Getters and Setters

    @Override
    public String toString() {
        return variableType != null
                ? variableType + " " + identifier + " = " + expression.toString()
                : identifier + " = " + expression.toString();
    }
}
