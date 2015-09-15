package Tree;

public class Leaf implements TreeNode 
{
    double value;
    public Leaf(double value){
        this.value = value;
    }
    public double solve()
    {
        return this.value;
    }
    public String toString()
    {
        return " " + value + " ";
    }
}
