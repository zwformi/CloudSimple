package com.zw.controller;

import com.zw.entity.User;
import com.zw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2017/5/16.
 */
@RestController
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value="/users",method= RequestMethod.GET)
    public ResponseEntity<List<User>> readUserInfo(){
        System.out.println("======c_start=====");
        System.out.println("已进入controller层");
        List<User> users=userService.readUserInfo();
        System.out.println("======c_end=====");
        return new ResponseEntity<List<User>>(users, HttpStatus.OK);
    }
    @RequestMapping(value = "/home")
    @ResponseBody
    String home() {
        return "Hello World!";
    }
}
