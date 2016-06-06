<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
	<div class="col-md-8 col-md-offset-2">
		<div class="panel panel-default">
			<div class="panel-heading">
				<span>信息</span>
			</div>
			<div class="panel-body">				
				<form class="form-horizontal" role="form" method="post" action="/card_add.jsp">					
					<div class="form-group">
						<label class="col-md-4 control-label">卡号</label>
						<div class="col-md-6">
							<input type="text" class="form-control" name="code" placeholder="请输入卡号">
							<span class="help-block" style="display: none;"> </span>
						</div>
					</div>
					<div class="form-group">
						<label class="col-md-4 control-label">姓名</label>
						<div class="col-md-6">
							<input type="text" class="form-control" name="name" placeholder="请输入姓名">
							<span class="help-block" style="display: none;"> </span>
						</div>
					</div>
					<div class="form-group">
						<label class="col-md-4 control-label">电话号码</label>
						<div class="col-md-6">
							<input type="text" class="form-control" name="tel" placeholder="请输入密码"> <span
								class="help-block" style="display: none;"> </span>
						</div>
					</div>
					<div class="form-group">
						<div class="col-md-6 col-md-offset-4">
							<button class="btn btn-primary">
								<span> <i class="fa fa-btn fa-check-circle"></i>确定
								</span>
							</button>
						</div>
					</div>
			</div>
			</form>
		</div>
	</div>
	<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
	<script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
	<script src="//cdn.bootcss.com/jquery-validate/1.15.0/jquery.validate.min.js"></script>
	<script>
	$("ul>li:nth-child(1)").removeClass("active");
	$("ul>li:nth-child(2)").addClass("active");
	$(".form-horizontal").validate({
		rules:{
			code:"required",
			name:"required",
			tel:"required"
		},
		messages:{
			code:"请输入卡号",
			name:"请输入姓名",
			tel:"请输入电话号码"
		}
	});
	</script>
</body>
</html>