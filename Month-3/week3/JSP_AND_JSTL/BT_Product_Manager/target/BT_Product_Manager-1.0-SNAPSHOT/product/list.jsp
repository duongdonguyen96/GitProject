<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>products List</title>
</head>
<body>
<h1>products</h1>
<p>
    <a href="${pageContext.request.contextPath}/products?action=create">Create new product</a>
</p>
<table border="1">
    <tr>
        <td>Name</td>
        <td>Price</td>
        <td>Description</td>
        <td>Producer</td>
        <td>Edit</td>
        <td>Delete</td>
    </tr>
    <c:forEach items='${requestScope["products"]}' var="product">
        <tr>
            <td>${product.name}</td>
            <td>${product.price}</td>
            <td>${product.description}</td>
            <td>${product.producer}</td>
        <td><a href="${pageContext.request.contextPath}/products?action=edit&id=${product.id}">edit</a></td>
        <td><a href="${pageContext.request.contextPath}/products?action=delete&id=${product.id}">delete</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>