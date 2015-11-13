package enviroment;

import java.util.HashMap;

public class Function {
  private String returnType;
  private Env env;
  private HashMap<String, Variable> args;
  private int level;

  public Function(String returnType, Env env, HashMap<String, Variable> args, int level) {
    this.returnType = returnType;
    this.env = env;
    this.args = args;
    this.level = level;
  }

  public String getReturnType() {
    return returnType;
  }

  public void setReturnType(String returnType) {
    this.returnType = returnType;
  }

  public Env getEnv() {
    return env;
  }

  public void setEnv(Env env) {
    this.env = env;
  }

  public HashMap<String, Variable> getArgs() {
    return args;
  }

  public void setArgs(HashMap<String, Variable> args) {
    this.args = args;
  }

  public int getLevel() {
    return level;
  }

  public void setLevel(int level) {
    this.level = level;
  }

public String toString() {
    return env.toString();
}
}
