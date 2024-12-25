package Ast;

public class IterationExpression extends Statement {
    private String identifier;
    private String operator;
    private String value;

    public IterationExpression(String identifier, String operator, String value) {
        this.identifier = identifier;
        this.operator = operator;
        this.value = value;
    }

    // Getters and Setters

    @Override
    public String toString() {
        return identifier + " " + operator + (value != null ? " " + value : "");
    }
}

