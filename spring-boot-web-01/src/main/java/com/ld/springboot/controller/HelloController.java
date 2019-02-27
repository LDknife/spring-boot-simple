package com.ld.springboot.controller;

import com.ld.springboot.exception.UserNotExitException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Map;

@Controller
public class HelloController {

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return "Hello spring boot web";
    }

    @RequestMapping("/hello")
    @ResponseBody
    public String hell(){
        throw new UserNotExitException();
    }

    @RequestMapping("/success")
    public String success(Map<String,Object> map){
        map.put("hello","你好");
        ArrayList<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        map.put("list",list);
        return "success";
    }
}
