package Tree;
import Memory.Memory;

class MemoryNode implements TreeNode {
    private char op;
    private double result;
    private TreeNode right;

    MemoryNode(final char op, final TreeNode right) {
        this.op = op;
        this.right = right;
        this.result = right.solve();
        memExec();
    }

    public double solve(){
        return result;
    };
    private void memExec(){
        switch (op)
        {
            case 't' : Memory.MS(result);break; 
            case 'p' : Memory.Mplus(result); break; 
            case 'm' : Memory.Mminus(result); break;
            case 'c' : result = 0;  Memory.MC() ; break; 
            case 'r' : result = Memory.MR();break; 
        }
    }
    public String toString()
    {
        String temp = "M";
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
