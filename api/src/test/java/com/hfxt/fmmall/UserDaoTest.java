package com.hfxt.fmmall;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.hfxt.fmmall.dao.UserDao;
import com.hfxt.fmmall.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest(classes =ApiApplication.class )
public class UserDaoTest {
    @Resource
    private UserDao userDao;

    @Test
    public void queryUserByName(){
        LambdaQueryWrapper<User> queryWrapper=new LambdaQueryWrapper<>();
        queryWrapper.eq(User::getUsername,"admin");
        User user = userDao.selectOne(queryWrapper);
        System.out.println(user);
    }
}