<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title>快便当后台管理</title>

<link href="${pageContext.request.contextPath}/zui/docs/css/zui.min.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/zui/docs/css/doc.css" rel="stylesheet">
</head>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<base href=" <%=basePath%>">

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
			<li class="nav-heading">商家管理</li>
			<li><a href="seller-members.html#watch">查看商家</a></li>
			<li><a href="#">商家审核</a></li>
			<li><a href="#">黑名单</a></li>
			<li><a href="#">服务费设置</a></li>
		</ul>
		<ul class="nav navbar-nav collapsed">
			<li class="nav-heading">送餐员管理</li>
			<li><a href="seller-members.html#watch">查看送餐员</a></li>
			<li><a href="#">送餐员审核</a></li>
			<li><a href="#">黑名单</a></li>
			<li><a href="#">保证金设置</a></li>
		</ul>
		<ul class="nav navbar-nav collapsed">
			<li class="nav-heading">送餐员管理</li>
			<li><a href="#">查看用户</a></li>
			<li><a href="#">黑名单</a></li>
		</ul>

		<ul class="nav navbar-nav collapsed">
			<li class="nav-heading">财务管理</li>
		</ul>
	</div>
	</nav> </header>
	<div id="main">
	
	</div>
	<script src="${pageContext.request.contextPath}/zui/assets/jquery.js"></script>
	<script src="${pageContext.request.contextPath}/zui/dist/js/zui.min.js"></script>
	<script src="${pageContext.request.contextPath}/zui/assets/google-code-prettify/prettify.js"></script>
	<script src="${pageContext.request.contextPath}/zui/docs/js/doc.js"></script>
</body>
</html>