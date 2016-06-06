<%@ page import="com.ccit.sta.Card"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>修改信息</title>
<link href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css"
	rel="stylesheet">
<link href="navbar.css" rel="stylesheet">
</head>
<body>
	<%@ include file="/nav.jsp"%>
	<% Card c = (Card)request.getAttribute("user");
	%>
	<div class="col-md-8 col-md-offset-2">
		<div class="panel panel-default">
			<div class="panel-heading">
				<span>用户信息 </span>
			</div>
			<div class="panel-body">
				<form class="form-horizontal" role="form" action="/card_update.jsp?id=<%=c.getId()%>"
					method="post">
					<div class="form-group">
						<label class="col-md-4 control-label">卡号</label>
						<div class="col-md-6">
							<input type="text" class="form-control" name="code" placeholder="<%=c.getCode() %>" value="<%=c.getCode() %>"> <span
								class="help-block" style="display: none;"> </span>
						</div>
					</div>
					<div class="form-group">
						<label class="col-md-4 control-label">姓名</label>
						<div class="col-md-6">
							<input type="text" class="form-control" name="name" placeholder="<%=c.getName() %>" value="<%=c.getName() %>"> <span
								class="help-block" style="display: none;"> </span>
						</div>
					</div>
					<div class="form-group">
						<label class="col-md-4 control-label">电话号码</label>
						<div class="col-md-6">
							<input type="text" class="form-control" name="tel" placeholder="<%=c.getTel()%>" value="<%=c.getTel()%>"> <span
								class="help-block" style="display: none;"> </span>
						</div>
					</div>
					<div class="form-group">
						<div class="col-md-6 col-md-offset-4">
							<button class="btn btn-primary">
								<span> <i class="fa fa-btn fa-check-circle"></i>确认
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
	<script src="../../assets/js/ie-emulation-modes-warning.js"></script>
	<script
		src="//cdn.bootcss.com/jquery-validate/1.15.0/jquery.validate.min.js"></script>
	<script>
	$("ul>li:nth-child(1)").removeClass("active");		
	$("ul>li:nth-child(2)").addClass("active");
		$(".form-horizontal").validate({
			rules : {
				code : {required:true},
				name : "required",
				tel : "required"
			},
			messages : {
				code : "请输入卡号！",
				name : "请输入姓名！",
				tel : "请输入电话号码！"
			}
		});
	</script>
</body>
</html>