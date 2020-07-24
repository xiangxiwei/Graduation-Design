<%@ page language="java" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<title>活动信息管理</title>
<style>
table {
	border-collapse: collapse;
	width: 80%;
	text-align: center;
}

td {
	border: 1px solid #555;
}
</style>
</head>
<body>
	<table align="center" border="1px">
		<caption>活动信息列表</caption>

		<tr>
			<td>编号</td>
			<td>员工编号</td>
			<td>员工姓名</td>
			<td>日期</td>
			<td>加班天数</td>
			<td>请假天数</td>
			<td>迟到天数</td>
			<td>批准人</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${activityList}" var="u" varStatus="st">
			<tr>
				<td>${u.leaveId }</td>
				<td>${u.employeeId }</td>
				<td>${u.employeeName }</td>
				<td>${u.month }</td>
				<td>${u.startTime }</td>
				<td>${u.day }</td>
				<td>${u.reason }</td>
				<td>${u.approvePersion }</td>
				<td><a href="activity.do?action=editview&leaveId=${u.leaveId }"><input
						type="button" value="修改" /></a> <a
					href="activity.do?action=delete&leaveId=${u.leaveId }"><input
						type="button" value="删除" /></a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>