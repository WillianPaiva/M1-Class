package Memory;

public class Memory 
{

	private static double mem;

    public Memory() 
    { 
		Memory.mem = 0;
    }


    public static void MS(double a)
    {
        Memory.mem = a;
    }
    public static void Mplus(double a)
    {
        Memory.mem = Memory.mem + a;
    }
    public static void Mminus(double a)
    {
        Memory.mem = Memory.mem - a;
    }
    public static double MR()
    {
        return Memory.mem;
    }
    public static void MC()
    {
        Memory.mem = 0;
    }
}
