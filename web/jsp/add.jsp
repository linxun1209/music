 <%--
  Created by IntelliJ IDEA.
  User: xing'chen
  Date: 2022/2/28
  Time: 20:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加信息</title>
</head>
<body>
<form action="/music1_war_exploded/AddServlet" method="get">
    用户名:
    <input type="text" name="username">
    <br>
    密码：
    <input type="text" name="password">
    <br>
    <input type="submit" value="保存">
</form>
</body>
</html>

