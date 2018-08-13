package com.springboot.dubboclient;

import com.dubbo.beans.User;
import com.springboot.dubboclient.controller.UserController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DubboClientApplicationTests {

    @Autowired
    private UserController controller;

    @Test
    public void contextLoads() {

    }

    @Test
    public void getTest() {
        User user = controller.get();
        System.out.println(user.toString());

    }
}
