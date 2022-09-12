package com.m2i.projetSlack.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tchatroom")

public class TchatRoom {
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private Date CreationDate;
	public TchatRoom(int id, String name, Date creationDate) {
		super();
		this.id = id;
		this.name = name;
		CreationDate = creationDate;
	}
	public TchatRoom(String name, Date creationDate) {
		super();
		this.name = name;
		CreationDate = creationDate;
	}
	public TchatRoom() {
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
