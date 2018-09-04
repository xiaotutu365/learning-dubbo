package com.trey.order.controller;

import com.trey.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/order")
@Controller
public class OrderController {

    @Autowired
    OrderService orderService;

    @ResponseBody
    @RequestMapping("/findUserAddressByUserId")
    public void findUserAddressByUserId(Integer userId) {
        orderService.findUserAddressByUserId(userId);
    }
}