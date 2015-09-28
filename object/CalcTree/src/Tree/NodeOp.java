package Tree;

abstract  class  NodeOp implements TreeNode {
    private char op;
    private TreeNode left;
    private TreeNode right;

    NodeOp(final TreeNode left, final char op, final TreeNode right) {
        this.op = op;
        this.left = left;
        this.right = right;
    }

    public abstract double solve();

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

    /**
     * @return the op
     */
    public char getOp() {
        return op;
    }

    /**
     * @return the left
     */
    public TreeNode getLeft() {
        return left;
    }

    /**
     * @return the right
     */
    public TreeNode getRight() {
        return right;
    }

}
