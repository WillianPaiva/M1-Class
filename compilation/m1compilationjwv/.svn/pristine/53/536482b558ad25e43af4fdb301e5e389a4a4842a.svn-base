import java.io.FileReader;
import java_cup.runtime.Symbol;
import stree.*;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        try {
            FileReader  myFile = new FileReader(args[0]);
            MyCLexer myLex = new MyCLexer(myFile);
            MyCParser myParser = new MyCParser(myLex);
            Symbol result=null;
            try {
                if (myParser.do_debug_parse)
                    result=myParser.debug_parse();
                else
                    result=myParser.parse();
                try {
                    Stree stree = (Stree)result.value;
                    stree.toDot("data/stree.dot");
                }	
                catch (Exception e) {
                    System.out.println("result error...");
                }
            }
            catch (Exception e) {
                System.out.println("parse error");
            }
        }
        catch (Exception e){
            System.out.println("invalid file");
        }
    }
}
