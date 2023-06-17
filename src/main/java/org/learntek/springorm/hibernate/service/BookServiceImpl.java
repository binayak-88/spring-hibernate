/**
 * 
 */
package org.learntek.springorm.hibernate.service;

import java.util.List;

import javax.transaction.Transactional;

import org.learntek.springorm.hibernate.dao.BookDAO;
import org.learntek.springorm.hibernate.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author HP
 *
 */
@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	private BookDAO bookDAO;
	
	@Transactional
	public void addBook(Book book) {
		// TODO Auto-generated method stub
		bookDAO.addBook(book);
	}

	public List<Book> getBooks() {
		// TODO Auto-generated method stub
		return bookDAO.getBooks();
	}

	public void updateBook(Book book) {
		// TODO Auto-generated method stub
		bookDAO.updateBook(book);
	}

	public Book getBook(Long id) {
		// TODO Auto-generated method stub
		return bookDAO.getBookByid(id);
	}

	@Override
	public void deleteBook(Book book) {
		// TODO Auto-generated method stub
		bookDAO.deleteBook(book);
	}

}
