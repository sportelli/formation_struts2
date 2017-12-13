package fr.formation.projetstruts1.actions;

public class TestVarAction {
	
	private String maVariable = "";
	private Integer monEntier = 0;

	public String execute() {
		if (true) return "goodbye"; // Test pour global-results
		System.out.println("TestVarAction OK");
		System.out.println("maVariable=" + maVariable);
		System.out.println("monEntier=" + monEntier);
		if (maVariable.length() > 0)
			return "success";
		else
			return "error";
	}

	public String getMaVariable() {
		return maVariable;
	}

	public void setMaVariable(String maVariable) {
		this.maVariable = maVariable;
	}

	public Integer getMonEntier() {
		return monEntier;
	}

	public void setMonEntier(Integer monEntier) {
		this.monEntier = monEntier;
	}

	
	
}
