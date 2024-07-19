package com.spring.autowiring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

//@Repository("dao")// work by byName
//@Repository("MysqlDao") //byType
//@Primary
@Repository("dao")
public class MysqlDBReportDao implements ReportDao {

	@Override
	public void getData() {
		System.out.println("Getting data from Mysql....");
	}

}
