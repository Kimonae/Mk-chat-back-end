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
	
	public ChatRoom putChatRoom(ChatRoom rooms) {
		ChatRoom newChatRoom = repo.findById(rooms.getId()).orElse(null);
		if (newChatRoom != null) {
			newChatRoom.setCreationDate( rooms.getCreationDate());
			newChatRoom.setName( rooms.getName());			
			repo.save(newChatRoom);
						
		} return newChatRoom;
		
	}
	
	
	
	//delete room
	
	public String deleteChatRoom(int id) {
		if ( repo.findById(id).isPresent() ) {
			repo.deleteById(id);
			return "This chat's room has been deleted :" + id;
		}
		return "Error, this chat doesn't exist :" + id;
	}
}
