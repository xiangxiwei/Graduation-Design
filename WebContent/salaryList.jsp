<%@ page language="java" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<title>人员工资管理</title>
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
		<caption>工资信息列表</caption>

		<tr>
			<td>工资号</td>
			<td>员工编号</td>
			<td>员工姓名</td>
			<td>年份</td>
			<td>月份</td>
			<td>基本工资</td>
			<td>加班工资</td>
			<td>出差补助</td>
			<td>应发工资</td>
			<td>考勤扣除</td>
			<td>请假扣除</td>
			<td>扣税</td>
			<td>应减工资</td>
			<td>实际工资</td>
			<td>操作</td>

		</tr>
		<c:forEach items="${salaryList}" var="u" varStatus="st">
			<tr>
				<td>${u.salaryId }</td>
				<td>${u.employeeId }</td>
				<td>${u.name }</td>
				<td>${u.year }</td>
				<td>${u.month }</td>
				<td>${u.basicWage }</td>
				<td>${u.overtimeWage }</td>
				<td>${u.trafficWage }</td>
				<td>${u.totalWage }</td>
				<td>${u.kaoqinReduce }</td>
				<td>${u.secureReduce }</td>
				<td>${u.taxReduce }</td>
				<td>${u.totalReduce }</td>
				<td>${u.realWage }</td>
				<td><a href="salary.do?action=editview&salaryId=${u.salaryId }"><input
						type="button" value="修改" /></a> <a
					href="salary.do?action=delete&salaryId=${u.salaryId }"><input
						type="button" value="删除" /></a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>