package com.nezha;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Service;

/**
 * Created by nezha on 2017/4/29.
 */
//EnableScheduling可是让spring boot自动扫描到定时任务
@EnableScheduling
@Service
public class ScheduleService {
}
