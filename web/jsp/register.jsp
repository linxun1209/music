<%--
  Created by IntelliJ IDEA.
  User: xing'chen
  Date: 2022/2/18
  Time: 17:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="../css/index.css">
    <title>注册</title>
    <style type="text/css">
        body{
            background-repeat: no-repeat;
            background-position: center;
        }
    </style>
</head>
<body>
<section>
    <form action="/music1_war_exploded/RegisterServlet" method="get">
        <!-- 背景颜色 -->
        <div class="color"></div>
        <div class="color"></div>
        <div class="color"></div>
        <div class="box">
            <!-- 背景圆 -->
            <div class="circle" style="--x:0"></div>
            <div class="circle" style="--x:1"></div>
            <div class="circle" style="--x:2"></div>
            <div class="circle" style="--x:3"></div>
            <div class="circle" style="--x:4"></div>
            <!-- 注册框 -->
            <div class="container">
                <div class="form">
                    <h2>注册</h2>
                    <form>
                        <div class="inputBox">
                            用户名<input type="text" name="username">

                        </div>
                        <div class="inputBox">
                            密&nbsp;&nbsp;&nbsp;&nbsp;码<input type="password" name="password">

                        </div>
                        <div class="inputBox">
                            <input type="submit" value="注册">

                        </div>
                        <p class="forget">有账号,立即登录<a href="login.jsp">
                            点击这里
                        </a></p>
                        <p class="forget">没有账户?<a href="jsp/register.jsp">
                            注册
                        </a></p>
                    </form>
                </div>
            </div>
        </div>
    </form>
</section>
</body>
</html>

