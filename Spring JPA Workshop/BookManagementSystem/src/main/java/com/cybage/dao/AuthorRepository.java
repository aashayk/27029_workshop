package com.cybage.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cybage.model.Author;
@Repository
public interface AuthorRepository extends JpaRepository<Author, String> {
	//finder methods
	
		//method to find list of books written by a given author's email id
		public List<Author> findByAuthorEmailId(String authorEmailId);
		
		//method to find list of books written by a given author's name
		public List<Author> findByAuthorName(String authorName);
}
