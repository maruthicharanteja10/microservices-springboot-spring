package com.jacksonApi;

import lombok.Data;

@Data
public class Customer {
	private Integer id;
	private String name;
	private String email;
	private Long phno;

	private Address addr;
	
	

}
