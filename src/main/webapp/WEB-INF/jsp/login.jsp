<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<form modelAttribute="login" action="loginuser" method="post">
	Name: <input name="name" placeholder="Enter Name" value="${name}"/>
	Email:<input name="email" placeholder="Enter Email" value="${email}"/>
 	Password: <input name="password" placeholder="Enter password" value="${password}"/>
	<button type="submit">SUBMIT</button>
	Message: ${message}
</form>