package com.ld.springboot.mapper;

import com.ld.springboot.bean.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

/**
 * @author:ld
 * @create:2018-11-07 10:54
 * @description: 用户表持久层接口
 */
//@Mapper
public interface UserMapper {

    @Select("SELECT * FROM user WHERE id = #{id}")
    User findUserById(String id);

    @Insert("INSERT INTO user (id,name,age,email,address,sex) values (#{id},#{name},#{age},#{email},#{address},#{sex})")
    Integer addUser(User user);

}
