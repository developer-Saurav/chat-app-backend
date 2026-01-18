package com.chatapp.chatapp.service;

import com.chatapp.chatapp.entity.ChatMessageEntity;
import com.chatapp.chatapp.model.ChatMessage;
import com.chatapp.chatapp.repository.ChatMessageRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatService {

    private final ChatMessageRepository repository;

    public ChatService(ChatMessageRepository repository) {
        this.repository = repository;
    }

    // Save message (WebSocket)
    public ChatMessage save(ChatMessage message) {
        ChatMessageEntity entity =
                new ChatMessageEntity(message.getSender(), message.getContent());

        repository.save(entity);
        return message;
    }

    // Fetch chat history (REST API)
    public List<ChatMessageEntity> getHistory() {
        return repository.findAllByOrderByTimestampAsc();
    }
}
