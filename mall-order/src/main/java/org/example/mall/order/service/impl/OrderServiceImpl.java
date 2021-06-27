package org.example.mall.order.service.impl;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import lombok.extern.slf4j.Slf4j;
import org.example.mall.order.service.OrderService;
import org.springframework.stereotype.Service;

@Slf4j
@Service("orderService")
public class OrderServiceImpl implements OrderService {

    @Override
    @SentinelResource(value = "createOrder")
    public boolean createOrder() {
        log.info("createOrder!");
        return true;
    }

    @Override
    @SentinelResource(value = "updateOrderStatus")
    public boolean updateOrderStatus() {
        log.info("updateOrderStatus!");
        return true;
    }

}
