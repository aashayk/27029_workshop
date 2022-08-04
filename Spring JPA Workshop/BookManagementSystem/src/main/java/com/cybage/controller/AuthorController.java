package com.cybage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cybage.model.Author;
import com.cybage.service.AuthorService;

@RestController
@RequestMapping("/author")
public class AuthorController {
	@Autowired
	AuthorService authorService;
	
	@PostMapping("/addAuthor")
	public ResponseEntity<String> addAuthor(@RequestBody Author author)
	{
		authorService.addAuthor(author);
		return new ResponseEntity<>("Author details added successfuly!", HttpStatus.CREATED);
	}
	
	@GetMapping("/findByAuthorName/{authorName}")
	public ResponseEntity<List<Author>> findByAuthorName(@PathVariable String authorName)
	{
		return new ResponseEntity<>(authorService.findByAuthorName(authorName), HttpStatus.OK);
	}
}
