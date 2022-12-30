package com.example.musicDemo.servlet;

import com.example.musicDemo.pojo.AdmitUser;
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

@WebServlet(name="/AdmitLogin")
public class AdmitServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response){
        response.setContentType("text/html;charset=UTF-8");
        String admit_name=request.getParameter("admit_name");
        String admit_password=request.getParameter("admit_password");
        AdmitUser admitUser=new AdmitUser();
        admitUser.setAdmit_name(admit_name);
        admitUser.setAdmit_password(admit_password);
        userService userService = new userServiceImpl();
        ResultSet resultSet = userService.AdmitLogin(admit_name, admit_password);
        try {
            if (resultSet.next()) {
                request.getRequestDispatcher("/jsp/BackgroundManagement.jsp").forward(request, response);
                System.out.println("登录成功");
            } else {
                request.getRequestDispatcher("/jsp/AdmitLoginDefeat.jsp").forward(request, response);
                System.out.println("用户名或者密码错误");
            }
        } catch (SQLException | ServletException | IOException throwables) {
            throwables.printStackTrace();
        }
    }

}
