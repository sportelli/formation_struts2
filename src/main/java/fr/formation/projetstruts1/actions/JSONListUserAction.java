package fr.formation.projetstruts1.actions;

import java.util.List;

import fr.formation.projetstruts1.model.Utilisateur;

public class JSONListUserAction {
	
	private List<Utilisateur> users = null;
	private Integer nbUsers =0;
	
	public String execute() {
		this.nbUsers = users.size();
		return "success";
	}

	public void setUsers(List<Utilisateur> users) {
		this.users = users;
	}

	public Integer getNbUsers() {
		return nbUsers;
	}

}
