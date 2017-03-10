package com.vxie.dubbo.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author xiecq@asiainfo.com
 * @version 1.0
 */

public class ProvicerMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"application.xml"});
        context.start();
        System.out.println("提供者服务已注册成功");
        try {
            System.in.read();//让此程序一直跑，表示一直提供服务
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
