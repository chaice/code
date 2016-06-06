<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登陆</title>
<link href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css"
	rel="stylesheet">
<link href="signin.css" rel="stylesheet">
<style>
body {
	padding-top: 40px;
	padding-bottom: 40px;
	background-color: #eee;
}

.form-signin {
	max-width: 330px;
	padding: 15px;
	margin: 0 auto;
}

.form-signin .form-signin-heading,.form-signin .checkbox {
	margin-bottom: 10px;
}

.form-signin .checkbox {
	font-weight: normal;
}

.form-signin .form-control {
	position: relative;
	height: auto;
	-webkit-box-sizing: border-box;
	-moz-box-sizing: border-box;
	box-sizing: border-box;
	padding: 10px;
	font-size: 16px;
}

.form-signin .form-control:focus {
	z-index: 2;
}

.form-signin input[type="email"] {
	margin-bottom: -1px;
	border-bottom-right-radius: 0;
	border-bottom-left-radius: 0;
}

.form-signin input[type="password"] {
	margin-bottom: 10px;
	border-top-left-radius: 0;
	border-top-right-radius: 0;
}
.d1{
  background-image:url("https://www.google.com.hk/logos/doodles/2016/frankie-mannings-102nd-birthday-5160522641047552-hp.gif");
  width:404px;
  height:228px;
}
</style>
</head>
<body>

	<div class="container">
	<% 
	String err = request.getParameter("err");
	if("444".equals(err)){
	%>
	<div class="container btn-danger">您输入的信息有误，请重新输入！</div>
	<%	
	}
	%>
	<div class="d1 container"></div>
		<form class="form-signin" action="/home_c.jsp">
			<h2 class="form-signin-heading">Please sign in</h2>
			<label for="inputEmail" class="sr-only">用户名</label> <input
				type="text" id="inputEmail" class="form-control"
				placeholder="请输入用户名" name="name"> <label
				for="inputPassword" class="sr-only">密码</label> <input
				type="password" id="inputPassword" class="form-control"
				placeholder="请输入密码" name="pwd">
			<button class="btn btn-lg btn-primary btn-block" type="submit">登陆</button>
		</form>
	</div>
	<script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
	<script src="../../assets/js/ie-emulation-modes-warning.js"></script>
</body>
</html>