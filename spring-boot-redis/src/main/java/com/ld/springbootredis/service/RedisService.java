package com.ld.springbootredis.service;

import com.ld.springbootredis.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

/**
 * @author:ld
 * @create:2018-11-23 15:31
 * @description:
 */
@Service
public class RedisService {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    public void testAdd(String key,String value){
        ValueOperations<String, String> ops = stringRedisTemplate.opsForValue();
        ops.set(key,value);
    }

    public String testSelect(String key){
        ValueOperations<String, String> ops = stringRedisTemplate.opsForValue();
        String value = ops.get(key);
        System.out.println(value);
        return value;
    }

    @Autowired
    private RedisTemplate<String,Object> redisTemplate;

    public void add(Person person){
        ValueOperations<String, Object> ops = redisTemplate.opsForValue();
        ops.set(person.getId()+"",person);
    }
}
