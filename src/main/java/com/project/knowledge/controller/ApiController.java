package com.project.knowledge.controller;

import com.project.knowledge.service.DeepSeekService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @Autowired
    private DeepSeekService deepSeekService;

    @PostMapping("/chat")
    public String chatEndpoint(@Param("prompt") String prompt) {
        return deepSeekService.getChatResponse(prompt);
    }
}
