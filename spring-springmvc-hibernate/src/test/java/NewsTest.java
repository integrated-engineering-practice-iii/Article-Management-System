/**
 * Created by Administrator on 2019/5/27.
 */

import com.hengzhi.dao.NewsDao;
import com.hengzhi.entity.News;
import com.hengzhi.service.NewsService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

/**
 * NewsTest
 * Administrator
 * 2019/5/27
 *
 * @Version 1.0
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-common.xml"})
public class NewsTest {
    @Autowired
    NewsService newsService;
    @Test
    public void newNews(){
        int s = newsService.newNews(new News("1",1,"1","1",true));
        Assert.assertTrue(s>=1);
    }
    @Test
    public void deleteNews(){
        int s = newsService.deleteNews(1);
        Assert.assertTrue(s>=1);
    }
    @Test
    public void updateNews(){
        newsService.updateNews(new News(2,"2",2,"2","2",false));
    }
    @Test
    public void queryByNewsId(){
        News news = newsService.queryByNewsId(2);
        System.out.println(news);
    }
    @Test
    public void queryByUserId() {
        List<News> newsList = newsService.queryByUserId(1,1,2);
        for(News news: newsList){
            System.out.println(news);
        }
    }
    @Test
    public void queryByType(){
        List<News> newsList = newsService.queryByType("1",1,1);
        for(News news: newsList){
            System.out.println(news);
        }
    }
}
