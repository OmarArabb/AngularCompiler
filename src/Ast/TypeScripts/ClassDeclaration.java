package Ast.TypeScripts;

import java.util.List;
import java.util.stream.Collectors;

public class ClassDeclaration extends Line {
    private boolean isExported;
    private String identifier;
    private String extendClass;
    private List<Declaration> declarations;

    public ClassDeclaration(boolean isExported, String identifier, String extendClass, List<Declaration> declarations) {
        this.isExported = isExported;
        this.identifier = identifier;
        this.extendClass = extendClass;
        this.declarations = declarations;
    }

    // Getters and Setters

    @Override
    public String toString() {
        return "ClassDeclaration { "+(isExported ? "export " : "") + "class " + identifier +(extendClass != null ? "extends "+extendClass :"") +" {\n" +
                declarations.stream().map(Declaration::toString).collect(Collectors.joining("\n")) + "}\n }\n";
    }
}
