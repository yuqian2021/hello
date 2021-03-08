package cn.com.liandi.gbu.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * @author yuqian
 */
import org.springframework.web.bind.annotation.RestController;

import cn.com.liandi.gbu.entity.User;
@RestController
@RequestMapping("/test")
public class TestController {
    @CrossOrigin
    @GetMapping("/getUserInfo")
    public Object getUserInfo(){
        User user = new User();
        user.setId(100);
        user.setName("郭德纲");
        return user;
    }
}