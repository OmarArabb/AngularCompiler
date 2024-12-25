package Ast;

public class StatementLine extends Line {
    private Statement statement;

    public StatementLine(Statement statement) {
        this.statement = statement;
    }

    // Getter and Setter
    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    @Override
    public String toString() {
        return "StatementLine: " + statement.toString();
    }
}

