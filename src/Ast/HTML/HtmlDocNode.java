package Ast.HTML;

import java.util.List;

public class HtmlDocNode {
    private boolean docType;
    private List<HtmlElementNode> htmlElements;

    public HtmlDocNode(boolean docType, List<HtmlElementNode> htmlElements) {
        this.docType = docType;
        this.htmlElements = htmlElements;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        htmlElements.forEach((i)->stringBuilder.append("\n").append(i));
        return "HtmlDocNode{" +
                (docType ? " !DOCTYPE ," : "") +
                " htmlElements = " + stringBuilder +
                '}';
    }
}
