package Ast.TypeScripts;

import java.util.List;

public class ImportStatement extends Line {
    private boolean isWildcard;
    private List<String> identifiers;
    private String from;

    public ImportStatement(boolean isWildcard, List<String> identifiers, String from) {
        this.isWildcard = isWildcard;
        this.identifiers = identifiers;
        this.from = from;
    }

    // Getters and Setters

    @Override
    public String toString() {
        if (isWildcard) {
            return "ImportStatement{ import * from " + from + ";}\n";
        } else {
            return "ImportStatement {import {" + String.join(", ", identifiers) + "} from " + from + ";}\n";
        }
    }
}
