package com.xxl.job.admin.feign;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.xxl.job.admin.XxlJobAdminApplication;
import com.xxl.job.core.biz.model.ReturnT;
/**
 * 任务调试测试用例
 * date: 2019-04-23 17:54:46
 * 
 * @author Liuweiyao
 * @version 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes=XxlJobAdminApplication.class)
public class JobWebControllerTest{
	/*@Autowired
	private JobInfoService jobInfoService;
	@Test
	public void testAdd() throws Exception{
		XxlJobInfo jobInfo = new XxlJobInfo();
		jobInfo.setGlueType("BEAN");
		jobInfo.setJobGroup(1);
		jobInfo.setExecutorHandler("testJobHandler");
		jobInfo.setExecutorBlockStrategy("SERIAL_EXECUTION");
		jobInfo.setExecutorTimeout(0);
		jobInfo.setExecutorFailRetryCount(0);
		jobInfo.setJobDesc("test任务223");
		jobInfo.setExecutorRouteStrategy("FIRST");
		jobInfo.setJobCron("0 0 0 * * ? *");
		jobInfo.setAuthor("finance-basicset");
		jobInfo.setExecutorParam("999");
		ReturnT<String> r = jobInfoService.add(jobInfo);
		System.out.println(r);
	}
	
	@Test
	public void testAddWithStart() throws Exception{
		XxlJobInfo jobInfo = new XxlJobInfo();
		jobInfo.setGlueType("BEAN");
		jobInfo.setJobGroup(1);
		jobInfo.setExecutorHandler("testJobHandler");
		jobInfo.setExecutorBlockStrategy("SERIAL_EXECUTION");
		jobInfo.setExecutorTimeout(0);
		jobInfo.setExecutorFailRetryCount(0);
		jobInfo.setJobDesc("test任务22");
		jobInfo.setExecutorRouteStrategy("FIRST");
		jobInfo.setJobCron("0 0 0 * * ? *");
		jobInfo.setAuthor("finance-basicset");
		jobInfo.setExecutorParam("999");
		ReturnT<String> r = jobInfoService.addWithStart(jobInfo);
		System.out.println(r);
	}
	
	@Test
	public void testStart() throws Exception{
		ReturnT<String> r = jobInfoService.start(4);
		System.out.println(r);
	}
	
	@Test
	public void testStop() throws Exception{
		ReturnT<String> r = jobInfoService.stop(4);
		System.out.println(r);
	}
	
	@Test
	public void testRemove() throws Exception{
		ReturnT<String> r = jobInfoService.remove(4);
		System.out.println(r);
	}*/
}