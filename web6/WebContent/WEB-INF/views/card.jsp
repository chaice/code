<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>借书卡管理</title>
<%@ include file="head.jsp"%>
<a type="button" class="btn btn-success" href="/card_add" style="float:right">新增</a>
<div class="bs-example" data-example-id="bordered-table">
	<table class="table table-bordered">
		<thead>
			<tr class="active">
				<th scope="row">序号</th>
				<th>卡号</th>
				<th>姓名</th>
				<th>电话号码</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="ca" items="${requestScope.list}">
				<tr class="info">
					<th scope="row">${ca.id}</th>
					<td>${ca.code}</td>
					<td>${ca.name}</td>
					<td>${ca.tel}</td>
					<td>
						<button id="${ca.code}" type="button" class="btn btn-warning">修改</button>
						<button id="${ca.id}" type="button" class="btn btn-danger">删除</button>
					</td>
				</tr>
			</c:forEach>

		</tbody>
	</table>
</div>
</div>
<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
<script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script>
	$("#l2").addClass("active");
	$("button.btn-warning").click(function() {
      var code = $(this).attr("id");
      location.href = "/card_alter?code="+code;
	});
	$("button.btn-danger").click(function(){
		var id = $(this).attr("id");
		if(confirm("确认删除？")){
			location.href = "/card_del?id="+id;
		}
	});
</script>
</body>
</html>
