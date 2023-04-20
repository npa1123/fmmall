package com.hfxt.fmmall.controller;


import com.hfxt.fmmall.vo.ResultVO;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shopcart")
@CrossOrigin//处理前后端分离
@Api(value = "提供购物车页面相关接口",tags = "购物车管理")
public class ShopcartController {

    @GetMapping("/list")
    public ResultVO<String> listCarts(){
        return ResultVO.success(null,"进入到商品页面");
    }

}
