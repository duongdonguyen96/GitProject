<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 9/25/2020
  Time: 8:38 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="model.CustomerManager" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>model.Customer List</title>
    <style>
        img{
            height: 50px;
            width: 50px;
        }
    </style>
</head>
<body>
<h1>model.Customer Management</h1>
<table border="1">
    <thead>
    <tr>
        <th>No</th>
        <th>Name</th>
        <th>Date Of Birth</th>
        <th>Address</th>
        <th>Image</th>
    </tr>
    </thead>
    <tbody>

    <c:forEach items="${CustomerManager.customersList}" var="customer" varStatus="loop" >
        <tr>
            <td>${loop.index+1}</td>
            <td>${customer.name}</td>
            <td>${customer.dateOfBirth}</td>
            <td>${customer.address}</td>
            <td><img src="<c:url value="/image/${customer.image}"/>" alt="anh"></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
