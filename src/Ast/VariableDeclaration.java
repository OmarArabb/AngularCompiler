package Ast;

public class VariableDeclaration extends Declaration {
    private boolean isExported;
    private String variableType;
    private String identifier;
    private String type;
    private Expression expression;

    public VariableDeclaration(boolean isExported, String variableType, String identifier, String type, Expression expression) {
        this.isExported = isExported;
        this.variableType = variableType;
        this.identifier = identifier;
        this.type = type;
        this.expression = expression;
    }

    // Getters and Setters

    @Override
    public String toString() {
        return (isExported ? "export " : "") + variableType + " " + identifier +
                (type != null ? ": " + type : "") + " = " + expression.toString() + ";";
    }
}
