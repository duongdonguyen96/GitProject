<%--
  Created by IntelliJ IDEA.
  User: ltphuc
  Date: 10/6/2020
  Time: 11:06 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<header>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</header>
<html>
<body>
<h2>Dictionary Simple</h2>
<form action="translate" method="get">
    <label>Tiếng Việt</label>
    <input type="text" name="vietnamese" placeholder="vietnamese"> <br>
    <label>English</label>
    <p>${vocabulary}</p>
    <button type="submit">Translate</button>
</form>
</body>
</html>