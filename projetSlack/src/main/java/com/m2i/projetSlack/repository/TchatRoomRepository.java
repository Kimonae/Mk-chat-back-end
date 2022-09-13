package com.m2i.projetSlack.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.m2i.projetSlack.entity.TchatRoom;


public interface TchatRoomRepository extends JpaRepository<TchatRoom, Integer> {
	
	//@Query("SELECT t.name FROM TchatRoom t WHERE t.chatroom IN :rooms")
	
	//@Query("SELECT t.name FROM TchatRoom t")
	//@Query("SELECT name FROM TchatRoom")
	public List<TchatRoom> getRoomInListChatRoom(@Param("rooms") List<String> RoomName);
	
	
	

	
}
