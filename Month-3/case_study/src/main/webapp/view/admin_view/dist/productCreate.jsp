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
    <title>Bootstrap Simple Registration Form</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <style>
        body {
            color: #fff;
            background: #666666;
            font-family: 'Roboto', sans-serif;
        }

        .form-control {
            height: 40px;
            box-shadow: none;
            color: #969fa4;
        }

        .form-control:focus {
            border-color: #5cb85c;
        }

        .form-control, .btn {
            border-radius: 3px;
        }

        .signup-form {
            width: 400px;
            margin: 0 auto;
            padding: 30px 0;
        }

        .signup-form h2 {
            color: #636363;
            margin: 0 0 15px;
            position: relative;
            text-align: center;
        }

        .signup-form h2:before, .signup-form h2:after {
            content: "";
            height: 2px;
            width: 30%;
            background: #d4d4d4;
            position: absolute;
            top: 50%;
            z-index: 2;
        }

        .signup-form h2:before {
            left: 0;
        }

        .signup-form h2:after {
            right: 0;
        }

        .signup-form .hint-text {
            color: #999;
            margin-bottom: 30px;
            text-align: center;
        }

        .signup-form form {
            color: #999;
            border-radius: 3px;
            margin-bottom: 15px;
            background: #f2f3f7;
            box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
            padding: 30px;
        }

        .signup-form .form-group {
            margin-bottom: 20px;
        }

        .signup-form input[type="checkbox"] {
            margin-top: 3px;
        }

        .signup-form .btn {
            font-size: 16px;
            font-weight: bold;
            min-width: 140px;
            outline: none !important;
        }

        .signup-form .row div:first-child {
            padding-right: 10px;
        }

        .signup-form .row div:last-child {
            padding-left: 10px;
        }

        .signup-form a {
            color: #fff;
            text-decoration: underline;
        }

        .signup-form a:hover {
            text-decoration: none;
        }

        .signup-form form a {
            color: #5cb85c;
            text-decoration: none;
        }

        .signup-form form a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
<div class="signup-form">
    <form method="post" action="" >
        <h2>Create</h2>
        <p class="hint-text">Create new product. It's free and only takes a minute.</p>
        <c:if test='${requestScope["message"] != null}'>
            <span class="message" style="color: #00d363">${requestScope["message"]}</span>
        </c:if>
        <div class="form-group">
            <label>Price</label>
            <input type="text" class="form-control" name="price" placeholder=" price" required="required">
        </div>
        <div class="form-group">
            <label>Description</label>
            <input type="text" class="form-control" name="description" placeholder="description" required="required">
        </div>
        <div class="form-group">
            <label>Name</label>
            <input type="text" class="form-control" name="name" placeholder="name" required="required">
        </div>
        <div class="form-group">
            <label>Amount</label>
            <input type="text" class="form-control" name="amount" placeholder=" amount" required="required">
        </div>
        <div class="form-group">
            <label>Image</label>
            <input type="text" class="form-control" name="image" placeholder="image" required="required">
        </div>
        <div class="form-group">
            <label>Amount Sold</label>
            <input type="text" class="form-control" name="amountSold" placeholder="amountSold" required="required">
        </div>
        <div class="form-group">
            <label>Evaluate</label>
            <input type="text" class="form-control" name="evaluate" placeholder=" evaluate" required="required">
        </div>
        <div class="form-group">
            <label>Discount</label>
            <input type="text" class="form-control" name="discount" placeholder="discount" required="required">
        </div>
        <div class="form-group">
            <label>Type</label>
            <select name="type_id_type">
                <c:forEach items="${typeList}" var="list">
                    <option value="${list.id}">${list.name}</option>
                </c:forEach>
            </select>
            <%--            <input type="text" class="form-control" name="type_id_type" placeholder="type" required="required">--%>
        </div>
        <div class="form-group">
            <label>Producer</label>
            <select name="idProducer">
                <c:forEach items="${producers}" var="item">
                    <option value="${item.id}">${item.name}</option>
                </c:forEach>
            </select>
            <%--            <input type="text" class="form-control" name="type_id_type" placeholder="type" required="required">--%>
        </div>
        <div class="form-group">
            <label class="checkbox-inline"><input type="checkbox" required="required"> I accept the <a href="#">Terms
                of Use</a> &amp; <a href="#">Privacy Policy</a></label>
        </div>
        <div class="form-group">
            <button type="submit" class="btn btn-success btn-lg btn-block">Create</button>
        </div>
    </form>
    <div class="text-center"><a href="${pageContext.request.contextPath}/product?action=list">Back to List
        Customer</a>
    </div>
</div>
</body>
</html>
