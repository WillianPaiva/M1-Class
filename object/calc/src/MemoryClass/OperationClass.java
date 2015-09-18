package MemoryClass;

public class OperationClass 
{

    public double solve(double a, char op, double b)
    {
        switch (op)
        {
            case '+': return a+b; 
            case '-': return a-b; 
            case '*': return a*b; 
            case '/': return a/b; 
            default: return 0;
            
        }
    }
}
