package com.hfxt.fmmall.controller;

import com.hfxt.fmmall.entity.User;
import com.hfxt.fmmall.service.UserService;
import com.hfxt.fmmall.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
@Api(value = "提供用户登录，注册，退出登录",tags = "前台用户管理")
@Slf4j
public class UserController {
    @Resource
    private UserService userService;

    @GetMapping("/login")
    @ApiOperation("用户登录接口")//方法注解：说明接口方法的作用
    @ApiImplicitParams({//说明接口的参数
            @ApiImplicitParam(dataType = "string",name = "username", value =
                    "⽤户登录账号",required = true),
            @ApiImplicitParam(dataType = "string",name = "password", value =
                    "⽤户登录密码",required = false,defaultValue = "111111")
    })
    public ResultVO<User> login(@RequestParam("username") String name,
                                @RequestParam(value = "password",defaultValue = "123456") String pwd){
        return userService.checkLogin(name, pwd);
    }

    @PostMapping("/regist")
    public ResultVO regist(User user){
        log.info("user,{}",user);
        return ResultVO.success(new User(),"SUCCESS");
    }


}
