package Tree;


public class MemoryNode implements TreeNode
{

	private double mem;

    public MemoryNode() 
    { 
		this.mem = 0;
    }
    

    public void MS(double a)
    {
        this.mem = a;
    }
    public void Mplus(double a)
    {
        this.mem = this.mem + a;
    }
    public void Mminus(double a)
    {
        this.mem = this.mem - a;
    }
    public double solve()
    {
        return this.mem;
    }
    public void MC()
    {
        this.mem = 0;
    }
    public String toString(){
        return " "+this.mem;
    } 
}   
