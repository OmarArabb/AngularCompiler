package Ast.HTML;

public class BindingNode extends Node {
    private String name;

    public BindingNode(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "BindingNode{ \n" +
                " {{ name='" + name + '\'' +" }}\n"+
                '}';
    }
}
