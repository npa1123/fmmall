package com.hfxt.fmmall.controller;

import com.hfxt.fmmall.entity.User;
import com.hfxt.fmmall.service.UsersService;
import com.hfxt.fmmall.utils.MD5Utils;
import com.hfxt.fmmall.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;

@RestController
@RequestMapping("/user")
@Api(value = "提供用户登录，注册，退出登录",tags = "前台用户管理")
@Slf4j
@CrossOrigin//设置允许跨域
public class UserController {
    @Resource
    private UsersService userService;

    @GetMapping("/login")
    @ApiOperation("用户登录接口")//方法注解：说明接口方法的作用
    @ApiImplicitParams({//说明接口的参数
            @ApiImplicitParam(dataType = "string",name = "username", value = "⽤户登录账号",required = true),
            @ApiImplicitParam(dataType = "string",name = "password", value = "⽤户登录账号",required = true)
    })
    public ResultVO<User> login(@RequestParam("username") String name,
                                @RequestParam(value = "password") String pwd){
        return userService.checkLogin(name, pwd);
    }

    @PostMapping("/regist")
    @ApiOperation("用户注册")//方法注解：说明接口方法的作用
    @ApiImplicitParams({//说明接口的参数
            @ApiImplicitParam(dataType = "string",name = "username", value = "⽤户登录账号",required = true),
            @ApiImplicitParam(dataType = "string",name = "password", value = "⽤户登录账号",required = true)
    })
    public ResultVO<User> regist(@RequestParam("username") String name,
                           @RequestParam(value = "password") String pwd){
        User user=new User();
        user.setUsername(name);
        user.setPassword(MD5Utils.md5(pwd));
        user.setUserImg("img/default.png");
        user.setUserRegtime(new Date());
        user.setUserModtime(new Date());
        return userService.userResgit(user);
    }

}
