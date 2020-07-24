<%@ page language="java" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>人员信息管理</title>
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
		<caption>人员信息列表</caption>
	
		<tr>
			<td>员工编号</td>
			<td>员工姓名</td>
			<td>身份证号码</td>
			<td>民族</td>
			<td>性别</td>
			<td>生日</td>
			<td>毕业学校</td>
			<td>学历</td>
			<td>部门</td>
			<td>电话</td>
			<td>职称</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${userList}" var="u" varStatus="st">
			<tr>

				<td>${u.employeeId}</td>
				<td>${u.name }</td>
				<td>${u.cardNumber }</td>
				<td>${u.nation }</td>
				<td>${u.sex }</td>
				<td>${u.birthday }</td>
				<td>${u.graduateSchool }</td>
				<td>${u.schoolRecord }</td>
				<td>${u.department }</td>
				<td>${u.telephone }</td>
				<td>${u.positionName }</td>
				<td><a
					href="user.do?action=editview&employeeId=${u.employeeId }"><input
						type="button" value="修改" /></a> <a
					href="user.do?action=delete&employeeId=${u.employeeId }"><input
						type="button" value="删除" /></a></td>

			</tr>
		</c:forEach>
	</table>
</body>
</html>