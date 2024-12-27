package Ast;

import Ast.Expression.Expression;

import java.util.List;

public class IfStatement extends Statement {
    private Expression condition;
    private Block block;
    private List<IfStatement> elseIfStatements;
    private Block elseBlock;

    public IfStatement(Expression condition, Block block, List<IfStatement> elseIfStatements, Block elseBlock) {
        this.condition = condition;
        this.block = block;
        this.elseIfStatements = elseIfStatements;
        this.elseBlock = elseBlock;
    }

    // Getters and Setters

    @Override
    public String toString() {
        String result = "if (" + condition.toString() + ") " + block.toString();
        for (IfStatement elseIf : elseIfStatements) {
            result += " else if (" + elseIf.condition.toString() + ") " + elseIf.block.toString();
        }
        if (elseBlock != null) {
            result += " else " + elseBlock.toString();
        }
        return result;
    }
}
