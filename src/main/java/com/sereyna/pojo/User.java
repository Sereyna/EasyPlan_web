package com.sereyna.pojo;

import org.springframework.stereotype.Component;

/**
 * 用户实体类
 *
 */
@Component
public class User {
    private int userid;
    private String username;
    private String password;

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getUserid() {
        return userid;
    }

    public void setPasswd(String passwd) {
        this.password = passwd;
    }

    public String getPasswd() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}
