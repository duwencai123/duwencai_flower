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
<!-- Bootstrap -->
<!-- <link rel="stylesheet" href="/resource/css/bootstrap.min.css"> -->
 
<script type="text/javascript"
	src="<%=request.getContextPath() %>/resource/My97DatePicker/WdatePicker.js"></script>
<script type="text/javascript"
	src="<%=request.getContextPath() %>/resource/js/jquery-3.2.1.js"></script>
<script type="text/javascript"
	src="<%=request.getContextPath() %>/resource/js/jquery.validate.js"></script>
<script type="text/javascript">
	//从model获取排序方式.如果不是asc则使用desc
	var orderByMethod = '${urlsVO.orderByMethod == "asc"?"desc":"asc"}';
	function myOrder(orderByColumn) {
		location.href = "/selects?orderByColumn="+orderByColumn+"&orderByMethod="+orderByMethod;
	}
	//改变状态
	/* function updateStatus(id,status) {
		$.post(
				"/update",
				{id:id,status:status},
				function(obj) {
					if (obj) {
						alert("操作成功");
						location.reload();
					}
				},
				"json"
		);
	} */
</script>
</head>
<body>
	<%-- <form action="/selects" method="post">
		影片名称：<input type="text" name="name" value="${movieVO.name }"/><br><br>
		导      演：<input type="text" name ="actor" value="${movieVO.actor }"/><br><br>
		年代：<input type="text" name="year" value="${movieVO.year }"/><br><br>
		上映时间：<input type="text" name="uptimeStart" value="${movieVO.uptimeStart }" onclick="WdatePicker()"/>--
				<input type="text" name="uptimeEnd" value="${movieVO.uptimeEnd }" onclick="WdatePicker()"/><br><br>
		价格：<input type="text" name="priceStart" value="${movieVO.priceStart }"  />--
				<input type="text" name="priceEnd" value="${movieVO.priceEnd }"  /><br><br>
		时长：<input type="text" name="durationStart" value="${movieVO.durationStart }"  />--
		<input type="text" name="durationEnd" value="${movieVO.durationEnd }"  />
		<input  type="submit" value="查询"/>
	</form> --%>
	<table >
		<tr>
			<td>序号</td>
			<td>url</td>
			<td><a href="javascript:myOrder('date')"><input type="button" value="日期"/></a></td>
			<td><a href="javascript:myOrder('num')"><input type="button" value="url编号"/></a></td>
		 	<td>操作</td>
		</tr>
		<c:forEach items="${urls }" var="m" varStatus="i">

			<tr>
				<td>${i.index+1 }</td>
				<td>${m.url }</td>
				<td>${m.date }</td>
				<td>${m.num }</td>
				 <td>操作</td>
			</tr>

		</c:forEach>
		  <%-- <tr>
			<td colspan="11">${fenye }</td>
		</tr>   --%>
		 
	</table>

</body>
</html>