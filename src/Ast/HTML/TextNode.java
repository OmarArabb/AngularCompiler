package Ast.HTML;

public class TextNode extends Node{
    private String text;

    public TextNode(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "TextNode{" +
                "text='" + text + '\'' +
                '}';
    }
}
