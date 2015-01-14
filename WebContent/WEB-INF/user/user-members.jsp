<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<jsp:include page="../template/navbar.jsp"></jsp:include>

<div id="main">
	<table class="table table-bordered table-hover">
		<thead>
			<tr>
				<th>用户ID</th>
				<th>用户名</th>
				<th>联系号码</th>
				<th>注册时间</th>
				<th>用户积分</th>
				<th>操作</th>
			</tr>
		</thead>
		<s:iterator value="users" var="u">
			<tr>
				<td><s:property value="#u.user_id" /></td>
				<td><a
					href="admin/UserDetail?user_id=<s:property value="#u.user_id" />">
				<s:property value="#u.user_name" /></a></td>
				<td><s:property value="#u.user_phonenumber" /></td>
				<td><s:date name="#u.user_registertime"
						format="MM/dd/yy hh:mm:ss" /></td>
				<td><s:property value="#u.user_score" /></td>
				<td>
					<button class="btn btn-danger"
						onclick="window.location.href=('admin/addBlackUser?user_id=<s:property value="#u.user_id" />')">封禁</button>
					<button class="btn btn-warning"
						onclick="window.location.href=('admin/deleteUser?user_id=<s:property value="#u.user_id" />')">删除</button>
				</td>
			</tr>
		</s:iterator>
	</table>
	<jsp:include page="../template/footer.jsp"></jsp:include>
</div>

<script type="text/javascript">
	window.onload = function() {
		document.getElementById('user').click();
		document.getElementById('wuser').className = "active";
	}
</script>