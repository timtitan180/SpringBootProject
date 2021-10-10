<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>

<div><input type="search" name="search"/><button>Search</button></div>

	<table border="1" cellpadding="3">
		<tr>
		<td>Id</td>
		<td>FirstName</td>
		<td>LastName</td>
		<td>Email</td>
		</tr>
	</table>
	<c:if test="${if not empty search and not empty users}">
	<c:forEach items="${users}" var="user">
		<td>user.id</td>
		<td>user.firstName</td>
		<td>user.lastName</td>
		<td>user.email</td>
	</c:forEach>
	</c:if>
		

</body>
</html>