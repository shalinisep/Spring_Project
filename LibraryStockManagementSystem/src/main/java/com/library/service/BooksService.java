package com.library.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.library.model.Books;

@Service
public interface BooksService {

	public void addBooks(Books books);
	public List<Books> getAllBooks();
	public Books getBooksById(int bookId);
	public void updateBooks(Books books);
	public void deleteBooks(int bookId);
	public Books validateBooks(Books books);
}
