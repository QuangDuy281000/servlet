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
    <title>Login page</title>
</head>
<body>
<h1>FORM LOGIN</h1>
<br>
<h1> <%= request.getAttribute("mess")==null?" ":request.getAttribute("mess")%></h1>
<form action="logintest" method="post">
    <input type="text" name="username" />
    <br>
    <input type="password" name="password" />
    <br>
    <input type="submit" value="LOGIN"/>
</form>
</body>
</html>
