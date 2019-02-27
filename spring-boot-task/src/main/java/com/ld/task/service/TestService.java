package com.ld.task.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author:ld
 * @create:2018-11-15 10:18
 * @description:
 */
@Service
public class TestService {

    //异步任务
    @Async
    public void testAsync(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("成功了");
    }
}
