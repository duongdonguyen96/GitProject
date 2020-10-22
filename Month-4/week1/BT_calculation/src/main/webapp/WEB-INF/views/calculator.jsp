<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 10/22/2020
  Time: 2:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1> My calculator</h1>
<hr>

<p><c:out value = "${message}"/><p>

<form action="result" method="post">
    <label>Number A</label>
    <input type="text" name="numberA">
    <label>Number B</label>
    <input type="text" name="numberB">
    <input type="submit" value="+" name="pheptinh">
    <input type="submit" value="-" name="pheptinh">
    <input type="submit" value="*" name="pheptinh">
    <input type="submit" value="/"  name="pheptinh">
    <br>
    <label>Result</label>
    <br>
    <p>${result}</p>

</form>

</body>
</html>
