package test8;

import java.util.logging.Logger;

/**
 * Vyskasanie roznych urovni logovania + ako spravne nakonfigurovat system
 * @author Jaroslav Jakubik
 */
public class LogTest {

	private static final Logger LOG = Logger.getLogger(Logger.class.getName());
	
	public static void main(String[] args) {
		LOG.info("test1");
		LOG.warning("test1");
		LOG.severe("test1");
	}

}
