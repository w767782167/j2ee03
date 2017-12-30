package com.ectxm._01HelloWorld;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

@org.springframework.stereotype.Controller  //标记使用注解方式
public class HelloWorldController implements Controller {

  
		  
	
	@RequestMapping("/method1")  //前台请求地址
	public ModelAndView handleRequest(HttpServletRequest req,
			HttpServletResponse resp) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("hello SpringMVC");
		ModelAndView mv = new ModelAndView();
		mv.addObject("msg", "hello SpringMVC");
		mv.setViewName("/hello.jsp");
		return mv;
	}
	
	@RequestMapping("/method2")  //前台请求地址
	public ModelAndView method2(HttpServletRequest req,
			HttpServletResponse resp) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("hello SpringMVC2");
		ModelAndView mv = new ModelAndView();
		mv.addObject("msg", "hello SpringMVC2");
		mv.setViewName("/hello.jsp");
		
		
		
		return mv;
	}


}
