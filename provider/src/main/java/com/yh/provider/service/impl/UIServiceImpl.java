package com.yh.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.yh.dubbo_interface.service.UIService;
import com.yh.dubbo_interface.service.UserService;
import org.springframework.stereotype.Component;

@Service
@Component
public class UIServiceImpl implements UIService {
    @Override
    public String sayHello() {
        return "springboot+dubbo+an";
    }
}
