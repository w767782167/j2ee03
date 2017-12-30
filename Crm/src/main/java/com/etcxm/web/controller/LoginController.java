package com.etcxm.web.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.client.support.HttpAccessor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.etcxm.domain.TEmployee;
import com.etcxm.service.IEmployeeService;
import com.etcxm.util.UserContext;

@Controller
public class LoginController {

	@Autowired
	IEmployeeService service;
	
	 @RequestMapping("/login")
	 @ResponseBody
	 public Map login(String username,String password,HttpSession session){
		 System.out.println(username);
		 System.out.println(password);
		 
		 TEmployee emp = service.queryByLogin(username,password);
		 System.out.println(emp);
		 Map<String,Object> result = new HashMap<String,Object>();
		 if(emp!=null){
			session.setAttribute(UserContext.USER_IN_SESSION, emp);
			result.put("success", true); 
			result.put("msg", "登录成功"); 
		 }else{
			result.put("success", false); 
			result.put("msg", "登录失败"); 
		 }
		 return result;
	 }
}
