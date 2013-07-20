<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Here</title>
</head>
<body>
<form name="login" action="loginsubmit" method="post" accept-charset="utf-8">
	<ul>
		<li><label for="usermail">Email</label>
		<input type="email" name="usermail" placeholder="yourname@email.com" required></li>
		<li><label for="password">Password</label>
		<input type="password" name="password" placeholder="password" required></li>
		<li>
		<input type="submit" value="Login"></li>
	</ul>
</form>
</body>
</html>