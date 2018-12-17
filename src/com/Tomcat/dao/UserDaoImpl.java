package com.Tomcat.dao;

import com.Tomcat.pojo.User;
import com.Tomcat.utils.JdbcUtil;

import java.util.List;

public class UserDaoImpl implements IUserDao {
    @Override
    public int add(User user) {
        return JdbcUtil.zsg("insert into user(username,password,tel) values(?,?,?)",user.getUserName(),user.getPassWord(),user.getTel());
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
        return null;
    }
}
