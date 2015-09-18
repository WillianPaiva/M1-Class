import MemoryClass.MemoryClass;
import MemoryClass.OperationClass;

public class Main {

    public static void main(String[] args)
    {
        System.out.println("test"); 
        MemoryClass men = new MemoryClass();
        OperationClass op = new OperationClass();
        men.MS(op.solve(6,'+',5));
        men.Mplus(op.solve(7,'/',2));
        System.out.println(men.MR());
    }
}
