import Memory.Memory;
import Tree.Tree;

public class Main {

    public static void main(String[] args)
    {
        System.out.println("test"); 
        Memory mem = new Memory();
        Tree t = new Tree("3*2^2");
        mem.MS(t.solve());
        System.out.println(t.toString());
        System.out.println(mem.MR());
    }
}
