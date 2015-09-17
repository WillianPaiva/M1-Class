package Tree;

/**
 *
 *
 * @author willian ver valen paiva
 */
public class Node implements TreeNode {
    private char op;
    private TreeNode left;
    private TreeNode right;

    /**
     *
     *
     * @param left
     * @param op
     * @param right
     */
    public Node(final TreeNode left, final char op, final TreeNode right) {
        this.op = op;
        this.left = left;
        this.right = right;
    }

    /**
     * {@inheritDoc}
     *
     * @see TreeNode#solve()
     */
    public double solve() {
        double r = 0;
        double l = 0;
        if(this.left != null){l = this.left.solve();}
        if(this.right != null){r = this.right.solve();}
        switch (this.op)
        {
            case '+': return  l+r;
            case '-': return  l-r;
            case '*': return  l*r;
            case '/': return  l/r;
            default: return 0;
        }
    }

    /**
     * {@inheritDoc}
     *
     * @see TreeNode#toString()
     */
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
