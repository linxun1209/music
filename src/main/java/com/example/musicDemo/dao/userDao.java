package com.example.musicDemo.dao;

import com.example.musicDemo.pojo.Music;
import com.example.musicDemo.pojo.Song;
import com.example.musicDemo.pojo.User;

import java.sql.ResultSet;
import java.util.List;

public interface userDao {

    /**
     * 登录
     * @param username
     * @param password
     * @return
     */
    ResultSet login(String username, String password);

    /**
     * 注册
     * @param user
     * @return
     */
    User addUser(User user);

    /**
     * 管理员登录
     * @param admit_name
     * @param admit_password
     * @return
     */
    ResultSet AdmitLogin(String admit_name, String admit_password);

    /**
     * 后台添加用户
     * @param username
     * @param password
     * @param count
     * @return
     */
    User add(String username, String password, int count);

    /**
     * 后台删除用户
     * @param id
     * @return
     */
    User delete(int id);

    /**
     * 后台修改用户信息
     * @param id
     * @param username
     * @param password
     * @return
     */
    User update(int id,String username,String password);

    /**
     * 用户信息管理
     * @return
     */
    List<User> List();

    /**
     * 后台音乐库歌曲添加
     * @param song_Name
     * @param Song_Name
     * @param count
     * @return
     */
    Song SongAdd(String song_Name, String Song_Name, int count);

    /**
     * 删除歌曲
     * @param song_Id
     * @return
     */
    Song SongDelete(int song_Id);

    /**
     * 修改歌曲
     * @param song_Id
     * @param song_Name
     * @param songer_Name
     * @return
     */
    Song SongUpdate(int song_Id,String song_Name,String songer_Name);

    /**
     * 查询歌曲
     * @return
     */
    List<Music> songList();



}
