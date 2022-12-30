package com.example.musicDemo.service;

import com.example.musicDemo.pojo.Music;
import com.example.musicDemo.pojo.Song;
import com.example.musicDemo.pojo.User;

import java.sql.ResultSet;
import java.util.List;

public interface userService {

    ResultSet login(String username, String password);
    User addUser(User user);
    ResultSet AdmitLogin(String admit_name, String admit_password);
    User add(String username, String password, int count);
    User delete(int id);
    User update(int id,String username,String password);
    List<User> List();
    Song SongAdd(String song_Id, String Song_Name, int count);
    Song SongDelete(int song_Id);
    List<Music> songList();
    Song SongUpdate(int song_Id,String song_Name,String songer_Name);


}
