<%@ page import="com.example.musicDemo.pojo.Song" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: xing'chen
  Date: 2022/3/5
  Time: 19:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>音乐列表</title>
</head>
<body style="background-color: #F4F4F4">
<table border="5px" width="50%" style="background-color:#a6c1ee;margin: 100px auto;text-align: center">
    <tr align="center">
        <th>歌曲序号</th>
        <th>歌名</th>
        <th>歌手</th>
    </tr>
    <%
        int i=1;
        List<Song> songList=(List<Song>)request.getAttribute("songList");
        for(Song s:songList){
    %>
    <tr><td><%=i++%></td>
        <td><%=s.getSongName()%></td>
        <td><%=s.getSongerId()%></td>

    </tr>
    <%
        }
    %>
</table>
</body>
</html>
