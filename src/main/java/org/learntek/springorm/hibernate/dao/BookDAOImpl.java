/**
 * 
 */
package org.learntek.springorm.hibernate.dao;



import java.util.List;

import org.learntek.springorm.hibernate.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author HP
 *
 */
@Repository
public class BookDAOImpl implements BookDAO {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public void addBook(Book book) {
		hibernateTemplate.save(book);
	}

	public List<Book> getBooks() {
		// TODO Auto-generated method stub
		return hibernateTemplate.loadAll(Book.class);
	}

	public void updateBook(Book book) {
		hibernateTemplate.update(book);
	}

	public Book getBookByid(Long id) {
		// TODO Auto-generated method stub
		return hibernateTemplate.get(Book.class, 1L);
	}

	@Override
	public void deleteBook(Book book) {
		// TODO Auto-generated method stub
		hibernateTemplate.delete(book);
	}
}
