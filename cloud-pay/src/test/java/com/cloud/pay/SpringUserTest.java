package com.cloud.pay;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdScheduler;
import org.quartz.impl.StdSchedulerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cloud.pay.domain.User;
import com.cloud.pay.quartz.HelloQuartz;
import com.cloud.pay.service.UserService;

/*@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:applicationContext-quartz.xml"})*/
public class SpringUserTest {

    private static final Logger logger = LoggerFactory.getLogger(SpringUserTest.class);
	
	

	@Test
	public void test() throws SchedulerException{
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-quartz-test.xml");
		SchedulerFactoryBean scheduler = (SchedulerFactoryBean) context.getBean("scheduler");
	
		// 1、创建一个JobDetail实例，指定Quartz
        JobDetail jobDetail = JobBuilder.newJob(HelloQuartz.class)
        		.withDescription("this is a ram job") //job的描述
                .withIdentity("job1_1", "jGroup1")
                // 任务名，任务组
                .build();

        // 触发器类型
        //SimpleScheduleBuilder builder = SimpleScheduleBuilder
                // 设置执行次数
                //.repeatSecondlyForTotalCount(5);

        CronScheduleBuilder builder = CronScheduleBuilder.cronSchedule("0/2 * * * * ?");
        // 2、创建Trigger
        Trigger trigger = TriggerBuilder.newTrigger()
                .withIdentity("trigger1_1", "tGroup1").startNow()
                .withSchedule(builder)
                .build();

        // 3、创建Scheduler
     //   scheduler = StdSchedulerFactory.getDefaultScheduler();
        // 4、调度执行
        scheduler.scheduleJob(jobDetail, trigger);
        
        scheduler.start();
		
	}
	
}
