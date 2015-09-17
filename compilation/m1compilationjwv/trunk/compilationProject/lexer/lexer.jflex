
import java_cup.runtime.*;

%%
%class CompLexer
%line
%column
%cupsym CompSymbol
%cup

%{
private Symbol symbol (int type) {
        return new Symbol (type, yyline, yycolumn);
}

private Symbol symbol (int type, Object value) {
        return new Symbol (type, yyline, yycolumn, value);
}
%}
%x COMMENT COMMENT_LINE
id      = [a-zA-Z][a-zA-Z0-9_]*
nb      = 0|[1-9][0-9]*
%%

/* -------------------------------------------------
		Mots reserves
   ------------------------------------------------- */
//multiline comments
"/*"               { BEGIN(COMMENT);                    }
<COMMENT>"*/"      { BEGIN(INITIAL);                    }
<COMMENT>.         {                                    }
//single line comments  
"//"               { BEGIN(COMMENT_LINE);               }
<COMMENT_LINE>"\n" { BEGIN(INITIAL);                    }
<COMMENT_LINE>.    {                                    }
"procedure"        { return symbol(CompSymbol.PROC);    }
"main"             { return symbol(CompSymbol.MAIN);    }
"integer"          { return symbol(CompSymbol.INT);     }
"character"        { return symbol(CompSymbol.CHAR);    }
"float"            { return symbol(CompSymbol.FLOAT);   }
"boolean"          { return symbol(CompSymbol.BOOL);    }
"string"           { return symbol(CompSymbol.STR);     }
"list of"          { return symbol(CompSymbol.LIST);    }
"^"                { return symbol(CompSymbol.POINTER); }
"structure"        { return symbol(CompSymbol.STRUCT);  }
"class"            { return symbol(CompSymbol.CLASS);   }
"type"             { return symbol(CompSymbol.TYPE);    }
"true"             { return symbol(CompSymbol.TRUE);    }
"false"            { return symbol(CompSymbol.FALSE);   }
"null"             { return symbol(CompSymbol.NULL);    }
{id}               {return symbol(CompSymbol.ID);      }
{nb}               {return symbol(CompSymbol.NB);      }


/* -------------------------------------------------
        Separateurs Operateurs
   ------------------------------------------------- */

"("      { return symbol(CompSymbol.LPAR); 	}
")"      { return symbol(CompSymbol.RPAR);	}
"+"    	 { return symbol(CompSymbol.PLUS);	}
"*"      { return symbol(CompSymbol.MULT);	}
"%"	     { return symbol(CompSymbol.MOD);	}
"-"	     { return symbol(CompSymbol.MIN);	}
"/"	     { return symbol(CompSymbol.DIV);	}
";"      { return symbol(CompSymbol.SEMIC);	}
"{"	     { return symbol(CompSymbol.NEWBLOCK); 	}
"}"	     { return symbol(CompSymbol.ENDBLOCK);	}
"<"	     { return symbol(CompSymbol.INF);	}
">"	     { return symbol(CompSymbol.SUP);	}
"!"	     { return symbol(CompSymbol.NOT);	}
"&"	     { return symbol(CompSymbol.AND);	}


 /* -------------------------------------------------
        Caracteres non pris en compte
   ------------------------------------------------- */

[\t|\n|\r|\r\n]                  {}

/* -------------------------------------------------
        Erreurs
   ------------------------------------------------- */
. {}
