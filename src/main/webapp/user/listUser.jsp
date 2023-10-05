<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 10/5/2023
  Time: 2:16 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach items="${userList}" var="user">
    <h3>${user.idUser}, ${user.name}</h3>
</c:forEach>
</body>
</html>
