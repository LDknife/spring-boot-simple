package com.ld.task.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author:ld
 * @create:2018-11-15 10:23
 * @description:
 */
@Component
public class TestTask {

    @Scheduled(cron = "*/2 * * * * *")
    public void task(){
        System.out.println("我执行了。。。");
    }
}
