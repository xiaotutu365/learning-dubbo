package com.trey.order.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.trey.order.service.OrderService;
import com.trey.user.model.User;
import com.trey.user.service.UserService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Service
public class OrderServiceImpl implements OrderService {

    @Reference
    UserService userService;

    @Override
    public void findUserAddressByUserId(Integer userId) {
        List<User> userList = userService.findAllUser();
        userList.forEach(System.out::println);
    }
}