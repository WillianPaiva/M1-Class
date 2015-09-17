package Tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

/**
 *
 *
 * @author
 */
public class Tree {
    private TreeNode root;
    private ArrayList<String> tokens;
    Stack<Character> operators;
    Stack<TreeNode> operands;

    /**
     *
     *
     * @param expression
     */
    public Tree(final String expression){ 
        this.operators = new Stack<Character>();
        this.operands = new Stack<TreeNode>();
        String[] result = expression.split("(?<=[-+*/()])|(?=[-+*/()])");
        this.tokens = new ArrayList<String>(Arrays.asList(result));
        this.root = build();
    }

    /**
     *
     *
     * @return
     */
    private TreeNode build(){
        TreeNode temp;
        while (!tokens.isEmpty()) {
            if(iassNumeric(tokens.get(0)))
            {
                temp = new Leaf(Double.parseDouble(tokens.get(0)));
                tokens.remove(0);
                operands.push(temp);
            }
            else
            {
                char token =tokens.get(0).charAt(0) ;
                tokens.remove(0);
                switch (token)
                {
                    case '+':
                    case '-':
                    case '*':
                    case '/':
                        ProcessOperator(token);
                        break;
                    case ')':
                        ProcessRightP();
                        break;
                    case '(':
                        operators.push(token);
                        break;
                }
            }
        }
        while(!operators.empty())
        {
            NodeCreate(operators.pop());
        }
        if(operands.size() != 1)
        {
            System.err.println("Bad Syntax");
        }
        return operands.pop();
    }

    /**
     *
     *
     * @param op
     */
    private void ProcessOperator(char op)
    {
        int opPrecendence = precedence(op);
        while((!operators.empty()) && (opPrecendence <= precedence(operators.peek())))
        {
            NodeCreate(operators.pop());
        }
        operators.push(op);
    }

    /**
     *
     *
     */
    private void ProcessRightP()
    {
        while(!operators.empty() && operators.peek() != '(')
        {
            NodeCreate(operators.pop());
        }
        operators.pop();
    }

    /**
     *
     *
     * @param op
     */
    private void NodeCreate(char op)
    {
        TreeNode tempRight = operands.pop();
        TreeNode tempLeft = null;
        if(!operands.empty())
        {
            tempLeft = operands.pop();
        }
        TreeNode p = new Node(tempLeft,op,tempRight);
        operands.push(p);
    }
    
    /**
     *
     *
     * @return
     */
    public double solve(){
        return this.root.solve();
    }

    /**
     *
     *
     * @param op
     * @return
     */
    private int precedence(char op)
    {
        switch (op)
        {
            case '+':
            case '-':
                return 1;
            case '/':
            case '*':
                return 2;
            default:
                return 0;          
        }    
    } 

    /**
     *
     *
     * @param str
     * @return
     */
    private boolean isNumeric(String str)
    {
        return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
    }

    /**
     * {@inheritDoc}
     *
     * @see Object#toString()
     */
    public String toString()
    {
        return this.root.toString();
    }

}
