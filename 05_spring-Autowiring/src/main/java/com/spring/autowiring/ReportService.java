package com.spring.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ReportService {
//	@Autowired // work by byName
//	@Qualifier("OracleDao")//Work by byType
	// Field Injection
	private ReportDao dao;

	// Setter injection
	@Autowired
	public void setDao(ReportDao dao) {
		System.out.println("ReportDao Setter Method is called...!");
		this.dao = dao;
	}

//Constructor injection
	// if we have two param and default constructor we have to specify @Autowire
	// When only one constructor is there there is no need of autowire anotation
	public ReportService() {
		// TODO Auto-generated constructor stub
	}

//	@Autowired
	public ReportService(ReportDao dao) {
		System.out.println("ReportDao Construtor is called..!");
		this.dao = dao;
	}

	public void ReportDao() {
		dao.getData();
		System.out.println("Report generated...!");
	}

}
