package com.cybage.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cybage.model.Book;
@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
	//finder methods
	
		//method to find book by title
		public Book findByBookTitle(String bookTitle);
		
		//method to find book by publisher
		public List<Book> findByBookPublisher(String bookPublisher);
}
