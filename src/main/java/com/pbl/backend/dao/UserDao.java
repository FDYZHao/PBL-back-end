package com.pbl.backend.dao;


import com.pbl.backend.entity.CourseApply;
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
    Integer updatePasswordOFUser(String id, String passwordNew);

    //获取用户旧密码
    String getPassword(String userId);

    //上传图片路径
    Integer uploadPhoto(String id, String photoPath);

    //更新图片路径
    Integer updatePhoto(String id, String photoPath);

    //获取图片
    String getPhoto(String id);


}
