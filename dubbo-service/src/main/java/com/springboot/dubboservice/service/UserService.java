package com.springboot.dubboservice.service;


import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.beans.User;
import com.dubbo.service.IUserService;

/**
 * @author yanghai
 * @date 18-8-2 下午7:44
 */

@Service(version = "${demo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}")
public class UserService implements IUserService {

    @Override
    public User get() {
        User user = new User();
        user.setName("dubbo");
        user.setAge("23");
        user.setAddress("beijing");
        return user;
    }
}
