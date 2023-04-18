package com.hfxt.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hfxt.dao.CategoryMapper;
import com.hfxt.entity.Category;
import com.hfxt.service.CategoryService;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category>
    implements CategoryService {

}




