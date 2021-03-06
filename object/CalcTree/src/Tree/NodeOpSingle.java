package Tree;

abstract class NodeOpSingle implements TreeNode {
    private char op;
    private TreeNode right;

    NodeOpSingle( final char op, final TreeNode right) {
        this.op = op;
        this.right = right;
    }

    public abstract double solve();

    public String toString()
    {
        String temp = "";
        temp = temp + this.op +"(";
        if(this.right != null)
        {
            temp =    temp + this.right.toString();
        }
        return temp + ")";
    }


    /**
     * @return the right
     */
    public TreeNode getRight() {
        return right;
    }

}
