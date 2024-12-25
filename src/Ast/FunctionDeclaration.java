package Ast;

import java.util.List;
import java.util.stream.Collectors;

public class FunctionDeclaration extends Declaration {
    private String identifier;
    private List<Parameter> parameters;
    private String returnType;
    private Block block;

    public FunctionDeclaration(String identifier, List<Parameter> parameters, String returnType, Block block) {
        this.identifier = identifier;
        this.parameters = parameters;
        this.returnType = returnType;
        this.block = block;
    }

    // Getters and Setters

    @Override
    public String toString() {
        return "function " + identifier + "(" +
                parameters.stream().map(Parameter::toString).collect(Collectors.joining(", ")) +
                "): " + returnType + " " + block.toString();
    }
}

