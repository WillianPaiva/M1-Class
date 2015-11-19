package syntaxtree;

public enum EnunTag {
    MULT("*"),
    ROOT("root"),
    SUCC("succ"),
    MOD("%"),
    MIN("-"),
    DIV("/"),
    NOT("!"),
    AND("&&"),
    TRUE("true"),
    FALSE("false"),
    NULL("null"),
    INF("<"),
    PLUS("+"),
    SUP(">"),
    OR("||"),
    EQ("="),
    EQUALS("=="),
    GEQL(">="),
    LEQL("<="),
    DIFF("!="),
    COLON(":"),
    INCR("++"),
    DECR("--"),
    LPAR("("),
    RPAR(")"),
    SEMIC(";"),
    NEWBLOCK("{"),
    ENDBLOCK("}"),
    COMMA(","),
    IF("if"),
    THENELSE("thenelse"),
    WHILE("while"),
    EXIT("exit"),
    RETURN("return"),
    FOR("for"), 
    SBRKL("["),
    SBRKR("]"),
    NB("nb"),
    FLOATNB("float"),
    STRING("string"),
    ID("id"),
    CALL("call"),
    VAR("var"),
    PARAM("param"),
    FUN("fun"),
    CLASS("class"),
    MAIN("main");


    private final String tag;

    EnunTag(String s){
            tag = s;
    }

    public String toString(){
            return tag;
    }
}
