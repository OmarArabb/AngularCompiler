package Ast;

import Ast.Expression.Expression;

public class DoWhileStatement extends IterationStatement {
    private Block block;
    private Expression condition;

    public DoWhileStatement(Block block, Expression condition) {
        this.block = block;
        this.condition = condition;
    }

    // Getters and Setters

    @Override
    public String toString() {
        return "do " + block.toString() + " while (" + condition.toString() + ");";
    }
}

