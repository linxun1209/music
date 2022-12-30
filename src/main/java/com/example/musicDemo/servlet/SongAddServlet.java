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
@WebServlet("/SongAddServlet")
public class SongAddServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        int count=0;
        String song_Name=request.getParameter("song_Name");
        String songer_Name=request.getParameter("songer_Name");
        System.out.println("获取成功");
        System.out.println("获取到的歌曲名:"+song_Name);
        Music music=new Music();
        music.setSong_Name(song_Name);
        music.setSonger_Name(songer_Name);
        userService userService = new userServiceImpl();
        userService.SongAdd(song_Name,songer_Name,count);
//
        if(count==1){
            request.getRequestDispatcher("/SongListServlet").forward(request,response);
        }
    }
}
//        String songName=request.getParameter("songName");
//        String songerId=request.getParameter("songerId");
//        String language=request.getParameter("language");
//        String playCount=request.getParameter("playCount");
//        String downloadcount=request.getParameter("downloadcount");
//        String collectionCount=request.getParameter("collectionCount");
//        String publishCount=request.getParameter("publishCount");
//        String songTime=request.getParameter("songTime");
//        Song song=new Song();
//        song.setSongName(songName);
//        song.setSongerId(songerId);
//        song.setLauguage(language);
//        song.setPlayCount(playCount);
//        song.setDownloadcount(downloadcount);
//        song.setCollectionCount(collectionCount);
//        song.setPublishCount(publishCount);
//        song.setSongTime(songTime);
//UserDao userDao=new UserDao();
//        userDao.SongAdd(songName,songerId,language,playCount,downloadcount,collectionCount,publishCount,songTime,response, request,count);