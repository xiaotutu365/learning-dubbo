package com.trey.order.service.impl;

import com.trey.order.service.OrderService;
import com.trey.user.model.User;
import com.trey.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    UserService userService;

    @Override
    public void findUserAddressByUserId(Integer userId) {
        List<User> userList = userService.findAllUser();
        userList.forEach(System.out::println);
    }
}