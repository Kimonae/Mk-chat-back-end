package com.m2i.projetSlack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.m2i.projetSlack.entity.TchatRoom;
import com.m2i.projetSlack.repository.TchatRoomRepository;



@Service

public class TchatRoomService {

	
	@Autowired
	TchatRoomRepository repo;
	

	
	//get room
	public List<TchatRoom> getTchatRoom(){
		return repo.findAll();
	}
	
	
	//post room
	
	public TchatRoom postTchatRoom (TchatRoom rooms) {
		return repo.save(rooms);		
	}
	
	
	// put room
	
	public TchatRoom putTchatRoom(TchatRoom rooms) {
		TchatRoom newTchatRoom = repo.findById(rooms.getId()).orElse(null);
		if (newTchatRoom != null) {
			newTchatRoom.setCreationDate( rooms.getCreationDate());
			newTchatRoom.setName( rooms.getName());			
			repo.save(newTchatRoom);
						
		} return newTchatRoom;
		
	}
	
	
	
	//delete room
	
	public String deleteTchatRoom(int id) {
		if ( repo.findById(id).isPresent() ) {
			repo.deleteById(id);
			return "This chat's room has been deleted :" + id;
		}
		return "Error, this chat doesn't exist :" + id;
	}
}
