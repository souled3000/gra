<%@ page language="java" pageEncoding="UTF-8" contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>



<h2 class="sub-header">机房当前情况</h2>
<div class="table-responsive">
	<table class="table table-striped">
		<thead>
			<tr>
				<th>厂家工作人员</th>
				<th>厂家</th>
				<th>相关科室</th>
				<th>科室负责人</th>
				<th>机房管理员</th>
				<th>机房</th>
				<th>进入机房时间</th>
				<th>预计离开时间</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${page.list}" var="c">
				<tr>
					<td>${c.factorystaff}</td>
					<td>${c.factory}</td>
					<td>${c.dept}</td>
					<td>${c.deptstaff}</td>
					<td>${c.admin}</td>
					<td>${c.room}</td>
					<td><fmt:formatDate value="${c.signintime}" pattern="yyyy-MM-dd HH:mm"/></td>
					<td><fmt:formatDate value="${c.preSignouttime}" pattern="yyyy-MM-dd HH:mm"/></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<ul class="pager">
		<li class="previous"><a href="#">上一页</a></li>
		<li class="next"><a href="#">下一页</a></li>
	</ul>
</div>