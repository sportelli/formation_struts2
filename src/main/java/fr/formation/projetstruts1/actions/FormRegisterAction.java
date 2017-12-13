package fr.formation.projetstruts1.actions;

import java.util.ArrayList;
import java.util.List;

import fr.formation.projetstruts1.model.Utilisateur;
import fr.formation.projetstruts1.services.UserServices;

public class FormRegisterAction {
	
	private String maVariable = "";
	private Integer taille = 0;
	private Utilisateur user;
	private UserServices userServices;
	private Boolean isExist;
	private List<String> sexes;
	
	public String execute() {
		if (user != null) {
			System.out.println(user);
			isExist = userServices.checkUserExists(user);
			System.out.println("isExist=" + isExist);			
		}
		
//		user = new Utilisateur();
//		user.setId(1);
//		user.setPrenom("felix");
//		user.setNom("SPORTELLI");
		
		
		taille = maVariable.length();
		if (maVariable.length() == 0)
			return "input";
		else {			
			return "success";
		}
	}
	
	public FormRegisterAction() {
		super();
		this.userServices = new UserServices();
		this.sexes = new ArrayList<String>();
		this.sexes.add("M");
		this.sexes.add("F");
		this.sexes.add("Inconnu");
	}

	public String getMaVariable() {
		return maVariable;
	}

	public void setMaVariable(String maVariable) {
		this.maVariable = maVariable;
	}

	public Integer getTaille() {
		return taille;
	}

	public void setTaille(Integer taille) {
		this.taille = taille;
	}

	public Utilisateur getUser() {
		return user;
	}

	public void setUser(Utilisateur user) {
		this.user = user;
	}

	public Boolean getIsExist() {
		return isExist;
	}

	public void setIsExist(Boolean isExist) {
		this.isExist = isExist;
	}

	public List<String> getSexes() {
		return sexes;
	}

	public void setSexes(List<String> sexes) {
		this.sexes = sexes;
	}
}
