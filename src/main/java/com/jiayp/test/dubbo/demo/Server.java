package com.jiayp.test.dubbo.demo;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by yupeng on 2014/10/27.
 */
public class Server {

    public static void main(String[] args)  throws Exception {
        String config = "spring/dubbo-provider.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(config);
        context.start();
        System.out.println("server startup !");
        System.in.read();
    }
}
