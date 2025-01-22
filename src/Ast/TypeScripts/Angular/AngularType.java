package Ast.TypeScripts.Angular;

import Ast.TypeScripts.ClassDeclaration;
import Ast.TypeScripts.Line;
import Ast.TypeScripts.PassedParameter;

import java.util.List;

public class AngularType extends Line {
    private String type;
    private List<PassedParameter> namedAndRequiredParameters;
    private ClassDeclaration classDeclaration;

    // Constructor
    public AngularType(String type, List<PassedParameter> namedAndRequiredParameters, ClassDeclaration classDeclaration) {
        this.type = type;
        this.namedAndRequiredParameters = namedAndRequiredParameters;
        this.classDeclaration = classDeclaration;
    }

    // Getters and Setters
    public List<PassedParameter> getNamedAndRequiredParameters() {
        return namedAndRequiredParameters;
    }

    public void setNamedAndRequiredParameters(List<PassedParameter> namedAndRequiredParameters) {
        this.namedAndRequiredParameters = namedAndRequiredParameters;
    }

    public ClassDeclaration getClassDeclaration() {
        return classDeclaration;
    }

    public void setClassDeclaration(ClassDeclaration classDeclaration) {
        this.classDeclaration = classDeclaration;
    }

    @Override
    public String toString() {
        return "AngularType = @"+type +"{\n" +
                "Parameters=" + namedAndRequiredParameters +
                "\n, classDeclaration=" + classDeclaration +
                "}\n";
    }
}

