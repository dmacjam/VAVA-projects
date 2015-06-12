package test;

import java.util.Date;
import java.util.Random;
import java.util.logging.Logger;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import util.HibernateUtil;
import entity.Author;
import entity.Book;
import entity.Place;

/**
 * Jednoduchy test pre vyskusanie zakladou prace s ORM na urovni JSE
 * @author Jaroslav Jakubik
 *
 */
public class ORMTest {

	private static final Logger LOG = Logger.getLogger(ORMTest.class.getName());
	
	public static void main(String[] args) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();

		//vytvorenie instancii entit bez vztahov
		Author a = createAuthor();
		Book b = createBook();
		Place p = createPlace();
		
		//doplnenie vztahov
		b.setPlace(p);
		b.getAuthors().add(a);
		
		//ulozenie do DB
		s.persist(a);
		s.persist(p);
		s.persist(b);
		
		t.commit();
		
		//nacitanie entity na zaklade IDcka
		Author author1 = (Author)s.load(Author.class, 1l);
		LOG.info(author1.getSurname());
		
		s.close();
	}

	/**
	 * vytvori entitu autor s nahodne vygenerovanymi udajmi
	 * @return
	 */
	private static Author createAuthor() {
		Author a = new Author();
		
		Random r = new Random();
		a.setFirstname(String.valueOf(r.nextInt()));
		a.setSurname(String.valueOf(r.nextInt()));
		a.setBirthday(new Date());
		
		return a;
	}
	
	/**
	 * vytvori entitu kniha s nahodne vygenerovanymi udajmi
	 * @return
	 */
	private static Book createBook() {
		Book b = new Book();
		
		Random r = new Random();
		b.setIsbn(String.valueOf(r.nextInt()));
		b.setName(String.valueOf(r.nextInt()));
		b.setPageNum(r.nextInt(300));
		
		return b;
	}
	
	/**
	 * vytvori entitu umiestnenie s nahodne vygenerovanymi udajmi
	 * @return
	 */
	private static Place createPlace() {
		Place p = new Place();
		
		Random r = new Random();
		p.setBuilding(String.valueOf(r.nextInt(5)));
		p.setRoom(String.valueOf(r.nextInt(50)));
		p.setPlace(String.valueOf(r.nextInt(100)));
		
		return p;
	}
}
