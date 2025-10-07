package com.server.order.service;


import com.server.order.entity.Order;

public interface OrderService {

    // 根据订单的id查询订单数据
    Order findOrderByOrderId(Long orderId) ;

}