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
@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username=req.getParameter("username");
        String password=req.getParameter("password");
        int id=req.getIntHeader("id");
        System.out.println("usename"+username+"password"+password+"id"+id);
        User user=new User();
        user.setUsername(username);
        user.setUsername(password);
        userService userService = new userServiceImpl();
        userService.update(id,username,password);
        //       UserDao userDao=new UserDao();
        //        userDao.Update(username,password,id);
        resp.sendRedirect(req.getContextPath()+"/ListServlet");
    }
}
