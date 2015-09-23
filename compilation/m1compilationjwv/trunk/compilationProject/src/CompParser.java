
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Wed Sep 23 11:52:52 CEST 2015
//----------------------------------------------------

import java_cup.runtime.*;
import java.util.Vector;
import java.io.*;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Wed Sep 23 11:52:52 CEST 2015
  */
public class CompParser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public CompParser() {super();}

  /** Constructor which sets the default scanner. */
  public CompParser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public CompParser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\031\000\002\002\004\000\002\006\004\000\002\006" +
    "\003\000\002\005\004\000\002\005\004\000\002\005\004" +
    "\000\002\005\004\000\002\002\005\000\002\002\003\000" +
    "\002\003\005\000\002\003\003\000\002\004\005\000\002" +
    "\004\003\000\002\007\003\000\002\007\003\000\002\010" +
    "\003\000\002\010\003\000\002\010\003\000\002\010\003" +
    "\000\002\010\003\000\002\011\002\000\002\011\003\000" +
    "\002\011\003\000\002\011\003\000\002\011\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\042\000\036\004\023\005\020\006\007\007\011\010" +
    "\015\011\025\012\024\013\010\014\022\015\004\022\013" +
    "\025\030\032\uffed\041\006\001\002\000\004\032\uffec\001" +
    "\002\000\006\032\044\043\032\001\002\000\004\032\uffe9" +
    "\001\002\000\004\032\ufff2\001\002\000\004\032\uffeb\001" +
    "\002\000\004\032\ufff1\001\002\000\040\002\uffff\004\023" +
    "\005\020\006\007\007\011\010\015\011\025\012\024\013" +
    "\010\014\022\015\004\022\013\025\030\032\uffed\041\006" +
    "\001\002\000\012\026\ufff5\032\ufff5\042\ufff5\043\ufff5\001" +
    "\002\000\004\032\042\001\002\000\004\032\ufff0\001\002" +
    "\000\004\002\041\001\002\000\012\026\ufff7\032\ufff7\042" +
    "\ufff7\043\ufff7\001\002\000\004\032\ufff3\001\002\000\012" +
    "\026\035\032\ufff9\042\ufff9\043\ufff9\001\002\000\004\032" +
    "\uffea\001\002\000\004\032\ufff4\001\002\000\004\032\uffee" +
    "\001\002\000\004\032\uffef\001\002\000\004\032\040\001" +
    "\002\000\004\032\037\001\002\000\006\022\013\025\030" +
    "\001\002\000\006\042\033\043\032\001\002\000\006\022" +
    "\013\025\030\001\002\000\012\026\ufff6\032\ufff6\042\ufff6" +
    "\043\ufff6\001\002\000\012\026\035\032\ufffa\042\ufffa\043" +
    "\ufffa\001\002\000\006\022\013\025\030\001\002\000\012" +
    "\026\ufff8\032\ufff8\042\ufff8\043\ufff8\001\002\000\040\002" +
    "\ufffb\004\ufffb\005\ufffb\006\ufffb\007\ufffb\010\ufffb\011\ufffb" +
    "\012\ufffb\013\ufffb\014\ufffb\015\ufffb\022\ufffb\025\ufffb\032" +
    "\ufffb\041\ufffb\001\002\000\040\002\ufffd\004\ufffd\005\ufffd" +
    "\006\ufffd\007\ufffd\010\ufffd\011\ufffd\012\ufffd\013\ufffd\014" +
    "\ufffd\015\ufffd\022\ufffd\025\ufffd\032\ufffd\041\ufffd\001\002" +
    "\000\004\002\001\001\002\000\040\002\ufffc\004\ufffc\005" +
    "\ufffc\006\ufffc\007\ufffc\010\ufffc\011\ufffc\012\ufffc\013\ufffc" +
    "\014\ufffc\015\ufffc\022\ufffc\025\ufffc\032\ufffc\041\ufffc\001" +
    "\002\000\004\002\000\001\002\000\040\002\ufffe\004\ufffe" +
    "\005\ufffe\006\ufffe\007\ufffe\010\ufffe\011\ufffe\012\ufffe\013" +
    "\ufffe\014\ufffe\015\ufffe\022\ufffe\025\ufffe\032\ufffe\041\ufffe" +
    "\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\042\000\022\002\004\003\020\004\016\005\011\006" +
    "\015\007\025\010\013\011\026\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\022\002\004\003\020" +
    "\004\016\005\011\006\042\007\025\010\013\011\026\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\010\002\030\003\020\004\016\001\001\000\002" +
    "\001\001\000\006\003\033\004\016\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\004\035\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$CompParser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$CompParser$actions(this);
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
    return action_obj.CUP$CompParser$do_action(act_num, parser, stack, top);
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
class CUP$CompParser$actions {
  private final CompParser parser;

  /** Constructor */
  CUP$CompParser$actions(CompParser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$CompParser$do_action(
    int                        CUP$CompParser$act_num,
    java_cup.runtime.lr_parser CUP$CompParser$parser,
    java.util.Stack            CUP$CompParser$stack,
    int                        CUP$CompParser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$CompParser$result;

      /* select the action based on the action number */
      switch (CUP$CompParser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // complextype ::= STRUCT 
            {
              Object RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()).right;
		Object t = (Object)((java_cup.runtime.Symbol) CUP$CompParser$stack.peek()).value;
		 System.out.println("Reduction complextype -> structure"); 
              CUP$CompParser$result = parser.getSymbolFactory().newSymbol("complextype",7, ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()), RESULT);
            }
          return CUP$CompParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // complextype ::= POINTER 
            {
              Object RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()).right;
		Object t = (Object)((java_cup.runtime.Symbol) CUP$CompParser$stack.peek()).value;
		 System.out.println("Reduction complextype -> ^"); 
              CUP$CompParser$result = parser.getSymbolFactory().newSymbol("complextype",7, ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()), RESULT);
            }
          return CUP$CompParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // complextype ::= LIST 
            {
              Object RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()).right;
		Object t = (Object)((java_cup.runtime.Symbol) CUP$CompParser$stack.peek()).value;
		 System.out.println("Reduction complextype -> list of"); 
              CUP$CompParser$result = parser.getSymbolFactory().newSymbol("complextype",7, ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()), RESULT);
            }
          return CUP$CompParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // complextype ::= CLASS 
            {
              Object RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()).right;
		Object t = (Object)((java_cup.runtime.Symbol) CUP$CompParser$stack.peek()).value;
		 System.out.println("Reduction complextype -> class"); 
              CUP$CompParser$result = parser.getSymbolFactory().newSymbol("complextype",7, ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()), RESULT);
            }
          return CUP$CompParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // complextype ::= 
            {
              Object RESULT =null;

              CUP$CompParser$result = parser.getSymbolFactory().newSymbol("complextype",7, ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()), RESULT);
            }
          return CUP$CompParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // typekeyword ::= STR 
            {
              Object RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()).right;
		Object t = (Object)((java_cup.runtime.Symbol) CUP$CompParser$stack.peek()).value;
		 System.out.println("Reduction typekeyword -> string"); 
              CUP$CompParser$result = parser.getSymbolFactory().newSymbol("typekeyword",6, ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()), RESULT);
            }
          return CUP$CompParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // typekeyword ::= BOOL 
            {
              Object RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()).right;
		Object t = (Object)((java_cup.runtime.Symbol) CUP$CompParser$stack.peek()).value;
		 System.out.println("Reduction typekeyword -> boolean"); 
              CUP$CompParser$result = parser.getSymbolFactory().newSymbol("typekeyword",6, ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()), RESULT);
            }
          return CUP$CompParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // typekeyword ::= FLOAT 
            {
              Object RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()).right;
		Object t = (Object)((java_cup.runtime.Symbol) CUP$CompParser$stack.peek()).value;
		 System.out.println("Reduction typekeyword -> float"); 
              CUP$CompParser$result = parser.getSymbolFactory().newSymbol("typekeyword",6, ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()), RESULT);
            }
          return CUP$CompParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // typekeyword ::= CHAR 
            {
              Object RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()).right;
		Object t = (Object)((java_cup.runtime.Symbol) CUP$CompParser$stack.peek()).value;
		 System.out.println("Reduction typekeyword -> character"); 
              CUP$CompParser$result = parser.getSymbolFactory().newSymbol("typekeyword",6, ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()), RESULT);
            }
          return CUP$CompParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // typekeyword ::= INT 
            {
              Object RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()).right;
		Object t = (Object)((java_cup.runtime.Symbol) CUP$CompParser$stack.peek()).value;
		 System.out.println("Reduction typekeyword -> integer"); 
              CUP$CompParser$result = parser.getSymbolFactory().newSymbol("typekeyword",6, ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()), RESULT);
            }
          return CUP$CompParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // keyword ::= MAIN 
            {
              Object RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()).right;
		Object t = (Object)((java_cup.runtime.Symbol) CUP$CompParser$stack.peek()).value;
		 System.out.println("Reduction keyword -> main"); 
              CUP$CompParser$result = parser.getSymbolFactory().newSymbol("keyword",5, ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()), RESULT);
            }
          return CUP$CompParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // keyword ::= PROC 
            {
              Object RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()).right;
		Object t = (Object)((java_cup.runtime.Symbol) CUP$CompParser$stack.peek()).value;
		 System.out.println("Reduction keyword -> procedure"); 
              CUP$CompParser$result = parser.getSymbolFactory().newSymbol("keyword",5, ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()), RESULT);
            }
          return CUP$CompParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // factor ::= ID 
            {
              Object RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()).right;
		Object t = (Object)((java_cup.runtime.Symbol) CUP$CompParser$stack.peek()).value;
		 System.out.println("Reduction factor -> ID"); 
              CUP$CompParser$result = parser.getSymbolFactory().newSymbol("factor",2, ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()), RESULT);
            }
          return CUP$CompParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // factor ::= LPAR expr RPAR 
            {
              Object RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$CompParser$stack.elementAt(CUP$CompParser$top-1)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$CompParser$stack.elementAt(CUP$CompParser$top-1)).right;
		Object t = (Object)((java_cup.runtime.Symbol) CUP$CompParser$stack.elementAt(CUP$CompParser$top-1)).value;
		 System.out.println("Reduction factor -> LPAR expr RPAR"); 
              CUP$CompParser$result = parser.getSymbolFactory().newSymbol("factor",2, ((java_cup.runtime.Symbol)CUP$CompParser$stack.elementAt(CUP$CompParser$top-2)), ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()), RESULT);
            }
          return CUP$CompParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // term ::= factor 
            {
              Object RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()).right;
		Object t = (Object)((java_cup.runtime.Symbol) CUP$CompParser$stack.peek()).value;
		 System.out.println("Reduction terme -> facteur"); 
              CUP$CompParser$result = parser.getSymbolFactory().newSymbol("term",1, ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()), RESULT);
            }
          return CUP$CompParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // term ::= term MULT factor 
            {
              Object RESULT =null;
		int t1left = ((java_cup.runtime.Symbol)CUP$CompParser$stack.elementAt(CUP$CompParser$top-2)).left;
		int t1right = ((java_cup.runtime.Symbol)CUP$CompParser$stack.elementAt(CUP$CompParser$top-2)).right;
		Object t1 = (Object)((java_cup.runtime.Symbol) CUP$CompParser$stack.elementAt(CUP$CompParser$top-2)).value;
		int t2left = ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()).left;
		int t2right = ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()).right;
		Object t2 = (Object)((java_cup.runtime.Symbol) CUP$CompParser$stack.peek()).value;
		 System.out.println("Reduction terme -> terme MULT facteur"); 
              CUP$CompParser$result = parser.getSymbolFactory().newSymbol("term",1, ((java_cup.runtime.Symbol)CUP$CompParser$stack.elementAt(CUP$CompParser$top-2)), ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()), RESULT);
            }
          return CUP$CompParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // expr ::= term 
            {
              Object RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()).right;
		Object t = (Object)((java_cup.runtime.Symbol) CUP$CompParser$stack.peek()).value;
		 System.out.println("Reduction expr -> term"); 
              CUP$CompParser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()), RESULT);
            }
          return CUP$CompParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // expr ::= expr PLUS term 
            {
              Object RESULT =null;
		int t1left = ((java_cup.runtime.Symbol)CUP$CompParser$stack.elementAt(CUP$CompParser$top-2)).left;
		int t1right = ((java_cup.runtime.Symbol)CUP$CompParser$stack.elementAt(CUP$CompParser$top-2)).right;
		Object t1 = (Object)((java_cup.runtime.Symbol) CUP$CompParser$stack.elementAt(CUP$CompParser$top-2)).value;
		int t2left = ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()).left;
		int t2right = ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()).right;
		Object t2 = (Object)((java_cup.runtime.Symbol) CUP$CompParser$stack.peek()).value;
		 System.out.println("Reduction expr -> expr + term"); 
              CUP$CompParser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$CompParser$stack.elementAt(CUP$CompParser$top-2)), ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()), RESULT);
            }
          return CUP$CompParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // axiom ::= complextype SEMIC 
            {
              Object RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$CompParser$stack.elementAt(CUP$CompParser$top-1)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$CompParser$stack.elementAt(CUP$CompParser$top-1)).right;
		Object t = (Object)((java_cup.runtime.Symbol) CUP$CompParser$stack.elementAt(CUP$CompParser$top-1)).value;
		 System.out.println("Reduction axiom -> complextype SEMIC"); 
              CUP$CompParser$result = parser.getSymbolFactory().newSymbol("axiom",3, ((java_cup.runtime.Symbol)CUP$CompParser$stack.elementAt(CUP$CompParser$top-1)), ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()), RESULT);
            }
          return CUP$CompParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // axiom ::= typekeyword SEMIC 
            {
              Object RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$CompParser$stack.elementAt(CUP$CompParser$top-1)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$CompParser$stack.elementAt(CUP$CompParser$top-1)).right;
		Object t = (Object)((java_cup.runtime.Symbol) CUP$CompParser$stack.elementAt(CUP$CompParser$top-1)).value;
		 System.out.println("Reduction axiom -> typekeyword SEMIC"); 
              CUP$CompParser$result = parser.getSymbolFactory().newSymbol("axiom",3, ((java_cup.runtime.Symbol)CUP$CompParser$stack.elementAt(CUP$CompParser$top-1)), ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()), RESULT);
            }
          return CUP$CompParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // axiom ::= keyword SEMIC 
            {
              Object RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$CompParser$stack.elementAt(CUP$CompParser$top-1)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$CompParser$stack.elementAt(CUP$CompParser$top-1)).right;
		Object t = (Object)((java_cup.runtime.Symbol) CUP$CompParser$stack.elementAt(CUP$CompParser$top-1)).value;
		 System.out.println("Reduction axiom -> keyword SEMIC"); 
              CUP$CompParser$result = parser.getSymbolFactory().newSymbol("axiom",3, ((java_cup.runtime.Symbol)CUP$CompParser$stack.elementAt(CUP$CompParser$top-1)), ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()), RESULT);
            }
          return CUP$CompParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // axiom ::= expr SEMIC 
            {
              Object RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$CompParser$stack.elementAt(CUP$CompParser$top-1)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$CompParser$stack.elementAt(CUP$CompParser$top-1)).right;
		Object t = (Object)((java_cup.runtime.Symbol) CUP$CompParser$stack.elementAt(CUP$CompParser$top-1)).value;
		 System.out.println("Reduction axiom -> expr SEMIC"); 
              CUP$CompParser$result = parser.getSymbolFactory().newSymbol("axiom",3, ((java_cup.runtime.Symbol)CUP$CompParser$stack.elementAt(CUP$CompParser$top-1)), ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()), RESULT);
            }
          return CUP$CompParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // axioms ::= axiom 
            {
              Object RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()).right;
		Object t = (Object)((java_cup.runtime.Symbol) CUP$CompParser$stack.peek()).value;

              CUP$CompParser$result = parser.getSymbolFactory().newSymbol("axioms",4, ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()), RESULT);
            }
          return CUP$CompParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // axioms ::= axiom axioms 
            {
              Object RESULT =null;
		int t1left = ((java_cup.runtime.Symbol)CUP$CompParser$stack.elementAt(CUP$CompParser$top-1)).left;
		int t1right = ((java_cup.runtime.Symbol)CUP$CompParser$stack.elementAt(CUP$CompParser$top-1)).right;
		Object t1 = (Object)((java_cup.runtime.Symbol) CUP$CompParser$stack.elementAt(CUP$CompParser$top-1)).value;
		int t2left = ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()).left;
		int t2right = ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()).right;
		Object t2 = (Object)((java_cup.runtime.Symbol) CUP$CompParser$stack.peek()).value;

              CUP$CompParser$result = parser.getSymbolFactory().newSymbol("axioms",4, ((java_cup.runtime.Symbol)CUP$CompParser$stack.elementAt(CUP$CompParser$top-1)), ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()), RESULT);
            }
          return CUP$CompParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= axioms EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$CompParser$stack.elementAt(CUP$CompParser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$CompParser$stack.elementAt(CUP$CompParser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$CompParser$stack.elementAt(CUP$CompParser$top-1)).value;
		RESULT = start_val;
              CUP$CompParser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$CompParser$stack.elementAt(CUP$CompParser$top-1)), ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$CompParser$parser.done_parsing();
          return CUP$CompParser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

