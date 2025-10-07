package com.server.user.controller;


import com.server.user.entity.User;
import com.server.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    UserService userService;
    @Value("${server.port}")
    private String port;

    @GetMapping("/findUserByUserId")
    public User findUserByUserId(@RequestParam Long id) {
        User user=userService.findUserByUserId(id);
        user.setUserName(user.getUserName()+":"+port);
        return user;
    }
}
