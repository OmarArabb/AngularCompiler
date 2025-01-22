package Ast.HTML;

public class EventBindingNode extends Node {
    private String name;
    private String value;

    public EventBindingNode(String name, String value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        return "EventBindingNode{" +
                " ( name = '" + name + '\'' +
                ", value = '" + value + '\'' +
                ") }";
    }
}
