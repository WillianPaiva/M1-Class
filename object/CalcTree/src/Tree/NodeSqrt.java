package Tree;

public class NodeSqrt extends NodeOpSingle{

    public NodeSqrt(final char op, final TreeNode right) {
        super(op,right);
    }

    @Override
    public double solve() {
        double r = 0;
        if(super.getRight() != null){r = super.getRight().solve();}
        return  Math.sqrt(r);
    }

}
