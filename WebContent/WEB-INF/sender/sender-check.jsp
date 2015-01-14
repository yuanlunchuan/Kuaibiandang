<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<link href="${pageContext.request.contextPath}/admin/style/basic.css"
	rel="stylesheet">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/admin/style/management-basic/m-basic.css">
<link
	href="${pageContext.request.contextPath}/admin/style/management-basic/server-basic.css"
	rel="stylesheet">
<jsp:include page="../template/navbar.jsp"></jsp:include>
<div id="main">
	<div class="content">
		<div class="widget-title">
			<span class="black-title">待审核</span>
		</div>
		<div class="main-content">
			<div class="avatar">
				<img
					src="${pageContext.request.contextPath}/admin/img/courier/hand-card1.jpg">
			</div>

			<div class="content_information">
				<ul>
					<li>姓名：曹磊</li>
					<li>性别：男</li>
					<li>手机号码：13076294721</li>
					<li>注册信息：<a href="#">点击查看详情</a></li>
					<li>提交注册时间：2014-7-12</li>
				</ul>
			</div>
			<div class="check_button">
				<ul>
					<li>
						<button class="btn btn-success">审核通过</button>
					</li>
					<li>
						<button class="btn btn-danger">审核失败</button>
					</li>
				</ul>
			</div>
		</div>
		<hr style="clear: both">

		<div class="main-content">
			<div class="avatar">
				<img
					src="${pageContext.request.contextPath}/admin/img/courier/hand-card2.jpg">
			</div>

			<div class="content_information">
				<ul>
					<li>姓名：白凯</li>
					<li>性别：男</li>
					<li>手机号码：18012352812</li>
					<li>注册信息：<a href="#">点击查看详情</a></li>
					<li>提交注册时间：2014-7-12</li>
				</ul>
			</div>
			<div class="check_button">
				<ul>
					<li>
						<button class="btn btn-success">审核通过</button>
					</li>
					<li>
						<button class="btn btn-danger">审核失败</button>
					</li>
				</ul>
			</div>
		</div>
		<hr style="clear: both">

		<div class="main-content">
			<div class="avatar">
				<img
					src="${pageContext.request.contextPath}/admin/img/courier/hand-card3.jpg">
			</div>

			<div class="content_information">
				<ul>
					<li>姓名：包含露</li>
					<li>性别：女</li>
					<li>手机号码：18393728422</li>
					<li>注册信息：<a href="#">点击查看详情</a></li>
					<li>提交注册时间：2014-7-11</li>
				</ul>
			</div>
			<div class="check_button">
				<ul>
					<li>
						<button class="btn btn-success">审核通过</button>
					</li>
					<li>
						<button class="btn btn-danger">审核失败</button>
					</li>
				</ul>
			</div>
		</div>
		<hr style="clear: both">

		<div class="main-content">
			<div class="avatar">
				<img
					src="${pageContext.request.contextPath}/admin/img/courier/hand-card4.jpg">
			</div>

			<div class="content_information">
				<ul>
					<li>姓名：鲍国栋</li>
					<li>性别：男</li>
					<li>手机号码：13587212352</li>
					<li>注册信息：<a href="#">点击查看详情</a></li>
					<li>提交注册时间：2014-7-11</li>
				</ul>
			</div>
			<div class="check_button">
				<ul>
					<li>
						<button class="btn btn-success">审核通过</button>
					</li>
					<li>
						<button class="btn btn-danger">审核失败</button>
					</li>
				</ul>
			</div>
		</div>
		<hr style="clear: both">
		<div class="paging">
			<ul class="pagination">
				<li><a href="#">&laquo;</a></li>
				<li><a href="#">1</a></li>
				<li><a href="#">2</a></li>
				<li><a href="#">3</a></li>
				<li><a href="#">4</a></li>
				<li><a href="#">5</a></li>
				<li><a href="#">&raquo;</a></li>
			</ul>
		</div>
	</div>
</div>

<script type="text/javascript">
	window.onload = function() {
		document.getElementById('sender').click();
		document.getElementById('csender').className = "active";
	}
</script>