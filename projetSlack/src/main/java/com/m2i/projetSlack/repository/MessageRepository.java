package com.m2i.projetSlack.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.m2i.projetSlack.entity.Message;

public interface MessageRepository extends JpaRepository<Message, Integer> {

}
