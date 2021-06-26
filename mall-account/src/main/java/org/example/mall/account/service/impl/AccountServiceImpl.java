package org.example.mall.account.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.example.mall.account.service.AccountService;
import org.springframework.stereotype.Service;

@Service("orderService")
@Slf4j
public class AccountServiceImpl implements AccountService {

    @Override
    public boolean updateAccount() {
        log.info("updateAccount!");
        return true;
    }

}
