package com.chatapp.chatapp.controller;

import com.chatapp.chatapp.entity.ChatMessageEntity;
import com.chatapp.chatapp.service.ChatService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/chat")
public class ChatRestController {

    private final ChatService chatService;

    public ChatRestController(ChatService chatService) {
        this.chatService = chatService;
    }

    @GetMapping("/history")
    public List<ChatMessageEntity> getChatHistory() {
        return chatService.getHistory();
    }
}
