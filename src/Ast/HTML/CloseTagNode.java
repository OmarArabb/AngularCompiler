package Ast.HTML;

public class CloseTagNode extends Node {
    private String tagName;

    public CloseTagNode(String tagName) {
        this.tagName = tagName;
    }

    @Override
    public String toString() {
        return "CloseTagNode{" +
                " tagName='" + tagName + '\'' +
                '}';
    }
}
