package com.xxl.job.admin.controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xxl.job.admin.controller.annotation.PermessionLimit;
import com.xxl.job.admin.core.model.XxlJobInfo;
import com.xxl.job.admin.core.thread.JobTriggerPoolHelper;
import com.xxl.job.admin.core.trigger.TriggerTypeEnum;
import com.xxl.job.admin.service.XxlJobService;
import com.xxl.job.core.biz.model.ReturnT;

/**
 * 任务代理类，用于接口调用
 * @author lwy 2019-04-23 16:13:16
 */
@RestController
@RequestMapping("/jobInfoProxy")
public class JobInfoProxyController {
	@Autowired
	private XxlJobService xxlJobService;
	
	@PermessionLimit(limit=false)
	@RequestMapping("/add")
	public ReturnT<String> add(@RequestBody XxlJobInfo jobInfo) {
		return xxlJobService.add(jobInfo);
	}
	
	@PermessionLimit(limit=false)
	@RequestMapping("/addWithStart")
	public ReturnT<String> addWithStart(@RequestBody XxlJobInfo jobInfo) {
		ReturnT<String> addR = xxlJobService.add(jobInfo);
		if(addR.getCode()!=200 || Objects.isNull(addR.getContent())){
			return addR;
		}
		return xxlJobService.start(Integer.parseInt(addR.getContent()));
	}
	
	@PermessionLimit(limit=false)
	@RequestMapping("/update")
	public ReturnT<String> update(@RequestBody XxlJobInfo jobInfo) {
		return xxlJobService.update(jobInfo);
	}
	
	@PermessionLimit(limit=false)
	@RequestMapping("/remove")
	public ReturnT<String> remove(int id) {
		return xxlJobService.remove(id);
	}
	
	@PermessionLimit(limit=false)
	@RequestMapping("/stop")
	public ReturnT<String> stop(int id) {
		return xxlJobService.stop(id);
	}
	
	@PermessionLimit(limit=false)
	@RequestMapping("/start")
	public ReturnT<String> start(int id) {
		return xxlJobService.start(id);
	}
	
	@PermessionLimit(limit=false)
	@RequestMapping("/trigger")
	public ReturnT<String> triggerJob(int id, String executorParam) {
		if (executorParam == null) {
			executorParam = "";
		}

		JobTriggerPoolHelper.trigger(id, TriggerTypeEnum.MANUAL, -1, null, executorParam);
		return ReturnT.SUCCESS;
	}
	
}
