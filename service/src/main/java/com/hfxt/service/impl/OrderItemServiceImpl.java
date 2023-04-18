package com.hfxt.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.hfxt.dao.OrderItemMapper;
import com.hfxt.entity.OrderItem;
import com.hfxt.service.OrderItemService;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class OrderItemServiceImpl extends ServiceImpl<OrderItemMapper, OrderItem>
    implements OrderItemService {

}




