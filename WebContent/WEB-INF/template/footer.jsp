<%@page import="com.opensymphony.xwork2.ActionContext"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<h5 style="float: right">
	共
	<s:property value="totalSize" />
	记录
</h5>
<%
	String actionName = ActionContext.getContext().getName();
%>
<!-- 获得当前action的名字 -->
<!--分页-->
<div class="paging">
	<ul class="pager pager-loose pager-pills">
		<s:iterator value="pageCount" var="page">
			<li <s:if test="#page==pageNow">class="active"</s:if>><a
				href="admin/<%=actionName%>?pageNow=<s:property value="#page" />"><s:property
						value="#page" /></a></li>
		</s:iterator>
	</ul>
</div>