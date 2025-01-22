package Ast.HTML;

import java.util.List;

public class StyleNode extends Node {
    private List<StyleContent> content;

    public StyleNode(List<StyleContent> content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "StyleNode{" +
                "  content=" + content +
                '}';
    }
}
