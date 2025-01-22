package Ast.HTML;

public class PropertyBindingNode extends Node {
    private String name;
    private String value;

    public PropertyBindingNode(String name, String value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        return "PropertyBindingNode{" +
                " [ name='" + name + '\'' +
                ", value='" + value + '\'' +
                "] }";
    }
}
