package org.example.mall.user.controller;


import org.example.mall.user.feign.AccountFeignService;
import org.example.mall.user.feign.OrderFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private OrderFeignService orderFeignService;

    @Autowired
    private AccountFeignService accountFeignService;

    @GetMapping(value = "/buy/product/{id}")
    public boolean shop() {
        boolean orderResult = orderFeignService.createOrder();
        if (!orderResult)
            return false;

        boolean accountResult = accountFeignService.updateAccount();
        if (!accountResult)
            return false;

        return orderFeignService.updateOrderStatus();
    }




}
