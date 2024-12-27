package Ast;

import Ast.Expression.Expression;

public class ReturnExpression extends Statement {
    private Expression expression;

    public ReturnExpression(Expression expression) {
        this.expression = expression;
    }

    // Getters and Setters

    @Override
    public String toString() {
        return "return " + expression.toString() + ";";
    }
}

