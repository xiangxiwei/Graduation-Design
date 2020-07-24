<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC>
<html>
<head>
<meta charset="utf-8" />
<title>工资信息修改</title>
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
	<h3 align="center">工资信息修改</h3>

	<form action="salary.do?action=editsave" method="post">
		<table align="center">
			<tr>
				<td>工资号</td>
				<td><input type="text" name="salaryId" readonly="readonly"
					value="${salary.salaryId}" />
			</tr>
			<tr>
				<td>员工编号</td>
				<td><input type="text" name="employeeId"
					value="${salary.employeeId }" /></td>

			</tr>
			<tr>
				<td>员工姓名</td>
				<td><input type="text" name="name"
					value="${salary.name}" /></td>
			</tr>
			<tr>
				<td>年份</td>
				<td><input type="text" name="year" value="${salary.year}" /></td>
			</tr>
			<tr>
				<td>月份</td>
				<td><input type="text" name="month" value="${salary.month}" /></td>
			</tr>
			<tr>
				<td>基本工资</td>
				<td><input type="text" name="basicWage"
					value="${salary.basicWage}" /></td>
			</tr>
			<tr>
				<td>加班工资</td>
				<td><input type="text" name="overtimeWage"
					value="${salary.overtimeWage}" /></td>
			</tr>

			<tr>
				<td>出差补助</td>
				<td><input type="text" name="trafficWage"
					value="${salary.trafficWage}" /></td>
			</tr>
			<tr>
				<td>应发工资</td>
				<td><input type="text" name="totalWage"
					value="${salary.totalWage}" /></td>
			</tr>
			<tr>
				<td>考勤扣除</td>
				<td><input type="text" name="kaoqinReduce"
					value="${salary.kaoqinReduce}" /></td>
			</tr>
			<tr>
				<td>请假扣除</td>
				<td><input type="text" name="secureReduce"
					value="${salary.secureReduce}" /></td>
			</tr>

			<tr>
				<td>扣税</td>
				<td><input type="text" name="taxReduce"
					value="${salary.taxReduce}" /></td>
			</tr>
			<tr>
				<td>应减工资</td>
				<td><input type="text" name="totalReduce"
					value="${salary.totalReduce}" /></td>
			</tr>
			<tr>
				<td>实际工资</td>
				<td><input type="text" name="realWage"
					value="${salary.realWage}" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="保存" /><input
					type="reset" value="重置" /></td>
			</tr>

		</table>
	</form>
</body>
</html>