package Ast.HTML;

// Script and Style Nodes
public class ScriptNode extends Node {
    private TagContentNode tagContent;
    private ContentNode content;

    public ScriptNode(TagContentNode tagContent, ContentNode content) {
        this.tagContent = tagContent;
        this.content = content;
    }

    @Override
    public String toString() {
        return "ScriptNode{" +
                " content=" + content +
                ", tagContent=" + tagContent +
                '}';
    }
}
