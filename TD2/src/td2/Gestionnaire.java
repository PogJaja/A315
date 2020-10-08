package td2;

import java.util.HashMap;
import java.util.Set;

public class Gestionnaire {
	
	private HashMap <String, Forum> forums; 
	
	public Gestionnaire() {
		
		forums = new HashMap <String, Forum> ();
	}
	
	public Forum creerForum (String nom) {
		
		if (forums.containsKey(nom))
			return null;
		
		Forum f = new Forum (nom);
		forums.put(nom, f);
		return f;
	}
	
	public HashMap<String, Forum> getForums () {
		
		return forums;
	}
	
	public Set <String> getNomForums() {
		
		return forums.keySet();
	}
	
	public boolean exist (String nom) {
		
		return forums.containsKey(nom);
	}
	
	public Forum getForum (String nom) {
		
		return forums.get(nom);
	}
	
	public void setForum (String nom, Forum f) {
		
		forums.put(nom, f);
	}

}
