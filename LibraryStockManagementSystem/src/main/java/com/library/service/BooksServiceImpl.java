package com.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.model.Books;
import com.library.repository.BooksRepository;

@Service
public class BooksServiceImpl implements BooksService {

	@Autowired
	BooksRepository booksRepository;
	
	@Override
	public void addBooks(Books books) {
		// TODO Auto-generated method stub
		booksRepository.save(books);
	}

	@Override
	public List<Books> getAllBooks() {
		
		List<Books> booksList =  booksRepository.findAll();
		return booksList;
	}

	@Override
	public Books getBooksById(int bookId) {
		// TODO Auto-generated method stub
		Books books = booksRepository.getById(bookId);
		return books;
	}

	@Override
	public void updateBooks(Books books) {
		// TODO Auto-generated method stub
		booksRepository.save(books);

	}

	@Override
	public void deleteBooks(int bookId) {
		// TODO Auto-generated method stub
		booksRepository.deleteById(bookId);
	}

	@Override
	public Books validateBooks(Books books) {
		// TODO Auto-generated method stub
		Books books1 = booksRepository.findByLoginData(books.getBookTitle(),books.getBookAuthor());
		return books1;
	}

}
