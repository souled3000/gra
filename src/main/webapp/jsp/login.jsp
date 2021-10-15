<%@ page language="java" pageEncoding="UTF-8" contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<%--<spring:message code="key" /> --%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<title>机房门禁系统</title>

<script type="text/javascript" src="./lib/jquery.js"></script>
<script type="text/javascript" src="./lib/bootstrap.min.js"></script>
<link type="text/css" rel="stylesheet" href="./lib/bootstrap.min.css" />

<!-- Custom styles for this template -->
<link href="./lib/signin.css" rel="stylesheet">



</head>

<body>

	<div class="container">
		<form:form modelAttribute="user" class="form-signin" role="form">
			<h2 class="form-signin-heading">请登录</h2>
			<label for="inputEmail" class="sr-only">管理员</label>
			<form:input path="name" class="form-control" placeholder="管理员" required='true' autofocus='true' />
			<label for="inputPassword" class="sr-only">密码</label>
			<form:password path="pwd" class="form-control" placeholder="密码" required='true' />
			<form:select class="form-control" path="room">
				<c:forEach items="${rooms}" var="c">
					<option>${c}</option>
				</c:forEach>
			</form:select>
			<div class="checkbox">
				<label> <input type="checkbox" value="remember-me"> Remember me
				</label>
			</div>
			<!--  	<form:errors path="name" cssClass="error" /><form:errors path="pwd" cssClass="error"/><form:errors id="*" cssClass="error"/>	-->
			<button class="btn btn-lg btn-primary btn-block" type="submit">登录</button>
		</form:form>

	</div>
</body>
</html>

