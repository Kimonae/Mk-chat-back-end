package com.m2i.projetSlack.service;

import java.util.list;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.service;

import com.m2i.projetSlack.entity.Photo;
import com.m2i.projetSlack.repository.PhotoRepository;

@Service
public class PhotoService {
	
	@Autowired
	PhotoRepository repo;
	
	// Read
	public List<Photo>getPhotos(){
		return repo.findAll();
	}
	
	// Create
	public Photo postPhoto(Photo p) {
		return repo.save(p);
	}
	
	// Update
	public Photo putPhoto(Photo p) {
		Photo newPhoto = repo.findById(p.getId()).orElse(null);
		if(newPhoto != null) {
			newPhoto.setNom(p.getNom());
			newPhoto.setId(p.getId());
			newPhoto.setExtension(p.getExtension());
			
			repo.save(newPhoto);
		}
		
		return newPhoto;
	}
	
	// Delete
	
	public String deletePhoto(int id) {
		if(repo.findById(id).isPresent()) {
			repo.deleteById(id);
			
			return "Photo deleted: " + id;
		}
		
		return "Photo not found: " + id;
	}
}
