package fr.formation.projetstruts1.actions;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import fr.formation.projetstruts1.exceptions.UserUnknownException;
import fr.formation.projetstruts1.model.Utilisateur;
import fr.formation.projetstruts1.services.UserServices;

public class ListUsersAction implements SessionAware {
	private List<Utilisateur> utilisateurs;
	private UserServices userServices;
	private Map<String, Object> session;
	
	public String execute() throws UserUnknownException {
		Date date = new Date(java.lang.System.currentTimeMillis());
		System.out.println(date);
		Long timestamp = java.lang.System.currentTimeMillis();
		
		if (this.session.get("client") == null)
			throw new UserUnknownException("utilisateur inconnu");

		this.utilisateurs = this.userServices.findAllUsers();
		for (Utilisateur utilisateur : this.utilisateurs) {
			//System.out.println(utilisateur);
		}
		
		Date date2 = new Date(java.lang.System.currentTimeMillis());
		System.out.println(date2);

		Long timestampEnd = java.lang.System.currentTimeMillis();
		Long time =  timestampEnd - timestamp;
		System.out.println("Time= " + time + "ms");
		return "success";
	}

	public ListUsersAction() {
		super();
		this.userServices = new UserServices();
	}

	public List<Utilisateur> getUtilisateurs() {
		return utilisateurs;
	}

	public void setUtilisateurs(List<Utilisateur> utilisateurs) {
		this.utilisateurs = utilisateurs;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	
	
}
