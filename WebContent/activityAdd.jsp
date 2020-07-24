<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC>
<html>
<head>
<meta charset="utf-8" />
<title>添加活动信息</title>
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
	<h3 align="center">添加活动信息</h3>


	<form action="activity.do?action=addsave" method="post">
		<table align="center">
			<tr>
				<td>编号</td>
				<td><input type="text" name="leaveId" required />
			</tr>

			<tr>
				<td>员工编号</td>
				<td><input type="text" name="employeeId" /></td>
				</td>
			</tr>
			<tr>
				<td>员工姓名</td>
				<td><input type="text" name="employeeName" /></td>
			</tr>
			<tr>
				<td>日期</td>
				<td><input type="date" name="month" /></td>
			</tr>
			<tr>
				<td>加班天数</td>
				<td><input type="text" name="startTime" /></td>
			</tr>
			<tr>
				<td>请假天数</td>
				<td><input type="text" name="day" required /></td>
			</tr>
			<tr>
				<td>迟到天数</td>
				<td><input type="text" name="reason" /></td>
			</tr>

			<tr>
				<td>批准人</td>
				<td><input type="text" name="approvePersion" /></td>
			</tr>

			


			<td colspan="2" align="center"><input type="submit" value="保存" /><input
				type="reset" value="重置" /></td>
			</tr>

		</table>
	</form>
</body>
</html>