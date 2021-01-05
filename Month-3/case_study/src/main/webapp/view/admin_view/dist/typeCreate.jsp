<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="UTF-8">
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://fonts.googleapis.com/css?family=Roboto:400,700" rel="stylesheet">
    <title>Duong Do Nguyen</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <link href="view/admin_view/dist/css/create.css" rel="stylesheet">
</head>
<body>
<div class="signup-form">
    <form method="post" action="">
        <h2>Create</h2>
        <c:if test='${requestScope["message"] != null}'>
            <span class="message" style="color: #00d363">${requestScope["message"]}</span>
        </c:if>
        <p class="hint-text">Create new type. It's free and only takes a minute.</p>
        <div class="form-group">
            <input type="text" class="form-control" name="name" placeholder=" Name Type" required="required">
        </div>
        <div class="form-group">
            <label class="checkbox-inline"><input type="checkbox" required="required"> I accept the <a href="#">Terms
                of Use</a> &amp; <a href="#">Privacy Policy</a></label>
        </div>
        <div class="form-group">
            <button type="submit" class="btn btn-success btn-lg btn-block">Create</button>
        </div>
    </form>
    <div class="text-center"><a href="${pageContext.request.contextPath}/type?action=list">Back to List
        Type</a>
    </div>
</div>
</body>
</html>
