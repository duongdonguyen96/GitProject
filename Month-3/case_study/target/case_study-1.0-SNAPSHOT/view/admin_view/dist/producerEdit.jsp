<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="UTF-8">
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://fonts.googleapis.com/css?family=Roboto:400,700" rel="stylesheet">
    <title>Bootstrap Simple Registration Form</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="view/admin_view/dist/css/edit.css">
</head>
<body>
<div class="signup-form">
    <form method="post">
        <h2>Edit</h2>
        <c:if test='${requestScope["message"] != null}'>
            <span class="message" style="color: #00d363">${requestScope["message"]}</span>
        </c:if>
        <div class="form-group">
            <input type="text" class="form-control" name="name" required="required"
                   value="${producer.getName()}">
        </div>
        <div class="form-group">
            <input type="text" class="form-control" name="phone" required="required"
                   value="${producer.getPhone()}">
        </div>
        <div class="form-group">
            <input type="text" class="form-control" name="address" required="required"
                   value="${producer.getAddress()}">
        </div>
        <div class="form-group">
            <input type="submit" class="btn btn-success btn-lg btn-block" value="EDit">
        </div>
    </form>
    <div class="text-center"><a href="${pageContext.request.contextPath}/producer?action=list">Back to List Customer</a>
    </div>


</div>
</body>
</html>

