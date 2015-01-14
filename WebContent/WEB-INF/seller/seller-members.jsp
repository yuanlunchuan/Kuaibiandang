<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<jsp:include page="../template/navbar.jsp"></jsp:include>
<div id="main">
	<table class="table table-bordered table-hover">
		<thead>
			<tr>
				<th>商家ID</th>
				<th>商家名称</th>
				<th>联系号码</th>
				<th>注册人</th>
				<th>地址</th>
				<th>注册时间</th>
				<th>商家等级</th>
				<th>商家好评</th>
				<th>操作</th>
			</tr>
		</thead>
		<s:iterator value="businesses" var="bus">
			<tr>
				<td><s:property value="#bus.business_id" /></td>
				<td><s:property value="#bus.business_name" /></td>
				<td><s:property value="#bus.business_phonenumber" /></td>
				<td><s:property value="#bus.host_name" /></td>
				<td><s:property value="#bus.business_address" /></td>
				<td><s:date name="#bus.business_registertime"
						format="MM/dd/yy hh:mm:ss" /></td>
				<td><s:property value="#bus.business_level" /></td>
				<td><s:property value="#bus.business_reputation" /></td>
				<td>
					<button class="btn btn-danger"
						onclick="window.location.href=('admin/addBlack?business_id=<s:property value="#bus.business_id" />')">封禁</button>
					<button class="btn btn-warning"
						onclick="window.location.href=('admin/deleteBus?phonenumber=<s:property value="#bus.business_phonenumber" />')">删除</button>
				</td>
			</tr>
		</s:iterator>
	</table>
	<jsp:include page="../template/footer.jsp"></jsp:include>
</div>
<script type="text/javascript">
	window.onload = function() {
		document.getElementById('seller').click();
		document.getElementById('wseller').className="active";
	}
</script>