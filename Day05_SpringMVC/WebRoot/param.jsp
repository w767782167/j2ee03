<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'param.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <fieldset>
     <legend>用户注册1</legend>
      <form action="/Day05_SpringMVC/param1" method="post">
                        用户名:<input type="text" name="username"><br/>
                        密码:<input type="text" name="password"><br/>  
         <input type="submit" value="提交">             
      </form>
  </fieldset>
   <fieldset>
     <legend>用户注册2</legend>
      <form action="/Day05_SpringMVC/param2" method="post">
                        用户名:<input type="text" name="username"><br/>
                        密码:<input type="text" name="password"><br/>  
         <input type="submit" value="提交">             
      </form>
  </fieldset>
    <fieldset>
     <legend>用户注册3</legend>
      <form action="/Day05_SpringMVC/param3" method="post">
                        用户名:<input type="text" name="username1111"><br/>
                        密码:<input type="text" name="password"><br/>  
         <input type="submit" value="提交">             
      </form>
  </fieldset>
     <fieldset>
     <legend>用户注册4</legend>
      <form action="/Day05_SpringMVC/param4" method="post">
                        用户名:<input type="text" name="username"><br/>
                        密码:<input type="text" name="password"><br/>  
         <input type="submit" value="提交">             
      </form>
  </fieldset>
  
     
  </body>
</html>
