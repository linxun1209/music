<%--
  Created by IntelliJ IDEA.
  User: xing'chen
  Date: 2022/3/8
  Time: 18:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改</title>
</head>
<body>
<%
    String id=request.getParameter("id");
%>
<%=id%>
<form action="/music1_war_exploded/UpdateServlet" method="get">
    <input name="id" value="<%=id%>" style="display: none">
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
