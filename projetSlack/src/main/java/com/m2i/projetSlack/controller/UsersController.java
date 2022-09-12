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

import com.m2i.projetSlack.entity.Users;
import com.m2i.projetSlack.service.UsersService;

@RestController
@RequestMapping("/api/users")
public class UsersController {
	
	@Autowired
	UsersService service;
	
	@GetMapping()
	List<Users> getUsers(){
		return service.getUser();
	}
	
	@PostMapping()
	public Users createUser(@RequestBody Users user) {
		return service.postUser(user);
	}
	
	@PutMapping()
	public Users updateUser(@RequestBody Users user) {
		return service.putUser(user);
	}
	
	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable int id) {
		if(service.getUser() != null) {
			service.deleteUser(id);
		}
	}
}
