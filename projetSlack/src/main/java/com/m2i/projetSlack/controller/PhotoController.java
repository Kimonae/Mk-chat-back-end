package com.m2i.projetSlack.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.m2i.projetSlack.entity.Photo;
import com.m2i.projetSlack.service.PhotoService;

@RestController
@RequestMapping("/api/photo")

public class PhotoController {
	
	@Autowired
	PhotoService service;
	
	@GetMapping("/recupphotos")
	
	public List<Photo>getPhoto(){
		return service.getPhotos()
	}
	
	@PostMapping("/createphoto")
	
	public Photo postPhoto(@RequestBody photo p) {
		return service.postPhoto(p);
	}
	
	@PutMapping("/majphoto")
	
	public Photo putPhoto(@RequestBody Photo p) {
		return service.putPhoto(p);
	}
	
	@DeleteMapping("/suppphoto/{id}")
	
	public String deletephoto(@PathVariable int id) {
		return service.deletePhoto(id);
	}
	
}
