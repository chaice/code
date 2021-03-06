<%@ page import="java.util.List"%>
<%@ page import="com.ccit.sta.Book"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>图书管理</title>
<%@ include file="head.jsp"%>
<%
	List<Book> list = (List<Book>)request.getAttribute("list");
%>

<div class="bs-example" data-example-id="contextual-table">
	<form class="form-inline" action="/bookfind">
		<div class="form-group">
			<div class="input-group">
				<input type="text" class="form-control" id="exampleInputAmount"
					placeholder="请输入查找的内容" name="wd">
			</div>
		</div>
		<button type="submit" class="btn btn-primary">查询</button>
		<a type="button" class="btn btn-success" href="/booka_v"
			style="float: right">新增</a>
	</form>
	<table class="table">
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
			<%
				for(Book b : list){
			%>
			<tr class="success">
				<th scope="row"><%=b.getId()%></th>
				<td><%=b.getCode()%></td>
				<td><%=b.getTitle()%></td>
				<td><%=b.getAuthor()%></td>
				<td><%=b.getPublishing()%></td>
				<td><%=b.getTotal()%></td>
				<td><%=b.getCount()%></td>
				<td>
					<button id="<%=b.getId()%>" type="button" class="btn btn-warning">修改</button>
					<button id="<%=b.getId()%>" type="button" class="btn btn-danger">删除</button>
				</td>
			</tr>
			<%
				}
			%>
		</tbody>
	</table>
</div>
</div>
<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
<script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script>
	$("ul>li:nth-child(3)").addClass("active");
	$("button.btn-danger").click(function() {
		var id = $(this).attr("id");
		if (confirm("是否要删除？")) {
			location.href = "/bookdel?id=" + id;
		}
	});
	$("button.btn-warning").click(function() {
		var id = $(this).attr("id");
		location.href = "/find?id=" + id;
	});
</script>
</head>
<body>
</body>
</html>