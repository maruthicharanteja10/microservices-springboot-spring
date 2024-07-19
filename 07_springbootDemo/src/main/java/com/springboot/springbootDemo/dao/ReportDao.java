package com.springboot.springbootDemo.dao;


import org.springframework.stereotype.Service;

@Service
public class ReportDao {
	
	public ReportDao() {
		System.out.println("ReportDao::Constructor");
	}
	public void hi() {
		System.out.println("Report Dao ::method");
	}
}