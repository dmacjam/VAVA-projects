package client;

import javax.naming.Context;
import javax.naming.InitialContext;

import session.BookManagementFacadeBeanRemote;
import session.CounterBeanRemote;

/**
 * Jednoduchy klient, ktory zavola facadnu beanu pre ziskanie cisla verzie
 * @author Jaroslav Jakubik
 *
 */
public class SessionClient {

	public static void main(String[] args) throws Throwable {
		final Context ctx = new InitialContext();
		BookManagementFacadeBeanRemote remote = (BookManagementFacadeBeanRemote)ctx.lookup("ejb:05_EAP/05//BookManagementFacadeBean!session.BookManagementFacadeBeanRemote");
		
		System.out.println(remote.getVersion());
		
		count(ctx);
		count(ctx);
		count(ctx);
		count(ctx);
	}
	
	/**
	 * volanie stateful session beany - counter
	 * @param ctx
	 * @throws Throwable
	 */
	private static void count(Context ctx) throws Throwable {
		CounterBeanRemote remote = (CounterBeanRemote)ctx.lookup("ejb:05_EAP/05//CounterBean!session.CounterBeanRemote?stateful");
		System.out.println(remote.add());
		System.out.println(remote.add());
		System.out.println(remote.add());
	}

}
