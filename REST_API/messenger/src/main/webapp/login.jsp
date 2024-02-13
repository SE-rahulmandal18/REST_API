<%@ page language="java" contentType="text/html; charset=UTF-8" import="java.util.Date"
    pageEncoding="UTF-8"%>
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
<h1>Login</h1>

<form action="webapi/inject/login" method="post">

Enter the User Name <input type="text" name="userName"><br>
Enter the Password <input type="password" name="password"><br>
<input type="submit" value="Login">

</form>


</body>
</html>