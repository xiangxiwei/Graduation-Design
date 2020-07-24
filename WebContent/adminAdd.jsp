<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>注册账号</title>
<style type="text/css">
</style>
</head>
<body>
	<form action="index.s?action=addAdmin" method="post">
		<table>
			<caption>注册账号</caption>
			<tr>
				<th>用户名：</th>
				<th><input type="text" name="AdminName"  required="required"/></th>
			</tr>

			<tr>
				<th>&nbsp&nbsp密码:</th>
				<td><input type="password" name="password" required="required"/></td>
			</tr>
			<tr>
				<input type="submit" value="确定"  />
			</tr>
		</table>
	</form>
</body>
</html>