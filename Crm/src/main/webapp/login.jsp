<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>中软国际客户关系管理系统</title>
<link rel="stylesheet" href="css/style.css">
<script type="text/javascript" src="/Crm/js/jquery-easyui/jquery.min.js"></script> 
<script type="text/javascript">
  function submitForm(){
     //发送Ajax请求
     //json  {"success":true,"msg":"登录成功"}
     //      {"success":false,"msg":"登录失败"}
    
   // console.log($("form").serialize());
       $.ajax({ 
              type:"post",
              url: "/Crm/login", 
              data: $("form").serialize(), 
              success: function(data){
                 if(data.success){
                    window.location.href="/Crm/index";
                 }else{
                    alert(data.msg);
                 }
             },
             error:function(XMLHttpRequest,textStatus,errorThrown){
                alert("ddd");
             },
             complete:function(XMLHttpRequest){
               alert(XMLHttpRequest);
             },
             dataType:"json"
      });  
      
      /* $.post("/Crm/login",$("form").serialize(),function(data){
                 if(data.success){
                    window.location.href="/Crm/index";
                 }else{
                    alert(data.msg);
                 }
         },"json"); */
  }

</script>
</head>
<body>
  <section class="container">
    <div class="login">
      <h1>用户登录</h1>
      <form method="post">
        <p><input type="text" name="username" value="" placeholder="账号"></p>
        <p><input type="password" name="password" value="" placeholder="密码"></p>
        <p class="submit">
        	<input type="button" value="登录" onclick="submitForm()">
        	<input type="button" value="重置">
        </p>
      </form>
    </div>
  </section>
<div style="text-align:center;" class="login-help">
	<p>Copyright ©2017中软国际科技有限公司</p>
</div>
</html>