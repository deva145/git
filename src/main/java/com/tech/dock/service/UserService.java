package com.tech.dock.service;

import org.springframework.stereotype.Service;

import java.security.Provider;

@Service
public class UserService {
    public String postData(String message){
        return message;
    }

    public String getData(){
        return "Data Received";
    }
}
