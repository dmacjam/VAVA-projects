package session;

import javax.annotation.PostConstruct;
import javax.interceptor.InvocationContext;

/**
 * Interceptor, ktory riesi postConstruct callback - ukazka
 * @author Jaroslav Jakubik
 *
 */
public class Interceptor2 {

	@PostConstruct
	public void initializeDb(InvocationContext ic) {
		System.out.println("Interceptor2");
		
		try {
			ic.proceed();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
