package provider.impl;

import provider.api.HelloService;

/**
 * Created by crowndint on 2019/1/15.
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String str) {
        System.out.println(str);
        return "欢迎来到黑马程序员";
    }
}
