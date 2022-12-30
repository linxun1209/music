<%@ page import="java.util.List" %>
<%@ page import="com.example.musicDemo.pojo.User" %>
<%--
  Created by IntelliJ IDEA.
  User: 15031
  Date: 2022/2/24
  Time: 9:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>用户主页</title>
</head>
<body style="background-color: #F4F4F4">
<table border="5px" width="50%" style="background-color:#a6c1ee;margin: 100px auto;text-align: center">
    <tr align="center">
    <th>序号</th>
    <th>用户名</th>
    <th>密码</th>
    <th>
        管理
        <a href="/music1_war_exploded/jsp/add.jsp">添加</a>
    </th>
    </tr>
    <%
        int i=1;
        List<User> userList=(List<User>)request.getAttribute("userList");
        for(User u:userList){
    %>
    <tr><td><%=i++%></td>
        <td><%=u.getUsername()%></td>
        <td><%=u.getPassword()%></td>
        <td>
            <a href="/music1_war_exploded/DeleteServlet?id=<%=u.getId()%>">删除</a>
            <a href="/music1_war_exploded/jsp/Update.jsp?id=<%=u.getId()%>">修改</a>
        </td>
    </tr>
    <%
        }
    %>
</table>
</body>
</html>
