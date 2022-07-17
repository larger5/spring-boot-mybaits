package com.example.itspringbootmybatis.mapper;

import com.example.itspringbootmybatis.domain.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author hongcunlin
 */
@Mapper
@Component
public interface UserInfoMapper {
    /**
     * 获取所有用户信息
     *
     * @return 用户
     */
    List<UserInfo> getAll();
}
