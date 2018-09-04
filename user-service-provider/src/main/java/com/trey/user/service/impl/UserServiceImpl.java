package com.trey.user.service.impl;

import com.trey.user.model.User;
import com.trey.user.service.UserService;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {

    @Override
    public List<User> findAllUser() {
        User user1 = new User(1, "zhangsan", "wuhan");
        User user2 = new User(2, "lisi", "huangshi");
        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        return users;
    }
}