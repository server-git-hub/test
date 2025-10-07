package com.server.order.controller;


import com.server.order.entity.Order;
import com.server.order.entity.User;
import com.server.order.service.OrderService;
import com.server.order.vo.OrderVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "/api/order")
public class OrderController {

    @Autowired
    private OrderService orderService ;
    @Autowired
    private RestTemplate restTemplate ;


    @GetMapping(value = "/findOrderByOrderId")
    public OrderVo findOrderByOrderId(@RequestParam Long orderId) {
        Order order = orderService.findOrderByOrderId(orderId);
        OrderVo orderVo = new OrderVo();
        BeanUtils.copyProperties(order, orderVo);
        User user = restTemplate.getForObject("http://spring-cloud-user:8080/api/user/findUserByUserId?id={id}", User.class,order.getUserId());
        orderVo.setUser(user);
        return orderVo;
    }

}