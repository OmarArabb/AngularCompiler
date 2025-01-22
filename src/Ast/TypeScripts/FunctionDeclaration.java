package Ast.TypeScripts;

import java.util.List;
import java.util.stream.Collectors;

public class FunctionDeclaration extends Declaration {
    private String identifier;
    private boolean function;
    private List<Parameter> parameters;
    private String returnType;
    private Block block;

    public FunctionDeclaration(String identifier, boolean function,
                               List<Parameter> parameters, String returnType,
                               Block block) {
        this.identifier = identifier;
        this.function = function;
        this.parameters = parameters;
        this.returnType = returnType;
        this.block = block;
    }

    // Getters and Setters

    @Override
    public String toString() {
        return "FunctionDeclaration {"+
                " { ACCESS TYPE : "+
                super.access+"}  "+
                (function? "function " :"") + identifier + "(" +
                parameters.stream().map(Parameter::toString).collect(Collectors.joining(", ")) +
                ") " + (returnType != null ? ": "+returnType : "")  + block.toString()+" }\n";
    }
}

