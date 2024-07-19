package com.spring.Annotations;

import org.springframework.stereotype.Component;

@Component
public class Chip {
	public Chip() {
		System.out.println("Chip constructir");
	}

	String chiptype() {
		return "32-bit";
	}
}
