package com.example.musicDemo.servlet;

import com.example.musicDemo.service.Impl.userServiceImpl;
import com.example.musicDemo.service.userService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/SongDeleteServlet")
public class SongDeleteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        int song_Id = req.getIntHeader("song_Id");
        userService userService = new userServiceImpl();
        userService.SongDelete(song_Id);
//        UserDao userDao = new UserDao();
//        userDao.SongDelete(songid);
        req.getRequestDispatcher("/SongListServlet").forward(req, resp);
    }
}
