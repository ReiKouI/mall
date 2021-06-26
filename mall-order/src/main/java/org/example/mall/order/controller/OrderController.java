package org.example.mall.order.controller;

import org.example.mall.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/create")
    public boolean createOrder() {
        return orderService.createOrder();
    }

    @GetMapping("/update")
    public boolean updateOrderStatus() {
        return orderService.updateOrderStatus();
    }

}
