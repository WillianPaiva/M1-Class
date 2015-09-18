package Memory;

public class Memory 
{

	private double mem;

    public Memory() 
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
    public double MR()
    {
        return this.mem;
    }
    public void MC()
    {
        this.mem = 0;
    }
}
