package td2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Forum extends MemberManager {

	private String nom;
	private HashMap <String, Channel> channels = new HashMap<String, Channel>();

	public Forum (String nom) {

		this.nom = nom;
		channels.put("defaut", new Channel ("defaut"));
	}


	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public boolean addChannel (String nom) {

		if (channels.containsKey(nom))
			return false;

		channels.put(nom, new Channel (nom));
		return true;
	}

	public boolean addChannelOfBriefs (String nom, int taille) {

		if (channels.containsKey(nom))
			return false;

		channels.put(nom, new Channel (nom, taille));
		return true;
	}

	public Collection<Channel> getChannels () {

		return channels.values();	
	}

	public Channel getChannel (String nom) {

		if (!channels.containsKey(nom))
			return null;

		return channels.get(nom);
	}

	public Set <String> getChannelNames () {

		return channels.keySet();
	}


}