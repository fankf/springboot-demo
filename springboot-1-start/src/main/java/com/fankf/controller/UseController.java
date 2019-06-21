package com.fankf.controller;

import com.fankf.bean.User;
import com.fankf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @Author fankunfeng
 * @Date 2019-06-21 19:46:24
 * @Describe 基本CRUD
 */
@Controller
@RequestMapping(value = "/user")
public class UseController {
    @Autowired
    private UserService userService;

    @RequestMapping("add")
    public String addUseInfo(@RequestBody User user) {
        int i = userService.addUserInfo(user);
        if (i > 0) {
            return "success";
        }
        return "failure";
    }

    @RequestMapping("delete")
    public String deleteUseInfo(@RequestParam(value = "userId") String userId) {
        int i = userService.deleteUserInfo(userId);
        if (i > 0) {
            return "success";
        }
        return "failure";
    }

    @RequestMapping("update")
    public User updateUseInfo(@RequestBody User user) {
        User user1 = userService.updateUserInfo(user);
        return user1;
    }

    @RequestMapping("query")
    public User queryUseInfo(String userId) {
        User user = userService.queryUserInfo(userId);
        return user;
    }

    @RequestMapping("queryAll")
    public List<User> queryAllUseInfo() {
        List<User> users = userService.queryAllUserInfo();
        return users;
    }

}
