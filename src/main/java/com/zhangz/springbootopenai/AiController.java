package com.zhangz.springbootopenai;

import org.springframework.ai.client.AiClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AiController {
    private final AiClient aiClient;

    @Autowired
    public AiController(AiClient aiClient) {
        this.aiClient = aiClient;
    }

    @GetMapping("/ai")
    public Completion completion(@RequestParam(value = "message", defaultValue = "请告诉我前端开发常用的开发语言有哪些？") String message) {
        return new Completion(aiClient.generate(message));
    }
}
