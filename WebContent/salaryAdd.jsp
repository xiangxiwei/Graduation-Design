<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC>
<html>
<head>
<meta charset="utf-8" />
<title>工资添加</title>
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
	<h3 align="center">添加工资单</h3>


	<form action="salary.do?action=addsave" method="post">
		<table align="center">
			<tr>
				<td>工资号</td>
				<td><input type="text" name="salaryId" required />
			</tr>

			<tr>
				<td>员工编号</td>
				<td><input type="text" name="employeeId" /></td>
				</td>
			</tr>
			<tr>
				<td>员工姓名</td>
				<td><input type="text" name="name" /></td>
			</tr>
			<tr>
				<td>年份</td>
				<td><input type="text" name="year" /></td>
			</tr>
			<tr>
				<td>月份</td>
				<td><input type="text" name="month" /></td>
			</tr>
			<tr>
				<td>基本工资</td>
				<td><input type="text" name="basicWage" required /></td>
			</tr>
			<tr>
				<td>加班工资</td>
				<td><input type="text" name="overtimeWage" /></td>
			</tr>

			<tr>
				<td>出差补助</td>
				<td><input type="text" name="trafficWage" /></td>
			</tr>
			<tr>
				<td>应发工资</td>
				<td><input type="text" name="totalWage" "/></td>
			</tr>
			<tr>
				<td>考勤扣除</td>
				<td><input type="text" name="kaoqinReduce" "/></td>
			</tr>
			<tr>
				<td>请假扣除</td>
				<td><input type="text" name="secureReduce" /></td>
			</tr>
			<tr>
				<td>扣税</td>
				<td><input type="text" name="taxReduce" /></td>
			</tr>
			<tr>
				<td>应减工资</td>
				<td><input type="text" name="totalReduce" /></td>
			</tr>

			<tr>
				<td>实际工资</td>
				<td><input type="text" name="realWage" /></td>
			</tr>
			


			<td colspan="2" align="center"><input type="submit" value="保存" /><input
				type="reset" value="重置" /></td>
			</tr>

		</table>
	</form>
</body>
</html>