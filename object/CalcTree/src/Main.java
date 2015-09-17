import Tree.Tree;

public class Main {

    public static void main(String[] args)
    {
        System.out.println("test"); 
        Tree t2 = new Tree("5+5*3");
        System.out.println(t2.toString());
        System.out.println(t2.solve());
        //String myString= "125.05+25-98*7/3";
        //String[] result = myString.split("(?<=[-+*/])|(?=[-+*/])");
        //System.out.println(Arrays.toString(result));
    }
}
