package com.Tomcat.service;

import com.Tomcat.dao.IProDao;
import com.Tomcat.dao.IUserDao;
import com.Tomcat.dao.UserDaoImpl;
import com.Tomcat.pojo.User;

import java.util.List;

public class UserServiceImpl implements IUserService {
    private IUserDao dao = new UserDaoImpl();

    @Override
    public int add(User user) {
        return dao.add(user);
    }

    @Override
    public int del(int id) {
        return 0;
    }

    @Override
    public int update(User user) {
        return 0;
    }

    @Override
    public List<User> sel() {
        return null;
    }

    @Override
    public User selOne(int id) {
        return null;
    }

    @Override
    public User selOneUser(String name) {
        return dao.selOneUser(name);
    }
}
