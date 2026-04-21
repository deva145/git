package com.tech.dock.controller;

import com.tech.dock.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/data")
    public String postData(@RequestBody String message){
        return userService.postData(message);
    }

    @GetMapping("/data")
    public String getData(){
        return userService.getData();
    }

}
