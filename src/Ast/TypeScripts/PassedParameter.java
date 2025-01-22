package Ast.TypeScripts;

public class PassedParameter {
    private String identifier;
    private Object value; // Can be Number, Boolean, String, or ArrayRightSide

    // Constructor
    public PassedParameter(String identifier, Object value) {
        this.identifier = identifier;
        this.value = value;
    }

    // Getters and Setters
    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "\nPassedParameter{" +
                "identifier='" + identifier + '\'' +
                ", value=" + value +
                "}\n";

    }
}

