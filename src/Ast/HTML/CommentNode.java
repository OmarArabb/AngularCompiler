package Ast.HTML;

public class CommentNode extends Node {
    private String comment;

    public CommentNode(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "CommentNode{" +
                "comment='" + comment + '\'' +
                '}';
    }
}
