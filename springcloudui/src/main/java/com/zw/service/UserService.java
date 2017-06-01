package com.zw.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zw.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/5/16.
 */
@Service
public class UserService {
    @Autowired
    RestTemplate restTemplate;

    final String SERVICE_NAME="cloud-simple-service";

    @HystrixCommand(fallbackMethod = "fallbackSearchAll")
    public List<User> readUserInfo() {
        System.out.println("已进入service层");
        return restTemplate.getForObject("http://"+SERVICE_NAME+"/user", List.class);
        //return feignUserService.readUserInfo();
    }
    private List<User> fallbackSearchAll() {
        System.out.println("HystrixCommand fallbackMethod handle!");
        List<User> ls = new ArrayList<User>();
        User user = new User();
        user.setUser_name("TestHystrixCommand");
        ls.add(user);
        return ls;
    }
}
