package org.learntek.springorm.hibernate.dao;

import java.util.List;

import org.learntek.springorm.hibernate.entity.Book;

public interface BookDAO {
	public void addBook(Book book);
	public void updateBook(Book book);
	public void deleteBook(Book book);
	public Book getBookByid(Long id);
	public List<Book> getBooks();
}
