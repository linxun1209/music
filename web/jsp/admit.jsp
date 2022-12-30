<%--
  Created by IntelliJ IDEA.
  User: xing'chen
  Date: 2022/2/27
  Time: 15:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="../css/style2.css">
    <title>管理员登录界面</title>
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
        <div class="header">AdmitSign</div>
        <form action="/music1_war_exploded/AdmitServlet" method="get">
            <div class="form-wrapper">
                <input type="text" name="admit_name" placeholder="admit_name" class="input-item">
                <input type="password" name="admit_password" placeholder="admit_password" class="input-item">
                <div id="login" class="btn"><input type="submit" value="AdmitSign"></div>
            </div>
        </form>
    </div>
</div>
</body>
</html>
