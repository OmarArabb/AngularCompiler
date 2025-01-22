package Ast.TypeScripts;

import Ast.TypeScripts.Expression.Expression;

public class ElseIfStatement {
    public Expression condition;
    public Block block;

    public ElseIfStatement(Expression condition, Block block) {
        this.condition = condition;
        this.block = block;
    }

    @Override
    public String toString() {
        return "ElseIfStatement{" +
                "condition=" + condition +
                ", block=" + block +
                '}';
    }
}

