package fr.formation.projetstruts1.actions;

public class JSONAction {
	
	private String login = "";
	private String input = "";
	
	public String execute() {
		System.out.println("input=" + this.input);
		// Je récupère un { "input" : "felix" } => affiche { "login": "FELIX" }
		this.login = this.input.toUpperCase();
		return "success";
	}

	public String getLogin() {
		return login;
	}

	public void setInput(String input) {
		this.input = input;
	}

}
