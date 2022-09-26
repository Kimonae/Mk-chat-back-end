package com.m2i.projetSlack.controller;

import com.m2i.projetSlack.entity.Photo;

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
