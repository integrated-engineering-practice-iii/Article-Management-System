package com.hengzhi.dao.impl;/**
 * Created by Administrator on 2019/5/27.
 */

import com.hengzhi.dao.UserDao;
import com.hengzhi.entity.User;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

/**
 * UserDaoImpl
 * Administrator
 * 2019/5/27
 *
 * @Version 1.0
 **/
@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private SessionFactory sessionFactory;


    public int newUser(User user) {
       return (Integer) sessionFactory.getCurrentSession().save(user);
    }

    public void updateUser(User user) {
        sessionFactory.getCurrentSession().update(user);
    }

    public User queryUser(String name) {
        String hql = "from User where name = ?1";

        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        query.setString(1,name);
        List<User> userList = query.list();
        if(userList.size()>=1)
            return (User) query.list().get(0);
        else
            return null;
    }

    public User queryUserById(Integer id){
        String hql = "from User where id = ?1";

        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        query.setInteger(1,id);
        List<User> userList = query.list();
        if(userList.size()>=1)
            return (User) query.list().get(0);
        else
            return null;
    }
}
