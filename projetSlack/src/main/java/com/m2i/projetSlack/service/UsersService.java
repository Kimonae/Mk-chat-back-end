package com.m2i.projetSlack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.m2i.projetSlack.entity.Users;
import com.m2i.projetSlack.repository.UsersRepository;

@Service
public class UsersService {
	
	@Autowired
	UsersRepository repo;
	
	// Get all users
	public List<Users> getUser(){
		return repo.findAll();
	}
	
	// Create user
	public Users postUser(Users user) {
		return repo.save(user);
	}
	
	// Update user
	public Users putUser(Users user) {
		Users newUsers = repo.findById(user.getId()).orElse(null);
		
		newUsers.setLastname(user.getLastname());
		newUsers.setFirstname(user.getFirstname());
		
		repo.save(newUsers);
		
		return newUsers;
	}
	
	// Delete User
	public String deleteUser(int id) {
		if (repo.findById(id).isPresent())
		{
			repo.deleteById(id);
			return "User deleted : " +id;
		}
		
		return "User not found : " + id;
	}

}
