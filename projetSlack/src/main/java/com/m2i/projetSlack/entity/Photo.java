package com.m2i.projetSlack.entity;


@Entity
@Table(name= "photos")
public class Photo {
	
	@Id
	@Generatedvalue(strategy= GeneratedType.IDENTITY)
	private int id;
	private String nom;
	private String extension;
	
	public Photo() {
		super();
		
	}

	public Photo(int id, String nom, String extension) {
		super();
		this.id = id;
		this.nom = nom;
		this.extension = extension;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}
	
	
}
