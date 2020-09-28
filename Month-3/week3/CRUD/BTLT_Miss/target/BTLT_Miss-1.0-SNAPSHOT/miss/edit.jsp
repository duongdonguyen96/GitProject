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
<h1>Edit Miss</h1>
<p>
    <c:if test='${requestScope["message"] != null}'>
        <span class="message">${requestScope["message"]}</span>
    </c:if>
</p>
<p>
    <a href="${pageContext.request.contextPath}/misses">Back to Misses list</a>
</p>
<form method="post">
    <fieldset>
        <legend>Misses information</legend>

        <table>
            <tr>
                <td>Name:</td>
                <td><input type="text" name="name" id="name" value="${requestScope["missList"].getName()}"></td>
            </tr>
            <tr>
                <td>Email:</td>
                <td><input type="text" name="email" id="email" value="${requestScope["missList"].getEmail()}"></td>
            </tr>
            <tr>
                <td>Address:</td>
                <td><input type="text" name="address" id="address" value="${requestScope["missList"].getAddress()}">
                </td>
            </tr>
            <tr>
                <td>Date Of Birth:</td>
                <td><input type="text" name="dateofbirth" id="dateofbirth"
                           value="${requestScope["missList"].getDateOfBirth()}"></td>
            </tr>
            <tr>
                <td>Phone:</td>
                <td><input type="text" name="phone" id="phone" value="${requestScope["missList"].getPhone()}"></td>
            </tr>
            <tr>
                <td>ID Card:</td>
                <td><input type="text" name="idcard" id="idcard" value="${requestScope["missList"].getIdCard()}"></td>
            </tr>
            <tr>
                <td>Job:</td>
                <td><input type="text" name="job" id="job" value="${requestScope["missList"].getJob()}"></td>
            </tr>
            <tr>
                <td>Educational Level:</td>
                <td><input type="text" name="educationalLevel" id="educationalLevel"
                           value="${requestScope["missList"].getEducationalLevel()}"></td>
            </tr>
            <tr>
                <td>Nation:</td>
                <td><input type="text" name="nation" id="nation" value="${requestScope["missList"].getNation()}"></td>
            </tr>
            <tr>
                <td>Work Or Study Unit:</td>
                <td><input type="text" name="workorstudyunit" id="workorstudyunit"
                           value="${requestScope["missList"].getWorkOrStudyUnit()}"></td>
            </tr>
            <tr>
                <td>Height:</td>
                <td><input type="text" name="height" id="height" value="${requestScope["missList"].getHeight()}"></td>
            </tr>
            <tr>
                <td>Weight:</td>
                <td><input type="text" name="weight" id="weight" value="${requestScope["missList"].getWeight()}"></td>
            </tr>
            <tr>
                <td>Other Gifted:</td>
                <td><input type="text" name="othergifted" id="othergifted"
                           value="${requestScope["missList"].getOtherGifted()}"></td>
            </tr>
            <tr>
                <td>Image:</td>
                <td><input type="text" name="image" id="image" value="${requestScope["missList"].getImage()}"></td>
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
                <td><input type="submit" value="Edit Customer"></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>