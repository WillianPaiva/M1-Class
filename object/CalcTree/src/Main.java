import Memory.Memory;
import Tree.Tree;

public class Main {

    public static void main(String[] args)
    {
        System.out.println("test"); 
        Tree t = new Tree("MM(MS(3*2^2)*MP(25-sqrt(9)*inv(10)))");
        System.out.println(t.toString());
        System.out.println(t.solve());
        System.out.println(Memory.MR());
    }
}
