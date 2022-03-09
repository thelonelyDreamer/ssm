<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2020/10/13
  Time: 12:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%-- http://localhost:8080/HellOSPringMVC_war/JSP/param1.jsp --%>
    <form action="${pageContext.request.getContextPath()}/param/test4">
        id：<input type="text" name="id" value=""><br>
        name:<input type="text " name="name" value=""><br>
        gender:<input type="radio" name="gender" value="true">male
        <input type="radio" name="gender" value="false">female<br>
        birth:<input type="text" name="birth"><br>
        <input type="checkbox" name="hobby" value="football">足球
        <input type="checkbox" name="hobby" value="basketball">篮球
        <input type="checkbox" name="hobby" value="volleyball">排球<br>
        <input type="submit" value="提交">
    </form>
</body>
</html>
