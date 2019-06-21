package com.fankf.bean;


import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @Author fankunfeng
 * @Date 2019-06-21 19:49:20
 * @Describe
 */
@Setter
@Getter
public class User {
    private String userId;
    private String username;
    private String password;
    private Date createTime;
    private Date updateTime;
}
