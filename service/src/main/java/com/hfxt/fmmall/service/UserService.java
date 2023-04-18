package com.hfxt.fmmall.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hfxt.fmmall.entity.User;
import com.hfxt.fmmall.vo.ResultVO;

public interface UserService extends IService<User> {

    ResultVO<User> checkLogin(String username, String pwd);
}
