<%--
  Created by IntelliJ IDEA.
  User: xing'chen
  Date: 2022/3/5
  Time: 8:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>歌曲增填</title>
</head>
<body>
<form action="/music1_war_exploded/SongAddServlet" method="get">
    歌名
    <input type="text" name="songName">
    <br>
    歌手
    <input type="text" name="songerId">
    <br>
    语言
    <input type="text" name="language">
    <br>
    收听次数
    <input type="text" name="playCount">
    <br>
    下载次数
    <input type="text" name="downloadcount">
    <br>
    收藏次数
    <input type="text" name="collectionCount">
    <br>
    出版次数
    <input type="text" name="publishCount">
    <br>
     时长
    <input type="text" name="songTime">
    <br>
    <input type="submit" value="保存">
</form>
</body>
</html>
