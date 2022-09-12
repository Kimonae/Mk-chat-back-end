package com.m2i.projetSlack.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Message {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String text;
	private Date dateMessage;
	private int idUser;
	private int idRoom;
	
	

	
	public Message() {
		super();
	}
	public Message(String text, Date dateMessage, int idUser, int idRoom) {
		super();
		this.text = text;
		this.dateMessage = dateMessage;
		this.idUser = idUser;
		this.idRoom = idRoom;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Date getDateMessage() {
		return dateMessage;
	}
	public void setDateMessage(Date dateMessage) {
		this.dateMessage = dateMessage;
	}
	public int getIdUser() {
		return idUser;
	}
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	public int getIdRoom() {
		return idRoom;
	}
	public void setIdRoom(int idRoom) {
		this.idRoom = idRoom;
	}
	
	
	
	
}
