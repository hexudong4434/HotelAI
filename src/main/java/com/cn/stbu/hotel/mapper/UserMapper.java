package com.cn.stbu.hotel.mapper;

import com.cn.stbu.hotel.domain.Users;

import java.util.List;

/**
 * @Author: yaya
 * @Description:
 * @Date: Create in 下午 02:32 2020/2/12
 */
public interface UserMapper {
    List<Users> getUsers();

    Users getUserById(int id);

    int addUser(Users user);

    int delUser(int id);

    int updateUser(Users user);
}
