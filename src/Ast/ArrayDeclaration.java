package Ast;

import Ast.Expression.Expression;

import java.util.List;
import java.util.stream.Collectors;

public class ArrayDeclaration extends Declaration {
    private String identifier;
    private String type;
    private List<Expression> elements;

    public ArrayDeclaration(String identifier, String type, List<Expression> elements) {

        this.identifier = identifier;
        this.type = type;
        this.elements = elements;
    }

    // Getters and Setters

    @Override
    public String toString() {
        return  identifier + "[]: " + type + " = [" +
                elements.stream().map(Expression::toString).collect(Collectors.joining(", ")) + "];";
    }
}



