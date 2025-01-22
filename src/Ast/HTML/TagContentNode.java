package Ast.HTML;

import java.util.List;

public class TagContentNode extends Node {
    private List<Node> content;

    public TagContentNode(List<Node> content) {
        this.content = content;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        content.forEach((i)->stringBuilder.append("\n").append(i));
        return "TagContentNode{" +
                "content=" + stringBuilder +
                '}';
    }
}
