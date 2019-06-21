package com.fankf.service.impl;

import com.fankf.bean.User;
import com.fankf.service.UserService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author fankunfeng
 * @Date 2019-06-21 20:05:51
 * @Describe
 */
@Service
public class UserServiceImpl implements UserService {

    private Map<String,User> map = new HashMap<>();

    @Override
    public int addUserInfo(User user) {
        User put = map.put(user.getUserId(), user);
        if(put !=null){
            return 1;
        }
        return 0;
    }

    @Override
    public int deleteUserInfo(String userId) {
        User remove = map.remove(userId);
        if(remove != null){
            return 1;
        }
        return 0;
    }

    @Override
    public User updateUserInfo(User user) {
        User put = map.put(user.getUserId(), user);
        if(put !=null){
            return put;
        }
        return null;
    }

    @Override
    public User queryUserInfo(String userId) {
        User user = map.get(userId);
        return user;
    }

    @Override
    public List<User> queryAllUserInfo() {
        List<User> values = (List<User>) map.values();
        return values;
    }
}
