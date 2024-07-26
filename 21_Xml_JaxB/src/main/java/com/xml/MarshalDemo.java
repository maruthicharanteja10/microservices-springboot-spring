package com.xml;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;


public class MarshalDemo {
	public static void main(String[] args) throws Exception {
		Customer c = new Customer();
		c.setId(101);
		c.setName("John");
		c.setEmail("john@gmail.com");
		c.setPhno(64131313l);
		JAXBContext context = JAXBContext.newInstance(Customer.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.marshal(c, new File("customer.xml"));
		System.out.println("xml created....");
	}

}
