package com.project.knowledge.service.impl;

import com.project.knowledge.dto.ChatRequest;
import com.project.knowledge.dto.ChatResponse;
import com.project.knowledge.service.DeepSeekService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.LinkedList;
import java.util.List;

@Service
public class DeepSeekServiceImpl implements DeepSeekService {

    @Value("${deepseek.api.url}")
    private String apiUrl;

    @Value("${deepseek.api.key}")
    private String apiKey;

    @Value("${deepseek.api.model}")
    private String apiModel;

    @Value("${deepseek.api.temperature}")
    private double temperature;

    @Override
    public String getChatResponse(String prompt) {

        // 构建请求头
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        headers.setBearerAuth(apiKey);

        // 构建请求体
        ChatRequest request = new ChatRequest();
        request.setModel(apiModel);
        List<ChatRequest.Message> list = new LinkedList();
        list.add(new ChatRequest.Message("user",prompt));
        request.setMessages(list);
        request.setTemperature(temperature);

        // 发送请求
        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<ChatRequest> entity = new HttpEntity<>(request, headers);
        ResponseEntity<ChatResponse> response = restTemplate.exchange(
                apiUrl,
                HttpMethod.POST,
                entity,
                ChatResponse.class
        );

        // 处理响应
        if (response.getStatusCode().is2xxSuccessful() &&
                response.getBody() != null &&
                !response.getBody().getChoices().isEmpty()) {
            return response.getBody().getChoices().get(0).getMessage().getContent();
        }
        return "无法获取有效响应";
    }
}
