package com.nezha;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
public class ScheduleApplication {
    //自动加载需要定时任务的服务。
	@Autowired
	ScheduleService scheduleService;

	public static void main(String[] args) {
		SpringApplication.run(ScheduleApplication.class, args);
	}
}
