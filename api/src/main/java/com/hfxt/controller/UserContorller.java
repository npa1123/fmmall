package com.hfxt.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.hfxt.entity.Users;
import com.hfxt.service.UsersService;
import com.hfxt.vo.ResultVO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserContorller {

    @Resource
    private UsersService usersService;

    @PostMapping("/login")
    public ResultVO login( @RequestBody Users users,ResultVO resultVO){
        LambdaQueryWrapper<Users> queryWrapper=new LambdaQueryWrapper<>();
        queryWrapper.eq(Users::getUsername,users.getUsername());

        Users usersone = usersService.getOne(queryWrapper);
        if (usersone==null){
            resultVO.setCode(10001);
            resultVO.setMsg("用户名不存在");

            return resultVO;
        }
        System.out.println(users.getPassword());
        if (!usersone.getPassword().equals(users.getPassword())){
            resultVO.setCode(10001);
            resultVO.setMsg("密码错误");
            return resultVO;
        }

        resultVO.setCode(1000);
        resultVO.setMsg("登录成功");
        resultVO.setData(usersone);

        return resultVO;

    }



}
