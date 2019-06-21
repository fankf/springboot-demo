package com.fankf.service;

import com.fankf.bean.User;

import java.util.List;

/**
 * @Author fankunfeng
 * @Date 2019-06-21 20:02:33
 * @Describe
 */
public interface UserService {
    int addUserInfo(User user);

    int deleteUserInfo(String userId);

    User updateUserInfo(User user);

    User queryUserInfo(String userId);

    List<User> queryAllUserInfo();
}
