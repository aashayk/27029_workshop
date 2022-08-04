package com.cybage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybage.dao.AuthorRepository;
import com.cybage.model.Author;

@Service
public class AuthorService {
	@Autowired
	AuthorRepository authorRepository;
	
	//method to add author details
	public Author addAuthor(Author author)
	{
		return authorRepository.save(author);
	}
	
	
	public List<Author> findByAuthorName(String authorName)
	{
		return authorRepository.findByAuthorName(authorName);
	}
}
