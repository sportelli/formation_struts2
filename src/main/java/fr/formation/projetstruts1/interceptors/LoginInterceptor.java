package fr.formation.projetstruts1.interceptors;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

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

		// invocation.getClass(), invocation.getAction(), ...
		
		if ( (session == null) || (session.get("client") == null))
			return "login";
		
		else {
			String result = invocation.invoke(); // APPEL DE L'ACTION
			return result;		
		}
	}

	
	
}
