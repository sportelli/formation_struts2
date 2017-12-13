package fr.formation.projetstruts1.dao;

import java.util.ArrayList;
import java.util.List;

import fr.formation.projetstruts1.model.Utilisateur;

public class UserDAO {
	
	// OPERATIONS CRUD
	public Utilisateur getUserById(Integer id) {
		if (id > 0) {
			return new Utilisateur(id, "SPORTELLI" + id, "Felix" + id);
		}
		else {
			return null;
		}
	}
	
	public List<Utilisateur> findAll() {
		Utilisateur user1 = new Utilisateur(1, "SPORTELLI" , "Felix");
		Utilisateur user2 = new Utilisateur(2, "SPORTELLI" , "Aurelie");
		Utilisateur user3 = new Utilisateur(3, "SPORTELLI" , "Leo");
		Utilisateur user4 = new Utilisateur(4, "SPORTELLI" , "Lea");
		
		List<Utilisateur> users = new ArrayList<Utilisateur>();
		
		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);
		
		return users;
	}

	public Utilisateur getUserByLogin(String login) {
		Utilisateur user = new Utilisateur();
		user.setId(1);
		user.setPrenom("Felix");
		user.setNom(login);
		user.setPassword("pass");
		return user;
	}
	
}
