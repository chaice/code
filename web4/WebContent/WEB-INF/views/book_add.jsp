<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>新增图书</title>
<%@ include file="head.jsp"%>
<div class="row">
	<div class="col-md-8 col-md-offset-2">
		<div class="panel panel-default">
			<div class="panel-heading">
				<span> Register </span>				
			</div>
			<div class="panel-body">
				<form class="form-horizontal" role="form" action="/bookadd" method="post">
					<div class="form-group">
						<label class="col-md-4 control-label">书号</label>
						<div class="col-md-6">
							<input type="text" class="form-control" name="code">
							<span class="help-block" style="display: none;"> </span>
						</div>
					</div>			
					<div class="form-group">
						<label class="col-md-4 control-label">书名</label>
						<div class="col-md-6">
							<input type="text" class="form-control" name="title">
							<span class="help-block" style="display: none;"> </span>
						</div>
					</div>					
					<div class="form-group">
						<label class="col-md-4 control-label">作者</label>
						<div class="col-md-6">
							<input type="text" class="form-control" name="name"> <span
								class="help-block" style="display: none;"> </span>
						</div>
					</div>
					<div class="form-group">
						<label class="col-md-4 control-label">出版社</label>
						<div class="col-md-6">
							<input type="text" class="form-control" name="pub"> <span
								class="help-block" style="display: none;"> </span>
						</div>
					</div>
					<div class="form-group">
						<label class="col-md-4 control-label">总数</label>
						<div class="col-md-6">
							<input type="text" class="form-control" name="total"> <span
								class="help-block" style="display: none;"> </span>
						</div>
					</div>
					<div class="form-group">
						<label class="col-md-4 control-label">剩余数量</label>
						<div class="col-md-6">
							<input type="text" class="form-control" name="count"> <span
								class="help-block" style="display: none;"> </span>
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
</div>
</div>
<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
<script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script src="//cdn.bootcss.com/jquery-validate/1.15.0/jquery.validate.min.js"></script>
<script>
$("ul>li:nth-child(3)").addClass("active");
$(".form-horizontal").validate({
		rules:{
			code:"required",
			title:"required",
			name:"required",
			pub:"required",
			total:"required",
			count:"required"
		},
		messages:{
			code:"请输入书号",
			title:"请输入书名",
			name:"请输入作者",
			pub:"请输入出版社",
			total:"请输入总数",
			count:"请输入剩余数量"
		}}
		);
</script>
</body>
</html>