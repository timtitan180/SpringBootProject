<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
<style>
header {
  width: 100%;
  height: 40px;
  margin-bottom: 60px;
  overflow: hidden;
  border-bottom: 1px solid gray;
  padding-left: 20px;
  padding-right: 20px;
}

header ul {
  list-style-type: none;
  display: inline-block;
}

form {
  background-color: white;
  z-index: 20px;
  margin-top: 50px;
  text-align: center;
  align-items: center;
  height: 200px;
  width: 250px;
  border-radius: 10px;
  outline: 1px solid gray;
  margin-left: 150px;
}

.footer {
  font-size: small;
  margin-bottom: 0;
  margin-left: 200px;
  margin-top: 250px;
  list-style-type: none;
}

</style>
</head>
<body>
<header></header>
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
<ul class="footer"><li>@Footer</li></ul>
</body>
</html>