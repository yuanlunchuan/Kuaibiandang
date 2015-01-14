<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<jsp:include page="../template/navbar.jsp"></jsp:include>
<div id="main">
	<table class="table table-bordered table-hover">
		<thead>
			<tr>
				<th>送餐员ID</th>
				<th>姓名</th>
				<th>电话号码</th>
				<th>身份证号码</th>
				<th>注册时间</th>
				<th>所属商家</th>
				<th>等级</th>
				<th>操作</th>
			</tr>
		</thead>
		<s:iterator value="senders" var="s">
			<tr>
				<td><s:property value="#s.sender_id" /></td>
				<td><a href="admin/SenderDetail?sender_id=<s:property value="#s.sender_id" />"><s:property value="#s.sender_name" /></a></td>
				<td><s:property value="#s.sender_phonenumber" /></td>
				<td><s:property value="#s.sender_identify" /></td>
				<td><s:date name="#s.sender_registertime"
						format="MM/dd/yy hh:mm:ss" /></td>
				<td><s:if test="#s.sender_seller_id==null">无</s:if> <s:else>
						<s:property value="#s.sender_seller_id" />
					</s:else></td>
				<td><s:property value="#s.sender_level" /></td>
				<td>
					<button class="btn btn-danger"
						onclick="window.location.href=('admin/addBlackSender?sender_id=<s:property value="#s.sender_id" />')">封禁</button>
					<button class="btn btn-warning"
						onclick="window.location.href=('admin/deleteSender?sender_id=<s:property value="#s.sender_id" />')">删除</button>
				</td>
			</tr>
		</s:iterator>
	</table>
	<jsp:include page="../template/footer.jsp"></jsp:include>
</div>
<script type="text/javascript">
	window.onload = function() {
		document.getElementById('sender').click();
		document.getElementById('wsender').className = "active";
	}
</script>
