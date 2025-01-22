package Ast.HTML;

public class StructuralDirective extends AttributeNode{

    public StructuralDirective(String name, String value) {
        super(name, value);
    }

    @Override
    public String toString() {
        return "StructuralDirective{" +
                "name ='" +  super.getName()+ '\'' +
                ", value='" + super.getValue() + '\'' +
                '}';
    }
}
