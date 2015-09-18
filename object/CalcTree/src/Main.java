import Memory.Memory;
import Tree.Tree;

public class Main {

    public static void main(String[] args)
    {
        System.out.println("test"); 
        Memory mem = new Memory();
        mem.MS(new Tree("5^2+5*3").solve());
        mem.Mplus(new Tree("2/3*9").solve());
        System.out.println(mem.MR());
    }
}
