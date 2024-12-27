package Ast.Expression;

import java.util.List;
import java.util.stream.Collectors;

public class MemberAccessExpression extends Expression {
    private String identifier;
    private List<String> members;

    public MemberAccessExpression(String identifier, List<String> members) {
        this.identifier = identifier;
        this.members = members;
    }

    // Getters and Setters

    @Override
    public String toString() {
        return identifier + members.stream().map(member -> "." + member).collect(Collectors.joining());
    }
}
