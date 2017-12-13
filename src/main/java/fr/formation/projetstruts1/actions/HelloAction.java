package fr.formation.projetstruts1.actions;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import fr.formation.projetstruts1.exceptions.UserUnknownException;

public class HelloAction implements SessionAware {

	private Map<String, Object> session;
	
	public String execute() throws UserUnknownException {
		
		if (this.session.get("client") == null)
			throw new UserUnknownException("utilisateur inconnu");
		
		return "goodbye";
//		return "success";
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	
}
