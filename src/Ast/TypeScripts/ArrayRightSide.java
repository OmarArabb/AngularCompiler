package Ast.TypeScripts;

public class ArrayRightSide {
    private ArrayElements arrayElements;

    public ArrayRightSide(ArrayElements arrayElements) {
        this.arrayElements = arrayElements;
    }

    // Getters and setters


    @Override
    public String toString() {
        return "ArrayRightSide{" +
                "arrayElements=" + arrayElements +
                '}';
    }
}

