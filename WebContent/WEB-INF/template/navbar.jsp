<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title>快便当后台管理系统</title>

<link href="${pageContext.request.contextPath}/zui/docs/css/zui.min.css"
	rel="stylesheet">
<link href="${pageContext.request.contextPath}/zui/docs/css/doc.css"
	rel="stylesheet">
<link rel="shortcut icon"
	href="${pageContext.request.contextPath}/admin/img/favicon/favicon.png">

</head>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<base href=" <%=basePath%>
	">
<body>
	<header> <nav id="navbar"
		class="navbar navbar-inverse navbar-fixed-left navbar-collapsed"
		role="navigation">
	<div class="navbar-header">
		<button type="button" class="navbar-toggle" data-toggle="collapse"
			data-target="#navbar-collapse">
			<span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span>
			<span class="icon-bar"></span> <span class="icon-bar"></span>
		</button>
		<a class="navbar-brand" href="/zui">快便当</a>
	</div>
	<div class="collapse navbar-collapse" id="navbar-collapse">
		<ul class="nav navbar-nav collapsed">
			<li id="seller" class="nav-heading">商家管理</li>
			<li id="wseller"><a href="admin/business">查看商家</a></li>
			<li id="cseller"><a href="admin/business?status=0">商家审核</a></li>
			<li id="dseller"><a href="admin/dishCheck">菜品审核</a></li>
			<li id="bseller"><a href="admin/businessBlack?roleid=1">黑名单</a></li>
			<li id="service-seller"><a href="admin/TODO">服务费设置</a></li>
		</ul>
		<ul class="nav navbar-nav collapsed">
			<li id="sender"class="nav-heading">送餐员管理</li>
			<li id="wsender"><a href="admin/sender">查看送餐员</a></li>
			<li id="csender"><a href="admin/sender?sender_status=0">送餐员审核</a></li>
			<li id="bsender"><a href="admin/senderBlack?roleid=2">黑名单</a></li>
			<li id="bsender"><a href="admin/TODO">保证金设置</a></li>
		</ul>
		<ul class="nav navbar-nav collapsed">
			<li id="user" class="nav-heading">消费者管理</li>
			<li id="wuser"><a href="admin/user">查看消费者</a></li>
			<li id="buser"><a href="admin/userBlack?roleid=3">黑名单</a></li>
		</ul>

		<ul class="nav navbar-nav collapsed">
			<li class="nav-heading">财务管理</li>
		</ul>
	</div>
	</nav> </header>
	
	<script src="${pageContext.request.contextPath}/zui/assets/jquery.js"></script>
	<script src="${pageContext.request.contextPath}/zui/dist/js/zui.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/zui/assets/google-code-prettify/prettify.js"></script>
	<script src="${pageContext.request.contextPath}/zui/docs/js/doc.js"></script>
</body>
</html>