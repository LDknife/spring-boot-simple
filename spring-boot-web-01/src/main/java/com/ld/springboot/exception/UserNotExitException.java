package com.ld.springboot.exception;

/**
 * @author:ld
 * @create:2018-10-16 14:41
 * @description:
 */
public class UserNotExitException extends RuntimeException{

    public UserNotExitException(){
        super("用户不存在");
    }
}
