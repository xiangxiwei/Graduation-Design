<%@ page language="java" contentType="text/html"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>修改密码</title>
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

	<form action="index.s?action=editsave" method="post">
		<table align="center">
			<tr>
				<td>账号</td>
				<td><input type="text" name="AdminName" 
					value="${admin.AdminName}"  />
			</tr>
			<tr>
				<td>密码</td>
				<td><input type="text" name="password" value="${admin.password }" /></td>

			</tr>

			<tr>
				<td colspan="2"><input type="submit" value="保存" />|||<input
					type="reset" value="重置" /></td>
			</tr>

		</table>
	</form>
</body>
</html>