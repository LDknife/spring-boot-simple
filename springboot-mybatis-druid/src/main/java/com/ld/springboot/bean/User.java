package com.ld.springboot.bean;

/**
 * @author:ld
 * @create:2018-11-07 10:53
 * @description: 用户表
 */
public class User {

    private String id;
    private String name;
    private Integer age;
    private String email;
    private String address;
    private Integer sex;

    public User() {
    }

    public User(String id, String name, Integer age, String email, String address, Integer sex) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.address = address;
        this.sex = sex;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }
}
