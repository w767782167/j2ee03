package com.etcxm._mybatis.hello;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class QueryObject {
	private Integer page;//页数
	private Integer row;//每一页的数量easyUi
	private String keywords;
	private Integer beginAge;
	private Integer endAge;
	
	public Long getStart(){
		return (long) ((this.page-1)*this.row);
	}

}
