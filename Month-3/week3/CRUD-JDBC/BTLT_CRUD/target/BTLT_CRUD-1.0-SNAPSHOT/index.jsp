<%@ page import="model.Customer" %>
<%@ page import="service.CustomerService" %>
<%@ page import="static service.CustomerService.*" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 9/24/2020
  Time: 8:32 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style>
        table, th, td {
            border: 1px solid black;
            border-collapse: collapse;
        }
        th, td {
            padding: 5px;
            text-align: left;
        }
    </style>
</head>
<body>
<h1>Customer List</h1>
<a href="add.jsp">Add</a>
<table width="100%">
    <thead>
    <tr>
        <th>Email</th>
        <th>Name</th>
        <th>Phone</th>
        <th>Action</th>
    </tr>
    </thead>
    <tbody>
    <%
        ArrayList<Customer> customerArrayList=new ArrayList<>(lisCustomer.values());
        for(Customer customer: customerArrayList){
    %>
    <tr>
        <td><%= customer.getEmail()%></td>
        <td><%= customer.getName()%></td>
        <td><%= customer.getPhone()%></td>
        <td><a href="update.jsp?id=<%=customer.getId()%>">update</a>/<a href="delete?id=<%=customer.getId()%>">Delete</a></td>
    </tr>
    <%}%>
    </tbody>
</table>
</body>
</html>