package com.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.library.model.Books;
import com.library.model.Librarians;

@Repository
public interface LibRepository extends JpaRepository<Librarians, Integer> {
	@Query("select l from Librarians l where l.libName=(:libName) and l.password=(:password)")
	Librarians findByLoginData(String libName, String password);
}
