package Tree;

public class NodePow extends NodeOp{
    
    public NodePow(final TreeNode left, final char op, final TreeNode right) {
        super(left,op,right);
    }

    @Override
    public double solve() {
        double r = 0;
        double l = 0;
        if(super.getLeft() != null){l = super.getLeft().solve();}
        if(super.getRight() != null){r = super.getRight().solve();}
        return  Math.pow(l,r);
    }


}
