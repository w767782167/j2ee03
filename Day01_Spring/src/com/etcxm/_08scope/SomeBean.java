package com.etcxm._08scope;

public class SomeBean {
	
	//构造方法  1
	public SomeBean() {
		System.out.println("SomeBean.SomeBean()");
	}
	
	
	
	//销毁方法  4
	public void close(){
		System.out.println("SomeBean.close()");
	}
	
	
	//   3
	public void doWork(){
		System.out.println("do Work");
	}
	
	//初始化方法  2
	public void open() {
		System.out.println("SomeBean.open()");
	}

}
