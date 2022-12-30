//package com.example.musicDemo.servlet;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//@WebServlet("/MusicListServlet")
//public class MusicListServlet extends HttpServlet {
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.setContentType("text/html;charset=utf-8");
////        UserDao userDao = new UserDao();
////        List<Song> songList=userDao.ListSong();
//        try {
////            req.setAttribute("songList",songList);
//            req.getRequestDispatcher("/jsp/MusicList.jsp").forward(req,resp);
//        } catch (ServletException | IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
