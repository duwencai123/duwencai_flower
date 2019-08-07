<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %> 
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>           
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath()%>/resource/css/css.css" rel="stylesheet">
<script type="text/javascript" src="<%=request.getContextPath() %>/resource/My97DatePicker/WdatePicker.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/resource/js/jquery-3.2.1.js"></script>
<script type="text/javascript"  src="<%=request.getContextPath() %>/resource/js/jquery.validate.js"></script> 
	 
<script type="text/javascript">
	function qx() {
		$("[name='ck']").prop("checked",true);
	}
	function qbx() {
		$("[name='ck']").prop("checked",false);
	}
	function fx() {
		$("[name='ck']").each(function() {
			this.checked = !this.checked;
		})
	}
	//删除
	function del(fid) {
		
		if (confirm("确定要删除ID为："+fid+"的数据吗？")) {
			$.post(
					"del",
					{fid:fid},
					function(obj) {
						if (obj) {
							alert("删除成功！");
							location.href = "list";
						}else {
							alert("删除失败！");
						}
					},
					"json"
			);
		}
		
	}
	
	function delAll() {
		
		var fid = $("[name='ck']:checked").map(function() {
			return this.value;
		}).get().join();
		if (fid.length>0) {
			del(fid);
		}else {
			alert("请至少选择一条要删除的数据！");
		}
		
		
	}
	
	//添加
	function toAdd() {
		location.href = "toAdd";
		  
	}
	
	//修改
	function toUpdate(fid) {
		location.href = "toUpdate?fid="+fid;
	}
	
	function toDetailed(fid) {
		location.href = "toDetailed?fid="+fid;
	}
</script>
</head>
<body>
<form action="list" method="post">
	<table>
		<tr>
			<td>
				鲜花名称：<input type="text" name="fname" value="${fname }"/>
				<input type="submit" value="查询"/>
			</td>
		</tr>
	</table>
</form>
	<table>
		<tr>
			<td>
				<input type="button" value="全选" onclick="qx()"/>
				<input type="button" value="全不选" onclick="qbx()"/>
				<input type="button" value="反选" onclick="fx()"/>
			</td>
			<td>序号</td>
			<td>植物名称</td>
			<td>描述</td>
			<td>类别</td>
			<td>
				操作<input type="button" value="添加" onclick="toAdd()"/>
				 <input type="button" value="批量删除" onclick="delAll()"/>
			</td>
		</tr>
		<c:forEach items="${list }" var="f">
			<tr>
				<td>
					<input type="checkbox" name="ck" value="${f.fid }"/>
				</td>
				<td>${f.fid }</td>
				<td>${f.fname }</td>
				<td>${f.fdesc }</td>
				<td>${f.tname }</td>
				<td>
					<input type="button" value="修改" onclick="toUpdate(${f.fid})"/>
					<input type="button" value="删除" onclick="del(${f.fid})"/>
					<input type="button" value="查看详情" onclick="toDetailed(${f.fid})"/>
				</td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="11">${fenye }</td>
		</tr>
	</table>
</body>
</html>