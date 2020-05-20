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
}
