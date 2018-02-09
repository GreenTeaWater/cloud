package com.cloud.mp.common.job;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.MethodInvokingJobDetailFactoryBean.StatefulMethodInvokingJob;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class DayCutJobImpl  extends QuartzJobBean implements DayCutJob {

	private static final long serialVersionUID = 4414185575254319083L;

	@Override
	protected void executeInternal(JobExecutionContext context)
			throws JobExecutionException {
		// TODO Auto-generated method stub
		System.out.println("执行定时任务了:time=" + new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS").format(new Date()));
	}

	

}
