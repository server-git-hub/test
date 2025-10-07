package com.server.order.mapper;


import com.server.order.entity.Order;
import org.apache.ibatis.annotations.Mapper;

@Mapper  // 该注解可以通过在启动类上的@MapperScan注解进行替换
public interface OrderMapper {

    // 根据订单的id查询订单数据
    Order findOrderByOrderId(Long orderId) ;

}