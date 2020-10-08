package td2;

import java.util.ArrayList;
import java.util.List;

public class Channel {
	
	private String nom;
	private List <Message> messages = new ArrayList<Message>();
	private int tailleMax;
	
	
	public Channel (String nom) {
		
		this.nom = nom;
	}
	
	public Channel (String nom, int tailleMax) {
		
		this.nom = nom;
		this.tailleMax = tailleMax;
		
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public int gettailleMax() {
		return tailleMax;
	}

	public void settailleMax(int tailleMax) {
		this.tailleMax = tailleMax;
	}

	public boolean addMessage (Message m) {
		
		if (m.getContents().length() > tailleMax && tailleMax != 0)
			return false;
		
		messages.add(m);
		return true;
	}
	
	public List<Message> getMessages() {
		
		return this.messages;
	}
	
	public List<Message> getNewMessages(Member m) {
		
		List <Message> newmessages = new ArrayList<Message>();
		
		for (int i = 0; i < messages.size(); i++) {
			
			if (!messages.get(i).getLecteurs().containsValue(m)) {
				
				newmessages.add(messages.get(i));
				messages.get(i).addLecteur(m);
				
			}
			
		}
		
		return newmessages;
	}

}
