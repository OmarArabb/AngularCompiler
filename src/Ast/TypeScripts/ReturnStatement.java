package Ast.TypeScripts;

import Ast.TypeScripts.Expression.Expression;

public class ReturnStatement extends Statement {
    private Expression expression;
    private ArrayRightSide arrayRightSide;

    public ReturnStatement(Expression expression,ArrayRightSide arrayRightSide) {
        this.expression = expression;
        this.arrayRightSide = arrayRightSide;
    } // Getters and Setters

    @Override
    public String toString() {
        return "ReturnStatement{ " +
                (arrayRightSide != null ? "arrayRightSide = " + arrayRightSide : "") +
                (expression != null ? "expression = " + expression : "") +
                '}';
    }
}