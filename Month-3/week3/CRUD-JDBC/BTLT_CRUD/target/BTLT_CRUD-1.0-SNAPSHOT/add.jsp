<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 9/24/2020
  Time: 8:20 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="service.CustomerService" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add customer</title>
    <style>
        input {
            width: 300px;
            font-size: 16px;
            border: 2px solid #ccc;
            border-radius: 4px;
            padding: 12px 10px 12px 10px;
        }
        #submit {
            border-radius: 2px;
            padding: 10px 32px;
            font-size: 16px;
        }
    </style>
</head>
<body>
<h1>Add customer</h1>
<a href="index.jsp">Tro lai</a>
<form action="/add" method="post">
    <label>name</label><br>
    <input type="text" name="name"><br>
    <label>phone</label><br>
    <input type="text" name="phone"><br>
    <label>Email</label><br>
    <input type="email" name="email"><br>
    <input type="submit" id="submit" value="Add">
</form>

</body>
</html>