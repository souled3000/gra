<%@ page language="java" pageEncoding="UTF-8" contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!doctype html>
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="">

<title>机房门禁系统</title>
<script type="text/javascript" src="./lib/jquery.js"></script>
<script type="text/javascript" src="./lib/bootstrap.min.js"></script>
<link type="text/css" rel="stylesheet" href="./lib/bootstrap.min.css" />
<link href="./lib/bootstrap-combined.min.css" rel="stylesheet">
<script src="./lib/bootstrap-contextmenu.js"></script>
<script src="./lib/prettify.js"></script>


<!-- Custom styles for this template -->
<link href="./lib/gra.css" rel="stylesheet">
<script type="text/javascript" src="./lib/gra.js"></script>

<script type="text/javascript">var basePath='<%=basePath%>';
</script>
</head>

<body>

	<nav class="navbar navbar-inverse navbar-fixed-top">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
					<span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">机房门禁系统</a>
			</div>
			<div id="navbar" class="navbar-collapse collapse">
				<ul class="nav navbar-nav navbar-right">
					<li><a href="#">${CurAdmin.name }</a></li>
            		<li><a href="#">${CurAdmin.room }</a></li>
					<li><a href="./index.jsp">退出</a></li>
				</ul>
			</div>
		</div>
	</nav>

	<div class="container-fluid">
		<div class="row">
			<div class="col-sm-3 col-md-2 sidebar">
				<ul class="nav nav-sidebar" id="_menu">
					<li id="current"><a href="#">机房当前情况</a></li>
					<li id="signin"><a href="#">进入机房登记</a></li>
					<li id="his"><a href="#">历史查询</a></li>
				</ul>
			</div>
			<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main" id="_content">

			</div>
		</div>
	</div>

</body>
</html>
