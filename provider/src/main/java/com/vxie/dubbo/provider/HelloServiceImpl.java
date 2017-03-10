package com.vxie.dubbo.provider;

import com.vxie.dubbo.api.HelloService;

/**
 * @author xiecq@asiainfo.com
 * @version 1.0
 */
public class HelloServiceImpl implements HelloService {
    public void sayHello(String name) {
        System.out.println("您好！" +  name);
    }
}
