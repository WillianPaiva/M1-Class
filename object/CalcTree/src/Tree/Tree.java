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
        String[] result = expression.split("(?<=[-+*/^()])|(?=[-+*/^()])");
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
            if(isNumeric(tokens.get(0)))
            {
                temp = new Leaf(Double.parseDouble(tokens.get(0)));
                tokens.remove(0);
                operands.push(temp);
            }
            else
            {
                char token =tokens.get(0).charAt(0) ;
                if(tokens.get(0).length() > 1){
                    switch (tokens.get(0))
                    {
                        case "sqrt" : token = '√'; break;
                        case "inv"  : token = 'i'; break;
                        case "MR"   : token = 'r'; break;
                        case "MS"   : token = 's'; break;
                        case "MC"   : token = 'c'; break;
                        case "MP"   : token = 'p'; break;
                        case "MM"   : token = 'm'; break;
                    }
                }else{
                    token =tokens.get(0).charAt(0) ;
                }
                tokens.remove(0);
                switch (token)
                {
                    case '+':
                    case '-':
                    case '*':
                    case '/':
                    case '^':
                        ProcessOperator(token);
                        break;
                    case '√':
                    case 'i':
                    case 'r':
                    case 's':
                    case 'c':
                    case 'p':
                    case 'm':
                        operators.push(token);
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
        TreeNode p = null;
        TreeNode tempRight = pop();
        switch (op)
        {
            case '+': p = new NodePlus(pop(),op,tempRight);break;
            case '-': p = new NodeMinus(pop(),op,tempRight);break;
            case '*': p = new NodeTimes(pop(),op,tempRight);break;
            case '/': p = new NodeDivide(pop(),op,tempRight);break;
            case '^': p = new NodePow(pop(),op,tempRight);break;
            case '√': p = new NodeSqrt(op,tempRight); break;
            case 'i': p = new NodeInv(op,tempRight); break;
            case 'r':
            case 's':
            case 'c':
            case 'p':
            case 'm':
                      p = new MemoryNode(op,tempRight);break;
        }
        operands.push(p);
    }

    private TreeNode pop(){
        if(!operands.empty())
        {
           return  operands.pop();
        }
       return null; 
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
            case 'i':
            case 'r':
            case 's':
            case 'c':
            case 'p':
            case 'm':
                return 2;
            case '√':
            case '^':
                return 3;
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
