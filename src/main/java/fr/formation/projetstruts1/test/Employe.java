package fr.formation.projetstruts1.test;

public class Employe {

	private String nom;
	public static Integer Nb = 0;
	
	public void licencier() {
		System.out.println("je suis licencié");
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
}
