package com.m2i.projetSlack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import com.m2i.projetSlack.entity.ChatRoom;
import com.m2i.projetSlack.repository.ChatRoomRepository;



public class ChatRoomService {

	
	@Autowired
	ChatRoomRepository repo;
	

	
	//get room
	public List<ChatRoom> getChatRoom(){
		return repo.findAll();
	}
	
	
	//post room
	
	public ChatRoom postChatRoom (ChatRoom rooms) {
		return repo.save(rooms);		
	}
	
	
	// put room
	
	
	
	//delete room
}
