package fr.formation.projetstruts1.actions;

import fr.formation.projetstruts1.services.UserServices;

public class LoginAction {
	private String login;
	private String password;
	private UserServices userServices;

	public String execute() {
		if (( (login != null) && (this.password != null))){
			Boolean isExist = userServices.checkUsernameExist(this.login, this.password);
			if (isExist) {
				return "success";
			}
			else {
				return "error";			
			}
		}
		else {
			return "error";
		}
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

}
