package com.jiayp.test.dubbo.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by yupeng on 2014/10/27.
 */
public class Client {

    public static void main(String[] args) throws IOException {
        String config = "spring/dubbo-consumer.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(config);
        context.start();

        final DemoService asyncService = (DemoService)context.getBean("demoService");
        String result = asyncService.sayHello("Mark ");
        System.out.println("done on client, the result is :" + result);
    }
}
