package com.ld.springbootredis;

import com.ld.springbootredis.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootRedisApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootRedisApplication.class, args);
    }

    @Autowired
    private RedisService redisService;

    @Override
    public void run(String... strings) throws Exception {
//        redisService.testAdd("k1","v1");
//        redisService.testSelect("k1");
    }
}
