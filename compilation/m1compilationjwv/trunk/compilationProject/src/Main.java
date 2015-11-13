import java.io.*;
import java_cup.runtime.Symbol;
import enviroment.*;


    public class Main {

        public static void main(String[] args)
        {
            try
                {
                    FileReader fr = new FileReader (args[0]);
                    CompLexer lex = new CompLexer(fr);
                    CompParser parser = new CompParser(lex);
                    Symbol result=null;
                    try
                        {
                            if(parser.do_debug_parse)
                                parser.debug_parse();
                            else
                               result = parser.parse();
                            try{
                                Env env = (Env)result.value;
                                env.toDot("symboltable");
                            }
                            catch (Exception e) {
                                System.out.println("result error...");
                            }
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
