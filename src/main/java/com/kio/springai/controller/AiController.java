package com.kio.springai.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.ai.client.AiClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: AiController
 * @Description:
 * @author: zongyanan
 * @date: 2025/2/19 17:35
 */
@RestController
@RequiredArgsConstructor
public class AiController {

    private AiClient aiClient;

    public AiController(AiClient aiClient) {
        this.aiClient = aiClient;
    }

    @GetMapping("/api/v1/ai")
    public String ai(@RequestParam(value = "message", defaultValue = "hi") String message) {
        return aiClient.generate(message);
    }
}
