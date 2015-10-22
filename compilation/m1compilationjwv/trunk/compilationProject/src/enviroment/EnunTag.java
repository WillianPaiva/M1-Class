package enviroment;

public enum EnunTag {
    MULT("*"),
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
    ELSE("else"),
    WHILE("while"),
    EXIT("exit"),
    RETURN("return"),
    FOR("for"), 
    SBRKL("["),
    SBRKR("]"),

    private final String tag;

    EnumTag(String s){
            tag = s;
    }

    public String toString(){
            return tag;
    }
}
