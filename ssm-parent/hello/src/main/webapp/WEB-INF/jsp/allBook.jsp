<%--
  Created by IntelliJ IDEA.
  User: 王超
  Date: 2021/3/10
  Time: 17:00
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>allBook</title>
</head>
<body>
<c:forEach var="ss" items="${list}" >
    <h1>${list.size()}</h1>
    <h2> ${ss.bookName}</h2>
</c:forEach>
</body>
</html>
