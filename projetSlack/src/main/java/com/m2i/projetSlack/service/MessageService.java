package com.m2i.projetSlack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.m2i.projetSlack.entity.Message;
import com.m2i.projetSlack.repository.MessageRepository;


@Service
public class MessageService {
	
	@Autowired
	MessageRepository repoMessage;
	
	//afficher tous les  messages
	
		public List<Message>  getAllMessage() {
			
			return repoMessage.findAll();
		}
		
		
		//ajouter une message
		
		public Message postMessage(Message message){
			
			return repoMessage.save(message);
		}
		
		
		//modification un message
       
	     public Message putMessage(Message message) {
	    	 
	    	 Message newMessage = repoMessage.findById(message.getId()).orElse(null);
	    	 
	    	 newMessage.setText(message.getText());
	    	 newMessage.setDateMessage(message.getDateMessage());
	    	 newMessage.setIdRoom(message.getIdRoom());
	    	 newMessage.setIdUser(message.getIdUser());
	    	 
	    	 repoMessage.save(newMessage);
	    	 return newMessage;
	    	 
	     }
	     
	     
	     //supprimer une message 
	     
	     public String deletMessage(int id) {
	    	 
	    	 if (repoMessage.findById(id).isPresent()) {
	    		 repoMessage.deleteById(id);
	    		 return "Deleted Message"+id;
	    	 }
	      return "Message not found"+id;
}
	     
	    

}
