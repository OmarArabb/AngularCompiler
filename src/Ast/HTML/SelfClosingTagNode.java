package Ast.HTML;

import java.util.List;

public class SelfClosingTagNode extends Node {
    private String tagName;
    private TagContentNode tagContentNode;

    public SelfClosingTagNode(String tagName, TagContentNode tagContentNode) {
        this.tagName = tagName;
        this.tagContentNode = tagContentNode;
    }

    @Override
    public String toString() {
        return "SelfClosingTagNode{" +
                " tagName='" + tagName + '\'' +
                " , attributes=" + tagContentNode +
                '}';
    }
}
