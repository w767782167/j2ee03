package com.ectxm._05Value;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ectxm._03Param.User;



@Controller
public class ValueController {

	@RequestMapping("/value1")  //前台请求地址
	public ModelAndView value1(HttpServletRequest req,
			HttpServletResponse resp) throws Exception {
		// TODO Auto-generated method stub
		//1.使用serlvet原生api来实现
		req.setAttribute("msg", "今天周五了,好开心");
		req.getRequestDispatcher("/value.jsp").forward(req, resp);
		
		return null;
	}
	
	@RequestMapping("/value2")  //前台请求地址
	public ModelAndView value2(HttpServletRequest req,
			HttpServletResponse resp) throws Exception {
		// TODO Auto-generated method stub
		//1.使用springMVC所提供的ModelAndView对象回显内容
		ModelAndView mv = new ModelAndView();
		mv.addObject("msg", "不开心");
		
		Map<String,String> map = new HashMap<String,String>();
		map.put("name", "rose");
		mv.addAllObjects(map);
		
		mv.addObject("hello World");//-----类型小写来拿  string
		
		mv.addObject(new User("张飞飞","123"));//  user
		mv.addObject(new User("李师师","222"));//  user
		
		
		mv.setViewName("/value.jsp");
		return mv;
	}
	
	@RequestMapping("/value3")  //前台请求地址
	public User value3(HttpServletRequest req,
			HttpServletResponse resp) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("ValueController.value3()");
		User u = new User("tom","888");
		return u;
	}
	
	@RequestMapping("/value4")  //前台请求地址  /WEB-INF/haha.jsp
	public String value4(Model m) throws Exception {
		// TODO Auto-generated method stub
	    m.addAttribute("msg", "今天天气很好");
		return "haha";
	}
	
	
	@RequestMapping("/value5")  //前台请求地址  /WEB-INF/haha.jsp
	public String value5(Model m) throws Exception {
		// TODO Auto-generated method stub
	   
		//return "forward:/index.jsp";
		return "redirect:/index.jsp";
	}
}
