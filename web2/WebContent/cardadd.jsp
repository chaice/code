<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>注册</title>
<link href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css"
	rel="stylesheet">
<link href="navbar.css" rel="stylesheet">
<script src="../../assets/js/ie-emulation-modes-warning.js"></script>
<script src="//cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
<script src="//cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
</head>
<body>
	<%@ include file="nav.jsp"%>
	<div class="col-md-8 col-md-offset-2">
		<div class="panel panel-default">
			<div class="panel-heading">
				<span> <strong>注册表 </strong></span>
			</div>
			<div class="panel-body">
				<form class="form-horizontal" role="form" action="/card_add.jsp" method="post">
					<div class="form-group">
						<label class="col-md-4 control-label">卡号</label>
						<div class="col-md-6">
							<input type="text" class="form-control" name="code"
								placeholder="请输入卡号"> <span class="help-block"
								style="display: none;"> </span>
						</div>
					</div>
					<div class="form-group">
						<label class="col-md-4 control-label">姓名</label>
						<div class="col-md-6">
							<input type="text" class="form-control" name="name"
								placeholder="请输入姓名"> <span class="help-block"
								style="display: none;"> </span>
						</div>
					</div>
					<div class="form-group">
						<label class="col-md-4 control-label">电话号码</label>
						<div class="col-md-6">
							<input type="text" class="form-control" name="tel"
								placeholder="请输入电话号码"> <span class="help-block"
								style="display: none;"> </span>
						</div>
					</div>
					<div class="form-group">
						<div class="col-md-6 col-md-offset-4">
							<button class="btn btn-primary">
								<span> <i class="fa fa-btn fa-check-circle"></i>添加
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
	<script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
	<script
		src="//cdn.bootcss.com/jquery-validate/1.15.0/jquery.validate.min.js"></script>
	<script>
		$(".form-horizontal").validate({
			rules : {
				code : {
					required : true
				},
				name : {
					required : true
				},
				tel : {
					required : true
				}

			},
			messages:{
				code : "请输入卡号",
				name : "请输入姓名",
				tel : "请输入电话号码"
			}
		});
	</script>
</body>
</html>