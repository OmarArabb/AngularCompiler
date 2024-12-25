package Ast;

import java.util.List;
import java.util.stream.Collectors;

public class ArrayDeclaration extends Declaration {
    private String variableType;
    private String identifier;
    private String type;
    private List<Expression> elements;

    public ArrayDeclaration(String variableType, String identifier, String type, List<Expression> elements) {
        this.variableType = variableType;
        this.identifier = identifier;
        this.type = type;
        this.elements = elements;
    }

    // Getters and Setters

    @Override
    public String toString() {
        return variableType + " " + identifier + "[]: " + type + " = [" +
                elements.stream().map(Expression::toString).collect(Collectors.joining(", ")) + "];";
    }
}


class ArrayElements {
    private List<Expression> elements;

    public ArrayElements(List<Expression> elements) {
        this.elements = elements;
    }

    // Getters and Setters

    @Override
    public String toString() {
        return elements.stream().map(Expression::toString).collect(Collectors.joining(", "));
    }
}


