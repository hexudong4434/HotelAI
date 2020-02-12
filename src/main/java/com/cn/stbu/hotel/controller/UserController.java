package com.cn.stbu.hotel.controller;

import com.cn.stbu.hotel.domain.User;
import com.cn.stbu.hotel.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: yaya
 * @Description:
 * @Date: Create in 下午 02:38 2020/2/12
 */
@RestController
public class UserController {

    @Autowired
    UserMapper userMapper;
    @RequestMapping("/users")
    public List<User> getUser(){
        List<User> list;
        list=userMapper.getUsers();
        return list;
    }
}
