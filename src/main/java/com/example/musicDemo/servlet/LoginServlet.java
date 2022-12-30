package com.example.musicDemo.servlet;


import com.example.musicDemo.pojo.User;
import com.example.musicDemo.service.Impl.userServiceImpl;
import com.example.musicDemo.service.userService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet(name = "/LoginServlet")
public class LoginServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        userService userService=new userServiceImpl();
        ResultSet resultSet=userService.login(username,password);
        try {
            if (resultSet.next()) {
                User user = new User();
                user.setUsername(username);
                user.setPassword(password);
                //将用户信息存到session
                request.setAttribute("username",username);
                //开始指针位置位于第一行之前，也就是说，第一次调用next()方法后才能开始获取数据。
                //这种做法的好处在于可以方便地配合while进行遍历，而不用担心取不到第一行。
                request.getRequestDispatcher("/jsp/LoginSuccess.jsp").forward(request, response);
                System.out.println("登录成功");
            } else {
                request.getRequestDispatcher("/jsp/Logindefeat.jsp").forward(request, response);
                System.out.println("用户名或者密码错误");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}