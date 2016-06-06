<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>图书管理</title>
<%@ include file="head.jsp"%>
<a type="button" class="btn btn-success" href="/book_add" style="float:right">新增</a>
<div class="bs-example" data-example-id="bordered-table">
<form class="form-inline" action="/book_find">
      <div class="form-group">
        <div class="input-group">
          <input type="text" class="form-control" id="exampleInputAmount" name="wd" placeholder="请输入查询内容！">
        </div>
      </div>
      <button type="submit" class="btn btn-primary">搜索</button>
    </form>
	<table class="table table-bordered">
		<thead>
			<tr class="active">
				<th scope="row">序号</th>
				<th>书号</th>
				<th>书名</th>
				<th>作者</th>
				<th>出版社</th>
				<th>总数</th>
				<th>剩余数量</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="bo" items="${requestScope.list}">
				<tr class="info">
					<th scope="row">${bo.id}</th>
					<td>${bo.code}</td>
					<td>${bo.title}</td>
					<td>${bo.author}</td>
					<td>${bo.publishing}</td>
					<td>${bo.total}</td>
					<td>${bo.count}</td>
					<td>
						<button id="${bo.code}" type="button" class="btn btn-warning">修改</button>
						<button id="${bo.id}" type="button" class="btn btn-danger">删除</button>
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
	$("#l3").addClass("active");
	$("button.btn-danger").click(function() {
      var id = $(this).attr("id");
      location.href = "/book_alter?id="+id;
	});
	$("button.btn-warning").click(function(){
		var code = $(this).attr("id");
		if(config("确认删除？")){
			location.href = "/book_del?id="+code;
		}
	});
</script>
</body>
</html>