package framework;

import protocol.http.HttpClient;
import provider.api.HelloService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by crowndint on 2019/1/15.
 */
public class ProxyFactory {

    public static <T> T getProxy(Class interfaceClass) {

        return (T)Proxy.newProxyInstance(interfaceClass.getClassLoader(),
                new Class[]{interfaceClass},
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                        //Protocol protocol = ProtocolFactory.getProtocol();
                        HttpClient httpClient = new HttpClient();
                        Invocation invocation = new Invocation(interfaceClass.getName(), method.getName(),args, method.getParameterTypes());
                        String result = httpClient.post("localhost", 8080, invocation);

                        //String result = protocol.send(RemoteMapRegister.random(interfaceClass.getName()), invocation);
                        return result;
                    }
                });
    }

}
