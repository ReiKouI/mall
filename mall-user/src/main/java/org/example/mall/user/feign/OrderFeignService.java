package org.example.mall.user.feign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "mall-order",path = "/order")
public interface OrderFeignService {

    @GetMapping("/create")
    boolean createOrder();

    @GetMapping("/update")
    boolean updateOrderStatus();

}
