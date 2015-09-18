package Tree;

class MemoryNode implements TreeNode {
    private char op;
    private TreeNode right;

    MemoryNode(final char op, final TreeNode right) {
        this.op = op;
        this.right = right;
    }

    public double solve(){
        return 0;
    };

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
