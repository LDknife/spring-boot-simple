package com.ld.starter.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author:ld
 * @create:2018-11-08 9:56
 * @description:
 */
@ConfigurationProperties(prefix = "ld.hello")
public class HelloProperties {

    private String prefix;

    private String suffix;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public HelloProperties() {
    }

    public HelloProperties(String prefix, String suffix) {
        this.prefix = prefix;
        this.suffix = suffix;
    }
}
