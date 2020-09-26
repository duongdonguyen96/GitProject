<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer List</title>
    <style>
        body {
            margin: 0 auto;
        }
        table{
            background-color: aquamarine;
        }

    </style>
</head>
<body>
<h1>Customers</h1>
<p>
    <a href="${pageContext.request.contextPath}/customers?action=create">Create new customer</a>

</p>
<table border="1">
    <tr>
        <td>Name</td>
        <td>Email</td>
        <td>Address</td>
        <td>Edit</td>
        <td>Delete</td>
        <td>View</td>
    </tr>
    <c:forEach items='${requestScope["customers"]}' var="customer">
        <tr>
            <td>
                <a href="${pageContext.request.contextPath}/customers?action=view&id=${customer.getId()}">${customer.getName()}</a>
            </td>
            <td>${customer.getEmail()}</td>
            <td>${customer.getAddress()}</td>
            <td><a href="${pageContext.request.contextPath}/customers?action=edit&id=${customer.getId()}">edit</a></td>
            <td><a href="${pageContext.request.contextPath}/customers?action=delete&id=${customer.getId()}">delete</a>
            </td>
            <td><a href="${pageContext.request.contextPath}/customers?action=view&id=${customer.getId()}">view</a></td>

        </tr>
    </c:forEach>
</table>
</body>
</html>