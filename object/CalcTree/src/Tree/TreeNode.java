package Tree;

public class TreeNode
{
    private boolean leaf;
    private char op;
    private double value;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(boolean leaf, char op, double value) {
        this.leaf = leaf;
        this.op = op;
        this.value = value;
        this.left = null;
        this.right = null;
    }

    /**
     * @return the leaf
     */
    public boolean isLeaf() {
        return leaf;
    }

    /**
     * @param leaf the leaf to set
     */
    public void setLeaf(boolean leaf) {
        this.leaf = leaf;
    }

    /**
     * @return the op
     */
    public char getOp() {
        return op;
    }

    /**
     * @param op the op to set
     */
    public void setOp(char op) {
        this.op = op;
    }

    /**
     * @return the value
     */
    public double getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(double value) {
        this.value = value;
    }

    /**
     * @return the left
     */
    public TreeNode getLeft() {
        return left;
    }

    /**
     * @param left the left to set
     */
    public void setLeft(TreeNode left) {
        this.left = left;
    }

    /**
     * @return the right
     */
    public TreeNode getRight() {
        return right;
    }

    /**
     * @param right the right to set
     */
    public void setRight(TreeNode right) {
        this.right = right;
    }
    public double solve()
    {
        double r = 0;
        double l = 0;
        if(this.isLeaf()){
            return this.getValue();
        }
        else
        {
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
    }
    public String toString()
    {
        if(this.isLeaf())
        {
            return " " + this.getValue()+ " ";
        }
        else
        {
            String temp = "(";
            if(this.left != null)
            {
                temp =    temp + this.left.toString() + " ";
            }
            temp = temp + this.op +" ";
            if(this.right != null)
            {
                temp =    temp + this.right.toString();
            }
            return temp+")";
        }
    }

}
