package com.example.musicDemo.service.Impl;

import com.example.musicDemo.dao.Impl.userDaoImpl;
import com.example.musicDemo.dao.userDao;
import com.example.musicDemo.pojo.Music;
import com.example.musicDemo.pojo.Song;
import com.example.musicDemo.pojo.User;
import com.example.musicDemo.service.userService;

import java.sql.ResultSet;
import java.util.List;

public class userServiceImpl implements userService {

    private userDao userDao = new userDaoImpl();

    @Override
    public ResultSet login(String username, String password) {
        return userDao.login(username,password);
    }

    @Override
    public User addUser(User user) {
        return userDao.addUser(user);
    }

    @Override
    public ResultSet AdmitLogin(String admit_name, String admit_password) {
        return userDao.AdmitLogin(admit_name,admit_password);
    }

    @Override
    public User add(String username, String password, int count) {
        return userDao.add(username,password,count);
    }

    @Override
    public User delete(int id) {
        return userDao.delete(id);
    }

    @Override
    public User update(int id, String username, String password) {
        return userDao.update(id, username, password);
    }

    @Override
    public List<User> List() {
        return userDao.List();
    }

    @Override
    public Song SongAdd(String song_Name, String Song_Name, int count) {
        return userDao.SongAdd(song_Name, Song_Name, count);
    }

    @Override
    public Song SongDelete(int song_Id) {

        return userDao.SongDelete(song_Id);
    }

    @Override
    public List<Music> songList() {
        return userDao.songList();
    }

    @Override
    public Song SongUpdate(int song_Id, String song_Name, String songer_Name){
        return userDao.SongUpdate(song_Id,song_Name,songer_Name);
    }

}
