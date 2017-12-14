package fr.formation.projetstruts1.interceptors;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class TestInterceptor implements Interceptor{

	@Override
	public void destroy() {
		
	}

	@Override
	public void init() {
		
	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		// Appel la méthode de notre action que le 
		// controlleur devait appeler (avant d'être intercepté)
		System.out.println("DEBUT INTERCEPTEUR APPELE");
		String result = invocation.invoke(); // APPEL DE L'ACTION
		System.out.println("FIN INTERCEPTEUR APPELE, RESULT=" + result);
		return result;
	}

	
	
}
