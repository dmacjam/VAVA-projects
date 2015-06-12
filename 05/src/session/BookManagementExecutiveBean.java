package session;

import java.util.Random;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entity.Author;

/**
 * Exekutivna session beana (bez akehokolvek rozhrania)
 * @author Jaroslav Jakubik
 */
@Stateless
@LocalBean
@Interceptors({Interceptor1.class, Interceptor2.class})
public class BookManagementExecutiveBean {
	
	@PersistenceContext
	private EntityManager em;
	
	/**
	 * vrati nahodne vygenerovane cislo verzie (buildu)
	 * @return
	 */
    public String getExtendedVersion() {
    	Random r = new Random();
    	return String.valueOf(r.nextInt(5000));
    }
    
    /**
     * vrati autora na zaklade id-cka
     * @param id
     * @return
     */
    public Author getAuthorById(long id) {
    	Author a = em.find(Author.class, id);
    	return a;
    }
    

    /**
     * implementacia postconstruct listenera priamo na bean-e
     */
    @PostConstruct
    public void initializeDb() {
    	System.out.println("Bean postconstruct callback");
    }

}
