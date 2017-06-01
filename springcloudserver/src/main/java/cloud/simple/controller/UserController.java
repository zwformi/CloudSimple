package cloud.simple.controller;

import cloud.simple.entity.User;
import cloud.simple.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2017/5/10.
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value="/user",method= RequestMethod.GET)
    public List<User> readUserInfo(){
        List<User> ls=userService.searchAll();
        return ls;
    }

    @RequestMapping(value = "/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

    @Value("${mysqldb.datasource.url}") String url;
    @RequestMapping("/url")
    public String showurl() {
        return "The url is: " + url;
    }



}
