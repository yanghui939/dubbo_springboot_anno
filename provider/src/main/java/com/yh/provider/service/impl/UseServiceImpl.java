package com.yh.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.yh.dubbo_interface.service.UserService;
import org.springframework.stereotype.Component;

@Service
@Component
public class UseServiceImpl  implements UserService {
    @Override
    public String hello() {
        return "springboot+dubbo+anno";
    }
}
