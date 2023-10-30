package com.example.classwork.task03;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BookServiceIntegrationTest {
	private BookService bookService;

	@BeforeEach
	public void setUp() {
		bookService = new BookService();
	}

	@Test
	public void testAddBookAndGetAllBooks() {

		Book book01 = new Book("Title01", "Author01");
		Book book02 = new Book("Title02", "Author02");
		Book book03 = new Book("Title03", "Author03");

		bookService.addBook(book01);
		bookService.addBook(book02);
		bookService.addBook(book03);

		List<Book> allBooks = bookService.getAllBooks();

		assertNotNull(allBooks);

		assertEquals(3, allBooks.size());

		for (Book book : allBooks) {
			System.out.println(book.toString());
		}

		assertEquals("Title01", allBooks.get(0).getTitle());
		assertEquals("Author01", allBooks.get(0).getAuthor());
		assertEquals("Title02", allBooks.get(1).getTitle());
		assertEquals("Author02", allBooks.get(1).getAuthor());
		assertEquals("Title03", allBooks.get(2).getTitle());
		assertEquals("Author03", allBooks.get(2).getAuthor());

	}

}
