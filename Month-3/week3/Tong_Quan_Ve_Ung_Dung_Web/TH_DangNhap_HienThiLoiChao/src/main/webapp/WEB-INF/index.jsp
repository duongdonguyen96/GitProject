<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 9/23/2020
  Time: 12:23 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Login Page</title>
    <style type="text/css">
        .login {
            height:180px; width:230px;
            margin:0;
            padding:10px;
            border:1px #CCC solid;
        }
        .login input {
            padding:5px; margin:5px
        }
    </style>
</head>
<body>
<form method="post" action="/logins">
    <div class="login">
        <h2>Login</h2>
        <label>
            <input type="text" name="username" size="30"  placeholder="username" />
        </label>
        <label>
            <input type="password" name="password" size="30" placeholder="password" />
        </label>
        <input type="submit" value="Sign in"/>
    </div>
</form>
</body>
</html>