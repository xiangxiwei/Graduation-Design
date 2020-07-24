<%@ page language="java" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="UTF-8">
		<title>首页</title>
		<link rel="stylesheet" href="css/zui.min.css">
		<script src="js/jquery.min.js"></script>
		<script src="js/zui.min.js"></script>
		<style type="text/css">
			.div1 {
				position: absolute;
				left: 350px;
				top: 150px;
				border-radius: 5px 5px 5px 5px;
			}
			
			.div2 {
				position: absolute;
				left: 350px;
				top: 100px;
			}
			
			.div3 {
				position: absolute;
				right: 80px;
				top: 15px;
				font-size: 15px;
			}
		</style>
	</head>

	<body>
		<div style="width: auto; height: 58px; text-align: center; font-size: 30px; background-color: #0398E0; padding-top: 8px; border-radius: 5px 5px 5px 5px;">工资管理系统</div>

		<div class="dropdown dropdown-hover" style="position: absolute; right: 80px; top: 0px; font-size: 15px;">
			<button class="btn" type="button" data-toggle="dropdown" style="width: 160px; height: 58px; background-color: #0398E0;">
			管 理 员&nbsp&nbsp&nbsp<span class="caret"></span>
		</button>
			<ul class="dropdown-menu">
				<li>
					<a href="###">关于系统</a>
				</li>
				<li>
					<a href="passwordEdit.jsp">修改密码</a>
				</li>
				<li>
					<a href="index.jsp">退出</a>
				</li>
			</ul>
		</div>

		<nav class="menu" data-ride="menu" style="width: 230px; position: absolute; top: 110px;">
			<ul id="treeMenu" class="tree tree-menu" data-ride="tree">
				<li class="active">
					<a href="show.jsp"><strong>首页</strong></a>
				</li>
				<li>
					<a href="#"><strong><i class="icon icon-user"></i>&nbsp&nbsp&nbsp人员管理</strong></a>
					<ul>
						<li>
							<a href="user.do?action=list">人员信息管理</a>
						</li>
						<li>
							<a href="userAdd.jsp">添加人员信息</a>
						</li>

					</ul>
				</li>
				<li>
					<a href="#"><strong><i class="icon icon-dollar"></i>&nbsp&nbsp&nbsp工资管理</strong></a>
					<ul>
						<li>
							<a href="salary.do?action=list">人员工资管理</a>
						</li>
						<li>
							<a href="salaryAdd.jsp">添加工资单</a>
						</li>

					</ul>
				</li>

				<li>
					<a href="#"><strong><i class="icon icon-flag"></i>&nbsp&nbsp&nbsp活动管理</strong></a>
					<ul>
						<li>
							<a href="activity.do?action=list">活动信息管理</a>
						</li>
						<li>
							<a href="activityAdd.jsp">添加活动信息</a>
						</li>

					</ul>
				</li>

			</ul>
		</nav>
		<div class="div1" style="border: 1px solid #B3B3B3; width: 1100px; height: 560px; text-align: center;">
			<h1>欢迎进入本系统 !</h1>

		</div>
		<div class="div2">
			<h4>
			<i class="icon icon-map-marker"></i>&nbsp当前位置 :
			&nbsp&nbsp&nbsp&nbsp首页
		</h4>
		</div>

	</body>

</html>