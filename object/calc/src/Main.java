import MemoryClass.MemoryClass;
import MemoryClass.OperationClass;

public class Main {

    public static void main(String[] args)
    {
       System.out.println("test"); 
        MemoryClass men = new MemoryClass();
        men.MS(25);
        System.out.println(men.MR());
        OperationClass op = new OperationClass(5,'+',5);
        System.out.println(op.result());
    }
}
