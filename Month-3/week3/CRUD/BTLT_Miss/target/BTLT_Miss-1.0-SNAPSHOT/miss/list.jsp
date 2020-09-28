<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Misses List</title>
    <style>
        img{
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
<%--        <td>Address</td>--%>
<%--        <td>Phone</td>--%>
<%--        <td>Email</td>--%>
<%--        <td>Id Card</td>--%>
<%--        <td>Job</td>--%>
<%--        <td>Educational Level</td>--%>
<%--        <td>Nation</td>--%>
<%--        <td>Work Or Study Unit</td>--%>
        <td>Height</td>
        <td>Weight</td>
        <td>Other Gifted</td>
        <td>Image</td>
        <td>Province</td>
        <td>Delete</td>
        <td>Edit</td>
        <td>View</td>
        <td>Approval</td>



    </tr>
    <c:forEach items='${missList}' var="miss">
        <tr>
            <td>${miss.getName()}</td>
            <td>${miss.getDateOfBirth() }</td>
<%--            <td>${miss.getAddress()}</td>--%>
<%--            <td>${miss.getPhone()}</td>--%>
<%--            <td>${miss.getEmail()}</td>--%>
<%--            <td>${miss.getIdCard()}</td>--%>
<%--            <td>${miss.getJob()}</td>--%>
<%--            <td>${miss.getEducationalLevel()}</td>--%>
<%--            <td>${miss.getNation()}</td>--%>
<%--            <td>${miss.getWorkOrStudyUnit()}</td>--%>
            <td>${miss.getHeight()}</td>
            <td>${miss.getWeight()}</td>
            <td>${miss.getOtherGifted()}</td>
            <td><img src="<c:url value="${miss.getImage()}"/>" alt="image of Miss"></td>
            <td>${miss.getProvince()}</td>
            <td><a href="${pageContext.request.contextPath}/misses?action=edit&id=${miss.getId()}">edit</a></td>
            <td><a href="${pageContext.request.contextPath}/misses?action=delete&id=${miss.getId()}">delete</a></td>
            <td><a href="${pageContext.request.contextPath}/misses?action=view&id=${miss.getId()}">view</a></td>
<%--            <td><a href="${pageContext.request.contextPath}/misses?action=approval&id=${miss.getId()}">--%>
<%--                <c:choose>--%>
<%--                    <c:when test = "${miss==true}">--%>
<%--                        <c:out value = "approved"/>--%>
<%--                    </c:when>--%>
<%--                    <c:otherwise >--%>
<%--                        <c:out value = "Unapproved"/>--%>
<%--                    </c:otherwise>--%>
<%--                </c:choose>--%>
<%--            </a>--%>
<%--            </td>--%>
        </tr>
    </c:forEach>
</table>
<a href="?action=approved"> Danh sách đã  duyệt </a>
</body>
</html>