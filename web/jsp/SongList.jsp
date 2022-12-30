<%@ page import="com.example.musicDemo.pojo.User" %>
<%@ page import="java.util.List" %>
<%@ page import="com.example.musicDemo.pojo.Song" %><%--
  Created by IntelliJ IDEA.
  User: xing'chen
  Date: 2022/3/4
  Time: 20:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>歌曲</title>
</head>
<body style="background-color: #F4F4F4">
<table border="5px" width="50%" style="background-color:#a6c1ee;margin: 100px auto;text-align: center">
    <tr align="center">
        <th>歌曲序号</th>
        <th>歌名</th>
        <th>歌手</th>
        <th>语言</th>
        <th>听歌次数</th>
        <th>下载次数</th>
        <th>收藏次数</th>
        <th>评论次数</th>
        <th>时长</th>
        <th>管理<a href="/music1_war_exploded/jsp/SongAdd.jsp">添加</a></th>
    </tr>
    <%
        int i=1;
        List<Song> songList=(List<Song>)request.getAttribute("songList");
        for(Song s:songList){
    %>
    <tr><td><%=i++%></td>
        <td><%=s.getSongName()%></td>
        <td><%=s.getSongerId()%></td>
        <td><%=s.getLauguage()%></td>
        <td><%=s.getPlayCount()%></td>
        <td><%=s.getDownloadcount()%></td>
        <td><%=s.getCollectionCount()%></td>
        <td><%=s.getPublishCount()%></td>
        <td><%=s.getSongTime()%></td>
        <td>
        <a href="/music1_war_exploded/SongDeleteServlet?songid=<%=s.getSongid()%>">删除</a>
        <a href="/music1_war_exploded/jsp/SongAdapt.jsp?songid=<%=s.getSongid()%>">修改</a>
        </td>

    </tr>
    <%
        }
    %>
</table>
</body>
</html>
