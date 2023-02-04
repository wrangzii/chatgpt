package io.github.chatgpt.service;

import io.github.chatgpt.dto.ChatRequest;
import io.github.chatgpt.dto.ChatResponse;

public interface ChatGPTService {

    String sendMessage(String message);

    ChatResponse sendChatRequest(ChatRequest request);

}
