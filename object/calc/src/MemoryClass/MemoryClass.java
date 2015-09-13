package MemoryClass;


public class MemoryClass 
{

	private float mem;

    public MemoryClass() 
    { 
		this.mem = 0;
        System.
    }


    public void MS(float a)
    {
        this.mem = a;
    }
    public void Mplus(float a)
    {
        this.mem = this.mem + a;
    }
    public void Mminus(float a)
    {
        this.mem = this.mem - a;
    }
    public float MR()
    {
        return this.mem;
    }
    public void MC()
    {
        this.mem = 0;
    }
}
