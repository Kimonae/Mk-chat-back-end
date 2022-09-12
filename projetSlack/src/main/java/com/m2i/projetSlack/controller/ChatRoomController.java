package com.m2i.projetSlack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.m2i.projetSlack.entity.ChatRoom;
import com.m2i.projetSlack.service.ChatRoomService;


@RestController
@RequestMapping("/chatroom")

public class ChatRoomController {
	
	
	@Autowired
	ChatRoomService service;
	
	@GetMapping()
	public List<ChatRoom> getChatRoom(){
		return service.getChatRoom();
	}
	
	@PostMapping()
	public ChatRoom postChatRoom(@RequestBody ChatRoom rooms){
		return service.postChatRoom(rooms);
	}
	
	@PutMapping()
	public ChatRoom putChatRoom(@RequestBody ChatRoom rooms){
		return service.putChatRoom(rooms);
	}
	
	@DeleteMapping("/{id}")
	public String deleteChatRoom(@PathVariable int id){
		return service.deleteChatRoom(id);
	}

}
