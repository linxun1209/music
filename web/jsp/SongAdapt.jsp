<%@ page import="com.example.musicDemo.pojo.User" %><%--
  Created by IntelliJ IDEA.
  User: xing'chen
  Date: 2022/3/2
  Time: 20:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改信息操作</title>
</head>
<body>
<form action="/music1_war_exploded/SongAdaptServlet" method="get">
    歌名
    <input type="text" name="songName">
    <br>
    歌手
    <input type="text" name="songerId">
    <br>
    <input type="submit" value="保存">
</form>
</body>
</html>
