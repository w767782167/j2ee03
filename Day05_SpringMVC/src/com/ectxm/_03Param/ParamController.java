package com.ectxm._03Param;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ParamController {

	@RequestMapping("/param1")  //前台请求地址
	public ModelAndView param1(HttpServletRequest req,
			HttpServletResponse resp) throws Exception {
		// TODO Auto-generated method stub
		//1.使用serlvet原生api来实现
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		User user = new User(username,password);
		System.out.println(user);
		
		return null;
	}
	
	
	@RequestMapping("/param2")  //前台请求地址
	public ModelAndView param2(String username,String password) throws Exception {
		// TODO Auto-generated method stub
		//2.前台需要传入的参数名和方法定义的形参名字一致
		System.out.println("ParamController.param2()");
		User user = new User(username,password);
		System.out.println(user);
		
		return null;
	}
	
	@RequestMapping("/param3")  //前台请求地址
	public ModelAndView param3(@RequestParam("username1111")String username,String password) throws Exception {
		// TODO Auto-generated method stub
		//2.前台需要传入的参数名和方法定义的形参名字一致
		System.out.println("ParamController.param3()");
		User user = new User(username,password);
		System.out.println(user);
		
		return null;
	}
	
	@RequestMapping("/param4")  //前台请求地址
	public ModelAndView param4(User u) throws Exception {
		// TODO Auto-generated method stub
		//3.使用模型传参
		System.out.println("ParamController.param4()");
		System.out.println(u);
		
		return null;
	}
	@RequestMapping("/param5/{delId}")  //前台请求地址
	public ModelAndView param5(@PathVariable("delId")Long id) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("删除的id是="+id);
		
		return null;
	}
}
