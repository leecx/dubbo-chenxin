package com.chenxin.order;

import com.chenxin.rpc.service.DemoService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");

        DemoService bean = context.getBean(DemoService.class);
        String s = bean.sayHello("lichenxin");
        System.out.println(s);

        context.start();
        System.in.read();
    }

}
