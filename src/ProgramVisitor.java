import Ast.Program;
import gen.Parser;
import gen.ParserBaseVisitor;

public class ProgramVisitor extends ParserBaseVisitor<Void> {

    @Override
    public Void visitProgram(Parser.ProgramContext ctx) {

        Program program = new Program();

        for (Parser.LineContext line : ctx.line()) {
            line.copyFrom(ctx.line().get(1));
            if (null != null) {
                visitIm(ctx.importStatement());
            } else if (ctx.classDeclaration() != null) {
                visit(ctx.classDeclaration());
            } else {
                visit(ctx.statement());
            }
        }
        return null;
    }
}
