<%@ page language="java" pageEncoding="UTF-8" contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>


	<div class="container">
		<div class="py-5 text-center">
			<h2>进入机房登记</h2>
		</div>

		<div class="row">
			<form:form modelAttribute="item" class="needs-validation" id="signinform">
				<div class="row">
					<div class="col-md-6 mb-3 form-group">
						<label for="factorystaff" class="control-label">厂家工作人员</label> <form:input type="text" class="form-control" path="factorystaff" placeholder="" value="" />
					</div>
					<div class="col-md-6 mb-3 form-group">
						<label for="factory" class="control-label">厂家</label> <form:input type="text" class="form-control" path="factory" placeholder="" value="" />
					</div>
				</div>
				<div class="row">
					<div class="col-md-6 mb-3 form-group">
						<label for="dept" class="control-label">相关科室</label> <form:input type="text" class="form-control" path="dept" placeholder="" value="" />
					</div>
					<div class="col-md-6 mb-3 form-group">
						<label for="deptstaff" class="control-label">科室负责人</label> <form:input type="text" class="form-control" path="deptstaff" placeholder="" value="" />
					</div>
				</div>
				<div class="row">
					<div class="col-md-6 mb-3 form-group">
						<label for="adm" class="control-label">机房管理员</label> <form:input type="text" class="form-control" path="adm" placeholder="" value="" readonly="readonly"/>
					</div>
					<div class="col-md-6 mb-3 form-group">
						<label for="room" class="control-label">机房</label> <form:input type="text" class="form-control" path="room" placeholder="" value="" readonly="readonly" />
					</div>
				</div>
				<div class="row">
					<div class="col-md-6 mb-3 form-group">
						<label for="signintime" class="control-label">进入机房时间</label> <form:input type="text" class="form-control readyonly" path="strsignintime" placeholder="yyyy-MM-dd HH:mm" value="" readonly="readonly"/>
					</div>
					<div class="col-md-6 mb-3 form-group">
						<label for="presignouttime" class="control-label">预计离开时间</label> <form:input type="text" class="form-control readyonly" path="strpresignouttime" placeholder="yyyy-MM-dd HH:mm" value="" />
					</div>
				</div>
				<button class="btn btn-primary btn-lg btn-block"  type="button" onclick="signin()">确认</button>
				<!-- <button class="btn btn-primary btn-lg btn-block"  type="submit">确认</button> -->
			</form:form>
		</div>
	</div>

<script>

</script>