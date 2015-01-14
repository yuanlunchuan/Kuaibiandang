<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:include page="../template/navbar.jsp"></jsp:include>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/admin/style/customer-management/customer-detail.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/admin/style/basic.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/admin/style/font-awesome.css">
<div id="main">
	<div class="content">
		<div class="detail-message">
			<div class="avatar">
				<img
					src="${pageContext.request.contextPath}/admin/img/avatar/avatar-demo.jpg" />
			</div>
				<p>
					用户名:
					<s:property value="user.user_name" />
				</p>
				<p>
					手机号码：
					<s:property value="user.user_phonenumber" />
				</p>
				<p>
					注册时间:
					<s:date name="user.user_registertime" format="MM/dd/yy hh:mm:ss" />
				</p>
				<p>最后登录时间:2014-7-11</p>
				<p>
					积分: <span class="label label-info"><s:property
							value="user.user_score " /></span>
				</p>
				<p>
					<a href="#">
						<div class="icon-user"></div> 私信他
					</a>
				</p>
		</div>

		<div class="order">
			<div class="widget-title">
				<span class="order-title">他的历史订单</span> <span class="icon-search"></span>
			</div>
			<div class="order-table">
				<table class="table table-striped">
					<thead>
						<tr>
							<th>订单编号</th>
							<th>送餐员</th>
							<th>商家</th>
							<th>份数</th>
							<th>金额</th>
							<th>下单时间</th>
							<th>确认时间</th>
							<th>备注</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>IS12386</td>
							<td>李雷</td>
							<td>食尚中式快餐</td>
							<td>3</td>
							<td>12元</td>
							<td>2014-7-1，12：30</td>
							<td>2014-7-1，12：45</td>
							<td>
								<p>
									<a title="辣椒少放点，还有就是不要折耳根" rel="tooltip">辣椒少放点...</a>
								</p>
							</td>

						</tr>
						<tr>
							<td>IS12386</td>
							<td>葛畅</td>
							<td>老麻抄手</td>
							<td>4</td>
							<td>40元</td>
							<td>2014-6-29，11：30</td>
							<td>2014-6-29，11：45</td>
							<td>无</td>
						</tr>
						<tr>
							<td>IS12386</td>
							<td>谷德盛</td>
							<td>食尚中式快餐</td>
							<td>1</td>
							<td>12元</td>
							<td>2014-6-28，13：10</td>
							<td>2014-6-28，13：25</td>
							<td>
								<p>
									<a title="送餐员带够零钱，我只有一张100" rel="tooltip">送餐员带够零钱...</a>
								</p>
							</td>

						</tr>
						<tr>
							<td>IS12386</td>
							<td>顾卫华</td>
							<td>食尚中式快餐</td>
							<td>6</td>
							<td>70元</td>
							<td>2014-6-27，12：30</td>
							<td>2014-6-27，12：45</td>

							<td>
								<p>
									<a title="要两双一次性筷子，还有盐不要太咸了" rel="tooltip">要两双一次性筷子...</a>
								</p>
							</td>
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
							<td>IS12386</td>
							<td>脆香鸡</td>
							<td>商家</td>
							<td>4.1</td>
							<td>
								<p>
									<a title="商家炒菜速度挺快,价格也公道" rel="tooltip">商家炒菜速度挺快的...</a>
								</p>
							</td>
							<td>2014-6-28，12：45</td>
						</tr>
						<tr>
							<td>IS14521</td>
							<td>棒约翰</td>
							<td>商家</td>
							<td>4.8</td>
							<td>
								<p>
									<a title="商家炒菜速度挺快,价格也公道" rel="tooltip">商家炒菜速度挺快的...</a>
								</p>
							</td>
							<td>2014-6-28，11：55</td>
						</tr>
						<tr>
							<td>IS23471</td>
							<td>宜宾燃面</td>
							<td>商家</td>
							<td>4.5</td>
							<td>
								<p>
									<a title="商家炒菜速度挺快,价格也公道" rel="tooltip">商家炒菜速度挺快的...</a>
								</p>
							</td>
							<td>2014-6-27，13：10</td>
						</tr>
						<tr>
							<td>IS12532</td>
							<td>老麻抄手</td>
							<td>商家</td>
							<td>4.2</td>
							<td>
								<p>
									<a title="商家炒菜速度挺快,价格也公道" rel="tooltip">商家炒菜速度挺快的...</a>
								</p>
							</td>
							<td>2014-6-26，13：30</td>
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
							<td>IS12361</td>
							<td>脆香鸡</td>
							<td>商家</td>
							<td>5</td>
							<td>
								<p>
									<a title="用户挺配合，没有出错" rel="tooltip">用户挺配合.....</a>
								</p>
							</td>
							<td>2014-7-2，10：53</td>
						</tr>
						<tr>
							<td>IS12123</td>
							<td>老麻抄手</td>
							<td>商家</td>
							<td>5</td>
							<td>
								<p>
									<a title="用户挺配合，没有出错" rel="tooltip">用户挺配合.....</a>
								</p>
							</td>
							<td>2014-7-1，09：35</td>
						</tr>
						<tr>
							<td>IS12386</td>
							<td>曹操外卖</td>
							<td>商家</td>
							<td>5</td>
							<td>
								<p>
									<a title="用户挺配合，没有出错" rel="tooltip">用户挺配合.....</a>
								</p>
							</td>
							<td>2014-7-1，08：14</td>
						</tr>
						<tr>
							<td>IS12235</td>
							<td>食尚中式快餐</td>
							<td>商家</td>
							<td>5</td>
							<td>
								<p>
									<a title="用户挺配合，没有出错" rel="tooltip">用户挺配合.....</a>
								</p>
							</td>
							<td>2014-6-30，12：15</td>
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
</div>
<script>
	$("a[rel=tooltip]").tooltip();
	window.onload = function() {
		document.getElementById('user').click();
		document.getElementById('wuser').className = "active";
	}
</script>
