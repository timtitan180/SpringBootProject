<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Parcel Sandbox</title>
<meta charset="UTF-8" />
<link rel="stylesheet" shref="css/signupstyle.css" type="text/css" />
<style>
* {
	box-sizing: border-box;
}

body {
	font-family: sans-serif;
	background-color: rgba(10, 10, 10, 0.1);
}

.errors {
	color: red;
	display: block;
	position: relative;
	text-align: center;
	margin-bottom: 10px;
	font-size: 10px;
}

ul {
	text-align: right;
	border-bottom: 1px solid white;
	position: fixed;
	width: 100%;
	height: 30px;
	list-style-type: none;
	margin: 0;
	padding-top: 5px;
	display: inline;
	padding-bottom: 50px;
	padding-left: 20px;
	box-shadow: 0px 7px 10px #ece9e9;
}

ul li {
	margin-top: 20px;
	margin-right: 15px;
	display: inline;
	text-decoration: none;
	float: right;
}

a {
	margin-right: 2px;
	text-decoration: none;
	font-weight: bold;
	color: white;
}

a:hover {
	color: rgba(0, 100, 250, 0.3)
}

/* .col {
    float: left;
    width:%;
  } */
.header {
	background-color: white;
	width: 100%;
	height: 80px;
	padding-top: 20px;
	padding-right: 500px;
	padding-left: 270px;
	overflow: hidden;
	margin-bottom: 5px;
	box-shadow: 0 10px 6px -8px gray;
}

.links {
	position: relative;
	margin-right: 200px;
}

form {
	background-color: rgba(250, 250, 250);
	height: 430px;
	width: 310px;
	margin-top: 5%;
	margin-left: 250px;
	border: 1px solid gray;
	border-radius: 5px;
	border: 1px solid rgba(252, 252, 252, 0.9);
	box-shadow: 0 1px 4px 1px gray;
}

p {
	font-family: 'Padauk', sans-serif;
	font-size: 11px;
}

.col {
	margin-left: 30px;
}

h3 {
	text-align: center;
}

.inputs {
	margin-left: 80px;
	display: block;
	border: 1px solid rgba(252, 252, 252, 0.7);
	background-color: rgba(0, 0, 0, 0.1);
	padding-top: 7px;
	height: 35px;
	width: 150px;
	border-radius: 3px;
	font-family: "Source Sans Pro", sans-serif;
	color: white;
	margin-top: 25px;
	margin-bottom: 8px;
}

select {
	background-color: rgba(252, 252, 252, 0.2);
	border: 1px solid rgba(252, 252, 252, 0.4);
	color: gray;
}

select option::after {
	color: white;
}

button {
	margin-right: 130px;
	margin-top: 10px;
	border: none;
	background-color: rgba(250, 250, 250, 0.4);
	border-radius: 6px;
	padding-bottom: 5px;
	font-weight: 800px;
}

button:hover {
	background-color: aqua;
	opacity: 60%;
}

h5 {
	color: rgba(250, 250, 250, 0.4);
}

header {
	width: 100%;
	margin-right: 5px;
	padding-left: 15px;
	border-bottom: 1px solid rgba(250, 250, 250, 0.4);
}

header img {
	position: absolute;
	float: left;
	height: 40px;
	width: 40px;
}

select {
	padding-top: 7px;
}

td {
	border: 1px solid rgba(250, 250, 250, 0.4);
}

.button-container {
	margin-top: 60px;
}

.register-header {
	margin-top: 40px;
	margin-left: 300px;
	justify-content: center;
	text-align: center;
	align-items: center;
	color: white;
	height: 40px;
	width: 200px;
	background-color: cadetblue;
	border-radius: 10px;
}

.register-header img {
	margin-left: 2px;
}
</style>
</head>
<body>
	<header class="header">
		<img
			src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQWY-JYi8Qr36TQO_hwe_2LXfPx8TJNxguzrQ&usqp=CAU"
			alt="baseball-image" />
		<h4>GRAND SLAM</h4>
	</header>
	<c:forEach items="${errors}" var="error">
		<p style="color: red">${error}</p>
	</c:forEach>
	<div class="register-header">
		<h3>REGISTER</h3>
	</div>
	<form method="POST">
		<input class="inputs" id="fname" autcomplete="off" autofill="off" placeholder="Enter First Name"></input> <input
			class="inputs" autcomplete="off" autofill="off" id="lname"
			placeholder="Enter Last Name"></input> <input
			autocomplete="off" autofill="off" class="inputs" id="city" placeholder="Enter Email"></input> <input
			autocomplete="off" autofill="off" class="inputs" id="age"
		    placeholder="Enter Password"></input> <input
			autcomplete="off" autofill="off" class="inputs" id="zipcode"
			placeholder="Confirm Password"></input> <select
			class="inputs" id="select">
			<option>Enter Role</option>
			<option value="COACH">COACH</option>
			<option value="PLAYER">PLAYER</option>
		</select>
		<button type="submit" id="button"
			style="color: white; background-color: lime; height: 30px; width: 60px; border-radius: 1px; margin-top: 25px; margin-left: 45%; margin-bottom: 170px; position: relative;">Submit</button>
	</form>
</body>
</html>