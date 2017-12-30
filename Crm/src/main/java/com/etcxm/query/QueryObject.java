package com.etcxm.query;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QueryObject {
	private Long page;//当前页
	private Long row;//每页条数
	
	public Long getStart(){
		return (this.page-1)*this.row;
	}

}
