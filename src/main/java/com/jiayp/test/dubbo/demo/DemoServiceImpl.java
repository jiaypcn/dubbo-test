package com.jiayp.test.dubbo.demo;

/**
 * Created by yupeng on 2014/10/27.
 */
public class DemoServiceImpl implements DemoService {


    @Override
    public String sayHello(String name) {
        String result = "hello " + name;
        System.out.println(result);
        return result;
    }

}
