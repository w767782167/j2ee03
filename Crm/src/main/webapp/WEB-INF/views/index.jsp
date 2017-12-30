<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>系统首页</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="stylesheet" type="text/css" href="/Crm/js/jquery-easyui/themes/default/easyui.css"><!-- 样式文件 -->   
	<link rel="stylesheet" type="text/css" href="/Crm/js/jquery-easyui/themes/icon.css"> <!--图标样式  --> 
	 <link rel="stylesheet" type="text/css" href="/Crm/js/jquery-easyui/demo.css"> 
	<script type="text/javascript" src="/Crm/js/jquery-easyui/jquery.min.js"></script> <!-- jQuery核心库 -->
	<script type="text/javascript" src="/Crm/js/jquery-easyui/jquery.easyui.min.js"></script>  <!-- EasyUI核心库 --> 
	<script type="text/javascript" src="/Crm/js/jquery-easyui/locale/easyui-lang-zh_CN.js"></script>  
	<script type="text/javascript" src="/Crm/js/views/index.js"></script>

  </head>
  
  <body>
    <!-- <h2>Basic Calendar</h2>
    <p>Click to select date.</p>
    <div style="margin:20px 0"></div>
    <div class="easyui-calendar" style="width:250px;height:250px;"></div> -->
	 <div id="cc" class="easyui-layout" fit="true"
		style="width:600px;height:400px;">
		<div data-options="region:'north'"
			style="height:100px;background:url('/Crm/img/banner-pic.gif') no-repeat;background-size:cover; ">
			<h1>中软国际员工管理系统</h1>
		</div>
		<div data-options="region:'west'" style="width:150px;">
			手风琴+菜单
			<div class="easyui-accordion" fit="true">
				<div title="菜单">
					使用树组件来定义菜单
					<ul id="menuTree"></ul>
				</div>
				<div title="帮助"></div>
				<div title="简介"></div>
			</div>
		</div>
		<div data-options="region:'center'"
			style="padding:5px;background:#eee;">
			正文内容
			<div id="myTabs" class="easyui-tabs" fit="true">
				<div title="欢迎页" closable="true">
					<center>
						<h1>欢迎登陆系统</h1>
					</center>
				</div>
			</div>
		</div>
		<div data-options="region:'south'"
			style="height:30px;background:url('/Crm/img/banner-pic.gif') no-repeat;background-size:cover; ">
			<center>版权信息</center>
		</div>
	</div> 
</body>
</html>
