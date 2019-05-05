package com.xxl.job.admin.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xxl.job.admin.feign.dto.XxlJobInfo;
import com.xxl.job.core.biz.model.ReturnT;

@FeignClient(name = "roc-component-job-admin")
@RequestMapping("/jobInfoProxy")
public interface JobInfoService {
	
	/**
	 * 新增任务
	 * @param jobInfo
	 * @return
	 */
	@RequestMapping("/add")
	ReturnT<String> add(@RequestBody XxlJobInfo jobInfo);
	
	/**
	 * 新增并启动任务
	 * @param jobInfo
	 * @return
	 */
	@RequestMapping("/addWithStart")
	ReturnT<String> addWithStart(@RequestBody XxlJobInfo jobInfo);
	
	/**
	 * 更新任务
	 * @param jobInfo
	 * @return
	 */
	@RequestMapping("/update")
	ReturnT<String> update(@RequestBody XxlJobInfo jobInfo);
	
	/**
	 * 删除任务
	 * @param id
	 * @return
	 */
	@RequestMapping("/remove")
	ReturnT<String> remove(@RequestParam(value="id",required=true) Integer id);
	
	/**
	 * 启动任务
	 * @param id
	 * @return
	 */
	@RequestMapping("/start")
	ReturnT<String> start(@RequestParam(value="id",required=true) Integer id);
	
	/**
	 * 停止任务
	 * @param id
	 * @return
	 */
	@RequestMapping("/stop")
	ReturnT<String> stop(@RequestParam(value="id",required=true) Integer id);
	
	/**
	 * 触发执行一次任务
	 * @param id
	 * @param executorParam
	 * @return
	 */
	@RequestMapping("/trigger")
	ReturnT<String> triggerJob(@RequestParam(value="id",required=true) Integer id, @RequestParam(value="executorParam",required=true)String executorParam);
}