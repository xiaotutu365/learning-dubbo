package com.trey;

import com.trey.order.service.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class MainApplication {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:consumer.xml");
        context.start();
        OrderService orderService = context.getBean(OrderService.class);
        orderService.findUserAddressByUserId(1);
        System.in.read();
    }
}