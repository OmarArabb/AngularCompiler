package Ast;

import java.util.List;
import java.util.stream.Collectors;

public class Block {
    private List<Statement> statements;

    public Block(List<Statement> statements) {
        this.statements = statements;
    }

    // Getters and Setters

    @Override
    public String toString() {
        return "{\n" + statements.stream().map(Statement::toString).collect(Collectors.joining("\n")) + "\n}";
    }
}
