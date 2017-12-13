package fr.formation.projetstruts1.actions;

import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

public class TestSessionAction implements SessionAware{

	Map<String, Object> session;
	Integer nbVisites = 0;
	
	public String execute() {
		if (this.session == null)
			this.session = new HashMap<String, Object>();
		
		// Compteur : nbVisites
		if (this.session.get("nbVisites") != null) {
			nbVisites = (Integer) this.session.get("nbVisites");
		}
		nbVisites++;
		this.session.put("nbVisites", nbVisites);
				
		return "success";
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public Integer getNbVisites() {
		return nbVisites;
	}

	public void setNbVisites(Integer nbVisites) {
		this.nbVisites = nbVisites;
	}
	
	
	
}
