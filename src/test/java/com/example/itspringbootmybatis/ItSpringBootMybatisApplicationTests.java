package com.example.itspringbootmybatis;

import com.example.itspringbootmybatis.mapper.UserInfoMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class ItSpringBootMybatisApplicationTests {
    @Resource
    private UserInfoMapper userInfoMapper;

    @Test
    void contextLoads() {
        System.out.println(userInfoMapper.getAll());
    }
}
