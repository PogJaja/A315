package td2;

import java.util.HashMap;

public class Forum extends MemberManager {
	
	private String nom;
	private HashMap <String, Canal> channels = new HashMap<String, Canal>();
	
	public Forum (String nom) {
		
		this.nom = nom;
		Canal c0 = new Canal ("defaut");
		channels.put("defaut", c0);
	}
	

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void addChannel (Canal c) {
		
		channels.put(c.getNom(), c);
	}
	
	public HashMap<String, Canal> getChannels () {
		
		return channels;
	}
}