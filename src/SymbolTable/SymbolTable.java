package SymbolTable;

import java.util.ArrayList;
import java.util.List;

public class SymbolTable {
    List<Row> symbolTable = new ArrayList<Row>();

    public List<Row> getSymbolTable() {
        return symbolTable;
    }

    public void printTable() {
        System.out.printf("%-30s %-30s %-30s %-30s %-30s %-30s%n", "Name", "Type", "Additional Info","Start Line","End Line", "Value");
        System.out.println();
        for (Row row : symbolTable) {
            row.printRow();
        }
        System.out.println("\n");
    }
}
