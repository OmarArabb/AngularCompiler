package Ast.TypeScripts.Angular;

import Ast.TypeScripts.Declaration;
import Ast.TypeScripts.VariableDeclaration;

public class OutputStatement extends Declaration {
    private String identifier;
    private VariableDeclaration variableDeclaration;

    // Constructor
    public OutputStatement(String identifier, VariableDeclaration variableDeclaration) {
        this.identifier = identifier;
        this.variableDeclaration = variableDeclaration;
    }

    // Getters and Setters
    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public VariableDeclaration getVariableDeclaration() {
        return variableDeclaration;
    }

    @Override
    public String toString() {
        return "OutputStatement{\n" +
                "identifier='" + identifier + '\'' +
                ", variableDeclaration=" + variableDeclaration +
                "\n}";
    }
}
