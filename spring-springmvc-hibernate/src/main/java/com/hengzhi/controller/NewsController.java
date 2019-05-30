package com.hengzhi.controller;/**
 * Created by Administrator on 2019/5/28.
 */

import com.hengzhi.entity.News;
import com.hengzhi.entity.User;
import com.hengzhi.service.NewsService;
import com.hengzhi.service.UserService;
import com.sun.javafx.sg.prism.NGShape;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.persistence.criteria.CriteriaBuilder;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * NewsController
 * Administrator
 * 2019/5/28
 *
 * @Version 1.0
 **/
@Controller
@RequestMapping("news")
public class NewsController {

    @Autowired
    NewsService newsService;
    @Autowired
    UserService userService;

    @RequestMapping(value = "addNews", method = RequestMethod.GET)
    public String addNewsDis(){
        return "news/addNews";
    }

    @RequestMapping(value = "addNews", method = RequestMethod.POST)
    public String addNews(News news, RedirectAttributes redirectAttributes, Model model){
        news.setDate();
        int num = newsService.newNews(news);
        if(num >=1){
            redirectAttributes.addFlashAttribute("info", "添加新闻成功");
            return "redirect:/news/user?page=1";
        }
        model.addAttribute("info","添加新闻失败");
        return "news/addNews";
    }

    @RequestMapping(value = "updateNews/{id}", method = RequestMethod.GET)
    public String updateNewsDis(@PathVariable Integer id, Model model){
        News news = newsService.queryByNewsId(id);
        model.addAttribute("news",news);
        return "news/updateNews";
    }

    @RequestMapping(value = "updateNews", method = RequestMethod.POST)
    public String updateNews(News news, RedirectAttributes redirectAttributes){
        news.setDate();
        newsService.updateNews(news);
        redirectAttributes.addFlashAttribute("info", "更新新闻成功");
        return "redirect:/news/user";
    }

    @RequestMapping(value = "user", method = RequestMethod.GET)
    public String user(HttpSession httpSession, Model model, @RequestParam(defaultValue = "1") Integer page){
        User user = (User)httpSession.getAttribute("user");
        List<News> newses = newsService.queryByUserId(user.getId(),(page-1)*10, 10);
        model.addAttribute("newsList", newses);
        if(newses.size()==0 && page>1){
            page=page-1;
        }
        model.addAttribute("page",page);
        return "news/user";
    }

    @RequestMapping(value = "type/{type}", method = RequestMethod.GET)
    public String user(@PathVariable String type, Model model,@RequestParam(defaultValue = "1") Integer page){
        List<News> newses = newsService.queryByType(type, (page-1)*10, 10);
        if(newses.size()==0 && page>1){
            page=page-1;
        }
        model.addAttribute("newsList", newses);
        model.addAttribute("type",type);
        model.addAttribute("page",page);
        return "news/type";
    }

    @RequestMapping(value = "delete/{id}", method = RequestMethod.GET)
    public String delete(@PathVariable Integer id, RedirectAttributes redirectAttributes, HttpSession httpSession){
        User user = (User)httpSession.getAttribute("user");
        newsService.deleteNews(id);
        redirectAttributes.addFlashAttribute("info", "删除成功");
        List<News> newsList = newsService.queryByUserId(user.getId(),0, 10);
        redirectAttributes.addAttribute("newsList", newsList);
        return "redirect:/news/user";
    }
    @RequestMapping(value = "detail/{id}", method = RequestMethod.GET)
    public String detail(@PathVariable(value = "id")Integer id,Model model){
        News news = newsService.queryByNewsId(id);
        User user = userService.queryUserById(news.getUserId());
        model.addAttribute("news", news);
        model.addAttribute("author", user.getName());
        return "news/detail";
    }
}
