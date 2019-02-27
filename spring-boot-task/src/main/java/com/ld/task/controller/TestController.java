package com.ld.task.controller;

import com.ld.task.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:ld
 * @create:2018-11-15 10:17
 * @description:
 */
@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("/testAsync")
    public String testAsync(){
        testService.testAsync();
        return "success";
    }
}
