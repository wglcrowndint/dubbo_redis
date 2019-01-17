package consumer;

import framework.Invocation;
import framework.ProxyFactory;
import protocol.http.HttpClient;
import provider.api.HelloService;

/**
 * Created by crowndint on 2019/1/15.
 */
public class Consumer {

    public static void main(String[] args) {

        HelloService proxy = ProxyFactory.getProxy(HelloService.class);
//        HttpClient httpClient = new HttpClient();
//        Invocation invocation = new Invocation(HelloService.class.getName(), "sayHello", new Object[]{"黑马程序员"}, new Class[]{String.class});
//        String result = httpClient.post("localhost", 8080, invocation);

        String result = proxy.sayHello("黑马程序员");
        System.out.println(result);
    }
}
