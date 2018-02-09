package com.cloud.mp.common.job;

import java.text.SimpleDateFormat;
import java.util.Date;

public class JobImpl {

	public void executeJob(){
		System.out.println("执行定时任务了:time=" + new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS").format(new Date()));
	}
}
