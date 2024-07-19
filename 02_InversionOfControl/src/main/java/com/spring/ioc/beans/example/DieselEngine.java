package com.spring.ioc.beans.example;

public class DieselEngine implements IEngine{
	public DieselEngine() {
		System.out.println("DieselEngine Constructor...");
	}
	public int start() {
		System.out.println("DieselEng started..");
		return 1;
	}

}
