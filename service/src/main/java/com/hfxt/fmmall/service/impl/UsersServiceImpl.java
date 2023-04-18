package com.hfxt.fmmall.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.hfxt.fmmall.dao.UserMapper;
import com.hfxt.fmmall.entity.User;
import com.hfxt.fmmall.service.UsersService;
import com.hfxt.fmmall.utils.MD5Utils;
import com.hfxt.fmmall.vo.ResultVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 *
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UserMapper, User> implements UsersService {
    @Resource
    private UserMapper userMapper;

    /**
     * 用户登录
     * @param username
     * @param pwd
     * @return
     */
    @Override
    public ResultVO<User> checkLogin(String username, String pwd) {
        //根据账号查询用户信息，
        LambdaQueryWrapper<User> queryWrapper=new LambdaQueryWrapper<>();
        queryWrapper.eq(User::getUsername,username);
        User user = this.userMapper.selectOne(queryWrapper);
        //2.判断
        if (user == null) {
            //用户名不存在
            return ResultVO.error("用户名不存在");
        }else {
            //3.对输入的密码进行加密'
            String pwdMd5 = MD5Utils.md5(user.getPassword());
            user.setPassword(pwdMd5);
            //4.使用加密后的密码与user中的密码进行匹配
            if (user.getPassword().equals(pwdMd5)){
                //验证成功
                return ResultVO.success(user,"登录成功");
            }else {
                //密码错误
                return ResultVO.error("密码失败");
            }
        }
    }

    /**
     * 用户注册
     * @param user
     * @return
     */
    @Override
    public ResultVO<User> userResgit(User user) {
        synchronized (this){
            //1.根据用户查询，这个用户是否已经被注册
            LambdaQueryWrapper<User> userWrapper=new LambdaQueryWrapper<>();
            userWrapper.eq(User::getUsername,user.getUsername());
            User userFrom = userMapper.selectOne(userWrapper);
            if (userFrom != null) {
                return ResultVO.error("注册失败,用户名重复");
            }else {
                int insert = userMapper.insert(user);
                if (insert>0) {
                    return ResultVO.success(null,"注册成功");
                }else {
                    return ResultVO.error("注册失败,用户名重复");
                }
            }
        }
    }
}




