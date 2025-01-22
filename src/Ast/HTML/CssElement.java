package Ast.HTML;

import java.util.List;

public class CssElement extends Node{
    String name ;
    List<String> value;

    public CssElement(String name, List<String> value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        return "CssElement{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
