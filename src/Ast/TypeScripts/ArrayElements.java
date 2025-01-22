package Ast.TypeScripts;

import Ast.TypeScripts.Expression.Expression;

import java.util.List;

public class ArrayElements {
    private List<Expression> elements;

    public ArrayElements(List<Expression> elements) {
        this.elements = elements;
    }

    // Getters and Setters

    @Override
    public String toString() {
        return "ArrayElements ["+elements+"]";
    }
}
