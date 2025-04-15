package com.project.knowledge.service.impl;

import com.project.knowledge.domain.UserInfo;
import com.project.knowledge.mapper.UserMapper;
import com.project.knowledge.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper mapper;

    @Override
    public UserInfo getUserInfoByName(String name) {
        return mapper.getUserInfoByName(name);
    }
}
