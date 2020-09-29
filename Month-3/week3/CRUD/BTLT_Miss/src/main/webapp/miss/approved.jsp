<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Misses List</title>
    <style>
        img {
            height: 50px;
            width: 50px;
        }
    </style>
</head>
<body>
<h1>Misses List</h1>
<p>
    <a href="${pageContext.request.contextPath}/misses?action=create">Create new customer</a>
</p>
<table border="1">
    <tr>
        <td>Name</td>
        <td>Date Of Birth</td>
        <td>Address</td>
        <td>Phone</td>
        <td>Email</td>
        <td>Id Card</td>
        <td>Job</td>
        <td>Educational Level</td>
        <td>Nation</td>
        <td>Work Or Study Unit</td>
        <td>Height</td>
        <td>Weight</td>
        <td>Other Gifted</td>
        <td>Image</td>
        <td>Province</td>

    </tr>
    <c:forEach items='${miss}' var="miss">
        <tr>
            <td>${miss.getName()}</td>
            <td>${miss.getDateOfBirth() }</td>
            <td>${miss.getAddress()}</td>
            <td>${miss.getPhone()}</td>
            <td>${miss.getEmail()}</td>
            <td>${miss.getIdCard()}</td>
            <td>${miss.getJob()}</td>
            <td>${miss.getEducationalLevel()}</td>
            <td>${miss.getNation()}</td>
            <td>${miss.getWorkOrStudyUnit()}</td>
            <td>${miss.getHeight()}</td>
            <td>${miss.getWeight()}</td>
            <td>${miss.getOtherGifted()}</td>
            <td><img src="<c:url value="${miss.getImage()}"/>" alt="image of Miss"></td>
            <td>${miss.getProvince()}</td>
        </tr>
    </c:forEach>
</table>
<p>
    <a href="${pageContext.request.contextPath}/misses">Back to Miss list</a>
</p>

</body>
</html>