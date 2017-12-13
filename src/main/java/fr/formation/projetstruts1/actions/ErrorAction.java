package fr.formation.projetstruts1.actions;

import fr.formation.projetstruts1.model.Utilisateur;

public class ErrorAction {

	public String execute() {
		Utilisateur u = null;
		u.setId(3);
		return "success";
	}
	
}
