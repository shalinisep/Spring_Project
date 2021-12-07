package com.library.service;

import org.springframework.stereotype.Service;

import com.library.model.Librarians;

@Service
public interface LibService {
	public void addLib(Librarians librarians);
	public Librarians validateLib(Librarians librarians); 
}
