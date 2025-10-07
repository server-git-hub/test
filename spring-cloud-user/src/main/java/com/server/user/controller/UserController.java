package com.server.user.controller;


import com.server.user.entity.User;
import com.server.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/findUserByUserId")
    public User findUserByUserId(@RequestParam Long id) {
        return userService.findUserByUserId(id);
    }
}
