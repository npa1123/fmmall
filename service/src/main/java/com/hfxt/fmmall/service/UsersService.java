package com.hfxt.fmmall.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.hfxt.fmmall.entity.User;
import com.hfxt.fmmall.vo.ResultVO;

/**
 *
 */
public interface UsersService extends IService<User> {
    /**
     * 用户登录
     * @param username
     * @param pwd
     * @return
     */
    ResultVO<User> checkLogin(String username, String pwd);

    /**
     * 用户注册
     * @param user
     * @return
     */
    ResultVO<User> userResgit(User user);

}
