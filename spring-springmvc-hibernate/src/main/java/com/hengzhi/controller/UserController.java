package com.hengzhi.controller;/**
 * Created by Administrator on 2019/5/27.
 */

/**
 * UserController
 * Administrator
 * 2019/5/27
 *
 * @Version 1.0
 **/
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import com.hengzhi.entity.User;
import com.hengzhi.service.UserService;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;


@Controller
@RequestMapping(value = "user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value="login",method=RequestMethod.GET)
    public String loginDis(){
        return "user/login";
    }

    @RequestMapping(value="login",method=RequestMethod.POST)
    public String login(User user, HttpSession session, RedirectAttributes redirectAttributes) throws UnsupportedEncodingException {
        User user1 = userService.queryUser(user.getName());
        if(user1 != null && user1.getPassword().equals(user.getPassword())){
            session.setAttribute("user",user1);
            return "redirect:/news/type/"+ URLEncoder.encode("国内","utf-8");
        }else{
            redirectAttributes.addFlashAttribute("info","用户名和密码错误");
            return "redirect:/user/login";
        }
    }

    @RequestMapping(value = "regist", method = RequestMethod.GET)
    public String registDis(){
        return "user/regist";
    }

    @RequestMapping(value = "regist", method = RequestMethod.POST)
    public String regist(User user, RedirectAttributes redirectAttributes, Model model){
        User user1 = userService.queryUser(user.getName());
        if(user1 != null) {
            model.addAttribute("info","已存在用户名");
            return "user/regist";
        }
        int num = userService.newUser(user);
        if(num>=1){
            redirectAttributes.addFlashAttribute("info", "注册成功");
            return "redirect:/user/login";
        }else{
            model.addAttribute("info","注册失败");
            return "user/regist";
        }
    }

    @RequestMapping(value = "update", method = RequestMethod.GET)
    public String updateDis(){
        return "user/update";
    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
    public String update(Model model, RedirectAttributes redirectAttributes,User user) throws UnsupportedEncodingException {
        userService.updateUser(user);
        return "redirect:/news/type/"+ URLEncoder.encode("国内","utf-8");
    }

    @RequestMapping(value = "logout", method = RequestMethod.GET)
    public String logout(HttpSession httpSession, RedirectAttributes redirectAttributes){
        httpSession.removeAttribute("user");
        redirectAttributes.addAttribute("info", "退出成功");
        return "redirect:/user/login";
    }
}
