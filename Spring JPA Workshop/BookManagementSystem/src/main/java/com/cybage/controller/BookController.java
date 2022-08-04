package com.cybage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cybage.model.Book;
import com.cybage.service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {
	@Autowired
	BookService bookService;
	
	@PostMapping("/addBook")
	public ResponseEntity<String> addBook(@RequestBody Book book)
	{
		bookService.addBook(book);
		return new ResponseEntity<>("Book details added successfuly!", HttpStatus.CREATED);
	}
	
	@PutMapping("/editBook/{id}")
	public ResponseEntity<String> editBook(@PathVariable int id, @RequestBody Book book)
	{
		bookService.editBook(id, book);
		return new ResponseEntity<>("Book details edited successfuly!", HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteBook/{id}")
	public ResponseEntity<String> deleteBook(@PathVariable int id)
	{
		bookService.deleteBook(id);
		return new ResponseEntity<>("Book details deleted successfuly!", HttpStatus.OK);
	}
	
	@GetMapping("/findByBookTitle/{bookTitle}")
	public ResponseEntity<Book> findByBookTitle(@PathVariable String bookTitle)
	{
		return new ResponseEntity<>(bookService.findByBookTitle(bookTitle), HttpStatus.OK);
	}
	
	@GetMapping("/findByBookPublisher/{bookPublisher}")
	public ResponseEntity<List<Book>> findByBookPublisher(@PathVariable String bookPublisher)
	{
		return new ResponseEntity<>(bookService.findByBookPublisher(bookPublisher), HttpStatus.OK);
	}
	
	@GetMapping("/getAllBooks")
	public ResponseEntity<List<Book>> getAllBooks()
	{
		return new ResponseEntity<>(bookService.getAllBooks(), HttpStatus.OK);
	}
}
