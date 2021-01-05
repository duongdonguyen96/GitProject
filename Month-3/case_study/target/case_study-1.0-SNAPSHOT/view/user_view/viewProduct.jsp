<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<!------ Include the above in your HEAD tag ---------->


<!DOCTYPE html>
<html lang="en">
<head>

    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>View Product</title>
    <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Open+Sans:400,700" rel="stylesheet">
    <link rel="stylesheet" href="view/user_view/css/viewProduct.css">
</head>

<body>
<div class="container">
    <div class="card">
        <div class="container-fliud">
            <div class="wrapper row">
                <div class="preview col-md-6">

                    <div class="preview-pic tab-content">
                        <div class="tab-pane active" id="pic-1"><img src="${product.image}"/></div>
                    </div>
                    <ul class="preview-thumbnail nav nav-tabs">

                    </ul>

                </div>
                <div class="details col-md-6">
                    <h3 class="product-title">${product.name}</h3>
                    <p class="product-description">${product.description}</p>
                    <h4 class="price">Giá: <span class="color-text">${product.price}</span></h4>
                    <h4 class="price">Đã bán: <span class="color-text">${product.amountSold}</span></h4>
                    <h4 class="price">Đánh giá: <span class="color-text">${product.evaluate} sao</span></h4>
                    <h4 class="price">Giảm giá: <span class="color-text">${product.discount}</span></h4>
                    <h4 class="price">Thể loại: <span class="color-text">${product.type.name}</span></h4>
                    <h4 class="price">Nhà xuất khẩu: <span class="color-text">${product.producer.name}</span></h4>
                    <div class="action">
                        <button class="add-to-cart btn btn-default" type="button">Mua ngay</button>
                        <button class="like btn btn-default" type="button"><span class="fa fa-heart"></span></button>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
