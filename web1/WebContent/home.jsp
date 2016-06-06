<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>主页</title>
<link href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css"
	rel="stylesheet">
<style>
body {
	padding-top: 20px;
	padding-bottom: 20px;
}

.navbar {
	margin-bottom: 20px;
}
</style>
</head>

<body>
	<%@ include file="/div.jsp"%>
	<div class="jumbotron container">
		<h1>Navbar example</h1>
		<p>This example is a quick exercise to illustrate how the default,
			static navbar and fixed to top navbar work. It includes the
			responsive CSS and HTML, so it also adapts to your viewport and
			device.</p>
	</div>
	<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
	<script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</body>
</html>