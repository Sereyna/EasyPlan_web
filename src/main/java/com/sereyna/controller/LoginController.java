package com.sereyna.controller;

import com.sereyna.pojo.User;
import com.sereyna.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("")

public class LoginController {
    @Autowired
    LoginService loginService;

    @RequestMapping("/login")
    public ModelAndView login(User user) throws Exception{
        ModelAndView mav = new ModelAndView();

        boolean is_true_nameAndPd = loginService.checklogin(user);
        if(is_true_nameAndPd)
            mav.setViewName("/todayplan");
        else{
            mav.addObject("message","登录失败");// 放入转发参数
            mav.setViewName("/hello");// 放入jsp路径
        }
        return mav;
    }

}
