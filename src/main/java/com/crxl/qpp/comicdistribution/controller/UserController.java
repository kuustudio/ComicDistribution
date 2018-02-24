package com.crxl.qpp.comicdistribution.controller;

import com.crxl.qpp.comicdistribution.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserServiceImpl userServiceImpl;

    @RequestMapping(value = "/selectById",method = RequestMethod.GET)
    public UserEntity select(String userId){
       return userServiceImpl.select(userId);
    }

}
