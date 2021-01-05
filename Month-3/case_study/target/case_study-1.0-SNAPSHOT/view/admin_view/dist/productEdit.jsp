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
            <label> Giá:</label>
            <input type="text" class="form-control" name="price" required="required"
                   value="${product.price}">
        </div>
        <div class="form-group">
            <label> Mô tả:</label>
            <input type="text" class="form-control" name="description" required="required"
                   value="${product.description}">
        </div>
        <div class="form-group">
            <label> Tên sản phẩm:</label>
            <input type="text" class="form-control" name="name" required="required"
                   value="${product.name}">
        </div>
        <div class="form-group">
            <label>Số lượng còn lại:</label>
            <input type="text" class="form-control" name="amount" required="required"
                   value="${product.amount}">
        </div>
        <div class="form-group">
            <label> Ảnh:</label>
            <input type="text" class="form-control" name="image" required="required"
                   value="${product.image}">
        </div>
        <div class="form-group">
            <label>Số lượng đã bán</label>
            <input type="text" class="form-control" name="amountSold" required="required"
                   value="${product.amountSold}">
        </div>
        <div class="form-group">
            <label> Đánh giá</label>
            <input type="text" class="form-control" name="evaluate" required="required"
                   value="${product.evaluate}">
        </div>
        <div class="form-group">
            <label> Giá giảm</label>
            <input type="text" class="form-control" name="discount" required="required"
                   value="${product.discount}">
        </div>
        <div class="form-group">
            <label> Thể loại</label>
            <select name="type_id_type">
                <c:forEach items="${typeList}" var="item">
                    <c:if test="${item.id==product.idType}">
                        <option value="${item.id}" selected>${item.name}</option>
                    </c:if>
                    <c:if test="${!(item.id==product.idType)}">
                        <option value="${item.id}">${item.name}</option>
                    </c:if>
                </c:forEach>
            </select>

        </div>

        <div class="form-group">
            <label> Nhà Sản Xuất</label>
            <select name="idProducer">
                <c:forEach items="${producerList}" var="item">
                    <c:if test="${item.id==product.idProducer}">
                        <option value="${item.id}" selected>${item.name}</option>
                    </c:if>
                    <c:if test="${!(item.id==product.idProducer)}">
                        <option value="${item.id}">${item.name}</option>
                    </c:if>

                </c:forEach>
            </select>

        </div>


        <div class="form-group">
            <input type="submit" class="btn btn-success btn-lg btn-block" value="Edit"
                   onclick="message(${product.name})">
        </div>
    </form>
    <div class="text-center"><a href="${pageContext.request.contextPath}/product?action=list">Back to List product</a>
    </div>
</div>
<script>
    // function message(name) {
    //     alert("Sửa sản phẩm " + name + " thành công");
    //     // window.location = "http://localhost:8080/product?action=list";
    // }
</script>
</body>
</html>

