package fr.formation.projetstruts1.interceptors;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class CalculateTimeInterceptor implements Interceptor{

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
		Long timestamp = java.lang.System.currentTimeMillis();
		String result = invocation.invoke(); // APPEL DE L'ACTION
		Long timestampEnd = java.lang.System.currentTimeMillis();
		Long time =  timestampEnd - timestamp;
		System.out.println("Time= " + time + "ms");
		return result;
	}

	
	
}
