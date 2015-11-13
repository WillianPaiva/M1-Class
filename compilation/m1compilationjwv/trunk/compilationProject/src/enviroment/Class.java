import java.util.Map;
import sun.security.pkcs11.wrapper.Functions;

class Class {
    int size;
    String classType;
    String name;
    Env env;
    Map<String, Function> functions;

	/**
	 *
	 */
    public Class(int size, String classType, String name,Env env, Map<String, Function> functions) {
        this.size = size;
        this.classType = classType;
        this.name = name;
        this.env = env;
        this.functions = functions;
	}

	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}

	/**
	 * @return the classType
	 */
	public String getClassType() {
		return classType;
	}

	/**
	 * @param classType the classType to set
	 */
	public void setClassType(String classType) {
		this.classType = classType;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the variables
	 */
	public Map<String, Variable> getVariables() {
		return variables;
	}

	/**
	 * @param variables the variables to set
	 */
	public void setVariables(Map<String, Variable> variables) {
		this.variables = variables;
	}

	/**
	 * @return the env
	 */
	public Env getEnv() {
		return env;
	}

	/**
	 * @param env the env to set
	 */
	public void setEnv(Env env) {
		this.env = env;
	}

	/**
	 * @return the functions
	 */
	public Map<String, Function> getFunctions() {
		return functions;
	}

	/**
	 * @param functions the functions to set
	 */
	public void setFunctions(Map<String, Function> functions) {
		this.functions = functions;
	}

}
