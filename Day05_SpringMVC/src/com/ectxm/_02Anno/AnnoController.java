package com.ectxm._02Anno;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/test")
public class AnnoController {
	@RequestMapping("/method1")  //前台请求地址
	public ModelAndView method1(HttpServletRequest req,
			HttpServletResponse resp) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("hello SpringMVC Anno1");
		ModelAndView mv = new ModelAndView();
		mv.addObject("msg", "hello SpringMVC Anno1  你好师姐");
		mv.setViewName("/hello.jsp");
		return mv;
	}
	
	@RequestMapping("/method2")  //前台请求地址
	public ModelAndView method2(HttpServletRequest req,
			HttpSession session) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("hello SpringMVC Anno2"+session);
		ModelAndView mv = new ModelAndView();
		mv.addObject("msg", "hello SpringMVC Anno2");
		mv.setViewName("/hello.jsp");
		return mv;
	}
	
	@RequestMapping("/method3")  //前台请求地址
	public ModelAndView method3(String name) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("hello SpringMVC Anno3"+name);
		ModelAndView mv = new ModelAndView();
		mv.addObject("msg", "hello SpringMVC Anno3");
		mv.setViewName("/hello.jsp");
		return mv;
	}
	
	@RequestMapping("/method4")  //前台请求地址
	public void method4(HttpServletResponse resp) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("hello SpringMVC Anno4");
		ModelAndView mv = new ModelAndView();
		mv.addObject("msg", "hello SpringMVC Anno4");
		mv.setViewName("/hello.jsp");
		//return mv;
	}
	
	
	/*@RequestMapping("/method4")  //前台请求地址
	public void method5(HttpServletResponse resp) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("hello SpringMVC Anno5");
		ModelAndView mv = new ModelAndView();
		mv.addObject("msg", "hello SpringMVC Anno5");
		mv.setViewName("/hello.jsp");
		//return mv;
	}*/
}
