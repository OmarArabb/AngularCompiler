package Ast.TypeScripts;

public class ArrayDeclaration extends Declaration {
    private String identifier;
    private String type;
    private ArrayRightSide arrayRightSide;

    public ArrayDeclaration(String identifier, String type, ArrayRightSide arrayRightSide) {
        this.identifier = identifier;
        this.type = type;
        this.arrayRightSide = arrayRightSide;
    }

    // Getters and Setters

    @Override
    public String toString() {
        return "ArrayDeclaration{" +
                "ACCESS TYPE : "+
                super.access+
                "  identifier = '" +
                identifier + '\'' +
                ", type='" + type + '\'' + ", arrayRightSide=" + arrayRightSide + '}';
    }
}



