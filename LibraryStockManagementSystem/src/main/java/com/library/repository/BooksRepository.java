package com.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.library.model.Books;

@Repository
public interface BooksRepository extends JpaRepository<Books, Integer>{
	
	@Query("select b from Books b where b.bookTitle=(:bookTitle) and b.bookAuthor=(:bookAuthor)")
	Books findByLoginData(String bookTitle, String bookAuthor);

}
