package fr.formation.projetstruts1.test;

public class Entreprise {

	public void licencierEmployees() {
		Employe e = new Employe();
		e.setNom("SPORTELLI");
		
		Employe e2 = new Employe();
		e.setNom("DUPONT");
		
		Employe.Nb = 1;
		
		System.out.println(e2.Nb); // 1
		
	}
	
}
