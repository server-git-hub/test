package com.server.user.mapper;


import com.server.user.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    // 根据用户的id查询用户详情
    User findUserByUserId(Long userId) ;

}