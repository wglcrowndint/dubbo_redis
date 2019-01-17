package framework;

import java.io.Serializable;

/**
 * Created by crowndint on 2019/1/15.
 */
public class Invocation implements Serializable {

    private String interfaceName;
    private String methodName;
    private Object[] prams;
    private Class[] paramTypes;

    public Invocation(String interfaceName, String methodName, Object[] prams, Class[] paramTypes) {
        this.interfaceName = interfaceName;
        this.methodName = methodName;
        this.prams = prams;
        this.paramTypes = paramTypes;
    }

    public String getInterfaceName() {
        return interfaceName;
    }

    public void setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public Object[] getPrams() {
        return prams;
    }

    public void setPrams(Object[] prams) {
        this.prams = prams;
    }

    public Class[] getParamTypes() {
        return paramTypes;
    }

    public void setParamTypes(Class[] paramTypes) {
        this.paramTypes = paramTypes;
    }
}
