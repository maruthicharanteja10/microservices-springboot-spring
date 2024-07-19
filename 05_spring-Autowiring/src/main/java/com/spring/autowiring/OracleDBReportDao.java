package com.spring.autowiring;

import org.springframework.stereotype.Repository;

@Repository("OracleDao")
public class OracleDBReportDao implements ReportDao {

	@Override
	public void getData() {
		System.out.println("Getting data from Oracle...");
	}

}
