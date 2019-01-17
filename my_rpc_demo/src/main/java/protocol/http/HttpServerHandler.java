package protocol.http;

import framework.Invocation;
import org.apache.commons.io.IOUtils;
import register.LocalRegister;

import javax.servlet.ServletInputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.ObjectInputStream;
import java.lang.reflect.Method;

/**
 * Created by crowndint on 2019/1/15.
 */
public class HttpServerHandler {

    public void handler(ServletRequest req, ServletResponse res) {

        try {
            ServletInputStream inputStream = req.getInputStream();
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            Invocation invocation = (Invocation) objectInputStream.readObject();
            String interfaceName = invocation.getInterfaceName();
            String methodName = invocation.getMethodName();

            Class implClass = LocalRegister.get(interfaceName);
            Method method = implClass.getMethod(methodName, invocation.getParamTypes());
            String result = (String) method.invoke(implClass.newInstance(), invocation.getPrams());

            IOUtils.write(result, res.getOutputStream());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
