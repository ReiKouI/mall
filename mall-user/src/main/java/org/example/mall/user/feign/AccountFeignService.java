package org.example.mall.user.feign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "mall-account",path = "/account")
public interface AccountFeignService {

    @GetMapping("/update")
    boolean updateAccount();

}
