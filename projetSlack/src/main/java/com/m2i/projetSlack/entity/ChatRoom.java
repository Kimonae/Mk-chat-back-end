package com.m2i.projetSlack.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ChatRoom")

public class ChatRoom {
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private Date CreationDate;
	public ChatRoom(int id, String name, Date creationDate) {
		super();
		this.id = id;
		this.name = name;
		CreationDate = creationDate;
	}
	public ChatRoom(String name, Date creationDate) {
		super();
		this.name = name;
		CreationDate = creationDate;
	}
	public ChatRoom() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getCreationDate() {
		return CreationDate;
	}
	public void setCreationDate(Date creationDate) {
		CreationDate = creationDate;
	}
	
	
	

}
