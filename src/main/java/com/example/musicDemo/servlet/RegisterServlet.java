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

@WebServlet(name = "/RegisterServlet")
public class RegisterServlet extends HttpServlet {


    @Override
    protected  void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("用户名" + username + "密码" + password);
        System.out.println("获取成功");
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
//            userServiceImpl userService = new userServiceImpl();
        userService userService = new userServiceImpl();
        userService.addUser(user);
        if (user != null) {
            request.getRequestDispatcher("jsp/registerSuccess.jsp").forward(request, response);
        }else{
            request.getRequestDispatcher("/jsp/register.jsp").forward(request,response);
        }
    }
}

