<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<jsp:include page="../template/navbar.jsp"></jsp:include>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/admin/style/basic.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/admin/style/customer-management/customer-detail.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/admin/style/font-awesome.css">
<div id="main">
	<div class="content">
		<div class="detail-message">
			<div class="avatar">
				<img src="${pageContext.request.contextPath}/admin/img/avatar/avatar-demo.jpg" />
			</div>
			<p>姓名：<s:property value="sender.sender_name" /></p>

			<p>手机号码：<s:property value="sender.sender_phonenumber" /></p>

			<p>注册时间:<s:date name="sender.sender_registertime" format="MM/dd/yy hh:mm:ss"/></p>


			<p>
				注册信息:<a href="#">点击查看详情</a>
			</p>

			<p>
				等级:<span class="label label-info"><s:property value="sender.sender_level" /></span>
			</p>

			<p>
				<a href="#"><div class="icon-user"></div>私信他</a>
			</p>

		</div>

		<div class="order">
			<div class="widget-title">
				<span class="order-title">他的历史订单</span> <span class="icon-search"></span>
				<input type="text" class="form-control" style="float: right"
					placeholder="搜索订单">
			</div>
			<div class="order-table">
				<table class="table table-striped">
					<thead>
						<tr>
							<th>订单编号</th>
							<th>商家</th>
							<th>抢单时间</th>
							<th>用户确认时间</th>
							<th>商家确认时间</th>
							<th>金额</th>
							<th>报酬</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>IS12376</td>
							<td>老麻抄手</td>
							<td>2014-6-28，11：30</td>
							<td>2014-6-28，11：50</td>
							<td>2014-6-28，12：10</td>
							<td>35元</td>
							<td>5元</td>

						</tr>
						<tr>
							<td>IS13386</td>
							<td>食尚中式快餐</td>
							<td>2014-6-27，11：30</td>
							<td>2014-6-27，11：50</td>
							<td>2014-6-27，12：10</td>
							<td>40元</td>
							<td>6元</td>

						</tr>
						<tr>
							<td>IS11234</td>
							<td>宜宾燃面</td>
							<td>2014-6-27，12：30</td>
							<td>2014-6-27，12：50</td>
							<td>2014-6-27，13：10</td>
							<td>20元</td>
							<td>2元</td>

						</tr>
						<tr>
							<td>IS15636</td>
							<td>贵阳米粉</td>
							<td>2014-6-26，11：30</td>
							<td>2014-6-26，11：50</td>
							<td>2014-6-26，12：10</td>
							<td>25元</td>
							<td>3元</td>
						</tr>
					</tbody>

				</table>
				<div class="paging">
					<ul class="pagination">
						<li><a href="#">&laquo;</a></li>
						<li><a href="#">1</a></li>
						<li><a href="#">2</a></li>
						<li><a href="#">3</a></li>
						<li><a href="#">&raquo;</a></li>
					</ul>
				</div>
			</div>
		</div>

		<div class="order">
			<div class="widget-title">
				<span class="order-title">他的评价</span> <span class="icon-search"></span>
				<input type="text" class="form-control" style="float: right"
					placeholder="搜索">
			</div>
			<div class="order-table">
				<table class="table table-striped">
					<thead>
						<tr>
							<th>订单编号</th>
							<th>评价对象</th>
							<th>对象角色</th>
							<th>评价分数</th>
							<th>评价内容</th>
							<th>评价时间</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>IS12376</td>
							<td>老麻抄手</td>
							<td>商家</td>
							<td>4.5</td>
							<td><p>
									<a title="商家确认比较及时，给的报酬合理" rel="tooltip">商家确认比较及时...</a>
								</p></td>
							<td>2014-7-1，12：45</td>
						</tr>
						<tr>
							<td>IS12626</td>
							<td>食尚中式快餐</td>
							<td>商家</td>
							<td>4.5</td>
							<td><p>
									<a title="商家确认比较及时，给的报酬合理" rel="tooltip">商家确认比较及时...</a>
								</p></td>
							<td>2014-7-1，12：45</td>
						</tr>
						<tr>
							<td>IS12341</td>
							<td>宜宾燃面</td>
							<td>商家</td>
							<td>4.6</td>
							<td><p>
									<a title="商家确认比较及时，给的报酬合理" rel="tooltip">商家确认比较及时...</a>
								</p></td>
							<td>2014-7-1，12：45</td>
						</tr>
						<tr>
							<td>IS45212</td>
							<td>贵阳米粉</td>
							<td>商家</td>
							<td>4.8</td>
							<td><p>
									<a title="商家确认比较及时，给的报酬合理" rel="tooltip">商家确认比较及时...</a>
								</p></td>
							<td>2014-7-1，12：45</td>
						</tr>
					</tbody>

				</table>
				<div class="paging">
					<ul class="pagination">
						<li><a href="#">&laquo;</a></li>
						<li><a href="#">1</a></li>
						<li><a href="#">2</a></li>
						<li><a href="#">3</a></li>
						<li><a href="#">&raquo;</a></li>
					</ul>
				</div>
			</div>
		</div>

		<div class="order">
			<div class="widget-title">
				<span class="order-title">商家/用户对他的评价</span> <span
					class="icon-search"></span> <input type="text" class="form-control"
					style="float: right" placeholder="搜索">
			</div>
			<div class="order-table">
				<table class="table table-striped">
					<thead>
						<tr>
							<th>订单编号</th>
							<th>评价对象</th>
							<th>对象角色</th>
							<th>评价内容</th>
							<th>评价分数</th>
							<th>评价时间</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>IS12123</td>
							<td>老麻抄手</td>
							<td>商家</td>
							<td><p>
									<a title="用户挺配合，没有出错" rel="tooltip">用户挺配合.....</a>
								</p></td>
							<td>5</td>
							<td>2014-7-1，12：45</td>
						</tr>
						<tr>
							<td>IS12524</td>
							<td>食尚中式快餐</td>
							<td>商家</td>
							<td><p>
									<a title="用户挺配合，没有出错" rel="tooltip">用户挺配合.....</a>
								</p></td>
							<td>4.6</td>
							<td>2014-7-1，12：45</td>
						</tr>
						<tr>
							<td>IS12321</td>
							<td>宜宾燃面</td>
							<td>商家</td>
							<td><p>
									<a title="用户挺配合，没有出错" rel="tooltip">用户挺配合.....</a>
								</p></td>
							<td>4.8</td>
							<td>2014-7-1，12：45</td>
						</tr>
						<tr>
							<td>IS19212</td>
							<td>贵阳米粉</td>
							<td>商家</td>
							<td><p>
									<a title="用户挺配合，没有出错" rel="tooltip">用户挺配合.....</a>
								</p></td>
							<td>5</td>
							<td>2014-7-1，12：45</td>
						</tr>
					</tbody>

				</table>
				<div class="paging">
					<ul class="pagination">
						<li><a href="#">&laquo;</a></li>
						<li><a href="#">1</a></li>
						<li><a href="#">2</a></li>
						<li><a href="#">3</a></li>
						<li><a href="#">&raquo;</a></li>
					</ul>
				</div>
			</div>
		</div>
	</div>

	<script>
		$("a[rel=tooltip]").tooltip();
		window.onload = function() {
			document.getElementById('sender').click();
			document.getElementById('wsender').className = "active";
		}
	</script>
</div>