package com.ld.springboot.controller;

import com.ld.springboot.bean.User;
import com.ld.springboot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

/**
 * @author:ld
 * @create:2018-11-07 11:15
 * @description:
 */
@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/user/{id}")
    public User getUserById(@PathVariable("id") String id){
        User user = userMapper.findUserById(id);
        return user;
    }
}
