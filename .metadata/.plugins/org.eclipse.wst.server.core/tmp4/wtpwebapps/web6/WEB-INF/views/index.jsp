<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <link href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css" rel="stylesheet">
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
.form-signin .form-signin-heading,
.form-signin .checkbox {
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
  </style>
  </head>
  <body>
  <% String err = request.getParameter("err");
  if("444".equals("err")){
	%>
	<div class="container"><strong class="btn-danger">用户信息错误，请重新输入！</strong></div>
	<%  
  }
  %>
    <div class="container">
      <form class="form-signin" method="post" action="home_c">
        <h2 class="form-signin-heading">用户登录</h2>
        <label for="inputEmail" class="sr-only">用户名</label>
        <input type="text" id="inputEmail" class="form-control" name="name" placeholder="请输入用户名！">
        <label for="inputPassword" class="sr-only">密码</label>
        <input type="password" id="inputPassword" name="pwd" class="form-control" placeholder="请输入密码！">      
        <button class="btn btn-lg btn-primary btn-block" type="submit">登陆</button>
      </form>
    </div> 
</body>
</html>