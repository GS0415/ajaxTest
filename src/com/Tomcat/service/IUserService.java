package com.Tomcat.service;

import com.Tomcat.pojo.Product;
import com.Tomcat.pojo.User;

import java.util.List;

public interface IUserService {
    int add(User user);

    int del(int id);

    int update(User user);

    List<User> sel();

    User selOne(int id);

    User selOneUser(String name);
}
