
import java_cup.runtime.*;

%%
%class CompLexer
%line
%column
%cupsym CompSymbol
%cup
%{
public StringBuilder str;
private Symbol symbol (int type) {
        return new Symbol (type, yyline, yycolumn);
}

private Symbol symbol (int type, Object value) {
        return new Symbol (type, yyline, yycolumn, value);
}
%}
%state STRING

ALPHA     = [a-zA-Z_]
ALPHA_NUM = {ALPHA}|[0-9]
CHRACTERE = [^\n\r]
NEWLINE   = \n |\r |\r\n
SPACING   = [ \t\f] | {NEWLINE}
COMMENT_LINE = "//" {CHRACTERE}* {NEWLINE} 
COMMENT = "/*" ~"*/"
ID        = {ALPHA}({ALPHA_NUM})*
NB        = 0|[1-9][0-9]*
%%

/* -------------------------------------------------
		Mots reserves
   ------------------------------------------------- */
<STRING>{
    \"          {yybegin(YYINITIAL);
                 str.append('"');
                 return symbol(CompSymbol.STRING, str.toString());}
    . | \\\"    {str.append(yytext());}
}

<YYINITIAL>{
    \"                         { str= new StringBuilder();
                         str.append('"');
                         yybegin(STRING);}

    "=="                       { return symbol(CompSymbol.EQUALS);}
    "!="                       { return symbol(CompSymbol.DIFF);}
    "<="                       { return symbol(CompSymbol.LEQL);}
    ">="                       { return symbol(CompSymbol.GEQL);}
    "++"                       { return symbol(CompSymbol.INCR);}
    "--"                       { return symbol(CompSymbol.DECR);}
    "&&"                        { return symbol(CompSymbol.AND);}
    "||"                        { return symbol(CompSymbol.OR);}

    "procedure"{SPACING}"main" { return symbol(CompSymbol.MAIN);}
    "procedure"                { return symbol(CompSymbol.PROC);}
    "integer"                  { return symbol(CompSymbol.INT);}
    "character"                { return symbol(CompSymbol.CHAR);}
    "float"                    { return symbol(CompSymbol.FLOAT);}
    "boolean"                  { return symbol(CompSymbol.BOOL);}
    "string"                   { return symbol(CompSymbol.STR);}
    "listof"                   { return symbol(CompSymbol.LIST);}
    "^"                        { return symbol(CompSymbol.POINTER);}
    "structure"                { return symbol(CompSymbol.STRUCT);}
    "class"                    { return symbol(CompSymbol.CLASS);}
    "true"                     { return symbol(CompSymbol.TRUE);}
    "false"                    { return symbol(CompSymbol.FALSE);}
    "null"                     { return symbol(CompSymbol.NULL);}
    "type"                     { return symbol(CompSymbol.TP);}

    "if"                       { return symbol(CompSymbol.IF);}
    "else"                     { return symbol(CompSymbol.ELSE);}
    "while"                    { return symbol(CompSymbol.WHILE);}
    "exit"                     { return symbol(CompSymbol.EXIT);}
    "for"                      { return symbol(CompSymbol.FOR);}
    "return"                   { return symbol(CompSymbol.RETURN);}

    {ID}                       { return symbol(CompSymbol.ID, new String(yytext()));}
    {NB}\.{NB}                 { return symbol(CompSymbol.FLOATNB , new Float(yytext())) ;}
    {NB}                       { return symbol(CompSymbol.NB, new Integer(yytext()));}
    /* -------------------------------------------------
            Separateurs Operateurs
    ------------------------------------------------- */

    "("                        { return symbol(CompSymbol.LPAR);}
    ")"                        { return symbol(CompSymbol.RPAR);}
    "+"                        { return symbol(CompSymbol.PLUS);}
    "*"                        { return symbol(CompSymbol.MULT);}
    "%"                        { return symbol(CompSymbol.MOD);}
    "-"                        { return symbol(CompSymbol.MIN);}
    "/"                        { return symbol(CompSymbol.DIV);}
    ","                        { return symbol(CompSymbol.COMMA);}
    ";"                        { return symbol(CompSymbol.SEMIC);}
    "{"                        { return symbol(CompSymbol.NEWBLOCK); 	}
    "}"                        { return symbol(CompSymbol.ENDBLOCK);	}
    "["                        { return symbol(CompSymbol.SBRKL); 	}
    "]"                        { return symbol(CompSymbol.SBRKR);	}
    "<"                        { return symbol(CompSymbol.INF);}
    ">"                        { return symbol(CompSymbol.SUP);}
    "!"                        { return symbol(CompSymbol.NOT);}
    "="                        { return symbol(CompSymbol.EQ);}
    ":"                        { return symbol(CompSymbol.COLON);}

}
 /* -------------------------------------------------
        Caracteres non pris en compte
   ------------------------------------------------- */

{SPACING}|{COMMENT}|{COMMENT_LINE} {}

/* -------------------------------------------------
        Erreurs
   ------------------------------------------------- */
.               {}
