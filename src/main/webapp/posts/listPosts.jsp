<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 10/5/2023
  Time: 9:06 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach  var="i" begin="0" end="${postsList.size()-1}">
    <h3>${postsList.get(i).idPosts}, ${postsList.get(i).titlePosts}, ${postsList.get(i).content}, ${postsList.get(i).status}, ${postsList.get(i).datePosts}, ${userList.get(i).name}</h3>

</c:forEach>

</body>
</html>
