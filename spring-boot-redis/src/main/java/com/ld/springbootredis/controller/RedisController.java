package com.ld.springbootredis.controller;

import com.ld.springbootredis.Person;
import com.ld.springbootredis.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:ld
 * @create:2018-11-23 15:40
 * @description:
 */
@RestController
public class RedisController {

    @Autowired
    private RedisService redisService;

    @GetMapping("/get/{key}")
    public String get(@PathVariable("key") String key){
        return redisService.testSelect(key);
    }

    @GetMapping("/set")
    public void set(){
        Person person = new Person();
        person.setId(1);
        person.setName("monkey");
        person.setAge(12);
        person.setEmail("11@qq.com");
        person.setAddress("南京");
        redisService.add(person);
    }
}
