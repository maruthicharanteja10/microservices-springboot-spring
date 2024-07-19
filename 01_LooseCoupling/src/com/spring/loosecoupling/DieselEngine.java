package com.spring.loosecoupling;

public class DieselEngine implements IEngine{
	
	public int start() {
		System.out.println("DieselEng started..");
		return 1;
	}

}
