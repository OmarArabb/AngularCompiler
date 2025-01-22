package SymbolTable;

public class Row {
    public String name;
    public String type;
    public String value;
    public String additionalInfo;
    public String startLine;
    public String endLine;

    public Row(String name, String additionalInfo, String type, String value,String startLine,String endLine) {
        this.name = name;
        this.additionalInfo = additionalInfo;
        this.type = type;
        this.value = value;
        this.startLine = startLine;
        this.endLine = endLine;
    }

    public void printRow() {
        System.out.printf("%-30s %-30s %-30s %-30s %-30s %-30s%n", name, type, additionalInfo,startLine,endLine, value);
    }
}
