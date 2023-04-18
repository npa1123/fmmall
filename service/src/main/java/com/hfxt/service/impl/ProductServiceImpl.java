package com.hfxt.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.hfxt.dao.ProductMapper;
import com.hfxt.entity.Product;
import com.hfxt.service.ProductService;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product>
    implements ProductService {

}




