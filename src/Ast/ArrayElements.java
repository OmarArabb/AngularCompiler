package Ast;

import Ast.Expression.Expression;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayElements {
    private List<Expression> elements;

    public ArrayElements(List<Expression> elements) {
        this.elements = new ArrayList<>();
    }

    // Getters and Setters

    public List<Expression> getElements() {
        return elements;
    }

    public void setElements(List<Expression> elements) {
        this.elements = elements;
    }

    @Override
    public String toString() {
        return elements.stream().map(Expression::toString).collect(Collectors.joining(", "));
    }
}
