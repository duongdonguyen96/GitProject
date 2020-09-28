<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create new customer</title>
    <style>
        .message {
            color: green;
        }
    </style>
</head>
<body>
<h1>Create new customer</h1>
<p>
    <c:if test='${requestScope["message"] != null}'>
        <span class="message">${requestScope["message"]}</span>
    </c:if>
</p>
<p>
    <a href="${pageContext.request.contextPath}/misses">Back to customer list</a>
</p>
<form method="post">
    <fieldset>
        <legend>Misses information</legend>

        <table>
            <tr>
                <td>Name:</td>
                <td><input type="text" name="name" id="name"></td>
            </tr>
            <tr>
                <td>Email:</td>
                <td><input type="text" name="email" id="email"></td>
            </tr>
            <tr>
                <td>Address:</td>
                <td><input type="text" name="address" id="address"></td>
            </tr>
            <tr>
                <td>Date Of Birth:</td>
                <td><input type="text" name="dateofbirth" id="dateofbirth"></td>
            </tr>
            <tr>
                <td>Phone:</td>
                <td><input type="text" name="phone" id="phone"></td>
            </tr>
            <tr>
                <td>ID Card:</td>
                <td><input type="text" name="idcard" id="idcard"></td>
            </tr>
            <tr>
                <td>Job:</td>
                <td><input type="text" name="job" id="job"></td>
            </tr>
            <tr>
                <td>Educational Level:</td>
                <td><input type="text" name="educationallevel" id="educationallevel"></td>
            </tr>
            <tr>
                <td>Nation:</td>
                <td><input type="text" name="nation" id="nation"></td>
            </tr>
            <tr>
                <td>Work Or Study Unit:</td>
                <td><input type="text" name="workorstudyunit" id="workorstudyunit"></td>
            </tr>
            <tr>
                <td>Height:</td>
                <td><input type="text" name="height" id="height"></td>
            </tr>
            <tr>
                <td>Weight:</td>
                <td><input type="text" name="weight" id="weight" value="${requestScope["missList"].getWeight()}"></td>
            </tr>
            <tr>
                <td>Other Gifted:</td>
                <td><input type="text" name="othergifted" id="othergifted"></td>
            </tr>
            <tr>
                <td>Image:</td>
                <td><input type="text" name="image" id="image"></td>
            </tr>
            <tr>
                <td>Provine:</td>
                <td><select name="province" id="province">
                    <c:forEach items="${provinceList}" var="item">
                        <option value="${item.getId()}">${item.getName()}</option>
                    </c:forEach>
                </select>
                </td>
            </tr>
            <tr>
                <td><input type="submit" value="Create customer"></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>