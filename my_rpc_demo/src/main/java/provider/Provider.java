package provider;

import protocol.http.HttpServer;
import provider.api.HelloService;
import provider.impl.HelloServiceImpl;
import register.LocalRegister;

/**
 * Created by crowndint on 2019/1/15.
 */
public class Provider {

    public static void main(String[] args) {
        //本地注册 (服务名:实现类)
        LocalRegister.regist(HelloService.class.getName(), HelloServiceImpl.class);

        //启动tomcat
        HttpServer httpServer = new HttpServer();
        httpServer.start("localhost", 8080);
    }
}
