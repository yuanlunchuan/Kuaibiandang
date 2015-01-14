<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link
	href="${pageContext.request.contextPath}/admin/style/bootstrap.css"
	rel="stylesheet">
<link
	href="${pageContext.request.contextPath}/admin/style/bootstrap-responsive.css"
	rel="stylesheet">

<link href="${pageContext.request.contextPath}/admin/style/site.css"
	rel="stylesheet">
<link href="${pageContext.request.contextPath}/admin/style/login.css"
	rel="stylesheet">
<link rel="shortcut icon"
	href="${pageContext.request.contextPath}/admin/img/favicon/favicon.png">

<title>请登录</title>
</head>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<base href=" <%=basePath%>">
<body>

	<div class="navbar navbar-fixed-top">
		<div class="navbar-inner">
			<div class="container">
				<a class="btn btn-navbar" data-toggle="collapse"
					data-target=".nav-collapse"> <span class="icon-bar"></span> <span
					class="icon-bar"></span> <span class="icon-bar"></span>
				</a> <a class="brand" href="./">快便当后台管理登陆</a>
			</div>
		</div>

	</div>


	<div id="login-container">
		<div id="login-header">
			<h3>请登录</h3>
		</div>
		<div id="login-content" class="clearfix">
			<form action="admin/login">
				<fieldset>
					<div class="control-group">
						<label class="control-label" for="username">账号</label>
						<div class="controls">
						<s:fielderror fieldName="name"></s:fielderror>
							<input type="text" name="admin.admin_phone" id="username" />
						</div>
					</div>
					<div class="control-group">
						<label class="control-label" for="password">密码</label>
						<div class="controls">
						<s:fielderror fieldName="password"></s:fielderror>
							<input type="password" name="admin.admin_password" id="password" />
						</div>
					</div>
				</fieldset>

				<div id="login-button">
					<button type="submit" class="btn btn-success btn-large">
						登录</button>
				</div>
				
				<div id="message"><s:property value="message" /></div> 
			</form>
		</div>

	</div>
	<%-- <s:form action="admin/login" method="post">
		<s:fielderror fieldName="name"></s:fielderror>
		用户名:<input type="text" name="admin.admin_phone" />
		<br />
		<s:fielderror fieldName="password"></s:fielderror>
		密码：<input type="password" name="admin.admin_password" />
		<br />
		<br />
		<button>提交</button>
	</s:form>
	<br />
	--%>
	<script src="${pageContext.request.contextPath}/zui/assets/jquery.js"></script>
	<script type="text/javascript">
		window.onload = function(){
			var username = document.getElementById('username');
			var password = document.getElementById('password');
			username.value = '123';
			password.value = '123';
		}
	</script>
</body>
</html>