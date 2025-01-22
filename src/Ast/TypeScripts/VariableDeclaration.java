package Ast.TypeScripts;

import Ast.TypeScripts.Expression.Expression;

public class VariableDeclaration extends Declaration {
    private boolean isExported;
    private boolean isNew;
    private String variableType;
    private String identifier;
    private String type;
    private Expression expression;

    public VariableDeclaration(boolean isExported, boolean isNew,
                               String variableType, String identifier,
                               String type, Expression expression) {
        this.isExported = isExported;
        this.isNew = isNew;
        this.variableType = variableType;
        this.identifier = identifier;
        this.type = type;
        this.expression = expression;
    }

    // Getters and Setters

    @Override
    public String toString() {
        return "VariableDeclaration {"+(isExported ? "export " : "") + variableType + " Name = " + identifier +
                " { ACCESS TYPE : "+
                super.access+" }"+
                (type != null ? (" : " + type) : "") +

                (expression != null? " = "+(isNew ? "new " : "")+expression : " ") + "; }\n";
    }

}
