package com.hengzhi.service.impl;/**
 * Created by Administrator on 2019/5/27.
 */

/**
 * UserServiceImpl
 * Administrator
 * 2019/5/27
 *
 * @Version 1.0
 **/
import java.util.List;

import com.hengzhi.dao.UserDao;
import com.hengzhi.entity.User;
import com.hengzhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;


    public int newUser(User user) {
        return userDao.newUser(user);
    }

    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    public User queryUser(String name) {
        return userDao.queryUser(name);
    }
    public User queryUserById(Integer id){
        return userDao.queryUserById(id);
    }
}
