package Ast;

import java.util.List;
import java.util.stream.Collectors;

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
            return "import * from " + from + ";";
        } else {
            return "import {" + String.join(", ", identifiers) + "} from " + from + ";";
        }
    }
}
