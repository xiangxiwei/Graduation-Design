<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC>
<html>
<head>
<meta charset="utf-8" />
<title>人员信息修改</title>
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
	<h3 align="center">人员信息修改</h3>

	<form action="user.do?action=editsave" method="post">
		<table align="center">
			<tr>
				<td>员工编号</td>
				<td><input type="text" name="employeeId" readonly="readonly"
					value="${user.employeeId}"  />
			</tr>
			<tr>
				<td>员工姓名</td>
				<td><input type="text" name="name" value="${user.name }" /></td>

			</tr>
			<tr>
				<td>身份证号码</td>
				<td><input type="text" name="cardNumber"
					value="${user.cardNumber}" /></td>
			</tr>
			<tr>
				<td>民族</td>
				<td><input type="text" name="nation" value="${user.nation}" /></td>
			</tr>
			<tr>
				<td>性别</td>
				<td><input type="text" name="sex" value="${user.sex}" /></td>
			</tr>
			<tr>
				<td>生日</td>
				<td><input type="text" name="birthday" value="${user.birthday}" /></td>
			</tr>
			<tr>
				<td>毕业学校</td>
				<td><input type="text" name="graduateSchool"
					value="${user.graduateSchool}" /></td>
			</tr>

			<tr>
				<td>学历</td>
				<td><input type="text" name="schoolRecord"
					value="${user.schoolRecord}" /></td>
			</tr>
			<tr>
				<td>部门</td>
				<td><input type="text" name="department"
					value="${user.department}" /></td>
			</tr>
			<tr>
				<td>电话</td>
				<td><input type="text" name="telephone"
					value="${user.telephone}" /></td>
			</tr>
			<tr>
				<td>职称</td>
				<td><input type="text" name="positionName"
					value="${user.positionName}" /></td>
			</tr>

			<tr>
				<td colspan="2"><input type="submit" value="保存" />|||<input
					type="reset" value="重置" /></td>
			</tr>

		</table>
	</form>
</body>
</html>