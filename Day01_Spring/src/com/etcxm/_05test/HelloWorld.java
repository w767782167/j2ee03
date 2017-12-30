package com.etcxm._05test;

import lombok.Setter;

public class HelloWorld {
	@Setter
    private String username;
	 
	public void sayHello(){
		System.out.println("你好 ,世界"+username);
	}
}
