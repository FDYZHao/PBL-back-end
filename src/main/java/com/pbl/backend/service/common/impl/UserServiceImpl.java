package com.pbl.backend.service.impl;

import com.pbl.backend.dao.UserDao;
import com.pbl.backend.entity.User;
import com.pbl.backend.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: 杜东方
 * @date: 2020/5/17
 * @description:
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    UserDao userDao;

    @Override
    public void addUser(User user){

    }

    //更新用户密码
    @Override
    public boolean updatePasswordOFUser(User user){
        //确认旧密码是否正确
        String password_old = getPassword(user);

        if(password_old.equals(user.getPassword_new())){
            //成功更改
            if(userDao.updatePasswordOFUser(user) > 0){
                return true;
            }
        }
        return false;
    }

    //获取用户密码
    @Override
    public String getPassword(User user) {
        return userDao.getPassword(user);
    }

    @Override
    public boolean upLoadPhoto( User user) {

        if(userDao.uploadPhoto(user)>0){
            return true;
        }
        return false;
    }

    @Override
    public boolean updatePhoto(User user) {
        if(userDao.updatePhoto(user)>0){
            return true;
        }
        return false;
    }
}
