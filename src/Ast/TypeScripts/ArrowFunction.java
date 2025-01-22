package Ast.TypeScripts;

import java.util.List;

public class ArrowFunction {
    private Block block;
    private String type;
    private List<Parameter> parameters;

    public ArrowFunction(Block block, List<Parameter> parameters, String type) {
        this.block = block;
        this.parameters = parameters;
        this.type = type;
    }



    @Override
    public String toString() {
        return "ArrowFunction{" +
                "("+parameters+") : "+ type +" => "+
                "block=" + block +
                '}';
    }
}
