package td2;

import java.util.HashMap;

public class Message {
	
	private String contents;
	private Member auteur;
	private int taille;
	private HashMap <String, Member> lecteurs = new HashMap<String, Member>();

	
	public Message (String contents) {
		
		this.contents = contents;
	}
	
	
	public Message (String contents, Member m) {
		
		this.contents = contents;
		auteur = m;
	}


	public String getContents() {
		return contents;
	}


	public void setContents(String contents) {
		this.contents = contents;
	}
	
	
	public void addLecteur (Member m) {
		
		lecteurs.put(m.getName(), m);
	}
	
	public HashMap<String, Member> getLecteurs () {
		
		return lecteurs;
	}


	public Member getAuteur() {
		return auteur;
	}


	public void setAuteur(Member auteur) {
		this.auteur = auteur;
	}


	public int getTaille() {
		return taille;
	}


	public void setTaille(int taille) {
		this.taille = taille;
	}


	@Override
	public String toString() {
		return "Message [contents=" + contents + ", auteur=" + auteur + "]";
	}
	
	
	
	
}