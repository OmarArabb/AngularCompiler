package Ast;

public class ArrayMethodCall extends Statement {
    private String identifier;
    private String element;
    private Block block;

    public ArrayMethodCall(String identifier, String element, Block block) {
        this.identifier = identifier;
        this.element = element;
        this.block = block;
    }

    // Getters and Setters

    @Override
    public String toString() {
        return identifier + ".forEach((" + element + ") => " + block.toString() + ");";
    }
}

