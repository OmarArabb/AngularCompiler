package Ast.HTML;

import java.util.List;

public class OpenTagNode extends Node {
    private String tagName;
    private TagContentNode tagContentNode;


    public OpenTagNode(String tagName, TagContentNode tagContentNode) {
        this.tagName = tagName;
        this.tagContentNode = tagContentNode;
    }

    @Override
    public String toString() {
        return "OpenTagNode{" +
                " tagName='" + tagName + '\'' +
                ", attributes=" + tagContentNode +
                '}';
    }
}
