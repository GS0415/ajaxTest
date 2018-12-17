package com.Tomcat.controller;

import com.Tomcat.dao.IUserDao;
import com.Tomcat.pojo.User;
import com.Tomcat.service.IUserService;
import com.Tomcat.service.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/doDoRegister")
public class DoDoRegister extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = new User();
        IUserService service = new UserServiceImpl();
        String pwd = req.getParameter("pwd");
        String username =req.getParameter("username");
        String tel = req.getParameter("tel");
        user.setTel(tel);
        user.setUserName(username);
        user.setPassWord(pwd);
        service.add(user);
        resp.sendRedirect("login");
    }
}
