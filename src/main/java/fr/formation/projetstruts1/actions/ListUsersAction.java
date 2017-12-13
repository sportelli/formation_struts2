package fr.formation.projetstruts1.actions;

import java.util.List;

import fr.formation.projetstruts1.model.Utilisateur;
import fr.formation.projetstruts1.services.UserServices;

public class ListUsersAction {
	private List<Utilisateur> utilisateurs;
	private UserServices userServices;
	
	public String execute() {
		this.utilisateurs = this.userServices.findAllUsers();
		for (Utilisateur utilisateur : this.utilisateurs) {
			System.out.println(utilisateur);
		}
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

	
	
}
