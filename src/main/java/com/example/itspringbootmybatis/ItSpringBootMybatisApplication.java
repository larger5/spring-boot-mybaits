package com.example.itspringbootmybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author hongcunlin
 */
@MapperScan(basePackages = {"com.example.itspringbootmybatis.mapper"})
@SpringBootApplication
public class ItSpringBootMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(ItSpringBootMybatisApplication.class, args);
    }

}
