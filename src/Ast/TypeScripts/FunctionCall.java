package Ast.TypeScripts;

import Ast.TypeScripts.Expression.Expression;

public class FunctionCall extends Expression {
    private final String identifier;

    public FunctionCall(String identifier) {
        this.identifier = identifier;
    }

    public String getIdentifier() {
        return identifier;
    }

    @Override
    public String toString() {
        return "ID = {" +
                 identifier +
                "} ";
    }
}

