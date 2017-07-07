<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>更改试题</title>
</head>
<body>
<center>
		<h3>更新试题</h3>
		<hr />
		<form action="SpringmvcSpringMybatis/examination/update" method="post">
			<input id="id" type="hidden" name="id" value="${examlist.id}">
			<table>
				<tr>
					<td>题目:</td>
					<td><input type="text" name="exam" id="exam" value="${examlist.exam}"/></td>
				</tr>
				<tr>
					<td>选项A:</td>
					<td><input type="text" name="optionA" id="optionA" value="${examlist.optionA}"/></td>
				</tr>
				<tr>
					<td>选项B:</td>
					<td><input type="text" name="optionB" id="optionB" value="${examlist.optionB}"/></td>
				</tr>
				<tr>
					<td>选项C:</td>
					<td><input type="text" name="optionC" id="optionC" value="${examlist.optionC}"/></td>
				</tr>
				<tr>
					<td>选项D:</td>
					<td><input type="text" name="optionD" id="optionD" value="${examlist.optionD}"/></td>
				</tr>
				<tr>
					<td>正确答案:</td>
					<td><input type="text" name="exam_result" id="exam_result" value="${examlist.exam_result}"/></td>
				</tr>
				<tr>
					<td><input type="submit" value="更新" /></td>
					<td><input type="reset" value="取消" /></td>
				</tr>
			</table>
		</form>
	</center>

</body>
</html>