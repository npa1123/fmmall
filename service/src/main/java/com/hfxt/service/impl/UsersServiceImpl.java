package com.hfxt.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.hfxt.dao.UsersMapper;
import com.hfxt.entity.Users;
import com.hfxt.service.UsersService;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users>
    implements UsersService {

}




