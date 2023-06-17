/**
 * 
 */
package org.learntek.springorm.hibernate;

import java.util.List;

import org.learntek.springorm.hibernate.config.AppConfig;
import org.learntek.springorm.hibernate.entity.Book;
import org.learntek.springorm.hibernate.service.BookService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author HP
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		BookService bookService = applicationContext.getBean(BookService.class);

		Book book = new Book();
		// book.setBookId(3L);
		book.setBookName("ABC1");
		book.setAuthor("XYZ1");
		bookService.addBook(book);
		System.out.println("Book is added................");

		long id = 1L;
		Book book3 = bookService.getBook(id);
		if (book3 == null) {
			System.out.println("This book with id :" + id + " is not available in DB");
		} else {
			book3.setBookName("XYZZZ");
			bookService.updateBook(book3);
		}

		// update

		Book book2 = new Book();
		book2.setBookId(1L);
		book2.setBookName("XYZZZ");

		bookService.updateBook(book2);

		List<Book> books = bookService.getBooks();
		books.forEach(book4 -> {
			System.out.println("Book Name is : " + book4.getBookName());
			System.out.println("Book Name is : " + book4.getAuthor());
			System.out.println("=========================================");
		});
		
		Book book5 = new Book();
		book5.setBookId(1L);
		
		bookService.deleteBook(book5);
		System.out.println("Book is deleted.....");

		applicationContext.close();
	}
}
