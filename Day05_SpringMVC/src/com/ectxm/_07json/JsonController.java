package com.ectxm._07json;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ectxm._03Param.User;

@Controller
public class JsonController {
	
	@RequestMapping("/json")
	@ResponseBody//(表示我们的请求不再交给springmvc处理,会结合JSON包,将对象解析成JSON字符串)
	public User test(){
		
		return new User("jack", "123456");
	}

}
