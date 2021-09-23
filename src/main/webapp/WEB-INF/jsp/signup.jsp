<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<form action="signup" method="post">
	Name: <input name="name" placeholder="Enter Name" value="${user.name}" />
	Email:<input name="email" placeholder="Enter Email"
		value="${user.email}" /> Password: <input name="password"
		placeholder="Enter password" value="${user.password}" />
	<button type="submit">SUBMIT</button>
</form>