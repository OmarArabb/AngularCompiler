package Ast.TypeScripts;

import Ast.TypeScripts.Expression.Expression;

public class WhileStatement extends IterationStatement {
    private Expression condition;
    private Block block;

    public WhileStatement(Expression condition, Block block) {
        this.condition = condition;
        this.block = block;
    }

    // Getters and Setters

    @Override
    public String toString() {
        return "WhileStatement{ " +
                "(condition=" + condition+")\n" +
                "block=" + block +
                '}';
    }
}

