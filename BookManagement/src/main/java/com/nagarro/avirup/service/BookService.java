package com.nagarro.avirup.service;

import java.util.List;

import com.nagarro.avirup.model.Book;

public interface BookService {

	List<Book> getAllBooks();
	void saveBook(Book book);
	Book getBookbyId(long id);
	void deleteBookById(long id);
}
