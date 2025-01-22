package Ast.TypeScripts;

import Ast.TypeScripts.Expression.Expression;

public class ForStatement extends IterationStatement {
    private VariableDeclaration initialization;
    private Expression condition;
    private Expression iteration;
    private Block block;

    public ForStatement(VariableDeclaration initialization, Expression condition, Expression iteration, Block block) {
        this.initialization = initialization;
        this.condition = condition;
        this.iteration = iteration;
        this.block = block;
    }

    // Getters and Setters

    @Override
    public String toString() {
        return "ForStatement {for (" + initialization.toString() + " " + condition.toString() + "; " + iteration.toString() + ") " + block.toString() +" }\n";
    }
}

