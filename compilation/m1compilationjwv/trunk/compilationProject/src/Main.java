import java.io.filereader;
import java_cup.runtime.symbol;

public class Main {

    public static void main(String[] args)
    {
        try
        {
            FileReader fr = new FileReader (args[0]);
            CompLexer lex = new CompLexer(fr);
            CompParser parser = new CompParser(lex);
            try
            {
                parser.parse();
            }
            catch (Exception e)
            {
                System.out.println("parser error " + e);
            }
        }
        catch (Exception e)
        {
            System.out.println("invalid file" + e);
        }
    }
}   
