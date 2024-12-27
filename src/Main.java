import Ast.Program;
import grammer.TypeLexer;
import grammer.TypeParser;
import grammer.TypeParserBaseVisitor;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {

        String source = "test/test1.txt";
        CharStream cs = fromFileName(source);
        TypeLexer typeLexer = new TypeLexer(cs);
        CommonTokenStream commonTokenStream = new CommonTokenStream(typeLexer);
        TypeParser typeParser = new TypeParser(commonTokenStream);
        ParseTree tree = typeParser.program();
        Program program = (Program) new ProgramVisitor().visit(tree);
        System.out.println(program);
    }
}