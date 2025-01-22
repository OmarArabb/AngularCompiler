package Ast.HTML;

import java.util.List;

public class ContentNode extends Node {
    private List<Node> content;

    public ContentNode(List<Node> content) {
        this.content = content;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        content.forEach((i)->stringBuilder.append("\n").append(i));
        return "ContentNode{ \n" +
                "content = " + stringBuilder +
                '}';
    }
}
