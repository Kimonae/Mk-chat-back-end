package com.m2i.projetSlack.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.m2i.projetSlack.entity.ChatRoom;



public interface ChatRoomRepository extends  JpaRepository<ChatRoom, Integer> {
	
	@Query("SELECT cr FROM ChatRoom cr WHERE cr.chatroom IN :rooms")
	public List<ChatRoom> getRoomInListChatRoom(@Param("rooms") List<String> RoomName);

}
