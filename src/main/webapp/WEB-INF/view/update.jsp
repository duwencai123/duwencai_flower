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
		$.post("getFlowerById", {fid:$("[name='fid']").val()}, function(list) {
			alert(JSON.stringify(list));
			
			$("[name='fname']").val(list.fname);
			$("[name='fdesc']").val(list.fdesc);
			$("[name='tid']").val(list.tid);
			/* for ( var i in list) {
				$("[name='tid']").append(
						"<option value='"+list[i].tid+"'>" + list[i].tname
								+ "</option>");
			} */
		}, "json");
	})  
	function update() {
		$.post("update", $("form").serialize(), function(obj) {
			if (obj) {
				alert("修改成功！");
				location.href = "list";
			} else {
				alert("修改失败！");
			}
		}, "json");
	}
</script>
</head>
<body>
	<form action="#" method="post">
		<table>
			<tr>
				<td>序号：</td>
				<td><input type="text" name="fid" value="${fid }" readonly="readonly"/></td>
			</tr>
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
						<c:forEach items="${typeList }" var="t">
							<option value="${t.tid }">${t.tname }</option>
						</c:forEach>
				</select></td>
			</tr>
			<tr>
				<td colspan="2"><input type="button" value="修改" onclick="update()" /></td>
			</tr>
		</table>
	</form>
</body>
</html>