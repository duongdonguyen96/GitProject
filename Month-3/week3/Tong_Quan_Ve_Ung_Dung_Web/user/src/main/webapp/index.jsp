<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 9/23/2020
  Time: 3:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<head>
    <title>Simple Dictionary</title>
</head>
<body>
<h2>Vietnamese Dictionary</h2>
<form action="${pageContext.request.contextPath}/login" method="post">
    <input type="text" name="email" placeholder="Enter your email: "/>
    <input type="text" name="password" placeholder="Enter your password: "/>
    <input type = "submit" id = "submit" value = "Search"/>
</form>
</body>
</html>
