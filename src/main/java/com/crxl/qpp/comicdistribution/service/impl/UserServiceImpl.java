package com.crxl.qpp.comicdistribution.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl {

    @Autowired
    private UserEntityMapper userEntityMapper;

    @Transactional(propagation = Propagation.SUPPORTS)
    public UserEntity select(String userId){
        return userEntityMapper.selectByPrimaryKey(userId);
    }


}
