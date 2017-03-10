package com.vxie.dubbo.consumer;

import com.vxie.dubbo.api.HelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author xiecq@asiainfo.com
 * @version 1.0
 */

public class ConsumerMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"application.xml"});
        context.start();
        HelloService helloService = (HelloService) context.getBean("helloService");
        System.out.println("客户端请求HelloService.sayHello...");
        helloService.sayHello("马云");
//        try {
//            System.in.read();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
