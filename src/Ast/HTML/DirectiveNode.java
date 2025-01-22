package Ast.HTML;

import java.util.List;

public class DirectiveNode extends Node {
    private String name;
    private List<AttributeNode> attributes;

    public DirectiveNode( String name, List<AttributeNode> attributes) {
        this.name = name;
        this.attributes = attributes;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        attributes.forEach((i)->stringBuilder.append("\n").append(i));
        return "DirectiveNode{" +
                " name= ' #" + name + '\'' +
                " , attributes=" + stringBuilder +
                '}';
    }
}
