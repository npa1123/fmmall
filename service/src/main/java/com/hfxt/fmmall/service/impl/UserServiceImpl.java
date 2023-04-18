package com.hfxt.fmmall.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hfxt.fmmall.dao.UserDao;
import com.hfxt.fmmall.entity.User;
import com.hfxt.fmmall.service.UserService;
import com.hfxt.fmmall.vo.ResultVO;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public ResultVO<User> checkLogin(String username, String pwd) {
        //根据账号查询用户信息，
        LambdaQueryWrapper<User> queryWrapper=new LambdaQueryWrapper<>();
        queryWrapper.eq(User::getUsername,username);
        User user = this.userDao.selectOne(queryWrapper);
        //2.判断
        if (user == null) {
            //用户名不存在
            return ResultVO.error("用户名不存在");
        }else {
            //3.对输入的密码进行加密
            //4.使用加密后的密码与user中的密码进行匹配
            if (user.getPassword().equals(pwd)){
                 //验证成功
                return ResultVO.success(user,"登录成功");
            }else {
                //密码错误
                return ResultVO.error("密码失败");
            }
        }
    }
}
