package fr.formation.projetstruts1.actions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import fr.formation.projetstruts1.model.Sexe;
import fr.formation.projetstruts1.model.Utilisateur;
import fr.formation.projetstruts1.services.UserServices;

public class FormRegisterAction 
	extends ActionSupport 
	implements SessionAware{
	
	private String maVariable = "";
	private Integer taille = 0;
	private Utilisateur user;
	private UserServices userServices;
	private Boolean isExist;
	private List<String> sexes;
	private List<Sexe> sexesList;
	private Map<String, Object> session;
	
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
		
		//TODO: A récupérer via une couche de services
		this.sexesList = new ArrayList<>();
		this.sexesList.add(new Sexe(-1, "Inconnu"));
		this.sexesList.add(new Sexe(1, "Homme"));
		this.sexesList.add(new Sexe(2, "Femme"));
		
	}
	
	public void validate() {
		if (this.user != null) {
			if ((this.user.getNom() != null) && (this.user.getNom().length() == 0))
				addFieldError("user.nom", "Nom obligatoire");
			if ((this.user.getPrenom() != null) && (this.user.getPrenom().length() == 0))
				addFieldError("user.prenom", "Prenom obligatoire");		
			
		}
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

	public List<Sexe> getSexesList() {
		return sexesList;
	}

	public void setSexesList(List<Sexe> sexesList) {
		this.sexesList = sexesList;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
