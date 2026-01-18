package com.chatapp.chatapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chatapp.chatapp.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
