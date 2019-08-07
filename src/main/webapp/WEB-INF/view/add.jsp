<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath()%>/resource/css/css.css"
	rel="stylesheet">
<script type="text/javascript"
	src="<%=request.getContextPath()%>/resource/My97DatePicker/WdatePicker.js"></script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/resource/js/jquery-3.2.1.js"></script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/resource/js/jquery.validate.js"></script>
<script type="text/javascript">
	$(function() {
		$.post("getTypeList", {}, function(list) {
			alert(JSON.stringify(list));
			for ( var i in list) {
				$("[name='tid']").append(
						"<option value='"+list[i].tid+"'>" + list[i].tname
								+ "</option>");
			}
		}, "json");
	})
	function add() {
		$.post("add", $("form").serialize(), function(obj) {
			if (obj) {
				alert("添加成功！");
				location.href = "list";
			} else {
				alert("添加失败！");
			}
		}, "json");
	}
</script>
</head>
<body>
	<form action="#" method="post">
		<table>
			<tr>
				<td>植物名称：</td>
				<td><input type="text" name="fname" /></td>
			</tr>
			<tr>
				<td>植物描述：</td>
				<td><input type="text" name="fdesc" /></td>
			</tr>
			<tr>
				<td>植物类别：</td>
				<td><select name="tid">
						<option value="0">===请选择类别===</option>
				</select></td>
			</tr>
			<tr>
				<td colspan="2"><input type="button" value="添加" onclick="add()" /></td>
			</tr>
		</table>
	</form>
</body>
</html>