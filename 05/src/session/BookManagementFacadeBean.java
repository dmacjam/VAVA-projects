package session;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import entity.Author;

/**
 * Facadna session beana, ktora implementuje remote rozhrania
 * @author Jaroslav Jakubik
 */
@Stateless
public class BookManagementFacadeBean implements BookManagementFacadeBeanRemote {

	/**
	 * referencia na executive beanu, instaciu executive zabezpecuje EJB kontajner cez mechanizmus depedency injection
	 */
	@EJB
	private BookManagementExecutiveBean executive;
	
	/**
	 * vrati verziu aplikacie
	 * verzia je zlozena zo statickej casti 0v1. a potom nasleduje dynamicky vygenerovane cislo buildu
	 */
	public String getVersion() {
		Author a = executive.getAuthorById(1l);
		System.out.println("Author:" + a.getFirstname() + " " + a.getSurname());
		
		return "0v1." + executive.getExtendedVersion();
	}

}
