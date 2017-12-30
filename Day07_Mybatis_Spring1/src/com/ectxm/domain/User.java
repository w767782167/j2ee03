package com.ectxm.domain;

import org.apache.ibatis.type.Alias;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Alias("User")
public class User {
	private Long id;
	private String username;
	private String password;
	private Integer age;

}
