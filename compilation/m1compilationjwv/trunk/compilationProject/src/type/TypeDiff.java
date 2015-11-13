package type;

public class TypeDiff {

	private Type x;
	private Type y;

    public TypeDiff(Type x, Type y) { 
		this.x = x;
		this.y = y;
    }
    public boolean IsDiff(){
        return (x.getEnumType() == y.getEnumType());
    }
}
