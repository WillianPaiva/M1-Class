package type;

/* tree implementing a type*/

public class Type {
    
    private Type left;
    private Type right;
    private EnumType type;	
    private Integer integer; // array size
    

    public Type(Type left, Type right, Integer i, EnumType type) {
	this.left=left;
	this.right=right;
	this.integer=i;
	this.type=type;
    }
    
    public Type(Type left, Type right, EnumType type) {
    	this(left,right,0, type);
        }
        
    
    public Type(EnumType type) {
    	this(null,null,type);
    }
    
    public Type getLeft() {
	return left;
    }
    
    public void setLeft(Type left) {
	this.left = left;
    }
    
    public Type getRight() {
	return right;
    }
    
    public void setRight(Type right) {
	this.right = right;
    }
    
    public EnumType getEnumType() {
    	return this.type;
    }

    public TypeDiff Diff(Type t){
       return new TypeDiff(this, t); 
    }
    
    public Type unify(Type t){
        if(Diff(t).IsDiff()){
            return this;
        }else{
            return new Type(EnumType.ERROR);
        }
    }

    public String toString() {
        String temp = "";
        if(left != null){
            temp = temp + left.toString();
        }
        temp = temp + type.toString();
        if(right != null){
            temp = temp + right.toString();
        }
        return temp;

    }
}
