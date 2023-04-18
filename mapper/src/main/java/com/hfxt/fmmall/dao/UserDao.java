package com.hfxt.fmmall.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hfxt.fmmall.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao extends BaseMapper<User> {

    User queryUserByName(String name);
}
