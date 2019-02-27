package com.ld.springboot.component;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author:ld
 * @create:2018-10-15 13:55
 * @description: 拦截器
 */
public class LoginHandlerInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object username = request.getSession().getAttribute("username");
        if(username == null){
            request.setAttribute("msg","没有权限，请重新登陆");
            request.getRequestDispatcher("/index.html").forward(request,response);
            return false;
        }else{

            return true;
        }
    }
}
