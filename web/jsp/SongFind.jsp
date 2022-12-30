<%@ page import="static com.alibaba.druid.sql.ast.SQLPartitionValue.Operator.List" %>
<%@ page import="com.example.musicDemo.pojo.Song" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: xing'chen
  Date: 2022/3/5
  Time: 15:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
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
    </tr>
    <%
        int i=1;
        java.util.List<Song> songList=(List<Song>)request.getAttribute("songList");
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
    </tr>
    <%
        }
    %>
</table>
</body>
</html>
