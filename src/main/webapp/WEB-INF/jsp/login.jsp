<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
<style>
	body {
		background-color:antique-white;
	}
	form {
		height:200px;
		width:200px;
		border-radius:6px;
		box-shadow:0 6px 7px gray;
		display:flex;
	}
</style>
</head>
<body>
<form action="/login/login" method="post">
	<p>${error}</p>
	<div>
		<label>Enter Email</label>
		<input name="email" placeholder="Enter Email"/>
	</div>
	<div>
		<label>Enter Password</label>
		<input name="password" placeholder="Enter Password"/>
	</div>
	<div>
		<input type="submit" value="Submit"/>
	</div>
</form>
</body>
</html>