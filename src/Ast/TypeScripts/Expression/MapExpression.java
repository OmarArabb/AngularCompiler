package Ast.TypeScripts.Expression;

import Ast.TypeScripts.PassedParameter;

import java.util.List;

public class MapExpression extends Expression {
    private final List<PassedParameter> passedParameters;

    public MapExpression(List<PassedParameter> passedParameters) {
        this.passedParameters = passedParameters;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        for (int i = 0; i < passedParameters.size(); i++) {
            sb.append(passedParameters.get(i).toString());
            if (i < passedParameters.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("}");
        return "MapExpression { "+sb.toString()+" }";
    }
}

