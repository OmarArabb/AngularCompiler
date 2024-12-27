package Ast;

import Ast.Expression.Expression;

public class ReturnStatement extends Statement {
    private Expression expression;

    public ReturnStatement(Expression expression) {
        this.expression = expression;
    } // Getters and Setters

    @Override
    public String toString() {
        return "return " + expression.toString() + ";";
    }
}