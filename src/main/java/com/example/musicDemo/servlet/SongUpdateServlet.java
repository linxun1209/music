package com.example.musicDemo.servlet;

import com.example.musicDemo.pojo.Music;
import com.example.musicDemo.service.Impl.userServiceImpl;
import com.example.musicDemo.service.userService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/SongUpdateServlet")
public class SongUpdateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int song_Id=req.getIntHeader("song_Id");
        String song_Name=req.getParameter("song_Name");
        String songer_Name=req.getParameter("songer_Name");
        Music music=new Music();
        music.setSong_Id(song_Id);
        music.setSong_Name(song_Name);
        music.setSonger_Name(songer_Name);
        userService userService = new userServiceImpl();
        userService.SongUpdate(song_Id,song_Name,songer_Name);
    }
}
