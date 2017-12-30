package com.etcxm.web.action;

import lombok.Setter;

import com.etcxm.service.IEmployeeService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class EmployeeAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Setter
	private IEmployeeService service;
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("employee....");
		ActionContext.getContext().put("employees", service.ListAll());
		return "list";
	}
	

}
