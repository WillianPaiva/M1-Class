package MemoryClass;

public class OperationClass 
{

	private float a;
	private char op;
	private float b;

    public OperationClass(float a,char op, float b) 
    { 
		this.a = a;
		this.op = op;
		this.b = b;
    }

    public float result()
    {
        switch (this.op)
        {
            case '+': return this.a+this.b; 
            case '-': return this.a-this.b; 
            case '*': return this.a*this.b; 
            case '/': return this.a/this.b; 
            default: return 0;
            
        }
    }

    public void setOp(float a, char op, float b)
    {
		this.a = a;
		this.op = op;
		this.b = b;
    }
}
