package com.sereyna.service.impl;

import com.sereyna.mapper.LoginMapper;
import com.sereyna.pojo.User;
import com.sereyna.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    LoginMapper loginMapper;

    //验证用户名和密码
    public boolean checklogin(User user){
        try{
            return user.getPasswd().equals(loginMapper.get(user.getUsername()).getPasswd());
        }catch (Exception NullPointerException){
            return false;
        }
    }
}
