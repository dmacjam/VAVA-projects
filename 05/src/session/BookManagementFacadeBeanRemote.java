package session;

import javax.ejb.Remote;

/**
 * Remote rozhranie pre facadnu beanu
 * @author Jaroslav Jakubik
 */
@Remote
public interface BookManagementFacadeBeanRemote {

	public String getVersion();
	
}
