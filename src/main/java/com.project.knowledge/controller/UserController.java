package com.project.knowledge.controller;

import com.project.knowledge.domain.UserInfo;
import com.project.knowledge.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    /**
     * 查询用户信息
     * @param name
     * @return
     */
    @GetMapping("/getUserInfoByName")
    private UserInfo getUserInfoByName(@RequestParam("name") String name){
        return userService.getUserInfoByName(name);
    }
}
