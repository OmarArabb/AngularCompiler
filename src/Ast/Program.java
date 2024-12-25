package Ast;

import java.util.List;
import java.util.stream.Collectors;

public class Program {
    private List<Line> lines;

    public Program(List<Line> lines) {
        this.lines = lines;
    }

    // Getter and Setter
    public List<Line> getLines() {
        return lines;
    }

    public void setLines(List<Line> lines) {
        this.lines = lines;
    }

    @Override
    public String toString() {
        return "Program:\n" + lines.stream().map(Line::toString).collect(Collectors.joining("\n"));
    }
}























