package com.hfxt.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.hfxt.dao.OrdersMapper;
import com.hfxt.entity.Orders;
import com.hfxt.service.OrdersService;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class OrdersServiceImpl extends ServiceImpl<OrdersMapper, Orders>
    implements OrdersService {

}




