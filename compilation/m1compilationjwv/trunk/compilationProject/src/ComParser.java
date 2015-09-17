
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Wed Sep 16 19:22:40 CEST 2015
//----------------------------------------------------

import java_cup.runtime.*;
import java.util.Vector;
import java.io.*;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Wed Sep 16 19:22:40 CEST 2015
  */
public class ComParser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public ComParser() {super();}

  /** Constructor which sets the default scanner. */
  public ComParser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public ComParser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\010\000\002\002\004\000\002\005\004\000\002\002" +
    "\005\000\002\002\003\000\002\003\005\000\002\003\003" +
    "\000\002\004\005\000\002\004\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\017\000\006\004\010\011\004\001\002\000\012\005" +
    "\ufffa\006\ufffa\007\ufffa\010\ufffa\001\002\000\004\002\021" +
    "\001\002\000\012\005\ufffe\006\ufffe\007\ufffe\010\015\001" +
    "\002\000\012\005\ufffc\006\ufffc\007\ufffc\010\ufffc\001\002" +
    "\000\006\004\010\011\004\001\002\000\006\006\013\007" +
    "\012\001\002\000\006\004\010\011\004\001\002\000\004" +
    "\002\000\001\002\000\012\005\uffff\006\uffff\007\uffff\010" +
    "\015\001\002\000\006\004\010\011\004\001\002\000\012" +
    "\005\ufffd\006\ufffd\007\ufffd\010\ufffd\001\002\000\006\005" +
    "\020\007\012\001\002\000\012\005\ufffb\006\ufffb\007\ufffb" +
    "\010\ufffb\001\002\000\004\002\001\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\017\000\012\002\010\003\005\004\006\005\004\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\010\002\016\003\005\004\006\001" +
    "\001\000\002\001\001\000\006\003\013\004\006\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\004\015\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$ComParser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$ComParser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$ComParser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$ComParser$actions {
  private final ComParser parser;

  /** Constructor */
  CUP$ComParser$actions(ComParser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$ComParser$do_action(
    int                        CUP$ComParser$act_num,
    java_cup.runtime.lr_parser CUP$ComParser$parser,
    java.util.Stack            CUP$ComParser$stack,
    int                        CUP$ComParser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$ComParser$result;

      /* select the action based on the action number */
      switch (CUP$ComParser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // factor ::= ID 
            {
              Object RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$ComParser$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$ComParser$stack.peek()).right;
		Object t = (Object)((java_cup.runtime.Symbol) CUP$ComParser$stack.peek()).value;
		 System.out.println("Reduction factor -> ID"); 
              CUP$ComParser$result = parser.getSymbolFactory().newSymbol("factor",2, ((java_cup.runtime.Symbol)CUP$ComParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$ComParser$stack.peek()), RESULT);
            }
          return CUP$ComParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // factor ::= LPAR expr RPAR 
            {
              Object RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$ComParser$stack.elementAt(CUP$ComParser$top-1)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$ComParser$stack.elementAt(CUP$ComParser$top-1)).right;
		Object t = (Object)((java_cup.runtime.Symbol) CUP$ComParser$stack.elementAt(CUP$ComParser$top-1)).value;
		 System.out.println("Reduction factor -> LPAR expr RPAR"); 
              CUP$ComParser$result = parser.getSymbolFactory().newSymbol("factor",2, ((java_cup.runtime.Symbol)CUP$ComParser$stack.elementAt(CUP$ComParser$top-2)), ((java_cup.runtime.Symbol)CUP$ComParser$stack.peek()), RESULT);
            }
          return CUP$ComParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // term ::= factor 
            {
              Object RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$ComParser$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$ComParser$stack.peek()).right;
		Object t = (Object)((java_cup.runtime.Symbol) CUP$ComParser$stack.peek()).value;
		 System.out.println("Reduction terme -> facteur"); 
              CUP$ComParser$result = parser.getSymbolFactory().newSymbol("term",1, ((java_cup.runtime.Symbol)CUP$ComParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$ComParser$stack.peek()), RESULT);
            }
          return CUP$ComParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // term ::= term MULT factor 
            {
              Object RESULT =null;
		int t1left = ((java_cup.runtime.Symbol)CUP$ComParser$stack.elementAt(CUP$ComParser$top-2)).left;
		int t1right = ((java_cup.runtime.Symbol)CUP$ComParser$stack.elementAt(CUP$ComParser$top-2)).right;
		Object t1 = (Object)((java_cup.runtime.Symbol) CUP$ComParser$stack.elementAt(CUP$ComParser$top-2)).value;
		int t2left = ((java_cup.runtime.Symbol)CUP$ComParser$stack.peek()).left;
		int t2right = ((java_cup.runtime.Symbol)CUP$ComParser$stack.peek()).right;
		Object t2 = (Object)((java_cup.runtime.Symbol) CUP$ComParser$stack.peek()).value;
		 System.out.println("Reduction terme -> terme MULT facteur"); 
              CUP$ComParser$result = parser.getSymbolFactory().newSymbol("term",1, ((java_cup.runtime.Symbol)CUP$ComParser$stack.elementAt(CUP$ComParser$top-2)), ((java_cup.runtime.Symbol)CUP$ComParser$stack.peek()), RESULT);
            }
          return CUP$ComParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // expr ::= term 
            {
              Object RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$ComParser$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$ComParser$stack.peek()).right;
		Object t = (Object)((java_cup.runtime.Symbol) CUP$ComParser$stack.peek()).value;
		 System.out.println("Reduction expr -> term"); 
              CUP$ComParser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$ComParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$ComParser$stack.peek()), RESULT);
            }
          return CUP$ComParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // expr ::= expr PLUS term 
            {
              Object RESULT =null;
		int t1left = ((java_cup.runtime.Symbol)CUP$ComParser$stack.elementAt(CUP$ComParser$top-2)).left;
		int t1right = ((java_cup.runtime.Symbol)CUP$ComParser$stack.elementAt(CUP$ComParser$top-2)).right;
		Object t1 = (Object)((java_cup.runtime.Symbol) CUP$ComParser$stack.elementAt(CUP$ComParser$top-2)).value;
		int t2left = ((java_cup.runtime.Symbol)CUP$ComParser$stack.peek()).left;
		int t2right = ((java_cup.runtime.Symbol)CUP$ComParser$stack.peek()).right;
		Object t2 = (Object)((java_cup.runtime.Symbol) CUP$ComParser$stack.peek()).value;
		 System.out.println("Reduction expr -> expr + term"); 
              CUP$ComParser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$ComParser$stack.elementAt(CUP$ComParser$top-2)), ((java_cup.runtime.Symbol)CUP$ComParser$stack.peek()), RESULT);
            }
          return CUP$ComParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // axiom ::= expr SEMIC 
            {
              Object RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$ComParser$stack.elementAt(CUP$ComParser$top-1)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$ComParser$stack.elementAt(CUP$ComParser$top-1)).right;
		Object t = (Object)((java_cup.runtime.Symbol) CUP$ComParser$stack.elementAt(CUP$ComParser$top-1)).value;
		 System.out.println("Reduction axiom -> expr SEMIC"); 
              CUP$ComParser$result = parser.getSymbolFactory().newSymbol("axiom",3, ((java_cup.runtime.Symbol)CUP$ComParser$stack.elementAt(CUP$ComParser$top-1)), ((java_cup.runtime.Symbol)CUP$ComParser$stack.peek()), RESULT);
            }
          return CUP$ComParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= axiom EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$ComParser$stack.elementAt(CUP$ComParser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$ComParser$stack.elementAt(CUP$ComParser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$ComParser$stack.elementAt(CUP$ComParser$top-1)).value;
		RESULT = start_val;
              CUP$ComParser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$ComParser$stack.elementAt(CUP$ComParser$top-1)), ((java_cup.runtime.Symbol)CUP$ComParser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$ComParser$parser.done_parsing();
          return CUP$ComParser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}
