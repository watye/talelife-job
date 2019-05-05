package com.xxl.job.executor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author xuxueli 2018-10-28 00:38:13
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class XxlJobExecutorApplication {

	public static void main(String[] args) {
        SpringApplication.run(XxlJobExecutorApplication.class, args);
	}

}