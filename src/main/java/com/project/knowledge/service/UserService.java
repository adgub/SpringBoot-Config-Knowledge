package com.project.knowledge.service;

import com.project.knowledge.domain.UserInfo;
import org.springframework.stereotype.Service;

public interface UserService {

    /**
     * 通过用户名查询用户信息
     * @param name
     * @return
     */
    public UserInfo getUserInfoByName(String name);

}
