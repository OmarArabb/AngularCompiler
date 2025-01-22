package Ast.TypeScripts;

import Ast.HTML.HtmlDocNode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    private List<Line> lines;
    private HtmlDocNode htmlDocNode;

    public Program() {
        lines = new ArrayList<>();
    }

    // Getter and Setter
    public List<Line> getLines() {
        return lines;
    }

    public void setHtmlDocNode(HtmlDocNode htmlDocNode) {
        this.htmlDocNode = htmlDocNode;
    }

    public void setLines(List<Line> lines) {
        this.lines = lines;
    }

    @Override
    public String toString() {
        String s = "";
        if(!lines.isEmpty()){
            s = "Program:\n" + lines.stream().map(Line::toString).collect(Collectors.joining("\n"));
        } else if (htmlDocNode != null) {
            s = htmlDocNode.toString();
        }
        return s;
    }
}























