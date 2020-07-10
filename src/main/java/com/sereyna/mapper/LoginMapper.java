package com.sereyna.mapper;

import com.sereyna.pojo.User;

public interface LoginMapper {


    public int add(User user);

    public void delete(int id);

    public int update(User user);

    public User get(String name);
}
