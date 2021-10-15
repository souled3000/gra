<%@ page language="java" pageEncoding="UTF-8" contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!--Force IE6 into quirks mode with this comment tag-->
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html lang="zh-CN">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" />
<title>机房门禁系统</title>
<link type="text/css" rel="stylesheet" href="./lib/bootstrap.min.css" />
<script type="text/javascript" src="./lib/jquery.js"></script>
<script type="text/javascript" src="./lib/bootstrap.min.js"></script>

<style type="text/css">
body {
	margin: 0;
	padding: 0;
	border: 0;
	overflow: hidden;
	height: 100%;
	max-height: 100%;
	background-color: #0B7EB7;
}

#framecontentLeft, #framecontentTop {
	position: absolute;
	top: 0;
	left: 0;
	width: 200px; /*Width of left frame div*/
	height: 100%;
	overflow: hidden; /*Disable scrollbars. Set to "scroll" to enable*/
	background-color: #0B7EB7;
	color: white;
}

#framecontentTop {
	left: 0px; /*Set left value to WidthOfLeftFrameDiv*/
	right: 0px;
	width: auto;
	height: 120px; /*Height of top frame div*/
	overflow: hidden; /*Disable scrollbars. Set to "scroll" to enable*/
	background-color: #0B7EB7;
	color: white;
}

#maincontent {
	position: fixed;
	left: 200px; /*Set left value to WidthOfLeftFrameDiv*/
	top: 120px; /*Set top value to HeightOfTopFrameDiv*/
	right: 0;
	bottom: 0;
	overflow: auto;
	background: #fff;
}

.innertube {
	margin: 15px;
	/*Margins for inner DIV inside each DIV (to provide padding)*/
}

* html body { /*IE6 hack*/
	padding: 120px 0 0 200px;
	/*Set value to (HeightOfTopFrameDiv 0 0 WidthOfLeftFrameDiv)*/
}

* html #maincontent { /*IE6 hack*/
	height: 100%;
	width: 100%;
}

* html #framecontentTop { /*IE6 hack*/
	width: 100%;
}
</style>

<script type="text/javascript">var basePath='<%=basePath%>
	';
</script>

</head>

<body>
	<div id="framecontentTop">
		<div class="innertube">
			<h1 style="text-align: center; font-weight: bolder; color: white">机房门禁系统</h1>
		</div>
	</div>
	<div id="framecontentLeft">1111
		<div class="col-sm-3 col-md-2 sidebar">
			<ul class="nav nav-sidebar">
				<li class="active"><a href="#">Overview <span class="sr-only">(current)</span></a></li>
				<li><a href="#">Reports</a></li>
				<li><a href="#">Analytics</a></li>
				<li><a href="#">Export</a></li>
			</ul>
			<ul class="nav nav-sidebar">
				<li><a href="">Nav item</a></li>
				<li><a href="">Nav item again</a></li>
				<li><a href="">One more nav</a></li>
				<li><a href="">Another nav item</a></li>
				<li><a href="">More navigation</a></li>
			</ul>
			<ul class="nav nav-sidebar">
				<li><a href="">Nav item again</a></li>
				<li><a href="">One more nav</a></li>
				<li><a href="">Another nav item</a></li>
			</ul>
		</div>
	</div>
	<div id="maincontent">
		<div class="innertube">
			<h1>maincontent</h1>
		</div>
	</div>
</body>
</html>
