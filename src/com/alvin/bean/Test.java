package com.alvin.bean;

import javax.sql.rowset.serial.SerialArray;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alvin.book.Book;
import com.alvin.book.Service;

public class Test {
	@org.junit.Test
	public void testBean(){
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("bean.xml");
		Service service =   (Service) context.getBean("service");
		service.add();
	}
	

}
