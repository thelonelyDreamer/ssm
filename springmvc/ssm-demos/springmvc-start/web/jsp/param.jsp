<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2020/10/13
  Time: 11:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>传送参数</title>
</head>
<body>
<%--    http://localhost:8080/HellOSPringMVC_war/JSP/param.jsp --%>
    <form action="${pageContext.request.getContextPath()}/param/test3">
        <input type="checkbox" name="hobby" value="football">足球
        <input type="checkbox" name="hobby" value="basketball">篮球
        <input type="checkbox" name="hobby" value="volleyball">排球<br>
        <input type="submit" value="提交">
    </form>


</body>
</html>
