<%--
  Created by IntelliJ IDEA.
  User: ltphuc
  Date: 10/6/2020
  Time: 11:06 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page isELIgnored="false" %>
<header>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</header>
<html>
<body>
<h2>Chuyển đổi USD - VND</h2>

<form action="convert" method="get">
    <label>VND</label>
    <input type="number" name="vnd" placeholder="Vnd" value="${vnd}"> <br>
    <label>USD</label>
    <input type="number" name="usd" placeholder="Usd" value="${usd}">

    <button type="submit">Chuyen doi</button>
</form>
</body>
</html>