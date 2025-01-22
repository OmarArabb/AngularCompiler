package Ast.HTML;

public class AttributeNode extends Node {
    private String name;
    private String value;

    public AttributeNode(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "AttributeNode{" +
                " name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
