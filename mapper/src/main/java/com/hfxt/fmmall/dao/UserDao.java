package com.hfxt.fmmall.dao;

import com.hfxt.fmmall.entity.User;

public interface UserDao {

    User queryUserByName(String name);
}
