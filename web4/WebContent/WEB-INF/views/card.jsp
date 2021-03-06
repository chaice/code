<%@ page import="java.util.List"%>
<%@ page import="com.ccit.sta.Card"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>借书卡管理</title>
<%@ include file="head.jsp"%>
<%
	List<Card> list = (List<Card>)request.getAttribute("list");
%>

<div class="bs-example" data-example-id="contextual-table">
	<table class="table">
	<a type="button" class="btn btn-success" href="/add_v" style="float:right">新增</a>	
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
			<tr class="success">
				<th scope="row"><%=c.getId()%></th>
				<td><%=c.getCode()%></td>
				<td><%=c.getName()%></td>
				<td><%=c.getTel()%></td>
				<td>
					<button id="<%=c.getCode()%>" type="button" class="btn btn-warning">修改</button>
					<button id="<%=c.getId()%>" type="button" class="btn btn-danger">删除</button>
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
	$("ul>li:nth-child(2)").addClass("active");
	$("button.btn-danger").click(function() {
		var id = $(this).attr("id");
		if(confirm("是否要删除？")){
			location.href = "/carddel?id="+id;
		}
	});
	$("button.btn-warning").click(function(){
		var code = $(this).attr("id");
		location.href = "/cardfind?id="+code;
	});
</script>
</body>
</html>