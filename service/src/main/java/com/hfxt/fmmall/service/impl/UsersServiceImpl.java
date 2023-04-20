package com.hfxt.fmmall.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.hfxt.fmmall.dao.UserMapper;
import com.hfxt.fmmall.entity.User;
import com.hfxt.fmmall.service.UsersService;
import com.hfxt.fmmall.utils.Base64Utils;
import com.hfxt.fmmall.utils.MD5Utils;
import com.hfxt.fmmall.vo.ResultVO;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;

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
            String pwdMd5 = MD5Utils.md5(pwd);
            //4.使用加密后的密码与user中的密码进行匹配
            if (user.getPassword().equals(pwdMd5)){
                //如果登录成功，则需要生成令牌token，（token就是按照特定规则生成的字符串）
                //String token= Base64Utils.encode(username+123456);
                JwtBuilder builder = Jwts.builder();
                HashMap<String,Object> map=new HashMap<>();
                map.put("key1","value1");
                map.put("key2","value2");
                String token = builder.setSubject(username)    //主题：就是token中携带的数据
                        .setIssuedAt(new Date())               //设置token的生成时间
                        .setId(user.getUserId() + "")          //设置用户id为token_id
                        .setClaims(map)                        //map中可以存放用户的角色权限信息
                        .setExpiration(new Date(System.currentTimeMillis() + 24 * 60 * 60 * 1000))  //设置过期时间
                        .signWith(SignatureAlgorithm.HS256, "123456")//设置加密方式和加密密码
                        .compact();
                //验证成功
                return ResultVO.success(user,token);
            }else {
                //密码错误
                return ResultVO.error("登录失败，密码错误");
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




