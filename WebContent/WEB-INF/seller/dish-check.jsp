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
			<img src="${pageContext.request.contextPath}/admin/img/dish/dish-demo2.jpg">
		</div>

		<div class="content_information">
			<ul>
				<li>菜品名称：土豆卤肉盖浇饭</li>
				<li>商家:<a href="seller-detail.html">曹操外卖</a></li>
				<li>提交时间：2014-7-11 14：35</li>
				<li>类别：
					<div class="label label-inverse">盖浇饭</div>
				</li>
				<li><p>
						<a title="经纬度（104.191165,30.655978）" rel="tooltip">地址：成都市成洛大道十陵上街1号</a>
					</p></li>
				<li>菜品价格：
					<div class="label label-success">15元</div>
				</li>
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
			<img src="${pageContext.request.contextPath}/admin/img/dish/dish-demo4.jpg">
		</div>

		<div class="content_information">
			<ul>
				<li>菜品名称：卤肉套餐</li>
				<li>商家:<a href="seller-detail.html">曹操外卖</a></li>
				<li>提交时间：2014-7-11 14：40</li>
				<li>类别：
					<div class="label label-important">套餐</div>
				</li>
				<li><p>
						<a title="经纬度（104.191165,30.655978）" rel="tooltip">地址：成都市成洛大道十陵上街1号</a>
					</p></li>
				<li>菜品价格：
					<div class="label label-success">20元</div>
				</li>
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
			<img src="${pageContext.request.contextPath}/admin/img/dish/dish-demo1.jpg">
		</div>

		<div class="content_information">
			<ul>
				<li>菜品名称：水煮肉片盖浇饭</li>
				<li>商家:<a href="seller-detail.html">食尚中式快餐</a></li>
				<li>提交时间：2014-7-11 15：30</li>
				<li>类别：
					<div class="label label-inverse">盖浇饭</div>
				</li>
				<li><p>
						<a title="经纬度（104.194933,30.654417 ）" rel="tooltip">地址：成都市成洛大道十陵上街1号
						</a>
					</p></li>
				<li>菜品价格：
					<div class="label label-success">18元</div>
				</li>
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
			<img src="${pageContext.request.contextPath}/admin/img/dish/dish-demo5.jpg">
		</div>

		<div class="content_information">
			<ul>
				<li>菜品名称：鱼香肉丝炒饭</li>
				<li>商家:<a href="seller-detail.html">宜宾燃面</a></li>
				<li>提交时间：2014-7-11 15：50</li>
				<li>类别：
					<div class="label label-info">炒饭</div>
				</li>
				<li><p>
						<a title="经纬度（104.191215,30.655784 ）" rel="tooltip">地址：成都市成洛大道十陵上街1号</a>
					</p></li>
				<li>菜品价格：
					<div class="label label-success">15元</div>
				</li>
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
	<jsp:include page="../template/footer.jsp"></jsp:include>
</div>
<script type="text/javascript">
	window.onload = function() {
		document.getElementById('seller').click();
		document.getElementById('dseller').className = "active";
	}
</script>
