package com.m2i.projetSlack.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class Users {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String lastname;
	private String firstname;
	private String pseudo;
	
	
	public Users() {
		super();
	}


	public Users(String lastname, String firstname, String pseudo) {
		super();
		this.lastname = lastname;
		this.firstname = firstname;
		this.pseudo = pseudo;
	}


	public Users(int id, String lastname, String firstname, String pseudo) {
		super();
		this.id = id;
		this.lastname = lastname;
		this.firstname = firstname;
		this.pseudo = pseudo;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getPseudo() {
		return pseudo;
	}


	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	
	

}
