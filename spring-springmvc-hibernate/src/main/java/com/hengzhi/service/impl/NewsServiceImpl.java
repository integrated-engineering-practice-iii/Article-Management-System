package com.hengzhi.service.impl;/**
 * Created by Administrator on 2019/5/27.
 */

import com.hengzhi.dao.NewsDao;
import com.hengzhi.entity.News;
import com.hengzhi.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * NewsServiceImpl
 * Administrator
 * 2019/5/27
 *
 * @Version 1.0
 **/
@Transactional
@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    private NewsDao newsDao;

    public int newNews(News news) {
        return newsDao.newNews(news);
    }

    public void updateNews(News news) {
        newsDao.updateNews(news);
    }

    public Integer deleteNews(Integer id) {
        return newsDao.deleteNews(id);
    }

    public List<News> queryByUserId(Integer userId, Integer offset, Integer pagesize) {
        return newsDao.queryByUserId(userId, offset, pagesize);
    }

    public News queryByNewsId(Integer id) {
        return newsDao.queryByNewsId(id);
    }

    public List<News> queryByType(String type, Integer offset, Integer pagesize) {
        return newsDao.queryByType(type, offset, pagesize);
    }
}
