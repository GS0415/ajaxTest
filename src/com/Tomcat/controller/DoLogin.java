package com.Tomcat.controller;

import com.Tomcat.pojo.Product;
import com.Tomcat.pojo.User;
import com.Tomcat.service.IUserService;
import com.Tomcat.service.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/doLogin")
public class DoLogin extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        IUserService service = new UserServiceImpl();
        User user=null;
        String pw =req.getParameter("pwd");
        String name=req.getParameter("username");
        user=service.selOneUser(name);
        if (user!=null){
            if (user.getPassWord().equals(pw)){
                resp.sendRedirect("list");
            }else {

            }
        }
    }
}
