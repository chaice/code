<%@ page import="com.ccit.sta.Card"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>修改信息</title>
<%@ include file="head.jsp"%>
<% Card c = (Card)request.getAttribute("card"); %>
<div class="row">
	<div class="col-md-8 col-md-offset-2">
		<div class="panel panel-default">
			<div class="panel-heading">
				<span> Register </span>				
			</div>
			<div class="panel-body">
				<form class="form-horizontal" role="form" action="/cardalter?id=<%=c.getId()%>" method="post">
					<div class="form-group">
						<label class="col-md-4 control-label">卡号</label>
						<div class="col-md-6">
							<input type="text" class="form-control" name="code" value="<%=c.getCode() %>">
							<span class="help-block" style="display: none;"> </span>
						</div>
					</div>			
					<div class="form-group">
						<label class="col-md-4 control-label">姓名</label>
						<div class="col-md-6">
							<input type="text" class="form-control" name="name" value="<%=c.getName() %>">
							<span class="help-block" style="display: none;"> </span>
						</div>
					</div>					
					<div class="form-group">
						<label class="col-md-4 control-label">电话号码</label>
						<div class="col-md-6">
							<input type="text" class="form-control" name="tel" value="<%=c.getTel() %>"> <span
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
</div>
</div>
<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
<script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script src="//cdn.bootcss.com/jquery-validate/1.15.0/jquery.validate.min.js"></script>
<script>
$("ul>li:nth-child(2)").addClass("active");
$(".form-horizontal").validate({
		rules:{
			code:"required",
			name:"required",
			tel:"required"
		},
		messages:{
			code:"请输入卡号！",
			name:"请输入姓名！",
			tel:"请输入电话号码！"
		}}
		);
</script>
</body>
</html>