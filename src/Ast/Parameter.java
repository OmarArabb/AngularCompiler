package Ast;

public class Parameter {
    private String identifier;
    private String type;

    public Parameter(String identifier, String type) {
        this.identifier = identifier;
        this.type = type;
    }

    // Getters and Setters

    @Override
    public String toString() {
        return identifier + ": " + type;
    }
}
