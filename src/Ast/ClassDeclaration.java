package Ast;

import java.util.List;
import java.util.stream.Collectors;

public class ClassDeclaration extends Line {
    private boolean isExported;
    private String identifier;
    private List<Declaration> declarations;

    public ClassDeclaration(boolean isExported, String identifier, List<Declaration> declarations) {
        this.isExported = isExported;
        this.identifier = identifier;
        this.declarations = declarations;
    }

    // Getters and Setters

    @Override
    public String toString() {
        return (isExported ? "export " : "") + "class " + identifier + " {\n" +
                declarations.stream().map(Declaration::toString).collect(Collectors.joining("\n")) + "\n}";
    }
}
