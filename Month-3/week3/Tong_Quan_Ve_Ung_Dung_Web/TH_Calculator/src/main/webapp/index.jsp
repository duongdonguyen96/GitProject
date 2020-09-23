
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Currency Converter</title>

</head>
<body>
<h2>Currency Converter</h2>
<form action="${pageContext.request.contextPath}/convert" method="post">
    <label>Product Description: </label><br/>
    <label>
        <input type="text" name="productDescription" placeholder="Product Description" />
    </label><br/>
    <label>List Price: </label><br/>
    <label>
        <input type="text" name="listPrice" placeholder="List Price" />
    </label><br/>
    <label>Discount Percent: </label><br/>
    <label>
        <input type="text" name="discountPercent" placeholder="Discount Percent" />
    </label><br/>
    <input type = "submit" id = "submit" value = "Converter"/>
</form>
</body>
</html>
