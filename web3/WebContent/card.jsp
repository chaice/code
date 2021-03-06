<%@ page import="java.util.List"%>
<%@ page import="com.ccit.sta.Card"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>借书卡管理</title>
<link href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css"
	rel="stylesheet">
<link href="navbar.css" rel="stylesheet">
</head>
<body>
	<%@ include file="/nav.jsp"%>
	<%
		List<Card> list =(List<Card>)request.getAttribute("list");
	%>
	<div class="container">
		<a type="button" class="btn btn-primary" href="/cardadd.jsp"
			style="float: right">新增</a>
		<div class="bs-example" data-example-id="contextual-table">
			<table class="table">
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
					<%
						for(Card c : list){
					%>
					<tr class="info">
						<th scope="row"><%=c.getId()%></th>
						<td><%=c.getCode()%></td>
						<td><%=c.getName()%></td>
						<td><%=c.getTel()%></td>
						<td>
							<button id="<%=c.getCode()%>" type="button" class="btn btn-warning btn-xx">修改</button>
							<button id="<%=c.getId()%>" type="button"
								class="btn btn-danger btn-xx">删除</button>
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
	<script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
	<script src="../../assets/js/ie-emulation-modes-warning.js"></script>
	<script>
		$("ul>li:nth-child(1)").removeClass("active");		
		$("ul>li:nth-child(2)").addClass("active");
		$("button.btn-danger").click(function() {
			var i = $(this).attr("id");
			if (confirm("确认要删除？")) {
				location.href = "/carddel.jsp?id=" + i;
			}
		});
		$("button.btn-warning").click(function() {
			var code = $(this).attr("id");
			location.href = "/card_find.jsp?id="+code;
		});
	</script>
</body>
</html>