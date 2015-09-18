package Tree;

public class NodeDivide  extends NodeOp
{

    public NodeDivide(final TreeNode left, final char op, final TreeNode right) {
        super(left,op,right);
    }

    public double solve() {
        double r = 0;
        double l = 0;
        if(this.left != null){l = this.left.solve();}
        if(this.right != null){r = this.right.solve();}
        return  l/r;
    }
}
