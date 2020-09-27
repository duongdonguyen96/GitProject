<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit Product</title>
</head>
<body>
<h1>Edit Product </h1>

<p>
    <a href="${pageContext.request.contextPath}/products">Back to product list</a>
</p>
<form method="post">
    <fieldset>
        <legend>Product information</legend>
        <table>
            <tr>
                <td>Name:</td>
                <td><input type="text" name="name" id="name" value="${requestScope["products"].getName()}"></td>
            </tr>
            <tr>
                <td>Price:</td>
                <td><input type="text" name="price" id="email" value="${requestScope["products"].getPrice()}"></td>
            </tr>
            <tr>
                <td>Producer:</td>
                <td><input type="text" name="producer" id="producer" value="${requestScope["products"].getProducer()}">
                </td>
            </tr>
            <tr>
                <td><input type="hidden" name="id" id="id" value="${requestScope["products"].getId()}">
                </td>
            </tr>
            <tr>
                <td>Description:</td>
                <td><input type="text" name="description" id="description"
                           value="${requestScope["products"].getDescription()}"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Edit Product"></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>