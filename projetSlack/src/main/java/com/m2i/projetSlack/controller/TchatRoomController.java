package com.m2i.projetSlack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.m2i.projetSlack.entity.TchatRoom;
import com.m2i.projetSlack.service.TchatRoomService;


@RestController
@CrossOrigin(origins ="http:/:localhost:4200")
@RequestMapping("/api/tchatroom")

public class TchatRoomController {
	
	
	@Autowired
	TchatRoomService service;
	
	@GetMapping()
	public List<TchatRoom> getTchatRoom(){
		return service.getTchatRoom();
	}
	
	@PostMapping()
	public TchatRoom postTchatRoom(@RequestBody TchatRoom rooms){
		return service.postTchatRoom(rooms);
	}
	
	@PutMapping()
	public TchatRoom putTchatRoom(@RequestBody TchatRoom rooms){
		return service.putTchatRoom(rooms);
	}
	
	@DeleteMapping("/{id}")
	public String deleteTchatRoom(@PathVariable int id){
		return service.deleteTchatRoom(id);
	}

}
