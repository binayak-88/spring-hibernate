/**
 * 
 */
package org.learntek.springorm.hibernate.service;

import java.util.List;

import org.learntek.springorm.hibernate.entity.Book;

/**
 * @author HP
 *
 */
public interface BookService {
	public void addBook(Book book);
	public void updateBook(Book book);
	public void deleteBook(Book book);
	public Book getBook(Long id);
	public List<Book> getBooks();
}
