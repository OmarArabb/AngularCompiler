package Ast.Expression;

import java.util.List;
import java.util.stream.Collectors;

public class FunctionCallExpression extends Expression {
    private String identifier;
    private List<Expression> arguments;

    public FunctionCallExpression(String identifier, List<Expression> arguments) {
        this.identifier = identifier;
        this.arguments = arguments;
    }

    // Getters and Setters

    @Override
    public String toString() {
        return identifier + "(" + arguments.stream().map(Expression::toString).collect(Collectors.joining(", ")) + ")";
    }
}
