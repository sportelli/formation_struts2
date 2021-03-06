package fr.formation.projetstruts1.model;

import java.io.Serializable;

public class Utilisateur implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String prenom;
	private String nom;
	private String password;
	private String sexe;
	
	public Utilisateur() {
		super();
	}

	public Utilisateur(Integer id, String prenom, String nom) {
		super();
		this.id = id;
		this.prenom = prenom;
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Utilisateur [id=" + id + ", prenom=" + prenom + ", nom=" + nom + "]";
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	
	
	
}
