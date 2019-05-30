package com.hengzhi.dao.impl;/**
 * Created by Administrator on 2019/5/27.
 */

import com.hengzhi.dao.NewsDao;
import com.hengzhi.entity.News;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * NewDaoImpl
 * Administrator
 * 2019/5/27
 *
 * @Version 1.0
 **/
@Repository
public class NewDaoImpl implements NewsDao {

    @Autowired
    private SessionFactory sessionFactory;

    public int newNews(News news) {
        return (Integer) sessionFactory.getCurrentSession().save(news);
    }

    public void updateNews(News news) {
        sessionFactory.getCurrentSession().update(news);
    }

    public Integer deleteNews(Integer id) {
        String hql = "delete FROM news where id = ?";
        Query query = sessionFactory.getCurrentSession().createSQLQuery(hql);
        query.setInteger(1, id);
        return query.executeUpdate();

    }

    public List<News> queryByUserId(Integer userId, Integer offset, Integer pagesize) {
        String hql = "from News where userId = ?1";
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        query.setInteger(1,userId);
        query.setFirstResult(offset);
        query.setMaxResults(pagesize);
        return query.list();
    }

    public News queryByNewsId(Integer id) {
        String hql = "from News where id = ?1";
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        query.setInteger(1,id);
//        Object s = query.list();
        return (News) query.list().get(0);
    }

    public List<News> queryByType(String type, Integer offset, Integer pagesize) {
        String hql = "from News where type = ?1";
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        query.setString(1,type);
        query.setFirstResult(offset);
        query.setMaxResults(pagesize);
        return query.list();
    }
}
