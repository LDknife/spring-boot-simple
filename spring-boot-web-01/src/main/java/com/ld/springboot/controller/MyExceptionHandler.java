package com.ld.springboot.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author:ld
 * @create:2018-10-16 14:46
 * @description:
 */
@ControllerAdvice
public class MyExceptionHandler {

    /**
     * 处理所有的异常信息
     * @param e
     * @return
     */
//    @ResponseBody
//    @ExceptionHandler(Exception.class)
//    public Map<String,Object> handlerException(Exception e){
//        Map<String,Object> map = new HashMap<>();
//        map.put("code","userNotExit");
//        map.put("mssage","我报异常了");
//        return map;
//    }

    @ExceptionHandler(Exception.class)
    public String handlerException(Exception e, HttpServletRequest request){
        Map<String,Object> map = new HashMap<>();
        request.setAttribute("javax.servlet.error.status_code",500);
        map.put("code","userNotExit");
        map.put("mssage","我报异常了");
        return "forward:/error";
    }
}
