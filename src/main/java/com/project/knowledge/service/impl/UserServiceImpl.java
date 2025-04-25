package com.project.knowledge.service.impl;

import com.project.knowledge.domain.UserInfo;
import com.project.knowledge.mapper.UserMapper;
import com.project.knowledge.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserMapper mapper;

    @Override
    public UserInfo getUserInfoByName(String name) {
        logger.info("用户信息查询：{}",name);
        return mapper.getUserInfoByName(name);
    }
}
