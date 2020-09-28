
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View Miss</title>
</head>
<body>
<h1>Miss details</h1>
<p>
    <a href="${pageContext.request.contextPath}/misses">Back to Miss list</a>
</p>
<table>
    <tr>
        <td>Name: </td>
        <td>${requestScope["miss"].getName()}</td>
    </tr>
    <tr>
        <td>Email: </td>
        <td>${requestScope["miss"].getEmail()}</td>
    </tr>
    <tr>
        <td>Address: </td>
        <td>${requestScope["miss"].getAddress()}</td>
    </tr>
    <tr>
        <td>Date Of Birth: </td>
        <td>${requestScope["miss"].getDateOfBirth()}</td>
    </tr>
    <tr>
        <td>ID Card: </td>
        <td>${requestScope["miss"].getIdCard()}</td>
    </tr>
    <tr>
        <td>Job: </td>
        <td>${requestScope["miss"].getJob()}</td>
    </tr>
    <tr>
        <td>Educational Level: </td>
        <td>${requestScope["miss"].getEducationalLevel()}</td>
    </tr>
    <tr>
        <td>Work or Study Unit: </td>
        <td>${requestScope["miss"].getWorkOrStudyUnit()}</td>
    </tr>
    <tr>
        <td>Height: </td>
        <td>${requestScope["miss"].getHeight()}</td>
    </tr>
    <tr>
        <td>Weight: </td>
        <td>${requestScope["miss"].getWeight()}</td>
    </tr>
    <tr>
        <td>Other Gifted: </td>
        <td>${requestScope["miss"].getOtherGifted()}</td>
    </tr>
    <tr>
        <td>Phone: </td>
        <td>${requestScope["miss"].getPhone()}</td>
    </tr>
    <tr>
        <td>Nation: </td>
        <td>${requestScope["miss"].getNation()}</td>
    </tr>
    <tr>
        <td>Image: </td>
<%--        <td><img src="<c:url value="${["miss"].getImage()}"/>" alt="image of Miss"></td>--%>
        <td>${requestScope["miss"].getImage()}</td>
    </tr>

    <tr>
        <td>Province: </td>
        <td>${requestScope["miss"].getProvince()}</td>
    </tr>
</table>
</body>
</html>





