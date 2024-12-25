package Ast;

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
        return "while (" + condition.toString() + ") " + block.toString();
    }
}

