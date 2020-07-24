<%@ page language="java" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>首页</title>
<link rel="stylesheet" href="css/zui-theme.css" />
<link rel="stylesheet" href="css/zui-theme.min.css" />
<link rel="stylesheet" href="css/zui.css" />
<link rel="stylesheet" href="css/zui.lite.css" />
<link rel="stylesheet" href="css/zui.lite.min.css" />
<link rel="stylesheet" href="css/zui.min.css" />
<style type="text/css">

.body {
	background: url(image/bg-img1.jpg);
	background-size: cover;
}

input:hover {
	border: 1.5px solid #66B3FF;
}
</style>
</head>
<body class="body">
	<div class="panel panel-primary"
		style="position: absolute; width: 350px; top: 30%; right: 40%; box-shadow: 10px 10px 5px #888888; height: 270px">
		<div class="panel-heading" align="center">
			<h1 class="panel-title">工资管理系统</h1>
		</div>

		<div class="panel-body">
			<form class="form-horizontal" action="index.s?action=list" method="post">
				<div class="form-group">
					<label for="exampleInputAccount1">账号:</label> <input type="text"
						class="form-control" id="exampleInputAccount1" name="AdminName"
						placeholder="电子邮件/手机号/用户名" required>
				</div>
				<div class="form-group">
					<label for="exampleInputPassword1">密码:</label> <input
						type="password" class="form-control" id="exampleInputPassword1"
						name="password" placeholder="" required>
				</div>
				<button type="submit" class="btn btn-primary">登录</button>
				<a href="adminAdd.jsp">
				<input type="button" class="btn btn-primary" value="注册	">
				</a>
			</form>
		</div>
	</div>
</body>
</html>