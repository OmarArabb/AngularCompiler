package Ast.TypeScripts;

import Ast.TypeScripts.Expression.Expression;

import java.util.List;

public class IfStatement extends Statement {
    private Expression condition;
    private Block block;
    private List<ElseIfStatement> elseIfStatements;
    private Block elseBlock;

    public IfStatement(Expression condition, Block block, List<ElseIfStatement> elseIfStatements, Block elseBlock) {
        this.condition = condition;
        this.block = block;
        this.elseIfStatements = elseIfStatements;
        this.elseBlock = elseBlock;
    }

    // Getters and Setters

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("IfStatement { if (" + condition.toString() + ") " + block.toString()+"}\n");
        if (!elseIfStatements.isEmpty()) {
            for (ElseIfStatement elseIf : elseIfStatements) {
                if (elseIf != null) {
                    result.append(elseIf.condition.toString()).append(elseIf.block.toString()).append("}\n");
                }
            }
        }
        if (elseBlock != null) {
            result.append("ElseStatement{ ").append(elseBlock).append(" }\n");
        }
        return result.toString();
    }
}
