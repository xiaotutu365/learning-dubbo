package com.trey.user.service;

import com.trey.user.model.User;

import java.util.List;

public interface UserService {
    List<User> findAllUser();
}