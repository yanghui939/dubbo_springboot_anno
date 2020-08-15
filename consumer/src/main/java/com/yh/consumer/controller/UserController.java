package com.yh.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.yh.dubbo_interface.service.UIService;
import com.yh.dubbo_interface.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Reference
    private UserService userService;
    @Reference
    private UIService uiService;

    @GetMapping("hello")
    public String hello() {
        return userService.hello();
    }

    @GetMapping("sayHello")
    public String sayHello() {
        return uiService.sayHello();
    }
}
