package Tree;

public class NodeSqrt implements TreeNode {
    private char op;
    private TreeNode right;

    public NodeSqrt(final char op, final TreeNode right) {
        this.op = op;
        this.right = right;
    }

    public double solve() {
        double r = 0;
        if(this.right != null){r = this.right.solve();}
        return  Math.sqrt(r);
    }

    public String toString()
    {
        String temp = "(";
        temp = temp + this.op +" ";
        if(this.right != null)
        {
            temp =    temp + this.right.toString();
        }
        return temp + ")";
    }

}
