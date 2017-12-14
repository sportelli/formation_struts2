package fr.formation.projetstruts1.interceptors;

import java.util.Map;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

import fr.formation.projetstruts1.exceptions.UserUnknownException;

public class LoginInterceptor implements Interceptor{

	private static final long serialVersionUID = 1L;

	@Override
	public void destroy() {
		System.out.println("Destruction de l'interceptor");		
	}

	@Override
	public void init() {
		System.out.println("Initialisation de l'interceptor");
	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		
		// Récupération de la session HTTP
		Map<String, Object> session = invocation.getInvocationContext().getSession();
		
		if ( (session == null) || (session.get("client") == null))
			return "login";
		
		else {
			String result = invocation.invoke(); // APPEL DE L'ACTION
			return result;		
		}
	}

	
	
}
