package fr.formation.projetstruts1.actions;

import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import fr.formation.projetstruts1.model.Utilisateur;
import fr.formation.projetstruts1.services.UserServices;

public class LoginAction extends ActionSupport implements SessionAware {
	private String login;
	private String password;
	private UserServices userServices;
	private Map<String, Object> session;

	public String execute() {
		if (this.session == null)
			this.session = new HashMap<String, Object>();
		
		if (( (this.login != null) && (this.password != null))){
			Boolean isExist = userServices.checkUsernameExist(this.login, this.password);
			if (isExist) {
				this.session.put("client", userServices.getUserByLogin(this.login));
				return "success";
			}
			else {
				//addFieldError("login", "Login inconnu");
				addActionError("Login inconnu");
				return "error";			
			}
		}
		else {
			return "error";
		}
	}

	// Règles de validation de mon formulaire : 
	// - Champs login > 3 caractères et contient un @
	// - Champs password > 3 caractères
	public void validate() {
//		System.out.println("login=" + this.login);
//		System.out.println("password=" + this.password);
		if ((this.login != null) && (this.login.length() < 3))
			addFieldError("login", "Le login est obligatoire");
		else if ( (this.login != null) && (!this.login.contains("@")) )
			addFieldError("login", "Le login doit contenir un @");
		
		if ((this.password != null) && (this.password.length() < 3)) 
			addFieldError("password", "Le mot de passe est obligatoire");
	}	
	public LoginAction() {
		super();
		this.userServices = new UserServices();
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
