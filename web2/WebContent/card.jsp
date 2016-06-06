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
<script src="../../assets/js/ie-emulation-modes-warning.js"></script>
<script src="//cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
<script src="//cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>

</head>

<body>
	<div class="container">
		<%@ include file="/nav.jsp"%>
		<a type="button" class="btn btn-success" href="/cardadd.jsp" style="float:right">新增</a>
		<%
			List<Card> list = (List<Card>)request.getAttribute("list");
		%>
		<div class="bs-example" data-example-id="contextual-table">
			<table class="table">
				<thead>
					<tr class="success">
						<th >序号</th>
						<th>卡号</th>
						<th>姓名</th>
						<th>电话号码</th>
						<th>操作</th>
					</tr>
				</thead>
				<tbody>
					<%
						for(Card cd:list){
					%>
					<tr class="info">
						<td><%=cd.getId() %></td>
						<td><%=cd.getCode() %></td>
						<td><%=cd.getName() %></td>
						<td><%=cd.getTel() %></td>
						<td>
						<button  type="button" class="btn btn-warning btn-xx">修改</button>
						<button id="<%=cd.getId() %>" type="button" class="btn btn-danger btn-xx">删除</button>
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
    <script>
    $("button.btn-danger").click(function(){
    	if(confirm("是否要删除？")){
    	var i = $(this).attr("id");
    	location.href = "/carddel.jsp?id="+i;
    		
    	}
    });
    </script>

</body>
</html>