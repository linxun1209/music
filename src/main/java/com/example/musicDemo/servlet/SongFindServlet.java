//package com.example.musicDemo.servlet;
//
//import com.example.musicDemo.pojo.Song;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.util.ArrayList;
//
//@WebServlet("/FindServlet")
//public class SongFindServlet extends HttpServlet {
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp);
//    }
//
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        ArrayList<Song> s=new ArrayList<Song>();
//        req.setAttribute("s",s);
////        UserDao userDao=new UserDao();
////        userDao.Find();
//        req.getRequestDispatcher("/SongListServlet").forward(req,resp);
//    }
//}
