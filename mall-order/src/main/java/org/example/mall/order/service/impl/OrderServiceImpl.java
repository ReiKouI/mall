package org.example.mall.order.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.example.mall.order.service.OrderService;
import org.springframework.stereotype.Service;

@Slf4j
@Service("orderService")
public class OrderServiceImpl implements OrderService {

    @Override
    public boolean createOrder() {
        log.info("createOrder!");
        return true;
    }

    @Override
    public boolean updateOrderStatus() {
        log.info("updateOrderStatus!");
        return true;
    }

}
