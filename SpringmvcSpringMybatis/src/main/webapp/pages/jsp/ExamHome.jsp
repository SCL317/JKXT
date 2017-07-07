<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>驾考试题</title>
</head>
<body>
	<center>
		<h3>驾考试题</h3>
		<hr />
		<form action="<%=request.getContextPath()%>/examination/delete" method="post">
		    <a href="<%=request.getContextPath()%>/pages/jsp/addExam.jsp">新增</a>
			<a href="<%=request.getContextPath()%>/examination/selectAll">获取所有题目</a> 
			<input type="submit" value="删除多个">
			<table border="1" bordercolor="blue" cellspacing="0">
				<tr>
					<td>选择</td>
					<td>题号</td>
					<td>考试题目</td>
					<td>选项A</td>
					<td>选项B</td>
					<td>选项C</td>
					<td>选项D</td>
					<td>正确答案</td>
				</tr>
				<c:forEach var="examlist" items="${list}">
					<tr>
						<td><input type="checkbox" name="ids" value="${examlist.id}" /></td>
						<td><a href="<%= request.getContextPath()%>/examination/selectOne/${examlist.id}">${examlist.id}</a></td>
						<td>${examlist.exam}</td>
						<td>${examlist.optionA}</td>
						<td>${examlist.optionB}</td>
						<td>${examlist.optionC}</td>
						<td>${examlist.optionD}</td>
						<td>${examlist.exam_result}</td>
						<td><a href="<%= request.getContextPath()%>/examination/delete/${examlist.id}">删除</a></td>

					</tr>	
				</c:forEach>
			</table>
		    <table>
		    <tr>
		    </tr>
		    </table>
		</form>
	</center>


</body>
</html>