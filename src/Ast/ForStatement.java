package Ast;

import Ast.Expression.Expression;

public class ForStatement extends IterationStatement {
    private InitializationExpression initialization;
    private Expression condition;
    private IterationExpression iteration;
    private Block block;

    public ForStatement(InitializationExpression initialization, Expression condition, IterationExpression iteration, Block block) {
        this.initialization = initialization;
        this.condition = condition;
        this.iteration = iteration;
        this.block = block;
    }

    // Getters and Setters

    @Override
    public String toString() {
        return "for (" + initialization.toString() + "; " + condition.toString() + "; " + iteration.toString() + ") " + block.toString();
    }
}

