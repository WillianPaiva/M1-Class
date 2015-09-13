import MemoryClass.MemoryClass;
import MemoryClass.OperationClass;

public class Main {

    public static void main(String[] args)
    {
        System.out.println("test"); 
        MemoryClass men = new MemoryClass();
        men.MS(new OperationClass(6,'+',5).result());
        men.Mplus(new OperationClass(7,'/',2).result());
        System.out.println(men.MR());
        //String myString= "125.05+25-98*7/3";
        //String[] result = myString.split("(?<=[-+*/])|(?=[-+*/])");
        //System.out.println(Arrays.toString(result));
        System.
    }
}
