package com.ld.starter.service;

import com.ld.starter.bean.HelloProperties;

/**
 * @author:ld
 * @create:2018-11-08 10:02
 * @description:
 */
public class HelloService {

    private HelloProperties helloProperties;

    public HelloProperties getHelloProperties() {
        return helloProperties;
    }

    public void setHelloProperties(HelloProperties helloProperties) {
        this.helloProperties = helloProperties;
    }

    public String sayHello(String name) {
        return helloProperties.getPrefix() + " " + name + " " + helloProperties.getSuffix();
    }
}
