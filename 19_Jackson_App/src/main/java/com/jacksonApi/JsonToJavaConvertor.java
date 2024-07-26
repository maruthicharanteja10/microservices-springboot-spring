package com.jacksonApi;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToJavaConvertor {
	public static void main(String[] args) throws Exception {
		File f = new File("customer.json");
		ObjectMapper mapper = new ObjectMapper();
		Customer c = mapper.readValue(f, Customer.class);
		System.out.println(c);
		}
}
