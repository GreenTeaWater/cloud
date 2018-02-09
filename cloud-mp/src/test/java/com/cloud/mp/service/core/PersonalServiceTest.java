package com.cloud.mp.service.core;

import java.io.Serializable;

import org.junit.Test;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

public class PersonalServiceTest implements Serializable {
	
	private static final long serialVersionUID = 3645192628489768231L;

	@Test
	public void query() throws SchedulerException{
		System.out.println(1111);
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");;
		//PersonalService personalService = context.getBean("personalService");
		//System.out.println(personalService.query(1));
		
		Scheduler scheduler = (Scheduler) context.getBean("scheduler");
		scheduler.start();
	}
}
