<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<body>
<h2>Sandwich Condiments</h2>
<form action="sandwich" method="get">
    <input type="checkbox" name="condiment" value="Lettuce">Lettuce
    <input type="checkbox" name="condiment" value="Tomato">Tomato
    <input type="checkbox" name="condiment" value="Mustard">Mustard
    <input type="checkbox" name="condiment" value="Sprouts">Sprouts
    <br>
    <hr>
    <button type="submit">Save</button>
</form>
<c:if test="${condiments==null}">
    <p>No choose</p>
</c:if>
<c:forEach items="${condiments}" var="condiment">
    <p>${condiment}</p>
</c:forEach>
</body>
</html>