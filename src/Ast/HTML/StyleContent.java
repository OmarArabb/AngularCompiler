package Ast.HTML;

import java.util.List;

public class StyleContent extends Node{
    boolean dot;
    List<String> names;
    List<CssElement> cssElements;

    public StyleContent(List<CssElement> cssElements, List<String> names,boolean dot) {
        this.cssElements = cssElements;
        this.names = names;
        this.dot = dot;
    }

    @Override
    public String toString() {
        return "\nStyleContent{" +
                "names = " + names +
                "\ncssElements = " + cssElements +
                '}';
    }
}
