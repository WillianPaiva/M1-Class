
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Wed Sep 23 17:24:12 CEST 2015
//----------------------------------------------------

import java_cup.runtime.*;
import java.util.Vector;
import java.io.*;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Wed Sep 23 17:24:12 CEST 2015
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
    "\000\030\000\002\002\004\000\002\012\004\000\002\012" +
    "\002\000\002\013\005\000\002\013\007\000\002\013\003" +
    "\000\002\014\010\000\002\015\005\000\002\017\004\000" +
    "\002\017\006\000\002\017\002\000\002\016\003\000\002" +
    "\016\003\000\002\016\003\000\002\010\003\000\002\010" +
    "\003\000\002\010\003\000\002\010\003\000\002\010\003" +
    "\000\002\011\003\000\002\011\003\000\002\011\003\000" +
    "\002\011\003\000\002\011\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\037\000\016\002\uffff\007\004\010\014\011\013\012" +
    "\007\013\005\001\002\000\004\055\ufff3\001\002\000\004" +
    "\055\ufff0\001\002\000\020\002\uffff\007\004\010\014\011" +
    "\013\012\007\013\005\045\uffff\001\002\000\004\055\uffef" +
    "\001\002\000\004\002\040\001\002\000\020\002\ufffc\007" +
    "\ufffc\010\ufffc\011\ufffc\012\ufffc\013\ufffc\045\ufffc\001\002" +
    "\000\004\055\015\001\002\000\004\055\ufff1\001\002\000" +
    "\004\055\ufff2\001\002\000\010\034\016\041\017\043\020" +
    "\001\002\000\010\054\035\055\033\056\034\001\002\000" +
    "\016\007\004\010\014\011\013\012\007\013\005\042\ufff7" +
    "\001\002\000\020\002\ufffe\007\ufffe\010\ufffe\011\ufffe\012" +
    "\ufffe\013\ufffe\045\ufffe\001\002\000\004\055\030\001\002" +
    "\000\004\042\023\001\002\000\004\044\024\001\002\000" +
    "\016\007\004\010\014\011\013\012\007\013\005\045\uffff" +
    "\001\002\000\020\002\ufffb\007\ufffb\010\ufffb\011\ufffb\012" +
    "\ufffb\013\ufffb\045\ufffb\001\002\000\004\045\027\001\002" +
    "\000\020\002\ufffa\007\ufffa\010\ufffa\011\ufffa\012\ufffa\013" +
    "\ufffa\045\ufffa\001\002\000\006\042\ufff9\046\031\001\002" +
    "\000\016\007\004\010\014\011\013\012\007\013\005\042" +
    "\ufff7\001\002\000\004\042\ufff8\001\002\000\004\043\ufff6" +
    "\001\002\000\004\043\ufff4\001\002\000\004\043\ufff5\001" +
    "\002\000\004\043\037\001\002\000\020\002\ufffd\007\ufffd" +
    "\010\ufffd\011\ufffd\012\ufffd\013\ufffd\045\ufffd\001\002\000" +
    "\004\002\001\001\002\000\006\002\000\045\000\001\002" +
    "" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\037\000\012\010\011\012\007\013\005\014\010\001" +
    "\001\000\002\001\001\000\002\001\001\000\012\010\011" +
    "\012\040\013\005\014\010\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\016" +
    "\035\001\001\000\006\010\020\017\021\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\015" +
    "\024\001\001\000\012\010\011\012\025\013\005\014\010" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\006\010\020\017\031\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001" });

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
          case 23: // complextype ::= PROC 
            {
              Object RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()).right;
		Object t = (Object)((java_cup.runtime.Symbol) CUP$CompParser$stack.peek()).value;
		 System.out.println("complextype -> procedure"); 
              CUP$CompParser$result = parser.getSymbolFactory().newSymbol("complextype",7, ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()), RESULT);
            }
          return CUP$CompParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // complextype ::= STRUCT 
            {
              Object RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()).right;
		Object t = (Object)((java_cup.runtime.Symbol) CUP$CompParser$stack.peek()).value;
		 System.out.println("complextype -> structure"); 
              CUP$CompParser$result = parser.getSymbolFactory().newSymbol("complextype",7, ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()), RESULT);
            }
          return CUP$CompParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // complextype ::= POINTER 
            {
              Object RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()).right;
		Object t = (Object)((java_cup.runtime.Symbol) CUP$CompParser$stack.peek()).value;
		 System.out.println("complextype -> ^"); 
              CUP$CompParser$result = parser.getSymbolFactory().newSymbol("complextype",7, ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()), RESULT);
            }
          return CUP$CompParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // complextype ::= LIST 
            {
              Object RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()).right;
		Object t = (Object)((java_cup.runtime.Symbol) CUP$CompParser$stack.peek()).value;
		 System.out.println("complextype -> list of"); 
              CUP$CompParser$result = parser.getSymbolFactory().newSymbol("complextype",7, ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()), RESULT);
            }
          return CUP$CompParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // complextype ::= CLASS 
            {
              Object RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()).right;
		Object t = (Object)((java_cup.runtime.Symbol) CUP$CompParser$stack.peek()).value;
		 System.out.println("complextype -> class"); 
              CUP$CompParser$result = parser.getSymbolFactory().newSymbol("complextype",7, ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()), RESULT);
            }
          return CUP$CompParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // type ::= STR 
            {
              Object RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()).right;
		Object t = (Object)((java_cup.runtime.Symbol) CUP$CompParser$stack.peek()).value;
		 System.out.println("type -> string"); 
              CUP$CompParser$result = parser.getSymbolFactory().newSymbol("type",6, ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()), RESULT);
            }
          return CUP$CompParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // type ::= BOOL 
            {
              Object RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()).right;
		Object t = (Object)((java_cup.runtime.Symbol) CUP$CompParser$stack.peek()).value;
		 System.out.println("type -> boolean"); 
              CUP$CompParser$result = parser.getSymbolFactory().newSymbol("type",6, ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()), RESULT);
            }
          return CUP$CompParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // type ::= FLOAT 
            {
              Object RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()).right;
		Object t = (Object)((java_cup.runtime.Symbol) CUP$CompParser$stack.peek()).value;
		 System.out.println("type -> float"); 
              CUP$CompParser$result = parser.getSymbolFactory().newSymbol("type",6, ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()), RESULT);
            }
          return CUP$CompParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // type ::= CHAR 
            {
              Object RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()).right;
		Object t = (Object)((java_cup.runtime.Symbol) CUP$CompParser$stack.peek()).value;
		 System.out.println("type -> character"); 
              CUP$CompParser$result = parser.getSymbolFactory().newSymbol("type",6, ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()), RESULT);
            }
          return CUP$CompParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // type ::= INT 
            {
              Object RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()).right;
		Object t = (Object)((java_cup.runtime.Symbol) CUP$CompParser$stack.peek()).value;
		 System.out.println("type -> integer"); 
              CUP$CompParser$result = parser.getSymbolFactory().newSymbol("type",6, ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()), RESULT);
            }
          return CUP$CompParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // value ::= NB 
            {
              Object RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()).right;
		Integer t = (Integer)((java_cup.runtime.Symbol) CUP$CompParser$stack.peek()).value;
		 System.out.println(t);
              CUP$CompParser$result = parser.getSymbolFactory().newSymbol("value",12, ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()), RESULT);
            }
          return CUP$CompParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // value ::= STRING 
            {
              Object RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()).right;
		String t = (String)((java_cup.runtime.Symbol) CUP$CompParser$stack.peek()).value;
		 System.out.println(t);
              CUP$CompParser$result = parser.getSymbolFactory().newSymbol("value",12, ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()), RESULT);
            }
          return CUP$CompParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // value ::= ID 
            {
              Object RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()).right;
		String t = (String)((java_cup.runtime.Symbol) CUP$CompParser$stack.peek()).value;
		 System.out.println(t);
              CUP$CompParser$result = parser.getSymbolFactory().newSymbol("value",12, ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()), RESULT);
            }
          return CUP$CompParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // parameters ::= 
            {
              Object RESULT =null;

              CUP$CompParser$result = parser.getSymbolFactory().newSymbol("parameters",13, ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()), RESULT);
            }
          return CUP$CompParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // parameters ::= type ID COMMA parameters 
            {
              Object RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$CompParser$stack.elementAt(CUP$CompParser$top-3)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$CompParser$stack.elementAt(CUP$CompParser$top-3)).right;
		Object t = (Object)((java_cup.runtime.Symbol) CUP$CompParser$stack.elementAt(CUP$CompParser$top-3)).value;
		int idleft = ((java_cup.runtime.Symbol)CUP$CompParser$stack.elementAt(CUP$CompParser$top-2)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$CompParser$stack.elementAt(CUP$CompParser$top-2)).right;
		String id = (String)((java_cup.runtime.Symbol) CUP$CompParser$stack.elementAt(CUP$CompParser$top-2)).value;
		 System.out.println("mult parameters");
              CUP$CompParser$result = parser.getSymbolFactory().newSymbol("parameters",13, ((java_cup.runtime.Symbol)CUP$CompParser$stack.elementAt(CUP$CompParser$top-3)), ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()), RESULT);
            }
          return CUP$CompParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // parameters ::= type ID 
            {
              Object RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$CompParser$stack.elementAt(CUP$CompParser$top-1)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$CompParser$stack.elementAt(CUP$CompParser$top-1)).right;
		Object t = (Object)((java_cup.runtime.Symbol) CUP$CompParser$stack.elementAt(CUP$CompParser$top-1)).value;
		int idleft = ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()).left;
		int idright = ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()).right;
		String id = (String)((java_cup.runtime.Symbol) CUP$CompParser$stack.peek()).value;
		 System.out.println("parameter");
              CUP$CompParser$result = parser.getSymbolFactory().newSymbol("parameters",13, ((java_cup.runtime.Symbol)CUP$CompParser$stack.elementAt(CUP$CompParser$top-1)), ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()), RESULT);
            }
          return CUP$CompParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // codeblock ::= NEWBLOCK program ENDBLOCK 
            {
              Object RESULT =null;
		System.out.println("codeblock"); 
              CUP$CompParser$result = parser.getSymbolFactory().newSymbol("codeblock",11, ((java_cup.runtime.Symbol)CUP$CompParser$stack.elementAt(CUP$CompParser$top-2)), ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()), RESULT);
            }
          return CUP$CompParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // function ::= type ID LPAR parameters RPAR codeblock 
            {
              Object RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$CompParser$stack.elementAt(CUP$CompParser$top-5)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$CompParser$stack.elementAt(CUP$CompParser$top-5)).right;
		Object t = (Object)((java_cup.runtime.Symbol) CUP$CompParser$stack.elementAt(CUP$CompParser$top-5)).value;
		int idleft = ((java_cup.runtime.Symbol)CUP$CompParser$stack.elementAt(CUP$CompParser$top-4)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$CompParser$stack.elementAt(CUP$CompParser$top-4)).right;
		String id = (String)((java_cup.runtime.Symbol) CUP$CompParser$stack.elementAt(CUP$CompParser$top-4)).value;
		 System.out.println("function");
              CUP$CompParser$result = parser.getSymbolFactory().newSymbol("function",10, ((java_cup.runtime.Symbol)CUP$CompParser$stack.elementAt(CUP$CompParser$top-5)), ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()), RESULT);
            }
          return CUP$CompParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // declaration ::= function 
            {
              Object RESULT =null;

              CUP$CompParser$result = parser.getSymbolFactory().newSymbol("declaration",9, ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()), RESULT);
            }
          return CUP$CompParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // declaration ::= type ID EQ value SEMIC 
            {
              Object RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$CompParser$stack.elementAt(CUP$CompParser$top-4)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$CompParser$stack.elementAt(CUP$CompParser$top-4)).right;
		Object t = (Object)((java_cup.runtime.Symbol) CUP$CompParser$stack.elementAt(CUP$CompParser$top-4)).value;
		int idleft = ((java_cup.runtime.Symbol)CUP$CompParser$stack.elementAt(CUP$CompParser$top-3)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$CompParser$stack.elementAt(CUP$CompParser$top-3)).right;
		String id = (String)((java_cup.runtime.Symbol) CUP$CompParser$stack.elementAt(CUP$CompParser$top-3)).value;
		 System.out.println("dec -> dec init");
              CUP$CompParser$result = parser.getSymbolFactory().newSymbol("declaration",9, ((java_cup.runtime.Symbol)CUP$CompParser$stack.elementAt(CUP$CompParser$top-4)), ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()), RESULT);
            }
          return CUP$CompParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // declaration ::= type ID SEMIC 
            {
              Object RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$CompParser$stack.elementAt(CUP$CompParser$top-2)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$CompParser$stack.elementAt(CUP$CompParser$top-2)).right;
		Object t = (Object)((java_cup.runtime.Symbol) CUP$CompParser$stack.elementAt(CUP$CompParser$top-2)).value;
		int idleft = ((java_cup.runtime.Symbol)CUP$CompParser$stack.elementAt(CUP$CompParser$top-1)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$CompParser$stack.elementAt(CUP$CompParser$top-1)).right;
		String id = (String)((java_cup.runtime.Symbol) CUP$CompParser$stack.elementAt(CUP$CompParser$top-1)).value;
		 System.out.println("dec -> dec not init");
              CUP$CompParser$result = parser.getSymbolFactory().newSymbol("declaration",9, ((java_cup.runtime.Symbol)CUP$CompParser$stack.elementAt(CUP$CompParser$top-2)), ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()), RESULT);
            }
          return CUP$CompParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // program ::= 
            {
              Object RESULT =null;

              CUP$CompParser$result = parser.getSymbolFactory().newSymbol("program",8, ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()), RESULT);
            }
          return CUP$CompParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // program ::= declaration program 
            {
              Object RESULT =null;

              CUP$CompParser$result = parser.getSymbolFactory().newSymbol("program",8, ((java_cup.runtime.Symbol)CUP$CompParser$stack.elementAt(CUP$CompParser$top-1)), ((java_cup.runtime.Symbol)CUP$CompParser$stack.peek()), RESULT);
            }
          return CUP$CompParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= program EOF 
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

