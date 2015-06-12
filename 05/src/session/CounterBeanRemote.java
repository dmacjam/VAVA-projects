package session;

import javax.ejb.Remote;

/**
 * Remote rozhranie pre stateful session beanu - pocitadlo
 * @author Jaroslav Jakubik
 *
 */
@Remote
public interface CounterBeanRemote {

	public int add();
	public int remove();
	
}
