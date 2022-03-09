<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2020/10/13
  Time: 12:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--  http://localhost:8080/HellOSPringMVC_war/JSP/param2.jsp  --%>
    <form action="${pageContext.request.getContextPath()}/param/test5" method="post">
        id: <input type="text" name="users[0].id"><br>
        name: <input type="text" name="users[0].name"><br>
        gender: <input type="radio" name="users[0].gender" value="true">male
                 <input type="radio" name="users[0].gender" value="false">female<br>
        <hr>
        id: <input type="text" name="users[1].id"><br>
        name: <input type="text" name="users[1].name"><br>
        gender: <input type="radio" name="users[1].gender" value="true">male
        <input type="radio" name="users[1].gender" value="false">female<br>
        <input type="submit" value="submit">
    </form>
</body>
</html>
