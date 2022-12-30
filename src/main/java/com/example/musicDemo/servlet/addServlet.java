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
@WebServlet(name="/AddServlet")
public class addServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        int count=0;
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        System.out.println(username+","+password);
        System.out.println("获取成功");
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        userService userService = new userServiceImpl();
        userService.add(username,password,count);
        if(count==1){
            request.getRequestDispatcher("/ListServlet").forward(request,response);
        }
    }
}
