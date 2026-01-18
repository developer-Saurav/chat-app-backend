package com.chatapp.chatapp.repository;

import com.chatapp.chatapp.entity.ChatMessageEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChatMessageRepository extends JpaRepository<ChatMessageEntity, Long> {

    List<ChatMessageEntity> findAllByOrderByTimestampAsc();
}
