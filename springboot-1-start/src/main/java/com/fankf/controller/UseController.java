package com.fankf.controller;

import com.fankf.bean.User;
import com.fankf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author fankunfeng
 * @Date 2019-06-21 19:46:24
 * @Describe 基本CRUD
 */
@RestController
public class UseController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "add",method = RequestMethod.POST)
    public String addUseInfo(@RequestBody User user) {
        int i = userService.addUserInfo(user);
        if (i > 0) {
            return "success";
        }
        return "failure";
    }

    @RequestMapping(value = "delete",method = RequestMethod.GET)
    public String deleteUseInfo(@RequestParam(value = "userId") String userId) {
        int i = userService.deleteUserInfo(userId);
        if (i > 0) {
            return "success";
        }
        return "failure";
    }

    @RequestMapping(value = "update",method = RequestMethod.POST)
    public String updateUseInfo(@RequestBody User user) {
        User user1 = userService.updateUserInfo(user);
        if(user1 == null){
            return "未查询到数据！";
        }
        return user1.toString();
    }

    @RequestMapping(value = "query",method = RequestMethod.POST)
    public String queryUseInfo(String userId) {
        User user = userService.queryUserInfo(userId);
        if( user == null ){
            return "未查询到数据！";
        }
        return user.toString();
    }

    @RequestMapping(value = "queryAll",method = RequestMethod.GET)
    public List<User> queryAllUseInfo() {
        List<User> users = userService.queryAllUserInfo();
        return users;
    }

}
