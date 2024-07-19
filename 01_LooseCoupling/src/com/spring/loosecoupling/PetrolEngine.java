package com.spring.loosecoupling;

public class PetrolEngine implements IEngine {
	
	@Override
	public int start() {
		System.out.println("PetrolEngine started..");
		return 1;
	}

}
