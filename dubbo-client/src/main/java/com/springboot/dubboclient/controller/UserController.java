package com.springboot.dubboclient.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.beans.User;
import com.dubbo.service.IUserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yanghai
 * @date 18-8-2 下午7:56
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Reference(version = "${demo.service.version}",
            application = "${dubbo.application.id}"
            , url = "dubbo://127.0.0.1:20880")
    private IUserService iUserService;

    @RequestMapping("/get")
    public User get() {
        User user = iUserService.get();
        return user;
    }
}
