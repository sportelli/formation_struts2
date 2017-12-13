package fr.formation.projetstruts1.services;

import java.util.List;

import fr.formation.projetstruts1.dao.UserDAO;
import fr.formation.projetstruts1.model.Utilisateur;

public class UserServices {
	private UserDAO userDAO;
	
	public Boolean checkUserExists(Utilisateur user){
		Utilisateur u = this.userDAO.getUserById(user.getId());
		
		// est-ce que u est null ?
//		if (u == null)
//			return false;
//		else
//			return true;
		
		Boolean isExist = (u==null) ? false : true;
		return isExist;
	}
	
	public List<Utilisateur> findAllUsers(){
		return this.userDAO.findAll();
	}
	
	public Boolean checkUsernameExist(String login, String password) {
		Utilisateur user = this.userDAO.getUserByLogin(login);
		if ( (user != null) && (password.equals(user.getPassword())) )
			return true;
		else 
			return false;
	}
	
	public UserServices() {		
		this.userDAO = new UserDAO();
	}
	
}
