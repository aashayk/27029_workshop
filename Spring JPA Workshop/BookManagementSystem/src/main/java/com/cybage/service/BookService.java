package com.cybage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybage.dao.BookRepository;
import com.cybage.model.Book;

@Service
public class BookService {
	@Autowired
	BookRepository bookRepository;

	// method to add book details
	public Book addBook(Book book) {
		return bookRepository.save(book);
	}

	// method to edit book details
	public Book editBook(int id, Book book) {
		return bookRepository.save(book);
	}

	// method to delete book details
	public void deleteBook(int id) {
		bookRepository.deleteById(id);
	}

	public Book findByBookTitle(String bookTitle) {
		return bookRepository.findByBookTitle(bookTitle);
	}

	public List<Book> findByBookPublisher(String bookPublisher) {
		return bookRepository.findByBookPublisher(bookPublisher);
	}

	// method to display all books
	public List<Book> getAllBooks() {
		return bookRepository.findAll();
	}
}
