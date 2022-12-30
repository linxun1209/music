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
import java.util.List;

@WebServlet(name="/ListServlet")
public class ListServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp){
        resp.setContentType("text/html;charset=utf-8");
//        UserDao userDao = new UserDao();
//        List<User> userList=userDao.List();
        userService userService = new userServiceImpl();
        List<User> userList = userService.List();
        try {
            req.setAttribute("userList",userList);
            req.getRequestDispatcher("/jsp/list.jsp").forward(req,resp);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }


    }
}
