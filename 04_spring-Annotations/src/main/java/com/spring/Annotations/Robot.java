package com.spring.Annotations;

import org.springframework.stereotype.Component;

@Component
public class Robot {
	private Chip chip;

	public Robot() {
		System.out.println("Robot constructor");
	}

	public void doWork() {
		String type = chip.chiptype();
		if (type.equals("32-bit")) {
			System.out.println("Performance is slow...");
		}
	}
}
