package td2;

import java.util.ArrayList;
import java.util.List;

public class Canal {
	
	private String nom;
	private List <Message> messages = new ArrayList<Message>();
	private int taille;
	
	
	public Canal (String pnom) {
		
		nom = pnom;
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public int getTaille() {
		return taille;
	}

	public void setTaille(int taille) {
		this.taille = taille;
	}

	public void addMessage (Message m) {
		
		messages.add(m);
	}
	
	public List<Message> getAllMessages() {
		
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
