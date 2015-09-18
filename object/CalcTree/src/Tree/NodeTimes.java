package Tree;

public class NodeTimes implements TreeNode {
    private char op;
    private TreeNode left;
    private TreeNode right;

    public NodeTimes(final TreeNode left, final char op, final TreeNode right) {
        this.op = op;
        this.left = left;
        this.right = right;
    }

    public double solve() {
        double r = 0;
        double l = 0;
        if(this.left != null){l = this.left.solve();}
        if(this.right != null){r = this.right.solve();}
        return  l*r;
    }

    public String toString()
    {
        String temp = "(";
        if(this.left != null)
        {
            temp =  temp + this.left.toString() + " ";
        }
        temp = temp + this.op +" ";
        if(this.right != null)
        {
            temp =    temp + this.right.toString();
        }
        return temp + ")";
    }

}
