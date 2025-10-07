package com.server.order.vo;

import com.server.order.entity.Order;
import com.server.order.entity.User;
import lombok.Data;

@Data
public class OrderVo extends Order {

    private User user;
}
