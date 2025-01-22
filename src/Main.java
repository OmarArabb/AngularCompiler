import Ast.TypeScripts.Program;
import Gammar.ProgramLexer;
import Gammar.ProgramParser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {

       String path = "test/test1.txt";
//        String path = "test/test2.txt";
//        String path = "test/test3.txt";
//        String path = "test/test4.txt";
//        String path = "test/test5.txt";
//        String path = "test/test6.txt";
//        String path = "test/test7.txt";
   //     String path = "test/test8.txt";

            CharStream cs = fromFileName(path);
            ProgramLexer typeLexer = new ProgramLexer(cs);
            CommonTokenStream commonTokenStream = new CommonTokenStream(typeLexer);
            ProgramParser typeParser = new ProgramParser(commonTokenStream);
            ParseTree tree = typeParser.program();
            ProgramVisitor programVisitor = new ProgramVisitor();
            Program program = (Program) programVisitor.visit(tree);
            System.out.println(program);
            programVisitor.symbolTable.printTable();

    }
}