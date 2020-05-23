package com.pbl.backend.dao;


import com.pbl.backend.entity.Role;
import com.pbl.backend.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {

    User loadUserByUsername(String username);

    Role findRoleByUserId(Integer id);

    void add(User user);

    //更新用户密码
    Integer updatePasswordOFUser(User user);

    //获取用户旧密码
    String getPassword(User user);

    //上传图片路径
    Integer uploadPhoto(User user);

    //更新图片路径
    Integer updatePhoto(User user);
}
