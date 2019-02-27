package com.ld.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author:ld
 * @create:2018-10-15 13:43
 * @description:
 */
@Controller
public class LoginController {

    @PostMapping("/login")
    public String login(String username, String password, HttpServletRequest request, HttpSession session){
        if(!StringUtils.isEmpty(username) && !StringUtils.isEmpty(password) && "123456".equals(password)){
            session.setAttribute("username",username);
            return "redirect:main.html";
        }else{
            request.setAttribute("msg","请重新登陆");
            return "/login";
        }
    }
}
