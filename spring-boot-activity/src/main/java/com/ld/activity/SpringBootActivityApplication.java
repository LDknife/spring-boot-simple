package com.ld.activity;

import org.activiti.spring.boot.SecurityAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration(exclude={org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class, org.activiti.spring.boot.SecurityAutoConfiguration.class})
@SpringBootApplication
public class SpringBootActivityApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootActivityApplication.class, args);
    }
}
