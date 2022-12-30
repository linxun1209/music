package com.example.musicDemo.dao.Impl;

import com.example.musicDemo.dao.userDao;
import com.example.musicDemo.pojo.Music;
import com.example.musicDemo.pojo.Song;
import com.example.musicDemo.pojo.User;
import com.example.musicDemo.util.JDBC1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class userDaoImpl implements userDao {


    Connection connection;
    PreparedStatement preparedStatement;
    ResultSet resultSet;

    @Override
    public ResultSet login(String username, String password) {
        try {
            connection = JDBC1.getconn();
            String sql = "select * from user where username=? and password=?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            resultSet = preparedStatement.executeQuery();
            return resultSet;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBC1.close(preparedStatement, connection);
        }
        return null;
    }

    @Override
    public User addUser(User user) {
        try {
            connection = JDBC1.getconn();
            String sql = "insert into user(username,password)values(?,?);";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, user.getUsername());
            preparedStatement.setString(2, user.getPassword());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBC1.close(preparedStatement, connection);
        }
        return null;
    }

    @Override
    public ResultSet AdmitLogin(String admit_name, String admit_password) {
        try {
            connection = JDBC1.getconn();
            String sql = "select * from admit where admit_name=? and admit_password=?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, admit_name);
            preparedStatement.setString(2, admit_password);
            resultSet = preparedStatement.executeQuery();
            return resultSet;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBC1.close(preparedStatement, connection);
        }
        return null;
    }

    @Override
    public User add(String username, String password, int count) {
        try {
            connection = JDBC1.getconn();
            String sql = "insert into user(username,password)values('" + username + "','" + password + "')";
            preparedStatement = connection.prepareStatement(sql);
            count = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBC1.close(preparedStatement, connection);
        }
        return null;
    }

    @Override
    public User delete(int id) {
        try {
            connection = JDBC1.getconn();
            String sql = "delete from user where id=?";
            preparedStatement = connection.prepareStatement(sql);
//            preparedStatement.setString(1,id);
            preparedStatement.setInt(1,id);
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBC1.close(preparedStatement, connection);
        }
        return null;
    }

    @Override
    public User update(int id, String username, String password) {
        try {
            connection = JDBC1.getconn();
            String sql="update user set username=?,password=? where id=?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,username);
            preparedStatement.setString(2,password);
            preparedStatement.setInt(3,id);
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBC1.close(preparedStatement, connection);
        }
        return null;
    }

    @Override
    public List<User> List() {
        List<User> userList=new ArrayList<User>();
        try {
            connection = JDBC1.getconn();
            String sql = "select * from user";
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()) {
                User user = new User();
                user.setId(resultSet.getInt("id"));
                user.setUsername(resultSet.getString("username"));
                user.setPassword(resultSet.getString("password"));
                userList.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBC1.close(preparedStatement, connection);
        }
        return userList;
    }

    @Override
    public Song SongAdd(String song_Name,String songer_Name,int count) {
        try {
            connection = JDBC1.getconn();
            String sql = "insert into song(song_Name,songer_Name) values('"+song_Name+"','"+songer_Name+"')";
            preparedStatement=connection.prepareStatement(sql);
            count=preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBC1.close(preparedStatement, connection);
        }
        return null;
    }

    @Override
    public Song SongDelete(int song_Id) {
        try{
            connection = JDBC1.getconn();
            String sql = "delete from song where songid=?";
            preparedStatement = connection.prepareStatement(sql);
//            preparedStatement.setString(1,song_Id);
            preparedStatement.setInt(1,song_Id);
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBC1.close(preparedStatement, connection);
        }
        return null;
    }

    @Override
    public Song SongUpdate(int song_Id, String song_Name, String songer_Name) {
        try {
            connection = JDBC1.getconn();
            String sql="update song set song_Name=?,songer_Name=? where song_Id=?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,song_Name);
            preparedStatement.setString(2,songer_Name);
            preparedStatement.setInt(3,song_Id);
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBC1.close(preparedStatement, connection);
        }
        return null;
    }

    /**
     * 查询歌曲
     *
     * @return
     */
    @Override
    public List<Music> songList() {
        List<Music> songList=new ArrayList<Music>();
        try {
            connection = JDBC1.getconn();
            String sql = "select * from song";
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()) {
//                Song song = new Song();
                Music music=new Music();
                music.setSong_Id(resultSet.getInt("song_Id"));
                music.setSong_Name(resultSet.getString("song_Name"));
                music.setSonger_Name(resultSet.getString("songer_Name"));
                songList.add(music);
//                song.setSongid(resultSet.getInt("songid"));
//                song.setSongName(resultSet.getString("songName"));
//                song.setSongerId(resultSet.getString("songerId"));
//                song.setLauguage(resultSet.getString("language"));
//                song.setPlayCount(resultSet.getString("playCount"));
//                song.setDownloadcount(resultSet.getString("downloadcount"));
//                song.setCollectionCount(resultSet.getString("collectionCount"));
//                song.setPublishCount(resultSet.getString("publishCount"));
//                song.setSongTime(resultSet.getString("songTime"));
//                songList.add(song);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBC1.close(preparedStatement, connection);
        }
        return songList;
    }

}

