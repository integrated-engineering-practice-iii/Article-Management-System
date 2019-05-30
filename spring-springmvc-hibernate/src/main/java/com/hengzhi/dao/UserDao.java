package com.hengzhi.dao;/**
 * Created by Administrator on 2019/5/27.
 */

/**
 * UserDao
 * Administrator
 * 2019/5/27
 *
 * @Version 1.0
 **/
import com.hengzhi.entity.User;

import java.util.List;


public interface UserDao {

    public int newUser(User user);
    public void updateUser(User user);
    public User queryUser(String name);
    public User queryUserById(Integer id);
}
