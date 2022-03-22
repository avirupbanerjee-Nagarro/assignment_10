package com.nagarro.avirup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nagarro.avirup.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{

	
}
