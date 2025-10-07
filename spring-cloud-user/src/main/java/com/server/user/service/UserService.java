package com.server.user.service;

import com.server.user.entity.User;

public interface UserService {

    // 根据用户的id查询用户详情
    User findUserByUserId(Long userId);

}