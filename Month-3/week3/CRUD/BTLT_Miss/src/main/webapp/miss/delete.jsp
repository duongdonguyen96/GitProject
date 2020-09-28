<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Miss list</title>
</head>
<body>
<h1>Delete miss</h1>
<p>
    <a href="${pageContext.request.contextPath}/misses">Back to Miss list</a>
</p>
<form method="post">
    <h3>Are you sure?</h3>
    <fieldset>
        <legend>Miss information</legend>
        <table>
            <tr>
                <td>Name:</td>
                <td>${requestScope["misslist"].getName()}</td>
            </tr>
            <tr>
                <td>Email:</td>
                <td>${requestScope["misslist"].getEmail()}</td>
            </tr>
            <tr>
                <td>Address:</td>
                <td>${requestScope["misslist"].getAddress()}</td>
            </tr>
            <tr>
                <td><input type="submit" value="Delete Miss"></td>
                <td><a href="${pageContext.request.contextPath}/misses">Back to customer list</a></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>