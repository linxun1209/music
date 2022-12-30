<%--
  Created by IntelliJ IDEA.
  User: xing'chen
  Date: 2022/2/18
  Time: 17:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="../css/style.css">
    <title>登录界面</title>
    <style type="text/css">
        body{
            background-position: center;
            background-repeat: no-repeat;
        }
    </style>
</head>
<body>
<div class="container">

    <div class="login-wrapper">
        <div class="header">Sign</div>
        <form action="/music1_war_exploded/LoginServlet" method="get">
            <div class="form-wrapper">
                <input type="text" name="username" placeholder="username" class="input-item">
                <input type="password" name="password" placeholder="password" class="input-item">
                <div id="login" class="btn"><input type="submit" value="Sign"></div>
            </div>
            <div class="msg">
                no name<a href="/music1_war_exploded/jsp/register.jsp">Register up</a>
            </div>
        </form>
    </div>
</div>
</body>
</html>
