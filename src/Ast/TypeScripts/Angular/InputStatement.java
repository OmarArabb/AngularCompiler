package Ast.TypeScripts.Angular;

import Ast.TypeScripts.Declaration;
import Ast.TypeScripts.Parameter;

import java.util.List;

public class InputStatement extends Declaration {
    private List<Parameter> parameters;
    private String identifier;
    private String type;

    // Constructor
    public InputStatement(List<Parameter> parameters, String identifier, String type) {
        this.parameters = parameters;
        this.identifier = identifier;
        this.type = type;
    }

    // Getters and Setters
    public List<Parameter> getParameters() {
        return parameters;
    }

    public void setParameters(List<Parameter> parameters) {
        this.parameters = parameters;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "InputStatement{\n" +
                "parameters=" + parameters +
                ", identifier='" + identifier + '\'' +
                ", type='" + type + '\'' +
                "\n}";
    }
}
