<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC>
<html>
<head>
<meta charset="utf-8" />
<title>活动信息修改</title>
<style>
table {
	border-collapse: collapse;
	width: 40%;
}

td {
	border: 1px solid #555;
}
</style>
</head>
<body>
	<h3 align="center">活动信息修改</h3>

	<form action="activity.do?action=editsave" method="post">
		<table align="center">
			<tr>
				<td>编号</td>
				<td><input type="text" name="leaveId" readonly="readonly"
					value="${activity.leaveId}" />
			</tr>
			<tr>
				<td>员工编号</td>
				<td><input type="text" name="employeeId" 
					value="${activity.employeeId}" />
			</tr>
			<tr>
				<td>员工姓名</td>
				<td><input type="text" name="employeeName" value="${activity.employeeName }" /></td>

			</tr>
			<tr>
				<td>日期</td>
				<td><input type="date " name="month"
					value="${activity.month}" /></td>
			</tr>
			<tr>
				<td>加班天数</td>
				<td><input type="text" name="startTime" value="${activity.startTime}" /></td>
			</tr>
			<tr>
				<td>请假天数</td>
				<td><input type="text" name="day" value="${activity.day}" /></td>
			</tr>
			<tr>
				<td>迟到次数</td>
				<td><input type="text" name="reason"
					value="${activity.reason}" /></td>
			</tr>
			<tr>
				<td>批准人</td>
				<td><input type="text" name="approvePersion"
					value="${activity.approvePersion}" /></td>
			</tr>

			<tr>
				<td colspan="2"><input type="submit" value="保存" />|||<input
					type="reset" value="重置" /></td>
			</tr>

		</table>
	</form>
</body>
</html>