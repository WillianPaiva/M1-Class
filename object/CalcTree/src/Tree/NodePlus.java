package Tree;

public class NodePlus extends NodeOp{

    public NodePlus(final TreeNode left, final char op, final TreeNode right) {
        super(left,op,right);
    }

    @Override 
    public double solve() {
        double r = 0;
        double l = 0;
        if(super.getLeft() != null){l = super.getLeft().solve();}
        if(super.getRight() != null){r = super.getRight().solve();}
        return  l+r;
    }


    @Override 
    public String toString()
    {
        String temp = "";
        if(super.getLeft() != null)
        {
            temp =  temp + super.getLeft().toString() + " ";
        }
        temp = temp + super.getOp() +" ";
        if(super.getRight() != null)
        {
            temp =    temp + super.getRight().toString();
        }
        return temp + "";
    }
}
