package com.hengzhi.service;

import com.hengzhi.entity.News;

import java.util.List;

/**
 * Created by Administrator on 2019/5/27.
 */
public interface NewsService {
    public int newNews(News news);
    public void updateNews(News news);
    public Integer deleteNews(Integer id);

    public List<News> queryByUserId(Integer userId, Integer offset, Integer pagesize);
    public News queryByNewsId(Integer id);
    public List<News> queryByType(String type, Integer offset, Integer pagesize);
}
