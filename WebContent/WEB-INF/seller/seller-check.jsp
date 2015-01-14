<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<jsp:include page="../template/navbar.jsp"></jsp:include>
<link
	href="${pageContext.request.contextPath}/admin/style/management-basic/m-basic.css"
	rel="stylesheet">
<link
	href="${pageContext.request.contextPath}/admin/style/management-basic/server-basic.css"
	rel="stylesheet">
	<link
	href="${pageContext.request.contextPath}/admin/style/seller-management/seller-check.css"
	rel="stylesheet">
<div id="main">
	<div class="widget-title">
		<span style="float: right" class="icon-search icon-white"></span> <input
			type="text" class="form-control" placeholder="搜索商家"> <span
			class="black-title">待审核</span>
	</div>
	<div class="main-content">
		<div class="avatar">
			<img
				src="${pageContext.request.contextPath}/admin/img/seller/seller_logo1.jpg">
		</div>

		<div class="content_information">
			<ul>
				<li>注册人：顾华英</li>
				<li>性别：男</li>
				<li>手机号码：13076294721</li>
				<li>商店名：面点王</li>
				<li>商家地址：
					<p>
						<a title="坐标（104.193527,30.653656）" rel="tooltip">成都龙泉驿区上街039号</a>
					</p>
				</li>
				<li>注册信息： <a href="#">点击查看详情</a>
				</li>
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
				src="${pageContext.request.contextPath}/admin/img/seller/seller_logo2.jpg">
		</div>

		<div class="content_information">
			<ul>
				<li>注册人：郭丰哲</li>
				<li>性别：男</li>
				<li>手机号码：18120368945</li>
				<li>商店名：绿岛草堂</li>
				<li>商家地址：
					<p>
						<a title="坐标（104.193209,30.653408）" rel="tooltip">成都龙泉驿区上街112号</a>
					</p>
				</li>
				<li>注册信息： <a href="#">点击查看详情</a>
				</li>
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
				src="${pageContext.request.contextPath}/admin/img/seller/seller_logo3.jpg">
		</div>

		<div class="content_information">
			<ul>
				<li>注册人：李雷</li>
				<li>性别：男</li>
				<li>手机号码：15896458762</li>
				<li>商店名：饭是纲</li>
				<li>商家地址：
					<p>
						<a title="坐标（104.193209,30.653408）" rel="tooltip">成都龙泉驿区上街089号</a>
					</p>
				</li>
				<li>注册信息： <a href="#">点击查看详情</a>
				</li>
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
				src="${pageContext.request.contextPath}/admin/img/seller/seller_logo4.jpg">
		</div>

		<div class="content_information">
			<ul>
				<li>注册人：官瑞源</li>
				<li>性别：男</li>
				<li>手机号码：15326987456</li>
				<li>商店名：雍雅山房</li>
				<li>商家地址：
					<p>
						<a title="坐标（104.193209,30.653408）" rel="tooltip">成都龙泉驿区上街069号</a>
					</p>
				</li>
				<li>注册信息： <a href="#">点击查看详情</a>
				</li>
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
		</div>s
	</div>
	<hr style="clear: both">

</div>
<script type="text/javascript">
	window.onload = function() {
		document.getElementById('seller').click();
		document.getElementById('cseller').className="active";
	}
</script>