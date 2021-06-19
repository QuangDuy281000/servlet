<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 17/6/2021
  Time: 8:38 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>LOGOUT PAGE</title>
</head>
<body>
<h3> WELLCOME: <%= session.getAttribute("sessionname") %></h3>
<form action="logouttest" method="post">
    <input type="submit" value="LOGIN"/>
</form>
</body>
</html>
