package com.hengzhi.service;/**
 * Created by Administrator on 2019/5/27.
 */

/**
 * UserService
 * Administrator
 * 2019/5/27
 *
 * @Version 1.0
 **/
import com.hengzhi.entity.User;

import java.util.List;

public interface UserService {

    public int newUser(User user);
    public void updateUser(User user);
    public User queryUser(String name);
    public User queryUserById(Integer id);
}
