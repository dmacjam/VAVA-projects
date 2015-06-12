package entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 * Entita autor
 * @author Jaroslav Jakubik
 *
 */
@Entity
public class Author {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String firstname;
	
	private String surname;
	
	private Date birthday;
	
	@ManyToMany(mappedBy="authors")
	private List<Book> books;
	
	
	public String getFirstname() {
		return firstname;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public Date getBirthday() {
		return birthday;
	}
	
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public List<Book> getBooks() {
		if(books == null) {
			books = new ArrayList<Book>();
		}
		return books;
	}
	
	public void setBooks(List<Book> books) {
		this.books = books;
	}
}
