package session;

import javax.ejb.Stateful;

/**
 * Stateful session beana - pocitadlo
 */
@Stateful
public class CounterBean implements CounterBeanRemote {

	private int i = 0;
	
	public int add() {
		return i++;
	}
	
	public int remove() {
		return i--;
	}

}
