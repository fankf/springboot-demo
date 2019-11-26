package com.fankf.service.impl;

import com.fankf.bean.User;
import com.fankf.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author fankunfeng
 * @Date 2019-06-21 20:05:51
 * @Describe
 */
@Service
@Slf4j
public class UserServiceImpl implements UserService {
    public static final String className = "UserServiceImpl";
    private Map<String,User> map = new HashMap<>();

    @Override
    public int addUserInfo(User user) {
        log.info("{}: 放入map的参数 :{}",className,user);
        User put = map.put(user.getUserId(), user);
        if(put !=null){
            return 1;
        }
        return 0;
    }

    @Override
    public int deleteUserInfo(String userId) {
        log.info("{}: map的参数 :{}",className,userId);
        User remove = map.remove(userId);
        if(remove != null){
            return 1;
        }
        return 0;
    }

    @Override
    public User updateUserInfo(User user) {
        log.info("{}: 放入map的参数 :{}",className,user);
        User put = map.put(user.getUserId(), user);
        if(put !=null){
            return put;
        }
        return null;
    }

    @Override
    public User queryUserInfo(String userId) {
        log.info("{}: 放入map的参数 :{}",className,userId);
        User user = map.get(userId);
        return user;
    }

    @Override
    public List<User> queryAllUserInfo() {
        List<User> values = new ArrayList<>();
        for (String key : map.keySet()) {
            values.add(map.get(key));
        }
        return values;
    }
}
