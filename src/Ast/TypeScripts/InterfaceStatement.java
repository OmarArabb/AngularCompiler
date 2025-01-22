package Ast.TypeScripts;

import java.util.List;

public class InterfaceStatement extends Line{
    private String name;
    private List<Parameter> parameters;

    public InterfaceStatement(String name, List<Parameter> parameters) {
        this.name = name;
        this.parameters = parameters;
    }

    @Override
    public String toString() {
        return "InterfaceStatement{" +
                "name='" + name + '\'' +
                ", parameters=" + parameters +
                '}';
    }
}
