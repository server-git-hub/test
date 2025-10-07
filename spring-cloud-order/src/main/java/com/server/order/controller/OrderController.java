package com.server.order.controller;


import com.server.order.entity.Order;
import com.server.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/order")
public class OrderController {

    @Autowired
    private OrderService orderService ;

    @GetMapping(value = "/findOrderByOrderId")
    public Order findOrderByOrderId(@RequestParam Long orderId) {
        return orderService.findOrderByOrderId(orderId) ;
    }

}