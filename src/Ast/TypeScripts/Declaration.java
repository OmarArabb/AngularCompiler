package Ast.TypeScripts;

public abstract class Declaration extends Statement {
    public String access;
    @Override
    public abstract String toString();
}
