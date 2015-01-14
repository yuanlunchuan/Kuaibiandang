<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<jsp:include page="../template/navbar.jsp"></jsp:include>
<div id="main">
	<table class="table table-bordered table-hover">
		<thead>
			<tr>
				<th>消费者ID</th>
				<th>消费者昵称</th>
				<th>联系号码</th>
				<th>封禁时间</th>
				<th>操作</th>
			</tr>
		</thead>
		<s:iterator value="blacks" var="bl">
			<tr>
				<td><s:property value="#bl.blacklist_id" /></td>
				<td>食尚</td>
				<td><s:property value="#bl.blacklist_phonenumber" /></td>
				<td><s:date name="#bl.blacklist_time"
						format="MM/dd/yy hh:mm:ss" />
				<td>
					<button class="btn btn-primary"
						onclick="window.location.href=('admin/deleteBlack?blacklist_id=<s:property value="#bl.blacklist_id"/>')">移除</button>
				</td>
			</tr>
		</s:iterator>
	</table>
	<jsp:include page="../template/footer.jsp"></jsp:include>
</div>
<script type="text/javascript">
	window.onload = function() {
		document.getElementById('user').click();
		document.getElementById('buser').className = "active";
	}
</script>