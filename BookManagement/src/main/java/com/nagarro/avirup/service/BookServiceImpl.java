package com.nagarro.avirup.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.avirup.model.Book;
import com.nagarro.avirup.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	private BookRepository bookRepository;
	
	@Override
	public List<Book> getAllBooks() {
		return bookRepository.findAll();
	}

	@Override
	public void saveBook(Book book) {
		this.bookRepository.save(book);
	}

	@Override
	public Book getBookbyId(long id) {
		
		Optional<Book> optional = bookRepository.findById(id);
		Book book = null;
		
		if(optional.isPresent())
			book = optional.get();
		else
			throw new RuntimeException("Book not found for id :" + id);
		
		return book;
	}

	@Override
	public void deleteBookById(long id) {
		
		this.bookRepository.deleteById(id);
		
	}

	

}
