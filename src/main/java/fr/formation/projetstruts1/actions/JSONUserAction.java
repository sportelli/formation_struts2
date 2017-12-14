package fr.formation.projetstruts1.actions;

import fr.formation.projetstruts1.model.Utilisateur;

public class JSONUserAction {
	
	private String login = "";
	private Utilisateur user = null;
	
	public String execute() {
		System.out.println(this.user);
		if (user != null)
			this.login = this.user.getNom();
		else
			this.login = "null";
		return "success";
	}

	public String getLogin() {
		return login;
	}

	public void setUser(Utilisateur user) {
		this.user = user;
	}
}
